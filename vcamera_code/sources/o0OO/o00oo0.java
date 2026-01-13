package o0OO;

import o0OO.o00oOoO;
import o0OO0o.o0OO00o0;
import o0OOOO.o0O00000;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OO00o0(version = "1.3")
/* loaded from: classes3.dex */
public interface o00oo0 {

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {

        /* renamed from: o0OO.o00oo0$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0160o00oOOo0 extends o0O0OO implements o0O00000<o00oo0, o00oOOoO, o00oo0> {
            public static final C0160o00oOOo0 INSTANCE = new C0160o00oOOo0();

            public C0160o00oOOo0() {
                super(2);
            }

            @Override // o0OOOO.o0O00000
            @NotNull
            public final o00oo0 invoke(@NotNull o00oo0 o00oo0Var, @NotNull o00oOOoO o00ooooo2) {
                o0OO.o00oOo00 o00ooo002;
                o0ooO.o00oo0O0(o00oo0Var, "acc");
                o0ooO.o00oo0O0(o00ooooo2, "element");
                o00oo0 minusKey = o00oo0Var.minusKey(o00ooooo2.getKey());
                o00oo0O0 o00oo0o02 = o00oo0O0.INSTANCE;
                if (minusKey == o00oo0o02) {
                    return o00ooooo2;
                }
                o00oOoO.o00oOOoO o00ooooo3 = o00oOoO.f12926o00oOo0o;
                o00oOoO o00oooo2 = (o00oOoO) minusKey.get(o00ooooo3);
                if (o00oooo2 == null) {
                    o00ooo002 = new o0OO.o00oOo00(minusKey, o00ooooo2);
                } else {
                    o00oo0 minusKey2 = minusKey.minusKey(o00ooooo3);
                    if (minusKey2 == o00oo0o02) {
                        return new o0OO.o00oOo00(o00ooooo2, o00oooo2);
                    }
                    o00ooo002 = new o0OO.o00oOo00(new o0OO.o00oOo00(minusKey2, o00ooooo2), o00oooo2);
                }
                return o00ooo002;
            }
        }

        @NotNull
        public static o00oo0 o00oOOo0(@NotNull o00oo0 o00oo0Var, @NotNull o00oo0 o00oo0Var2) {
            o0ooO.o00oo0O0(o00oo0Var2, "context");
            return o00oo0Var2 == o00oo0O0.INSTANCE ? o00oo0Var : (o00oo0) o00oo0Var2.fold(o00oo0Var, C0160o00oOOo0.INSTANCE);
        }
    }

    /* loaded from: classes3.dex */
    public interface o00oOOoO extends o00oo0 {

        /* loaded from: classes3.dex */
        public static final class o00oOOo0 {
            public static <R> R o00oOOo0(@NotNull o00oOOoO o00ooooo2, R r, @NotNull o0O00000<? super R, ? super o00oOOoO, ? extends R> o0o00000) {
                o0ooO.o00oo0O0(o0o00000, "operation");
                return o0o00000.invoke(r, o00ooooo2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Nullable
            public static <E extends o00oOOoO> E o00oOOoO(@NotNull o00oOOoO o00ooooo2, @NotNull o00oOo00<E> o00ooo002) {
                o0ooO.o00oo0O0(o00ooo002, "key");
                if (o0ooO.o00oOoO0(o00ooooo2.getKey(), o00ooo002)) {
                    o0ooO.o00oo0(o00ooooo2, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                    return o00ooooo2;
                }
                return null;
            }

            @NotNull
            public static o00oo0 o00oOo00(@NotNull o00oOOoO o00ooooo2, @NotNull o00oOo00<?> o00ooo002) {
                o0ooO.o00oo0O0(o00ooo002, "key");
                return o0ooO.o00oOoO0(o00ooooo2.getKey(), o00ooo002) ? o00oo0O0.INSTANCE : o00ooooo2;
            }

            @NotNull
            public static o00oo0 o00oOooO(@NotNull o00oOOoO o00ooooo2, @NotNull o00oo0 o00oo0Var) {
                o0ooO.o00oo0O0(o00oo0Var, "context");
                return o00oOOo0.o00oOOo0(o00ooooo2, o00oo0Var);
            }
        }

        @Override // o0OO.o00oo0
        <R> R fold(R r, @NotNull o0O00000<? super R, ? super o00oOOoO, ? extends R> o0o00000);

        @Override // o0OO.o00oo0
        @Nullable
        <E extends o00oOOoO> E get(@NotNull o00oOo00<E> o00ooo002);

        @NotNull
        o00oOo00<?> getKey();

        @Override // o0OO.o00oo0
        @NotNull
        o00oo0 minusKey(@NotNull o00oOo00<?> o00ooo002);
    }

    /* loaded from: classes3.dex */
    public interface o00oOo00<E extends o00oOOoO> {
    }

    <R> R fold(R r, @NotNull o0O00000<? super R, ? super o00oOOoO, ? extends R> o0o00000);

    @Nullable
    <E extends o00oOOoO> E get(@NotNull o00oOo00<E> o00ooo002);

    @NotNull
    o00oo0 minusKey(@NotNull o00oOo00<?> o00ooo002);

    @NotNull
    o00oo0 plus(@NotNull o00oo0 o00oo0Var);
}
