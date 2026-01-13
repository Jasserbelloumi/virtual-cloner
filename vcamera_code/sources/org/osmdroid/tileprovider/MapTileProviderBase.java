package org.osmdroid.tileprovider;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.osmdroid.config.Configuration;
import org.osmdroid.tileprovider.modules.IFilesystemCache;
import org.osmdroid.tileprovider.modules.MapTileApproximater;
import org.osmdroid.tileprovider.tilesource.ITileSource;
import org.osmdroid.util.MapTileIndex;
import org.osmdroid.util.PointL;
import org.osmdroid.util.RectL;
import org.osmdroid.util.TileLooper;
import org.osmdroid.util.TileSystem;
import org.osmdroid.views.Projection;
/* loaded from: classes3.dex */
public abstract class MapTileProviderBase implements IMapTileProviderCallback {
    public static final int MAPTILE_FAIL_ID = 1;
    public static final int MAPTILE_SUCCESS_ID = 0;
    private static int sApproximationBackgroundColor = -3355444;
    public final MapTileCache mTileCache;
    public Drawable mTileNotFoundImage;
    private final Collection<Handler> mTileRequestCompleteHandlers;
    private ITileSource mTileSource;
    public boolean mUseDataConnection;

    /* loaded from: classes3.dex */
    public abstract class ScaleTileLooper extends TileLooper {
        private boolean isWorth;
        public Paint mDebugPaint;
        public Rect mDestRect;
        public int mDiff;
        public final HashMap<Long, Bitmap> mNewTiles;
        public int mOldTileZoomLevel;
        public Rect mSrcRect;
        public int mTileSize;
        public int mTileSize_2;

        private ScaleTileLooper() {
            this.mNewTiles = new HashMap<>();
        }

        public abstract void computeTile(long j, int i, int i2);

        @Override // org.osmdroid.util.TileLooper
        public void finaliseLoop() {
            while (!this.mNewTiles.isEmpty()) {
                long longValue = this.mNewTiles.keySet().iterator().next().longValue();
                putScaledTileIntoCache(longValue, this.mNewTiles.remove(Long.valueOf(longValue)));
            }
        }

        @Override // org.osmdroid.util.TileLooper
        public void handleTile(long j, int i, int i2) {
            if (this.isWorth && MapTileProviderBase.this.getMapTile(j) == null) {
                try {
                    computeTile(j, i, i2);
                } catch (OutOfMemoryError unused) {
                }
            }
        }

        @Override // org.osmdroid.util.TileLooper
        public void initialiseLoop() {
            super.initialiseLoop();
            int abs = Math.abs(this.mTileZoomLevel - this.mOldTileZoomLevel);
            this.mDiff = abs;
            this.mTileSize_2 = this.mTileSize >> abs;
            this.isWorth = abs != 0;
        }

        public void loop(double d, RectL rectL, double d2, int i) {
            this.mSrcRect = new Rect();
            this.mDestRect = new Rect();
            this.mDebugPaint = new Paint();
            this.mOldTileZoomLevel = TileSystem.getInputTileZoomLevel(d2);
            this.mTileSize = i;
            loop(d, rectL);
        }

