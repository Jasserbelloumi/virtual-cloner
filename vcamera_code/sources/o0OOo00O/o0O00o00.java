package o0OOo00O;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import o0OO.o00oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lo0OOo00O/o0O00o00;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo00O/o0OoOoO;", "value", "", "o0O000o0", "(Ljava/lang/Object;)Z", "", "exception", "o00oOo0o", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public interface o0O00o00<T> extends o0OoOoO<T> {

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public static <T, R> R o00oOOoO(@NotNull o0O00o00<T> o0o00o00, R r, @NotNull o0OOOO.o0O00000<? super R, ? super o00oo0.o00oOOoO, ? extends R> o0o00000) {
            return (R) o00oo0.o00oOOoO.o00oOOo0.o00oOOo0(o0o00o00, r, o0o00000);
        }

        @Nullable
        public static <T, E extends o00oo0.o00oOOoO> E o00oOo00(@NotNull o0O00o00<T> o0o00o00, @NotNull o00oo0.o00oOo00<E> o00ooo002) {
            return (E) o00oo0.o00oOOoO.o00oOOo0.o00oOOoO(o0o00o00, o00ooo002);
        }

        @NotNull
        public static <T> o0OO.o00oo0 o00oOo0O(@NotNull o0O00o00<T> o0o00o00, @NotNull o0OO.o00oo0 o00oo0Var) {
            return o00oo0.o00oOOoO.o00oOOo0.o00oOooO(o0o00o00, o00oo0Var);
        }

        @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public static <T> ooOOOOoo o00oOo0o(@NotNull o0O00o00<T> o0o00o00, @NotNull ooOOOOoo oooooooo) {
            return oooooooo;
        }

        @NotNull
        public static <T> o0OO.o00oo0 o00oOooO(@NotNull o0O00o00<T> o0o00o00, @NotNull o00oo0.o00oOo00<?> o00ooo002) {
            return o00oo0.o00oOOoO.o00oOOo0.o00oOo00(o0o00o00, o00ooo002);
        }
    }

    boolean o00oOo0o(@NotNull Throwable th);

    boolean o0O000o0(T t);
}
