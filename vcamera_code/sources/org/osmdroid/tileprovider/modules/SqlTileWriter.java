package org.osmdroid.tileprovider.modules;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.media.o00oOo00;
import android.support.v4.media.o00oOo0O;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import o00ooOoo.oO00O0oO;
import org.osmdroid.config.Configuration;
import org.osmdroid.tileprovider.ExpirableBitmapDrawable;
import org.osmdroid.tileprovider.tilesource.ITileSource;
import org.osmdroid.tileprovider.util.Counters;
import org.osmdroid.tileprovider.util.StreamUtils;
import org.osmdroid.util.GarbageCollector;
import org.osmdroid.util.MapTileIndex;
import org.osmdroid.util.SplashScreenable;
/* loaded from: classes3.dex */
public class SqlTileWriter implements IFilesystemCache, SplashScreenable {
    public static final String COLUMN_EXPIRES_INDEX = "expires_index";
    public static final String DATABASE_FILENAME = "cache.db";
    private static boolean cleanOnStartup = true;
    public static File db_file = null;
    public static boolean hasInited = false;
    public static SQLiteDatabase mDb = null;
    private static final String primaryKey = "key=? and provider=?";
    private final GarbageCollector garbageCollector;
    public long lastSizeCheck = 0;
    private static final Object mLock = new Object();
    public static final String COLUMN_EXPIRES = "expires";
    private static final String[] queryColumns = {DatabaseFileArchive.COLUMN_TILE, COLUMN_EXPIRES};
    private static final String[] expireQueryColumn = {COLUMN_EXPIRES};

    public SqlTileWriter() {
        GarbageCollector garbageCollector = new GarbageCollector(new Runnable() { // from class: org.osmdroid.tileprovider.modules.SqlTileWriter.1
            @Override // java.lang.Runnable
            public void run() {
                SqlTileWriter.this.runCleanupOperation();
            }
        });
        this.garbageCollector = garbageCollector;
        getDb();
        if (hasInited) {
            return;
        }
        hasInited = true;
        if (cleanOnStartup) {
            garbageCollector.gc();
        }
    }

    private void createIndex(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS expires_index ON tiles (expires);");
    }

    public static String extractXFromKeyInSQL(int i) {
        return o00oOo00.o00oOOo0(oO00O0oO.o00oOOo0("((key>>", i, ")%"), 1 << i, ")");
    }

    public static String extractYFromKeyInSQL(int i) {
        return o00oOo00.o00oOOo0(o00oOo0O.o00oOOo0("(key%"), 1 << i, ")");
    }

    public static long getIndex(long j) {
        return getIndex(MapTileIndex.getX(j), MapTileIndex.getY(j), MapTileIndex.getZoom(j));
    }

    public static long getIndex(long j, long j2, long j3) {
        int i = (int) j3;
        return (((j3 << i) + j) << i) + j2;
    }

    public static String getPrimaryKey() {
        return primaryKey;
    }

    public static String[] getPrimaryKeyParameters(long j, String str) {
        return new String[]{String.valueOf(j), str};
    }

    public static String[] getPrimaryKeyParameters(long j, ITileSource iTileSource) {
        return getPrimaryKeyParameters(j, iTileSource.name());
    }

    public static boolean isFunctionalException(SQLiteException sQLiteException) {
        String simpleName = sQLiteException.getClass().getSimpleName();
        return simpleName.equals("SQLiteFullException") || simpleName.equals("SQLiteBindOrColumnIndexOutOfRangeException") || simpleName.equals("SQLiteTableLockedException") || simpleName.equals("SQLiteMisuseException") || simpleName.equals("SQLiteBlobTooBigException") || simpleName.equals("SQLiteConstraintException") || simpleName.equals("SQLiteDatatypeMismatchException");
    }

    public static void setCleanupOnStart(boolean z) {
        cleanOnStartup = z;
    }

    public void catchException(Exception exc) {
        if (!(exc instanceof SQLiteException) || isFunctionalException((SQLiteException) exc)) {
            return;
        }
        refreshDb();
    }

