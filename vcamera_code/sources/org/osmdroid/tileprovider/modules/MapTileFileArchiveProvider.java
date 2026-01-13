package org.osmdroid.tileprovider.modules;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import org.osmdroid.config.Configuration;
import org.osmdroid.tileprovider.IRegisterReceiver;
import org.osmdroid.tileprovider.modules.MapTileModuleProviderBase;
import org.osmdroid.tileprovider.tilesource.ITileSource;
import org.osmdroid.util.MapTileIndex;
import org.osmdroid.util.TileSystem;
/* loaded from: classes3.dex */
public class MapTileFileArchiveProvider extends MapTileFileStorageProviderBase {
    private final boolean ignoreTileSource;
    private final ArrayList<IArchiveFile> mArchiveFiles;
    private final boolean mSpecificArchivesProvided;
    private final AtomicReference<ITileSource> mTileSource;

    /* loaded from: classes3.dex */
    public class TileLoader extends MapTileModuleProviderBase.TileLoader {
        public TileLoader() {
            super();
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
            if (r2 != null) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
            org.osmdroid.tileprovider.util.StreamUtils.closeStream(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
            if (r2 == null) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
            return r1;
         */
        @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase.TileLoader
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.graphics.drawable.Drawable loadTile(long r5) {
            /*
                r4 = this;
                org.osmdroid.tileprovider.modules.MapTileFileArchiveProvider r0 = org.osmdroid.tileprovider.modules.MapTileFileArchiveProvider.this
                java.util.concurrent.atomic.AtomicReference r0 = org.osmdroid.tileprovider.modules.MapTileFileArchiveProvider.access$000(r0)
                java.lang.Object r0 = r0.get()
                org.osmdroid.tileprovider.tilesource.ITileSource r0 = (org.osmdroid.tileprovider.tilesource.ITileSource) r0
                r1 = 0
                if (r0 != 0) goto L10
                return r1
            L10:
                org.osmdroid.config.IConfigurationProvider r2 = org.osmdroid.config.Configuration.getInstance()     // Catch: java.lang.Throwable -> L3c
                boolean r2 = r2.isDebugMode()     // Catch: java.lang.Throwable -> L3c
                if (r2 == 0) goto L1d
                org.osmdroid.util.MapTileIndex.toString(r5)     // Catch: java.lang.Throwable -> L3c
            L1d:
                org.osmdroid.tileprovider.modules.MapTileFileArchiveProvider r2 = org.osmdroid.tileprovider.modules.MapTileFileArchiveProvider.this     // Catch: java.lang.Throwable -> L3c
                java.io.InputStream r2 = org.osmdroid.tileprovider.modules.MapTileFileArchiveProvider.access$100(r2, r5, r0)     // Catch: java.lang.Throwable -> L3c
                if (r2 == 0) goto L36
                org.osmdroid.config.IConfigurationProvider r3 = org.osmdroid.config.Configuration.getInstance()     // Catch: java.lang.Throwable -> L3d
                boolean r3 = r3.isDebugMode()     // Catch: java.lang.Throwable -> L3d
                if (r3 == 0) goto L32
                org.osmdroid.util.MapTileIndex.toString(r5)     // Catch: java.lang.Throwable -> L3d
            L32:
                android.graphics.drawable.Drawable r1 = r0.getDrawable(r2)     // Catch: java.lang.Throwable -> L3d
            L36:
                if (r2 == 0) goto L40
            L38:
                org.osmdroid.tileprovider.util.StreamUtils.closeStream(r2)
                goto L40
            L3c:
                r2 = r1
            L3d:
                if (r2 == 0) goto L40
                goto L38
            L40:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: org.osmdroid.tileprovider.modules.MapTileFileArchiveProvider.TileLoader.loadTile(long):android.graphics.drawable.Drawable");
        }
    }

    public MapTileFileArchiveProvider(IRegisterReceiver iRegisterReceiver, ITileSource iTileSource) {
        this(iRegisterReceiver, iTileSource, null);
    }

    public MapTileFileArchiveProvider(IRegisterReceiver iRegisterReceiver, ITileSource iTileSource, IArchiveFile[] iArchiveFileArr) {
        this(iRegisterReceiver, iTileSource, iArchiveFileArr, false);
    }

    public MapTileFileArchiveProvider(IRegisterReceiver iRegisterReceiver, ITileSource iTileSource, IArchiveFile[] iArchiveFileArr, boolean z) {
        super(iRegisterReceiver, Configuration.getInstance().getTileFileSystemThreads(), Configuration.getInstance().getTileFileSystemMaxQueueSize());
        this.mArchiveFiles = new ArrayList<>();
        this.mTileSource = new AtomicReference<>();
        this.ignoreTileSource = z;
        setTileSource(iTileSource);
        if (iArchiveFileArr == null) {
            this.mSpecificArchivesProvided = false;
            findArchiveFiles();
            return;
        }
        this.mSpecificArchivesProvided = true;
        for (int length = iArchiveFileArr.length - 1; length >= 0; length--) {
            this.mArchiveFiles.add(iArchiveFileArr[length]);
        }
    }

    private void clearArcives() {
        while (!this.mArchiveFiles.isEmpty()) {
            IArchiveFile iArchiveFile = this.mArchiveFiles.get(0);
            if (iArchiveFile != null) {
                iArchiveFile.close();
            }
            this.mArchiveFiles.remove(0);
        }
    }

    private void findArchiveFiles() {
        File[] listFiles;
        clearArcives();
        File osmdroidBasePath = Configuration.getInstance().getOsmdroidBasePath();
        if (osmdroidBasePath == null || (listFiles = osmdroidBasePath.listFiles()) == null) {
            return;
        }
        for (File file : listFiles) {
            IArchiveFile archiveFile = ArchiveFileFactory.getArchiveFile(file);
            if (archiveFile != null) {
                archiveFile.setIgnoreTileSource(this.ignoreTileSource);
                this.mArchiveFiles.add(archiveFile);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized InputStream getInputStream(long j, ITileSource iTileSource) {
        InputStream inputStream;
        Iterator<IArchiveFile> it = this.mArchiveFiles.iterator();
        while (it.hasNext()) {
            IArchiveFile next = it.next();
            if (next != null && (inputStream = next.getInputStream(iTileSource, j)) != null) {
                if (Configuration.getInstance().isDebugMode()) {
                    MapTileIndex.toString(j);
                    next.toString();
                }
                return inputStream;
            }
        }
        return null;
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileFileStorageProviderBase, org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public void detach() {
        clearArcives();
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
        return "File Archive Provider";
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public String getThreadGroupName() {
        return "filearchive";
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public TileLoader getTileLoader() {
        return new TileLoader();
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public boolean getUsesDataConnection() {
        return false;
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileFileStorageProviderBase
    public void onMediaMounted() {
        if (this.mSpecificArchivesProvided) {
            return;
        }
        findArchiveFiles();
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileFileStorageProviderBase
    public void onMediaUnmounted() {
        if (this.mSpecificArchivesProvided) {
            return;
        }
        findArchiveFiles();
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public void setTileSource(ITileSource iTileSource) {
        this.mTileSource.set(iTileSource);
    }
}
