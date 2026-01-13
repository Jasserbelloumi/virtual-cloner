package o0OO;

import o0OO0o.o0O0O0o0;
import o0OO0o.o0OO00o0;
import o0OO0o.oO0Ooooo;
import o0OO0o.oo0oO0;
import o0OO0o.oo0ooO;
import o0OOOO.o00oo;
import o0OOOO.o0O00000;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o00oo00O {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @o0OOO00({"SMAP\nContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Continuation.kt\nkotlin/coroutines/ContinuationKt$Continuation$1\n*L\n1#1,161:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0<T> implements o00oOo0O<T> {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o00oo<oo0oO0<? extends T>, oO0Ooooo> f12928o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o00oo0 f12929o00oo0O0;

        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOo0(o00oo0 o00oo0Var, o00oo<? super oo0oO0<? extends T>, oO0Ooooo> o00ooVar) {
            this.f12929o00oo0O0 = o00oo0Var;
            this.f12928o00oo0O = o00ooVar;
        }

        @Override // o0OO.o00oOo0O
        @NotNull
        public o00oo0 getContext() {
            return this.f12929o00oo0O0;
        }

        @Override // o0OO.o00oOo0O
        public void resumeWith(@NotNull Object obj) {
            this.f12928o00oo0O.invoke(oo0oO0.m6boximpl(obj));
        }
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.3")
    public static final <T> o00oOo0O<T> o00oOOo0(o00oo0 o00oo0Var, o00oo<? super oo0oO0<? extends T>, oO0Ooooo> o00ooVar) {
        o0ooO.o00oo0O0(o00oo0Var, "context");
        o0ooO.o00oo0O0(o00ooVar, "resumeWith");
        return new o00oOOo0(o00oo0Var, o00ooVar);
    }

    @o0OO00o0(version = "1.3")
    @NotNull
    public static final <T> o00oOo0O<oO0Ooooo> o00oOOoO(@NotNull o00oo<? super o00oOo0O<? super T>, ? extends Object> o00ooVar, @NotNull o00oOo0O<? super T> o00ooo0o2) {
        o0ooO.o00oo0O0(o00ooVar, "<this>");
        o0ooO.o00oo0O0(o00ooo0o2, "completion");
        return new o0O0o(o0OOO00o.o00oOo00.o00oOooO(o0OOO00o.o00oOo00.o00oOOoO(o00ooVar, o00ooo0o2)), o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED);
    }

    @o0OO00o0(version = "1.3")
    @NotNull
    public static final <R, T> o00oOo0O<oO0Ooooo> o00oOo00(@NotNull o0O00000<? super R, ? super o00oOo0O<? super T>, ? extends Object> o0o00000, R r, @NotNull o00oOo0O<? super T> o00ooo0o2) {
        o0ooO.o00oo0O0(o0o00000, "<this>");
        o0ooO.o00oo0O0(o00ooo0o2, "completion");
        return new o0O0o(o0OOO00o.o00oOo00.o00oOooO(o0OOO00o.o00oOo00.o00oOo00(o0o00000, r, o00ooo0o2)), o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED);
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.3")
    public static /* synthetic */ void o00oOo0O() {
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.3")
    public static final <T> void o00oOo0o(o00oOo0O<? super T> o00ooo0o2, T t) {
        o0ooO.o00oo0O0(o00ooo0o2, "<this>");
        oo0oO0.o00oOOo0 o00oooo02 = oo0oO0.Companion;
        o00ooo0o2.resumeWith(oo0oO0.m7constructorimpl(t));
    }

    @o0OO00o0(version = "1.3")
    public static final <T> void o00oOoO(@NotNull o00oo<? super o00oOo0O<? super T>, ? extends Object> o00ooVar, @NotNull o00oOo0O<? super T> o00ooo0o2) {
        o0ooO.o00oo0O0(o00ooVar, "<this>");
        o0ooO.o00oo0O0(o00ooo0o2, "completion");
        o00oOo0O o00oOooO2 = o0OOO00o.o00oOo00.o00oOooO(o0OOO00o.o00oOo00.o00oOOoO(o00ooVar, o00ooo0o2));
        oo0oO0.o00oOOo0 o00oooo02 = oo0oO0.Companion;
        o00oOooO2.resumeWith(oo0oO0.m7constructorimpl(oO0Ooooo.f13240o00oOOo0));
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.3")
    public static final <T> void o00oOoO0(o00oOo0O<? super T> o00ooo0o2, Throwable th) {
        o0ooO.o00oo0O0(o00ooo0o2, "<this>");
        o0ooO.o00oo0O0(th, "exception");
        oo0oO0.o00oOOo0 o00oooo02 = oo0oO0.Companion;
        o00ooo0o2.resumeWith(oo0oO0.m7constructorimpl(oo0ooO.o00oOOo0(th)));
    }

    @o0OO00o0(version = "1.3")
    public static final <R, T> void o00oOoOO(@NotNull o0O00000<? super R, ? super o00oOo0O<? super T>, ? extends Object> o0o00000, R r, @NotNull o00oOo0O<? super T> o00ooo0o2) {
        o0ooO.o00oo0O0(o0o00000, "<this>");
        o0ooO.o00oo0O0(o00ooo0o2, "completion");
        o00oOo0O o00oOooO2 = o0OOO00o.o00oOo00.o00oOooO(o0OOO00o.o00oOo00.o00oOo00(o0o00000, r, o00ooo0o2));
        oo0oO0.o00oOOo0 o00oooo02 = oo0oO0.Companion;
        o00oOooO2.resumeWith(oo0oO0.m7constructorimpl(oO0Ooooo.f13240o00oOOo0));
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.3")
    public static final <T> Object o00oOoOo(o00oo<? super o00oOo0O<? super T>, oO0Ooooo> o00ooVar, o00oOo0O<? super T> o00ooo0o2) {
        o0O0o o0o0o = new o0O0o(o0OOO00o.o00oOo00.o00oOooO(o00ooo0o2));
        o00ooVar.invoke(o0o0o);
        Object o00oOOoO2 = o0o0o.o00oOOoO();
        if (o00oOOoO2 == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED) {
            o0OOO0.o00oo0OO.o00oOo00(o00ooo0o2);
        }
        return o00oOOoO2;
    }

    public static final o00oo0 o00oOooO() {
        throw new o0O0O0o0("Implemented as intrinsic");
    }
}
