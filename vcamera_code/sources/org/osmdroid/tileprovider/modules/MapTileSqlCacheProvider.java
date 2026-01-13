package org.osmdroid.tileprovider.modules;

import android.graphics.drawable.Drawable;
import java.util.concurrent.atomic.AtomicReference;
import org.osmdroid.config.Configuration;
import org.osmdroid.tileprovider.IRegisterReceiver;
import org.osmdroid.tileprovider.modules.MapTileModuleProviderBase;
import org.osmdroid.tileprovider.tilesource.BitmapTileSourceBase;
import org.osmdroid.tileprovider.tilesource.ITileSource;
import org.osmdroid.tileprovider.util.Counters;
import org.osmdroid.util.MapTileIndex;
import org.osmdroid.util.TileSystem;
/* loaded from: classes3.dex */
public class MapTileSqlCacheProvider extends MapTileFileStorageProviderBase {
    private static final String[] columns = {DatabaseFileArchive.COLUMN_TILE, SqlTileWriter.COLUMN_EXPIRES};
    private final AtomicReference<ITileSource> mTileSource;
    private SqlTileWriter mWriter;

    /* loaded from: classes3.dex */
    public class TileLoader extends MapTileModuleProviderBase.TileLoader {
        public TileLoader() {
            super();
        }

        @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase.TileLoader
        public Drawable loadTile(long j) throws CantContinueException {
            ITileSource iTileSource = (ITileSource) MapTileSqlCacheProvider.this.mTileSource.get();
            if (iTileSource == null || MapTileSqlCacheProvider.this.mWriter == null) {
                return null;
            }
            try {
                Drawable loadTile = MapTileSqlCacheProvider.this.mWriter.loadTile(iTileSource, j);
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

    public MapTileSqlCacheProvider(IRegisterReceiver iRegisterReceiver, ITileSource iTileSource) {
        super(iRegisterReceiver, Configuration.getInstance().getTileFileSystemThreads(), Configuration.getInstance().getTileFileSystemMaxQueueSize());
        this.mTileSource = new AtomicReference<>();
        setTileSource(iTileSource);
        this.mWriter = new SqlTileWriter();
    }

    @Deprecated
    public MapTileSqlCacheProvider(IRegisterReceiver iRegisterReceiver, ITileSource iTileSource, long j) {
        this(iRegisterReceiver, iTileSource);
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileFileStorageProviderBase, org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public void detach() {
        SqlTileWriter sqlTileWriter = this.mWriter;
        if (sqlTileWriter != null) {
            sqlTileWriter.onDetach();
        }
        this.mWriter = null;
        super.detach();
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
        return "SQL Cache Archive Provider";
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public String getThreadGroupName() {
        return "sqlcache";
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public TileLoader getTileLoader() {
        return new TileLoader();
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public boolean getUsesDataConnection() {
        return false;
    }

    public boolean hasTile(long j) {
        ITileSource iTileSource = this.mTileSource.get();
        return (iTileSource == null || this.mWriter.getExpirationTimestamp(iTileSource, j) == null) ? false : true;
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileFileStorageProviderBase
    public void onMediaMounted() {
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileFileStorageProviderBase
    public void onMediaUnmounted() {
        SqlTileWriter sqlTileWriter = this.mWriter;
        if (sqlTileWriter != null) {
            sqlTileWriter.onDetach();
        }
        this.mWriter = new SqlTileWriter();
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public void setTileSource(ITileSource iTileSource) {
        this.mTileSource.set(iTileSource);
    }
}
