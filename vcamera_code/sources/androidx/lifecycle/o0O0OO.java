package androidx.lifecycle;

import android.annotation.SuppressLint;
import o0OO0o.oO0Ooooo;
import o0OOo00O.o0OOO0OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* loaded from: classes.dex */
public final class o0O0OO<T> implements o0O0OO0<T> {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public o00oo0O<T> f3343o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0OO.o00oo0 f3344o00oOOoO;

    @o0OOO0.o00oo00O(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends o0OOO0.o0 implements o0OOOO.o0O00000<o0OOo00O.o0O0oo00, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ T $value;
        public int label;
        public final /* synthetic */ o0O0OO<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(o0O0OO<T> o0o0oo, T t, o0OO.o00oOo0O<? super o00oOOo0> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.this$0 = o0o0oo;
            this.$value = t;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            return new o00oOOo0(this.this$0, this.$value, o00ooo0o2);
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ Object invoke(o0OOo00O.o0O0oo00 o0o0oo00, o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return invoke2(o0o0oo00, o00ooo0o2);
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull o0OOo00O.o0O0oo00 o0o0oo00, @Nullable o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o00oOOo0) create(o0o0oo00, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o0OO0o.oo0ooO.o00oo0(obj);
                o00oo0O<T> o00oo0o2 = this.this$0.f3343o00oOOo0;
                this.label = 1;
                if (o00oo0o2.o0O0o(this) == o00oooo02) {
                    return o00oooo02;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                o0OO0o.oo0ooO.o00oo0(obj);
            }
            this.this$0.f3343o00oOOo0.o00oo0Oo(this.$value);
            return oO0Ooooo.f13240o00oOOo0;
        }
    }

    @o0OOO0.o00oo00O(c = "androidx.lifecycle.LiveDataScopeImpl$emitSource$2", f = "CoroutineLiveData.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class o00oOOoO extends o0OOO0.o0 implements o0OOOO.o0O00000<o0OOo00O.o0O0oo00, o0OO.o00oOo0O<? super o0OOO0OO>, Object> {
        public final /* synthetic */ LiveData<T> $source;
        public int label;
        public final /* synthetic */ o0O0OO<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOoO(o0O0OO<T> o0o0oo, LiveData<T> liveData, o0OO.o00oOo0O<? super o00oOOoO> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.this$0 = o0o0oo;
            this.$source = liveData;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            return new o00oOOoO(this.this$0, this.$source, o00ooo0o2);
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ Object invoke(o0OOo00O.o0O0oo00 o0o0oo00, o0OO.o00oOo0O<? super o0OOO0OO> o00ooo0o2) {
            return invoke2(o0o0oo00, o00ooo0o2);
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull o0OOo00O.o0O0oo00 o0o0oo00, @Nullable o0OO.o00oOo0O<? super o0OOO0OO> o00ooo0o2) {
            return ((o00oOOoO) create(o0o0oo00, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o0OO0o.oo0ooO.o00oo0(obj);
                o00oo0O<T> o00oo0o2 = this.this$0.f3343o00oOOo0;
                LiveData<T> liveData = this.$source;
                this.label = 1;
                obj = o00oo0o2.o00oo(liveData, this);
                if (obj == o00oooo02) {
                    return o00oooo02;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                o0OO0o.oo0ooO.o00oo0(obj);
            }
            return obj;
        }
    }

    public o0O0OO(@NotNull o00oo0O<T> o00oo0o2, @NotNull o0OO.o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0o2, o0O0Oo.o0O0OOO.f11641o00ooO0O);
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "context");
        this.f3343o00oOOo0 = o00oo0o2;
        this.f3344o00oOOoO = o00oo0Var.plus(o0OOo00O.o0OOO00.o00oOo0O().o0O0oo());
    }

    @Override // androidx.lifecycle.o0O0OO0
    @SuppressLint({"NullSafeMutableLiveData"})
    @Nullable
    public Object emit(T t, @NotNull o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
        Object o00oOoO02 = o0OOo00O.o0O00000.o00oOoO0(this.f3344o00oOOoO, new o00oOOo0(this, t, null), o00ooo0o2);
        return o00oOoO02 == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED ? o00oOoO02 : oO0Ooooo.f13240o00oOOo0;
    }

    @Override // androidx.lifecycle.o0O0OO0
    @Nullable
    public Object o00oOOo0(@NotNull LiveData<T> liveData, @NotNull o0OO.o00oOo0O<? super o0OOO0OO> o00ooo0o2) {
        return o0OOo00O.o0O00000.o00oOoO0(this.f3344o00oOOoO, new o00oOOoO(this, liveData, null), o00ooo0o2);
    }

    @Override // androidx.lifecycle.o0O0OO0
    @Nullable
    public T o00oOOoO() {
        return this.f3343o00oOOo0.o00oOo0o();
    }

    @NotNull
    public final o00oo0O<T> o00oOo00() {
        return this.f3343o00oOOo0;
    }

    public final void o00oOooO(@NotNull o00oo0O<T> o00oo0o2) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0o2, "<set-?>");
        this.f3343o00oOOo0 = o00oo0o2;
    }
}