        public void putScaledTileIntoCache(long j, Bitmap bitmap) {
            MapTileProviderBase.this.putTileIntoCache(j, new ReusableBitmapDrawable(bitmap), -3);
            if (Configuration.getInstance().isDebugMode()) {
                MapTileIndex.toString(j);
                this.mDebugPaint.setTextSize(40.0f);
                new Canvas(bitmap).drawText("scaled", 50.0f, 50.0f, this.mDebugPaint);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class ZoomInTileLooper extends ScaleTileLooper {
        private ZoomInTileLooper() {
            super();
        }

        @Override // org.osmdroid.tileprovider.MapTileProviderBase.ScaleTileLooper
        public void computeTile(long j, int i, int i2) {
            Bitmap approximateTileFromLowerZoom;
            Drawable mapTile = MapTileProviderBase.this.mTileCache.getMapTile(MapTileIndex.getTileIndex(this.mOldTileZoomLevel, MapTileIndex.getX(j) >> this.mDiff, MapTileIndex.getY(j) >> this.mDiff));
            if (!(mapTile instanceof BitmapDrawable) || (approximateTileFromLowerZoom = MapTileApproximater.approximateTileFromLowerZoom((BitmapDrawable) mapTile, j, this.mDiff)) == null) {
                return;
            }
            this.mNewTiles.put(Long.valueOf(j), approximateTileFromLowerZoom);
        }
    }

    /* loaded from: classes3.dex */
    public class ZoomOutTileLooper extends ScaleTileLooper {
        private static final int MAX_ZOOM_OUT_DIFF = 4;

        private ZoomOutTileLooper() {
            super();
        }

        @Override // org.osmdroid.tileprovider.MapTileProviderBase.ScaleTileLooper
        public void computeTile(long j, int i, int i2) {
            Bitmap bitmap;
            if (this.mDiff >= 4) {
                return;
            }
            int x = MapTileIndex.getX(j) << this.mDiff;
            int y = MapTileIndex.getY(j);
            int i3 = this.mDiff;
            int i4 = y << i3;
            int i5 = 1 << i3;
            Bitmap bitmap2 = null;
            Canvas canvas = null;
            for (int i6 = 0; i6 < i5; i6++) {
                for (int i7 = 0; i7 < i5; i7++) {
                    Drawable mapTile = MapTileProviderBase.this.mTileCache.getMapTile(MapTileIndex.getTileIndex(this.mOldTileZoomLevel, x + i6, i4 + i7));
                    if ((mapTile instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) mapTile).getBitmap()) != null) {
                        if (bitmap2 == null) {
                            bitmap2 = MapTileApproximater.getTileBitmap(this.mTileSize);
                            canvas = new Canvas(bitmap2);
                            canvas.drawColor(MapTileProviderBase.sApproximationBackgroundColor);
                        }
                        Rect rect = this.mDestRect;
                        int i8 = this.mTileSize_2;
                        rect.set(i6 * i8, i7 * i8, (i6 + 1) * i8, i8 * (i7 + 1));
                        canvas.drawBitmap(bitmap, (Rect) null, this.mDestRect, (Paint) null);
                    }
                }
            }
            if (bitmap2 != null) {
                this.mNewTiles.put(Long.valueOf(j), bitmap2);
            }
        }
    }

    public MapTileProviderBase(ITileSource iTileSource) {
        this(iTileSource, null);
    }

    public MapTileProviderBase(ITileSource iTileSource, Handler handler) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.mTileRequestCompleteHandlers = linkedHashSet;
        this.mUseDataConnection = true;
        this.mTileNotFoundImage = null;
        this.mTileCache = createTileCache();
        linkedHashSet.add(handler);
        this.mTileSource = iTileSource;
    }

    private void sendMessage(int i) {
        for (int i2 = 0; i2 < 3 && !sendMessageFailFast(i); i2++) {
        }
    }

    private boolean sendMessageFailFast(int i) {
        for (Handler handler : this.mTileRequestCompleteHandlers) {
            try {
                if (handler != null) {
                    handler.sendEmptyMessage(i);
                }
            } catch (ConcurrentModificationException unused) {
                return false;
            }
        }
        return true;
    }

    public static void setApproximationBackgroundColor(int i) {
        sApproximationBackgroundColor = i;
    }

    public void clearTileCache() {
        this.mTileCache.clear();
    }

    public MapTileCache createTileCache() {
        return new MapTileCache();
    }

    public void detach() {
        clearTileCache();
        Drawable drawable = this.mTileNotFoundImage;
        if (drawable != null && (drawable instanceof ReusableBitmapDrawable)) {
            BitmapPool.getInstance().returnDrawableToPool((ReusableBitmapDrawable) this.mTileNotFoundImage);
        }
        this.mTileNotFoundImage = null;
        clearTileCache();
    }

    public void ensureCapacity(int i) {
        this.mTileCache.ensureCapacity(i);
    }

    public void expireInMemoryCache(long j) {
        Drawable mapTile = this.mTileCache.getMapTile(j);
        if (mapTile != null) {
            ExpirableBitmapDrawable.setState(mapTile, -2);
        }
    }

    public abstract Drawable getMapTile(long j);

    public abstract int getMaximumZoomLevel();

    public abstract int getMinimumZoomLevel();

    public abstract long getQueueSize();

    public MapTileCache getTileCache() {
        return this.mTileCache;
    }

