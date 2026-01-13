package o0OOo0O0;

import kotlin.Metadata;
import o0OO0o.oO0Ooooo;
import o0OO0o.oo0ooO;
import o0OOO0.o00oOo0O;
import o0OOo00O.o0OOO00;
import o0OOo00O.oO000;
import o0OOo00O.oO00Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007\u001a1\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a1\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"", "delayMillis", "initialDelayMillis", "Lo0OO/o00oo0;", "context", "Lo0OOo0O0/o0O0o00O;", "mode", "Lo0OOo0O0/o0O0OO;", "Lo0OO0o/oO0Ooooo;", "o00oOo0O", "Lo0OOo0O0/o0OooO0;", "channel", "o00oOooO", "(JJLo0OOo0O0/o0OooO0;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "o00oOo00", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class o0O0o00 {

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 1, 1, 2, 2}, l = {106, 108, 109}, m = "fixedDelayTicker", n = {"channel", "delayMillis", "channel", "delayMillis", "channel", "delayMillis"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o00oOo0O {
        public long J$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public o00oOOo0(o0OO.o00oOo0O<? super o00oOOo0> o00ooo0o2) {
            super(o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return o0O0o00.o00oOo00(0L, 0L, null, this);
        }
    }

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, l = {84, 88, 94, 96}, m = "fixedPeriodTicker", n = {"channel", "delayMillis", "deadline", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs"}, s = {"L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1"})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO extends o00oOo0O {
        public long J$0;
        public long J$1;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public o00oOOoO(o0OO.o00oOo0O<? super o00oOOoO> o00ooo0o2) {
            super(o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return o0O0o00.o00oOooO(0L, 0L, null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lo0OOo0O0/o0ooO;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", f = "TickerChannels.kt", i = {}, l = {72, 73}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00oOo00 extends o0OOO0.o0 implements o0OOOO.o0O00000<o0ooO<? super oO0Ooooo>, o0OO.o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ long $delayMillis;
        public final /* synthetic */ long $initialDelayMillis;
        public final /* synthetic */ o0O0o00O $mode;
        private /* synthetic */ Object L$0;
        public int label;

        @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public /* synthetic */ class o00oOOo0 {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public static final /* synthetic */ int[] f14306o00oOOo0;

            static {
                int[] iArr = new int[o0O0o00O.values().length];
                iArr[o0O0o00O.FIXED_PERIOD.ordinal()] = 1;
                iArr[o0O0o00O.FIXED_DELAY.ordinal()] = 2;
                f14306o00oOOo0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo00(o0O0o00O o0o0o00o, long j, long j2, o0OO.o00oOo0O<? super o00oOo00> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$mode = o0o0o00o;
            this.$delayMillis = j;
            this.$initialDelayMillis = j2;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o0OO.o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
            o00oOo00 o00ooo002 = new o00oOo00(this.$mode, this.$delayMillis, this.$initialDelayMillis, o00ooo0o2);
            o00ooo002.L$0 = obj;
            return o00ooo002;
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(@NotNull o0ooO<? super oO0Ooooo> o0ooo, @Nullable o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o00oOo00) create(o0ooo, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                oo0ooO.o00oo0(obj);
                o0ooO o0ooo = (o0ooO) this.L$0;
                int i2 = o00oOOo0.f14306o00oOOo0[this.$mode.ordinal()];
                if (i2 == 1) {
                    long j = this.$delayMillis;
                    long j2 = this.$initialDelayMillis;
                    o0OooO0 o00oOo0O2 = o0ooo.o00oOo0O();
                    this.label = 1;
                    if (o0O0o00.o00oOooO(j, j2, o00oOo0O2, this) == o00oooo02) {
                        return o00oooo02;
                    }
                } else if (i2 == 2) {
                    long j3 = this.$delayMillis;
                    long j4 = this.$initialDelayMillis;
                    o0OooO0 o00oOo0O3 = o0ooo.o00oOo0O();
                    this.label = 2;
                    if (o0O0o00.o00oOo00(j3, j4, o00oOo0O3, this) == o00oooo02) {
                        return o00oooo02;
                    }
                }
            } else if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                oo0ooO.o00oo0(obj);
            }
            return oO0Ooooo.f13240o00oOOo0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007b -> B:14:0x0032). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o00oOo00(long r6, long r8, o0OOo0O0.o0OooO0<? super o0OO0o.oO0Ooooo> r10, o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> r11) {
        /*
            boolean r0 = r11 instanceof o0OOo0O0.o0O0o00.o00oOOo0
            if (r0 == 0) goto L13
            r0 = r11
            o0OOo0O0.o0O0o00$o00oOOo0 r0 = (o0OOo0O0.o0O0o00.o00oOOo0) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            o0OOo0O0.o0O0o00$o00oOOo0 r0 = new o0OOo0O0.o0O0o00$o00oOOo0
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L51
            if (r2 == r5) goto L46
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            long r6 = r0.J$0
            java.lang.Object r8 = r0.L$0
            o0OOo0O0.o0OooO0 r8 = (o0OOo0O0.o0OooO0) r8
            o0OO0o.oo0ooO.o00oo0(r11)
        L32:
            r10 = r8
            goto L61
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            long r6 = r0.J$0
            java.lang.Object r8 = r0.L$0
            o0OOo0O0.o0OooO0 r8 = (o0OOo0O0.o0OooO0) r8
            o0OO0o.oo0ooO.o00oo0(r11)
            goto L71
        L46:
            long r6 = r0.J$0
            java.lang.Object r8 = r0.L$0
            r10 = r8
            o0OOo0O0.o0OooO0 r10 = (o0OOo0O0.o0OooO0) r10
            o0OO0o.oo0ooO.o00oo0(r11)
            goto L61
        L51:
            o0OO0o.oo0ooO.o00oo0(r11)
            r0.L$0 = r10
            r0.J$0 = r6
            r0.label = r5
            java.lang.Object r8 = o0OOo00O.o0OO0O0.o00oOOoO(r8, r0)
            if (r8 != r1) goto L61
            return r1
        L61:
            o0OO0o.oO0Ooooo r8 = o0OO0o.oO0Ooooo.f13240o00oOOo0
            r0.L$0 = r10
            r0.J$0 = r6
            r0.label = r4
            java.lang.Object r8 = r10.o00ooOo(r8, r0)
            if (r8 != r1) goto L70
            return r1
        L70:
            r8 = r10
        L71:
            r0.L$0 = r8
            r0.J$0 = r6
            r0.label = r3
            java.lang.Object r9 = o0OOo00O.o0OO0O0.o00oOOoO(r6, r0)
            if (r9 != r1) goto L32
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O0o00.o00oOo00(long, long, o0OOo0O0.o0OooO0, o0OO.o00oOo0O):java.lang.Object");
    }

    @oO00Oo0
    @NotNull
    public static final o0O0OO<oO0Ooooo> o00oOo0O(long j, long j2, @NotNull o0OO.o00oo0 o00oo0Var, @NotNull o0O0o00O o0o0o00o) {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("Expected non-negative delay, but has " + j + " ms").toString());
        }
        if (j2 >= 0) {
            return o0O0O0Oo.o00oOo00(oO000.f14062o00oo0O0, o0OOO00.o00oOoO0().plus(o00oo0Var), 0, new o00oOo00(o0o0o00o, j, j2, null));
        }
        throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j2 + " ms").toString());
    }

    public static /* synthetic */ o0O0OO o00oOo0o(long j, long j2, o0OO.o00oo0 o00oo0Var, o0O0o00O o0o0o00o, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = j;
        }
        if ((i & 4) != 0) {
            o00oo0Var = o0OO.o00oo0O0.INSTANCE;
        }
        if ((i & 8) != 0) {
            o0o0o00o = o0O0o00O.FIXED_PERIOD;
        }
        return o00oOo0O(j, j2, o00oo0Var, o0o0o00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fb A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00e5 -> B:30:0x0094). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00f9 -> B:18:0x0042). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o00oOooO(long r19, long r21, o0OOo0O0.o0OooO0<? super o0OO0o.oO0Ooooo> r23, o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> r24) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O0o00.o00oOooO(long, long, o0OOo0O0.o0OooO0, o0OO.o00oOo0O):java.lang.Object");
    }
}
