package org.osmdroid.tileprovider.modules;

import android.graphics.drawable.Drawable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import org.osmdroid.config.Configuration;
import org.osmdroid.tileprovider.ExpirableBitmapDrawable;
import org.osmdroid.tileprovider.MapTileRequestState;
import org.osmdroid.tileprovider.tilesource.ITileSource;
import org.osmdroid.util.MapTileIndex;
/* loaded from: classes3.dex */
public abstract class MapTileModuleProviderBase {
    private final ExecutorService mExecutor;
    public final LinkedHashMap<Long, MapTileRequestState> mPending;
    public final Object mQueueLockObject = new Object();
    public final HashMap<Long, MapTileRequestState> mWorking;

    /* loaded from: classes3.dex */
    public abstract class TileLoader implements Runnable {
        public TileLoader() {
        }

        public abstract Drawable loadTile(long j) throws CantContinueException;

        @Deprecated
        public Drawable loadTile(MapTileRequestState mapTileRequestState) throws CantContinueException {
            return loadTileIfReachable(mapTileRequestState.getMapTile());
        }

        public Drawable loadTileIfReachable(long j) throws CantContinueException {
            if (MapTileModuleProviderBase.this.isTileReachable(j)) {
                return loadTile(j);
            }
            return null;
        }

        public MapTileRequestState nextTile() {
            MapTileRequestState mapTileRequestState;
            synchronized (MapTileModuleProviderBase.this.mQueueLockObject) {
                Long l = null;
                for (Long l2 : MapTileModuleProviderBase.this.mPending.keySet()) {
                    if (!MapTileModuleProviderBase.this.mWorking.containsKey(l2)) {
                        if (Configuration.getInstance().isDebugTileProviders()) {
                            MapTileModuleProviderBase.this.getName();
                            MapTileIndex.toString(l2.longValue());
                        }
                        l = l2;
                    }
                }
                if (l != null) {
                    if (Configuration.getInstance().isDebugTileProviders()) {
                        MapTileModuleProviderBase.this.getName();
                    }
                    MapTileModuleProviderBase mapTileModuleProviderBase = MapTileModuleProviderBase.this;
                    mapTileModuleProviderBase.mWorking.put(l, mapTileModuleProviderBase.mPending.get(l));
                }
                mapTileRequestState = l != null ? MapTileModuleProviderBase.this.mPending.get(l) : null;
            }
            return mapTileRequestState;
        }

        public void onTileLoaderInit() {
        }

        public void onTileLoaderShutdown() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            onTileLoaderInit();
            while (true) {
                MapTileRequestState nextTile = nextTile();
                if (nextTile == null) {
                    onTileLoaderShutdown();
                    return;
                }
                if (Configuration.getInstance().isDebugTileProviders()) {
                    MapTileIndex.toString(nextTile.getMapTile());
                    MapTileModuleProviderBase.this.mPending.size();
                    MapTileModuleProviderBase.this.mWorking.size();
                }
                Drawable drawable = null;
                try {
                    drawable = loadTileIfReachable(nextTile.getMapTile());
                } catch (CantContinueException unused) {
                    MapTileIndex.toString(nextTile.getMapTile());
                    MapTileModuleProviderBase.this.clearQueue();
                } catch (Throwable unused2) {
                    MapTileIndex.toString(nextTile.getMapTile());
                }
                if (drawable == null) {
                    tileLoadedFailed(nextTile);
                } else if (ExpirableBitmapDrawable.getState(drawable) == -2) {
                    tileLoadedExpired(nextTile, drawable);
                } else if (ExpirableBitmapDrawable.getState(drawable) == -3) {
                    tileLoadedScaled(nextTile, drawable);
                } else {
                    tileLoaded(nextTile, drawable);
                }
            }
        }

        public void tileLoaded(MapTileRequestState mapTileRequestState, Drawable drawable) {
            if (Configuration.getInstance().isDebugTileProviders()) {
                MapTileModuleProviderBase.this.getName();
                MapTileIndex.toString(mapTileRequestState.getMapTile());
            }
            MapTileModuleProviderBase.this.removeTileFromQueues(mapTileRequestState.getMapTile());
            ExpirableBitmapDrawable.setState(drawable, -1);
            mapTileRequestState.getCallback().mapTileRequestCompleted(mapTileRequestState, drawable);
        }

