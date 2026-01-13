package o0O0OOoO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o0O00Oo.o0oO0Ooo;
/* loaded from: classes.dex */
public interface o00ooO0 extends Closeable {

    /* loaded from: classes.dex */
    public static abstract class o00oOOo0 {

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final String f11518o00oOOoO = "SupportSQLite";

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final int f11519o00oOOo0;

        public o00oOOo0(int i) {
            this.f11519o00oOOo0 = i;
        }

        public final void o00oOOo0(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception unused) {
                }
            }
        }

        public void o00oOOoO(@oo0oO0 o00oo o00ooVar) {
        }

        public void o00oOo00(@oo0oO0 o00oo o00ooVar) {
            o00ooVar.o0O000o();
            if (!o00ooVar.isOpen()) {
                o00oOOo0(o00ooVar.o0O000o());
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = o00ooVar.o00oo00O();
                } catch (SQLiteException unused) {
                }
                try {
                    o00ooVar.close();
                } catch (IOException unused2) {
                }
            } finally {
                if (list != null) {
                    for (Pair<String, String> next : list) {
                        o00oOOo0((String) next.second);
                    }
                } else {
                    o00oOOo0(o00ooVar.o0O000o());
                }
            }
        }

        public void o00oOo0O(@oo0oO0 o00oo o00ooVar, int i, int i2) {
            throw new SQLiteException(o0oO0Ooo.o00oOOo0("Can't downgrade database from version ", i, " to ", i2));
        }

        public void o00oOo0o(@oo0oO0 o00oo o00ooVar) {
        }

        public abstract void o00oOoO0(@oo0oO0 o00oo o00ooVar, int i, int i2);

        public abstract void o00oOooO(@oo0oO0 o00oo o00ooVar);
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @oo0oO0

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Context f11520o00oOOo0;
        @o0OO00OO

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final String f11521o00oOOoO;
        @oo0oO0

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final o00oOOo0 f11522o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final boolean f11523o00oOooO;

        /* loaded from: classes.dex */
        public static class o00oOOo0 {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public Context f11524o00oOOo0;

            /* renamed from: o00oOOoO  reason: collision with root package name */
            public String f11525o00oOOoO;

            /* renamed from: o00oOo00  reason: collision with root package name */
            public o00oOOo0 f11526o00oOo00;

            /* renamed from: o00oOooO  reason: collision with root package name */
            public boolean f11527o00oOooO;

            public o00oOOo0(@oo0oO0 Context context) {
                this.f11524o00oOOo0 = context;
            }

            @oo0oO0
            public o00oOOoO o00oOOo0() {
                if (this.f11526o00oOo00 != null) {
                    if (this.f11524o00oOOo0 != null) {
                        if (this.f11527o00oOooO && TextUtils.isEmpty(this.f11525o00oOOoO)) {
                            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                        }
                        return new o00oOOoO(this.f11524o00oOOo0, this.f11525o00oOOoO, this.f11526o00oOo00, this.f11527o00oOooO);
                    }
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.");
            }

            @oo0oO0
            public o00oOOo0 o00oOOoO(@oo0oO0 o00oOOo0 o00oooo02) {
                this.f11526o00oOo00 = o00oooo02;
                return this;
            }

            @oo0oO0
            public o00oOOo0 o00oOo00(@o0OO00OO String str) {
                this.f11525o00oOOoO = str;
                return this;
            }

            @oo0oO0
            public o00oOOo0 o00oOooO(boolean z) {
                this.f11527o00oOooO = z;
                return this;
            }
        }

        public o00oOOoO(@oo0oO0 Context context, @o0OO00OO String str, @oo0oO0 o00oOOo0 o00oooo02) {
            this(context, str, o00oooo02, false);
        }

        public o00oOOoO(@oo0oO0 Context context, @o0OO00OO String str, @oo0oO0 o00oOOo0 o00oooo02, boolean z) {
            this.f11520o00oOOo0 = context;
            this.f11521o00oOOoO = str;
            this.f11522o00oOo00 = o00oooo02;
            this.f11523o00oOooO = z;
        }

        @oo0oO0
        public static o00oOOo0 o00oOOo0(@oo0oO0 Context context) {
            return new o00oOOo0(context);
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOo00 {
        @oo0oO0
        o00ooO0 o00oOOo0(@oo0oO0 o00oOOoO o00ooooo2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @o0OO00OO
    String getDatabaseName();

    o00oo getReadableDatabase();

    o00oo getWritableDatabase();

    @o0OOooO0(api = 16)
    void setWriteAheadLoggingEnabled(boolean z);
}
