package o0OOo0Oo;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OO.o00oo0;
import o0OO0o.o0O0oo0o;
import o0OO0o.oO0Ooooo;
import o0OO0o.oo0ooO;
import o0OO0oO.o0O0o000;
import o0OOO0.o0;
import o0OOO0.o00oo00O;
import o0OOOO.o00oo;
import o0OOOO.o0O00000;
import o0OOOO.o0O0000O;
import o0OOOOO0.o0O0OO;
import o0OOo00O.o0O;
import o0OOo00O.o0O0oo00;
import o0OOo00O.o0oO0O0o;
import o0OOo00O.oO00O0o0;
import o0OOo0O0.o0O000O;
import o0OOo0O0.o0O0O0Oo;
import o0OOo0O0.o0O0OO;
import o0OOo0O0.o0OooO0;
import o0OOo0O0.o0ooO;
import o0OOo0OO.o0OO0;
import o0OOo0OO.o0OO00o;
import o0OOo0o0.ooOOOOoo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T1
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0092\u0001\u0010\u000e\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u00010\u00030\u000629\u0010\r\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\fH\u0081@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001ap\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\"\u0004\b\u0000\u0010\u0010\"\u0004\b\u0001\u0010\u0011\"\u0004\b\u0002\u0010\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042(\u0010\r\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015*\u001c\b\u0002\u0010\u0017\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00162\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"R", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo0OO/o0OO0;", "", "Lo0OOo0OO/o0OO00o;", "flows", "Lkotlin/Function0;", "arrayFactory", "Lkotlin/Function3;", "Lo0OO/o00oOo0O;", "Lo0OO0o/oO0Ooooo;", "", "Lo0OO0o/o0O000Oo;", "transform", "o00oOOo0", "(Lo0OOo0OO/o0OO0;[Lo0OOo0OO/o0OO00o;Lo0OOOO/o00oOOo0;Lo0OOOO/o0O0000O;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "T1", "T2", "flow", "flow2", o0OO000o.o00oOOoO.f12961o00oOo00, "(Lo0OOo0OO/o0OO00o;Lo0OOo0OO/o0OO00o;Lo0OOOO/o0O0000O;)Lo0OOo0OO/o0OO00o;", "Lo0OO0oO/o0O0o000;", "Update", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO0OOO00 {

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"R", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo00O/o0O0oo00;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @o00oo00O(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {57, 79, 82}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o0 implements o0O00000<o0O0oo00, o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ o0OOOO.o00oOOo0<T[]> $arrayFactory;
        public final /* synthetic */ o0OO00o<T>[] $flows;
        public final /* synthetic */ o0OO0<R> $this_combineInternal;
        public final /* synthetic */ o0O0000O<o0OO0<? super R>, T[], o00oOo0O<? super oO0Ooooo>, Object> $transform;
        public int I$0;
        public int I$1;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"R", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo00O/o0O0oo00;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @o00oo00O(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o0OOo0Oo.oO0OOO00$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0207o00oOOo0 extends o0 implements o0O00000<o0O0oo00, o00oOo0O<? super oO0Ooooo>, Object> {
            public final /* synthetic */ o0OO00o<T>[] $flows;
            public final /* synthetic */ int $i;
            public final /* synthetic */ AtomicInteger $nonClosed;
            public final /* synthetic */ o0O000O<o0O0o000<Object>> $resultChannel;
            public int label;

            @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "value", "Lo0OO0o/oO0Ooooo;", "emit", "(Ljava/lang/Object;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            /* renamed from: o0OOo0Oo.oO0OOO00$o00oOOo0$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0208o00oOOo0<T> implements o0OO0 {

                /* renamed from: o00oo0O  reason: collision with root package name */
                public final /* synthetic */ int f14543o00oo0O;

                /* renamed from: o00oo0O0  reason: collision with root package name */
                public final /* synthetic */ o0O000O<o0O0o000<Object>> f14544o00oo0O0;

                @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
                @o00oo00O(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", i = {}, l = {35, 36}, m = "emit", n = {}, s = {})
                /* renamed from: o0OOo0Oo.oO0OOO00$o00oOOo0$o00oOOo0$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0209o00oOOo0 extends o0OOO0.o00oOo0O {
                    public int label;
                    public /* synthetic */ Object result;
                    public final /* synthetic */ C0208o00oOOo0<T> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0209o00oOOo0(C0208o00oOOo0<? super T> c0208o00oOOo0, o00oOo0O<? super C0209o00oOOo0> o00ooo0o2) {
                        super(o00ooo0o2);
                        this.this$0 = c0208o00oOOo0;
                    }

                    @Override // o0OOO0.o00oOOo0
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return this.this$0.emit(null, this);
                    }
                }

                public C0208o00oOOo0(o0O000O<o0O0o000<Object>> o0o000o, int i) {
                    this.f14544o00oo0O0 = o0o000o;
                    this.f14543o00oo0O = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0053 A[RETURN] */
                @Override // o0OOo0OO.o0OO0
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r7, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof o0OOo0Oo.oO0OOO00.o00oOOo0.C0207o00oOOo0.C0208o00oOOo0.C0209o00oOOo0
                        if (r0 == 0) goto L13
                        r0 = r8
                        o0OOo0Oo.oO0OOO00$o00oOOo0$o00oOOo0$o00oOOo0$o00oOOo0 r0 = (o0OOo0Oo.oO0OOO00.o00oOOo0.C0207o00oOOo0.C0208o00oOOo0.C0209o00oOOo0) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        o0OOo0Oo.oO0OOO00$o00oOOo0$o00oOOo0$o00oOOo0$o00oOOo0 r0 = new o0OOo0Oo.oO0OOO00$o00oOOo0$o00oOOo0$o00oOOo0$o00oOOo0
                        r0.<init>(r6, r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L36
                        if (r2 == r4) goto L32
                        if (r2 != r3) goto L2a
                        o0OO0o.oo0ooO.o00oo0(r8)
                        goto L54
                    L2a:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L32:
                        o0OO0o.oo0ooO.o00oo0(r8)
                        goto L4b
                    L36:
                        o0OO0o.oo0ooO.o00oo0(r8)
                        o0OOo0O0.o0O000O<o0OO0oO.o0O0o000<java.lang.Object>> r8 = r6.f14544o00oo0O0
                        o0OO0oO.o0O0o000 r2 = new o0OO0oO.o0O0o000
                        int r5 = r6.f14543o00oo0O
                        r2.<init>(r5, r7)
                        r0.label = r4
                        java.lang.Object r7 = r8.o00ooOo(r2, r0)
                        if (r7 != r1) goto L4b
                        return r1
                    L4b:
                        r0.label = r3
                        java.lang.Object r7 = o0OOo00O.oO0O0Oo0.o00oOOo0(r0)
                        if (r7 != r1) goto L54
                        return r1
                    L54:
                        o0OO0o.oO0Ooooo r7 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o0OOo0Oo.oO0OOO00.o00oOOo0.C0207o00oOOo0.C0208o00oOOo0.emit(java.lang.Object, o0OO.o00oOo0O):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0207o00oOOo0(o0OO00o<? extends T>[] o0oo00oArr, int i, AtomicInteger atomicInteger, o0O000O<o0O0o000<Object>> o0o000o, o00oOo0O<? super C0207o00oOOo0> o00ooo0o2) {
                super(2, o00ooo0o2);
                this.$flows = o0oo00oArr;
                this.$i = i;
                this.$nonClosed = atomicInteger;
                this.$resultChannel = o0o000o;
            }

            @Override // o0OOO0.o00oOOo0
            @NotNull
            public final o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o00oOo0O<?> o00ooo0o2) {
                return new C0207o00oOOo0(this.$flows, this.$i, this.$nonClosed, this.$resultChannel, o00ooo0o2);
            }

            @Override // o0OOOO.o0O00000
            @Nullable
            public final Object invoke(@NotNull o0O0oo00 o0o0oo00, @Nullable o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
                return ((C0207o00oOOo0) create(o0o0oo00, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
            }

            @Override // o0OOO0.o00oOOo0
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                AtomicInteger atomicInteger;
                o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
                int i = this.label;
                try {
                    if (i == 0) {
                        oo0ooO.o00oo0(obj);
                        o0OO00o[] o0oo00oArr = this.$flows;
                        int i2 = this.$i;
                        o0OO00o o0oo00o = o0oo00oArr[i2];
                        C0208o00oOOo0 c0208o00oOOo0 = new C0208o00oOOo0(this.$resultChannel, i2);
                        this.label = 1;
                        if (o0oo00o.o00oOOo0(c0208o00oOOo0, this) == o00oooo02) {
                            return o00oooo02;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        oo0ooO.o00oo0(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        o0OooO0.o00oOOo0.o00oOOo0(this.$resultChannel, null, 1, null);
                    }
                    return oO0Ooooo.f13240o00oOOo0;
                } finally {
                    if (this.$nonClosed.decrementAndGet() == 0) {
                        o0OooO0.o00oOOo0.o00oOOo0(this.$resultChannel, null, 1, null);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOo0(o0OO00o<? extends T>[] o0oo00oArr, o0OOOO.o00oOOo0<T[]> o00oooo02, o0O0000O<? super o0OO0<? super R>, ? super T[], ? super o00oOo0O<? super oO0Ooooo>, ? extends Object> o0o0000o, o0OO0<? super R> o0oo0, o00oOo0O<? super o00oOOo0> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$flows = o0oo00oArr;
            this.$arrayFactory = o00oooo02;
            this.$transform = o0o0000o;
            this.$this_combineInternal = o0oo0;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o00oOo0O<?> o00ooo0o2) {
            o00oOOo0 o00oooo02 = new o00oOOo0(this.$flows, this.$arrayFactory, this.$transform, this.$this_combineInternal, o00ooo0o2);
            o00oooo02.L$0 = obj;
            return o00oooo02;
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(@NotNull o0O0oo00 o0o0oo00, @Nullable o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o00oOOo0) create(o0o0oo00, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00ea A[LOOP:0: B:28:0x00ea->B:34:0x0109, LOOP_START, PHI: r3 r10 
          PHI: (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:25:0x00e5, B:34:0x0109] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r10v5 o0OO0oO.o0O0o000) = (r10v4 o0OO0oO.o0O0o000), (r10v18 o0OO0oO.o0O0o000) binds: [B:25:0x00e5, B:34:0x0109] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Type inference failed for: r2v12, types: [int] */
        /* JADX WARN: Type inference failed for: r2v7, types: [int] */
        /* JADX WARN: Type inference failed for: r2v9, types: [int] */
        /* JADX WARN: Type inference failed for: r7v0, types: [o0OOo0OO.o0OO00o<T>[]] */
        /* JADX WARN: Type inference failed for: r7v4, types: [o0OOo0OO.o0OO00o[], o0OOo0OO.o0OO00o<T>[]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x012e -> B:20:0x00c5). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0163 -> B:45:0x015f). Please submit an issue!!! */
        @Override // o0OOO0.o00oOOo0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 361
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOo0Oo.oO0OOO00.o00oOOo0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"o0OOo0Oo/oO0O000o$o00oOOoO", "Lo0OOo0OO/o0OO00o;", "Lo0OOo0OO/o0OO0;", "collector", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "(Lo0OOo0OO/o0OO0;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO<R> implements o0OO00o<R> {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o0OO00o f14545o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OO00o f14546o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ o0O0000O f14547o00oo0Oo;

        public o00oOOoO(o0OO00o o0oo00o, o0OO00o o0oo00o2, o0O0000O o0o0000o) {
            this.f14546o00oo0O0 = o0oo00o;
            this.f14545o00oo0O = o0oo00o2;
            this.f14547o00oo0Oo = o0o0000o;
        }

        @Override // o0OOo0OO.o0OO00o
        @Nullable
        public Object o00oOOo0(@NotNull o0OO0<? super R> o0oo0, @NotNull o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            Object o00oOoO02 = o0O.o00oOoO0(new o00oOo00(o0oo0, this.f14546o00oo0O0, this.f14545o00oo0O, this.f14547o00oo0Oo, null), o00ooo0o2);
            return o00oOoO02 == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED ? o00oOoO02 : oO0Ooooo.f13240o00oOOo0;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "Lo0OOo00O/o0O0oo00;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @o00oo00O(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", i = {0}, l = {TsExtractor.TS_STREAM_TYPE_AC3}, m = "invokeSuspend", n = {"second"}, s = {"L$0"})
    /* loaded from: classes3.dex */
    public static final class o00oOo00 extends o0 implements o0O00000<o0O0oo00, o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ o0OO00o<T1> $flow;
        public final /* synthetic */ o0OO00o<T2> $flow2;
        public final /* synthetic */ o0OO0<R> $this_unsafeFlow;
        public final /* synthetic */ o0O0000O<T1, T2, o00oOo0O<? super R>, Object> $transform;
        private /* synthetic */ Object L$0;
        public int label;

        @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T1", "T2", "R", "", "it", "Lo0OO0o/oO0Ooooo;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: classes3.dex */
        public static final class o00oOOo0 extends o0O0OO implements o00oo<Throwable, oO0Ooooo> {
            public final /* synthetic */ o0oO0O0o $collectJob;
            public final /* synthetic */ o0OO0<R> $this_unsafeFlow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public o00oOOo0(o0oO0O0o o0oo0o0o, o0OO0<? super R> o0oo0) {
                super(1);
                this.$collectJob = o0oo0o0o;
                this.$this_unsafeFlow = o0oo0;
            }

            @Override // o0OOOO.o00oo
            public /* bridge */ /* synthetic */ oO0Ooooo invoke(Throwable th) {
                invoke2(th);
                return oO0Ooooo.f13240o00oOOo0;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th) {
                if (this.$collectJob.isActive()) {
                    this.$collectJob.o00oOOoO(new oO00O0oO(this.$this_unsafeFlow));
                }
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "Lo0OO0o/oO0Ooooo;", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @o00oo00O(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", i = {}, l = {TsExtractor.TS_STREAM_TYPE_HDMV_DTS}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes3.dex */
        public static final class o00oOOoO extends o0 implements o0O00000<oO0Ooooo, o00oOo0O<? super oO0Ooooo>, Object> {
            public final /* synthetic */ Object $cnt;
            public final /* synthetic */ o0OO00o<T1> $flow;
            public final /* synthetic */ o00oo0 $scopeContext;
            public final /* synthetic */ o0OOo0O0.o0O0OO<Object> $second;
            public final /* synthetic */ o0OO0<R> $this_unsafeFlow;
            public final /* synthetic */ o0O0000O<T1, T2, o00oOo0O<? super R>, Object> $transform;
            public int label;

            @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T1", "T2", "R", "value", "Lo0OO0o/oO0Ooooo;", "emit", "(Ljava/lang/Object;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            /* loaded from: classes3.dex */
            public static final class o00oOOo0<T> implements o0OO0 {

                /* renamed from: o00oo0O  reason: collision with root package name */
                public final /* synthetic */ Object f14548o00oo0O;

                /* renamed from: o00oo0O0  reason: collision with root package name */
                public final /* synthetic */ o00oo0 f14549o00oo0O0;

                /* renamed from: o00oo0Oo  reason: collision with root package name */
                public final /* synthetic */ o0OOo0O0.o0O0OO<Object> f14550o00oo0Oo;

                /* renamed from: o00oo0o  reason: collision with root package name */
                public final /* synthetic */ o0O0000O<T1, T2, o00oOo0O<? super R>, Object> f14551o00oo0o;

                /* renamed from: o00oo0o0  reason: collision with root package name */
                public final /* synthetic */ o0OO0<R> f14552o00oo0o0;

                @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "Lo0OO0o/oO0Ooooo;", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
                @o00oo00O(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", i = {}, l = {132, TsExtractor.TS_STREAM_TYPE_E_AC3, TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: o0OOo0Oo.oO0OOO00$o00oOo00$o00oOOoO$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0210o00oOOo0 extends o0 implements o0O00000<oO0Ooooo, o00oOo0O<? super oO0Ooooo>, Object> {
                    public final /* synthetic */ o0OOo0O0.o0O0OO<Object> $second;
                    public final /* synthetic */ o0OO0<R> $this_unsafeFlow;
                    public final /* synthetic */ o0O0000O<T1, T2, o00oOo0O<? super R>, Object> $transform;
                    public final /* synthetic */ T1 $value;
                    public Object L$0;
                    public int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0210o00oOOo0(o0OOo0O0.o0O0OO<? extends Object> o0o0oo, o0OO0<? super R> o0oo0, o0O0000O<? super T1, ? super T2, ? super o00oOo0O<? super R>, ? extends Object> o0o0000o, T1 t1, o00oOo0O<? super C0210o00oOOo0> o00ooo0o2) {
                        super(2, o00ooo0o2);
                        this.$second = o0o0oo;
                        this.$this_unsafeFlow = o0oo0;
                        this.$transform = o0o0000o;
                        this.$value = t1;
                    }

                    @Override // o0OOO0.o00oOOo0
                    @NotNull
                    public final o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o00oOo0O<?> o00ooo0o2) {
                        return new C0210o00oOOo0(this.$second, this.$this_unsafeFlow, this.$transform, this.$value, o00ooo0o2);
                    }

                    @Override // o0OOOO.o0O00000
                    public /* bridge */ /* synthetic */ Object invoke(oO0Ooooo oo0ooooo, o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
                        return invoke2(oo0ooooo, o00ooo0o2);
                    }

                    @Nullable
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final Object invoke2(@NotNull oO0Ooooo oo0ooooo, @Nullable o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
                        return ((C0210o00oOOo0) create(oo0ooooo, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:29:0x006a A[RETURN] */
                    @Override // o0OOO0.o00oOOo0
                    @org.jetbrains.annotations.Nullable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
                        /*
                            r8 = this;
                            o0OOO00o.o00oOOo0 r0 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                            int r1 = r8.label
                            r2 = 0
                            r3 = 3
                            r4 = 2
                            r5 = 1
                            if (r1 == 0) goto L2c
                            if (r1 == r5) goto L24
                            if (r1 == r4) goto L1c
                            if (r1 != r3) goto L14
                            o0OO0o.oo0ooO.o00oo0(r9)
                            goto L6b
                        L14:
                            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r9.<init>(r0)
                            throw r9
                        L1c:
                            java.lang.Object r1 = r8.L$0
                            o0OOo0OO.o0OO0 r1 = (o0OOo0OO.o0OO0) r1
                            o0OO0o.oo0ooO.o00oo0(r9)
                            goto L60
                        L24:
                            o0OO0o.oo0ooO.o00oo0(r9)
                            o0OOo0O0.o0O00 r9 = (o0OOo0O0.o0O00) r9
                            java.lang.Object r9 = r9.f14270o00oOOo0
                            goto L3a
                        L2c:
                            o0OO0o.oo0ooO.o00oo0(r9)
                            o0OOo0O0.o0O0OO<java.lang.Object> r9 = r8.$second
                            r8.label = r5
                            java.lang.Object r9 = r9.o00ooo0o(r8)
                            if (r9 != r0) goto L3a
                            return r0
                        L3a:
                            o0OOo0OO.o0OO0<R> r1 = r8.$this_unsafeFlow
                            boolean r5 = r9 instanceof o0OOo0O0.o0O00.o00oOo00
                            if (r5 == 0) goto L4c
                            java.lang.Throwable r9 = o0OOo0O0.o0O00.o00oOo0o(r9)
                            if (r9 != 0) goto L4b
                            o0OOo0Oo.oO00O0oO r9 = new o0OOo0Oo.oO00O0oO
                            r9.<init>(r1)
                        L4b:
                            throw r9
                        L4c:
                            o0OOOO.o0O0000O<T1, T2, o0OO.o00oOo0O<? super R>, java.lang.Object> r5 = r8.$transform
                            T1 r6 = r8.$value
                            o0OOo0o0.oO0o0o r7 = o0OOo0Oo.oOo000o0.f14562o00oOOo0
                            if (r9 != r7) goto L55
                            r9 = r2
                        L55:
                            r8.L$0 = r1
                            r8.label = r4
                            java.lang.Object r9 = r5.invoke(r6, r9, r8)
                            if (r9 != r0) goto L60
                            return r0
                        L60:
                            r8.L$0 = r2
                            r8.label = r3
                            java.lang.Object r9 = r1.emit(r9, r8)
                            if (r9 != r0) goto L6b
                            return r0
                        L6b:
                            o0OO0o.oO0Ooooo r9 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                            return r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: o0OOo0Oo.oO0OOO00.o00oOo00.o00oOOoO.o00oOOo0.C0210o00oOOo0.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
                @o00oo00O(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1", f = "Combine.kt", i = {}, l = {131}, m = "emit", n = {}, s = {})
                /* renamed from: o0OOo0Oo.oO0OOO00$o00oOo00$o00oOOoO$o00oOOo0$o00oOOoO  reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0211o00oOOoO extends o0OOO0.o00oOo0O {
                    public int label;
                    public /* synthetic */ Object result;
                    public final /* synthetic */ o00oOOo0<T> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0211o00oOOoO(o00oOOo0<? super T> o00oooo02, o00oOo0O<? super C0211o00oOOoO> o00ooo0o2) {
                        super(o00ooo0o2);
                        this.this$0 = o00oooo02;
                    }

                    @Override // o0OOO0.o00oOOo0
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return this.this$0.emit(null, this);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public o00oOOo0(o00oo0 o00oo0Var, Object obj, o0OOo0O0.o0O0OO<? extends Object> o0o0oo, o0OO0<? super R> o0oo0, o0O0000O<? super T1, ? super T2, ? super o00oOo0O<? super R>, ? extends Object> o0o0000o) {
                    this.f14549o00oo0O0 = o00oo0Var;
                    this.f14548o00oo0O = obj;
                    this.f14550o00oo0Oo = o0o0oo;
                    this.f14552o00oo0o0 = o0oo0;
                    this.f14551o00oo0o = o0o0000o;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // o0OOo0OO.o0OO0
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T1 r13, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> r14) {
                    /*
                        r12 = this;
                        boolean r0 = r14 instanceof o0OOo0Oo.oO0OOO00.o00oOo00.o00oOOoO.o00oOOo0.C0211o00oOOoO
                        if (r0 == 0) goto L13
                        r0 = r14
                        o0OOo0Oo.oO0OOO00$o00oOo00$o00oOOoO$o00oOOo0$o00oOOoO r0 = (o0OOo0Oo.oO0OOO00.o00oOo00.o00oOOoO.o00oOOo0.C0211o00oOOoO) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        o0OOo0Oo.oO0OOO00$o00oOo00$o00oOOoO$o00oOOo0$o00oOOoO r0 = new o0OOo0Oo.oO0OOO00$o00oOo00$o00oOOoO$o00oOOo0$o00oOOoO
                        r0.<init>(r12, r14)
                    L18:
                        java.lang.Object r14 = r0.result
                        o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        o0OO0o.oo0ooO.o00oo0(r14)
                        goto L4f
                    L27:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                        r13.<init>(r14)
                        throw r13
                    L2f:
                        o0OO0o.oo0ooO.o00oo0(r14)
                        o0OO.o00oo0 r14 = r12.f14549o00oo0O0
                        o0OO0o.oO0Ooooo r2 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                        java.lang.Object r4 = r12.f14548o00oo0O
                        o0OOo0Oo.oO0OOO00$o00oOo00$o00oOOoO$o00oOOo0$o00oOOo0 r11 = new o0OOo0Oo.oO0OOO00$o00oOo00$o00oOOoO$o00oOOo0$o00oOOo0
                        o0OOo0O0.o0O0OO<java.lang.Object> r6 = r12.f14550o00oo0Oo
                        o0OOo0OO.o0OO0<R> r7 = r12.f14552o00oo0o0
                        o0OOOO.o0O0000O<T1, T2, o0OO.o00oOo0O<? super R>, java.lang.Object> r8 = r12.f14551o00oo0o
                        r10 = 0
                        r5 = r11
                        r9 = r13
                        r5.<init>(r6, r7, r8, r9, r10)
                        r0.label = r3
                        java.lang.Object r13 = o0OOo0Oo.oO00OOOo.o00oOo00(r14, r2, r4, r11, r0)
                        if (r13 != r1) goto L4f
                        return r1
                    L4f:
                        o0OO0o.oO0Ooooo r13 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                        return r13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o0OOo0Oo.oO0OOO00.o00oOo00.o00oOOoO.o00oOOo0.emit(java.lang.Object, o0OO.o00oOo0O):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public o00oOOoO(o0OO00o<? extends T1> o0oo00o, o00oo0 o00oo0Var, Object obj, o0OOo0O0.o0O0OO<? extends Object> o0o0oo, o0OO0<? super R> o0oo0, o0O0000O<? super T1, ? super T2, ? super o00oOo0O<? super R>, ? extends Object> o0o0000o, o00oOo0O<? super o00oOOoO> o00ooo0o2) {
                super(2, o00ooo0o2);
                this.$flow = o0oo00o;
                this.$scopeContext = o00oo0Var;
                this.$cnt = obj;
                this.$second = o0o0oo;
                this.$this_unsafeFlow = o0oo0;
                this.$transform = o0o0000o;
            }

            @Override // o0OOO0.o00oOOo0
            @NotNull
            public final o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o00oOo0O<?> o00ooo0o2) {
                return new o00oOOoO(this.$flow, this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform, o00ooo0o2);
            }

            @Override // o0OOOO.o0O00000
            public /* bridge */ /* synthetic */ Object invoke(oO0Ooooo oo0ooooo, o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
                return invoke2(oo0ooooo, o00ooo0o2);
            }

            @Nullable
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(@NotNull oO0Ooooo oo0ooooo, @Nullable o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
                return ((o00oOOoO) create(oo0ooooo, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
            }

            @Override // o0OOO0.o00oOOo0
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    oo0ooO.o00oo0(obj);
                    o0OO00o<T1> o0oo00o = this.$flow;
                    o00oOOo0 o00oooo03 = new o00oOOo0(this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform);
                    this.label = 1;
                    if (o0oo00o.o00oOOo0(o00oooo03, this) == o00oooo02) {
                        return o00oooo02;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    oo0ooO.o00oo0(obj);
                }
                return oO0Ooooo.f13240o00oOOo0;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "Lo0OOo0O0/o0ooO;", "", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @o00oo00O(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", f = "Combine.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o0OOo0Oo.oO0OOO00$o00oOo00$o00oOo00  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0212o00oOo00 extends o0 implements o0O00000<o0ooO<? super Object>, o00oOo0O<? super oO0Ooooo>, Object> {
            public final /* synthetic */ o0OO00o<T2> $flow2;
            private /* synthetic */ Object L$0;
            public int label;

            @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T1", "T2", "R", "value", "Lo0OO0o/oO0Ooooo;", "emit", "(Ljava/lang/Object;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            /* renamed from: o0OOo0Oo.oO0OOO00$o00oOo00$o00oOo00$o00oOOo0 */
            /* loaded from: classes3.dex */
            public static final class o00oOOo0<T> implements o0OO0 {

                /* renamed from: o00oo0O0  reason: collision with root package name */
                public final /* synthetic */ o0ooO<Object> f14553o00oo0O0;

                @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
                @o00oo00O(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1", f = "Combine.kt", i = {}, l = {93}, m = "emit", n = {}, s = {})
                /* renamed from: o0OOo0Oo.oO0OOO00$o00oOo00$o00oOo00$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0213o00oOOo0 extends o0OOO0.o00oOo0O {
                    public int label;
                    public /* synthetic */ Object result;
                    public final /* synthetic */ o00oOOo0<T> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0213o00oOOo0(o00oOOo0<? super T> o00oooo02, o00oOo0O<? super C0213o00oOOo0> o00ooo0o2) {
                        super(o00ooo0o2);
                        this.this$0 = o00oooo02;
                    }

                    @Override // o0OOO0.o00oOOo0
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return this.this$0.emit(null, this);
                    }
                }

                public o00oOOo0(o0ooO<Object> o0ooo) {
                    this.f14553o00oo0O0 = o0ooo;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // o0OOo0OO.o0OO0
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T2 r5, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof o0OOo0Oo.oO0OOO00.o00oOo00.C0212o00oOo00.o00oOOo0.C0213o00oOOo0
                        if (r0 == 0) goto L13
                        r0 = r6
                        o0OOo0Oo.oO0OOO00$o00oOo00$o00oOo00$o00oOOo0$o00oOOo0 r0 = (o0OOo0Oo.oO0OOO00.o00oOo00.C0212o00oOo00.o00oOOo0.C0213o00oOOo0) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        o0OOo0Oo.oO0OOO00$o00oOo00$o00oOo00$o00oOOo0$o00oOOo0 r0 = new o0OOo0Oo.oO0OOO00$o00oOo00$o00oOo00$o00oOOo0$o00oOOo0
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        o0OO0o.oo0ooO.o00oo0(r6)
                        goto L45
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        o0OO0o.oo0ooO.o00oo0(r6)
                        o0OOo0O0.o0ooO<java.lang.Object> r6 = r4.f14553o00oo0O0
                        o0OOo0O0.o0OooO0 r6 = r6.o00oOo0O()
                        if (r5 != 0) goto L3c
                        o0OOo0o0.oO0o0o r5 = o0OOo0Oo.oOo000o0.f14562o00oOOo0
                    L3c:
                        r0.label = r3
                        java.lang.Object r5 = r6.o00ooOo(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        o0OO0o.oO0Ooooo r5 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o0OOo0Oo.oO0OOO00.o00oOo00.C0212o00oOo00.o00oOOo0.emit(java.lang.Object, o0OO.o00oOo0O):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0212o00oOo00(o0OO00o<? extends T2> o0oo00o, o00oOo0O<? super C0212o00oOo00> o00ooo0o2) {
                super(2, o00ooo0o2);
                this.$flow2 = o0oo00o;
            }

            @Override // o0OOO0.o00oOOo0
            @NotNull
            public final o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o00oOo0O<?> o00ooo0o2) {
                C0212o00oOo00 c0212o00oOo00 = new C0212o00oOo00(this.$flow2, o00ooo0o2);
                c0212o00oOo00.L$0 = obj;
                return c0212o00oOo00;
            }

            @Override // o0OOOO.o0O00000
            public /* bridge */ /* synthetic */ Object invoke(o0ooO<? super Object> o0ooo, o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
                return invoke2((o0ooO<Object>) o0ooo, o00ooo0o2);
            }

            @Nullable
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(@NotNull o0ooO<Object> o0ooo, @Nullable o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
                return ((C0212o00oOo00) create(o0ooo, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
            }

            @Override // o0OOO0.o00oOOo0
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    oo0ooO.o00oo0(obj);
                    o0OO00o<T2> o0oo00o = this.$flow2;
                    o00oOOo0 o00oooo03 = new o00oOOo0((o0ooO) this.L$0);
                    this.label = 1;
                    if (o0oo00o.o00oOOo0(o00oooo03, this) == o00oooo02) {
                        return o00oooo02;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    oo0ooO.o00oo0(obj);
                }
                return oO0Ooooo.f13240o00oOOo0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oOo00(o0OO0<? super R> o0oo0, o0OO00o<? extends T2> o0oo00o, o0OO00o<? extends T1> o0oo00o2, o0O0000O<? super T1, ? super T2, ? super o00oOo0O<? super R>, ? extends Object> o0o0000o, o00oOo0O<? super o00oOo00> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$this_unsafeFlow = o0oo0;
            this.$flow2 = o0oo00o;
            this.$flow = o0oo00o2;
            this.$transform = o0o0000o;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o00oOo0O<?> o00ooo0o2) {
            o00oOo00 o00ooo002 = new o00oOo00(this.$this_unsafeFlow, this.$flow2, this.$flow, this.$transform, o00ooo0o2);
            o00ooo002.L$0 = obj;
            return o00ooo002;
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ Object invoke(o0O0oo00 o0o0oo00, o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return invoke2(o0o0oo00, o00ooo0o2);
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull o0O0oo00 o0o0oo00, @Nullable o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o00oOo00) create(o0o0oo00, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOo0O0.o0O0OO o0o0oo;
            o0OOo0O0.o0O0OO o0o0oo2;
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                oo0ooO.o00oo0(obj);
                o0O0oo00 o0o0oo00 = (o0O0oo00) this.L$0;
                o0OOo0O0.o0O0OO o00oOo0o2 = o0O0O0Oo.o00oOo0o(o0o0oo00, null, 0, new C0212o00oOo00(this.$flow2, null), 3, null);
                o0oO0O0o o00oOo002 = oO00O0o0.o00oOo00(null, 1, null);
                ((o0OooO0) o00oOo0o2).o00oOooO(new o00oOOo0(o00oOo002, this.$this_unsafeFlow));
                try {
                    o00oo0 o0O000O2 = o0o0oo00.o0O000O();
                    Object o00oOOoO2 = ooOOOOoo.o00oOOoO(o0O000O2);
                    o00oo0 plus = o0o0oo00.o0O000O().plus(o00oOo002);
                    oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
                    o00oOOoO o00ooooo2 = new o00oOOoO(this.$flow, o0O000O2, o00oOOoO2, o00oOo0o2, this.$this_unsafeFlow, this.$transform, null);
                    this.L$0 = o00oOo0o2;
                    this.label = 1;
                    o0o0oo = o00oOo0o2;
                    try {
                        if (oO00OOOo.o00oOooO(plus, oo0ooooo, null, o00ooooo2, this, 4, null) == o00oooo02) {
                            return o00oooo02;
                        }
                        o0o0oo2 = o0o0oo;
                    } catch (oO00O0oO e) {
                        e = e;
                        o0o0oo2 = o0o0oo;
                        oOo00ooO.o00oOOoO(e, this.$this_unsafeFlow);
                        o0O0OO.o00oOOo0.o00oOOoO(o0o0oo2, null, 1, null);
                        return oO0Ooooo.f13240o00oOOo0;
                    } catch (Throwable th) {
                        th = th;
                        o0o0oo2 = o0o0oo;
                        o0O0OO.o00oOOo0.o00oOOoO(o0o0oo2, null, 1, null);
                        throw th;
                    }
                } catch (oO00O0oO e2) {
                    e = e2;
                    o0o0oo = o00oOo0o2;
                } catch (Throwable th2) {
                    th = th2;
                    o0o0oo = o00oOo0o2;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                o0o0oo2 = (o0OOo0O0.o0O0OO) this.L$0;
                try {
                    try {
                        oo0ooO.o00oo0(obj);
                    } catch (oO00O0oO e3) {
                        e = e3;
                        oOo00ooO.o00oOOoO(e, this.$this_unsafeFlow);
                        o0O0OO.o00oOOo0.o00oOOoO(o0o0oo2, null, 1, null);
                        return oO0Ooooo.f13240o00oOOo0;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    o0O0OO.o00oOOo0.o00oOOoO(o0o0oo2, null, 1, null);
                    throw th;
                }
            }
            o0O0OO.o00oOOo0.o00oOOoO(o0o0oo2, null, 1, null);
            return oO0Ooooo.f13240o00oOOo0;
        }
    }

    @o0OO0o.o0O
    @Nullable
    public static final <R, T> Object o00oOOo0(@NotNull o0OO0<? super R> o0oo0, @NotNull o0OO00o<? extends T>[] o0oo00oArr, @NotNull o0OOOO.o00oOOo0<T[]> o00oooo02, @NotNull o0O0000O<? super o0OO0<? super R>, ? super T[], ? super o00oOo0O<? super oO0Ooooo>, ? extends Object> o0o0000o, @NotNull o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
        Object o00oOOo02 = oOo00o0o.o00oOOo0(new o00oOOo0(o0oo00oArr, o00oooo02, o0o0000o, o0oo0, null), o00ooo0o2);
        return o00oOOo02 == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED ? o00oOOo02 : oO0Ooooo.f13240o00oOOo0;
    }

    @NotNull
    public static final <T1, T2, R> o0OO00o<R> o00oOOoO(@NotNull o0OO00o<? extends T1> o0oo00o, @NotNull o0OO00o<? extends T2> o0oo00o2, @NotNull o0O0000O<? super T1, ? super T2, ? super o00oOo0O<? super R>, ? extends Object> o0o0000o) {
        return new o00oOOoO(o0oo00o2, o0oo00o, o0o0000o);
    }
}