        public void tileLoadedExpired(MapTileRequestState mapTileRequestState, Drawable drawable) {
            if (Configuration.getInstance().isDebugTileProviders()) {
                MapTileModuleProviderBase.this.getName();
                MapTileIndex.toString(mapTileRequestState.getMapTile());
            }
            MapTileModuleProviderBase.this.removeTileFromQueues(mapTileRequestState.getMapTile());
            ExpirableBitmapDrawable.setState(drawable, -2);
            mapTileRequestState.getCallback().mapTileRequestExpiredTile(mapTileRequestState, drawable);
        }

        public void tileLoadedFailed(MapTileRequestState mapTileRequestState) {
            if (Configuration.getInstance().isDebugTileProviders()) {
                MapTileModuleProviderBase.this.getName();
                MapTileIndex.toString(mapTileRequestState.getMapTile());
            }
            MapTileModuleProviderBase.this.removeTileFromQueues(mapTileRequestState.getMapTile());
            mapTileRequestState.getCallback().mapTileRequestFailed(mapTileRequestState);
        }

        public void tileLoadedScaled(MapTileRequestState mapTileRequestState, Drawable drawable) {
            if (Configuration.getInstance().isDebugTileProviders()) {
                MapTileModuleProviderBase.this.getName();
                MapTileIndex.toString(mapTileRequestState.getMapTile());
            }
            MapTileModuleProviderBase.this.removeTileFromQueues(mapTileRequestState.getMapTile());
            ExpirableBitmapDrawable.setState(drawable, -3);
            mapTileRequestState.getCallback().mapTileRequestExpiredTile(mapTileRequestState, drawable);
        }
    }

    public MapTileModuleProviderBase(int i, final int i2) {
        this.mExecutor = Executors.newFixedThreadPool(i2 < i ? i2 : i, new ConfigurablePriorityThreadFactory(5, getThreadGroupName()));
        this.mWorking = new HashMap<>();
        this.mPending = new LinkedHashMap<Long, MapTileRequestState>(i2 + 2, 0.1f, true) { // from class: org.osmdroid.tileprovider.modules.MapTileModuleProviderBase.1
            private static final long serialVersionUID = 6455337315681858866L;

            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<Long, MapTileRequestState> entry) {
                MapTileRequestState mapTileRequestState;
                if (size() <= i2) {
                    return false;
                }
                Iterator<Long> it = MapTileModuleProviderBase.this.mPending.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    long longValue = it.next().longValue();
                    if (!MapTileModuleProviderBase.this.mWorking.containsKey(Long.valueOf(longValue)) && (mapTileRequestState = MapTileModuleProviderBase.this.mPending.get(Long.valueOf(longValue))) != null) {
                        MapTileModuleProviderBase.this.removeTileFromQueues(longValue);
                        mapTileRequestState.getCallback().mapTileRequestFailedExceedsMaxQueueSize(mapTileRequestState);
                        break;
                    }
                }
                return false;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQueue() {
        synchronized (this.mQueueLockObject) {
            this.mPending.clear();
            this.mWorking.clear();
        }
    }

    public void detach() {
        clearQueue();
        this.mExecutor.shutdown();
    }

    public abstract int getMaximumZoomLevel();

    public abstract int getMinimumZoomLevel();

    public abstract String getName();

    public abstract String getThreadGroupName();

    public abstract TileLoader getTileLoader();

    public abstract boolean getUsesDataConnection();

    public boolean isTileReachable(long j) {
        int zoom = MapTileIndex.getZoom(j);
        return zoom >= getMinimumZoomLevel() && zoom <= getMaximumZoomLevel();
    }

    public void loadMapTileAsync(MapTileRequestState mapTileRequestState) {
        if (this.mExecutor.isShutdown()) {
            return;
        }
        synchronized (this.mQueueLockObject) {
            if (Configuration.getInstance().isDebugTileProviders()) {
                getName();
                MapTileIndex.toString(mapTileRequestState.getMapTile());
                this.mPending.containsKey(Long.valueOf(mapTileRequestState.getMapTile()));
            }
            this.mPending.put(Long.valueOf(mapTileRequestState.getMapTile()), mapTileRequestState);
        }
        try {
            this.mExecutor.execute(getTileLoader());
        } catch (RejectedExecutionException unused) {
        }
    }

    public void removeTileFromQueues(long j) {
        synchronized (this.mQueueLockObject) {
            if (Configuration.getInstance().isDebugTileProviders()) {
                getName();
                MapTileIndex.toString(j);
            }
            this.mPending.remove(Long.valueOf(j));
            this.mWorking.remove(Long.valueOf(j));
        }
    }

    public abstract void setTileSource(ITileSource iTileSource);
}
