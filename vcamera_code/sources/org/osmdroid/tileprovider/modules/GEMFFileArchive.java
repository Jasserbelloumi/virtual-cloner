package org.osmdroid.tileprovider.modules;

import android.support.v4.media.o00oOo0O;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import org.osmdroid.tileprovider.tilesource.ITileSource;
import org.osmdroid.util.GEMFFile;
import org.osmdroid.util.MapTileIndex;
/* loaded from: classes3.dex */
public class GEMFFileArchive implements IArchiveFile {
    private GEMFFile mFile;

    public GEMFFileArchive() {
    }

    private GEMFFileArchive(File file) throws IOException {
        this.mFile = new GEMFFile(file);
    }

    public static GEMFFileArchive getGEMFFileArchive(File file) throws IOException {
        return new GEMFFileArchive(file);
    }

    @Override // org.osmdroid.tileprovider.modules.IArchiveFile
    public void close() {
        try {
            this.mFile.close();
        } catch (IOException unused) {
        }
    }

    @Override // org.osmdroid.tileprovider.modules.IArchiveFile
    public InputStream getInputStream(ITileSource iTileSource, long j) {
        return this.mFile.getInputStream(MapTileIndex.getX(j), MapTileIndex.getY(j), MapTileIndex.getZoom(j));
    }

    @Override // org.osmdroid.tileprovider.modules.IArchiveFile
    public Set<String> getTileSources() {
        HashSet hashSet = new HashSet();
        try {
            hashSet.addAll(this.mFile.getSources().values());
        } catch (Exception unused) {
        }
        return hashSet;
    }

    @Override // org.osmdroid.tileprovider.modules.IArchiveFile
    public void init(File file) throws Exception {
        this.mFile = new GEMFFile(file);
    }

    @Override // org.osmdroid.tileprovider.modules.IArchiveFile
    public void setIgnoreTileSource(boolean z) {
    }

    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("GEMFFileArchive [mGEMFFile=");
        o00oOOo02.append(this.mFile.getName());
        o00oOOo02.append("]");
        return o00oOOo02.toString();
    }
}
