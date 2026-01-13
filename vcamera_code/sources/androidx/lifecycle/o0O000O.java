package androidx.lifecycle;

import java.time.Duration;
import o00oOooo.oO00000;
import o0OO0o.oO0Ooooo;
import o0OOo00O.oO000;
import o0OOo00O.oO00OO;
import o0OOo0OO.oO000Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOOO0o.o00oo0OO(name = "FlowLiveDataConversions")
/* loaded from: classes.dex */
public final class o0O000O {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @o0OOO0.o00oo00O(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", i = {0, 0}, l = {110, 114}, m = "invokeSuspend", n = {"$this$callbackFlow", "observer"}, s = {"L$0", "L$1"})
    /* loaded from: classes.dex */
    public static final class o00oOOo0<T> extends o0OOO0.o0 implements o0OOOO.o0O00000<o0OOo0O0.o0ooO<? super T>, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ LiveData<T> $this_asFlow;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        @o0OOO0.o00oo00O(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.lifecycle.o0O000O$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0027o00oOOo0 extends o0OOO0.o0 implements o0OOOO.o0O00000<o0OOo00O.o0O0oo00, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
            public final /* synthetic */ o0OooO0<T> $observer;
            public final /* synthetic */ LiveData<T> $this_asFlow;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0027o00oOOo0(LiveData<T> liveData, o0OooO0<T> o0oooo0, o0OO.o00oOo0O<? super C0027o00oOOo0> o00ooo0o2) {
                super(2, o00ooo0o2);
                this.$this_asFlow = liveData;
                this.$observer = o0oooo0;
            }

            @Override // o0OOO0.o00oOOo0
            @NotNull
            public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
                return new C0027o00oOOo0(this.$this_asFlow, this.$observer, o00ooo0o2);
            }

            @Override // o0OOOO.o0O00000
            @Nullable
            public final Object invoke(@NotNull o0OOo00O.o0O0oo00 o0o0oo00, @Nullable o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
                return ((C0027o00oOOo0) create(o0o0oo00, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
            }

            @Override // o0OOO0.o00oOOo0
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
                if (this.label == 0) {
                    o0OO0o.oo0ooO.o00oo0(obj);
                    this.$this_asFlow.o00oOooo(this.$observer);
                    return oO0Ooooo.f13240o00oOOo0;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* loaded from: classes.dex */
        public static final class o00oOOoO extends o0OOOOO0.o0O0OO implements o0OOOO.o00oOOo0<oO0Ooooo> {
            public final /* synthetic */ o0OooO0<T> $observer;
            public final /* synthetic */ LiveData<T> $this_asFlow;

            @o0OOO0.o00oo00O(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2$1", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.lifecycle.o0O000O$o00oOOo0$o00oOOoO$o00oOOo0  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0028o00oOOo0 extends o0OOO0.o0 implements o0OOOO.o0O00000<o0OOo00O.o0O0oo00, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
                public final /* synthetic */ o0OooO0<T> $observer;
                public final /* synthetic */ LiveData<T> $this_asFlow;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0028o00oOOo0(LiveData<T> liveData, o0OooO0<T> o0oooo0, o0OO.o00oOo0O<? super C0028o00oOOo0> o00ooo0o2) {
                    super(2, o00ooo0o2);
                    this.$this_asFlow = liveData;
                    this.$observer = o0oooo0;
                }

                @Override // o0OOO0.o00oOOo0
                @NotNull
                public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
                    return new C0028o00oOOo0(this.$this_asFlow, this.$observer, o00ooo0o2);
                }

                @Override // o0OOOO.o0O00000
                @Nullable
                public final Object invoke(@NotNull o0OOo00O.o0O0oo00 o0o0oo00, @Nullable o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
                    return ((C0028o00oOOo0) create(o0o0oo00, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
                }

                @Override // o0OOO0.o00oOOo0
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
                    if (this.label == 0) {
                        o0OO0o.oo0ooO.o00oo0(obj);
                        this.$this_asFlow.o00oo0O0(this.$observer);
                        return oO0Ooooo.f13240o00oOOo0;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o00oOOoO(LiveData<T> liveData, o0OooO0<T> o0oooo0) {
                super(0);
                this.$this_asFlow = liveData;
                this.$observer = o0oooo0;
            }

            @Override // o0OOOO.o00oOOo0
            public /* bridge */ /* synthetic */ oO0Ooooo invoke() {
                invoke2();
                return oO0Ooooo.f13240o00oOOo0;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                o0OOo00O.o0O00000.o00oOo0o(oO000.f14062o00oo0O0, o0OOo00O.o0OOO00.o00oOo0O().o0O0oo(), null, new C0028o00oOOo0(this.$this_asFlow, this.$observer, null), 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(LiveData<T> liveData, o0OO.o00oOo0O<? super o00oOOo0> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$this_asFlow = liveData;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o00oOOo0 o00oooo02 = new o00oOOo0(this.$this_asFlow, o00ooo0o2);
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
            o0OooO0 o0oooo0;
            o0OOo0O0.o0ooO o0ooo;
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o0OO0o.oo0ooO.o00oo0(obj);
                final o0OOo0O0.o0ooO o0ooo2 = (o0OOo0O0.o0ooO) this.L$0;
                o0oooo0 = new o0OooO0() { // from class: androidx.lifecycle.o0O000
                    @Override // androidx.lifecycle.o0OooO0
                    public final void onChanged(Object obj2) {
                        o0OOo0O0.o0ooO.this.o00oo0o0(obj2);
                    }
                };
                oO00OO o0O0oo2 = o0OOo00O.o0OOO00.o00oOo0O().o0O0oo();
                C0027o00oOOo0 c0027o00oOOo0 = new C0027o00oOOo0(this.$this_asFlow, o0oooo0, null);
                this.L$0 = o0ooo2;
                this.L$1 = o0oooo0;
                this.label = 1;
                if (o0OOo00O.o0O00000.o00oOoO0(o0O0oo2, c0027o00oOOo0, this) == o00oooo02) {
                    return o00oooo02;
                }
                o0ooo = o0ooo2;
            } else if (i != 1) {
                if (i == 2) {
                    o0OO0o.oo0ooO.o00oo0(obj);
                    return oO0Ooooo.f13240o00oOOo0;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                o0oooo0 = (o0OooO0) this.L$1;
                o0ooo = (o0OOo0O0.o0ooO) this.L$0;
                o0OO0o.oo0ooO.o00oo0(obj);
            }
            o00oOOoO o00ooooo2 = new o00oOOoO(this.$this_asFlow, o0oooo0);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (o0OOo0O0.o0O0O0Oo.o00oOOo0(o0ooo, o00ooooo2, this) == o00oooo02) {
                return o00oooo02;
            }
            return oO0Ooooo.f13240o00oOOo0;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @o0OOO0.o00oo00O(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class o00oOOoO<T> extends o0OOO0.o0 implements o0OOOO.o0O00000<o0O0OO0<T>, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ o0OOo0OO.o0OO00o<T> $this_asLiveData;
        private /* synthetic */ Object L$0;
        public int label;

        /* loaded from: classes.dex */
        public static final class o00oOOo0<T> implements o0OOo0OO.o0OO0 {

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ o0O0OO0<T> f3333o00oo0O0;

            public o00oOOo0(o0O0OO0<T> o0o0oo0) {
                this.f3333o00oo0O0 = o0o0oo0;
            }

            @Override // o0OOo0OO.o0OO0
            @Nullable
            public final Object emit(T t, @NotNull o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
                Object emit = this.f3333o00oo0O0.emit(t, o00ooo0o2);
                return emit == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED ? emit : oO0Ooooo.f13240o00oOOo0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOoO(o0OOo0OO.o0OO00o<? extends T> o0oo00o, o0OO.o00oOo0O<? super o00oOOoO> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$this_asLiveData = o0oo00o;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o00oOOoO o00ooooo2 = new o00oOOoO(this.$this_asLiveData, o00ooo0o2);
            o00ooooo2.L$0 = obj;
            return o00ooooo2;
        }

        @Nullable
        public final Object invoke(@NotNull o0O0OO0<T> o0o0oo0, @Nullable o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o00oOOoO) create(o0o0oo0, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ Object invoke(Object obj, o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return invoke((o0O0OO0) ((o0O0OO0) obj), o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o0OO0o.oo0ooO.o00oo0(obj);
                o0OOo0OO.o0OO00o<T> o0oo00o = this.$this_asLiveData;
                o00oOOo0 o00oooo03 = new o00oOOo0((o0O0OO0) this.L$0);
                this.label = 1;
                if (o0oo00o.o00oOOo0(o00oooo03, this) == o00oooo02) {
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
    public static final <T> o0OOo0OO.o0OO00o<T> o00oOOo0(@NotNull LiveData<T> liveData) {
        o0OOOOO0.o0ooO.o00oo0O0(liveData, "<this>");
        return o0OOo0OO.o0OO0oO.o00oOoO0(o0OOo0OO.o0OOooO0.o00oOoo0(new o00oOOo0(liveData, null)));
    }

    @o0OOOO0o.o00oo0O0
    @NotNull
    public static final <T> LiveData<T> o00oOOoO(@NotNull o0OOo0OO.o0OO00o<? extends T> o0oo00o) {
        o0OOOOO0.o0ooO.o00oo0O0(o0oo00o, "<this>");
        return o00oOo0o(o0oo00o, null, 0L, 3, null);
    }

    @o0OOOO0o.o00oo0O0
    @NotNull
    public static final <T> LiveData<T> o00oOo00(@NotNull o0OOo0OO.o0OO00o<? extends T> o0oo00o, @NotNull o0OO.o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(o0oo00o, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "context");
        return o00oOo0o(o0oo00o, o00oo0Var, 0L, 2, null);
    }

    @o00oOooO.o0OOooO0(26)
    @NotNull
    public static final <T> LiveData<T> o00oOo0O(@NotNull o0OOo0OO.o0OO00o<? extends T> o0oo00o, @NotNull o0OO.o00oo0 o00oo0Var, @NotNull Duration duration) {
        o0OOOOO0.o0ooO.o00oo0O0(o0oo00o, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "context");
        o0OOOOO0.o0ooO.o00oo0O0(duration, "timeout");
        return o00oOooO(o0oo00o, o00oo0Var, o00oOo00.f3280o00oOOo0.o00oOOo0(duration));
    }

    public static /* synthetic */ LiveData o00oOo0o(o0OOo0OO.o0OO00o o0oo00o, o0OO.o00oo0 o00oo0Var, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            o00oo0Var = o0OO.o00oo0O0.INSTANCE;
        }
        if ((i & 2) != 0) {
            j = 5000;
        }
        return o00oOooO(o0oo00o, o00oo0Var, j);
    }

    public static /* synthetic */ LiveData o00oOoO0(o0OOo0OO.o0OO00o o0oo00o, o0OO.o00oo0 o00oo0Var, Duration duration, int i, Object obj) {
        if ((i & 1) != 0) {
            o00oo0Var = o0OO.o00oo0O0.INSTANCE;
        }
        return o00oOo0O(o0oo00o, o00oo0Var, duration);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OOOO0o.o00oo0O0
    @NotNull
    public static final <T> LiveData<T> o00oOooO(@NotNull o0OOo0OO.o0OO00o<? extends T> o0oo00o, @NotNull o0OO.o00oo0 o00oo0Var, long j) {
        o0OOOOO0.o0ooO.o00oo0O0(o0oo00o, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "context");
        LiveData<T> liveData = (LiveData<T>) o0O0o.o00oOOoO(o00oo0Var, j, new o00oOOoO(o0oo00o, null));
        if (o0oo00o instanceof oO000Oo0) {
            boolean o00oOo002 = oO00000.o00oOoO().o00oOo00();
            Object value = ((oO000Oo0) o0oo00o).getValue();
            if (o00oOo002) {
                liveData.o00oo0Oo(value);
            } else {
                liveData.o00oo0OO(value);
            }
        }
        return liveData;
    }
}
