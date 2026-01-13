package o0OO;

import o0OO.o00oo0;
import o0OO0o.o0OO00o0;
import o0OOOO.o0O00000;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OO00o0(version = "1.3")
/* loaded from: classes3.dex */
public interface o00oOoO extends o00oo0.o00oOOoO {
    @NotNull

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final o00oOOoO f12926o00oOo0o = o00oOOoO.f12927o00oo0O0;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public static <R> R o00oOOo0(@NotNull o00oOoO o00oooo2, R r, @NotNull o0O00000<? super R, ? super o00oo0.o00oOOoO, ? extends R> o0o00000) {
            o0ooO.o00oo0O0(o0o00000, "operation");
            return (R) o00oo0.o00oOOoO.o00oOOo0.o00oOOo0(o00oooo2, r, o0o00000);
        }

        @Nullable
        public static <E extends o00oo0.o00oOOoO> E o00oOOoO(@NotNull o00oOoO o00oooo2, @NotNull o00oo0.o00oOo00<E> o00ooo002) {
            o0ooO.o00oo0O0(o00ooo002, "key");
            if (!(o00ooo002 instanceof o0OO.o00oOOoO)) {
                if (o00oOoO.f12926o00oOo0o == o00ooo002) {
                    o0ooO.o00oo0(o00oooo2, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                    return o00oooo2;
                }
                return null;
            }
            o0OO.o00oOOoO o00ooooo2 = (o0OO.o00oOOoO) o00ooo002;
            if (o00ooooo2.o00oOOo0(o00oooo2.getKey())) {
                E e = (E) o00ooooo2.o00oOOoO(o00oooo2);
                if (e instanceof o00oo0.o00oOOoO) {
                    return e;
                }
                return null;
            }
            return null;
        }

        @NotNull
        public static o00oo0 o00oOo00(@NotNull o00oOoO o00oooo2, @NotNull o00oo0.o00oOo00<?> o00ooo002) {
            o0ooO.o00oo0O0(o00ooo002, "key");
            if (!(o00ooo002 instanceof o0OO.o00oOOoO)) {
                return o00oOoO.f12926o00oOo0o == o00ooo002 ? o00oo0O0.INSTANCE : o00oooo2;
            }
            o0OO.o00oOOoO o00ooooo2 = (o0OO.o00oOOoO) o00ooo002;
            return (!o00ooooo2.o00oOOo0(o00oooo2.getKey()) || o00ooooo2.o00oOOoO(o00oooo2) == null) ? o00oooo2 : o00oo0O0.INSTANCE;
        }

        public static void o00oOo0O(@NotNull o00oOoO o00oooo2, @NotNull o00oOo0O<?> o00ooo0o2) {
            o0ooO.o00oo0O0(o00ooo0o2, "continuation");
        }

        @NotNull
        public static o00oo0 o00oOooO(@NotNull o00oOoO o00oooo2, @NotNull o00oo0 o00oo0Var) {
            o0ooO.o00oo0O0(o00oo0Var, "context");
            return o00oo0.o00oOOoO.o00oOOo0.o00oOooO(o00oooo2, o00oo0Var);
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOOoO implements o00oo0.o00oOo00<o00oOoO> {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public static final /* synthetic */ o00oOOoO f12927o00oo0O0 = new o00oOOoO();
    }

    @Override // o0OO.o00oo0.o00oOOoO, o0OO.o00oo0
    @Nullable
    <E extends o00oo0.o00oOOoO> E get(@NotNull o00oo0.o00oOo00<E> o00ooo002);

    @Override // o0OO.o00oo0.o00oOOoO, o0OO.o00oo0
    @NotNull
    o00oo0 minusKey(@NotNull o00oo0.o00oOo00<?> o00ooo002);

    @NotNull
    <T> o00oOo0O<T> o00ooO0(@NotNull o00oOo0O<? super T> o00ooo0o2);

    void o0O0oO0(@NotNull o00oOo0O<?> o00ooo0o2);
}
