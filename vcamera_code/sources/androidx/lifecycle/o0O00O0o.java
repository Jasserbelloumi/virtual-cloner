package androidx.lifecycle;

import o0OO0o.oO0Ooooo;
import o0OOo00O.ooOOOOoo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes.dex */
public abstract class o0O00O0o implements o0OOo00O.o0O0oo00 {

    @o0OOO0.o00oo00O(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", f = "Lifecycle.kt", i = {}, l = {337}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends o0OOO0.o0 implements o0OOOO.o0O00000<o0OOo00O.o0O0oo00, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ o0OOOO.o0O00000<o0OOo00O.o0O0oo00, o0OO.o00oOo0O<? super oO0Ooooo>, Object> $block;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOo0(o0OOOO.o0O00000<? super o0OOo00O.o0O0oo00, ? super o0OO.o00oOo0O<? super oO0Ooooo>, ? extends Object> o0o00000, o0OO.o00oOo0O<? super o00oOOo0> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$block = o0o00000;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            return new o00oOOo0(this.$block, o00ooo0o2);
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
            int i = this.label;
            if (i == 0) {
                o0OO0o.oo0ooO.o00oo0(obj);
                o0O00 o00oOo002 = o0O00O0o.this.o00oOo00();
                o0OOOO.o0O00000<o0OOo00O.o0O0oo00, o0OO.o00oOo0O<? super oO0Ooooo>, Object> o0o00000 = this.$block;
                this.label = 1;
                if (o0O0o00.o00oOOo0(o00oOo002, o0o00000, this) == o00oooo02) {
                    return o00oooo02;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                o0OO0o.oo0ooO.o00oo0(obj);
            }
            return oO0Ooooo.f13240o00oOOo0;
        }
    }

    @o0OOO0.o00oo00O(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", f = "Lifecycle.kt", i = {}, l = {375}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class o00oOOoO extends o0OOO0.o0 implements o0OOOO.o0O00000<o0OOo00O.o0O0oo00, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ o0OOOO.o0O00000<o0OOo00O.o0O0oo00, o0OO.o00oOo0O<? super oO0Ooooo>, Object> $block;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOoO(o0OOOO.o0O00000<? super o0OOo00O.o0O0oo00, ? super o0OO.o00oOo0O<? super oO0Ooooo>, ? extends Object> o0o00000, o0OO.o00oOo0O<? super o00oOOoO> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$block = o0o00000;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            return new o00oOOoO(this.$block, o00ooo0o2);
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
            int i = this.label;
            if (i == 0) {
                o0OO0o.oo0ooO.o00oo0(obj);
                o0O00 o00oOo002 = o0O00O0o.this.o00oOo00();
                o0OOOO.o0O00000<o0OOo00O.o0O0oo00, o0OO.o00oOo0O<? super oO0Ooooo>, Object> o0o00000 = this.$block;
                this.label = 1;
                if (o0O0o00.o00oOo00(o00oOo002, o0o00000, this) == o00oooo02) {
                    return o00oooo02;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                o0OO0o.oo0ooO.o00oo0(obj);
            }
            return oO0Ooooo.f13240o00oOOo0;
        }
    }

    @o0OOO0.o00oo00O(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", f = "Lifecycle.kt", i = {}, l = {356}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class o00oOo00 extends o0OOO0.o0 implements o0OOOO.o0O00000<o0OOo00O.o0O0oo00, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ o0OOOO.o0O00000<o0OOo00O.o0O0oo00, o0OO.o00oOo0O<? super oO0Ooooo>, Object> $block;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oOo00(o0OOOO.o0O00000<? super o0OOo00O.o0O0oo00, ? super o0OO.o00oOo0O<? super oO0Ooooo>, ? extends Object> o0o00000, o0OO.o00oOo0O<? super o00oOo00> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$block = o0o00000;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            return new o00oOo00(this.$block, o00ooo0o2);
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(@NotNull o0OOo00O.o0O0oo00 o0o0oo00, @Nullable o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o00oOo00) create(o0o0oo00, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o0OO0o.oo0ooO.o00oo0(obj);
                o0O00 o00oOo002 = o0O00O0o.this.o00oOo00();
                o0OOOO.o0O00000<o0OOo00O.o0O0oo00, o0OO.o00oOo0O<? super oO0Ooooo>, Object> o0o00000 = this.$block;
                this.label = 1;
                if (o0O0o00.o00oOo0O(o00oOo002, o0o00000, this) == o00oooo02) {
                    return o00oooo02;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                o0OO0o.oo0ooO.o00oo0(obj);
            }
            return oO0Ooooo.f13240o00oOOo0;
        }
    }

    @NotNull
    public abstract o0O00 o00oOo00();

    @o0OO0o.o0O0o(message = "launchWhenResumed is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.RESUMED.")
    @NotNull
    public final ooOOOOoo o00oOoo0(@NotNull o0OOOO.o0O00000<? super o0OOo00O.o0O0oo00, ? super o0OO.o00oOo0O<? super oO0Ooooo>, ? extends Object> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "block");
        return o0OOo00O.o0O00000.o00oOo0o(this, null, null, new o00oOOoO(o0o00000, null), 3, null);
    }

    @o0OO0o.o0O0o(message = "launchWhenCreated is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.CREATED.")
    @NotNull
    public final ooOOOOoo o00oOooO(@NotNull o0OOOO.o0O00000<? super o0OOo00O.o0O0oo00, ? super o0OO.o00oOo0O<? super oO0Ooooo>, ? extends Object> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "block");
        return o0OOo00O.o0O00000.o00oOo0o(this, null, null, new o00oOOo0(o0o00000, null), 3, null);
    }

    @o0OO0o.o0O0o(message = "launchWhenStarted is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.STARTED.")
    @NotNull
    public final ooOOOOoo o00oOooo(@NotNull o0OOOO.o0O00000<? super o0OOo00O.o0O0oo00, ? super o0OO.o00oOo0O<? super oO0Ooooo>, ? extends Object> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "block");
        return o0OOo00O.o0O00000.o00oOo0o(this, null, null, new o00oOo00(o0o00000, null), 3, null);
    }
}
