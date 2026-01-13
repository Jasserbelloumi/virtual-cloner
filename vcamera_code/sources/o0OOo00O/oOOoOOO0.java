package o0OOo00O;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import o0OO.o00oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@oO0o0o
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\f\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'¨\u0006\u0005"}, d2 = {"Lo0OOo00O/oOOoOOO0;", "Lo0OOo00O/ooOOOOoo;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "o0O000oo", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "This is internal API and may be removed in the future releases")
/* loaded from: classes3.dex */
public interface oOOoOOO0 extends ooOOOOoo {

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public static <R> R o00oOOoO(@NotNull oOOoOOO0 ooooooo0, R r, @NotNull o0OOOO.o0O00000<? super R, ? super o00oo0.o00oOOoO, ? extends R> o0o00000) {
            return (R) o00oo0.o00oOOoO.o00oOOo0.o00oOOo0(ooooooo0, r, o0o00000);
        }

        @Nullable
        public static <E extends o00oo0.o00oOOoO> E o00oOo00(@NotNull oOOoOOO0 ooooooo0, @NotNull o00oo0.o00oOo00<E> o00ooo002) {
            return (E) o00oo0.o00oOOoO.o00oOOo0.o00oOOoO(ooooooo0, o00ooo002);
        }

        @NotNull
        public static o0OO.o00oo0 o00oOo0O(@NotNull oOOoOOO0 ooooooo0, @NotNull o0OO.o00oo0 o00oo0Var) {
            return o00oo0.o00oOOoO.o00oOOo0.o00oOooO(ooooooo0, o00oo0Var);
        }

        @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static ooOOOOoo o00oOo0o(@NotNull oOOoOOO0 ooooooo0, @NotNull ooOOOOoo oooooooo) {
            return oooooooo;
        }

        @NotNull
        public static o0OO.o00oo0 o00oOooO(@NotNull oOOoOOO0 ooooooo0, @NotNull o00oo0.o00oOo00<?> o00ooo002) {
            return o00oo0.o00oOOoO.o00oOOo0.o00oOo00(ooooooo0, o00ooo002);
        }
    }

    @oO0o0o
    @NotNull
    CancellationException o0O000oo();
}
