package o0OOo00O;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OO.o00oo0;
import o0OOo0oo.oO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0013\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00028\u0000H'¢\u0006\u0004\b\u0005\u0010\u0006J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H'R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lo0OOo00O/o0OoOoO;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo00O/ooOOOOoo;", "o00oOoo0", "(Lo0OO/o00oOo0O;)Ljava/lang/Object;", "o00oOooo", "()Ljava/lang/Object;", "", "o00ooO0o", "Lo0OOo0oo/oO;", "o0O0O0Oo", "()Lo0OOo0oo/oO;", "onAwait", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public interface o0OoOoO<T> extends ooOOOOoo {

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public static <T, R> R o00oOOoO(@NotNull o0OoOoO<? extends T> o0ooooo, R r, @NotNull o0OOOO.o0O00000<? super R, ? super o00oo0.o00oOOoO, ? extends R> o0o00000) {
            return (R) o00oo0.o00oOOoO.o00oOOo0.o00oOOo0(o0ooooo, r, o0o00000);
        }

        @Nullable
        public static <T, E extends o00oo0.o00oOOoO> E o00oOo00(@NotNull o0OoOoO<? extends T> o0ooooo, @NotNull o00oo0.o00oOo00<E> o00ooo002) {
            return (E) o00oo0.o00oOOoO.o00oOOo0.o00oOOoO(o0ooooo, o00ooo002);
        }

        @NotNull
        public static <T> o0OO.o00oo0 o00oOo0O(@NotNull o0OoOoO<? extends T> o0ooooo, @NotNull o0OO.o00oo0 o00oo0Var) {
            return o00oo0.o00oOOoO.o00oOOo0.o00oOooO(o0ooooo, o00oo0Var);
        }

        @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static <T> ooOOOOoo o00oOo0o(@NotNull o0OoOoO<? extends T> o0ooooo, @NotNull ooOOOOoo oooooooo) {
            return oooooooo;
        }

        @NotNull
        public static <T> o0OO.o00oo0 o00oOooO(@NotNull o0OoOoO<? extends T> o0ooooo, @NotNull o00oo0.o00oOo00<?> o00ooo002) {
            return o00oo0.o00oOOoO.o00oOOo0.o00oOo00(o0ooooo, o00ooo002);
        }
    }

    @Nullable
    Object o00oOoo0(@NotNull o00oOo0O<? super T> o00ooo0o2);

    @oO0000Oo
    T o00oOooo();

    @oO0000Oo
    @Nullable
    Throwable o00ooO0o();

    @NotNull
    oO<T> o0O0O0Oo();
}
