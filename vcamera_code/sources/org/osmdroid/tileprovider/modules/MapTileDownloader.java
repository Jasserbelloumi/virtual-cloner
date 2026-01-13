package org.osmdroid.tileprovider.modules;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;
import org.osmdroid.config.Configuration;
import org.osmdroid.tileprovider.BitmapPool;
import org.osmdroid.tileprovider.MapTileRequestState;
import org.osmdroid.tileprovider.modules.MapTileModuleProviderBase;
import org.osmdroid.tileprovider.tilesource.ITileSource;
import org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase;
import org.osmdroid.util.TileSystem;
import org.osmdroid.util.UrlBackoff;
/* loaded from: classes3.dex */
public class MapTileDownloader extends MapTileModuleProviderBase {
    private final IFilesystemCache mFilesystemCache;
    private final INetworkAvailablityCheck mNetworkAvailablityCheck;
    private TileDownloader mTileDownloader;
    private final TileLoader mTileLoader;
    private final AtomicReference<OnlineTileSourceBase> mTileSource;
    private final UrlBackoff mUrlBackoff;

    /* loaded from: classes3.dex */
    public class TileLoader extends MapTileModuleProviderBase.TileLoader {
        public TileLoader() {
            super();
        }

        public Drawable downloadTile(long j, int i, String str) throws CantContinueException {
            OnlineTileSourceBase onlineTileSourceBase = (OnlineTileSourceBase) MapTileDownloader.this.mTileSource.get();
            if (onlineTileSourceBase == null) {
                return null;
            }
            try {
                onlineTileSourceBase.acquire();
                try {
                    return MapTileDownloader.this.mTileDownloader.downloadTile(j, i, str, MapTileDownloader.this.mFilesystemCache, onlineTileSourceBase);
                } finally {
                    onlineTileSourceBase.release();
                }
            } catch (InterruptedException unused) {
                return null;
            }
        }

        @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase.TileLoader
        public Drawable loadTile(long j) throws CantContinueException {
            OnlineTileSourceBase onlineTileSourceBase = (OnlineTileSourceBase) MapTileDownloader.this.mTileSource.get();
            if (onlineTileSourceBase == null) {
                return null;
            }
            if (MapTileDownloader.this.mNetworkAvailablityCheck != null && !MapTileDownloader.this.mNetworkAvailablityCheck.getNetworkAvailable()) {
                if (Configuration.getInstance().isDebugMode()) {
                    MapTileDownloader.this.getName();
                }
                return null;
            }
            String tileURLString = onlineTileSourceBase.getTileURLString(j);
            if (TextUtils.isEmpty(tileURLString) || MapTileDownloader.this.mUrlBackoff.shouldWait(tileURLString)) {
                return null;
            }
            Drawable downloadTile = downloadTile(j, 0, tileURLString);
            UrlBackoff urlBackoff = MapTileDownloader.this.mUrlBackoff;
            if (downloadTile == null) {
                urlBackoff.next(tileURLString);
            } else {
                urlBackoff.remove(tileURLString);
            }
            return downloadTile;
        }

        @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase.TileLoader
        public void tileLoaded(MapTileRequestState mapTileRequestState, Drawable drawable) {
            MapTileDownloader.this.removeTileFromQueues(mapTileRequestState.getMapTile());
            mapTileRequestState.getCallback().mapTileRequestCompleted(mapTileRequestState, null);
            BitmapPool.getInstance().asyncRecycle(drawable);
        }
    }

    public MapTileDownloader(ITileSource iTileSource) {
        this(iTileSource, null, null);
    }

    public MapTileDownloader(ITileSource iTileSource, IFilesystemCache iFilesystemCache) {
        this(iTileSource, iFilesystemCache, null);
    }

    public MapTileDownloader(ITileSource iTileSource, IFilesystemCache iFilesystemCache, INetworkAvailablityCheck iNetworkAvailablityCheck) {
        this(iTileSource, iFilesystemCache, iNetworkAvailablityCheck, Configuration.getInstance().getTileDownloadThreads(), Configuration.getInstance().getTileDownloadMaxQueueSize());
    }

    public MapTileDownloader(ITileSource iTileSource, IFilesystemCache iFilesystemCache, INetworkAvailablityCheck iNetworkAvailablityCheck, int i, int i2) {
        super(i, i2);
        this.mTileSource = new AtomicReference<>();
        this.mTileLoader = new TileLoader();
        this.mUrlBackoff = new UrlBackoff();
        this.mTileDownloader = new TileDownloader();
        this.mFilesystemCache = iFilesystemCache;
        this.mNetworkAvailablityCheck = iNetworkAvailablityCheck;
        setTileSource(iTileSource);
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public void detach() {
        super.detach();
        IFilesystemCache iFilesystemCache = this.mFilesystemCache;
        if (iFilesystemCache != null) {
            iFilesystemCache.onDetach();
        }
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public int getMaximumZoomLevel() {
        OnlineTileSourceBase onlineTileSourceBase = this.mTileSource.get();
        return onlineTileSourceBase != null ? onlineTileSourceBase.getMaximumZoomLevel() : TileSystem.getMaximumZoomLevel();
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public int getMinimumZoomLevel() {
        OnlineTileSourceBase onlineTileSourceBase = this.mTileSource.get();
        if (onlineTileSourceBase != null) {
            return onlineTileSourceBase.getMinimumZoomLevel();
        }
        return 0;
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public String getName() {
        return "Online Tile Download Provider";
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public String getThreadGroupName() {
        return "downloader";
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public TileLoader getTileLoader() {
        return this.mTileLoader;
    }

    public ITileSource getTileSource() {
        return this.mTileSource.get();
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public boolean getUsesDataConnection() {
        return true;
    }

    public void setTileDownloader(TileDownloader tileDownloader) {
        this.mTileDownloader = tileDownloader;
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public void setTileSource(ITileSource iTileSource) {
        if (iTileSource instanceof OnlineTileSourceBase) {
            this.mTileSource.set((OnlineTileSourceBase) iTileSource);
        } else {
            this.mTileSource.set(null);
        }
    }
}
