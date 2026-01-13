package o0O0OOo;

import android.os.Bundle;
import androidx.lifecycle.o0O00;
import androidx.savedstate.Recreator;
import o00oOooO.o0O;
import o0OOOO0o.o00ooO0;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes.dex */
public final class o00oOo00 {
    @NotNull

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final o00oOOo0 f11514o00oOooO = new o00oOOo0(null);
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o00oOo0O f11515o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final androidx.savedstate.o00oOOo0 f11516o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public boolean f11517o00oOo00;

    /* loaded from: classes.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }

        @o00ooO0
        @NotNull
        public final o00oOo00 o00oOOo0(@NotNull o00oOo0O o00ooo0o2) {
            o0ooO.o00oo0O0(o00ooo0o2, "owner");
            return new o00oOo00(o00ooo0o2);
        }
    }

    public o00oOo00(o00oOo0O o00ooo0o2) {
        this.f11515o00oOOo0 = o00ooo0o2;
        this.f11516o00oOOoO = new androidx.savedstate.o00oOOo0();
    }

    public /* synthetic */ o00oOo00(o00oOo0O o00ooo0o2, o0O00 o0o00) {
        this(o00ooo0o2);
    }

    @o00ooO0
    @NotNull
    public static final o00oOo00 o00oOOo0(@NotNull o00oOo0O o00ooo0o2) {
        return f11514o00oOooO.o00oOOo0(o00ooo0o2);
    }

    @NotNull
    public final androidx.savedstate.o00oOOo0 o00oOOoO() {
        return this.f11516o00oOOoO;
    }

    @o0O
    public final void o00oOo00() {
        androidx.lifecycle.o0O00 lifecycle = this.f11515o00oOOo0.getLifecycle();
        if (!(lifecycle.o00oOOoO() == o0O00.o00oOOoO.INITIALIZED)) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        lifecycle.o00oOOo0(new Recreator(this.f11515o00oOOo0));
        this.f11516o00oOOoO.o00oOoO0(lifecycle);
        this.f11517o00oOo00 = true;
    }

    @o0O
    public final void o00oOo0O(@NotNull Bundle bundle) {
        o0ooO.o00oo0O0(bundle, "outBundle");
        this.f11516o00oOOoO.o00oOoOO(bundle);
    }

    @o0O
    public final void o00oOooO(@Nullable Bundle bundle) {
        if (!this.f11517o00oOo00) {
            o00oOo00();
        }
        androidx.lifecycle.o0O00 lifecycle = this.f11515o00oOOo0.getLifecycle();
        if (!lifecycle.o00oOOoO().isAtLeast(o0O00.o00oOOoO.STARTED)) {
            this.f11516o00oOOoO.o00oOoO(bundle);
            return;
        }
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("performRestore cannot be called when owner is ");
        o00oOOo02.append(lifecycle.o00oOOoO());
        throw new IllegalStateException(o00oOOo02.toString().toString());
    }
}
