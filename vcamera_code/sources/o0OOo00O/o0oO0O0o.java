package o0OOo00O;

import kotlin.Metadata;
import o0OO.o00oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0007"}, d2 = {"Lo0OOo00O/o0oO0O0o;", "Lo0OOo00O/ooOOOOoo;", "", "o00oOoO", "", "exception", "o00oOo0o", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public interface o0oO0O0o extends ooOOOOoo {

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public static <R> R o00oOOoO(@NotNull o0oO0O0o o0oo0o0o, R r, @NotNull o0OOOO.o0O00000<? super R, ? super o00oo0.o00oOOoO, ? extends R> o0o00000) {
            return (R) o00oo0.o00oOOoO.o00oOOo0.o00oOOo0(o0oo0o0o, r, o0o00000);
        }

        @Nullable
        public static <E extends o00oo0.o00oOOoO> E o00oOo00(@NotNull o0oO0O0o o0oo0o0o, @NotNull o00oo0.o00oOo00<E> o00ooo002) {
            return (E) o00oo0.o00oOOoO.o00oOOo0.o00oOOoO(o0oo0o0o, o00ooo002);
        }

        @NotNull
        public static o0OO.o00oo0 o00oOo0O(@NotNull o0oO0O0o o0oo0o0o, @NotNull o0OO.o00oo0 o00oo0Var) {
            return o00oo0.o00oOOoO.o00oOOo0.o00oOooO(o0oo0o0o, o00oo0Var);
        }

        @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static ooOOOOoo o00oOo0o(@NotNull o0oO0O0o o0oo0o0o, @NotNull ooOOOOoo oooooooo) {
            return oooooooo;
        }

        @NotNull
        public static o0OO.o00oo0 o00oOooO(@NotNull o0oO0O0o o0oo0o0o, @NotNull o00oo0.o00oOo00<?> o00ooo002) {
            return o00oo0.o00oOOoO.o00oOOo0.o00oOo00(o0oo0o0o, o00ooo002);
        }
    }

    boolean o00oOo0o(@NotNull Throwable th);

    boolean o00oOoO();
}
