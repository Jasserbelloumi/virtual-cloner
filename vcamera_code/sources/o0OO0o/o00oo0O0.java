package o0OO0o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@oO0Oo0oo(markerClass = {o0O000.class})
@o0OO.o00oo0O
@o0OO00o0(version = "1.7")
/* loaded from: classes.dex */
public abstract class o00oo0O0<T, R> {
    public o00oo0O0() {
    }

    public o00oo0O0(o0OOOOO0.o0O00 o0o00) {
    }

    @Nullable
    public abstract Object o00oOOoO(T t, @NotNull o0OO.o00oOo0O<? super R> o00ooo0o2);

    @Nullable
    public abstract <U, S> Object o00oOo00(@NotNull o00oo0<U, S> o00oo0Var, U u, @NotNull o0OO.o00oOo0O<? super S> o00ooo0o2);

    @o0O0o(level = o00ooO0.ERROR, message = "'invoke' should not be called from DeepRecursiveScope. Use 'callRecursive' to do recursion in the heap instead of the call stack.", replaceWith = @o0OO000(expression = "this.callRecursive(value)", imports = {}))
    @NotNull
    public final Void o00oOooO(@NotNull o00oo0<?, ?> o00oo0Var, @Nullable Object obj) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "<this>");
        throw new UnsupportedOperationException("Should not be called from DeepRecursiveScope");
    }
}
