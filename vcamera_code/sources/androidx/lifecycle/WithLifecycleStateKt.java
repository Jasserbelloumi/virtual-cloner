package androidx.lifecycle;

import androidx.lifecycle.o0O00;
import com.google.firebase.analytics.FirebaseAnalytics;
import o00ooOoo.oOo000Oo;
import o0OO0o.oO0Ooooo;
import o0OO0o.oo0oO0;
import o0OOo00O.oO00OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOOOO0.o0OOO00({"SMAP\nWithLifecycleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,206:1\n154#1,8:207\n154#1,8:215\n154#1,8:223\n154#1,8:231\n43#1,5:239\n154#1,8:244\n43#1,5:252\n154#1,8:257\n154#1,8:265\n154#1,8:273\n154#1,8:281\n314#2,11:289\n*S KotlinDebug\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt\n*L\n47#1:207,8\n58#1:215,8\n71#1:223,8\n84#1:231,8\n98#1:239,5\n98#1:244,8\n98#1:252,5\n98#1:257,8\n111#1:265,8\n124#1:273,8\n137#1:281,8\n177#1:289,11\n*E\n"})
/* loaded from: classes.dex */
public final class WithLifecycleStateKt {

    /* loaded from: classes.dex */
    public static final class o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 f3264o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0O00 f3265o00oo0O0;

