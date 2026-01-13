package androidx.lifecycle;

import androidx.lifecycle.o0O00;
import o0OO0o.oO0Ooooo;
import o0OOo0O0.o0OooO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes.dex */
public final class o0O0000O {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @o0OOO0.o00oo00O(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", i = {0}, l = {91}, m = "invokeSuspend", n = {"$this$callbackFlow"}, s = {"L$0"})
    /* loaded from: classes.dex */
    public static final class o00oOOo0<T> extends o0OOO0.o0 implements o0OOOO.o0O00000<o0OOo0O0.o0ooO<? super T>, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ o0O00 $lifecycle;
        public final /* synthetic */ o0O00.o00oOOoO $minActiveState;
        public final /* synthetic */ o0OOo0OO.o0OO00o<T> $this_flowWithLifecycle;
        private /* synthetic */ Object L$0;
        public int label;

        @o0OOO0.o00oo00O(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.lifecycle.o0O0000O$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0025o00oOOo0 extends o0OOO0.o0 implements o0OOOO.o0O00000<o0OOo00O.o0O0oo00, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
            public final /* synthetic */ o0OOo0O0.o0ooO<T> $$this$callbackFlow;
            public final /* synthetic */ o0OOo0OO.o0OO00o<T> $this_flowWithLifecycle;
            public int label;

            /* renamed from: androidx.lifecycle.o0O0000O$o00oOOo0$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0026o00oOOo0<T> implements o0OOo0OO.o0OO0 {

                /* renamed from: o00oo0O0  reason: collision with root package name */
                public final /* synthetic */ o0OOo0O0.o0ooO<T> f3332o00oo0O0;

                /* JADX WARN: Multi-variable type inference failed */
                public C0026o00oOOo0(o0OOo0O0.o0ooO<? super T> o0ooo) {
                    this.f3332o00oo0O0 = o0ooo;
                }

                @Override // o0OOo0OO.o0OO0
                @Nullable
                public final Object emit(T t, @NotNull o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
                    Object o00ooOo2 = this.f3332o00oo0O0.o00ooOo(t, o00ooo0o2);
                    return o00ooOo2 == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED ? o00ooOo2 : oO0Ooooo.f13240o00oOOo0;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0025o00oOOo0(o0OOo0OO.o0OO00o<? extends T> o0oo00o, o0OOo0O0.o0ooO<? super T> o0ooo, o0OO.o00oOo0O<? super C0025o00oOOo0> o00ooo0o2) {
                super(2, o00ooo0o2);
                this.$this_flowWithLifecycle = o0oo00o;
                this.$$this$callbackFlow = o0ooo;
            }

            @Override // o0OOO0.o00oOOo0
            @NotNull
            public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
                return new C0025o00oOOo0(this.$this_flowWithLifecycle, this.$$this$callbackFlow, o00ooo0o2);
            }

            @Override // o0OOOO.o0O00000
            @Nullable
            public final Object invoke(@NotNull o0OOo00O.o0O0oo00 o0o0oo00, @Nullable o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
                return ((C0025o00oOOo0) create(o0o0oo00, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
            }

            @Override // o0OOO0.o00oOOo0
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o0OO0o.oo0ooO.o00oo0(obj);
                    o0OOo0OO.o0OO00o<T> o0oo00o = this.$this_flowWithLifecycle;
                    C0026o00oOOo0 c0026o00oOOo0 = new C0026o00oOOo0(this.$$this$callbackFlow);
                    this.label = 1;
                    if (o0oo00o.o00oOOo0(c0026o00oOOo0, this) == o00oooo02) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOo0(o0O00 o0o00, o0O00.o00oOOoO o00ooooo2, o0OOo0OO.o0OO00o<? extends T> o0oo00o, o0OO.o00oOo0O<? super o00oOOo0> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$lifecycle = o0o00;
            this.$minActiveState = o00ooooo2;
            this.$this_flowWithLifecycle = o0oo00o;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o00oOOo0 o00oooo02 = new o00oOOo0(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, o00ooo0o2);
            o00oooo02.L$0 = obj;
            return o00oooo02;
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ Object invoke(Object obj, o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return invoke((o0OOo0O0.o0ooO) ((o0OOo0O0.o0ooO) obj), o00ooo0o2);
        }

        @Nullable
        public final Object invoke(@NotNull o0OOo0O0.o0ooO<? super T> o0ooo, @Nullable o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o00oOOo0) create(o0ooo, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOo0O0.o0ooO o0ooo;
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o0OO0o.oo0ooO.o00oo0(obj);
                o0OOo0O0.o0ooO o0ooo2 = (o0OOo0O0.o0ooO) this.L$0;
                o0O00 o0o00 = this.$lifecycle;
                o0O00.o00oOOoO o00ooooo2 = this.$minActiveState;
                C0025o00oOOo0 c0025o00oOOo0 = new C0025o00oOOo0(this.$this_flowWithLifecycle, o0ooo2, null);
                this.L$0 = o0ooo2;
                this.label = 1;
                if (RepeatOnLifecycleKt.o00oOOo0(o0o00, o00ooooo2, c0025o00oOOo0, this) == o00oooo02) {
                    return o00oooo02;
                }
                o0ooo = o0ooo2;
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                o0ooo = (o0OOo0O0.o0ooO) this.L$0;
                o0OO0o.oo0ooO.o00oo0(obj);
            }
            o0OooO0.o00oOOo0.o00oOOo0(o0ooo, null, 1, null);
            return oO0Ooooo.f13240o00oOOo0;
        }
    }

    @NotNull
    public static final <T> o0OOo0OO.o0OO00o<T> o00oOOo0(@NotNull o0OOo0OO.o0OO00o<? extends T> o0oo00o, @NotNull o0O00 o0o00, @NotNull o0O00.o00oOOoO o00ooooo2) {
        o0OOOOO0.o0ooO.o00oo0O0(o0oo00o, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00, "lifecycle");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooooo2, "minActiveState");
        return o0OOo0OO.o0OOooO0.o00oOoo0(new o00oOOo0(o0o00, o00ooooo2, o0oo00o, null));
    }

    public static /* synthetic */ o0OOo0OO.o0OO00o o00oOOoO(o0OOo0OO.o0OO00o o0oo00o, o0O00 o0o00, o0O00.o00oOOoO o00ooooo2, int i, Object obj) {
        if ((i & 2) != 0) {
            o00ooooo2 = o0O00.o00oOOoO.STARTED;
        }
        return o00oOOo0(o0oo00o, o0o00, o00ooooo2);
    }
}
