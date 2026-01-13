package o0OOo0OO;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import o0OO0o.o0O0oo0o;
import o0OO0oO.o0O0o000;
import o0OOOO.o0O00000;
import o0OOOO.o0O0000O;
import o0OOOOO0.o0OO0O0;
import o0OOOOO0.o0ooO;
import o0OOo0Oo.oOo000o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001aO\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012$\b\u0004\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aO\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012$\b\u0004\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u001a\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\n\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0001H\u0086\b\u001a\"\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u0005*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\u001ad\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u000123\b\u0004\u0010\u0010\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\b\u001aj\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\n*\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000\u000125\b\u0004\u0010\u0010\u001a/\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\b\u001a\"\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001aJ\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0016\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\b\u001a~\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0018\u001a\u00028\u00012H\b\u0001\u0010\u001b\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0019ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a~\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0018\u001a\u00028\u00012H\b\u0001\u0010\u001b\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0019ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001d\u001an\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012F\u0010\u001b\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0019ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo0OO/o0OO00o;", "Lkotlin/Function2;", "Lo0OO/o00oOo0O;", "", "", "predicate", "o00oOOo0", "(Lo0OOo0OO/o0OO00o;Lo0OOOO/o0O00000;)Lo0OOo0OO/o0OO00o;", "o00oOo00", "R", o0OO000o.o00oOOoO.f12961o00oOo00, "o00oOooO", "Lo0OO0o/o0O0o00O;", "name", "value", "transform", "o00oOo0O", "o00oOo0o", "Lo0OO0oO/o0O0o000;", "o00oOoo0", "Lo0OO0o/oO0Ooooo;", "action", "o00oOoO0", "initial", "Lkotlin/Function3;", "accumulator", "operation", "o00oOoOo", "(Lo0OOo0OO/o0OO00o;Ljava/lang/Object;Lo0OOOO/o0O0000O;)Lo0OOo0OO/o0OO00o;", "o00oOoO", "o00oOoOO", "(Lo0OOo0OO/o0OO00o;Lo0OOOO/o0O0000O;)Lo0OOo0OO/o0OO00o;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class o0oo0000 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lo0OOo0OO/o0OO00o;", "Lo0OOo0OO/o0OO0;", "collector", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "(Lo0OOo0OO/o0OO0;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "kotlinx-coroutines-core", "o0OOo0OO/o0OOO0O$o00oo0"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0<T> implements o0OO00o<T> {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o0O00000 f14413o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OO00o f14414o00oo0O0;

        @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 176)
        /* renamed from: o0OOo0OO.o0oo0000$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0195o00oOOo0 extends o0OOO0.o00oOo0O {
            public int label;
            public /* synthetic */ Object result;

            public C0195o00oOOo0(o0OO.o00oOo0O o00ooo0o2) {
                super(o00ooo0o2);
            }

            @Override // o0OOO0.o00oOOo0
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return o00oOOo0.this.o00oOOo0(null, this);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "value", "Lo0OO0o/oO0Ooooo;", "emit", "(Ljava/lang/Object;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "o0OOo0OO/o0OOO0O$o00oo0OO", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: classes3.dex */
        public static final class o00oOOoO<T> implements o0OO0 {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final /* synthetic */ o0O00000 f14415o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ o0OO0 f14416o00oo0O0;

            @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 176)
            @o0OOO0.o00oo00O(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {o0O0oooo.o0OO0oO.f12881o00oooo, o0O0oooo.o0OO0oO.f12881o00oooo}, m = "emit", n = {"value", "$this$filter_u24lambda_u2d0"}, s = {"L$0", "L$1"})
            /* renamed from: o0OOo0OO.o0oo0000$o00oOOo0$o00oOOoO$o00oOOo0  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0196o00oOOo0 extends o0OOO0.o00oOo0O {
                public Object L$0;
                public Object L$1;
                public int label;
                public /* synthetic */ Object result;

                public C0196o00oOOo0(o0OO.o00oOo0O o00ooo0o2) {
                    super(o00ooo0o2);
                }

                @Override // o0OOO0.o00oOOo0
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return o00oOOoO.this.emit(null, this);
                }
            }

            public o00oOOoO(o0OO0 o0oo0, o0O00000 o0o00000) {
                this.f14416o00oo0O0 = o0oo0;
                this.f14415o00oo0O = o0o00000;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
            @Override // o0OOo0OO.o0OO0
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r7, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof o0OOo0OO.o0oo0000.o00oOOo0.o00oOOoO.C0196o00oOOo0
                    if (r0 == 0) goto L13
                    r0 = r8
                    o0OOo0OO.o0oo0000$o00oOOo0$o00oOOoO$o00oOOo0 r0 = (o0OOo0OO.o0oo0000.o00oOOo0.o00oOOoO.C0196o00oOOo0) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    o0OOo0OO.o0oo0000$o00oOOo0$o00oOOoO$o00oOOo0 r0 = new o0OOo0OO.o0oo0000$o00oOOo0$o00oOOoO$o00oOOo0
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.result
                    o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L32
                    if (r2 != r3) goto L2a
                    o0OO0o.oo0ooO.o00oo0(r8)
                    goto L6a
                L2a:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L32:
                    java.lang.Object r7 = r0.L$1
                    o0OOo0OO.o0OO0 r7 = (o0OOo0OO.o0OO0) r7
                    java.lang.Object r2 = r0.L$0
                    o0OO0o.oo0ooO.o00oo0(r8)
                    goto L54
                L3c:
                    o0OO0o.oo0ooO.o00oo0(r8)
                    o0OOo0OO.o0OO0 r8 = r6.f14416o00oo0O0
                    o0OOOO.o0O00000 r2 = r6.f14415o00oo0O
                    r0.L$0 = r7
                    r0.L$1 = r8
                    r0.label = r4
                    java.lang.Object r2 = r2.invoke(r7, r0)
                    if (r2 != r1) goto L50
                    return r1
                L50:
                    r5 = r2
                    r2 = r7
                    r7 = r8
                    r8 = r5
                L54:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8
                    boolean r8 = r8.booleanValue()
                    if (r8 == 0) goto L6a
                    r8 = 0
                    r0.L$0 = r8
                    r0.L$1 = r8
                    r0.label = r3
                    java.lang.Object r7 = r7.emit(r2, r0)
                    if (r7 != r1) goto L6a
                    return r1
                L6a:
                    o0OO0o.oO0Ooooo r7 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: o0OOo0OO.o0oo0000.o00oOOo0.o00oOOoO.emit(java.lang.Object, o0OO.o00oOo0O):java.lang.Object");
            }

            @Nullable
            public final Object o00oOOo0(Object obj, @NotNull o0OO.o00oOo0O o00ooo0o2) {
                new C0196o00oOOo0(o00ooo0o2);
                o0OO0 o0oo0 = this.f14416o00oo0O0;
                if (((Boolean) this.f14415o00oo0O.invoke(obj, o00ooo0o2)).booleanValue()) {
                    o0oo0.emit(obj, o00ooo0o2);
                }
                return o0OO0o.oO0Ooooo.f13240o00oOOo0;
            }
        }

        public o00oOOo0(o0OO00o o0oo00o, o0O00000 o0o00000) {
            this.f14414o00oo0O0 = o0oo00o;
            this.f14413o00oo0O = o0o00000;
        }

        @Override // o0OOo0OO.o0OO00o
        @Nullable
        public Object o00oOOo0(@NotNull o0OO0 o0oo0, @NotNull o0OO.o00oOo0O o00ooo0o2) {
            Object o00oOOo02 = this.f14414o00oo0O0.o00oOOo0(new o00oOOoO(o0oo0, this.f14413o00oo0O), o00ooo0o2);
            return o00oOOo02 == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED ? o00oOOo02 : o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }

        @Nullable
        public Object o00oOoO0(@NotNull o0OO0 o0oo0, @NotNull o0OO.o00oOo0O o00ooo0o2) {
            new C0195o00oOOo0(o00ooo0o2);
            this.f14414o00oo0O0.o00oOOo0(new o00oOOoO(o0oo0, this.f14413o00oo0O), o00ooo0o2);
            return o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lo0OOo0OO/o0OO00o;", "Lo0OOo0OO/o0OO0;", "collector", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "(Lo0OOo0OO/o0OO0;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "kotlinx-coroutines-core", "o0OOo0OO/o0oo0000$o00oOOo0"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO implements o0OO00o<Object> {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OO00o f14417o00oo0O0;

        @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 176)
        /* loaded from: classes3.dex */
        public static final class o00oOOo0 extends o0OOO0.o00oOo0O {
            public int label;
            public /* synthetic */ Object result;

            public o00oOOo0(o0OO.o00oOo0O o00ooo0o2) {
                super(o00ooo0o2);
            }

            @Override // o0OOO0.o00oOOo0
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return o00oOOoO.this.o00oOOo0(null, this);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "value", "Lo0OO0o/oO0Ooooo;", "emit", "(Ljava/lang/Object;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "o0OOo0OO/o0oo0000$o00oOOo0$o00oOOoO", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* renamed from: o0OOo0OO.o0oo0000$o00oOOoO$o00oOOoO  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0197o00oOOoO<T> implements o0OO0 {

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ o0OO0 f14418o00oo0O0;

            @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 176)
            @o0OOO0.o00oo00O(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2", f = "Transform.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
            /* renamed from: o0OOo0OO.o0oo0000$o00oOOoO$o00oOOoO$o00oOOo0 */
            /* loaded from: classes3.dex */
            public static final class o00oOOo0 extends o0OOO0.o00oOo0O {
                public Object L$0;
                public Object L$1;
                public int label;
                public /* synthetic */ Object result;

                public o00oOOo0(o0OO.o00oOo0O o00ooo0o2) {
                    super(o00ooo0o2);
                }

                @Override // o0OOO0.o00oOOo0
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return C0197o00oOOoO.this.emit(null, this);
                }
            }

            public C0197o00oOOoO(o0OO0 o0oo0) {
                this.f14418o00oo0O0 = o0oo0;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // o0OOo0OO.o0OO0
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof o0OOo0OO.o0oo0000.o00oOOoO.C0197o00oOOoO.o00oOOo0
                    if (r0 == 0) goto L13
                    r0 = r6
                    o0OOo0OO.o0oo0000$o00oOOoO$o00oOOoO$o00oOOo0 r0 = (o0OOo0OO.o0oo0000.o00oOOoO.C0197o00oOOoO.o00oOOo0) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    o0OOo0OO.o0oo0000$o00oOOoO$o00oOOoO$o00oOOo0 r0 = new o0OOo0OO.o0oo0000$o00oOOoO$o00oOOoO$o00oOOo0
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.result
                    o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    o0OO0o.oo0ooO.o00oo0(r6)
                    goto L44
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    o0OO0o.oo0ooO.o00oo0(r6)
                    o0OOo0OO.o0OO0 r6 = r4.f14418o00oo0O0
                    o0OOOOO0.o0ooO.o00oooOo()
                    boolean r2 = r5 instanceof java.lang.Object
                    if (r2 == 0) goto L44
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L44
                    return r1
                L44:
                    o0OO0o.oO0Ooooo r5 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: o0OOo0OO.o0oo0000.o00oOOoO.C0197o00oOOoO.emit(java.lang.Object, o0OO.o00oOo0O):java.lang.Object");
            }

            @Nullable
            public final Object o00oOOo0(Object obj, @NotNull o0OO.o00oOo0O o00ooo0o2) {
                new o00oOOo0(o00ooo0o2);
                o0OO0 o0oo0 = this.f14418o00oo0O0;
                o0ooO.o00oooOo();
                if (obj instanceof Object) {
                    o0oo0.emit(obj, o00ooo0o2);
                }
                return o0OO0o.oO0Ooooo.f13240o00oOOo0;
            }
        }

        public o00oOOoO(o0OO00o o0oo00o) {
            this.f14417o00oo0O0 = o0oo00o;
        }

        @Override // o0OOo0OO.o0OO00o
        @Nullable
        public Object o00oOOo0(@NotNull o0OO0<? super Object> o0oo0, @NotNull o0OO.o00oOo0O o00ooo0o2) {
            o0OO00o o0oo00o = this.f14417o00oo0O0;
            o0ooO.o00oooOo();
            Object o00oOOo02 = o0oo00o.o00oOOo0(new C0197o00oOOoO(o0oo0), o00ooo0o2);
            return o00oOOo02 == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED ? o00oOOo02 : o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }

        @Nullable
        public Object o00oOoO0(@NotNull o0OO0 o0oo0, @NotNull o0OO.o00oOo0O o00ooo0o2) {
            new o00oOOo0(o00ooo0o2);
            o0OO00o o0oo00o = this.f14417o00oo0O0;
            o0ooO.o00oooOo();
            o0oo00o.o00oOOo0(new C0197o00oOOoO(o0oo0), o00ooo0o2);
            return o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lo0OOo0OO/o0OO00o;", "Lo0OOo0OO/o0OO0;", "collector", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "(Lo0OOo0OO/o0OO0;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "kotlinx-coroutines-core", "o0OOo0OO/o0OOO0O$o00oo0"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOo00<T> implements o0OO00o<T> {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o0O00000 f14419o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OO00o f14420o00oo0O0;

        @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 176)
        /* loaded from: classes3.dex */
        public static final class o00oOOo0 extends o0OOO0.o00oOo0O {
            public int label;
            public /* synthetic */ Object result;

            public o00oOOo0(o0OO.o00oOo0O o00ooo0o2) {
                super(o00ooo0o2);
            }

            @Override // o0OOO0.o00oOOo0
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return o00oOo00.this.o00oOOo0(null, this);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "value", "Lo0OO0o/oO0Ooooo;", "emit", "(Ljava/lang/Object;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "o0OOo0OO/o0OOO0O$o00oo0OO", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: classes3.dex */
        public static final class o00oOOoO<T> implements o0OO0 {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final /* synthetic */ o0O00000 f14421o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ o0OO0 f14422o00oo0O0;

            @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 176)
            @o0OOO0.o00oo00O(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {o0O0oooo.o0OO0oO.f12881o00oooo, o0O0oooo.o0OO0oO.f12881o00oooo}, m = "emit", n = {"value", "$this$filterNot_u24lambda_u2d1"}, s = {"L$0", "L$1"})
            /* loaded from: classes3.dex */
            public static final class o00oOOo0 extends o0OOO0.o00oOo0O {
                public Object L$0;
                public Object L$1;
                public int label;
                public /* synthetic */ Object result;

                public o00oOOo0(o0OO.o00oOo0O o00ooo0o2) {
                    super(o00ooo0o2);
                }

                @Override // o0OOO0.o00oOOo0
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return o00oOOoO.this.emit(null, this);
                }
            }

            public o00oOOoO(o0OO0 o0oo0, o0O00000 o0o00000) {
                this.f14422o00oo0O0 = o0oo0;
                this.f14421o00oo0O = o0o00000;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
            @Override // o0OOo0OO.o0OO0
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r7, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof o0OOo0OO.o0oo0000.o00oOo00.o00oOOoO.o00oOOo0
                    if (r0 == 0) goto L13
                    r0 = r8
                    o0OOo0OO.o0oo0000$o00oOo00$o00oOOoO$o00oOOo0 r0 = (o0OOo0OO.o0oo0000.o00oOo00.o00oOOoO.o00oOOo0) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    o0OOo0OO.o0oo0000$o00oOo00$o00oOOoO$o00oOOo0 r0 = new o0OOo0OO.o0oo0000$o00oOo00$o00oOOoO$o00oOOo0
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.result
                    o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L32
                    if (r2 != r3) goto L2a
                    o0OO0o.oo0ooO.o00oo0(r8)
                    goto L6a
                L2a:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L32:
                    java.lang.Object r7 = r0.L$1
                    o0OOo0OO.o0OO0 r7 = (o0OOo0OO.o0OO0) r7
                    java.lang.Object r2 = r0.L$0
                    o0OO0o.oo0ooO.o00oo0(r8)
                    goto L54
                L3c:
                    o0OO0o.oo0ooO.o00oo0(r8)
                    o0OOo0OO.o0OO0 r8 = r6.f14422o00oo0O0
                    o0OOOO.o0O00000 r2 = r6.f14421o00oo0O
                    r0.L$0 = r7
                    r0.L$1 = r8
                    r0.label = r4
                    java.lang.Object r2 = r2.invoke(r7, r0)
                    if (r2 != r1) goto L50
                    return r1
                L50:
                    r5 = r2
                    r2 = r7
                    r7 = r8
                    r8 = r5
                L54:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8
                    boolean r8 = r8.booleanValue()
                    if (r8 != 0) goto L6a
                    r8 = 0
                    r0.L$0 = r8
                    r0.L$1 = r8
                    r0.label = r3
                    java.lang.Object r7 = r7.emit(r2, r0)
                    if (r7 != r1) goto L6a
                    return r1
                L6a:
                    o0OO0o.oO0Ooooo r7 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: o0OOo0OO.o0oo0000.o00oOo00.o00oOOoO.emit(java.lang.Object, o0OO.o00oOo0O):java.lang.Object");
            }

            @Nullable
            public final Object o00oOOo0(Object obj, @NotNull o0OO.o00oOo0O o00ooo0o2) {
                new o00oOOo0(o00ooo0o2);
                o0OO0 o0oo0 = this.f14422o00oo0O0;
                if (!((Boolean) this.f14421o00oo0O.invoke(obj, o00ooo0o2)).booleanValue()) {
                    o0oo0.emit(obj, o00ooo0o2);
                }
                return o0OO0o.oO0Ooooo.f13240o00oOOo0;
            }
        }

        public o00oOo00(o0OO00o o0oo00o, o0O00000 o0o00000) {
            this.f14420o00oo0O0 = o0oo00o;
            this.f14419o00oo0O = o0o00000;
        }

        @Override // o0OOo0OO.o0OO00o
        @Nullable
        public Object o00oOOo0(@NotNull o0OO0 o0oo0, @NotNull o0OO.o00oOo0O o00ooo0o2) {
            Object o00oOOo02 = this.f14420o00oo0O0.o00oOOo0(new o00oOOoO(o0oo0, this.f14419o00oo0O), o00ooo0o2);
            return o00oOOo02 == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED ? o00oOOo02 : o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }

        @Nullable
        public Object o00oOoO0(@NotNull o0OO0 o0oo0, @NotNull o0OO.o00oOo0O o00ooo0o2) {
            new o00oOOo0(o00ooo0o2);
            this.f14420o00oo0O0.o00oOOo0(new o00oOOoO(o0oo0, this.f14419o00oo0O), o00ooo0o2);
            return o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lo0OOo0OO/o0OO00o;", "Lo0OOo0OO/o0OO0;", "collector", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "(Lo0OOo0OO/o0OO0;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "kotlinx-coroutines-core", "o0OOo0OO/o0OOO0O$o00oo0"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOo0O<T> implements o0OO00o<T> {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OO00o f14423o00oo0O0;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "value", "Lo0OO0o/oO0Ooooo;", "emit", "(Ljava/lang/Object;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "o0OOo0OO/o0OOO0O$o00oo0OO", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: classes3.dex */
        public static final class o00oOOo0<T> implements o0OO0 {

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ o0OO0 f14424o00oo0O0;

            @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
            @o0OOO0.o00oo00O(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {}, l = {o0O0oooo.o0OO0oO.f12881o00oooo}, m = "emit", n = {}, s = {})
            /* renamed from: o0OOo0OO.o0oo0000$o00oOo0O$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0198o00oOOo0 extends o0OOO0.o00oOo0O {
                public int label;
                public /* synthetic */ Object result;

                public C0198o00oOOo0(o0OO.o00oOo0O o00ooo0o2) {
                    super(o00ooo0o2);
                }

                @Override // o0OOO0.o00oOOo0
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return o00oOOo0.this.emit(null, this);
                }
            }

            public o00oOOo0(o0OO0 o0oo0) {
                this.f14424o00oo0O0 = o0oo0;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // o0OOo0OO.o0OO0
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r5, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof o0OOo0OO.o0oo0000.o00oOo0O.o00oOOo0.C0198o00oOOo0
                    if (r0 == 0) goto L13
                    r0 = r6
                    o0OOo0OO.o0oo0000$o00oOo0O$o00oOOo0$o00oOOo0 r0 = (o0OOo0OO.o0oo0000.o00oOo0O.o00oOOo0.C0198o00oOOo0) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    o0OOo0OO.o0oo0000$o00oOo0O$o00oOOo0$o00oOOo0 r0 = new o0OOo0OO.o0oo0000$o00oOo0O$o00oOOo0$o00oOOo0
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.result
                    o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    o0OO0o.oo0ooO.o00oo0(r6)
                    goto L3f
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    o0OO0o.oo0ooO.o00oo0(r6)
                    o0OOo0OO.o0OO0 r6 = r4.f14424o00oo0O0
                    if (r5 == 0) goto L3f
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L3f
                    return r1
                L3f:
                    o0OO0o.oO0Ooooo r5 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: o0OOo0OO.o0oo0000.o00oOo0O.o00oOOo0.emit(java.lang.Object, o0OO.o00oOo0O):java.lang.Object");
            }
        }

        public o00oOo0O(o0OO00o o0oo00o) {
            this.f14423o00oo0O0 = o0oo00o;
        }

        @Override // o0OOo0OO.o0OO00o
        @Nullable
        public Object o00oOOo0(@NotNull o0OO0 o0oo0, @NotNull o0OO.o00oOo0O o00ooo0o2) {
            Object o00oOOo02 = this.f14423o00oo0O0.o00oOOo0(new o00oOOo0(o0oo0), o00ooo0o2);
            return o00oOOo02 == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED ? o00oOOo02 : o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lo0OOo0OO/o0OO00o;", "Lo0OOo0OO/o0OO0;", "collector", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "(Lo0OOo0OO/o0OO0;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "kotlinx-coroutines-core", "o0OOo0OO/o0OOO0O$o00oo0"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOoO<R> implements o0OO00o<R> {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o0O00000 f14425o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OO00o f14426o00oo0O0;

        @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 176)
        /* loaded from: classes3.dex */
        public static final class o00oOOo0 extends o0OOO0.o00oOo0O {
            public int label;
            public /* synthetic */ Object result;

            public o00oOOo0(o0OO.o00oOo0O o00ooo0o2) {
                super(o00ooo0o2);
            }

            @Override // o0OOO0.o00oOOo0
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return o00oOoO.this.o00oOOo0(null, this);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "value", "Lo0OO0o/oO0Ooooo;", "emit", "(Ljava/lang/Object;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "o0OOo0OO/o0OOO0O$o00oo0OO", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: classes3.dex */
        public static final class o00oOOoO<T> implements o0OO0 {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final /* synthetic */ o0O00000 f14427o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ o0OO0 f14428o00oo0O0;

            @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 176)
            @o0OOO0.o00oo00O(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {}, l = {o0O0oooo.o0OO0oO.f12881o00oooo, o0O0oooo.o0OO0oO.f12881o00oooo}, m = "emit", n = {}, s = {})
            /* loaded from: classes3.dex */
            public static final class o00oOOo0 extends o0OOO0.o00oOo0O {
                public Object L$0;
                public int label;
                public /* synthetic */ Object result;

                public o00oOOo0(o0OO.o00oOo0O o00ooo0o2) {
                    super(o00ooo0o2);
                }

                @Override // o0OOO0.o00oOOo0
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return o00oOOoO.this.emit(null, this);
                }
            }

            public o00oOOoO(o0OO0 o0oo0, o0O00000 o0o00000) {
                this.f14428o00oo0O0 = o0oo0;
                this.f14427o00oo0O = o0o00000;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[RETURN] */
            @Override // o0OOo0OO.o0OO0
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r7, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof o0OOo0OO.o0oo0000.o00oOoO.o00oOOoO.o00oOOo0
                    if (r0 == 0) goto L13
                    r0 = r8
                    o0OOo0OO.o0oo0000$o00oOoO$o00oOOoO$o00oOOo0 r0 = (o0OOo0OO.o0oo0000.o00oOoO.o00oOOoO.o00oOOo0) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    o0OOo0OO.o0oo0000$o00oOoO$o00oOOoO$o00oOOo0 r0 = new o0OOo0OO.o0oo0000$o00oOoO$o00oOOoO$o00oOOo0
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.result
                    o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3a
                    if (r2 == r4) goto L32
                    if (r2 != r3) goto L2a
                    o0OO0o.oo0ooO.o00oo0(r8)
                    goto L5b
                L2a:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L32:
                    java.lang.Object r7 = r0.L$0
                    o0OOo0OO.o0OO0 r7 = (o0OOo0OO.o0OO0) r7
                    o0OO0o.oo0ooO.o00oo0(r8)
                    goto L4f
                L3a:
                    o0OO0o.oo0ooO.o00oo0(r8)
                    o0OOo0OO.o0OO0 r8 = r6.f14428o00oo0O0
                    o0OOOO.o0O00000 r2 = r6.f14427o00oo0O
                    r0.L$0 = r8
                    r0.label = r4
                    java.lang.Object r7 = r2.invoke(r7, r0)
                    if (r7 != r1) goto L4c
                    return r1
                L4c:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L4f:
                    r2 = 0
                    r0.L$0 = r2
                    r0.label = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L5b
                    return r1
                L5b:
                    o0OO0o.oO0Ooooo r7 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: o0OOo0OO.o0oo0000.o00oOoO.o00oOOoO.emit(java.lang.Object, o0OO.o00oOo0O):java.lang.Object");
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Nullable
            public final Object o00oOOo0(Object obj, @NotNull o0OO.o00oOo0O o00ooo0o2) {
                new o00oOOo0(o00ooo0o2);
                this.f14428o00oo0O0.emit(this.f14427o00oo0O.invoke(obj, o00ooo0o2), o00ooo0o2);
                return o0OO0o.oO0Ooooo.f13240o00oOOo0;
            }
        }

        public o00oOoO(o0OO00o o0oo00o, o0O00000 o0o00000) {
            this.f14426o00oo0O0 = o0oo00o;
            this.f14425o00oo0O = o0o00000;
        }

        @Override // o0OOo0OO.o0OO00o
        @Nullable
        public Object o00oOOo0(@NotNull o0OO0 o0oo0, @NotNull o0OO.o00oOo0O o00ooo0o2) {
            Object o00oOOo02 = this.f14426o00oo0O0.o00oOOo0(new o00oOOoO(o0oo0, this.f14425o00oo0O), o00ooo0o2);
            return o00oOOo02 == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED ? o00oOOo02 : o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }

        @Nullable
        public Object o00oOoO0(@NotNull o0OO0 o0oo0, @NotNull o0OO.o00oOo0O o00ooo0o2) {
            new o00oOOo0(o00ooo0o2);
            this.f14426o00oo0O0.o00oOOo0(new o00oOOoO(o0oo0, this.f14425o00oo0O), o00ooo0o2);
            return o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"o0OOo0Oo/oO0O000o$o00oOOoO", "Lo0OOo0OO/o0OO00o;", "Lo0OOo0OO/o0OO0;", "collector", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "(Lo0OOo0OO/o0OO0;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oo<T> implements o0OO00o<o0O0o000<? extends T>> {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OO00o f14429o00oo0O0;

        public o00oo(o0OO00o o0oo00o) {
            this.f14429o00oo0O0 = o0oo00o;
        }

        @Override // o0OOo0OO.o0OO00o
        @Nullable
        public Object o00oOOo0(@NotNull o0OO0<? super o0O0o000<? extends T>> o0oo0, @NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            Object o00oOOo02 = this.f14429o00oo0O0.o00oOOo0(new o00ooO0(o0oo0, new o0OO0O0.o00oo00O()), o00ooo0o2);
            return o00oOOo02 == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED ? o00oOOo02 : o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lo0OOo0OO/o0OO00o;", "Lo0OOo0OO/o0OO0;", "collector", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "(Lo0OOo0OO/o0OO0;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "kotlinx-coroutines-core", "o0OOo0OO/o0OOO0O$o00oo0"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oo0<T> implements o0OO00o<T> {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o0O00000 f14430o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OO00o f14431o00oo0O0;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "value", "Lo0OO0o/oO0Ooooo;", "emit", "(Ljava/lang/Object;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "o0OOo0OO/o0OOO0O$o00oo0OO", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: classes3.dex */
        public static final class o00oOOo0<T> implements o0OO0 {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final /* synthetic */ o0O00000 f14432o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ o0OO0 f14433o00oo0O0;

            @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
            @o0OOO0.o00oo00O(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {o0O0oooo.o0OO0oO.f12881o00oooo, 224}, m = "emit", n = {"value", "$this$onEach_u24lambda_u2d7"}, s = {"L$0", "L$1"})
            /* renamed from: o0OOo0OO.o0oo0000$o00oo0$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0199o00oOOo0 extends o0OOO0.o00oOo0O {
                public Object L$0;
                public Object L$1;
                public int label;
                public /* synthetic */ Object result;

                public C0199o00oOOo0(o0OO.o00oOo0O o00ooo0o2) {
                    super(o00ooo0o2);
                }

                @Override // o0OOO0.o00oOOo0
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return o00oOOo0.this.emit(null, this);
                }
            }

            public o00oOOo0(o0OO0 o0oo0, o0O00000 o0o00000) {
                this.f14433o00oo0O0 = o0oo0;
                this.f14432o00oo0O = o0o00000;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[RETURN] */
            @Override // o0OOo0OO.o0OO0
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r6, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof o0OOo0OO.o0oo0000.o00oo0.o00oOOo0.C0199o00oOOo0
                    if (r0 == 0) goto L13
                    r0 = r7
                    o0OOo0OO.o0oo0000$o00oo0$o00oOOo0$o00oOOo0 r0 = (o0OOo0OO.o0oo0000.o00oo0.o00oOOo0.C0199o00oOOo0) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    o0OOo0OO.o0oo0000$o00oo0$o00oOOo0$o00oOOo0 r0 = new o0OOo0OO.o0oo0000$o00oo0$o00oOOo0$o00oOOo0
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.result
                    o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L32
                    if (r2 != r3) goto L2a
                    o0OO0o.oo0ooO.o00oo0(r7)
                    goto L60
                L2a:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L32:
                    java.lang.Object r6 = r0.L$1
                    o0OOo0OO.o0OO0 r6 = (o0OOo0OO.o0OO0) r6
                    java.lang.Object r2 = r0.L$0
                    o0OO0o.oo0ooO.o00oo0(r7)
                    goto L52
                L3c:
                    o0OO0o.oo0ooO.o00oo0(r7)
                    o0OOo0OO.o0OO0 r7 = r5.f14433o00oo0O0
                    o0OOOO.o0O00000 r2 = r5.f14432o00oo0O
                    r0.L$0 = r6
                    r0.L$1 = r7
                    r0.label = r4
                    java.lang.Object r2 = r2.invoke(r6, r0)
                    if (r2 != r1) goto L50
                    return r1
                L50:
                    r2 = r6
                    r6 = r7
                L52:
                    r7 = 0
                    r0.L$0 = r7
                    r0.L$1 = r7
                    r0.label = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L60
                    return r1
                L60:
                    o0OO0o.oO0Ooooo r6 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: o0OOo0OO.o0oo0000.o00oo0.o00oOOo0.emit(java.lang.Object, o0OO.o00oOo0O):java.lang.Object");
            }
        }

        public o00oo0(o0OO00o o0oo00o, o0O00000 o0o00000) {
            this.f14431o00oo0O0 = o0oo00o;
            this.f14430o00oo0O = o0o00000;
        }

        @Override // o0OOo0OO.o0OO00o
        @Nullable
        public Object o00oOOo0(@NotNull o0OO0 o0oo0, @NotNull o0OO.o00oOo0O o00ooo0o2) {
            Object o00oOOo02 = this.f14431o00oo0O0.o00oOOo0(new o00oOOo0(o0oo0, this.f14430o00oo0O), o00ooo0o2);
            return o00oOOo02 == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED ? o00oOOo02 : o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lo0OOo0OO/o0OO00o;", "Lo0OOo0OO/o0OO0;", "collector", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "(Lo0OOo0OO/o0OO0;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "kotlinx-coroutines-core", "o0OOo0OO/o0OOO0O$o00oo0"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oo00O<R> implements o0OO00o<R> {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o0O00000 f14434o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OO00o f14435o00oo0O0;

        @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 176)
        /* loaded from: classes3.dex */
        public static final class o00oOOo0 extends o0OOO0.o00oOo0O {
            public int label;
            public /* synthetic */ Object result;

            public o00oOOo0(o0OO.o00oOo0O o00ooo0o2) {
                super(o00ooo0o2);
            }

            @Override // o0OOO0.o00oOOo0
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return o00oo00O.this.o00oOOo0(null, this);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "value", "Lo0OO0o/oO0Ooooo;", "emit", "(Ljava/lang/Object;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "o0OOo0OO/o0OOO0O$o00oo0OO", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: classes3.dex */
        public static final class o00oOOoO<T> implements o0OO0 {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final /* synthetic */ o0O00000 f14436o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ o0OO0 f14437o00oo0O0;

            @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 176)
            @o0OOO0.o00oo00O(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0}, l = {o0O0oooo.o0OO0oO.f12881o00oooo, 224}, m = "emit", n = {"$this$mapNotNull_u24lambda_u2d5"}, s = {"L$0"})
            /* loaded from: classes3.dex */
            public static final class o00oOOo0 extends o0OOO0.o00oOo0O {
                public Object L$0;
                public int label;
                public /* synthetic */ Object result;

                public o00oOOo0(o0OO.o00oOo0O o00ooo0o2) {
                    super(o00ooo0o2);
                }

                @Override // o0OOO0.o00oOOo0
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return o00oOOoO.this.emit(null, this);
                }
            }

            public o00oOOoO(o0OO0 o0oo0, o0O00000 o0o00000) {
                this.f14437o00oo0O0 = o0oo0;
                this.f14436o00oo0O = o0o00000;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
            @Override // o0OOo0OO.o0OO0
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r7, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof o0OOo0OO.o0oo0000.o00oo00O.o00oOOoO.o00oOOo0
                    if (r0 == 0) goto L13
                    r0 = r8
                    o0OOo0OO.o0oo0000$o00oo00O$o00oOOoO$o00oOOo0 r0 = (o0OOo0OO.o0oo0000.o00oo00O.o00oOOoO.o00oOOo0) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    o0OOo0OO.o0oo0000$o00oo00O$o00oOOoO$o00oOOo0 r0 = new o0OOo0OO.o0oo0000$o00oo00O$o00oOOoO$o00oOOo0
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.result
                    o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                    int r2 = r0.label
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3a
                    if (r2 == r4) goto L32
                    if (r2 != r3) goto L2a
                    o0OO0o.oo0ooO.o00oo0(r8)
                    goto L5e
                L2a:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L32:
                    java.lang.Object r7 = r0.L$0
                    o0OOo0OO.o0OO0 r7 = (o0OOo0OO.o0OO0) r7
                    o0OO0o.oo0ooO.o00oo0(r8)
                    goto L4f
                L3a:
                    o0OO0o.oo0ooO.o00oo0(r8)
                    o0OOo0OO.o0OO0 r8 = r6.f14437o00oo0O0
                    o0OOOO.o0O00000 r2 = r6.f14436o00oo0O
                    r0.L$0 = r8
                    r0.label = r4
                    java.lang.Object r7 = r2.invoke(r7, r0)
                    if (r7 != r1) goto L4c
                    return r1
                L4c:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L4f:
                    if (r8 != 0) goto L52
                    goto L5e
                L52:
                    r2 = 0
                    r0.L$0 = r2
                    r0.label = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L5e
                    return r1
                L5e:
                    o0OO0o.oO0Ooooo r7 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: o0OOo0OO.o0oo0000.o00oo00O.o00oOOoO.emit(java.lang.Object, o0OO.o00oOo0O):java.lang.Object");
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Nullable
            public final Object o00oOOo0(Object obj, @NotNull o0OO.o00oOo0O o00ooo0o2) {
                new o00oOOo0(o00ooo0o2);
                o0OO0 o0oo0 = this.f14437o00oo0O0;
                Object invoke = this.f14436o00oo0O.invoke(obj, o00ooo0o2);
                if (invoke != null) {
                    o0oo0.emit(invoke, o00ooo0o2);
                }
                return o0OO0o.oO0Ooooo.f13240o00oOOo0;
            }
        }

        public o00oo00O(o0OO00o o0oo00o, o0O00000 o0o00000) {
            this.f14435o00oo0O0 = o0oo00o;
            this.f14434o00oo0O = o0o00000;
        }

        @Override // o0OOo0OO.o0OO00o
        @Nullable
        public Object o00oOOo0(@NotNull o0OO0 o0oo0, @NotNull o0OO.o00oOo0O o00ooo0o2) {
            Object o00oOOo02 = this.f14435o00oo0O0.o00oOOo0(new o00oOOoO(o0oo0, this.f14434o00oo0O), o00ooo0o2);
            return o00oOOo02 == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED ? o00oOOo02 : o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }

        @Nullable
        public Object o00oOoO0(@NotNull o0OO0 o0oo0, @NotNull o0OO.o00oOo0O o00ooo0o2) {
            new o00oOOo0(o00ooo0o2);
            this.f14435o00oo0O0.o00oOOo0(new o00oOOoO(o0oo0, this.f14434o00oo0O), o00ooo0o2);
            return o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"o0OOo0Oo/oO0O000o$o00oOOoO", "Lo0OOo0OO/o0OO00o;", "Lo0OOo0OO/o0OO0;", "collector", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "(Lo0OOo0OO/o0OO0;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oo0O<T> implements o0OO00o<T> {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o0O0000O f14438o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OO00o f14439o00oo0O0;

        public o00oo0O(o0OO00o o0oo00o, o0O0000O o0o0000o) {
            this.f14439o00oo0O0 = o0oo00o;
            this.f14438o00oo0O = o0o0000o;
        }

        @Override // o0OOo0OO.o0OO00o
        @Nullable
        public Object o00oOOo0(@NotNull o0OO0<? super T> o0oo0, @NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            o0OO0O0.o00oo0OO o00oo0oo = new o0OO0O0.o00oo0OO();
            o00oo0oo.element = (T) oOo000o0.f14562o00oOOo0;
            Object o00oOOo02 = this.f14439o00oo0O0.o00oOOo0(new o0O0o(o00oo0oo, this.f14438o00oo0O, o0oo0), o00ooo0o2);
            return o00oOOo02 == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED ? o00oOOo02 : o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "value", "Lo0OO0o/oO0Ooooo;", "emit", "(Ljava/lang/Object;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oo0O0<T> implements o0OO0 {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o0O0000O<R, T, o0OO.o00oOo0O<? super R>, Object> f14440o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OO0O0.o00oo0OO<R> f14441o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ o0OO0<R> f14442o00oo0Oo;

        @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
        @o0OOO0.o00oo00O(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1", f = "Transform.kt", i = {0}, l = {103, 104}, m = "emit", n = {"this"}, s = {"L$0"})
        /* loaded from: classes3.dex */
        public static final class o00oOOo0 extends o0OOO0.o00oOo0O {
            public Object L$0;
            public Object L$1;
            public int label;
            public /* synthetic */ Object result;
            public final /* synthetic */ o00oo0O0<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public o00oOOo0(o00oo0O0<? super T> o00oo0o02, o0OO.o00oOo0O<? super o00oOOo0> o00ooo0o2) {
                super(o00ooo0o2);
                this.this$0 = o00oo0o02;
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
        public o00oo0O0(o0OO0O0.o00oo0OO<R> o00oo0oo, o0O0000O<? super R, ? super T, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o0000o, o0OO0<? super R> o0oo0) {
            this.f14441o00oo0O0 = o00oo0oo;
            this.f14440o00oo0O = o0o0000o;
            this.f14442o00oo0Oo = o0oo0;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006d A[RETURN] */
        @Override // o0OOo0OO.o0OO0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r8, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof o0OOo0OO.o0oo0000.o00oo0O0.o00oOOo0
                if (r0 == 0) goto L13
                r0 = r9
                o0OOo0OO.o0oo0000$o00oo0O0$o00oOOo0 r0 = (o0OOo0OO.o0oo0000.o00oo0O0.o00oOOo0) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                o0OOo0OO.o0oo0000$o00oo0O0$o00oOOo0 r0 = new o0OOo0OO.o0oo0000$o00oo0O0$o00oOOo0
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3e
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2a
                o0OO0o.oo0ooO.o00oo0(r9)
                goto L6e
            L2a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L32:
                java.lang.Object r8 = r0.L$1
                o0OOOOO0.o0OO0O0$o00oo0OO r8 = (o0OOOOO0.o0OO0O0.o00oo0OO) r8
                java.lang.Object r2 = r0.L$0
                o0OOo0OO.o0oo0000$o00oo0O0 r2 = (o0OOo0OO.o0oo0000.o00oo0O0) r2
                o0OO0o.oo0ooO.o00oo0(r9)
                goto L58
            L3e:
                o0OO0o.oo0ooO.o00oo0(r9)
                o0OOOOO0.o0OO0O0$o00oo0OO<R> r9 = r7.f14441o00oo0O0
                o0OOOO.o0O0000O<R, T, o0OO.o00oOo0O<? super R>, java.lang.Object> r2 = r7.f14440o00oo0O
                T r5 = r9.element
                r0.L$0 = r7
                r0.L$1 = r9
                r0.label = r4
                java.lang.Object r8 = r2.invoke(r5, r8, r0)
                if (r8 != r1) goto L54
                return r1
            L54:
                r2 = r7
                r6 = r9
                r9 = r8
                r8 = r6
            L58:
                r8.element = r9
                o0OOo0OO.o0OO0<R> r8 = r2.f14442o00oo0Oo
                o0OOOOO0.o0OO0O0$o00oo0OO<R> r9 = r2.f14441o00oo0O0
                T r9 = r9.element
                r2 = 0
                r0.L$0 = r2
                r0.L$1 = r2
                r0.label = r3
                java.lang.Object r8 = r8.emit(r9, r0)
                if (r8 != r1) goto L6e
                return r1
            L6e:
                o0OO0o.oO0Ooooo r8 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOo0OO.o0oo0000.o00oo0O0.emit(java.lang.Object, o0OO.o00oOo0O):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"o0OOo0Oo/oO0O000o$o00oOOoO", "Lo0OOo0OO/o0OO00o;", "Lo0OOo0OO/o0OO0;", "collector", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "(Lo0OOo0OO/o0OO0;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oo0OO<R> implements o0OO00o<R> {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o0OO00o f14443o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Object f14444o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ o0O0000O f14445o00oo0Oo;

        @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
        @o0OOO0.o00oo00O(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1", f = "Transform.kt", i = {0, 0, 0}, l = {114, 115}, m = "collect", n = {"this", "$this$runningFold_u24lambda_u2d8", "accumulator"}, s = {"L$0", "L$1", "L$2"})
        /* loaded from: classes3.dex */
        public static final class o00oOOo0 extends o0OOO0.o00oOo0O {
            public Object L$0;
            public Object L$1;
            public Object L$2;
            public int label;
            public /* synthetic */ Object result;

            public o00oOOo0(o0OO.o00oOo0O o00ooo0o2) {
                super(o00ooo0o2);
            }

            @Override // o0OOO0.o00oOOo0
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return o00oo0OO.this.o00oOOo0(null, this);
            }
        }

        public o00oo0OO(Object obj, o0OO00o o0oo00o, o0O0000O o0o0000o) {
            this.f14444o00oo0O0 = obj;
            this.f14443o00oo0O = o0oo00o;
            this.f14445o00oo0Oo = o0o0000o;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0078 A[RETURN] */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // o0OOo0OO.o0OO00o
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object o00oOOo0(@org.jetbrains.annotations.NotNull o0OOo0OO.o0OO0<? super R> r7, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof o0OOo0OO.o0oo0000.o00oo0OO.o00oOOo0
                if (r0 == 0) goto L13
                r0 = r8
                o0OOo0OO.o0oo0000$o00oo0OO$o00oOOo0 r0 = (o0OOo0OO.o0oo0000.o00oo0OO.o00oOOo0) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                o0OOo0OO.o0oo0000$o00oo0OO$o00oOOo0 r0 = new o0OOo0OO.o0oo0000$o00oo0OO$o00oOOo0
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.result
                o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L42
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2a
                o0OO0o.oo0ooO.o00oo0(r8)
                goto L79
            L2a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L32:
                java.lang.Object r7 = r0.L$2
                o0OOOOO0.o0OO0O0$o00oo0OO r7 = (o0OOOOO0.o0OO0O0.o00oo0OO) r7
                java.lang.Object r2 = r0.L$1
                o0OOo0OO.o0OO0 r2 = (o0OOo0OO.o0OO0) r2
                java.lang.Object r4 = r0.L$0
                o0OOo0OO.o0oo0000$o00oo0OO r4 = (o0OOo0OO.o0oo0000.o00oo0OO) r4
                o0OO0o.oo0ooO.o00oo0(r8)
                goto L60
            L42:
                o0OO0o.oo0ooO.o00oo0(r8)
                o0OOOOO0.o0OO0O0$o00oo0OO r8 = new o0OOOOO0.o0OO0O0$o00oo0OO
                r8.<init>()
                java.lang.Object r2 = r6.f14444o00oo0O0
                r8.element = r2
                r0.L$0 = r6
                r0.L$1 = r7
                r0.L$2 = r8
                r0.label = r4
                java.lang.Object r2 = r7.emit(r2, r0)
                if (r2 != r1) goto L5d
                return r1
            L5d:
                r4 = r6
                r2 = r7
                r7 = r8
            L60:
                o0OOo0OO.o0OO00o r8 = r4.f14443o00oo0O
                o0OOo0OO.o0oo0000$o00oo0O0 r5 = new o0OOo0OO.o0oo0000$o00oo0O0
                o0OOOO.o0O0000O r4 = r4.f14445o00oo0Oo
                r5.<init>(r7, r4, r2)
                r7 = 0
                r0.L$0 = r7
                r0.L$1 = r7
                r0.L$2 = r7
                r0.label = r3
                java.lang.Object r7 = r8.o00oOOo0(r5, r0)
                if (r7 != r1) goto L79
                return r1
            L79:
                o0OO0o.oO0Ooooo r7 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOo0OO.o0oo0000.o00oo0OO.o00oOOo0(o0OOo0OO.o0OO0, o0OO.o00oOo0O):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "value", "Lo0OO0o/oO0Ooooo;", "emit", "(Ljava/lang/Object;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00ooO0<T> implements o0OO0 {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o0OO0O0.o00oo00O f14446o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OO0<o0O0o000<? extends T>> f14447o00oo0O0;

        @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
        @o0OOO0.o00oo00O(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1", f = "Transform.kt", i = {}, l = {65}, m = "emit", n = {}, s = {})
        /* loaded from: classes3.dex */
        public static final class o00oOOo0 extends o0OOO0.o00oOo0O {
            public int label;
            public /* synthetic */ Object result;
            public final /* synthetic */ o00ooO0<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public o00oOOo0(o00ooO0<? super T> o00ooo02, o0OO.o00oOo0O<? super o00oOOo0> o00ooo0o2) {
                super(o00ooo0o2);
                this.this$0 = o00ooo02;
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
        public o00ooO0(o0OO0<? super o0O0o000<? extends T>> o0oo0, o0OO0O0.o00oo00O o00oo00o) {
            this.f14447o00oo0O0 = o0oo0;
            this.f14446o00oo0O = o00oo00o;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
        @Override // o0OOo0OO.o0OO0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r8, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof o0OOo0OO.o0oo0000.o00ooO0.o00oOOo0
                if (r0 == 0) goto L13
                r0 = r9
                o0OOo0OO.o0oo0000$o00ooO0$o00oOOo0 r0 = (o0OOo0OO.o0oo0000.o00ooO0.o00oOOo0) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                o0OOo0OO.o0oo0000$o00ooO0$o00oOOo0 r0 = new o0OOo0OO.o0oo0000$o00ooO0$o00oOOo0
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                o0OO0o.oo0ooO.o00oo0(r9)
                goto L4c
            L27:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L2f:
                o0OO0o.oo0ooO.o00oo0(r9)
                o0OOo0OO.o0OO0<o0OO0oO.o0O0o000<? extends T>> r9 = r7.f14447o00oo0O0
                o0OO0oO.o0O0o000 r2 = new o0OO0oO.o0O0o000
                o0OOOOO0.o0OO0O0$o00oo00O r4 = r7.f14446o00oo0O
                int r5 = r4.element
                int r6 = r5 + 1
                r4.element = r6
                if (r5 < 0) goto L4f
                r2.<init>(r5, r8)
                r0.label = r3
                java.lang.Object r8 = r9.emit(r2, r0)
                if (r8 != r1) goto L4c
                return r1
            L4c:
                o0OO0o.oO0Ooooo r8 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                return r8
            L4f:
                java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
                java.lang.String r9 = "Index overflow has happened"
                r8.<init>(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOo0OO.o0oo0000.o00ooO0.emit(java.lang.Object, o0OO.o00oOo0O):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "value", "Lo0OO0o/oO0Ooooo;", "emit", "(Ljava/lang/Object;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o0O0o<T> implements o0OO0 {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o0O0000O<T, T, o0OO.o00oOo0O<? super T>, Object> f14448o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OO0O0.o00oo0OO<Object> f14449o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ o0OO0<T> f14450o00oo0Oo;

        @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
        @o0OOO0.o00oo00O(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1", f = "Transform.kt", i = {0}, l = {125, 127}, m = "emit", n = {"this"}, s = {"L$0"})
        /* loaded from: classes3.dex */
        public static final class o00oOOo0 extends o0OOO0.o00oOo0O {
            public Object L$0;
            public Object L$1;
            public int label;
            public /* synthetic */ Object result;
            public final /* synthetic */ o0O0o<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public o00oOOo0(o0O0o<? super T> o0o0o, o0OO.o00oOo0O<? super o00oOOo0> o00ooo0o2) {
                super(o00ooo0o2);
                this.this$0 = o0o0o;
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
        public o0O0o(o0OO0O0.o00oo0OO<Object> o00oo0oo, o0O0000O<? super T, ? super T, ? super o0OO.o00oOo0O<? super T>, ? extends Object> o0o0000o, o0OO0<? super T> o0oo0) {
            this.f14449o00oo0O0 = o00oo0oo;
            this.f14448o00oo0O = o0o0000o;
            this.f14450o00oo0Oo = o0oo0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0076 A[RETURN] */
        /* JADX WARN: Type inference failed for: r9v7 */
        @Override // o0OOo0OO.o0OO0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r8, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof o0OOo0OO.o0oo0000.o0O0o.o00oOOo0
                if (r0 == 0) goto L13
                r0 = r9
                o0OOo0OO.o0oo0000$o0O0o$o00oOOo0 r0 = (o0OOo0OO.o0oo0000.o0O0o.o00oOOo0) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                o0OOo0OO.o0oo0000$o0O0o$o00oOOo0 r0 = new o0OOo0OO.o0oo0000$o0O0o$o00oOOo0
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3e
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2a
                o0OO0o.oo0ooO.o00oo0(r9)
                goto L77
            L2a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L32:
                java.lang.Object r8 = r0.L$1
                o0OOOOO0.o0OO0O0$o00oo0OO r8 = (o0OOOOO0.o0OO0O0.o00oo0OO) r8
                java.lang.Object r2 = r0.L$0
                o0OOo0OO.o0oo0000$o0O0o r2 = (o0OOo0OO.o0oo0000.o0O0o) r2
                o0OO0o.oo0ooO.o00oo0(r9)
                goto L5e
            L3e:
                o0OO0o.oo0ooO.o00oo0(r9)
                o0OOOOO0.o0OO0O0$o00oo0OO<java.lang.Object> r9 = r7.f14449o00oo0O0
                T r2 = r9.element
                o0OOo0o0.oO0o0o r5 = o0OOo0Oo.oOo000o0.f14562o00oOOo0
                if (r2 != r5) goto L4b
                r2 = r7
                goto L61
            L4b:
                o0OOOO.o0O0000O<T, T, o0OO.o00oOo0O<? super T>, java.lang.Object> r5 = r7.f14448o00oo0O
                r0.L$0 = r7
                r0.L$1 = r9
                r0.label = r4
                java.lang.Object r8 = r5.invoke(r2, r8, r0)
                if (r8 != r1) goto L5a
                return r1
            L5a:
                r2 = r7
                r6 = r9
                r9 = r8
                r8 = r6
            L5e:
                r6 = r9
                r9 = r8
                r8 = r6
            L61:
                r9.element = r8
                o0OOo0OO.o0OO0<T> r8 = r2.f14450o00oo0Oo
                o0OOOOO0.o0OO0O0$o00oo0OO<java.lang.Object> r9 = r2.f14449o00oo0O0
                T r9 = r9.element
                r2 = 0
                r0.L$0 = r2
                r0.L$1 = r2
                r0.label = r3
                java.lang.Object r8 = r8.emit(r9, r0)
                if (r8 != r1) goto L77
                return r1
            L77:
                o0OO0o.oO0Ooooo r8 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOo0OO.o0oo0000.o0O0o.emit(java.lang.Object, o0OO.o00oOo0O):java.lang.Object");
        }
    }

    @NotNull
    public static final <T> o0OO00o<T> o00oOOo0(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O00000<? super T, ? super o0OO.o00oOo0O<? super Boolean>, ? extends Object> o0o00000) {
        return new o00oOOo0(o0oo00o, o0o00000);
    }

    public static final <R> o0OO00o<R> o00oOOoO(o0OO00o<?> o0oo00o) {
        o0ooO.o00oooOo();
        return new o00oOOoO(o0oo00o);
    }

    @NotNull
    public static final <T> o0OO00o<T> o00oOo00(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O00000<? super T, ? super o0OO.o00oOo0O<? super Boolean>, ? extends Object> o0o00000) {
        return new o00oOo00(o0oo00o, o0o00000);
    }

    @NotNull
    public static final <T, R> o0OO00o<R> o00oOo0O(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O00000<? super T, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o00000) {
        return new o00oOoO(o0oo00o, o0o00000);
    }

    @NotNull
    public static final <T, R> o0OO00o<R> o00oOo0o(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O00000<? super T, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o00000) {
        return new o00oo00O(o0oo00o, o0o00000);
    }

    @NotNull
    public static final <T, R> o0OO00o<R> o00oOoO(@NotNull o0OO00o<? extends T> o0oo00o, R r, @o0OO0o.o00oOOoO @NotNull o0O0000O<? super R, ? super T, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o0000o) {
        return new o00oo0OO(r, o0oo00o, o0o0000o);
    }

    @NotNull
    public static final <T> o0OO00o<T> o00oOoO0(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O00000<? super T, ? super o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o00000) {
        return new o00oo0(o0oo00o, o0o00000);
    }

    @NotNull
    public static final <T> o0OO00o<T> o00oOoOO(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O0000O<? super T, ? super T, ? super o0OO.o00oOo0O<? super T>, ? extends Object> o0o0000o) {
        return new o00oo0O(o0oo00o, o0o0000o);
    }

    @NotNull
    public static final <T, R> o0OO00o<R> o00oOoOo(@NotNull o0OO00o<? extends T> o0oo00o, R r, @o0OO0o.o00oOOoO @NotNull o0O0000O<? super R, ? super T, ? super o0OO.o00oOo0O<? super R>, ? extends Object> o0o0000o) {
        return new o00oo0OO(r, o0oo00o, o0o0000o);
    }

    @NotNull
    public static final <T> o0OO00o<o0O0o000<T>> o00oOoo0(@NotNull o0OO00o<? extends T> o0oo00o) {
        return new o00oo(o0oo00o);
    }

    @NotNull
    public static final <T> o0OO00o<T> o00oOooO(@NotNull o0OO00o<? extends T> o0oo00o) {
        return new o00oOo0O(o0oo00o);
    }
}
