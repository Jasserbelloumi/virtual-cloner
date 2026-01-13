package o0O0OOoo;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import o00oOooO.o0OOooO0;
import o0O0OOoO.o00oo;
import o0O0OOoO.o00ooO0;
/* loaded from: classes.dex */
public class o0O000O implements o00ooO0 {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final String f11547o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Context f11548o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final o00ooO0.o00oOOo0 f11549o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final Object f11550o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final boolean f11551o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public o00oOOo0 f11552o00oo0oO;

    /* renamed from: o0O0o  reason: collision with root package name */
    public boolean f11553o0O0o;

    /* loaded from: classes.dex */
    public static class o00oOOo0 extends SQLiteOpenHelper {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final o00ooO0.o00oOOo0 f11554o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final o0O000[] f11555o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public boolean f11556o00oo0Oo;

        /* renamed from: o0O0OOoo.o0O000O$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0151o00oOOo0 implements DatabaseErrorHandler {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public final /* synthetic */ o00ooO0.o00oOOo0 f11557o00oOOo0;

            /* renamed from: o00oOOoO  reason: collision with root package name */
            public final /* synthetic */ o0O000[] f11558o00oOOoO;

            public C0151o00oOOo0(o00ooO0.o00oOOo0 o00oooo02, o0O000[] o0o000Arr) {
                this.f11557o00oOOo0 = o00oooo02;
                this.f11558o00oOOoO = o0o000Arr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f11557o00oOOo0.o00oOo00(o00oOOo0.o00oOo0O(this.f11558o00oOOoO, sQLiteDatabase));
            }
        }

        public o00oOOo0(Context context, String str, o0O000[] o0o000Arr, o00ooO0.o00oOOo0 o00oooo02) {
            super(context, str, null, o00oooo02.f11519o00oOOo0, new C0151o00oOOo0(o00oooo02, o0o000Arr));
            this.f11554o00oo0O = o00oooo02;
            this.f11555o00oo0O0 = o0o000Arr;
        }

        public static o0O000 o00oOo0O(o0O000[] o0o000Arr, SQLiteDatabase sQLiteDatabase) {
            o0O000 o0o000 = o0o000Arr[0];
            if (o0o000 == null || !o0o000.o00oOOo0(sQLiteDatabase)) {
                o0o000Arr[0] = new o0O000(sQLiteDatabase);
            }
            return o0o000Arr[0];
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.f11555o00oo0O0[0] = null;
        }

        public synchronized o00oo o00oOOo0() {
            this.f11556o00oo0Oo = false;
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            if (!this.f11556o00oo0Oo) {
                return o00oOOoO(readableDatabase);
            }
            close();
            return o00oOOo0();
        }

        public o0O000 o00oOOoO(SQLiteDatabase sQLiteDatabase) {
            return o00oOo0O(this.f11555o00oo0O0, sQLiteDatabase);
        }

        public synchronized o00oo o00oOo0o() {
            this.f11556o00oo0Oo = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (!this.f11556o00oo0Oo) {
                return o00oOOoO(writableDatabase);
            }
            close();
            return o00oOo0o();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f11554o00oo0O.o00oOOoO(o00oOOoO(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f11554o00oo0O.o00oOooO(o00oOOoO(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f11556o00oo0Oo = true;
            this.f11554o00oo0O.o00oOo0O(o00oOOoO(sQLiteDatabase), i, i2);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.f11556o00oo0Oo) {
                return;
            }
            this.f11554o00oo0O.o00oOo0o(o00oOOoO(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f11556o00oo0Oo = true;
            this.f11554o00oo0O.o00oOoO0(o00oOOoO(sQLiteDatabase), i, i2);
        }
    }

    public o0O000O(Context context, String str, o00ooO0.o00oOOo0 o00oooo02) {
        this(context, str, o00oooo02, false);
    }

    public o0O000O(Context context, String str, o00ooO0.o00oOOo0 o00oooo02, boolean z) {
        this.f11548o00oo0O0 = context;
        this.f11547o00oo0O = str;
        this.f11549o00oo0Oo = o00oooo02;
        this.f11551o00oo0o0 = z;
        this.f11550o00oo0o = new Object();
    }

    @Override // o0O0OOoO.o00ooO0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        o00oOOo0().close();
    }

    @Override // o0O0OOoO.o00ooO0
    public String getDatabaseName() {
        return this.f11547o00oo0O;
    }

    @Override // o0O0OOoO.o00ooO0
    public o00oo getReadableDatabase() {
        return o00oOOo0().o00oOOo0();
    }

    @Override // o0O0OOoO.o00ooO0
    public o00oo getWritableDatabase() {
        return o00oOOo0().o00oOo0o();
    }

    public final o00oOOo0 o00oOOo0() {
        o00oOOo0 o00oooo02;
        synchronized (this.f11550o00oo0o) {
            if (this.f11552o00oo0oO == null) {
                o0O000[] o0o000Arr = new o0O000[1];
                if (this.f11547o00oo0O == null || !this.f11551o00oo0o0) {
                    this.f11552o00oo0oO = new o00oOOo0(this.f11548o00oo0O0, this.f11547o00oo0O, o0o000Arr, this.f11549o00oo0Oo);
                } else {
                    this.f11552o00oo0oO = new o00oOOo0(this.f11548o00oo0O0, new File(this.f11548o00oo0O0.getNoBackupFilesDir(), this.f11547o00oo0O).getAbsolutePath(), o0o000Arr, this.f11549o00oo0Oo);
                }
                this.f11552o00oo0oO.setWriteAheadLoggingEnabled(this.f11553o0O0o);
            }
            o00oooo02 = this.f11552o00oo0oO;
        }
        return o00oooo02;
    }

    @Override // o0O0OOoO.o00ooO0
    @o0OOooO0(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.f11550o00oo0o) {
            o00oOOo0 o00oooo02 = this.f11552o00oo0oO;
            if (o00oooo02 != null) {
                o00oooo02.setWriteAheadLoggingEnabled(z);
            }
            this.f11553o0O0o = z;
        }
    }
}
