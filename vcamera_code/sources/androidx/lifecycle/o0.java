package androidx.lifecycle;

import com.google.firebase.analytics.FirebaseAnalytics;
import o0OO0o.oO0Ooooo;
import o0OOo00O.o0OOO0OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes.dex */
public final class o0 implements o0OOO0OO {
    @NotNull

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o0O0OOO0<?> f3272o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final LiveData<?> f3273o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public boolean f3274o00oo0Oo;

    @o0OOO0.o00oo00O(c = "androidx.lifecycle.EmittedSource$dispose$1", f = "CoroutineLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends o0OOO0.o0 implements o0OOOO.o0O00000<o0OOo00O.o0O0oo00, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public int label;

        public o00oOOo0(o0OO.o00oOo0O<? super o00oOOo0> o00ooo0o2) {
            super(2, o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            return new o00oOOo0(o00ooo0o2);
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
                o0.this.o00oOooO();
                return oO0Ooooo.f13240o00oOOo0;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @o0OOO0.o00oo00O(c = "androidx.lifecycle.EmittedSource$disposeNow$2", f = "CoroutineLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class o00oOOoO extends o0OOO0.o0 implements o0OOOO.o0O00000<o0OOo00O.o0O0oo00, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public int label;

        public o00oOOoO(o0OO.o00oOo0O<? super o00oOOoO> o00ooo0o2) {
            super(2, o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            return new o00oOOoO(o00ooo0o2);
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(@NotNull o0OOo00O.o0O0oo00 o0o0oo00, @Nullable o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o00oOOoO) create(o0o0oo00, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                o0OO0o.oo0ooO.o00oo0(obj);
                o0.this.o00oOooO();
                return oO0Ooooo.f13240o00oOOo0;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public o0(@NotNull LiveData<?> liveData, @NotNull o0O0OOO0<?> o0o0ooo0) {
        o0OOOOO0.o0ooO.o00oo0O0(liveData, FirebaseAnalytics.Param.SOURCE);
        o0OOOOO0.o0ooO.o00oo0O0(o0o0ooo0, "mediator");
        this.f3273o00oo0O0 = liveData;
        this.f3272o00oo0O = o0o0ooo0;
    }

    @Override // o0OOo00O.o0OOO0OO
    public void o00oOOoO() {
        o0OOo00O.o0O00000.o00oOo0o(o0OOo00O.o0O.o00oOOo0(o0OOo00O.o0OOO00.o00oOo0O().o0O0oo()), null, null, new o00oOOo0(null), 3, null);
    }

    @Nullable
    public final Object o00oOo00(@NotNull o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
        Object o00oOoO02 = o0OOo00O.o0O00000.o00oOoO0(o0OOo00O.o0OOO00.o00oOo0O().o0O0oo(), new o00oOOoO(null), o00ooo0o2);
        return o00oOoO02 == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED ? o00oOoO02 : oO0Ooooo.f13240o00oOOo0;
    }

    @o00oOooO.o0O
    public final void o00oOooO() {
        if (this.f3274o00oo0Oo) {
            return;
        }
        this.f3272o00oo0O.o00oo0o(this.f3273o00oo0O0);
        this.f3274o00oo0Oo = true;
    }
}
