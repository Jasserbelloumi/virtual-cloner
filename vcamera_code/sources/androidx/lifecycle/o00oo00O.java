package androidx.lifecycle;

import java.io.Closeable;
import o0OOo00O.oO00O0o0;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class o00oo00O implements Closeable, o0OOo00O.o0O0oo00 {
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0OO.o00oo0 f3299o00oo0O0;

    public o00oo00O(@NotNull o0OO.o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "context");
        this.f3299o00oo0O0 = o00oo0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        oO00O0o0.o00oOoOO(this.f3299o00oo0O0, null, 1, null);
    }

    @Override // o0OOo00O.o0O0oo00
    @NotNull
    public o0OO.o00oo0 o0O000O() {
        return this.f3299o00oo0O0;
    }
}
