package o0OOO00o;

import o0OO.o00oo0;
import o0OO.o00oo0O0;
import o0OO0o.o0OO00o0;
import o0OO0o.oO0Ooooo;
import o0OO0o.oo0ooO;
import o0OOO0.o00oo0O;
import o0OOOO.o00oo;
import o0OOOO.o0O00000;
import o0OOOO.o0O0000O;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0OOO0OO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOO00({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,204:1\n165#1,4:205\n186#1:209\n165#1,4:210\n186#1:214\n*S KotlinDebug\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n91#1:205,4\n91#1:209\n126#1:210,4\n126#1:214\n*E\n"})
/* loaded from: classes3.dex */
public class o00oOo00 {

    @o0OOO00({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1\n*L\n1#1,204:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o00oo0O {
        public final /* synthetic */ o00oo<o0OO.o00oOo0O<? super T>, Object> $block;
        private int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOo0(o0OO.o00oOo0O<? super T> o00ooo0o2, o00oo<? super o0OO.o00oOo0O<? super T>, ? extends Object> o00ooVar) {
            super(o00ooo0o2);
            this.$block = o00ooVar;
            o0ooO.o00oo0(o00ooo0o2, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public Object invokeSuspend(@NotNull Object obj) {
            int i = this.label;
            if (i == 0) {
                this.label = 1;
                oo0ooO.o00oo0(obj);
                return this.$block.invoke(this);
            } else if (i == 1) {
                this.label = 2;
                oo0ooO.o00oo0(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    @o0OOO00({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2\n*L\n1#1,204:1\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO extends o0OOO0.o00oOo0O {
        public final /* synthetic */ o00oo<o0OO.o00oOo0O<? super T>, Object> $block;
        private int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOoO(o0OO.o00oOo0O<? super T> o00ooo0o2, o00oo0 o00oo0Var, o00oo<? super o0OO.o00oOo0O<? super T>, ? extends Object> o00ooVar) {
            super(o00ooo0o2, o00oo0Var);
            this.$block = o00ooVar;
            o0ooO.o00oo0(o00ooo0o2, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public Object invokeSuspend(@NotNull Object obj) {
            int i = this.label;
            if (i == 0) {
                this.label = 1;
                oo0ooO.o00oo0(obj);
                return this.$block.invoke(this);
            } else if (i == 1) {
                this.label = 2;
                oo0ooO.o00oo0(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    @o0OOO00({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,204:1\n92#2:205\n*E\n"})
    /* renamed from: o0OOO00o.o00oOo00$o00oOo00  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0169o00oOo00 extends o00oo0O {
        public final /* synthetic */ o00oo $this_createCoroutineUnintercepted$inlined;
        private int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0169o00oOo00(o0OO.o00oOo0O o00ooo0o2, o00oo o00ooVar) {
            super(o00ooo0o2);
            this.$this_createCoroutineUnintercepted$inlined = o00ooVar;
            o0ooO.o00oo0(o00ooo0o2, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public Object invokeSuspend(@NotNull Object obj) {
            int i = this.label;
            if (i == 0) {
                this.label = 1;
                oo0ooO.o00oo0(obj);
                o0ooO.o00oo0(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                return ((o00oo) o0OOO0OO.o00oo0O(this.$this_createCoroutineUnintercepted$inlined, 1)).invoke(this);
            } else if (i == 1) {
                this.label = 2;
                oo0ooO.o00oo0(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    @o0OOO00({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,204:1\n92#2:205\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOo0O extends o0OOO0.o00oOo0O {
        public final /* synthetic */ o00oo $this_createCoroutineUnintercepted$inlined;
        private int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo0O(o0OO.o00oOo0O o00ooo0o2, o00oo0 o00oo0Var, o00oo o00ooVar) {
            super(o00ooo0o2, o00oo0Var);
            this.$this_createCoroutineUnintercepted$inlined = o00ooVar;
            o0ooO.o00oo0(o00ooo0o2, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public Object invokeSuspend(@NotNull Object obj) {
            int i = this.label;
            if (i == 0) {
                this.label = 1;
                oo0ooO.o00oo0(obj);
                o0ooO.o00oo0(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                return ((o00oo) o0OOO0OO.o00oo0O(this.$this_createCoroutineUnintercepted$inlined, 1)).invoke(this);
            } else if (i == 1) {
                this.label = 2;
                oo0ooO.o00oo0(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    @o0OOO00({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,204:1\n127#2:205\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oOoO extends o00oo0O {
        public final /* synthetic */ Object $receiver$inlined;
        public final /* synthetic */ o0O00000 $this_createCoroutineUnintercepted$inlined;
        private int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOoO(o0OO.o00oOo0O o00ooo0o2, o0O00000 o0o00000, Object obj) {
            super(o00ooo0o2);
            this.$this_createCoroutineUnintercepted$inlined = o0o00000;
            this.$receiver$inlined = obj;
            o0ooO.o00oo0(o00ooo0o2, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public Object invokeSuspend(@NotNull Object obj) {
            int i = this.label;
            if (i == 0) {
                this.label = 1;
                oo0ooO.o00oo0(obj);
                o0ooO.o00oo0(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((o0O00000) o0OOO0OO.o00oo0O(this.$this_createCoroutineUnintercepted$inlined, 2)).invoke(this.$receiver$inlined, this);
            } else if (i == 1) {
                this.label = 2;
                oo0ooO.o00oo0(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    @o0OOO00({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,204:1\n127#2:205\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class o00oo00O extends o0OOO0.o00oOo0O {
        public final /* synthetic */ Object $receiver$inlined;
        public final /* synthetic */ o0O00000 $this_createCoroutineUnintercepted$inlined;
        private int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oo00O(o0OO.o00oOo0O o00ooo0o2, o00oo0 o00oo0Var, o0O00000 o0o00000, Object obj) {
            super(o00ooo0o2, o00oo0Var);
            this.$this_createCoroutineUnintercepted$inlined = o0o00000;
            this.$receiver$inlined = obj;
            o0ooO.o00oo0(o00ooo0o2, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public Object invokeSuspend(@NotNull Object obj) {
            int i = this.label;
            if (i == 0) {
                this.label = 1;
                oo0ooO.o00oo0(obj);
                o0ooO.o00oo0(this.$this_createCoroutineUnintercepted$inlined, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((o0O00000) o0OOO0OO.o00oo0O(this.$this_createCoroutineUnintercepted$inlined, 2)).invoke(this.$receiver$inlined, this);
            } else if (i == 1) {
                this.label = 2;
                oo0ooO.o00oo0(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    @o0OO00o0(version = "1.3")
    public static final <T> o0OO.o00oOo0O<oO0Ooooo> o00oOOo0(o0OO.o00oOo0O<? super T> o00ooo0o2, o00oo<? super o0OO.o00oOo0O<? super T>, ? extends Object> o00ooVar) {
        o00oo0 context = o00ooo0o2.getContext();
        return context == o00oo0O0.INSTANCE ? new o00oOOo0(o00ooo0o2, o00ooVar) : new o00oOOoO(o00ooo0o2, context, o00ooVar);
    }

    @o0OO00o0(version = "1.3")
    @NotNull
    public static final <T> o0OO.o00oOo0O<oO0Ooooo> o00oOOoO(@NotNull o00oo<? super o0OO.o00oOo0O<? super T>, ? extends Object> o00ooVar, @NotNull o0OO.o00oOo0O<? super T> o00ooo0o2) {
        o0ooO.o00oo0O0(o00ooVar, "<this>");
        o0ooO.o00oo0O0(o00ooo0o2, "completion");
        o0ooO.o00oo0O0(o00ooo0o2, "completion");
        if (o00ooVar instanceof o0OOO0.o00oOOo0) {
            return ((o0OOO0.o00oOOo0) o00ooVar).create(o00ooo0o2);
        }
        o00oo0 context = o00ooo0o2.getContext();
        return context == o00oo0O0.INSTANCE ? new C0169o00oOo00(o00ooo0o2, o00ooVar) : new o00oOo0O(o00ooo0o2, context, o00ooVar);
    }

    @o0OO00o0(version = "1.3")
    @NotNull
    public static final <R, T> o0OO.o00oOo0O<oO0Ooooo> o00oOo00(@NotNull o0O00000<? super R, ? super o0OO.o00oOo0O<? super T>, ? extends Object> o0o00000, R r, @NotNull o0OO.o00oOo0O<? super T> o00ooo0o2) {
        o0ooO.o00oo0O0(o0o00000, "<this>");
        o0ooO.o00oo0O0(o00ooo0o2, "completion");
        o0ooO.o00oo0O0(o00ooo0o2, "completion");
        if (o0o00000 instanceof o0OOO0.o00oOOo0) {
            return ((o0OOO0.o00oOOo0) o0o00000).create(r, o00ooo0o2);
        }
        o00oo0 context = o00ooo0o2.getContext();
        return context == o00oo0O0.INSTANCE ? new o00oOoO(o00ooo0o2, o0o00000, r) : new o00oo00O(o00ooo0o2, context, o0o00000, r);
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.3")
    public static final <T> Object o00oOo0O(o00oo<? super o0OO.o00oOo0O<? super T>, ? extends Object> o00ooVar, o0OO.o00oOo0O<? super T> o00ooo0o2) {
        o0ooO.o00oo0O0(o00ooVar, "<this>");
        o0ooO.o00oo0O0(o00ooo0o2, "completion");
        return ((o00oo) o0OOO0OO.o00oo0O(o00ooVar, 1)).invoke(o00ooo0o2);
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.3")
    public static final <R, T> Object o00oOo0o(o0O00000<? super R, ? super o0OO.o00oOo0O<? super T>, ? extends Object> o0o00000, R r, o0OO.o00oOo0O<? super T> o00ooo0o2) {
        o0ooO.o00oo0O0(o0o00000, "<this>");
        o0ooO.o00oo0O0(o00ooo0o2, "completion");
        return ((o0O00000) o0OOO0OO.o00oo0O(o0o00000, 2)).invoke(r, o00ooo0o2);
    }

    @o0OOO0OO.o00oo00O
    public static final <R, P, T> Object o00oOoO0(o0O0000O<? super R, ? super P, ? super o0OO.o00oOo0O<? super T>, ? extends Object> o0o0000o, R r, P p, o0OO.o00oOo0O<? super T> o00ooo0o2) {
        o0ooO.o00oo0O0(o0o0000o, "<this>");
        o0ooO.o00oo0O0(o00ooo0o2, "completion");
        return ((o0O0000O) o0OOO0OO.o00oo0O(o0o0000o, 3)).invoke(r, p, o00ooo0o2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO00o0(version = "1.3")
    @NotNull
    public static final <T> o0OO.o00oOo0O<T> o00oOooO(@NotNull o0OO.o00oOo0O<? super T> o00ooo0o2) {
        o0OO.o00oOo0O<T> o00ooo0o3;
        o0ooO.o00oo0O0(o00ooo0o2, "<this>");
        o0OOO0.o00oOo0O o00ooo0o4 = o00ooo0o2 instanceof o0OOO0.o00oOo0O ? (o0OOO0.o00oOo0O) o00ooo0o2 : null;
        return (o00ooo0o4 == null || (o00ooo0o3 = (o0OO.o00oOo0O<T>) o00ooo0o4.intercepted()) == null) ? o00ooo0o2 : o00ooo0o3;
    }
}
