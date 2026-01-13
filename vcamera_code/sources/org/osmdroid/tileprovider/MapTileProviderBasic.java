package org.osmdroid.tileprovider;

import android.content.Context;
import org.osmdroid.tileprovider.modules.IFilesystemCache;
import org.osmdroid.tileprovider.modules.INetworkAvailablityCheck;
import org.osmdroid.tileprovider.modules.MapTileApproximater;
import org.osmdroid.tileprovider.modules.MapTileAssetsProvider;
import org.osmdroid.tileprovider.modules.MapTileDownloader;
import org.osmdroid.tileprovider.modules.MapTileFileArchiveProvider;
import org.osmdroid.tileprovider.modules.MapTileFileStorageProviderBase;
import org.osmdroid.tileprovider.modules.MapTileFilesystemProvider;
import org.osmdroid.tileprovider.modules.MapTileModuleProviderBase;
import org.osmdroid.tileprovider.modules.MapTileSqlCacheProvider;
import org.osmdroid.tileprovider.modules.NetworkAvailabliltyCheck;
import org.osmdroid.tileprovider.modules.SqlTileWriter;
import org.osmdroid.tileprovider.modules.TileWriter;
import org.osmdroid.tileprovider.tilesource.ITileSource;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.tileprovider.util.SimpleRegisterReceiver;
import org.osmdroid.util.MapTileAreaBorderComputer;
import org.osmdroid.util.MapTileAreaZoomComputer;
import org.osmdroid.util.MapTileIndex;
/* loaded from: classes3.dex */
public class MapTileProviderBasic extends MapTileProviderArray implements IMapTileProviderCallback {
    private final MapTileApproximater mApproximationProvider;
    private final MapTileDownloader mDownloaderProvider;
    private final INetworkAvailablityCheck mNetworkAvailabilityCheck;
    public IFilesystemCache tileWriter;

    public MapTileProviderBasic(Context context) {
        this(context, TileSourceFactory.DEFAULT_TILE_SOURCE);
    }

    public MapTileProviderBasic(Context context, ITileSource iTileSource) {
        this(context, iTileSource, null);
    }

    public MapTileProviderBasic(Context context, ITileSource iTileSource, IFilesystemCache iFilesystemCache) {
        this(new SimpleRegisterReceiver(context), new NetworkAvailabliltyCheck(context), iTileSource, context, iFilesystemCache);
    }

    public MapTileProviderBasic(IRegisterReceiver iRegisterReceiver, INetworkAvailablityCheck iNetworkAvailablityCheck, ITileSource iTileSource, Context context, IFilesystemCache iFilesystemCache) {
        super(iTileSource, iRegisterReceiver);
        this.mNetworkAvailabilityCheck = iNetworkAvailablityCheck;
        this.tileWriter = iFilesystemCache == null ? new SqlTileWriter() : iFilesystemCache;
        MapTileAssetsProvider mapTileAssetsProvider = new MapTileAssetsProvider(iRegisterReceiver, context.getAssets(), iTileSource);
        this.mTileProviderList.add(mapTileAssetsProvider);
        MapTileFileStorageProviderBase mapTileFileStorageProviderBase = getMapTileFileStorageProviderBase(iRegisterReceiver, iTileSource, this.tileWriter);
        this.mTileProviderList.add(mapTileFileStorageProviderBase);
        MapTileFileArchiveProvider mapTileFileArchiveProvider = new MapTileFileArchiveProvider(iRegisterReceiver, iTileSource);
        this.mTileProviderList.add(mapTileFileArchiveProvider);
        MapTileApproximater mapTileApproximater = new MapTileApproximater();
        this.mApproximationProvider = mapTileApproximater;
        this.mTileProviderList.add(mapTileApproximater);
        mapTileApproximater.addProvider(mapTileAssetsProvider);
        mapTileApproximater.addProvider(mapTileFileStorageProviderBase);
        mapTileApproximater.addProvider(mapTileFileArchiveProvider);
        MapTileDownloader mapTileDownloader = new MapTileDownloader(iTileSource, this.tileWriter, iNetworkAvailablityCheck);
        this.mDownloaderProvider = mapTileDownloader;
        this.mTileProviderList.add(mapTileDownloader);
        getTileCache().getProtectedTileComputers().add(new MapTileAreaZoomComputer(-1));
        getTileCache().getProtectedTileComputers().add(new MapTileAreaBorderComputer(1));
        getTileCache().setAutoEnsureCapacity(false);
        getTileCache().setStressedMemory(false);
        getTileCache().getPreCache().addProvider(mapTileAssetsProvider);
        getTileCache().getPreCache().addProvider(mapTileFileStorageProviderBase);
        getTileCache().getPreCache().addProvider(mapTileFileArchiveProvider);
        getTileCache().getPreCache().addProvider(mapTileDownloader);
        getTileCache().getProtectedTileContainers().add(this);
        setOfflineFirst(true);
    }

