package org.osmdroid.tileprovider.modules;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.osmdroid.config.Configuration;
import org.osmdroid.tileprovider.BitmapPool;
import org.osmdroid.tileprovider.ExpirableBitmapDrawable;
import org.osmdroid.tileprovider.modules.MapTileModuleProviderBase;
import org.osmdroid.tileprovider.tilesource.ITileSource;
import org.osmdroid.util.MapTileIndex;
import org.osmdroid.util.TileSystem;
/* loaded from: classes3.dex */
public class MapTileApproximater extends MapTileModuleProviderBase {
    private final List<MapTileModuleProviderBase> mProviders;
    private int minZoomLevel;

    /* loaded from: classes3.dex */
    public class TileLoader extends MapTileModuleProviderBase.TileLoader {
        public TileLoader() {
            super();
        }

        @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase.TileLoader
        public Drawable loadTile(long j) {
            Bitmap approximateTileFromLowerZoom = MapTileApproximater.this.approximateTileFromLowerZoom(j);
            if (approximateTileFromLowerZoom != null) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(approximateTileFromLowerZoom);
                ExpirableBitmapDrawable.setState(bitmapDrawable, -3);
                return bitmapDrawable;
            }
            return null;
        }
    }

    public MapTileApproximater() {
        this(Configuration.getInstance().getTileFileSystemThreads(), Configuration.getInstance().getTileFileSystemMaxQueueSize());
    }

    public MapTileApproximater(int i, int i2) {
        super(i, i2);
        this.mProviders = new CopyOnWriteArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap approximateTileFromLowerZoom(android.graphics.drawable.BitmapDrawable r10, long r11, int r13) {
        /*
            r0 = 0
            if (r13 > 0) goto L4
            return r0
        L4:
            android.graphics.Bitmap r1 = r10.getBitmap()
            int r1 = r1.getWidth()
            android.graphics.Bitmap r2 = getTileBitmap(r1)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r2)
            boolean r4 = r10 instanceof org.osmdroid.tileprovider.ReusableBitmapDrawable
            if (r4 == 0) goto L1d
            r5 = r10
            org.osmdroid.tileprovider.ReusableBitmapDrawable r5 = (org.osmdroid.tileprovider.ReusableBitmapDrawable) r5
            goto L1e
        L1d:
            r5 = r0
        L1e:
            if (r4 == 0) goto L23
            r5.beginUsingDrawable()
        L23:
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L30
            boolean r8 = r5.isBitmapValid()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L34
            goto L30
        L2e:
            r10 = move-exception
            goto L61
        L30:
            int r8 = r1 >> r13
            if (r8 != 0) goto L36
        L34:
            r6 = r7
            goto L58
        L36:
            int r9 = org.osmdroid.util.MapTileIndex.getX(r11)     // Catch: java.lang.Throwable -> L2e
            int r13 = r6 << r13
            int r9 = r9 % r13
            int r9 = r9 * r8
            int r11 = org.osmdroid.util.MapTileIndex.getY(r11)     // Catch: java.lang.Throwable -> L2e
            int r11 = r11 % r13
            int r11 = r11 * r8
            android.graphics.Rect r12 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L2e
            int r13 = r9 + r8
            int r8 = r8 + r11
            r12.<init>(r9, r11, r13, r8)     // Catch: java.lang.Throwable -> L2e
            android.graphics.Rect r11 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L2e
            r11.<init>(r7, r7, r1, r1)     // Catch: java.lang.Throwable -> L2e
            android.graphics.Bitmap r10 = r10.getBitmap()     // Catch: java.lang.Throwable -> L2e
            r3.drawBitmap(r10, r12, r11, r0)     // Catch: java.lang.Throwable -> L2e
        L58:
            if (r4 == 0) goto L5d
            r5.finishUsingDrawable()
        L5d:
            if (r6 != 0) goto L60
            return r0
        L60:
            return r2
        L61:
            if (r4 == 0) goto L66
            r5.finishUsingDrawable()
        L66:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.osmdroid.tileprovider.modules.MapTileApproximater.approximateTileFromLowerZoom(android.graphics.drawable.BitmapDrawable, long, int):android.graphics.Bitmap");
    }

    public static Bitmap approximateTileFromLowerZoom(MapTileModuleProviderBase mapTileModuleProviderBase, long j, int i) {
        int zoom;
        if (i > 0 && (zoom = MapTileIndex.getZoom(j) - i) >= mapTileModuleProviderBase.getMinimumZoomLevel() && zoom <= mapTileModuleProviderBase.getMaximumZoomLevel()) {
            try {
                Drawable loadTileIfReachable = mapTileModuleProviderBase.getTileLoader().loadTileIfReachable(MapTileIndex.getTileIndex(zoom, MapTileIndex.getX(j) >> i, MapTileIndex.getY(j) >> i));
                if (loadTileIfReachable instanceof BitmapDrawable) {
                    return approximateTileFromLowerZoom((BitmapDrawable) loadTileIfReachable, j, i);
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    private void computeZoomLevels() {
        this.minZoomLevel = 0;
        boolean z = true;
        for (MapTileModuleProviderBase mapTileModuleProviderBase : this.mProviders) {
            int minimumZoomLevel = mapTileModuleProviderBase.getMinimumZoomLevel();
            if (z) {
                this.minZoomLevel = minimumZoomLevel;
                z = false;
            } else {
                this.minZoomLevel = Math.min(this.minZoomLevel, minimumZoomLevel);
            }
        }
    }

    public static Bitmap getTileBitmap(int i) {
        Bitmap obtainSizedBitmapFromPool = BitmapPool.getInstance().obtainSizedBitmapFromPool(i, i);
        if (obtainSizedBitmapFromPool != null) {
            obtainSizedBitmapFromPool.setHasAlpha(true);
            obtainSizedBitmapFromPool.eraseColor(0);
            return obtainSizedBitmapFromPool;
        }
        return Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
    }

    public void addProvider(MapTileModuleProviderBase mapTileModuleProviderBase) {
        this.mProviders.add(mapTileModuleProviderBase);
        computeZoomLevels();
    }

    public Bitmap approximateTileFromLowerZoom(long j) {
        for (int i = 1; MapTileIndex.getZoom(j) - i >= 0; i++) {
            Bitmap approximateTileFromLowerZoom = approximateTileFromLowerZoom(j, i);
            if (approximateTileFromLowerZoom != null) {
                return approximateTileFromLowerZoom;
            }
        }
        return null;
    }

    public Bitmap approximateTileFromLowerZoom(long j, int i) {
        for (MapTileModuleProviderBase mapTileModuleProviderBase : this.mProviders) {
            Bitmap approximateTileFromLowerZoom = approximateTileFromLowerZoom(mapTileModuleProviderBase, j, i);
            if (approximateTileFromLowerZoom != null) {
                return approximateTileFromLowerZoom;
            }
        }
        return null;
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public void detach() {
        super.detach();
        this.mProviders.clear();
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public int getMaximumZoomLevel() {
        return TileSystem.getMaximumZoomLevel();
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public int getMinimumZoomLevel() {
        return this.minZoomLevel;
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public String getName() {
        return "Offline Tile Approximation Provider";
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public String getThreadGroupName() {
        return "approximater";
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public TileLoader getTileLoader() {
        return new TileLoader();
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public boolean getUsesDataConnection() {
        return false;
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    @Deprecated
    public void setTileSource(ITileSource iTileSource) {
    }
}
