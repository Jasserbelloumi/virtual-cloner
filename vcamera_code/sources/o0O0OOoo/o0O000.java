package o0O0OOoo;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import androidx.appcompat.widget.o00oOo0O;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import o00oOooO.o0OOooO0;
import o0O0OOoO.o0;
import o0O0OOoO.o00oo;
import o0O0OOoO.o0O0000O;
import o0O0OOoO.o0O0o;
/* loaded from: classes.dex */
public class o0O000 implements o00oo {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final String[] f11540o00oo0O = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final String[] f11541o00oo0Oo = new String[0];

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final SQLiteDatabase f11542o00oo0O0;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements SQLiteDatabase.CursorFactory {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o0 f11543o00oOOo0;

        public o00oOOo0(o0 o0Var) {
            this.f11543o00oOOo0 = o0Var;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f11543o00oOOo0.o00oOo0O(new o0O000Oo(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements SQLiteDatabase.CursorFactory {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o0 f11545o00oOOo0;

        public o00oOOoO(o0 o0Var) {
            this.f11545o00oOOo0 = o0Var;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f11545o00oOOo0.o00oOo0O(new o0O000Oo(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public o0O000(SQLiteDatabase sQLiteDatabase) {
        this.f11542o00oo0O0 = sQLiteDatabase;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f11542o00oo0O0.close();
    }

    @Override // o0O0OOoO.o00oo
    public long getPageSize() {
        return this.f11542o00oo0O0.getPageSize();
    }

    @Override // o0O0OOoO.o00oo
    public int getVersion() {
        return this.f11542o00oo0O0.getVersion();
    }

    @Override // o0O0OOoO.o00oo
    public boolean isOpen() {
        return this.f11542o00oo0O0.isOpen();
    }

    @Override // o0O0OOoO.o00oo
    public void o0() {
        this.f11542o00oo0O0.endTransaction();
    }

    public boolean o00oOOo0(SQLiteDatabase sQLiteDatabase) {
        return this.f11542o00oo0O0 == sQLiteDatabase;
    }

    @Override // o0O0OOoO.o00oo
    public int o00oOoOO(String str, String str2, Object[] objArr) {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("DELETE FROM ", str);
        o00oOOo02.append(TextUtils.isEmpty(str2) ? "" : o00oOoOo.o00oo.o00oOOo0(" WHERE ", str2));
        o0O0000O o0O0oo0o2 = o0O0oo0o(o00oOOo02.toString());
        o0O0o.o00oOooO(o0O0oo0o2, objArr);
        return o0O0oo0o2.o00oo0oO();
    }

    @Override // o0O0OOoO.o00oo
    public void o00oOoOo() {
        this.f11542o00oo0O0.beginTransaction();
    }

    @Override // o0O0OOoO.o00oo
    public List<Pair<String, String>> o00oo00O() {
        return this.f11542o00oo0O0.getAttachedDbs();
    }

    @Override // o0O0OOoO.o00oo
    public void o00oo0O0(String str) throws SQLException {
        this.f11542o00oo0O0.execSQL(str);
    }

    @Override // o0O0OOoO.o00oo
    @o0OOooO0(api = 16)
    public void o00oo0OO() {
        this.f11542o00oo0O0.disableWriteAheadLogging();
    }

    @Override // o0O0OOoO.o00oo
    public boolean o00oo0Oo() {
        return this.f11542o00oo0O0.isDatabaseIntegrityOk();
    }

    @Override // o0O0OOoO.o00oo
    public boolean o00ooo00() {
        return this.f11542o00oo0O0.enableWriteAheadLogging();
    }

    @Override // o0O0OOoO.o00oo
    public void o00ooo0O() {
        this.f11542o00oo0O0.setTransactionSuccessful();
    }

    @Override // o0O0OOoO.o00oo
    public void o00ooo0o(String str, Object[] objArr) throws SQLException {
        this.f11542o00oo0O0.execSQL(str, objArr);
    }

    @Override // o0O0OOoO.o00oo
    public void o00oooO() {
        this.f11542o00oo0O0.beginTransactionNonExclusive();
    }

    @Override // o0O0OOoO.o00oo
    public long o00oooOO(long j) {
        return this.f11542o00oo0O0.setMaximumSize(j);
    }

    @Override // o0O0OOoO.o00oo
    public void o00ooooO(SQLiteTransactionListener sQLiteTransactionListener) {
        this.f11542o00oo0O0.beginTransactionWithListener(sQLiteTransactionListener);
    }

    @Override // o0O0OOoO.o00oo
    public boolean o00ooooo() {
        return this.f11542o00oo0O0.isDbLockedByCurrentThread();
    }

    @Override // o0O0OOoO.o00oo
    public boolean o0O0000O(int i) {
        return this.f11542o00oo0O0.needUpgrade(i);
    }

    @Override // o0O0OOoO.o00oo
    public void o0O000Oo(Locale locale) {
        this.f11542o00oo0O0.setLocale(locale);
    }

    @Override // o0O0OOoO.o00oo
    public String o0O000o() {
        return this.f11542o00oo0O0.getPath();
    }

    @Override // o0O0OOoO.o00oo
    public boolean o0O00OoO(long j) {
        return this.f11542o00oo0O0.yieldIfContendedSafely(j);
    }

    @Override // o0O0OOoO.o00oo
    public Cursor o0O00o0O(String str, Object[] objArr) {
        return o0O00o0o(new o0O0o(str, objArr));
    }

    @Override // o0O0OOoO.o00oo
    public Cursor o0O00o0o(o0 o0Var) {
        return this.f11542o00oo0O0.rawQueryWithFactory(new o00oOOo0(o0Var), o0Var.o00oOOoO(), f11541o00oo0Oo, null);
    }

    @Override // o0O0OOoO.o00oo
    public void o0O00oO0(int i) {
        this.f11542o00oo0O0.setVersion(i);
    }

    @Override // o0O0OOoO.o00oo
    public boolean o0O0O0oo() {
        return this.f11542o00oo0O0.isReadOnly();
    }

    @Override // o0O0OOoO.o00oo
    @o0OOooO0(api = 16)
    public Cursor o0O0OOO(o0 o0Var, CancellationSignal cancellationSignal) {
        return this.f11542o00oo0O0.rawQueryWithFactory(new o00oOOoO(o0Var), o0Var.o00oOOoO(), f11541o00oo0Oo, null, cancellationSignal);
    }

    @Override // o0O0OOoO.o00oo
    @o0OOooO0(api = 16)
    public void o0O0OOO0(boolean z) {
        this.f11542o00oo0O0.setForeignKeyConstraintsEnabled(z);
    }

    @Override // o0O0OOoO.o00oo
    public long o0O0OOo() {
        return this.f11542o00oo0O0.getMaximumSize();
    }

    @Override // o0O0OOoO.o00oo
    public int o0O0OOoO(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        if (contentValues == null || contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        StringBuilder sb = new StringBuilder(120);
        sb.append("UPDATE ");
        sb.append(f11540o00oo0O[i]);
        sb.append(str);
        sb.append(" SET ");
        int size = contentValues.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        int i2 = 0;
        for (String str3 : contentValues.keySet()) {
            sb.append(i2 > 0 ? "," : "");
            sb.append(str3);
            objArr2[i2] = contentValues.get(str3);
            sb.append("=?");
            i2++;
        }
        if (objArr != null) {
            for (int i3 = size; i3 < length; i3++) {
                objArr2[i3] = objArr[i3 - size];
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(" WHERE ");
            sb.append(str2);
        }
        o0O0000O o0O0oo0o2 = o0O0oo0o(sb.toString());
        o0O0o.o00oOooO(o0O0oo0o2, objArr2);
        return o0O0oo0o2.o00oo0oO();
    }

    @Override // o0O0OOoO.o00oo
    public boolean o0O0Oo0O() {
        return this.f11542o00oo0O0.yieldIfContendedSafely();
    }

    @Override // o0O0OOoO.o00oo
    public Cursor o0O0Oo0o(String str) {
        return o0O00o0o(new o0O0o(str, null));
    }

    @Override // o0O0OOoO.o00oo
    public void o0O0o0OO(SQLiteTransactionListener sQLiteTransactionListener) {
        this.f11542o00oo0O0.beginTransactionWithListenerNonExclusive(sQLiteTransactionListener);
    }

    @Override // o0O0OOoO.o00oo
    public boolean o0O0o0Oo() {
        return this.f11542o00oo0O0.inTransaction();
    }

    @Override // o0O0OOoO.o00oo
    public void o0O0oO0O(long j) {
        this.f11542o00oo0O0.setPageSize(j);
    }

    @Override // o0O0OOoO.o00oo
    @o0OOooO0(api = 16)
    public boolean o0O0oo0O() {
        return this.f11542o00oo0O0.isWriteAheadLoggingEnabled();
    }

    @Override // o0O0OOoO.o00oo
    public o0O0000O o0O0oo0o(String str) {
        return new o0O000o0(this.f11542o00oo0O0.compileStatement(str));
    }

    @Override // o0O0OOoO.o00oo
    public long oo0OOoo(String str, int i, ContentValues contentValues) throws SQLException {
        return this.f11542o00oo0O0.insertWithOnConflict(str, null, contentValues, i);
    }

    @Override // o0O0OOoO.o00oo
    public void oooOO0(int i) {
        this.f11542o00oo0O0.setMaxSqlCacheSize(i);
    }
}
