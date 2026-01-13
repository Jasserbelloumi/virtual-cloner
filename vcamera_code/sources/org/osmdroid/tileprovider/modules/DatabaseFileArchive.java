package org.osmdroid.tileprovider.modules;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.support.v4.media.o00oOo0O;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import org.osmdroid.config.Configuration;
import org.osmdroid.tileprovider.tilesource.ITileSource;
import org.osmdroid.util.MapTileIndex;
/* loaded from: classes3.dex */
public class DatabaseFileArchive implements IArchiveFile {
    public static final String COLUMN_KEY = "key";
    public static final String COLUMN_PROVIDER = "provider";
    public static final String TABLE = "tiles";
    private SQLiteDatabase mDatabase;
    private boolean mIgnoreTileSource = false;
    public static final String COLUMN_TILE = "tile";
    public static final String[] tile_column = {COLUMN_TILE};

    public DatabaseFileArchive() {
    }

    private DatabaseFileArchive(SQLiteDatabase sQLiteDatabase) {
        this.mDatabase = sQLiteDatabase;
    }

    public static DatabaseFileArchive getDatabaseFileArchive(File file) throws SQLiteException {
        return new DatabaseFileArchive(SQLiteDatabase.openDatabase(file.getAbsolutePath(), null, 0));
    }

    @Override // org.osmdroid.tileprovider.modules.IArchiveFile
    public void close() {
        this.mDatabase.close();
    }

    public byte[] getImage(ITileSource iTileSource, long j) {
        Cursor query;
        byte[] bArr;
        SQLiteDatabase sQLiteDatabase = this.mDatabase;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            Configuration.getInstance().isDebugTileProviders();
            return null;
        }
        try {
            String[] strArr = {COLUMN_TILE};
            long x = MapTileIndex.getX(j);
            long y = MapTileIndex.getY(j);
            long zoom = MapTileIndex.getZoom(j);
            int i = (int) zoom;
            long j2 = (((zoom << i) + x) << i) + y;
            if (this.mIgnoreTileSource) {
                query = this.mDatabase.query("tiles", strArr, "key = " + j2, null, null, null, null);
            } else {
                query = this.mDatabase.query("tiles", strArr, "key = " + j2 + " and " + COLUMN_PROVIDER + " = ?", new String[]{iTileSource.name()}, null, null, null);
            }
            if (query.getCount() != 0) {
                query.moveToFirst();
                bArr = query.getBlob(0);
            } else {
                bArr = null;
            }
            query.close();
        } catch (Throwable unused) {
            MapTileIndex.toString(j);
        }
        if (bArr != null) {
            return bArr;
        }
        return null;
    }

    @Override // org.osmdroid.tileprovider.modules.IArchiveFile
    public InputStream getInputStream(ITileSource iTileSource, long j) {
        ByteArrayInputStream byteArrayInputStream;
        try {
            byte[] image = getImage(iTileSource, j);
            byteArrayInputStream = image != null ? new ByteArrayInputStream(image) : null;
        } catch (Throwable unused) {
            MapTileIndex.toString(j);
        }
        if (byteArrayInputStream != null) {
            return byteArrayInputStream;
        }
        return null;
    }

    @Override // org.osmdroid.tileprovider.modules.IArchiveFile
    public Set<String> getTileSources() {
        HashSet hashSet = new HashSet();
        try {
            Cursor rawQuery = this.mDatabase.rawQuery("SELECT distinct provider FROM tiles", null);
            while (rawQuery.moveToNext()) {
                hashSet.add(rawQuery.getString(0));
            }
            rawQuery.close();
        } catch (Exception unused) {
        }
        return hashSet;
    }

    @Override // org.osmdroid.tileprovider.modules.IArchiveFile
    public void init(File file) throws Exception {
        this.mDatabase = SQLiteDatabase.openDatabase(file.getAbsolutePath(), null, 17);
    }

    @Override // org.osmdroid.tileprovider.modules.IArchiveFile
    public void setIgnoreTileSource(boolean z) {
        this.mIgnoreTileSource = z;
    }

    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("DatabaseFileArchive [mDatabase=");
        o00oOOo02.append(this.mDatabase.getPath());
        o00oOOo02.append("]");
        return o00oOOo02.toString();
    }
}