    public long delete(String str, int i, Collection<Rect> collection, Collection<Rect> collection2) {
        try {
            SQLiteDatabase db = getDb();
            if (db != null && db.isOpen()) {
                StringBuilder sb = new StringBuilder();
                sb.append((Object) getWhereClause(i, collection, collection2));
                sb.append(str != null ? " and provider=?" : "");
                return db.delete("tiles", sb.toString(), str != null ? new String[]{str} : null);
            }
            return -1L;
        } catch (Exception e) {
            catchException(e);
            return 0L;
        }
    }

    public boolean exists(String str, long j) {
        return 1 == getRowCount(primaryKey, getPrimaryKeyParameters(getIndex(j), str));
    }

    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    public boolean exists(ITileSource iTileSource, long j) {
        return exists(iTileSource.name(), j);
    }

    public SQLiteDatabase getDb() {
        SQLiteDatabase sQLiteDatabase = mDb;
        if (sQLiteDatabase != null) {
            return sQLiteDatabase;
        }
        synchronized (mLock) {
            Configuration.getInstance().getOsmdroidTileCache().mkdirs();
            File file = new File(Configuration.getInstance().getOsmdroidTileCache().getAbsolutePath() + File.separator + DATABASE_FILENAME);
            db_file = file;
            if (mDb == null) {
                try {
                    SQLiteDatabase openOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(file, (SQLiteDatabase.CursorFactory) null);
                    mDb = openOrCreateDatabase;
                    openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS tiles (key INTEGER , provider TEXT, tile BLOB, expires INTEGER, PRIMARY KEY (key, provider));");
                } catch (Exception e) {
                    catchException(e);
                    return null;
                }
            }
        }
        return mDb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
        if (r2 == null) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Long getExpirationTimestamp(org.osmdroid.tileprovider.tilesource.ITileSource r2, long r3) {
        /*
            r1 = this;
            r0 = 0
            long r3 = getIndex(r3)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            java.lang.String[] r2 = getPrimaryKeyParameters(r3, r2)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            java.lang.String[] r3 = org.osmdroid.tileprovider.modules.SqlTileWriter.expireQueryColumn     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            android.database.Cursor r2 = r1.getTileCursor(r2, r3)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L29
            boolean r3 = r2.moveToNext()     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L25
            if (r3 == 0) goto L30
            r3 = 0
            long r3 = r2.getLong(r3)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L25
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L25
            r2.close()
            return r3
        L22:
            r3 = move-exception
            r0 = r2
            goto L34
        L25:
            r3 = move-exception
            goto L2b
        L27:
            r3 = move-exception
            goto L34
        L29:
            r3 = move-exception
            r2 = r0
        L2b:
            r1.catchException(r3)     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L33
        L30:
            r2.close()
        L33:
            return r0
        L34:
            if (r0 == 0) goto L39
            r0.close()
        L39:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.osmdroid.tileprovider.modules.SqlTileWriter.getExpirationTimestamp(org.osmdroid.tileprovider.tilesource.ITileSource, long):java.lang.Long");
    }

    public long getFirstExpiry() {
        SQLiteDatabase db = getDb();
        if (db != null && db.isOpen()) {
            try {
                Cursor rawQuery = db.rawQuery("select min(expires) from tiles", null);
                rawQuery.moveToFirst();
                long j = rawQuery.getLong(0);
                rawQuery.close();
                return j;
            } catch (Exception e) {
                catchException(e);
            }
        }
        return 0L;
    }

    public long getRowCount(String str) {
        return str == null ? getRowCount(null, null) : getRowCount("provider=?", new String[]{str});
    }

    public long getRowCount(String str, int i, Collection<Rect> collection, Collection<Rect> collection2) {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) getWhereClause(i, collection, collection2));
        sb.append(str != null ? " and provider=?" : "");
        return getRowCount(sb.toString(), str != null ? new String[]{str} : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r2 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long getRowCount(java.lang.String r8, java.lang.String[] r9) {
        /*
            r7 = this;
            r0 = -1
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r7.getDb()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            if (r3 == 0) goto L4a
            boolean r4 = r3.isOpen()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            if (r4 != 0) goto L10
            goto L4a
        L10:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            r4.<init>()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            java.lang.String r5 = "select count(*) from tiles"
            r4.append(r5)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            if (r8 != 0) goto L1f
            java.lang.String r8 = ""
            goto L30
        L1f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            r5.<init>()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            java.lang.String r6 = " where "
            r5.append(r6)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            r5.append(r8)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            java.lang.String r8 = r5.toString()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
        L30:
            r4.append(r8)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            android.database.Cursor r2 = r3.rawQuery(r8, r9)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            boolean r8 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            if (r8 == 0) goto L53
            r8 = 0
            long r8 = r2.getLong(r8)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            r2.close()
            return r8
        L4a:
            return r0
        L4b:
            r8 = move-exception
            goto L57
        L4d:
            r8 = move-exception
            r7.catchException(r8)     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto L56
        L53:
            r2.close()
        L56:
            return r0
        L57:
            if (r2 == 0) goto L5c
            r2.close()
        L5c:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.osmdroid.tileprovider.modules.SqlTileWriter.getRowCount(java.lang.String, java.lang.String[]):long");
    }

    public long getSize() {
        return db_file.length();
    }

    public Cursor getTileCursor(String[] strArr, String[] strArr2) {
        return getDb().query("tiles", strArr2, primaryKey, strArr, null, null, null);
    }

    public StringBuilder getWhereClause(int i, Rect rect) {
        long j = (1 << (i + 1)) - 1;
        long j2 = i;
        long index = getIndex(0L, 0L, j2);
        long index2 = getIndex(j, j, j2);
        String extractXFromKeyInSQL = extractXFromKeyInSQL(i);
        String extractYFromKeyInSQL = extractYFromKeyInSQL(i);
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append("key");
        sb.append(" between ");
        sb.append(index);
        sb.append(" and ");
        sb.append(index2);
        if (rect != null) {
            sb.append(" and ");
            if (rect.left == rect.right) {
                sb.append(extractXFromKeyInSQL);
                sb.append("=");
                sb.append(rect.left);
            } else {
                sb.append("(");
                sb.append(extractXFromKeyInSQL);
                sb.append(">=");
                sb.append(rect.left);
                sb.append(rect.left < rect.right ? " and " : " or ");
                sb.append(extractXFromKeyInSQL);
                sb.append("<=");
                sb.append(rect.right);
                sb.append(")");
            }
            sb.append(" and ");
            if (rect.top == rect.bottom) {
                sb.append(extractYFromKeyInSQL);
                sb.append("=");
                sb.append(rect.top);
            } else {
                sb.append("(");
                sb.append(extractYFromKeyInSQL);
                sb.append(">=");
                sb.append(rect.top);
                sb.append(rect.top >= rect.bottom ? " or " : " and ");
                sb.append(extractYFromKeyInSQL);
                sb.append("<=");
                sb.append(rect.bottom);
                sb.append(")");
            }
        }
        sb.append(')');
        return sb;
    }

    public StringBuilder getWhereClause(int i, Collection<Rect> collection, Collection<Rect> collection2) {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append((CharSequence) getWhereClause(i, null));
        String str = "";
        if (collection != null && collection.size() > 0) {
            sb.append(" and (");
            String str2 = "";
            for (Rect rect : collection) {
                sb.append(str2);
                sb.append('(');
                sb.append((CharSequence) getWhereClause(i, rect));
                sb.append(')');
                str2 = " or ";
            }
            sb.append(")");
        }
        if (collection2 != null && collection2.size() > 0) {
            sb.append(" and not(");
            for (Rect rect2 : collection2) {
                sb.append(str);
                sb.append('(');
                sb.append((CharSequence) getWhereClause(i, rect2));
                sb.append(')');
                str = " or ";
            }
            sb.append(")");
        }
        sb.append(')');
        return sb;
    }

    public int[] importFromFileCache(boolean z) {
        File[] listFiles;
        SQLiteDatabase sQLiteDatabase;
        int[] iArr;
        File[] listFiles2;
        SQLiteDatabase sQLiteDatabase2;
        int[] iArr2;
        File[] fileArr;
        File[] fileArr2;
        int i;
        ContentValues contentValues;
        long parseLong;
        long parseLong2;
        SQLiteDatabase sQLiteDatabase3;
        long parseLong3;
        long index;
        int i2;
        SQLiteDatabase db = getDb();
        int[] iArr3 = {0, 0, 0, 0};
        File osmdroidTileCache = Configuration.getInstance().getOsmdroidTileCache();
        if (osmdroidTileCache.exists() && (listFiles = osmdroidTileCache.listFiles()) != null) {
            int i3 = 0;
            while (i3 < listFiles.length) {
                if (!listFiles[i3].isDirectory() || listFiles[i3].isHidden()) {
                    sQLiteDatabase = db;
                    iArr = iArr3;
                } else {
                    File[] listFiles3 = listFiles[i3].listFiles();
                    if (listFiles3 != null) {
                        int i4 = 0;
                        while (i4 < listFiles3.length) {
                            if (listFiles3[i4].isDirectory() && !listFiles3[i4].isHidden() && (listFiles2 = listFiles3[i4].listFiles()) != null) {
                                int i5 = 0;
                                while (i5 < listFiles2.length) {
                                    if (listFiles2[i5].isDirectory() && !listFiles2[i5].isHidden()) {
                                        File[] listFiles4 = listFiles2[i5].listFiles();
                                        int i6 = 0;
                                        while (i6 < listFiles4.length) {
                                            if (listFiles4[i6].isHidden() || listFiles4[i6].isDirectory()) {
                                                sQLiteDatabase2 = db;
                                                iArr2 = iArr3;
                                                fileArr = listFiles3;
                                                fileArr2 = listFiles2;
                                                i = i5;
                                            } else {
                                                try {
                                                    contentValues = new ContentValues();
                                                    parseLong = Long.parseLong(listFiles2[i5].getName());
                                                    fileArr2 = listFiles2;
                                                    try {
                                                        try {
                                                            i = i5;
                                                            try {
                                                                parseLong2 = Long.parseLong(listFiles4[i6].getName().substring(0, listFiles4[i6].getName().indexOf(".")));
                                                                sQLiteDatabase3 = db;
                                                                iArr2 = iArr3;
                                                                try {
                                                                    parseLong3 = Long.parseLong(listFiles3[i4].getName());
                                                                    index = getIndex(parseLong, parseLong2, parseLong3);
                                                                    fileArr = listFiles3;
                                                                } catch (Exception e) {
                                                                    e = e;
                                                                    fileArr = listFiles3;
                                                                }
                                                            } catch (Exception e2) {
                                                                e = e2;
                                                                sQLiteDatabase2 = db;
                                                                iArr2 = iArr3;
                                                                fileArr = listFiles3;
                                                            }
                                                            try {
                                                                contentValues.put(DatabaseFileArchive.COLUMN_PROVIDER, listFiles[i3].getName());
                                                            } catch (Exception e3) {
                                                                e = e3;
                                                                sQLiteDatabase2 = sQLiteDatabase3;
                                                                listFiles[i3].getName();
                                                                iArr2[1] = iArr2[1] + 1;
                                                                catchException(e);
                                                                i6++;
                                                                db = sQLiteDatabase2;
                                                                i5 = i;
                                                                listFiles3 = fileArr;
                                                                listFiles2 = fileArr2;
                                                                iArr3 = iArr2;
                                                            }
                                                        } catch (Exception e4) {
                                                            e = e4;
                                                            sQLiteDatabase2 = db;
                                                            iArr2 = iArr3;
                                                            fileArr = listFiles3;
                                                            i = i5;
                                                        }
                                                    } catch (Exception e5) {
                                                        e = e5;
                                                        sQLiteDatabase2 = db;
                                                        iArr2 = iArr3;
                                                        fileArr = listFiles3;
                                                        i = i5;
                                                        listFiles[i3].getName();
                                                        iArr2[1] = iArr2[1] + 1;
                                                        catchException(e);
                                                        i6++;
                                                        db = sQLiteDatabase2;
                                                        i5 = i;
                                                        listFiles3 = fileArr;
                                                        listFiles2 = fileArr2;
                                                        iArr3 = iArr2;
                                                    }
                                                } catch (Exception e6) {
                                                    e = e6;
                                                    sQLiteDatabase2 = db;
                                                    iArr2 = iArr3;
                                                    fileArr = listFiles3;
                                                    fileArr2 = listFiles2;
                                                }
                                                if (exists(listFiles[i3].getName(), MapTileIndex.getTileIndex((int) parseLong3, (int) parseLong, (int) parseLong2))) {
                                                    sQLiteDatabase2 = sQLiteDatabase3;
                                                } else {
                                                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(listFiles4[i6]));
                                                    ArrayList arrayList = new ArrayList();
                                                    while (true) {
                                                        int read = bufferedInputStream.read();
                                                        if (read == -1) {
                                                            break;
                                                        }
                                                        arrayList.add(Byte.valueOf((byte) read));
                                                    }
                                                    byte[] bArr = new byte[arrayList.size()];
                                                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                                        bArr[i7] = ((Byte) arrayList.get(i7)).byteValue();
                                                    }
                                                    contentValues.put("key", Long.valueOf(index));
                                                    contentValues.put(DatabaseFileArchive.COLUMN_TILE, bArr);
                                                    sQLiteDatabase2 = sQLiteDatabase3;
                                                    try {
                                                        if (sQLiteDatabase2.insert("tiles", null, contentValues) > 0) {
                                                            if (Configuration.getInstance().isDebugMode()) {
                                                                listFiles[i3].getName();
                                                            }
                                                            try {
                                                                iArr2[0] = iArr2[0] + 1;
                                                                if (z) {
                                                                    try {
                                                                        listFiles4[i6].delete();
                                                                        i2 = 1;
                                                                        try {
                                                                            iArr2[2] = iArr2[2] + 1;
                                                                        } catch (Exception unused) {
                                                                            iArr2[3] = iArr2[3] + i2;
                                                                            i6++;
                                                                            db = sQLiteDatabase2;
                                                                            i5 = i;
                                                                            listFiles3 = fileArr;
                                                                            listFiles2 = fileArr2;
                                                                            iArr3 = iArr2;
                                                                        }
                                                                    } catch (Exception unused2) {
                                                                        i2 = 1;
                                                                    }
                                                                }
                                                            } catch (Exception e7) {
                                                                e = e7;
                                                                listFiles[i3].getName();
                                                                iArr2[1] = iArr2[1] + 1;
                                                                catchException(e);
                                                                i6++;
                                                                db = sQLiteDatabase2;
                                                                i5 = i;
                                                                listFiles3 = fileArr;
                                                                listFiles2 = fileArr2;
                                                                iArr3 = iArr2;
                                                            }
                                                        } else {
                                                            listFiles[i3].getName();
                                                        }
                                                    } catch (Exception e8) {
                                                        e = e8;
                                                        listFiles[i3].getName();
                                                        iArr2[1] = iArr2[1] + 1;
                                                        catchException(e);
                                                        i6++;
                                                        db = sQLiteDatabase2;
                                                        i5 = i;
                                                        listFiles3 = fileArr;
                                                        listFiles2 = fileArr2;
                                                        iArr3 = iArr2;
                                                    }
                                                    i6++;
                                                    db = sQLiteDatabase2;
                                                    i5 = i;
                                                    listFiles3 = fileArr;
                                                    listFiles2 = fileArr2;
                                                    iArr3 = iArr2;
                                                }
                                            }
                                            i6++;
                                            db = sQLiteDatabase2;
                                            i5 = i;
                                            listFiles3 = fileArr;
                                            listFiles2 = fileArr2;
                                            iArr3 = iArr2;
                                        }
                                    }
                                    SQLiteDatabase sQLiteDatabase4 = db;
                                    int[] iArr4 = iArr3;
                                    File[] fileArr3 = listFiles3;
                                    File[] fileArr4 = listFiles2;
                                    int i8 = i5;
                                    if (z) {
                                        try {
                                            fileArr4[i8].delete();
                                        } catch (Exception unused3) {
                                            fileArr4[i8].getAbsolutePath();
                                            iArr4[3] = iArr4[3] + 1;
                                        }
                                    }
                                    i5 = i8 + 1;
                                    db = sQLiteDatabase4;
                                    listFiles3 = fileArr3;
                                    listFiles2 = fileArr4;
                                    iArr3 = iArr4;
                                }
                            }
                            SQLiteDatabase sQLiteDatabase5 = db;
                            int[] iArr5 = iArr3;
                            File[] fileArr5 = listFiles3;
                            if (z) {
                                try {
                                    fileArr5[i4].delete();
                                } catch (Exception unused4) {
                                    fileArr5[i4].getAbsolutePath();
                                    iArr5[3] = iArr5[3] + 1;
                                }
                            }
                            i4++;
                            db = sQLiteDatabase5;
                            listFiles3 = fileArr5;
                            iArr3 = iArr5;
                        }
                    }
                    sQLiteDatabase = db;
                    iArr = iArr3;
                    if (z) {
                        try {
                            listFiles[i3].delete();
                        } catch (Exception unused5) {
                            listFiles[i3].getAbsolutePath();
                            iArr[3] = iArr[3] + 1;
                        }
                    }
                }
                i3++;
                db = sQLiteDatabase;
                iArr3 = iArr;
            }
        }
        return iArr3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [org.osmdroid.tileprovider.tilesource.ITileSource] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.ByteArrayInputStream, java.io.Closeable, java.io.InputStream] */
    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    public Drawable loadTile(ITileSource iTileSource, long j) throws Exception {
        Cursor tileCursor;
        long j2;
        byte[] bArr;
        Cursor cursor = null;
        try {
            try {
                tileCursor = getTileCursor(getPrimaryKeyParameters(getIndex(j), (ITileSource) iTileSource), queryColumns);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean z = true;
            if (tileCursor.moveToFirst()) {
                bArr = tileCursor.getBlob(0);
                j2 = tileCursor.getLong(1);
            } else {
                j2 = 0;
                bArr = null;
            }
            if (bArr == null) {
                if (Configuration.getInstance().isDebugMode()) {
                    iTileSource.name();
                    MapTileIndex.toString(j);
                }
                tileCursor.close();
                return null;
            }
            tileCursor.close();
            try {
                ?? byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    Drawable drawable = iTileSource.getDrawable(byteArrayInputStream);
                    if (j2 >= System.currentTimeMillis()) {
                        z = false;
                    }
                    if (z && drawable != null) {
                        if (Configuration.getInstance().isDebugMode()) {
                            iTileSource.name();
                            MapTileIndex.toString(j);
                        }
                        ExpirableBitmapDrawable.setState(drawable, -2);
                    }
                    StreamUtils.closeStream(byteArrayInputStream);
                    return drawable;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = byteArrayInputStream;
                    if (cursor != null) {
                        StreamUtils.closeStream(cursor);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e2) {
            e = e2;
            cursor = tileCursor;
            catchException(e);
            throw e;
        } catch (Throwable th4) {
            th = th4;
            cursor = tileCursor;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    public void onDetach() {
    }

    public boolean purgeCache() {
        SQLiteDatabase db = getDb();
        if (db == null || !db.isOpen()) {
            return false;
        }
        try {
            db.delete("tiles", null, null);
            return true;
        } catch (Exception e) {
            catchException(e);
            return false;
        }
    }

    public boolean purgeCache(String str) {
        SQLiteDatabase db = getDb();
        if (db != null && db.isOpen()) {
            try {
                db.delete("tiles", "provider = ?", new String[]{str});
                return true;
            } catch (Exception e) {
                catchException(e);
            }
        }
        return false;
    }

    public void refreshDb() {
        synchronized (mLock) {
            SQLiteDatabase sQLiteDatabase = mDb;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
                mDb = null;
            }
        }
    }

    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    public boolean remove(ITileSource iTileSource, long j) {
        SQLiteDatabase db = getDb();
        if (db == null || !db.isOpen()) {
            iTileSource.name();
            MapTileIndex.toString(j);
            Counters.fileCacheSaveErrors++;
            return false;
        }
        try {
            db.delete("tiles", primaryKey, getPrimaryKeyParameters(getIndex(j), iTileSource));
            return true;
        } catch (Exception e) {
            iTileSource.name();
            MapTileIndex.toString(j);
            Counters.fileCacheSaveErrors++;
            catchException(e);
            return false;
        }
    }

    public void runCleanupOperation() {
        SQLiteDatabase db = getDb();
        if (db == null || !db.isOpen()) {
            Configuration.getInstance().isDebugMode();
            return;
        }
        createIndex(db);
        long length = db_file.length();
        if (length <= Configuration.getInstance().getTileFileSystemCacheMaxBytes()) {
            return;
        }
        runCleanupOperation(length - Configuration.getInstance().getTileFileSystemCacheTrimBytes(), Configuration.getInstance().getTileGCBulkSize(), Configuration.getInstance().getTileGCBulkPauseInMillis(), true);
    }

    public void runCleanupOperation(long j, int i, long j2, boolean z) {
        boolean z2;
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        SQLiteDatabase db = getDb();
        long j3 = j;
        boolean z3 = true;
        while (j3 > 0) {
            if (z3) {
                z2 = false;
            } else {
                if (j2 > 0) {
                    try {
                        Thread.sleep(j2);
                    } catch (InterruptedException unused) {
                    }
                }
                z2 = z3;
            }
            long currentTimeMillis = System.currentTimeMillis();
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SELECT key,LENGTH(HEX(tile))/2 FROM tiles WHERE expires IS NOT NULL ");
                String str3 = "";
                if (z) {
                    str = "";
                } else {
                    str = "AND expires < " + currentTimeMillis + " ";
                }
                sb2.append(str);
                sb2.append("ORDER BY ");
                sb2.append(COLUMN_EXPIRES);
                sb2.append(" ASC LIMIT ");
                sb2.append(i);
                Cursor rawQuery = db.rawQuery(sb2.toString(), null);
                rawQuery.moveToFirst();
                sb.setLength(0);
                sb.append("key in (");
                String str4 = "";
                while (true) {
                    str2 = str3;
                    if (rawQuery.isAfterLast()) {
                        break;
                    }
                    long j4 = rawQuery.getLong(0);
                    long j5 = rawQuery.getLong(1);
                    rawQuery.moveToNext();
                    sb.append(str4);
                    sb.append(j4);
                    str4 = ",";
                    j3 -= j5;
                    if (j3 <= 0) {
                        break;
                    }
                    str3 = str2;
                }
                rawQuery.close();
                if (str2.equals(str4)) {
                    return;
                }
                sb.append(')');
                try {
                    db.delete("tiles", sb.toString(), null);
                } catch (SQLiteFullException e) {
                    catchException(e);
                } catch (Exception e2) {
                    catchException(e2);
                    return;
                }
                z3 = z2;
            } catch (Exception e3) {
                catchException(e3);
                return;
            }
        }
    }

    @Override // org.osmdroid.util.SplashScreenable
    public void runDuringSplashScreen() {
        createIndex(getDb());
    }

    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    public boolean saveFile(ITileSource iTileSource, long j, InputStream inputStream, Long l) {
        SQLiteDatabase db = getDb();
        if (db == null || !db.isOpen()) {
            iTileSource.name();
            MapTileIndex.toString(j);
            Counters.fileCacheSaveErrors++;
            return false;
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    long index = getIndex(j);
                    contentValues.put(DatabaseFileArchive.COLUMN_PROVIDER, iTileSource.name());
                    byte[] bArr = new byte[512];
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    while (true) {
                        try {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream2.write(bArr, 0, read);
                        } catch (SQLiteFullException e) {
                            e = e;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            this.garbageCollector.gc();
                            catchException(e);
                            byteArrayOutputStream.close();
                            return false;
                        } catch (Exception e2) {
                            e = e2;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            iTileSource.name();
                            MapTileIndex.toString(j);
                            Counters.fileCacheSaveErrors++;
                            catchException(e);
                            byteArrayOutputStream.close();
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException unused) {
                            }
                            throw th;
                        }
                    }
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    contentValues.put("key", Long.valueOf(index));
                    contentValues.put(DatabaseFileArchive.COLUMN_TILE, byteArray);
                    if (l != null) {
                        contentValues.put(COLUMN_EXPIRES, l);
                    }
                    db.replaceOrThrow("tiles", null, contentValues);
                    if (Configuration.getInstance().isDebugMode()) {
                        iTileSource.name();
                        MapTileIndex.toString(j);
                    }
                    if (System.currentTimeMillis() > this.lastSizeCheck + Configuration.getInstance().getTileGCFrequencyInMillis()) {
                        this.lastSizeCheck = System.currentTimeMillis();
                        this.garbageCollector.gc();
                    }
                    byteArrayOutputStream2.close();
                } catch (IOException unused2) {
                    return false;
                }
            } catch (SQLiteFullException e3) {
                e = e3;
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
