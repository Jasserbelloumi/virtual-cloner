package androidx.lifecycle;

import java.time.Duration;
import o0OO0o.oO0Ooooo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes.dex */
public final class o0O0o {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final long f3350o00oOOo0 = 5000;

    @o0OOO0.o00oo00O(c = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2", f = "CoroutineLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends o0OOO0.o0 implements o0OOOO.o0O00000<o0OOo00O.o0O0oo00, o0OO.o00oOo0O<? super o0>, Object> {
        public final /* synthetic */ LiveData<T> $source;
        public final /* synthetic */ o0O0OOO0<T> $this_addDisposableSource;
        public int label;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* renamed from: androidx.lifecycle.o0O0o$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0029o00oOOo0<T> extends o0OOOOO0.o0O0OO implements o0OOOO.o00oo<T, oO0Ooooo> {
            public final /* synthetic */ o0O0OOO0<T> $this_addDisposableSource;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0029o00oOOo0(o0O0OOO0<T> o0o0ooo0) {
                super(1);
                this.$this_addDisposableSource = o0o0ooo0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o0OOOO.o00oo
            public /* bridge */ /* synthetic */ oO0Ooooo invoke(Object obj) {
                invoke2((C0029o00oOOo0<T>) obj);
                return oO0Ooooo.f13240o00oOOo0;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(T t) {
                this.$this_addDisposableSource.o00oo0Oo(t);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(o0O0OOO0<T> o0o0ooo0, LiveData<T> liveData, o0OO.o00oOo0O<? super o00oOOo0> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$this_addDisposableSource = o0o0ooo0;
            this.$source = liveData;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            return new o00oOOo0(this.$this_addDisposableSource, this.$source, o00ooo0o2);
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(@NotNull o0OOo00O.o0O0oo00 o0o0oo00, @Nullable o0OO.o00oOo0O<? super o0> o00ooo0o2) {
            return ((o00oOOo0) create(o0o0oo00, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                o0OO0o.oo0ooO.o00oo0(obj);
                o0O0OOO0<T> o0o0ooo0 = this.$this_addDisposableSource;
                o0o0ooo0.o00oo0o0(this.$source, new o00oOOoO(new C0029o00oOOo0(o0o0ooo0)));
                return new o0(this.$source, this.$this_addDisposableSource);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOOoO implements o0OooO0, o0OOOOO0.o0oO0Ooo {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o00oo f3351o00oOOo0;

        public o00oOOoO(o0OOOO.o00oo o00ooVar) {
            o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "function");
            this.f3351o00oOOo0 = o00ooVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof o0OooO0) && (obj instanceof o0OOOOO0.o0oO0Ooo)) {
                return o0OOOOO0.o0ooO.o00oOoO0(this.f3351o00oOOo0, ((o0OOOOO0.o0oO0Ooo) obj).o00oOOo0());
            }
            return false;
        }

        public final int hashCode() {
            return this.f3351o00oOOo0.hashCode();
        }

        @Override // o0OOOOO0.o0oO0Ooo
        @NotNull
        public final o0OO0o.o0O000o0<?> o00oOOo0() {
            return this.f3351o00oOOo0;
        }

        @Override // androidx.lifecycle.o0OooO0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f3351o00oOOo0.invoke(obj);
        }
    }

    @Nullable
    public static final <T> Object o00oOOo0(@NotNull o0O0OOO0<T> o0o0ooo0, @NotNull LiveData<T> liveData, @NotNull o0OO.o00oOo0O<? super o0> o00ooo0o2) {
        return o0OOo00O.o0O00000.o00oOoO0(o0OOo00O.o0OOO00.o00oOo0O().o0O0oo(), new o00oOOo0(o0o0ooo0, liveData, null), o00ooo0o2);
    }

    @NotNull
    public static final <T> LiveData<T> o00oOOoO(@NotNull o0OO.o00oo0 o00oo0Var, long j, @NotNull o0OOOO.o0O00000<? super o0O0OO0<T>, ? super o0OO.o00oOo0O<? super oO0Ooooo>, ? extends Object> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "context");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "block");
        return new o00oo0O(o00oo0Var, j, o0o00000);
    }

    @o00oOooO.o0OOooO0(26)
    @NotNull
    public static final <T> LiveData<T> o00oOo00(@NotNull o0OO.o00oo0 o00oo0Var, @NotNull Duration duration, @NotNull o0OOOO.o0O00000<? super o0O0OO0<T>, ? super o0OO.o00oOo0O<? super oO0Ooooo>, ? extends Object> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "context");
        o0OOOOO0.o0ooO.o00oo0O0(duration, "timeout");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "block");
        return new o00oo0O(o00oo0Var, o00oOo00.f3280o00oOOo0.o00oOOo0(duration), o0o00000);
    }

    public static /* synthetic */ LiveData o00oOo0O(o0OO.o00oo0 o00oo0Var, Duration duration, o0OOOO.o0O00000 o0o00000, int i, Object obj) {
        if ((i & 1) != 0) {
            o00oo0Var = o0OO.o00oo0O0.INSTANCE;
        }
        return o00oOo00(o00oo0Var, duration, o0o00000);
    }

    public static /* synthetic */ LiveData o00oOooO(o0OO.o00oo0 o00oo0Var, long j, o0OOOO.o0O00000 o0o00000, int i, Object obj) {
        if ((i & 1) != 0) {
            o00oo0Var = o0OO.o00oo0O0.INSTANCE;
        }
        if ((i & 2) != 0) {
            j = 5000;
        }
        return o00oOOoO(o00oo0Var, j, o0o00000);
    }
}
