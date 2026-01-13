package o0O0OOO;

import android.database.Cursor;
import android.support.v4.media.o00oOo0O;
import androidx.paging.PositionalDataSource;
import androidx.room.o00oOo00;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O0OO.o0O00O0o;
import o0O0OO.o0O00OOO;
import o0O0OOoO.o0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class o00oOOo0<T> extends PositionalDataSource<T> {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O00OOO f11465o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final String f11466o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final String f11467o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final o00oOo00.AbstractC0046o00oOo00 f11468o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final boolean f11469o00oOo0o;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final o0O00O0o f11470o00oOooO;

    /* renamed from: o0O0OOO.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0150o00oOOo0 extends o00oOo00.AbstractC0046o00oOo00 {
        public C0150o00oOOo0(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.o00oOo00.AbstractC0046o00oOo00
        public void o00oOOoO(@oo0oO0 Set<String> set) {
            o00oOOo0.this.invalidate();
        }
    }

    public o00oOOo0(o0O00O0o o0o00o0o, o0O00OOO o0o00ooo, boolean z, String... strArr) {
        this.f11470o00oOooO = o0o00o0o;
        this.f11465o00oOOo0 = o0o00ooo;
        this.f11469o00oOo0o = z;
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("SELECT COUNT(*) FROM ( ");
        o00oOOo02.append(o0o00ooo.o00oOOoO());
        o00oOOo02.append(" )");
        this.f11466o00oOOoO = o00oOOo02.toString();
        StringBuilder o00oOOo03 = o00oOo0O.o00oOOo0("SELECT * FROM ( ");
        o00oOOo03.append(o0o00ooo.o00oOOoO());
        o00oOOo03.append(" ) LIMIT ? OFFSET ?");
        this.f11467o00oOo00 = o00oOOo03.toString();
        C0150o00oOOo0 c0150o00oOOo0 = new C0150o00oOOo0(strArr);
        this.f11468o00oOo0O = c0150o00oOOo0;
        o0o00o0o.o00oOooo().o00oOOoO(c0150o00oOOo0);
    }

    public o00oOOo0(o0O00O0o o0o00o0o, o0 o0Var, boolean z, String... strArr) {
        this(o0o00o0o, o0O00OOO.o00oOoO(o0Var), z, strArr);
    }

    public abstract List<T> o00oOOo0(Cursor cursor);

    public int o00oOOoO() {
        o0O00OOO o00oOo0o2 = o0O00OOO.o00oOo0o(this.f11466o00oOOoO, this.f11465o00oOOo0.o00oOOo0());
        o00oOo0o2.o00oOoO0(this.f11465o00oOOo0);
        Cursor o00oo2 = this.f11470o00oOooO.o00oo(o00oOo0o2);
        try {
            if (o00oo2.moveToFirst()) {
                return o00oo2.getInt(0);
            }
            return 0;
        } finally {
            o00oo2.close();
            o00oOo0o2.release();
        }
    }

    public final o0O00OOO o00oOo00(int i, int i2) {
        o0O00OOO o00oOo0o2 = o0O00OOO.o00oOo0o(this.f11467o00oOo00, this.f11465o00oOOo0.o00oOOo0() + 2);
        o00oOo0o2.o00oOoO0(this.f11465o00oOOo0);
        o00oOo0o2.o0O0OOOo(o00oOo0o2.o00oOOo0() - 1, i2);
        o00oOo0o2.o0O0OOOo(o00oOo0o2.o00oOOo0(), i);
        return o00oOo0o2;
    }

    public void o00oOo0O(@oo0oO0 PositionalDataSource.LoadInitialParams loadInitialParams, @oo0oO0 PositionalDataSource.LoadInitialCallback<T> loadInitialCallback) {
        o0O00OOO o0o00ooo;
        int i;
        o0O00OOO o0o00ooo2;
        List<T> emptyList = Collections.emptyList();
        this.f11470o00oOooO.o00oOo00();
        Cursor cursor = null;
        try {
            int o00oOOoO2 = o00oOOoO();
            if (o00oOOoO2 != 0) {
                int computeInitialLoadPosition = computeInitialLoadPosition(loadInitialParams, o00oOOoO2);
                o0o00ooo = o00oOo00(computeInitialLoadPosition, computeInitialLoadSize(loadInitialParams, computeInitialLoadPosition, o00oOOoO2));
                try {
                    cursor = this.f11470o00oOooO.o00oo(o0o00ooo);
                    List<T> o00oOOo02 = o00oOOo0(cursor);
                    this.f11470o00oOooO.o00ooO0o();
                    o0o00ooo2 = o0o00ooo;
                    i = computeInitialLoadPosition;
                    emptyList = o00oOOo02;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    this.f11470o00oOooO.o00oOoOO();
                    if (o0o00ooo != null) {
                        o0o00ooo.release();
                    }
                    throw th;
                }
            } else {
                i = 0;
                o0o00ooo2 = null;
            }
            if (cursor != null) {
                cursor.close();
            }
            this.f11470o00oOooO.o00oOoOO();
            if (o0o00ooo2 != null) {
                o0o00ooo2.release();
            }
            loadInitialCallback.onResult(emptyList, i, o00oOOoO2);
        } catch (Throwable th2) {
            th = th2;
            o0o00ooo = null;
        }
    }

    @oo0oO0
    public List<T> o00oOo0o(int i, int i2) {
        List<T> o00oOOo02;
        o0O00OOO o00oOo002 = o00oOo00(i, i2);
        if (this.f11469o00oOo0o) {
            this.f11470o00oOooO.o00oOo00();
            Cursor cursor = null;
            try {
                cursor = this.f11470o00oOooO.o00oo(o00oOo002);
                o00oOOo02 = o00oOOo0(cursor);
                this.f11470o00oOooO.o00ooO0o();
                if (cursor != null) {
                    cursor.close();
                }
                this.f11470o00oOooO.o00oOoOO();
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                this.f11470o00oOooO.o00oOoOO();
                o00oOo002.release();
                throw th;
            }
        } else {
            Cursor o00oo2 = this.f11470o00oOooO.o00oo(o00oOo002);
            try {
                o00oOOo02 = o00oOOo0(o00oo2);
                o00oo2.close();
            } catch (Throwable th2) {
                o00oo2.close();
                o00oOo002.release();
                throw th2;
            }
        }
        o00oOo002.release();
        return o00oOOo02;
    }

    public void o00oOoO0(@oo0oO0 PositionalDataSource.LoadRangeParams loadRangeParams, @oo0oO0 PositionalDataSource.LoadRangeCallback<T> loadRangeCallback) {
        loadRangeCallback.onResult(o00oOo0o(loadRangeParams.startPosition, loadRangeParams.loadSize));
    }

    public boolean o00oOooO() {
        this.f11470o00oOooO.o00oOooo().o00oOoOo();
        return super.isInvalid();
    }
}
