package o0O00oO0;

import o0O00oO0.o00oOOo0;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes.dex */
public final class o00oOoO extends o00oOOo0 {
    public o00oOoO() {
        this(null, 1, null);
    }

    public o00oOoO(@NotNull o00oOOo0 o00oooo02) {
        o0ooO.o00oo0O0(o00oooo02, "initialExtras");
        this.f11161o00oOOo0.putAll(o00oooo02.o00oOOoO());
    }

    public /* synthetic */ o00oOoO(o00oOOo0 o00oooo02, int i, o0O00 o0o00) {
        this((i & 1) != 0 ? o00oOOo0.C0143o00oOOo0.f11162o00oOOoO : o00oooo02);
    }

    @Override // o0O00oO0.o00oOOo0
    @Nullable
    public <T> T o00oOOo0(@NotNull o00oOOo0.o00oOOoO<T> o00ooooo2) {
        o0ooO.o00oo0O0(o00ooooo2, "key");
        return (T) this.f11161o00oOOo0.get(o00ooooo2);
    }

    public final <T> void o00oOo00(@NotNull o00oOOo0.o00oOOoO<T> o00ooooo2, T t) {
        o0ooO.o00oo0O0(o00ooooo2, "key");
        this.f11161o00oOOo0.put(o00ooooo2, t);
    }
}
