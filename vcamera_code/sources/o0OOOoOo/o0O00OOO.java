package o0OOOoOo;

import o0OO0o.oO0Ooooo;
import o0OOOO.o00oOOo0;
import o0OOOO0o.o00oo0OO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@o00oo0OO(name = "TimingKt")
/* loaded from: classes3.dex */
public final class o0O00OOO {
    public static final long o00oOOo0(@NotNull o00oOOo0<oO0Ooooo> o00oooo02) {
        o0ooO.o00oo0O0(o00oooo02, "block");
        long nanoTime = System.nanoTime();
        o00oooo02.invoke();
        return System.nanoTime() - nanoTime;
    }

    public static final long o00oOOoO(@NotNull o00oOOo0<oO0Ooooo> o00oooo02) {
        o0ooO.o00oo0O0(o00oooo02, "block");
        long currentTimeMillis = System.currentTimeMillis();
        o00oooo02.invoke();
        return System.currentTimeMillis() - currentTimeMillis;
    }
}