    public static MapTileFileStorageProviderBase getMapTileFileStorageProviderBase(IRegisterReceiver iRegisterReceiver, ITileSource iTileSource, IFilesystemCache iFilesystemCache) {
        return iFilesystemCache instanceof TileWriter ? new MapTileFilesystemProvider(iRegisterReceiver, iTileSource) : new MapTileSqlCacheProvider(iRegisterReceiver, iTileSource);
    }

    @Override // org.osmdroid.tileprovider.MapTileProviderArray, org.osmdroid.tileprovider.MapTileProviderBase
    public void detach() {
        IFilesystemCache iFilesystemCache = this.tileWriter;
        if (iFilesystemCache != null) {
            iFilesystemCache.onDetach();
        }
        this.tileWriter = null;
        super.detach();
    }

    @Override // org.osmdroid.tileprovider.MapTileProviderArray, org.osmdroid.tileprovider.MapTileProviderBase
    public IFilesystemCache getTileWriter() {
        return this.tileWriter;
    }

    @Override // org.osmdroid.tileprovider.MapTileProviderArray
    public boolean isDowngradedMode(long j) {
        int zoom;
        INetworkAvailablityCheck iNetworkAvailablityCheck = this.mNetworkAvailabilityCheck;
        if ((iNetworkAvailablityCheck == null || iNetworkAvailablityCheck.getNetworkAvailable()) && useDataConnection()) {
            int i = -1;
            int i2 = -1;
            for (MapTileModuleProviderBase mapTileModuleProviderBase : this.mTileProviderList) {
                if (mapTileModuleProviderBase.getUsesDataConnection()) {
                    int minimumZoomLevel = mapTileModuleProviderBase.getMinimumZoomLevel();
                    if (i == -1 || i > minimumZoomLevel) {
                        i = minimumZoomLevel;
                    }
                    int maximumZoomLevel = mapTileModuleProviderBase.getMaximumZoomLevel();
                    if (i2 == -1 || i2 < maximumZoomLevel) {
                        i2 = maximumZoomLevel;
                    }
                }
            }
            return i == -1 || i2 == -1 || (zoom = MapTileIndex.getZoom(j)) < i || zoom > i2;
        }
        return true;
    }

    public boolean setOfflineFirst(boolean z) {
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        for (MapTileModuleProviderBase mapTileModuleProviderBase : this.mTileProviderList) {
            if (i2 == -1 && mapTileModuleProviderBase == this.mDownloaderProvider) {
                i2 = i;
            }
            if (i3 == -1 && mapTileModuleProviderBase == this.mApproximationProvider) {
                i3 = i;
            }
            i++;
        }
        if (i2 == -1 || i3 == -1) {
            return false;
        }
        if (i3 >= i2 || !z) {
            if (i3 <= i2 || z) {
                this.mTileProviderList.set(i2, this.mApproximationProvider);
                this.mTileProviderList.set(i3, this.mDownloaderProvider);
                return true;
            }
            return true;
        }
        return true;
    }
}
