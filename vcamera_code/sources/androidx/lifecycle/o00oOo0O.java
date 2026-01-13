package androidx.lifecycle;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import o0OO0o.oO0Ooooo;
import o0OOo00O.ooOOOOoo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes.dex */
public final class o00oOo0O<T> {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o00oo0O<T> f3281o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0OOOO.o0O00000<o0O0OO0<T>, o0OO.o00oOo0O<? super oO0Ooooo>, Object> f3282o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final long f3283o00oOo00;
    @NotNull

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final o0OOOO.o00oOOo0<oO0Ooooo> f3284o00oOo0O;
    @Nullable

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public ooOOOOoo f3285o00oOo0o;
    @Nullable

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public ooOOOOoo f3286o00oOoO0;
    @NotNull

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final o0OOo00O.o0O0oo00 f3287o00oOooO;

    @o0OOO0.o00oo00O(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", i = {}, l = {TsExtractor.TS_PACKET_SIZE}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends o0OOO0.o0 implements o0OOOO.o0O00000<o0OOo00O.o0O0oo00, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public int label;
        public final /* synthetic */ o00oOo0O<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(o00oOo0O<T> o00ooo0o2, o0OO.o00oOo0O<? super o00oOOo0> o00ooo0o3) {
            super(2, o00ooo0o3);
            this.this$0 = o00ooo0o2;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            return new o00oOOo0(this.this$0, o00ooo0o2);
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
                long j = this.this$0.f3283o00oOo00;
                this.label = 1;
                if (o0OOo00O.o0OO0O0.o00oOOoO(j, this) == o00oooo02) {
                    return o00oooo02;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                o0OO0o.oo0ooO.o00oo0(obj);
            }
            if (!this.this$0.f3281o00oOOo0.o00oOoO()) {
                ooOOOOoo oooooooo = this.this$0.f3285o00oOo0o;
                if (oooooooo != null) {
                    ooOOOOoo.o00oOOo0.o00oOOoO(oooooooo, null, 1, null);
                }
                this.this$0.f3285o00oOo0o = null;
            }
            return oO0Ooooo.f13240o00oOOo0;
        }
    }

    @o0OOO0.o00oo00O(c = "androidx.lifecycle.BlockRunner$maybeRun$1", f = "CoroutineLiveData.kt", i = {}, l = {177}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class o00oOOoO extends o0OOO0.o0 implements o0OOOO.o0O00000<o0OOo00O.o0O0oo00, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        private /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ o00oOo0O<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOoO(o00oOo0O<T> o00ooo0o2, o0OO.o00oOo0O<? super o00oOOoO> o00ooo0o3) {
            super(2, o00ooo0o3);
            this.this$0 = o00ooo0o2;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o00oOOoO o00ooooo2 = new o00oOOoO(this.this$0, o00ooo0o2);
            o00ooooo2.L$0 = obj;
            return o00ooooo2;
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
                o0O0OO o0o0oo = new o0O0OO(this.this$0.f3281o00oOOo0, ((o0OOo00O.o0O0oo00) this.L$0).o0O000O());
                o0OOOO.o0O00000<o0O0OO0<T>, o0OO.o00oOo0O<? super oO0Ooooo>, Object> o0o00000 = this.this$0.f3282o00oOOoO;
                this.label = 1;
                if (o0o00000.invoke(o0o0oo, this) == o00oooo02) {
                    return o00oooo02;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                o0OO0o.oo0ooO.o00oo0(obj);
            }
            this.this$0.f3284o00oOo0O.invoke();
            return oO0Ooooo.f13240o00oOOo0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o00oOo0O(@NotNull o00oo0O<T> o00oo0o2, @NotNull o0OOOO.o0O00000<? super o0O0OO0<T>, ? super o0OO.o00oOo0O<? super oO0Ooooo>, ? extends Object> o0o00000, long j, @NotNull o0OOo00O.o0O0oo00 o0o0oo00, @NotNull o0OOOO.o00oOOo0<oO0Ooooo> o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0o2, "liveData");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00000, "block");
        o0OOOOO0.o0ooO.o00oo0O0(o0o0oo00, "scope");
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "onDone");
        this.f3281o00oOOo0 = o00oo0o2;
        this.f3282o00oOOoO = o0o00000;
        this.f3283o00oOo00 = j;
        this.f3287o00oOooO = o0o0oo00;
        this.f3284o00oOo0O = o00oooo02;
    }

    @o00oOooO.o0O
    public final void o00oOoO() {
        ooOOOOoo oooooooo = this.f3286o00oOoO0;
        if (oooooooo != null) {
            ooOOOOoo.o00oOOo0.o00oOOoO(oooooooo, null, 1, null);
        }
        this.f3286o00oOoO0 = null;
        if (this.f3285o00oOo0o != null) {
            return;
        }
        this.f3285o00oOo0o = o0OOo00O.o0O00000.o00oOo0o(this.f3287o00oOooO, null, null, new o00oOOoO(this, null), 3, null);
    }

    @o00oOooO.o0O
    public final void o00oOoO0() {
        if (this.f3286o00oOoO0 != null) {
            throw new IllegalStateException("Cancel call cannot happen without a maybeRun".toString());
        }
        this.f3286o00oOoO0 = o0OOo00O.o0O00000.o00oOo0o(this.f3287o00oOooO, o0OOo00O.o0OOO00.o00oOo0O().o0O0oo(), null, new o00oOOo0(this, null), 2, null);
    }
}
