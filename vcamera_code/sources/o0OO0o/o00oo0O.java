package o0OO0o;

import o0OO0o.oo0oO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes.dex */
public final class o00oo0O<T, R> extends o00oo0O0<T, R> implements o0OO.o00oOo0O<R> {
    @Nullable

    /* renamed from: o00oo0O  reason: collision with root package name */
    public Object f13186o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public o0OOOO.o0O0000O<? super o00oo0O0<?, ?>, Object, ? super o0OO.o00oOo0O<Object>, ? extends Object> f13187o00oo0O0;
    @Nullable

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public o0OO.o00oOo0O<Object> f13188o00oo0Oo;
    @NotNull

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public Object f13189o00oo0o0;

    @o0OOOOO0.o0OOO00({"SMAP\nContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Continuation.kt\nkotlin/coroutines/ContinuationKt$Continuation$1\n+ 2 DeepRecursive.kt\nkotlin/DeepRecursiveScopeImpl\n*L\n1#1,161:1\n184#2,6:162\n*E\n"})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 implements o0OO.o00oOo0O<Object> {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o00oo0O f13190o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OO.o00oo0 f13191o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o0O0000O f13192o00oo0Oo;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final /* synthetic */ o0OO.o00oOo0O f13193o00oo0o0;

        public o00oOOo0(o0OO.o00oo0 o00oo0Var, o00oo0O o00oo0o2, o0OOOO.o0O0000O o0o0000o, o0OO.o00oOo0O o00ooo0o2) {
            this.f13191o00oo0O0 = o00oo0Var;
            this.f13190o00oo0O = o00oo0o2;
            this.f13192o00oo0Oo = o0o0000o;
            this.f13193o00oo0o0 = o00ooo0o2;
        }

        @Override // o0OO.o00oOo0O
        @NotNull
        public o0OO.o00oo0 getContext() {
            return this.f13191o00oo0O0;
        }

        @Override // o0OO.o00oOo0O
        public void resumeWith(@NotNull Object obj) {
            o00oo0O o00oo0o2 = this.f13190o00oo0O;
            o00oo0o2.f13187o00oo0O0 = this.f13192o00oo0Oo;
            o00oo0o2.f13188o00oo0Oo = this.f13193o00oo0o0;
            o00oo0o2.f13189o00oo0o0 = obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00oo0O(@NotNull o0OOOO.o0O0000O<? super o00oo0O0<T, R>, ? super T, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o0000o, T t) {
        super(null);
        Object obj;
        o0OOOOO0.o0ooO.o00oo0O0(o0o0000o, "block");
        this.f13187o00oo0O0 = o0o0000o;
        this.f13186o00oo0O = t;
        o0OOOOO0.o0ooO.o00oo0(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f13188o00oo0Oo = this;
        obj = o00oo0OO.f13194o00oOOo0;
        this.f13189o00oo0o0 = obj;
    }

    @Override // o0OO.o00oOo0O
    @NotNull
    public o0OO.o00oo0 getContext() {
        return o0OO.o00oo0O0.INSTANCE;
    }

    @Override // o0OO0o.o00oo0O0
    @Nullable
    public Object o00oOOoO(T t, @NotNull o0OO.o00oOo0O<? super R> o00ooo0o2) {
        o0OOOOO0.o0ooO.o00oo0(o00ooo0o2, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f13188o00oo0Oo = o00ooo0o2;
        this.f13186o00oo0O = t;
        o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
        o0OOO0.o00oo0OO.o00oOo00(o00ooo0o2);
        return o00oooo02;
    }

    @Override // o0OO0o.o00oo0O0
    @Nullable
    public <U, S> Object o00oOo00(@NotNull o00oo0<U, S> o00oo0Var, U u, @NotNull o0OO.o00oOo0O<? super S> o00ooo0o2) {
        o0OOOO.o0O0000O<o00oo0O0<U, S>, U, o0OO.o00oOo0O<? super S>, Object> o0o0000o = o00oo0Var.f13185o00oOOo0;
        o0OOOOO0.o0ooO.o00oo0(o0o0000o, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<kotlin.DeepRecursiveScope<*, *>, kotlin.Any?, kotlin.Any?>{ kotlin.DeepRecursiveKt.DeepRecursiveFunctionBlock }");
        o0OOOO.o0O0000O<? super o00oo0O0<?, ?>, Object, ? super o0OO.o00oOo0O<Object>, ? extends Object> o0o0000o2 = this.f13187o00oo0O0;
        if (o0o0000o != o0o0000o2) {
            this.f13187o00oo0O0 = o0o0000o;
            o0OOOOO0.o0ooO.o00oo0(o00ooo0o2, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.f13188o00oo0Oo = o00oOoo0(o0o0000o2, o00ooo0o2);
        } else {
            o0OOOOO0.o0ooO.o00oo0(o00ooo0o2, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.f13188o00oo0Oo = o00ooo0o2;
        }
        this.f13186o00oo0O = u;
        o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
        o0OOO0.o00oo0OO.o00oOo00(o00ooo0o2);
        return o00oooo02;
    }

    public final o0OO.o00oOo0O<Object> o00oOoo0(o0OOOO.o0O0000O<? super o00oo0O0<?, ?>, Object, ? super o0OO.o00oOo0O<Object>, ? extends Object> o0o0000o, o0OO.o00oOo0O<Object> o00ooo0o2) {
        return new o00oOOo0(o0OO.o00oo0O0.INSTANCE, this, o0o0000o, o00ooo0o2);
    }

    public final R o00oOooo() {
        Object obj;
        Object o00oOOo02;
        while (true) {
            R r = (R) this.f13189o00oo0o0;
            o0OO.o00oOo0O<Object> o00ooo0o2 = this.f13188o00oo0Oo;
            if (o00ooo0o2 == null) {
                oo0ooO.o00oo0(r);
                return r;
            }
            obj = o00oo0OO.f13194o00oOOo0;
            if (oo0oO0.m9equalsimpl0(obj, r)) {
                try {
                    o0OOOO.o0O0000O<? super o00oo0O0<?, ?>, Object, ? super o0OO.o00oOo0O<Object>, ? extends Object> o0o0000o = this.f13187o00oo0O0;
                    Object obj2 = this.f13186o00oo0O;
                    o0OOOOO0.o0ooO.o00oo0(o0o0000o, "null cannot be cast to non-null type kotlin.Function3<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.startCoroutineUninterceptedOrReturn, P of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.startCoroutineUninterceptedOrReturn, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.startCoroutineUninterceptedOrReturn>, kotlin.Any?>");
                    o00oOOo02 = ((o0OOOO.o0O0000O) o0OOOOO0.o0OOO0OO.o00oo0O(o0o0000o, 3)).invoke(this, obj2, o00ooo0o2);
                } catch (Throwable th) {
                    oo0oO0.o00oOOo0 o00oooo02 = oo0oO0.Companion;
                    o00oOOo02 = oo0ooO.o00oOOo0(th);
                }
                if (o00oOOo02 != o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED) {
                    oo0oO0.o00oOOo0 o00oooo03 = oo0oO0.Companion;
                    r = (R) oo0oO0.m7constructorimpl(o00oOOo02);
                }
            } else {
                this.f13189o00oo0o0 = o00oo0OO.f13194o00oOOo0;
            }
            o00ooo0o2.resumeWith(r);
        }
    }

    @Override // o0OO.o00oOo0O
    public void resumeWith(@NotNull Object obj) {
        this.f13188o00oo0Oo = null;
        this.f13189o00oo0o0 = obj;
    }
}
