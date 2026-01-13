package org.osmdroid.tileprovider.modules;

import android.graphics.drawable.Drawable;
import java.util.concurrent.atomic.AtomicReference;
import org.osmdroid.config.Configuration;
import org.osmdroid.tileprovider.IRegisterReceiver;
import org.osmdroid.tileprovider.modules.MapTileModuleProviderBase;
import org.osmdroid.tileprovider.tilesource.BitmapTileSourceBase;
import org.osmdroid.tileprovider.tilesource.ITileSource;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.tileprovider.util.Counters;
import org.osmdroid.util.MapTileIndex;
import org.osmdroid.util.TileSystem;
/* loaded from: classes3.dex */
public class MapTileFilesystemProvider extends MapTileFileStorageProviderBase {
    private final AtomicReference<ITileSource> mTileSource;
    private final TileWriter mWriter;

    /* loaded from: classes3.dex */
    public class TileLoader extends MapTileModuleProviderBase.TileLoader {
        public TileLoader() {
            super();
        }

        @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase.TileLoader
        public Drawable loadTile(long j) throws CantContinueException {
            ITileSource iTileSource = (ITileSource) MapTileFilesystemProvider.this.mTileSource.get();
            if (iTileSource == null) {
                return null;
            }
            try {
                Drawable loadTile = MapTileFilesystemProvider.this.mWriter.loadTile(iTileSource, j);
                if (loadTile == null) {
                    Counters.fileCacheMiss++;
                } else {
                    Counters.fileCacheHit++;
                }
                return loadTile;
            } catch (BitmapTileSourceBase.LowMemoryException e) {
                MapTileIndex.toString(j);
                e.toString();
                Counters.fileCacheOOM++;
                throw new CantContinueException(e);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public MapTileFilesystemProvider(IRegisterReceiver iRegisterReceiver) {
        this(iRegisterReceiver, TileSourceFactory.DEFAULT_TILE_SOURCE);
    }

    public MapTileFilesystemProvider(IRegisterReceiver iRegisterReceiver, ITileSource iTileSource) {
        this(iRegisterReceiver, iTileSource, Configuration.getInstance().getExpirationExtendedDuration() + 604800000);
    }

    public MapTileFilesystemProvider(IRegisterReceiver iRegisterReceiver, ITileSource iTileSource, long j) {
        this(iRegisterReceiver, iTileSource, j, Configuration.getInstance().getTileFileSystemThreads(), Configuration.getInstance().getTileFileSystemMaxQueueSize());
    }

    public MapTileFilesystemProvider(IRegisterReceiver iRegisterReceiver, ITileSource iTileSource, long j, int i, int i2) {
        super(iRegisterReceiver, i, i2);
        TileWriter tileWriter = new TileWriter();
        this.mWriter = tileWriter;
        this.mTileSource = new AtomicReference<>();
        setTileSource(iTileSource);
        tileWriter.setMaximumCachedFileAge(j);
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public int getMaximumZoomLevel() {
        ITileSource iTileSource = this.mTileSource.get();
        return iTileSource != null ? iTileSource.getMaximumZoomLevel() : TileSystem.getMaximumZoomLevel();
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public int getMinimumZoomLevel() {
        ITileSource iTileSource = this.mTileSource.get();
        if (iTileSource != null) {
            return iTileSource.getMinimumZoomLevel();
        }
        return 0;
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public String getName() {
        return "File System Cache Provider";
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public String getThreadGroupName() {
        return "filesystem";
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
    public void setTileSource(ITileSource iTileSource) {
        this.mTileSource.set(iTileSource);
    }
}
