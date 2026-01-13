package androidx.lifecycle;

import androidx.lifecycle.o0O00;
import com.google.firebase.analytics.FirebaseAnalytics;
import o00ooOoo.oOo000Oo;
import o0OO0o.oO0Ooooo;
import o0OOo00O.oO00O0o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends o0O00O0o implements o0O00OOO {
    @NotNull

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o0OO.o00oo0 f3227o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0O00 f3228o00oo0O0;

    @o0OOO0.o00oo00O(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends o0OOO0.o0 implements o0OOOO.o0O00000<o0OOo00O.o0O0oo00, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        private /* synthetic */ Object L$0;
        public int label;

        public o00oOOo0(o0OO.o00oOo0O<? super o00oOOo0> o00ooo0o2) {
            super(2, o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o00oOOo0 o00oooo02 = new o00oOOo0(o00ooo0o2);
            o00oooo02.L$0 = obj;
            return o00oooo02;
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(@NotNull o0OOo00O.o0O0oo00 o0o0oo00, @Nullable o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o00oOOo0) create(o0o0oo00, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                o0OO0o.oo0ooO.o00oo0(obj);
                o0OOo00O.o0O0oo00 o0o0oo00 = (o0OOo00O.o0O0oo00) this.L$0;
                if (LifecycleCoroutineScopeImpl.this.f3228o00oo0O0.o00oOOoO().compareTo(o0O00.o00oOOoO.INITIALIZED) >= 0) {
                    LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = LifecycleCoroutineScopeImpl.this;
                    lifecycleCoroutineScopeImpl.f3228o00oo0O0.o00oOOo0(lifecycleCoroutineScopeImpl);
                } else {
                    oO00O0o0.o00oOoOO(o0o0oo00.o0O000O(), null, 1, null);
                }
                return oO0Ooooo.f13240o00oOOo0;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public LifecycleCoroutineScopeImpl(@NotNull o0O00 o0o00, @NotNull o0OO.o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00, "lifecycle");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "coroutineContext");
        this.f3228o00oo0O0 = o0o00;
        this.f3227o00oo0O = o00oo0Var;
        if (o0o00.o00oOOoO() == o0O00.o00oOOoO.DESTROYED) {
            oO00O0o0.o00oOoOO(o00oo0Var, null, 1, null);
        }
    }

    @Override // androidx.lifecycle.o0O00OOO
    public void o00oOOoO(@NotNull o0O0O0O o0o0o0o, @NotNull o0O00.o00oOOo0 o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o, FirebaseAnalytics.Param.SOURCE);
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, oOo000Oo.f9217o0O00o0o);
        if (this.f3228o00oo0O0.o00oOOoO().compareTo(o0O00.o00oOOoO.DESTROYED) <= 0) {
            this.f3228o00oo0O0.o00oOooO(this);
            oO00O0o0.o00oOoOO(this.f3227o00oo0O, null, 1, null);
        }
    }

    @Override // androidx.lifecycle.o0O00O0o
    @NotNull
    public o0O00 o00oOo00() {
        return this.f3228o00oo0O0;
    }

    public final void o00oo00O() {
        o0OOo00O.o0O00000.o00oOo0o(this, o0OOo00O.o0OOO00.o00oOo0O().o0O0oo(), null, new o00oOOo0(null), 2, null);
    }

    @Override // o0OOo00O.o0O0oo00
    @NotNull
    public o0OO.o00oo0 o0O000O() {
        return this.f3227o00oo0O;
    }
}
