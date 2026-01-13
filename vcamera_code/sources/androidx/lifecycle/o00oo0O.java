package androidx.lifecycle;

import com.google.firebase.analytics.FirebaseAnalytics;
import o0OO0o.oO0Ooooo;
import o0OOo00O.oOo000o0;
import o0OOo00O.ooOOOOoo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes.dex */
public final class o00oo0O<T> extends o0O0OOO0<T> {
    @Nullable

    /* renamed from: o00oo0  reason: collision with root package name */
    public o00oOo0O<T> f3300o00oo0;
    @Nullable

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public o0 f3301o00oo0OO;

    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends o0OOOOO0.o0O0OO implements o0OOOO.o00oOOo0<oO0Ooooo> {
        public final /* synthetic */ o00oo0O<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(o00oo0O<T> o00oo0o2) {
            super(0);
            this.this$0 = o00oo0o2;
        }

        @Override // o0OOOO.o00oOOo0
        public /* bridge */ /* synthetic */ oO0Ooooo invoke() {
            invoke2();
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.f3300o00oo0 = null;
        }
    }

    @o0OOO0.o00oo00O(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", i = {0}, l = {235}, m = "clearSource$lifecycle_livedata_ktx_release", n = {"this"}, s = {"L$0"})
    /* loaded from: classes.dex */
    public static final class o00oOOoO extends o0OOO0.o00oOo0O {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ o00oo0O<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOoO(o00oo0O<T> o00oo0o2, o0OO.o00oOo0O<? super o00oOOoO> o00ooo0o2) {
            super(o00ooo0o2);
            this.this$0 = o00oo0o2;
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.o0O0o(this);
        }
    }

    @o0OOO0.o00oo00O(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", i = {0, 0, 1}, l = {228, 229}, m = "emitSource$lifecycle_livedata_ktx_release", n = {"this", FirebaseAnalytics.Param.SOURCE, "this"}, s = {"L$0", "L$1", "L$0"})
    /* loaded from: classes.dex */
    public static final class o00oOo00 extends o0OOO0.o00oOo0O {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ o00oo0O<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo00(o00oo0O<T> o00oo0o2, o0OO.o00oOo0O<? super o00oOo00> o00ooo0o2) {
            super(o00ooo0o2);
            this.this$0 = o00oo0o2;
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.o00oo(null, this);
        }
    }

    public o00oo0O(@NotNull o0OO.o00oo0 o00oo0Var, long j, @NotNull o0OOOO.o0O00000<? super o0O0OO0<T>, ? super o0OO.o00oOo0O<? super oO0Ooooo>, ? extends Object> o0o00000) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "context");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "block");
        this.f3300o00oo0 = new o00oOo0O<>(this, o0o00000, j, o0OOo00O.o0O.o00oOOo0(o0OOo00O.o0OOO00.o00oOo0O().o0O0oo().plus(o00oo0Var).plus(new oOo000o0((ooOOOOoo) o00oo0Var.get(ooOOOOoo.f14136o00oOoO)))), new o00oOOo0(this));
    }

    public /* synthetic */ o00oo0O(o0OO.o00oo0 o00oo0Var, long j, o0OOOO.o0O00000 o0o00000, int i, o0OOOOO0.o0O00 o0o00) {
        this((i & 1) != 0 ? o0OO.o00oo0O0.INSTANCE : o00oo0Var, (i & 2) != 0 ? 5000L : j, o0o00000);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063 A[RETURN] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o00oo(@org.jetbrains.annotations.NotNull androidx.lifecycle.LiveData<T> r6, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super o0OOo00O.o0OOO0OO> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.lifecycle.o00oo0O.o00oOo00
            if (r0 == 0) goto L13
            r0 = r7
            androidx.lifecycle.o00oo0O$o00oOo00 r0 = (androidx.lifecycle.o00oo0O.o00oOo00) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.lifecycle.o00oo0O$o00oOo00 r0 = new androidx.lifecycle.o00oo0O$o00oOo00
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.L$0
            androidx.lifecycle.o00oo0O r6 = (androidx.lifecycle.o00oo0O) r6
            o0OO0o.oo0ooO.o00oo0(r7)
            goto L64
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.L$1
            androidx.lifecycle.LiveData r6 = (androidx.lifecycle.LiveData) r6
            java.lang.Object r2 = r0.L$0
            androidx.lifecycle.o00oo0O r2 = (androidx.lifecycle.o00oo0O) r2
            o0OO0o.oo0ooO.o00oo0(r7)
            r7 = r6
            r6 = r2
            goto L56
        L44:
            o0OO0o.oo0ooO.o00oo0(r7)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r5.o0O0o(r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r7 = r6
            r6 = r5
        L56:
            r0.L$0 = r6
            r2 = 0
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r7 = androidx.lifecycle.o0O0o.o00oOOo0(r6, r7, r0)
            if (r7 != r1) goto L64
            return r1
        L64:
            androidx.lifecycle.o0 r7 = (androidx.lifecycle.o0) r7
            r6.f3301o00oo0OO = r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.o00oo0O.o00oo(androidx.lifecycle.LiveData, o0OO.o00oOo0O):java.lang.Object");
    }

    @Override // androidx.lifecycle.o0O0OOO0, androidx.lifecycle.LiveData
    public void o00oo0() {
        super.o00oo0();
        o00oOo0O<T> o00ooo0o2 = this.f3300o00oo0;
        if (o00ooo0o2 != null) {
            o00ooo0o2.o00oOoO0();
        }
    }

    @Override // androidx.lifecycle.o0O0OOO0, androidx.lifecycle.LiveData
    public void o00oo00O() {
        super.o00oo00O();
        o00oOo0O<T> o00ooo0o2 = this.f3300o00oo0;
        if (o00ooo0o2 != null) {
            o00ooo0o2.o00oOoO();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o0O0o(@org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.lifecycle.o00oo0O.o00oOOoO
            if (r0 == 0) goto L13
            r0 = r5
            androidx.lifecycle.o00oo0O$o00oOOoO r0 = (androidx.lifecycle.o00oo0O.o00oOOoO) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.lifecycle.o00oo0O$o00oOOoO r0 = new androidx.lifecycle.o00oo0O$o00oOOoO
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.L$0
            androidx.lifecycle.o00oo0O r0 = (androidx.lifecycle.o00oo0O) r0
            o0OO0o.oo0ooO.o00oo0(r5)
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            o0OO0o.oo0ooO.o00oo0(r5)
            androidx.lifecycle.o0 r5 = r4.f3301o00oo0OO
            if (r5 == 0) goto L45
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.o00oOo00(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            r5 = 0
            r0.f3301o00oo0OO = r5
            o0OO0o.oO0Ooooo r5 = o0OO0o.oO0Ooooo.f13240o00oOOo0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.o00oo0O.o0O0o(o0OO.o00oOo0O):java.lang.Object");
    }
}