        public o00oOOo0(o0O00 o0o00, WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) {
            this.f3265o00oo0O0 = o0o00;
            this.f3264o00oo0O = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f3265o00oo0O0.o00oOOo0(this.f3264o00oo0O);
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOOoO extends o0OOOOO0.o0O0OO implements o0OOOO.o00oo<Throwable, oO0Ooooo> {
        public final /* synthetic */ o0OOo00O.o0O0o000 $lifecycleDispatcher;
        public final /* synthetic */ WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 $observer;
        public final /* synthetic */ o0O00 $this_suspendWithStateAtLeastUnchecked;

        /* loaded from: classes.dex */
        public static final class o00oOOo0 implements Runnable {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final /* synthetic */ WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 f3266o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ o0O00 f3267o00oo0O0;

            public o00oOOo0(o0O00 o0o00, WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) {
                this.f3267o00oo0O0 = o0o00;
                this.f3266o00oo0O = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f3267o00oo0O0.o00oOooO(this.f3266o00oo0O);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOoO(o0OOo00O.o0O0o000 o0o0o000, o0O00 o0o00, WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) {
            super(1);
            this.$lifecycleDispatcher = o0o0o000;
            this.$this_suspendWithStateAtLeastUnchecked = o0o00;
            this.$observer = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
        }

        @Override // o0OOOO.o00oo
        public /* bridge */ /* synthetic */ oO0Ooooo invoke(Throwable th) {
            invoke2(th);
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Throwable th) {
            o0OOo00O.o0O0o000 o0o0o000 = this.$lifecycleDispatcher;
            o0OO.o00oo0O0 o00oo0o02 = o0OO.o00oo0O0.INSTANCE;
            if (o0o0o000.o0O0oOoO(o00oo0o02)) {
                this.$lifecycleDispatcher.oo0oOOo(o00oo0o02, new o00oOOo0(this.$this_suspendWithStateAtLeastUnchecked, this.$observer));
            } else {
                this.$this_suspendWithStateAtLeastUnchecked.o00oOooO(this.$observer);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @o0OOOOO0.o0OOO00({"SMAP\nWithLifecycleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt$withStateAtLeastUnchecked$2\n*L\n1#1,206:1\n*E\n"})
    /* loaded from: classes.dex */
    public static final class o00oOo00<R> extends o0OOOOO0.o0O0OO implements o0OOOO.o00oOOo0<R> {
        public final /* synthetic */ o0OOOO.o00oOOo0<R> $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oOo00(o0OOOO.o00oOOo0<? extends R> o00oooo02) {
            super(0);
            this.$block = o00oooo02;
        }

        @Override // o0OOOO.o00oOOo0
        public final R invoke() {
            return this.$block.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1, androidx.lifecycle.o0O00oO0] */
    @o0OO0o.o0O
    @Nullable
    public static final <R> Object o00oOOo0(@NotNull final o0O00 o0o00, @NotNull final o0O00.o00oOOoO o00ooooo2, boolean z, @NotNull o0OOo00O.o0O0o000 o0o0o000, @NotNull final o0OOOO.o00oOOo0<? extends R> o00oooo02, @NotNull o0OO.o00oOo0O<? super R> o00ooo0o2) {
        final o0OOo00O.o0O00 o0o002 = new o0OOo00O.o0O00(o0OOO00o.o00oOo00.o00oOooO(o00ooo0o2), 1);
        o0o002.o00ooo00();
        ?? r1 = new o0O00OOO() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1
            @Override // androidx.lifecycle.o0O00OOO
            public void o00oOOoO(@NotNull o0O0O0O o0o0o0o, @NotNull o0O00.o00oOOo0 o00oooo03) {
                o0OO.o00oOo0O o00ooo0o3;
                o0O00O th;
                Object m7constructorimpl;
                o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o, FirebaseAnalytics.Param.SOURCE);
                o0OOOOO0.o0ooO.o00oo0O0(o00oooo03, oOo000Oo.f9217o0O00o0o);
                if (o00oooo03 == o0O00.o00oOOo0.Companion.o00oOooO(o0O00.o00oOOoO.this)) {
                    o0o00.o00oOooO(this);
                    o00ooo0o3 = o0o002;
                    o0OOOO.o00oOOo0<R> o00oooo04 = o00oooo02;
                    try {
                        oo0oO0.o00oOOo0 o00oooo05 = o0OO0o.oo0oO0.Companion;
                        m7constructorimpl = o0OO0o.oo0oO0.m7constructorimpl(o00oooo04.invoke());
                    } catch (Throwable th2) {
                        th = th2;
                        oo0oO0.o00oOOo0 o00oooo06 = o0OO0o.oo0oO0.Companion;
                    }
                    o00ooo0o3.resumeWith(m7constructorimpl);
                } else if (o00oooo03 != o0O00.o00oOOo0.ON_DESTROY) {
                    return;
                } else {
                    o0o00.o00oOooO(this);
                    o00ooo0o3 = o0o002;
                    oo0oO0.o00oOOo0 o00oooo07 = o0OO0o.oo0oO0.Companion;
                    th = new o0O00O();
                }
                m7constructorimpl = o0OO0o.oo0oO0.m7constructorimpl(o0OO0o.oo0ooO.o00oOOo0(th));
                o00ooo0o3.resumeWith(m7constructorimpl);
            }
        };
        if (z) {
            o0o0o000.oo0oOOo(o0OO.o00oo0O0.INSTANCE, new o00oOOo0(o0o00, r1));
        } else {
            o0o00.o00oOOo0(r1);
        }
        o0o002.o00ooOoo(new o00oOOoO(o0o0o000, o0o00, r1));
        Object o00ooO002 = o0o002.o00ooO00();
        if (o00ooO002 == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED) {
            o0OOO0.o00oo0OO.o00oOo00(o00ooo0o2);
        }
        return o00ooO002;
    }

    @Nullable
    public static final <R> Object o00oOOoO(@NotNull o0O00 o0o00, @NotNull o0OOOO.o00oOOo0<? extends R> o00oooo02, @NotNull o0OO.o00oOo0O<? super R> o00ooo0o2) {
        o0O00.o00oOOoO o00ooooo2 = o0O00.o00oOOoO.CREATED;
        oO00OO o0O0oo2 = o0OOo00O.o0OOO00.o00oOo0O().o0O0oo();
        boolean o0O0oOoO2 = o0O0oo2.o0O0oOoO(o00ooo0o2.getContext());
        if (!o0O0oOoO2) {
            if (o0o00.o00oOOoO() == o0O00.o00oOOoO.DESTROYED) {
                throw new o0O00O();
            }
            if (o0o00.o00oOOoO().compareTo(o00ooooo2) >= 0) {
                return o00oooo02.invoke();
            }
        }
        return o00oOOo0(o0o00, o00ooooo2, o0O0oOoO2, o0O0oo2, new o00oOo00(o00oooo02), o00ooo0o2);
    }

    @Nullable
    public static final <R> Object o00oOo00(@NotNull o0O0O0O o0o0o0o, @NotNull o0OOOO.o00oOOo0<? extends R> o00oooo02, @NotNull o0OO.o00oOo0O<? super R> o00ooo0o2) {
        o0O00 lifecycle = o0o0o0o.getLifecycle();
        o0O00.o00oOOoO o00ooooo2 = o0O00.o00oOOoO.CREATED;
        oO00OO o0O0oo2 = o0OOo00O.o0OOO00.o00oOo0O().o0O0oo();
        boolean o0O0oOoO2 = o0O0oo2.o0O0oOoO(o00ooo0o2.getContext());
        if (!o0O0oOoO2) {
            if (lifecycle.o00oOOoO() == o0O00.o00oOOoO.DESTROYED) {
                throw new o0O00O();
            }
            if (lifecycle.o00oOOoO().compareTo(o00ooooo2) >= 0) {
                return o00oooo02.invoke();
            }
        }
        return o00oOOo0(lifecycle, o00ooooo2, o0O0oOoO2, o0O0oo2, new o00oOo00(o00oooo02), o00ooo0o2);
    }

    public static final <R> Object o00oOo0O(o0O0O0O o0o0o0o, o0OOOO.o00oOOo0<? extends R> o00oooo02, o0OO.o00oOo0O<? super R> o00ooo0o2) {
        o0o0o0o.getLifecycle();
        o0O00.o00oOOoO o00ooooo2 = o0O00.o00oOOoO.CREATED;
        o0OOo00O.o0OOO00.o00oOo0O().o0O0oo();
        throw null;
    }

    @Nullable
    public static final <R> Object o00oOo0o(@NotNull o0O00 o0o00, @NotNull o0OOOO.o00oOOo0<? extends R> o00oooo02, @NotNull o0OO.o00oOo0O<? super R> o00ooo0o2) {
        o0O00.o00oOOoO o00ooooo2 = o0O00.o00oOOoO.RESUMED;
        oO00OO o0O0oo2 = o0OOo00O.o0OOO00.o00oOo0O().o0O0oo();
        boolean o0O0oOoO2 = o0O0oo2.o0O0oOoO(o00ooo0o2.getContext());
        if (!o0O0oOoO2) {
            if (o0o00.o00oOOoO() == o0O00.o00oOOoO.DESTROYED) {
                throw new o0O00O();
            }
            if (o0o00.o00oOOoO().compareTo(o00ooooo2) >= 0) {
                return o00oooo02.invoke();
            }
        }
        return o00oOOo0(o0o00, o00ooooo2, o0O0oOoO2, o0O0oo2, new o00oOo00(o00oooo02), o00ooo0o2);
    }

    public static final <R> Object o00oOoO(o0O00 o0o00, o0OOOO.o00oOOo0<? extends R> o00oooo02, o0OO.o00oOo0O<? super R> o00ooo0o2) {
        o0O00.o00oOOoO o00ooooo2 = o0O00.o00oOOoO.RESUMED;
        o0OOo00O.o0OOO00.o00oOo0O().o0O0oo();
        throw null;
    }

    @Nullable
    public static final <R> Object o00oOoO0(@NotNull o0O0O0O o0o0o0o, @NotNull o0OOOO.o00oOOo0<? extends R> o00oooo02, @NotNull o0OO.o00oOo0O<? super R> o00ooo0o2) {
        o0O00 lifecycle = o0o0o0o.getLifecycle();
        o0O00.o00oOOoO o00ooooo2 = o0O00.o00oOOoO.RESUMED;
        oO00OO o0O0oo2 = o0OOo00O.o0OOO00.o00oOo0O().o0O0oo();
        boolean o0O0oOoO2 = o0O0oo2.o0O0oOoO(o00ooo0o2.getContext());
        if (!o0O0oOoO2) {
            if (lifecycle.o00oOOoO() == o0O00.o00oOOoO.DESTROYED) {
                throw new o0O00O();
            }
            if (lifecycle.o00oOOoO().compareTo(o00ooooo2) >= 0) {
                return o00oooo02.invoke();
            }
        }
        return o00oOOo0(lifecycle, o00ooooo2, o0O0oOoO2, o0O0oo2, new o00oOo00(o00oooo02), o00ooo0o2);
    }

    public static final <R> Object o00oOoOO(o0O0O0O o0o0o0o, o0OOOO.o00oOOo0<? extends R> o00oooo02, o0OO.o00oOo0O<? super R> o00ooo0o2) {
        o0o0o0o.getLifecycle();
        o0O00.o00oOOoO o00ooooo2 = o0O00.o00oOOoO.RESUMED;
        o0OOo00O.o0OOO00.o00oOo0O().o0O0oo();
        throw null;
    }

    @Nullable
    public static final <R> Object o00oOoOo(@NotNull o0O00 o0o00, @NotNull o0OOOO.o00oOOo0<? extends R> o00oooo02, @NotNull o0OO.o00oOo0O<? super R> o00ooo0o2) {
        o0O00.o00oOOoO o00ooooo2 = o0O00.o00oOOoO.STARTED;
        oO00OO o0O0oo2 = o0OOo00O.o0OOO00.o00oOo0O().o0O0oo();
        boolean o0O0oOoO2 = o0O0oo2.o0O0oOoO(o00ooo0o2.getContext());
        if (!o0O0oOoO2) {
            if (o0o00.o00oOOoO() == o0O00.o00oOOoO.DESTROYED) {
                throw new o0O00O();
            }
            if (o0o00.o00oOOoO().compareTo(o00ooooo2) >= 0) {
                return o00oooo02.invoke();
            }
        }
        return o00oOOo0(o0o00, o00ooooo2, o0O0oOoO2, o0O0oo2, new o00oOo00(o00oooo02), o00ooo0o2);
    }

    @Nullable
    public static final <R> Object o00oOoo0(@NotNull o0O0O0O o0o0o0o, @NotNull o0OOOO.o00oOOo0<? extends R> o00oooo02, @NotNull o0OO.o00oOo0O<? super R> o00ooo0o2) {
        o0O00 lifecycle = o0o0o0o.getLifecycle();
        o0O00.o00oOOoO o00ooooo2 = o0O00.o00oOOoO.STARTED;
        oO00OO o0O0oo2 = o0OOo00O.o0OOO00.o00oOo0O().o0O0oo();
        boolean o0O0oOoO2 = o0O0oo2.o0O0oOoO(o00ooo0o2.getContext());
        if (!o0O0oOoO2) {
            if (lifecycle.o00oOOoO() == o0O00.o00oOOoO.DESTROYED) {
                throw new o0O00O();
            }
            if (lifecycle.o00oOOoO().compareTo(o00ooooo2) >= 0) {
                return o00oooo02.invoke();
            }
        }
        return o00oOOo0(lifecycle, o00ooooo2, o0O0oOoO2, o0O0oo2, new o00oOo00(o00oooo02), o00ooo0o2);
    }

    public static final <R> Object o00oOooO(o0O00 o0o00, o0OOOO.o00oOOo0<? extends R> o00oooo02, o0OO.o00oOo0O<? super R> o00ooo0o2) {
        o0O00.o00oOOoO o00ooooo2 = o0O00.o00oOOoO.CREATED;
        o0OOo00O.o0OOO00.o00oOo0O().o0O0oo();
        throw null;
    }

    public static final <R> Object o00oOooo(o0O00 o0o00, o0OOOO.o00oOOo0<? extends R> o00oooo02, o0OO.o00oOo0O<? super R> o00ooo0o2) {
        o0O00.o00oOOoO o00ooooo2 = o0O00.o00oOOoO.STARTED;
        o0OOo00O.o0OOO00.o00oOo0O().o0O0oo();
        throw null;
    }

    @Nullable
    public static final <R> Object o00oo0(@NotNull o0O00 o0o00, @NotNull o0O00.o00oOOoO o00ooooo2, @NotNull o0OOOO.o00oOOo0<? extends R> o00oooo02, @NotNull o0OO.o00oOo0O<? super R> o00ooo0o2) {
        if (!(o00ooooo2.compareTo(o0O00.o00oOOoO.CREATED) >= 0)) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + o00ooooo2).toString());
        }
        oO00OO o0O0oo2 = o0OOo00O.o0OOO00.o00oOo0O().o0O0oo();
        boolean o0O0oOoO2 = o0O0oo2.o0O0oOoO(o00ooo0o2.getContext());
        if (!o0O0oOoO2) {
            if (o0o00.o00oOOoO() == o0O00.o00oOOoO.DESTROYED) {
                throw new o0O00O();
            }
            if (o0o00.o00oOOoO().compareTo(o00ooooo2) >= 0) {
                return o00oooo02.invoke();
            }
        }
        return o00oOOo0(o0o00, o00ooooo2, o0O0oOoO2, o0O0oo2, new o00oOo00(o00oooo02), o00ooo0o2);
    }

    public static final <R> Object o00oo00O(o0O0O0O o0o0o0o, o0OOOO.o00oOOo0<? extends R> o00oooo02, o0OO.o00oOo0O<? super R> o00ooo0o2) {
        o0o0o0o.getLifecycle();
        o0O00.o00oOOoO o00ooooo2 = o0O00.o00oOOoO.STARTED;
        o0OOo00O.o0OOO00.o00oOo0O().o0O0oo();
        throw null;
    }

    public static final <R> Object o00oo0O(o0O0O0O o0o0o0o, o0O00.o00oOOoO o00ooooo2, o0OOOO.o00oOOo0<? extends R> o00oooo02, o0OO.o00oOo0O<? super R> o00ooo0o2) {
        o0o0o0o.getLifecycle();
        if (o00ooooo2.compareTo(o0O00.o00oOOoO.CREATED) >= 0) {
            o0OOo00O.o0OOO00.o00oOo0O().o0O0oo();
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + o00ooooo2).toString());
    }

    public static final <R> Object o00oo0O0(o0O00 o0o00, o0O00.o00oOOoO o00ooooo2, o0OOOO.o00oOOo0<? extends R> o00oooo02, o0OO.o00oOo0O<? super R> o00ooo0o2) {
        if (o00ooooo2.compareTo(o0O00.o00oOOoO.CREATED) >= 0) {
            o0OOo00O.o0OOO00.o00oOo0O().o0O0oo();
            throw null;
        }
        throw new IllegalArgumentException(("target state must be CREATED or greater, found " + o00ooooo2).toString());
    }

    @Nullable
    public static final <R> Object o00oo0OO(@NotNull o0O0O0O o0o0o0o, @NotNull o0O00.o00oOOoO o00ooooo2, @NotNull o0OOOO.o00oOOo0<? extends R> o00oooo02, @NotNull o0OO.o00oOo0O<? super R> o00ooo0o2) {
        o0O00 lifecycle = o0o0o0o.getLifecycle();
        if (!(o00ooooo2.compareTo(o0O00.o00oOOoO.CREATED) >= 0)) {
            throw new IllegalArgumentException(("target state must be CREATED or greater, found " + o00ooooo2).toString());
        }
        oO00OO o0O0oo2 = o0OOo00O.o0OOO00.o00oOo0O().o0O0oo();
        boolean o0O0oOoO2 = o0O0oo2.o0O0oOoO(o00ooo0o2.getContext());
        if (!o0O0oOoO2) {
            if (lifecycle.o00oOOoO() == o0O00.o00oOOoO.DESTROYED) {
                throw new o0O00O();
            }
            if (lifecycle.o00oOOoO().compareTo(o00ooooo2) >= 0) {
                return o00oooo02.invoke();
            }
        }
        return o00oOOo0(lifecycle, o00ooooo2, o0O0oOoO2, o0O0oo2, new o00oOo00(o00oooo02), o00ooo0o2);
    }

    @o0OO0o.o0O
    @Nullable
    public static final <R> Object o00oo0Oo(@NotNull o0O00 o0o00, @NotNull o0O00.o00oOOoO o00ooooo2, @NotNull o0OOOO.o00oOOo0<? extends R> o00oooo02, @NotNull o0OO.o00oOo0O<? super R> o00ooo0o2) {
        oO00OO o0O0oo2 = o0OOo00O.o0OOO00.o00oOo0O().o0O0oo();
        boolean o0O0oOoO2 = o0O0oo2.o0O0oOoO(o00ooo0o2.getContext());
        if (!o0O0oOoO2) {
            if (o0o00.o00oOOoO() == o0O00.o00oOOoO.DESTROYED) {
                throw new o0O00O();
            }
            if (o0o00.o00oOOoO().compareTo(o00ooooo2) >= 0) {
                return o00oooo02.invoke();
            }
        }
        return o00oOOo0(o0o00, o00ooooo2, o0O0oOoO2, o0O0oo2, new o00oOo00(o00oooo02), o00ooo0o2);
    }

    @o0OO0o.o0O
    public static final <R> Object o00oo0o0(o0O00 o0o00, o0O00.o00oOOoO o00ooooo2, o0OOOO.o00oOOo0<? extends R> o00oooo02, o0OO.o00oOo0O<? super R> o00ooo0o2) {
        o0OOo00O.o0OOO00.o00oOo0O().o0O0oo();
        throw null;
    }
}
