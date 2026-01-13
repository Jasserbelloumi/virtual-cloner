package androidx.lifecycle;

import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class o0O0o000 extends o0OOo00O.o0O0o000 {
    @o0OOOO0o.o00oOoO
    @NotNull

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final o00ooO f3352o00oo0Oo = new o00ooO();

    @Override // o0OOo00O.o0O0o000
    public boolean o0O0oOoO(@NotNull o0OO.o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "context");
        if (o0OOo00O.o0OOO00.o00oOo0O().o0O0oo().o0O0oOoO(o00oo0Var)) {
            return true;
        }
        return !this.f3352o00oo0Oo.o00oOOoO();
    }

    @Override // o0OOo00O.o0O0o000
    public void oo0oOOo(@NotNull o0OO.o00oo0 o00oo0Var, @NotNull Runnable runnable) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "context");
        o0OOOOO0.o0ooO.o00oo0O0(runnable, "block");
        this.f3352o00oo0Oo.o00oOo00(o00oo0Var, runnable);
    }
}
