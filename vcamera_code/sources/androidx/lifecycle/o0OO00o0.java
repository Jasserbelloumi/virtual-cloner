package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.o0O00;
import o00ooOoo.oOo000Oo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
/* loaded from: classes.dex */
public class o0OO00o0 {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O0oo0o f3377o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Handler f3378o00oOOoO;
    @Nullable

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o00oOOo0 f3379o00oOo00;

    /* loaded from: classes.dex */
    public static final class o00oOOo0 implements Runnable {
        @NotNull

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final o0O00.o00oOOo0 f3380o00oo0O;
        @NotNull

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final o0O0oo0o f3381o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public boolean f3382o00oo0Oo;

        public o00oOOo0(@NotNull o0O0oo0o o0o0oo0o, @NotNull o0O00.o00oOOo0 o00oooo02) {
            o0OOOOO0.o0ooO.o00oo0O0(o0o0oo0o, "registry");
            o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, oOo000Oo.f9217o0O00o0o);
            this.f3381o00oo0O0 = o0o0oo0o;
            this.f3380o00oo0O = o00oooo02;
        }

        @NotNull
        public final o0O00.o00oOOo0 o00oOOo0() {
            return this.f3380o00oo0O;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3382o00oo0Oo) {
                return;
            }
            this.f3381o00oo0O0.o00oOooo(this.f3380o00oo0O);
            this.f3382o00oo0Oo = true;
        }
    }

    public o0OO00o0(@NotNull o0O0O0O o0o0o0o) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o, DatabaseFileArchive.COLUMN_PROVIDER);
        this.f3377o00oOOo0 = new o0O0oo0o(o0o0o0o);
        this.f3378o00oOOoO = new Handler();
    }

    @NotNull
    public o0O00 o00oOOo0() {
        return this.f3377o00oOOo0;
    }

    public void o00oOOoO() {
        o00oOo0o(o0O00.o00oOOo0.ON_START);
    }

    public void o00oOo00() {
        o00oOo0o(o0O00.o00oOOo0.ON_CREATE);
    }

    public void o00oOo0O() {
        o00oOo0o(o0O00.o00oOOo0.ON_START);
    }

    public final void o00oOo0o(o0O00.o00oOOo0 o00oooo02) {
        o00oOOo0 o00oooo03 = this.f3379o00oOo00;
        if (o00oooo03 != null) {
            o00oooo03.run();
        }
        o00oOOo0 o00oooo04 = new o00oOOo0(this.f3377o00oOOo0, o00oooo02);
        this.f3379o00oOo00 = o00oooo04;
        Handler handler = this.f3378o00oOOoO;
        o0OOOOO0.o0ooO.o00oo00O(o00oooo04);
        handler.postAtFrontOfQueue(o00oooo04);
    }

    public void o00oOooO() {
        o00oOo0o(o0O00.o00oOOo0.ON_STOP);
        o00oOo0o(o0O00.o00oOOo0.ON_DESTROY);
    }
}
