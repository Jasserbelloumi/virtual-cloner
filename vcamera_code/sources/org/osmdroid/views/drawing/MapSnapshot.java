package org.osmdroid.views.drawing;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Looper;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.osmdroid.tileprovider.MapTileProviderBase;
import org.osmdroid.tileprovider.TileStates;
import org.osmdroid.util.RectL;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;
import org.osmdroid.views.overlay.Overlay;
import org.osmdroid.views.overlay.TilesOverlay;
/* loaded from: classes3.dex */
public class MapSnapshot implements Runnable {
    public static final int INCLUDE_FLAGS_ALL = 15;
    public static final int INCLUDE_FLAG_EXPIRED = 2;
    public static final int INCLUDE_FLAG_NOTFOUND = 8;
    public static final int INCLUDE_FLAG_SCALED = 4;
    public static final int INCLUDE_FLAG_UPTODATE = 1;
    private boolean mAlreadyFinished;
    private Bitmap mBitmap;
    private boolean mCurrentlyRunning;
    private MapSnapshotHandler mHandler;
    private final int mIncludeFlags;
    private boolean mIsDetached;
    private MapSnapshotable mMapSnapshotable;
    private boolean mOneMoreTime;
    private List<Overlay> mOverlays;
    private Projection mProjection;
    private Status mStatus;
    private MapTileProviderBase mTileProvider;
    private TilesOverlay mTilesOverlay;
    private final RectL mViewPort;

    /* loaded from: classes3.dex */
    public interface MapSnapshotable {
        void callback(MapSnapshot mapSnapshot);
    }

    /* loaded from: classes3.dex */
    public enum Status {
        NOTHING,
        STARTED,
        TILES_OK,
        PAINTING,
        CANVAS_OK
    }

    public MapSnapshot(MapSnapshotable mapSnapshotable, int i, MapTileProviderBase mapTileProviderBase, List<Overlay> list, Projection projection) {
        RectL rectL = new RectL();
        this.mViewPort = rectL;
        this.mStatus = Status.NOTHING;
        this.mMapSnapshotable = mapSnapshotable;
        this.mIncludeFlags = i;
        this.mTileProvider = mapTileProviderBase;
        this.mOverlays = list;
        this.mProjection = projection;
        projection.getMercatorViewPort(rectL);
        TilesOverlay tilesOverlay = new TilesOverlay(this.mTileProvider, null);
        this.mTilesOverlay = tilesOverlay;
        tilesOverlay.setHorizontalWrapEnabled(this.mProjection.isHorizontalWrapEnabled());
        this.mTilesOverlay.setVerticalWrapEnabled(this.mProjection.isVerticalWrapEnabled());
        this.mHandler = new MapSnapshotHandler(this);
        this.mTileProvider.getTileRequestCompleteHandlers().add(this.mHandler);
    }

    public MapSnapshot(MapSnapshotable mapSnapshotable, int i, MapView mapView) {
        this(mapSnapshotable, i, mapView.getTileProvider(), mapView.getOverlays(), mapView.getProjection());
    }

    private void draw() {
        this.mBitmap = Bitmap.createBitmap(this.mProjection.getWidth(), this.mProjection.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.mBitmap);
        this.mProjection.save(canvas, true, false);
        TilesOverlay tilesOverlay = this.mTilesOverlay;
        Projection projection = this.mProjection;
        tilesOverlay.drawTiles(canvas, projection, projection.getZoomLevel(), this.mViewPort);
        List<Overlay> list = this.mOverlays;
        if (list != null) {
            for (Overlay overlay : list) {
                if (overlay != null && overlay.isEnabled()) {
                    overlay.draw(canvas, this.mProjection);
                }
            }
        }
        this.mProjection.restore(canvas, false);
    }

    public static boolean isUIThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    private void refresh() {
        Status status;
        if (refreshCheckStart()) {
            TileStates tileStates = this.mTilesOverlay.getTileStates();
            do {
                TilesOverlay tilesOverlay = this.mTilesOverlay;
                Projection projection = this.mProjection;
                tilesOverlay.drawTiles(null, projection, projection.getZoomLevel(), this.mViewPort);
                int i = this.mIncludeFlags;
                boolean z = true;
                if (i != 0 && i != 15) {
                    if ((i & 1) == 0 && tileStates.getUpToDate() != 0) {
                        z = false;
                    }
                    if (z && (this.mIncludeFlags & 2) == 0 && tileStates.getExpired() != 0) {
                        z = false;
                    }
                    if (z && (this.mIncludeFlags & 4) == 0 && tileStates.getScaled() != 0) {
                        z = false;
                    }
                    if (z && (this.mIncludeFlags & 8) == 0 && tileStates.getNotFound() != 0) {
                        z = false;
                    }
                }
                if (z) {
                    Status status2 = this.mStatus;
                    Status status3 = Status.CANVAS_OK;
                    if (status2 == status3 || status2 == (status = Status.PAINTING) || !refreshCheckFinish()) {
                        return;
                    }
                    this.mStatus = status;
                    if (this.mIsDetached) {
                        return;
                    }
                    draw();
                    this.mStatus = status3;
                    MapSnapshotable mapSnapshotable = this.mMapSnapshotable;
                    if (mapSnapshotable != null) {
                        mapSnapshotable.callback(this);
                    }
                }
            } while (refreshCheckEnd());
        }
    }

    private synchronized boolean refreshAgain() {
        this.mOneMoreTime = true;
        return true ^ this.mCurrentlyRunning;
    }

    private synchronized boolean refreshCheckEnd() {
        if (this.mIsDetached) {
            return false;
        }
        if (this.mAlreadyFinished) {
            return false;
        }
        if (this.mOneMoreTime) {
            this.mOneMoreTime = false;
            return true;
        }
        this.mCurrentlyRunning = false;
        return false;
    }

    private synchronized boolean refreshCheckFinish() {
        boolean z;
        z = !this.mAlreadyFinished;
        this.mAlreadyFinished = true;
        return z;
    }

    private synchronized boolean refreshCheckStart() {
        if (this.mIsDetached) {
            return false;
        }
        if (this.mAlreadyFinished) {
            return false;
        }
        if (this.mOneMoreTime) {
            if (this.mCurrentlyRunning) {
                return false;
            }
            this.mOneMoreTime = false;
            this.mCurrentlyRunning = true;
            return true;
        }
        return false;
    }

    private static boolean save(Bitmap bitmap, File file) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file.getAbsolutePath());
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            try {
                fileOutputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            return true;
        } catch (Exception e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                    return false;
                } catch (IOException e4) {
                    e4.printStackTrace();
                    return false;
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            throw th;
        }
    }

    public Bitmap getBitmap() {
        return this.mBitmap;
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public void onDetach() {
        this.mIsDetached = true;
        this.mProjection = null;
        this.mTileProvider.getTileRequestCompleteHandlers().remove(this.mHandler);
        this.mTileProvider.detach();
        this.mTileProvider = null;
        this.mHandler.destroy();
        this.mHandler = null;
        this.mMapSnapshotable = null;
        this.mTilesOverlay = null;
        this.mOverlays = null;
        this.mBitmap = null;
    }

    public void refreshASAP() {
        if (refreshAgain()) {
            refresh();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        this.mStatus = Status.STARTED;
        refreshASAP();
    }

    public boolean save(File file) {
        return save(this.mBitmap, file);
    }
}
