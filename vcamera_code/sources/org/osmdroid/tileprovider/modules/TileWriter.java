package org.osmdroid.tileprovider.modules;

import android.graphics.drawable.Drawable;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import org.osmdroid.config.Configuration;
import org.osmdroid.tileprovider.ExpirableBitmapDrawable;
import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;
import org.osmdroid.tileprovider.tilesource.ITileSource;
import org.osmdroid.tileprovider.util.Counters;
import org.osmdroid.tileprovider.util.StreamUtils;
import org.osmdroid.util.MapTileIndex;
/* loaded from: classes3.dex */
public class TileWriter implements IFilesystemCache {
    public static boolean hasInited;
    private static long mUsedCacheSpace;
    public Thread initThread;
    private long mMaximumCachedFileAge;

    public TileWriter() {
        this.initThread = null;
        if (hasInited) {
            return;
        }
        hasInited = true;
        Thread thread = new Thread() { // from class: org.osmdroid.tileprovider.modules.TileWriter.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                long unused = TileWriter.mUsedCacheSpace = 0L;
                TileWriter.this.calculateDirectorySize(Configuration.getInstance().getOsmdroidTileCache());
                if (TileWriter.mUsedCacheSpace > Configuration.getInstance().getTileFileSystemCacheMaxBytes()) {
                    TileWriter.this.cutCurrentCache();
                }
                Configuration.getInstance().isDebugMode();
            }
        };
        this.initThread = thread;
        thread.setName("TileWriter#init");
        this.initThread.setPriority(1);
        this.initThread.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void calculateDirectorySize(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    mUsedCacheSpace = file2.length() + mUsedCacheSpace;
                }
                if (file2.isDirectory() && !isSymbolicDirectoryLink(file, file2)) {
                    calculateDirectorySize(file2);
                }
            }
        }
    }

    private boolean createFolderAndCheckIfExists(File file) {
        if (file.mkdirs()) {
            return true;
        }
        if (Configuration.getInstance().isDebugMode()) {
            file.toString();
        }
        try {
            Thread.sleep(500L);
        } catch (InterruptedException unused) {
        }
        if (file.exists()) {
            if (Configuration.getInstance().isDebugMode()) {
                file.toString();
            }
            return true;
        } else if (Configuration.getInstance().isDebugMode()) {
            file.toString();
            return false;
        } else {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cutCurrentCache() {
        synchronized (Configuration.getInstance().getOsmdroidTileCache()) {
            if (mUsedCacheSpace > Configuration.getInstance().getTileFileSystemCacheTrimBytes()) {
                Configuration.getInstance().getTileFileSystemCacheTrimBytes();
                File[] fileArr = (File[]) getDirectoryFileList(Configuration.getInstance().getOsmdroidTileCache()).toArray(new File[0]);
                Arrays.sort(fileArr, new Comparator<File>() { // from class: org.osmdroid.tileprovider.modules.TileWriter.2
                    @Override // java.util.Comparator
                    public int compare(File file, File file2) {
                        return Long.valueOf(file.lastModified()).compareTo(Long.valueOf(file2.lastModified()));
                    }
                });
                for (File file : fileArr) {
                    if (mUsedCacheSpace <= Configuration.getInstance().getTileFileSystemCacheTrimBytes()) {
                        break;
                    }
                    long length = file.length();
                    if (file.delete()) {
                        if (Configuration.getInstance().isDebugTileProviders()) {
                            file.getAbsolutePath();
                        }
                        mUsedCacheSpace -= length;
                    }
                }
            }
        }
    }

    private List<File> getDirectoryFileList(File file) {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    arrayList.add(file2);
                }
                if (file2.isDirectory()) {
                    arrayList.addAll(getDirectoryFileList(file2));
                }
            }
        }
        return arrayList;
    }

    public static long getUsedCacheSpace() {
        return mUsedCacheSpace;
    }

    private boolean isSymbolicDirectoryLink(File file, File file2) {
        try {
            return !file.getCanonicalPath().equals(file2.getCanonicalFile().getParent());
        } catch (IOException | NoSuchElementException unused) {
            return true;
        }
    }

    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    public boolean exists(ITileSource iTileSource, long j) {
        return getFile(iTileSource, j).exists();
    }

    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    public Long getExpirationTimestamp(ITileSource iTileSource, long j) {
        return null;
    }

    public File getFile(ITileSource iTileSource, long j) {
        File osmdroidTileCache = Configuration.getInstance().getOsmdroidTileCache();
        return new File(osmdroidTileCache, iTileSource.getTileRelativeFilenameString(j) + OpenStreetMapTileProviderConstants.TILE_PATH_EXTENSION);
    }

    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    public Drawable loadTile(ITileSource iTileSource, long j) throws Exception {
        File file = getFile(iTileSource, j);
        if (file.exists()) {
            Drawable drawable = iTileSource.getDrawable(file.getPath());
            if ((file.lastModified() < System.currentTimeMillis() - this.mMaximumCachedFileAge) && drawable != null) {
                if (Configuration.getInstance().isDebugMode()) {
                    MapTileIndex.toString(j);
                }
                ExpirableBitmapDrawable.setState(drawable, -2);
            }
            return drawable;
        }
        return null;
    }

    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    public void onDetach() {
        Thread thread = this.initThread;
        if (thread != null) {
            try {
                thread.interrupt();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    public boolean remove(ITileSource iTileSource, long j) {
        File file = getFile(iTileSource, j);
        if (file.exists()) {
            try {
                return file.delete();
            } catch (Exception unused) {
                iTileSource.name();
                MapTileIndex.toString(j);
                return false;
            }
        }
        return false;
    }

    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    public boolean saveFile(ITileSource iTileSource, long j, InputStream inputStream, Long l) {
        BufferedOutputStream bufferedOutputStream;
        File file = getFile(iTileSource, j);
        if (Configuration.getInstance().isDebugTileProviders()) {
            file.getAbsolutePath();
        }
        File parentFile = file.getParentFile();
        if (parentFile.exists() || createFolderAndCheckIfExists(parentFile)) {
            BufferedOutputStream bufferedOutputStream2 = null;
            try {
                try {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file.getPath()), 8192);
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                long copy = mUsedCacheSpace + StreamUtils.copy(inputStream, bufferedOutputStream);
                mUsedCacheSpace = copy;
                if (copy > Configuration.getInstance().getTileFileSystemCacheMaxBytes()) {
                    cutCurrentCache();
                }
                StreamUtils.closeStream(bufferedOutputStream);
                return true;
            } catch (IOException unused2) {
                bufferedOutputStream2 = bufferedOutputStream;
                Counters.fileCacheSaveErrors++;
                if (bufferedOutputStream2 != null) {
                    StreamUtils.closeStream(bufferedOutputStream2);
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream2 = bufferedOutputStream;
                if (bufferedOutputStream2 != null) {
                    StreamUtils.closeStream(bufferedOutputStream2);
                }
                throw th;
            }
        }
        return false;
    }

    public void setMaximumCachedFileAge(long j) {
        this.mMaximumCachedFileAge = j;
    }
}
