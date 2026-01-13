package androidx.lifecycle;

import androidx.lifecycle.o0O00;
import o0OO0o.oO0Ooooo;
import o0OOo00O.ooOOOOoo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes.dex */
public final class o0O0o00 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @o0OOO0.o00oo00O(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", i = {0}, l = {203}, m = "invokeSuspend", n = {"controller"}, s = {"L$0"})
    /* loaded from: classes.dex */
    public static final class o00oOOo0<T> extends o0OOO0.o0 implements o0OOOO.o0O00000<o0OOo00O.o0O0oo00, o0OO.o00oOo0O<? super T>, Object> {
        public final /* synthetic */ o0OOOO.o0O00000<o0OOo00O.o0O0oo00, o0OO.o00oOo0O<? super T>, Object> $block;
        public final /* synthetic */ o0O00.o00oOOoO $minState;
        public final /* synthetic */ o0O00 $this_whenStateAtLeast;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOo0(o0O00 o0o00, o0O00.o00oOOoO o00ooooo2, o0OOOO.o0O00000<? super o0OOo00O.o0O0oo00, ? super o0OO.o00oOo0O<? super T>, ? extends Object> o0o00000, o0OO.o00oOo0O<? super o00oOOo0> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$this_whenStateAtLeast = o0o00;
            this.$minState = o00ooooo2;
            this.$block = o0o00000;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o00oOOo0 o00oooo02 = new o00oOOo0(this.$this_whenStateAtLeast, this.$minState, this.$block, o00ooo0o2);
            o00oooo02.L$0 = obj;
            return o00oooo02;
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ Object invoke(o0OOo00O.o0O0oo00 o0o0oo00, Object obj) {
            return invoke(o0o0oo00, (o0OO.o00oOo0O) ((o0OO.o00oOo0O) obj));
        }

        @Nullable
        public final Object invoke(@NotNull o0OOo00O.o0O0oo00 o0o0oo00, @Nullable o0OO.o00oOo0O<? super T> o00ooo0o2) {
            return ((o00oOOo0) create(o0o0oo00, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OoO00O o0ooo00o;
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o0OO0o.oo0ooO.o00oo0(obj);
                ooOOOOoo oooooooo = (ooOOOOoo) ((o0OOo00O.o0O0oo00) this.L$0).o0O000O().get(ooOOOOoo.f14136o00oOoO);
                if (oooooooo == null) {
                    throw new IllegalStateException("when[State] methods should have a parent job".toString());
                }
                o0O0o000 o0o0o000 = new o0O0o000();
                o0OoO00O o0ooo00o2 = new o0OoO00O(this.$this_whenStateAtLeast, this.$minState, o0o0o000.f3352o00oo0Oo, oooooooo);
                try {
                    o0OOOO.o0O00000<o0OOo00O.o0O0oo00, o0OO.o00oOo0O<? super T>, Object> o0o00000 = this.$block;
                    this.L$0 = o0ooo00o2;
                    this.label = 1;
                    obj = o0OOo00O.o0O00000.o00oOoO0(o0o0o000, o0o00000, this);
                    if (obj == o00oooo02) {
                        return o00oooo02;
                    }
                    o0ooo00o = o0ooo00o2;
                } catch (Throwable th) {
                    th = th;
                    o0ooo00o = o0ooo00o2;
                    o0ooo00o.o00oOOoO();
                    throw th;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                o0ooo00o = (o0OoO00O) this.L$0;
                try {
                    o0OO0o.oo0ooO.o00oo0(obj);
                } catch (Throwable th2) {
                    th = th2;
                    o0ooo00o.o00oOOoO();
                    throw th;
                }
            }
            o0ooo00o.o00oOOoO();
            return obj;
        }
    }

    @o0OO0o.o0O0o(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Nullable
    public static final <T> Object o00oOOo0(@NotNull o0O00 o0o00, @NotNull o0OOOO.o0O00000<? super o0OOo00O.o0O0oo00, ? super o0OO.o00oOo0O<? super T>, ? extends Object> o0o00000, @NotNull o0OO.o00oOo0O<? super T> o00ooo0o2) {
        return o00oOoO0(o0o00, o0O00.o00oOOoO.CREATED, o0o00000, o00ooo0o2);
    }

    @o0OO0o.o0O0o(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Nullable
    public static final <T> Object o00oOOoO(@NotNull o0O0O0O o0o0o0o, @NotNull o0OOOO.o0O00000<? super o0OOo00O.o0O0oo00, ? super o0OO.o00oOo0O<? super T>, ? extends Object> o0o00000, @NotNull o0OO.o00oOo0O<? super T> o00ooo0o2) {
        return o00oOOo0(o0o0o0o.getLifecycle(), o0o00000, o00ooo0o2);
    }

    @o0OO0o.o0O0o(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Nullable
    public static final <T> Object o00oOo00(@NotNull o0O00 o0o00, @NotNull o0OOOO.o0O00000<? super o0OOo00O.o0O0oo00, ? super o0OO.o00oOo0O<? super T>, ? extends Object> o0o00000, @NotNull o0OO.o00oOo0O<? super T> o00ooo0o2) {
        return o00oOoO0(o0o00, o0O00.o00oOOoO.RESUMED, o0o00000, o00ooo0o2);
    }

    @o0OO0o.o0O0o(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Nullable
    public static final <T> Object o00oOo0O(@NotNull o0O00 o0o00, @NotNull o0OOOO.o0O00000<? super o0OOo00O.o0O0oo00, ? super o0OO.o00oOo0O<? super T>, ? extends Object> o0o00000, @NotNull o0OO.o00oOo0O<? super T> o00ooo0o2) {
        return o00oOoO0(o0o00, o0O00.o00oOOoO.STARTED, o0o00000, o00ooo0o2);
    }

    @o0OO0o.o0O0o(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Nullable
    public static final <T> Object o00oOo0o(@NotNull o0O0O0O o0o0o0o, @NotNull o0OOOO.o0O00000<? super o0OOo00O.o0O0oo00, ? super o0OO.o00oOo0O<? super T>, ? extends Object> o0o00000, @NotNull o0OO.o00oOo0O<? super T> o00ooo0o2) {
        return o00oOo0O(o0o0o0o.getLifecycle(), o0o00000, o00ooo0o2);
    }

    @o0OO0o.o0O0o(message = "whenStateAtLeast has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStateAtLeast for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Nullable
    public static final <T> Object o00oOoO0(@NotNull o0O00 o0o00, @NotNull o0O00.o00oOOoO o00ooooo2, @NotNull o0OOOO.o0O00000<? super o0OOo00O.o0O0oo00, ? super o0OO.o00oOo0O<? super T>, ? extends Object> o0o00000, @NotNull o0OO.o00oOo0O<? super T> o00ooo0o2) {
        return o0OOo00O.o0O00000.o00oOoO0(o0OOo00O.o0OOO00.o00oOo0O().o0O0oo(), new o00oOOo0(o0o00, o00ooooo2, o0o00000, null), o00ooo0o2);
    }

    @o0OO0o.o0O0o(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    @Nullable
    public static final <T> Object o00oOooO(@NotNull o0O0O0O o0o0o0o, @NotNull o0OOOO.o0O00000<? super o0OOo00O.o0O0oo00, ? super o0OO.o00oOo0O<? super T>, ? extends Object> o0o00000, @NotNull o0OO.o00oOo0O<? super T> o00ooo0o2) {
        return o00oOo00(o0o0o0o.getLifecycle(), o0o00000, o00ooo0o2);
    }
}
