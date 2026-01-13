package o0O0OO;

import android.database.Cursor;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O0OOoO.o00ooO0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o0O00OO extends o00ooO0.o00oOOo0 {
    @o0OO00OO

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o00oOo0O f11350o00oOo00;
    @oo0oO0

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final String f11351o00oOo0O;
    @oo0oO0

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final String f11352o00oOo0o;
    @oo0oO0

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final o00oOOo0 f11353o00oOooO;

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public static abstract class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final int f11354o00oOOo0;

        public o00oOOo0(int i) {
            this.f11354o00oOOo0 = i;
        }

        public abstract void o00oOOo0(o0O0OOoO.o00oo o00ooVar);

        public abstract void o00oOOoO(o0O0OOoO.o00oo o00ooVar);

        public abstract void o00oOo00(o0O0OOoO.o00oo o00ooVar);

        public void o00oOo0O(o0O0OOoO.o00oo o00ooVar) {
        }

        public void o00oOo0o(o0O0OOoO.o00oo o00ooVar) {
        }

        @Deprecated
        public void o00oOoO(o0O0OOoO.o00oo o00ooVar) {
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }

        @oo0oO0
        public o00oOOoO o00oOoO0(@oo0oO0 o0O0OOoO.o00oo o00ooVar) {
            o00oOoO(o00ooVar);
            return new o00oOOoO(true, null);
        }

        public abstract void o00oOooO(o0O0OOoO.o00oo o00ooVar);
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public static class o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final boolean f11355o00oOOo0;
        @o0OO00OO

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final String f11356o00oOOoO;

        public o00oOOoO(boolean z, @o0OO00OO String str) {
            this.f11355o00oOOo0 = z;
            this.f11356o00oOOoO = str;
        }
    }

    public o0O00OO(@oo0oO0 o00oOo0O o00ooo0o2, @oo0oO0 o00oOOo0 o00oooo02, @oo0oO0 String str) {
        this(o00ooo0o2, o00oooo02, "", str);
    }

    public o0O00OO(@oo0oO0 o00oOo0O o00ooo0o2, @oo0oO0 o00oOOo0 o00oooo02, @oo0oO0 String str, @oo0oO0 String str2) {
        super(o00oooo02.f11354o00oOOo0);
        this.f11350o00oOo00 = o00ooo0o2;
        this.f11353o00oOooO = o00oooo02;
        this.f11351o00oOo0O = str;
        this.f11352o00oOo0o = str2;
    }

    public static boolean o00oOoOo(o0O0OOoO.o00oo o00ooVar) {
        Cursor o0O0Oo0o2 = o00ooVar.o0O0Oo0o("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (o0O0Oo0o2.moveToFirst()) {
                if (o0O0Oo0o2.getInt(0) == 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            o0O0Oo0o2.close();
        }
    }

    public static boolean o00oOoo0(o0O0OOoO.o00oo o00ooVar) {
        Cursor o0O0Oo0o2 = o00ooVar.o0O0Oo0o("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (o0O0Oo0o2.moveToFirst()) {
                if (o0O0Oo0o2.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            o0O0Oo0o2.close();
        }
    }

    @Override // o0O0OOoO.o00ooO0.o00oOOo0
    public void o00oOOoO(o0O0OOoO.o00oo o00ooVar) {
    }

    @Override // o0O0OOoO.o00ooO0.o00oOOo0
    public void o00oOo0O(o0O0OOoO.o00oo o00ooVar, int i, int i2) {
        o00oOoO0(o00ooVar, i, i2);
    }

    @Override // o0O0OOoO.o00ooO0.o00oOOo0
    public void o00oOo0o(o0O0OOoO.o00oo o00ooVar) {
        o00oOoO(o00ooVar);
        this.f11353o00oOooO.o00oOooO(o00ooVar);
        this.f11350o00oOo00 = null;
    }

    public final void o00oOoO(o0O0OOoO.o00oo o00ooVar) {
        if (!o00oOoo0(o00ooVar)) {
            o00oOOoO o00oOoO02 = this.f11353o00oOooO.o00oOoO0(o00ooVar);
            if (o00oOoO02.f11355o00oOOo0) {
                this.f11353o00oOooO.o00oOo0O(o00ooVar);
                o00oOooo(o00ooVar);
                return;
            }
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Pre-packaged database has an invalid schema: ");
            o00oOOo02.append(o00oOoO02.f11356o00oOOoO);
            throw new IllegalStateException(o00oOOo02.toString());
        }
        Cursor o0O00o0o2 = o00ooVar.o0O00o0o(new o0O0OOoO.o0O0o(o0O00O.f11317o00oOoO0, null));
        try {
            String string = o0O00o0o2.moveToFirst() ? o0O00o0o2.getString(0) : null;
            o0O00o0o2.close();
            if (!this.f11351o00oOo0O.equals(string) && !this.f11352o00oOo0o.equals(string)) {
                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
            }
        } catch (Throwable th) {
            o0O00o0o2.close();
            throw th;
        }
    }

    @Override // o0O0OOoO.o00ooO0.o00oOOo0
    public void o00oOoO0(o0O0OOoO.o00oo o00ooVar, int i, int i2) {
        boolean z;
        List<o0O0OOO0.o00oOOo0> o00oOo002;
        o00oOo0O o00ooo0o2 = this.f11350o00oOo00;
        if (o00ooo0o2 == null || (o00oOo002 = o00ooo0o2.f11301o00oOooO.o00oOo00(i, i2)) == null) {
            z = false;
        } else {
            this.f11353o00oOooO.o00oOo0o(o00ooVar);
            for (o0O0OOO0.o00oOOo0 o00oooo02 : o00oOo002) {
                o00oooo02.o00oOOo0(o00ooVar);
            }
            o00oOOoO o00oOoO02 = this.f11353o00oOooO.o00oOoO0(o00ooVar);
            if (!o00oOoO02.f11355o00oOOo0) {
                StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Migration didn't properly handle: ");
                o00oOOo02.append(o00oOoO02.f11356o00oOOoO);
                throw new IllegalStateException(o00oOOo02.toString());
            }
            this.f11353o00oOooO.o00oOo0O(o00ooVar);
            o00oOooo(o00ooVar);
            z = true;
        }
        if (z) {
            return;
        }
        o00oOo0O o00ooo0o3 = this.f11350o00oOo00;
        if (o00ooo0o3 != null && !o00ooo0o3.o00oOOo0(i, i2)) {
            this.f11353o00oOooO.o00oOOoO(o00ooVar);
            this.f11353o00oOooO.o00oOOo0(o00ooVar);
            return;
        }
        throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    public final void o00oOoOO(o0O0OOoO.o00oo o00ooVar) {
        o00ooVar.o00oo0O0(o0O00O.f11316o00oOo0o);
    }

    @Override // o0O0OOoO.o00ooO0.o00oOOo0
    public void o00oOooO(o0O0OOoO.o00oo o00ooVar) {
        boolean o00oOoOo2 = o00oOoOo(o00ooVar);
        this.f11353o00oOooO.o00oOOo0(o00ooVar);
        if (!o00oOoOo2) {
            o00oOOoO o00oOoO02 = this.f11353o00oOooO.o00oOoO0(o00ooVar);
            if (!o00oOoO02.f11355o00oOOo0) {
                StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Pre-packaged database has an invalid schema: ");
                o00oOOo02.append(o00oOoO02.f11356o00oOOoO);
                throw new IllegalStateException(o00oOOo02.toString());
            }
        }
        o00oOooo(o00ooVar);
        this.f11353o00oOooO.o00oOo00(o00ooVar);
    }

    public final void o00oOooo(o0O0OOoO.o00oo o00ooVar) {
        o00oOoOO(o00ooVar);
        o00ooVar.o00oo0O0(o0O00O.o00oOOo0(this.f11351o00oOo0O));
    }
}
