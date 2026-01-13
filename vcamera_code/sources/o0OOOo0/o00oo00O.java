package o0OOOo0;

import java.util.Random;
import o0OO0o.o0OO00o0;
import o0OOO0OO.o00ooO0;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o00oo00O {
    @o0OO00o0(version = "1.3")
    @NotNull
    public static final Random o00oOOo0(@NotNull o00oo0 o00oo0Var) {
        Random impl;
        o0ooO.o00oo0O0(o00oo0Var, "<this>");
        o00oOOoO o00ooooo2 = o00oo0Var instanceof o00oOOoO ? (o00oOOoO) o00oo0Var : null;
        return (o00ooooo2 == null || (impl = o00ooooo2.getImpl()) == null) ? new o00oOo0O(o00oo0Var) : impl;
    }

    @o0OO00o0(version = "1.3")
    @NotNull
    public static final o00oo0 o00oOOoO(@NotNull Random random) {
        o00oo0 impl;
        o0ooO.o00oo0O0(random, "<this>");
        o00oOo0O o00ooo0o2 = random instanceof o00oOo0O ? (o00oOo0O) random : null;
        return (o00ooo0o2 == null || (impl = o00ooo0o2.getImpl()) == null) ? new o00oOoO(random) : impl;
    }

    @o0OOO0OO.o00oo00O
    public static final o00oo0 o00oOo00() {
        return o00ooO0.f13445o00oOOo0.o00oOOoO();
    }

    public static final double o00oOooO(int i, int i2) {
        return ((i << 27) + i2) / 9.007199254740992E15d;
    }
}
