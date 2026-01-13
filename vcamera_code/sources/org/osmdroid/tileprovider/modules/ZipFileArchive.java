package org.osmdroid.tileprovider.modules;

import android.support.v4.media.o00oOo0O;
import androidx.browser.browseractions.BrowserServiceFileProvider;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import org.osmdroid.tileprovider.tilesource.ITileSource;
import org.osmdroid.util.MapTileIndex;
/* loaded from: classes3.dex */
public class ZipFileArchive implements IArchiveFile {
    private boolean mIgnoreTileSource = false;
    public ZipFile mZipFile;

    public ZipFileArchive() {
    }

    private ZipFileArchive(ZipFile zipFile) {
        this.mZipFile = zipFile;
    }

    private String getTileRelativeFilenameString(long j, String str) {
        return str + '/' + MapTileIndex.getZoom(j) + '/' + MapTileIndex.getX(j) + '/' + MapTileIndex.getY(j) + BrowserServiceFileProvider.f1595o00ooo0;
    }

    public static ZipFileArchive getZipFileArchive(File file) throws ZipException, IOException {
        return new ZipFileArchive(new ZipFile(file));
    }

    @Override // org.osmdroid.tileprovider.modules.IArchiveFile
    public void close() {
        try {
            this.mZipFile.close();
        } catch (IOException unused) {
        }
    }

    @Override // org.osmdroid.tileprovider.modules.IArchiveFile
    public InputStream getInputStream(ITileSource iTileSource, long j) {
        try {
            if (!this.mIgnoreTileSource) {
                ZipEntry entry = this.mZipFile.getEntry(iTileSource.getTileRelativeFilenameString(j));
                if (entry != null) {
                    return this.mZipFile.getInputStream(entry);
                }
                return null;
            }
            Enumeration<? extends ZipEntry> entries = this.mZipFile.entries();
            while (entries.hasMoreElements()) {
                String name = entries.nextElement().getName();
                if (name.contains("/")) {
                    ZipEntry entry2 = this.mZipFile.getEntry(getTileRelativeFilenameString(j, name.split("/")[0]));
                    if (entry2 != null) {
                        return this.mZipFile.getInputStream(entry2);
                    }
                }
            }
            return null;
        } catch (IOException unused) {
            MapTileIndex.toString(j);
            return null;
        }
    }

    @Override // org.osmdroid.tileprovider.modules.IArchiveFile
    public Set<String> getTileSources() {
        HashSet hashSet = new HashSet();
        try {
            Enumeration<? extends ZipEntry> entries = this.mZipFile.entries();
            while (entries.hasMoreElements()) {
                String name = entries.nextElement().getName();
                if (name.contains("/")) {
                    hashSet.add(name.split("/")[0]);
                }
            }
        } catch (Exception unused) {
        }
        return hashSet;
    }

    @Override // org.osmdroid.tileprovider.modules.IArchiveFile
    public void init(File file) throws Exception {
        this.mZipFile = new ZipFile(file);
    }

    @Override // org.osmdroid.tileprovider.modules.IArchiveFile
    public void setIgnoreTileSource(boolean z) {
        this.mIgnoreTileSource = z;
    }

    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("ZipFileArchive [mZipFile=");
        o00oOOo02.append(this.mZipFile.getName());
        o00oOOo02.append("]");
        return o00oOOo02.toString();
    }
}
