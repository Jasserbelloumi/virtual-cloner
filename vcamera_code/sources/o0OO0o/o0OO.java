package o0OO0o;

import java.util.List;
import org.jetbrains.annotations.NotNull;
@o0OOOO0o.o00oo0OO(name = "TuplesKt")
/* loaded from: classes.dex */
public final class o0OO {
    @NotNull
    public static final <A, B> o0O0o00<A, B> o00oOOo0(A a, B b) {
        return new o0O0o00<>(a, b);
    }

    @NotNull
    public static final <T> List<T> o00oOOoO(@NotNull o0O0o00<? extends T, ? extends T> o0o0o00) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o00, "<this>");
        return o0OO0oO.o0O00O0o.o00ooo0O(o0o0o00.getFirst(), o0o0o00.getSecond());
    }

    @NotNull
    public static final <T> List<T> o00oOo00(@NotNull o0OO0oO<? extends T, ? extends T, ? extends T> o0oo0oo) {
        o0OOOOO0.o0ooO.o00oo0O0(o0oo0oo, "<this>");
        return o0OO0oO.o0O00O0o.o00ooo0O(o0oo0oo.getFirst(), o0oo0oo.getSecond(), o0oo0oo.getThird());
    }
}