    public Collection<Handler> getTileRequestCompleteHandlers() {
        return this.mTileRequestCompleteHandlers;
    }

    public ITileSource getTileSource() {
        return this.mTileSource;
    }

    public abstract IFilesystemCache getTileWriter();

    @Override // org.osmdroid.tileprovider.IMapTileProviderCallback
    public void mapTileRequestCompleted(MapTileRequestState mapTileRequestState, Drawable drawable) {
        putTileIntoCache(mapTileRequestState.getMapTile(), drawable, -1);
        sendMessage(0);
        if (Configuration.getInstance().isDebugTileProviders()) {
            MapTileIndex.toString(mapTileRequestState.getMapTile());
        }
    }

    @Override // org.osmdroid.tileprovider.IMapTileProviderCallback
    public void mapTileRequestExpiredTile(MapTileRequestState mapTileRequestState, Drawable drawable) {
        putTileIntoCache(mapTileRequestState.getMapTile(), drawable, ExpirableBitmapDrawable.getState(drawable));
        sendMessage(0);
        if (Configuration.getInstance().isDebugTileProviders()) {
            MapTileIndex.toString(mapTileRequestState.getMapTile());
        }
    }

    @Override // org.osmdroid.tileprovider.IMapTileProviderCallback
    public void mapTileRequestFailed(MapTileRequestState mapTileRequestState) {
        int i;
        if (this.mTileNotFoundImage != null) {
            putTileIntoCache(mapTileRequestState.getMapTile(), this.mTileNotFoundImage, -4);
            i = 0;
        } else {
            i = 1;
        }
        sendMessage(i);
        if (Configuration.getInstance().isDebugTileProviders()) {
            MapTileIndex.toString(mapTileRequestState.getMapTile());
        }
    }

    @Override // org.osmdroid.tileprovider.IMapTileProviderCallback
    public void mapTileRequestFailedExceedsMaxQueueSize(MapTileRequestState mapTileRequestState) {
        mapTileRequestFailed(mapTileRequestState);
    }

    @Deprecated
    public void putExpiredTileIntoCache(MapTileRequestState mapTileRequestState, Drawable drawable) {
        putTileIntoCache(mapTileRequestState.getMapTile(), drawable, -2);
    }

    public void putTileIntoCache(long j, Drawable drawable, int i) {
        if (drawable == null) {
            return;
        }
        Drawable mapTile = this.mTileCache.getMapTile(j);
        if (mapTile == null || ExpirableBitmapDrawable.getState(mapTile) <= i) {
            ExpirableBitmapDrawable.setState(drawable, i);
            this.mTileCache.putTile(j, drawable);
        }
    }

    public void rescaleCache(Projection projection, double d, double d2, Rect rect) {
        if (TileSystem.getInputTileZoomLevel(d) == TileSystem.getInputTileZoomLevel(d2)) {
            return;
        }
        System.currentTimeMillis();
        Configuration.getInstance().isDebugTileProviders();
        PointL mercatorPixels = projection.toMercatorPixels(rect.left, rect.top, null);
        PointL mercatorPixels2 = projection.toMercatorPixels(rect.right, rect.bottom, null);
        (d > d2 ? new ZoomInTileLooper() : new ZoomOutTileLooper()).loop(d, new RectL(mercatorPixels.x, mercatorPixels.y, mercatorPixels2.x, mercatorPixels2.y), d2, getTileSource().getTileSizePixels());
        System.currentTimeMillis();
        Configuration.getInstance().isDebugTileProviders();
    }

    public void setTileLoadFailureImage(Drawable drawable) {
        this.mTileNotFoundImage = drawable;
    }

    @Deprecated
    public void setTileRequestCompleteHandler(Handler handler) {
        this.mTileRequestCompleteHandlers.clear();
        this.mTileRequestCompleteHandlers.add(handler);
    }

    public void setTileSource(ITileSource iTileSource) {
        this.mTileSource = iTileSource;
        clearTileCache();
    }

    public void setUseDataConnection(boolean z) {
        this.mUseDataConnection = z;
    }

    @Override // org.osmdroid.tileprovider.IMapTileProviderCallback
    public boolean useDataConnection() {
        return this.mUseDataConnection;
    }
}
