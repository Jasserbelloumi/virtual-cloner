package o0OOo0OO;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import kotlin.Metadata;
import o0OO0o.o0O0oo0o;
import o0OOOO.o0O00000;
import o0OOOo0o.o0O0O0Oo;
import o0OOOo0o.o0O0OO0;
import o0OOo0O0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0007\u001a8\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0012\u001a\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0014\u001a-\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0016\"\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0012\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000\u001a#\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\u0004\b\u001e\u0010\u0019\u001a\u0010\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\b*\u00020\u001f\u001a\u0010\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\b*\u00020\"\u001a\u0010\u0010&\u001a\b\u0012\u0004\u0012\u00020 0\b*\u00020%\u001a\u0010\u0010(\u001a\b\u0012\u0004\u0012\u00020#0\b*\u00020'\u001aM\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b*\u0010\n\u001aM\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000¢\u0006\u0004\b+\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function2;", "Lo0OOo0OO/o0OO0;", "Lo0OO/o00oOo0O;", "Lo0OO0o/oO0Ooooo;", "", "Lo0OO0o/o0O000Oo;", "block", "Lo0OOo0OO/o0OO00o;", "o00oo0", "(Lo0OOOO/o0O00000;)Lo0OOo0OO/o0OO00o;", "Lkotlin/Function0;", "o00oOo00", "Lkotlin/Function1;", "o00oOooO", "(Lo0OOOO/o00oo;)Lo0OOo0OO/o0OO00o;", "", "o00oOOo0", "", o0OO000o.o00oOOoO.f12961o00oOo00, "Lo0OOOoO0/oO000;", "o00oOoO0", "", "elements", "o00oo0O0", "([Ljava/lang/Object;)Lo0OOo0OO/o0OO00o;", "value", "o00oo0OO", "(Ljava/lang/Object;)Lo0OOo0OO/o0OO00o;", "o00oo00O", "o00oOoOo", "", "", "o00oOoO", "", "", "o00oOoOO", "Lo0OOOo0o/o0O0O0Oo;", "o00oOo0O", "Lo0OOOo0o/o0O0OO0;", "o00oOo0o", "Lo0OOo0O0/o0ooO;", "o00oOooo", "o00oOoo0", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class o0OOooO0 {

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"o0OOo0Oo/oO0O000o$o00oOOoO", "Lo0OOo0OO/o0OO00o;", "Lo0OOo0OO/o0OO0;", "collector", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "(Lo0OOo0OO/o0OO0;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 implements o0OO00o<Long> {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0O0OO0 f14386o00oo0O0;

        @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
        @o0OOO0.o00oo00O(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d19"}, s = {"L$0"})
        /* renamed from: o0OOo0OO.o0OOooO0$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0194o00oOOo0 extends o0OOO0.o00oOo0O {
            public Object L$0;
            public Object L$1;
            public int label;
            public /* synthetic */ Object result;

            public C0194o00oOOo0(o0OO.o00oOo0O o00ooo0o2) {
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

        public o00oOOo0(o0O0OO0 o0o0oo0) {
            this.f14386o00oo0O0 = o0o0oo0;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        @Override // o0OOo0OO.o0OO00o
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object o00oOOo0(@org.jetbrains.annotations.NotNull o0OOo0OO.o0OO0<? super java.lang.Long> r8, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof o0OOo0OO.o0OOooO0.o00oOOo0.C0194o00oOOo0
                if (r0 == 0) goto L13
                r0 = r9
                o0OOo0OO.o0OOooO0$o00oOOo0$o00oOOo0 r0 = (o0OOo0OO.o0OOooO0.o00oOOo0.C0194o00oOOo0) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                o0OOo0OO.o0OOooO0$o00oOOo0$o00oOOo0 r0 = new o0OOo0OO.o0OOooO0$o00oOOo0$o00oOOo0
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.result
                o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r8 = r0.L$1
                java.util.Iterator r8 = (java.util.Iterator) r8
                java.lang.Object r2 = r0.L$0
                o0OOo0OO.o0OO0 r2 = (o0OOo0OO.o0OO0) r2
                o0OO0o.oo0ooO.o00oo0(r9)
                r9 = r2
                goto L44
            L30:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L38:
                o0OO0o.oo0ooO.o00oo0(r9)
                o0OOOo0o.o0O0OO0 r9 = r7.f14386o00oo0O0
                java.util.Iterator r9 = r9.iterator()
                r6 = r9
                r9 = r8
                r8 = r6
            L44:
                boolean r2 = r8.hasNext()
                if (r2 == 0) goto L63
                r2 = r8
                o0OO0oO.o0oOo0O0 r2 = (o0OO0oO.o0oOo0O0) r2
                long r4 = r2.nextLong()
                java.lang.Long r2 = new java.lang.Long
                r2.<init>(r4)
                r0.L$0 = r9
                r0.L$1 = r8
                r0.label = r3
                java.lang.Object r2 = r9.emit(r2, r0)
                if (r2 != r1) goto L44
                return r1
            L63:
                o0OO0o.oO0Ooooo r8 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOo0OO.o0OOooO0.o00oOOo0.o00oOOo0(o0OOo0OO.o0OO0, o0OO.o00oOo0O):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"o0OOo0Oo/oO0O000o$o00oOOoO", "Lo0OOo0OO/o0OO00o;", "Lo0OOo0OO/o0OO0;", "collector", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "(Lo0OOo0OO/o0OO0;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO<T> implements o0OO00o<T> {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o00oOOo0 f14387o00oo0O0;

        public o00oOOoO(o0OOOO.o00oOOo0 o00oooo02) {
            this.f14387o00oo0O0 = o00oooo02;
        }

        @Override // o0OOo0OO.o0OO00o
        @Nullable
        public Object o00oOOo0(@NotNull o0OO0<? super T> o0oo0, @NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            Object emit = o0oo0.emit((Object) this.f14387o00oo0O0.invoke(), o00ooo0o2);
            return emit == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED ? emit : o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"o0OOo0Oo/oO0O000o$o00oOOoO", "Lo0OOo0OO/o0OO00o;", "Lo0OOo0OO/o0OO0;", "collector", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "(Lo0OOo0OO/o0OO0;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOo00<T> implements o0OO00o<T> {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o00oo f14388o00oo0O0;

        @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
        @o0OOO0.o00oo00O(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2", f = "Builders.kt", i = {}, l = {113, 113}, m = "collect", n = {}, s = {})
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
                return o00oOo00.this.o00oOOo0(null, this);
            }
        }

        public o00oOo00(o0OOOO.o00oo o00ooVar) {
            this.f14388o00oo0O0 = o00ooVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[RETURN] */
        @Override // o0OOo0OO.o0OO00o
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object o00oOOo0(@org.jetbrains.annotations.NotNull o0OOo0OO.o0OO0<? super T> r6, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof o0OOo0OO.o0OOooO0.o00oOo00.o00oOOo0
                if (r0 == 0) goto L13
                r0 = r7
                o0OOo0OO.o0OOooO0$o00oOo00$o00oOOo0 r0 = (o0OOo0OO.o0OOooO0.o00oOo00.o00oOOo0) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                o0OOo0OO.o0OOooO0$o00oOo00$o00oOOo0 r0 = new o0OOo0OO.o0OOooO0$o00oOo00$o00oOOo0
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.result
                o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3a
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2a
                o0OO0o.oo0ooO.o00oo0(r7)
                goto L56
            L2a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L32:
                java.lang.Object r6 = r0.L$0
                o0OOo0OO.o0OO0 r6 = (o0OOo0OO.o0OO0) r6
                o0OO0o.oo0ooO.o00oo0(r7)
                goto L4a
            L3a:
                o0OO0o.oo0ooO.o00oo0(r7)
                o0OOOO.o00oo r7 = r5.f14388o00oo0O0
                r0.L$0 = r6
                r0.label = r4
                java.lang.Object r7 = r7.invoke(r0)
                if (r7 != r1) goto L4a
                return r1
            L4a:
                r2 = 0
                r0.L$0 = r2
                r0.label = r3
                java.lang.Object r6 = r6.emit(r7, r0)
                if (r6 != r1) goto L56
                return r1
            L56:
                o0OO0o.oO0Ooooo r6 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOo0OO.o0OOooO0.o00oOo00.o00oOOo0(o0OOo0OO.o0OO0, o0OO.o00oOo0O):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"o0OOo0Oo/oO0O000o$o00oOOoO", "Lo0OOo0OO/o0OO00o;", "Lo0OOo0OO/o0OO0;", "collector", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "(Lo0OOo0OO/o0OO0;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOo0O<T> implements o0OO00o<T> {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Iterable f14389o00oo0O0;

        @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
        @o0OOO0.o00oo00O(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d3"}, s = {"L$0"})
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
                return o00oOo0O.this.o00oOOo0(null, this);
            }
        }

        public o00oOo0O(Iterable iterable) {
            this.f14389o00oo0O0 = iterable;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        @Override // o0OOo0OO.o0OO00o
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object o00oOOo0(@org.jetbrains.annotations.NotNull o0OOo0OO.o0OO0<? super T> r6, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof o0OOo0OO.o0OOooO0.o00oOo0O.o00oOOo0
                if (r0 == 0) goto L13
                r0 = r7
                o0OOo0OO.o0OOooO0$o00oOo0O$o00oOOo0 r0 = (o0OOo0OO.o0OOooO0.o00oOo0O.o00oOOo0) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                o0OOo0OO.o0OOooO0$o00oOo0O$o00oOOo0 r0 = new o0OOo0OO.o0OOooO0$o00oOo0O$o00oOOo0
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.result
                o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r6 = r0.L$1
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.L$0
                o0OOo0OO.o0OO0 r2 = (o0OOo0OO.o0OO0) r2
                o0OO0o.oo0ooO.o00oo0(r7)
                r7 = r2
                goto L44
            L30:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L38:
                o0OO0o.oo0ooO.o00oo0(r7)
                java.lang.Iterable r7 = r5.f14389o00oo0O0
                java.util.Iterator r7 = r7.iterator()
                r4 = r7
                r7 = r6
                r6 = r4
            L44:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L5b
                java.lang.Object r2 = r6.next()
                r0.L$0 = r7
                r0.L$1 = r6
                r0.label = r3
                java.lang.Object r2 = r7.emit(r2, r0)
                if (r2 != r1) goto L44
                return r1
            L5b:
                o0OO0o.oO0Ooooo r6 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOo0OO.o0OOooO0.o00oOo0O.o00oOOo0(o0OOo0OO.o0OO0, o0OO.o00oOo0O):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"o0OOo0Oo/oO0O000o$o00oOOoO", "Lo0OOo0OO/o0OO00o;", "Lo0OOo0OO/o0OO0;", "collector", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "(Lo0OOo0OO/o0OO0;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOoO<T> implements o0OO00o<T> {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Iterator f14390o00oo0O0;

        @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
        @o0OOO0.o00oo00O(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$4", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d5"}, s = {"L$0"})
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
                return o00oOoO.this.o00oOOo0(null, this);
            }
        }

        public o00oOoO(Iterator it) {
            this.f14390o00oo0O0 = it;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
        @Override // o0OOo0OO.o0OO00o
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object o00oOOo0(@org.jetbrains.annotations.NotNull o0OOo0OO.o0OO0<? super T> r6, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof o0OOo0OO.o0OOooO0.o00oOoO.o00oOOo0
                if (r0 == 0) goto L13
                r0 = r7
                o0OOo0OO.o0OOooO0$o00oOoO$o00oOOo0 r0 = (o0OOo0OO.o0OOooO0.o00oOoO.o00oOOo0) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                o0OOo0OO.o0OOooO0$o00oOoO$o00oOOo0 r0 = new o0OOo0OO.o0OOooO0$o00oOoO$o00oOOo0
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.result
                o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r6 = r0.L$1
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.L$0
                o0OOo0OO.o0OO0 r2 = (o0OOo0OO.o0OO0) r2
                o0OO0o.oo0ooO.o00oo0(r7)
                r7 = r2
                goto L40
            L30:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L38:
                o0OO0o.oo0ooO.o00oo0(r7)
                java.util.Iterator r7 = r5.f14390o00oo0O0
                r4 = r7
                r7 = r6
                r6 = r4
            L40:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L57
                java.lang.Object r2 = r6.next()
                r0.L$0 = r7
                r0.L$1 = r6
                r0.label = r3
                java.lang.Object r2 = r7.emit(r2, r0)
                if (r2 != r1) goto L40
                return r1
            L57:
                o0OO0o.oO0Ooooo r6 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOo0OO.o0OOooO0.o00oOoO.o00oOOo0(o0OOo0OO.o0OO0, o0OO.o00oOo0O):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"o0OOo0Oo/oO0O000o$o00oOOoO", "Lo0OOo0OO/o0OO00o;", "Lo0OOo0OO/o0OO0;", "collector", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "(Lo0OOo0OO/o0OO0;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oo<T> implements o0OO00o<T> {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Object f14391o00oo0O0;

        public o00oo(Object obj) {
            this.f14391o00oo0O0 = obj;
        }

        @Override // o0OOo0OO.o0OO00o
        @Nullable
        public Object o00oOOo0(@NotNull o0OO0<? super T> o0oo0, @NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            Object emit = o0oo0.emit((Object) this.f14391o00oo0O0, o00ooo0o2);
            return emit == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED ? emit : o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"o0OOo0Oo/oO0O000o$o00oOOoO", "Lo0OOo0OO/o0OO00o;", "Lo0OOo0OO/o0OO0;", "collector", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "(Lo0OOo0OO/o0OO0;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oo0<T> implements o0OO00o<T> {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Object[] f14392o00oo0O0;

        @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
        @o0OOO0.o00oo00O(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6", f = "Builders.kt", i = {0, 0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d11", "$this$forEach$iv"}, s = {"L$0", "L$1"})
        /* loaded from: classes3.dex */
        public static final class o00oOOo0 extends o0OOO0.o00oOo0O {
            public int I$0;
            public int I$1;
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
                return o00oo0.this.o00oOOo0(null, this);
            }
        }

        public o00oo0(Object[] objArr) {
            this.f14392o00oo0O0 = objArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0059 -> B:19:0x005c). Please submit an issue!!! */
        @Override // o0OOo0OO.o0OO00o
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object o00oOOo0(@org.jetbrains.annotations.NotNull o0OOo0OO.o0OO0<? super T> r8, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof o0OOo0OO.o0OOooO0.o00oo0.o00oOOo0
                if (r0 == 0) goto L13
                r0 = r9
                o0OOo0OO.o0OOooO0$o00oo0$o00oOOo0 r0 = (o0OOo0OO.o0OOooO0.o00oo0.o00oOOo0) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                o0OOo0OO.o0OOooO0$o00oo0$o00oOOo0 r0 = new o0OOo0OO.o0OOooO0$o00oo0$o00oOOo0
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.result
                o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3c
                if (r2 != r3) goto L34
                int r8 = r0.I$1
                int r2 = r0.I$0
                java.lang.Object r4 = r0.L$1
                java.lang.Object[] r4 = (java.lang.Object[]) r4
                java.lang.Object r5 = r0.L$0
                o0OOo0OO.o0OO0 r5 = (o0OOo0OO.o0OO0) r5
                o0OO0o.oo0ooO.o00oo0(r9)
                r9 = r5
                goto L5c
            L34:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3c:
                o0OO0o.oo0ooO.o00oo0(r9)
                java.lang.Object[] r9 = r7.f14392o00oo0O0
                r2 = 0
                int r4 = r9.length
                r6 = r9
                r9 = r8
                r8 = r4
                r4 = r6
            L47:
                if (r2 >= r8) goto L5e
                r5 = r4[r2]
                r0.L$0 = r9
                r0.L$1 = r4
                r0.I$0 = r2
                r0.I$1 = r8
                r0.label = r3
                java.lang.Object r5 = r9.emit(r5, r0)
                if (r5 != r1) goto L5c
                return r1
            L5c:
                int r2 = r2 + r3
                goto L47
            L5e:
                o0OO0o.oO0Ooooo r8 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOo0OO.o0OOooO0.o00oo0.o00oOOo0(o0OOo0OO.o0OO0, o0OO.o00oOo0O):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"o0OOo0Oo/oO0O000o$o00oOOoO", "Lo0OOo0OO/o0OO00o;", "Lo0OOo0OO/o0OO0;", "collector", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "(Lo0OOo0OO/o0OO0;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oo00O<T> implements o0OO00o<T> {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OOOoO0.oO000 f14393o00oo0O0;

        @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
        @o0OOO0.o00oo00O(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d7"}, s = {"L$0"})
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
                return o00oo00O.this.o00oOOo0(null, this);
            }
        }

        public o00oo00O(o0OOOoO0.oO000 oo000) {
            this.f14393o00oo0O0 = oo000;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        @Override // o0OOo0OO.o0OO00o
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object o00oOOo0(@org.jetbrains.annotations.NotNull o0OOo0OO.o0OO0<? super T> r6, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof o0OOo0OO.o0OOooO0.o00oo00O.o00oOOo0
                if (r0 == 0) goto L13
                r0 = r7
                o0OOo0OO.o0OOooO0$o00oo00O$o00oOOo0 r0 = (o0OOo0OO.o0OOooO0.o00oo00O.o00oOOo0) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                o0OOo0OO.o0OOooO0$o00oo00O$o00oOOo0 r0 = new o0OOo0OO.o0OOooO0$o00oo00O$o00oOOo0
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.result
                o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r6 = r0.L$1
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.L$0
                o0OOo0OO.o0OO0 r2 = (o0OOo0OO.o0OO0) r2
                o0OO0o.oo0ooO.o00oo0(r7)
                r7 = r2
                goto L44
            L30:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L38:
                o0OO0o.oo0ooO.o00oo0(r7)
                o0OOOoO0.oO000 r7 = r5.f14393o00oo0O0
                java.util.Iterator r7 = r7.iterator()
                r4 = r7
                r7 = r6
                r6 = r4
            L44:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L5b
                java.lang.Object r2 = r6.next()
                r0.L$0 = r7
                r0.L$1 = r6
                r0.label = r3
                java.lang.Object r2 = r7.emit(r2, r0)
                if (r2 != r1) goto L44
                return r1
            L5b:
                o0OO0o.oO0Ooooo r6 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOo0OO.o0OOooO0.o00oo00O.o00oOOo0(o0OOo0OO.o0OO0, o0OO.o00oOo0O):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"o0OOo0Oo/oO0O000o$o00oOOoO", "Lo0OOo0OO/o0OO00o;", "Lo0OOo0OO/o0OO0;", "collector", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "(Lo0OOo0OO/o0OO0;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oo0O implements o0OO00o<Integer> {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0O0O0Oo f14394o00oo0O0;

        @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
        @o0OOO0.o00oo00O(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9", f = "Builders.kt", i = {0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d17"}, s = {"L$0"})
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
                return o00oo0O.this.o00oOOo0(null, this);
            }
        }

        public o00oo0O(o0O0O0Oo o0o0o0oo) {
            this.f14394o00oo0O0 = o0o0o0oo;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        @Override // o0OOo0OO.o0OO00o
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object o00oOOo0(@org.jetbrains.annotations.NotNull o0OOo0OO.o0OO0<? super java.lang.Integer> r7, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof o0OOo0OO.o0OOooO0.o00oo0O.o00oOOo0
                if (r0 == 0) goto L13
                r0 = r8
                o0OOo0OO.o0OOooO0$o00oo0O$o00oOOo0 r0 = (o0OOo0OO.o0OOooO0.o00oo0O.o00oOOo0) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                o0OOo0OO.o0OOooO0$o00oo0O$o00oOOo0 r0 = new o0OOo0OO.o0OOooO0$o00oo0O$o00oOOo0
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.result
                o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r7 = r0.L$1
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r2 = r0.L$0
                o0OOo0OO.o0OO0 r2 = (o0OOo0OO.o0OO0) r2
                o0OO0o.oo0ooO.o00oo0(r8)
                r8 = r2
                goto L44
            L30:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L38:
                o0OO0o.oo0ooO.o00oo0(r8)
                o0OOOo0o.o0O0O0Oo r8 = r6.f14394o00oo0O0
                java.util.Iterator r8 = r8.iterator()
                r5 = r8
                r8 = r7
                r7 = r5
            L44:
                boolean r2 = r7.hasNext()
                if (r2 == 0) goto L63
                r2 = r7
                o0OO0oO.o0O0o0 r2 = (o0OO0oO.o0O0o0) r2
                int r2 = r2.nextInt()
                java.lang.Integer r4 = new java.lang.Integer
                r4.<init>(r2)
                r0.L$0 = r8
                r0.L$1 = r7
                r0.label = r3
                java.lang.Object r2 = r8.emit(r4, r0)
                if (r2 != r1) goto L44
                return r1
            L63:
                o0OO0o.oO0Ooooo r7 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOo0OO.o0OOooO0.o00oo0O.o00oOOo0(o0OOo0OO.o0OO0, o0OO.o00oOo0O):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"o0OOo0Oo/oO0O000o$o00oOOoO", "Lo0OOo0OO/o0OO00o;", "Lo0OOo0OO/o0OO0;", "collector", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "(Lo0OOo0OO/o0OO0;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oo0O0 implements o0OO00o<Long> {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ long[] f14395o00oo0O0;

        @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
        @o0OOO0.o00oo00O(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8", f = "Builders.kt", i = {0, 0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d15", "$this$forEach$iv"}, s = {"L$0", "L$1"})
        /* loaded from: classes3.dex */
        public static final class o00oOOo0 extends o0OOO0.o00oOo0O {
            public int I$0;
            public int I$1;
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
                return o00oo0O0.this.o00oOOo0(null, this);
            }
        }

        public o00oo0O0(long[] jArr) {
            this.f14395o00oo0O0 = jArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005e -> B:19:0x0061). Please submit an issue!!! */
        @Override // o0OOo0OO.o0OO00o
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object o00oOOo0(@org.jetbrains.annotations.NotNull o0OOo0OO.o0OO0<? super java.lang.Long> r10, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> r11) {
            /*
                r9 = this;
                boolean r0 = r11 instanceof o0OOo0OO.o0OOooO0.o00oo0O0.o00oOOo0
                if (r0 == 0) goto L13
                r0 = r11
                o0OOo0OO.o0OOooO0$o00oo0O0$o00oOOo0 r0 = (o0OOo0OO.o0OOooO0.o00oo0O0.o00oOOo0) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                o0OOo0OO.o0OOooO0$o00oo0O0$o00oOOo0 r0 = new o0OOo0OO.o0OOooO0$o00oo0O0$o00oOOo0
                r0.<init>(r11)
            L18:
                java.lang.Object r11 = r0.result
                o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3c
                if (r2 != r3) goto L34
                int r10 = r0.I$1
                int r2 = r0.I$0
                java.lang.Object r4 = r0.L$1
                long[] r4 = (long[]) r4
                java.lang.Object r5 = r0.L$0
                o0OOo0OO.o0OO0 r5 = (o0OOo0OO.o0OO0) r5
                o0OO0o.oo0ooO.o00oo0(r11)
                r11 = r5
                goto L61
            L34:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L3c:
                o0OO0o.oo0ooO.o00oo0(r11)
                long[] r11 = r9.f14395o00oo0O0
                r2 = 0
                int r4 = r11.length
                r8 = r11
                r11 = r10
                r10 = r4
                r4 = r8
            L47:
                if (r2 >= r10) goto L63
                r5 = r4[r2]
                java.lang.Long r7 = new java.lang.Long
                r7.<init>(r5)
                r0.L$0 = r11
                r0.L$1 = r4
                r0.I$0 = r2
                r0.I$1 = r10
                r0.label = r3
                java.lang.Object r5 = r11.emit(r7, r0)
                if (r5 != r1) goto L61
                return r1
            L61:
                int r2 = r2 + r3
                goto L47
            L63:
                o0OO0o.oO0Ooooo r10 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOo0OO.o0OOooO0.o00oo0O0.o00oOOo0(o0OOo0OO.o0OO0, o0OO.o00oOo0O):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"o0OOo0Oo/oO0O000o$o00oOOoO", "Lo0OOo0OO/o0OO00o;", "Lo0OOo0OO/o0OO0;", "collector", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "(Lo0OOo0OO/o0OO0;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oo0OO implements o0OO00o<Integer> {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ int[] f14396o00oo0O0;

        @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
        @o0OOO0.o00oo00O(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7", f = "Builders.kt", i = {0, 0}, l = {115}, m = "collect", n = {"$this$asFlow_u24lambda_u2d13", "$this$forEach$iv"}, s = {"L$0", "L$1"})
        /* loaded from: classes3.dex */
        public static final class o00oOOo0 extends o0OOO0.o00oOo0O {
            public int I$0;
            public int I$1;
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
                return o00oo0OO.this.o00oOOo0(null, this);
            }
        }

        public o00oo0OO(int[] iArr) {
            this.f14396o00oo0O0 = iArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005e -> B:19:0x0061). Please submit an issue!!! */
        @Override // o0OOo0OO.o0OO00o
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object o00oOOo0(@org.jetbrains.annotations.NotNull o0OOo0OO.o0OO0<? super java.lang.Integer> r9, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof o0OOo0OO.o0OOooO0.o00oo0OO.o00oOOo0
                if (r0 == 0) goto L13
                r0 = r10
                o0OOo0OO.o0OOooO0$o00oo0OO$o00oOOo0 r0 = (o0OOo0OO.o0OOooO0.o00oo0OO.o00oOOo0) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                o0OOo0OO.o0OOooO0$o00oo0OO$o00oOOo0 r0 = new o0OOo0OO.o0OOooO0$o00oo0OO$o00oOOo0
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.result
                o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3c
                if (r2 != r3) goto L34
                int r9 = r0.I$1
                int r2 = r0.I$0
                java.lang.Object r4 = r0.L$1
                int[] r4 = (int[]) r4
                java.lang.Object r5 = r0.L$0
                o0OOo0OO.o0OO0 r5 = (o0OOo0OO.o0OO0) r5
                o0OO0o.oo0ooO.o00oo0(r10)
                r10 = r5
                goto L61
            L34:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3c:
                o0OO0o.oo0ooO.o00oo0(r10)
                int[] r10 = r8.f14396o00oo0O0
                r2 = 0
                int r4 = r10.length
                r7 = r10
                r10 = r9
                r9 = r4
                r4 = r7
            L47:
                if (r2 >= r9) goto L63
                r5 = r4[r2]
                java.lang.Integer r6 = new java.lang.Integer
                r6.<init>(r5)
                r0.L$0 = r10
                r0.L$1 = r4
                r0.I$0 = r2
                r0.I$1 = r9
                r0.label = r3
                java.lang.Object r5 = r10.emit(r6, r0)
                if (r5 != r1) goto L61
                return r1
            L61:
                int r2 = r2 + r3
                goto L47
            L63:
                o0OO0o.oO0Ooooo r9 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOo0OO.o0OOooO0.o00oo0OO.o00oOOo0(o0OOo0OO.o0OO0, o0OO.o00oOo0O):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"o0OOo0Oo/oO0O000o$o00oOOoO", "Lo0OOo0OO/o0OO00o;", "Lo0OOo0OO/o0OO0;", "collector", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "(Lo0OOo0OO/o0OO0;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o0O0o<T> implements o0OO00o<T> {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Object[] f14397o00oo0O0;

        @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
        @o0OOO0.o00oo00O(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1", f = "Builders.kt", i = {0, 0}, l = {114}, m = "collect", n = {"this", "$this$flowOf_u24lambda_u2d8"}, s = {"L$0", "L$1"})
        /* loaded from: classes3.dex */
        public static final class o00oOOo0 extends o0OOO0.o00oOo0O {
            public int I$0;
            public int I$1;
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
                return o0O0o.this.o00oOOo0(null, this);
            }
        }

        public o0O0o(Object[] objArr) {
            this.f14397o00oo0O0 = objArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005c -> B:19:0x005f). Please submit an issue!!! */
        @Override // o0OOo0OO.o0OO00o
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object o00oOOo0(@org.jetbrains.annotations.NotNull o0OOo0OO.o0OO0<? super T> r8, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof o0OOo0OO.o0OOooO0.o0O0o.o00oOOo0
                if (r0 == 0) goto L13
                r0 = r9
                o0OOo0OO.o0OOooO0$o0O0o$o00oOOo0 r0 = (o0OOo0OO.o0OOooO0.o0O0o.o00oOOo0) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                o0OOo0OO.o0OOooO0$o0O0o$o00oOOo0 r0 = new o0OOo0OO.o0OOooO0$o0O0o$o00oOOo0
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.result
                o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3c
                if (r2 != r3) goto L34
                int r8 = r0.I$1
                int r2 = r0.I$0
                java.lang.Object r4 = r0.L$1
                o0OOo0OO.o0OO0 r4 = (o0OOo0OO.o0OO0) r4
                java.lang.Object r5 = r0.L$0
                o0OOo0OO.o0OOooO0$o0O0o r5 = (o0OOo0OO.o0OOooO0.o0O0o) r5
                o0OO0o.oo0ooO.o00oo0(r9)
                r9 = r4
                goto L5f
            L34:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3c:
                o0OO0o.oo0ooO.o00oo0(r9)
                r9 = 0
                java.lang.Object[] r2 = r7.f14397o00oo0O0
                int r2 = r2.length
                r5 = r7
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
            L48:
                if (r2 >= r8) goto L61
                java.lang.Object[] r4 = r5.f14397o00oo0O0
                r4 = r4[r2]
                r0.L$0 = r5
                r0.L$1 = r9
                r0.I$0 = r2
                r0.I$1 = r8
                r0.label = r3
                java.lang.Object r4 = r9.emit(r4, r0)
                if (r4 != r1) goto L5f
                return r1
            L5f:
                int r2 = r2 + r3
                goto L48
            L61:
                o0OO0o.oO0Ooooo r8 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOo0OO.o0OOooO0.o0O0o.o00oOOo0(o0OOo0OO.o0OO0, o0OO.o00oOo0O):java.lang.Object");
        }
    }

    @NotNull
    public static final <T> o0OO00o<T> o00oOOo0(@NotNull Iterable<? extends T> iterable) {
        return new o00oOo0O(iterable);
    }

    @NotNull
    public static final <T> o0OO00o<T> o00oOOoO(@NotNull Iterator<? extends T> it) {
        return new o00oOoO(it);
    }

    @o0OOo00O.oO0000o0
    @NotNull
    public static final <T> o0OO00o<T> o00oOo00(@NotNull o0OOOO.o00oOOo0<? extends T> o00oooo02) {
        return new o00oOOoO(o00oooo02);
    }

    @NotNull
    public static final o0OO00o<Integer> o00oOo0O(@NotNull o0O0O0Oo o0o0o0oo) {
        return new o00oo0O(o0o0o0oo);
    }

    @NotNull
    public static final o0OO00o<Long> o00oOo0o(@NotNull o0O0OO0 o0o0oo0) {
        return new o00oOOo0(o0o0oo0);
    }

    @NotNull
    public static final o0OO00o<Integer> o00oOoO(@NotNull int[] iArr) {
        return new o00oo0OO(iArr);
    }

    @NotNull
    public static final <T> o0OO00o<T> o00oOoO0(@NotNull o0OOOoO0.oO000<? extends T> oo000) {
        return new o00oo00O(oo000);
    }

    @NotNull
    public static final o0OO00o<Long> o00oOoOO(@NotNull long[] jArr) {
        return new o00oo0O0(jArr);
    }

    @NotNull
    public static final <T> o0OO00o<T> o00oOoOo(@NotNull T[] tArr) {
        return new o00oo0(tArr);
    }

    @NotNull
    public static final <T> o0OO00o<T> o00oOoo0(@o0OO0o.o00oOOoO @NotNull o0O00000<? super o0ooO<? super T>, ? super o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o00000) {
        return new o0OO000(o0o00000, null, 0, null, 14, null);
    }

    @o0OOo00O.oO0000o0
    @NotNull
    public static final <T> o0OO00o<T> o00oOooO(@NotNull o0OOOO.o00oo<? super o0OO.o00oOo0O<? super T>, ? extends Object> o00ooVar) {
        return new o00oOo00(o00ooVar);
    }

    @NotNull
    public static final <T> o0OO00o<T> o00oOooo(@o0OO0o.o00oOOoO @NotNull o0O00000<? super o0ooO<? super T>, ? super o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o00000) {
        return new o0OO00OO(o0o00000, null, 0, null, 14, null);
    }

    @NotNull
    public static final <T> o0OO00o<T> o00oo0(@o0OO0o.o00oOOoO @NotNull o0O00000<? super o0OO0<? super T>, ? super o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o00000) {
        return new oO0000o0(o0o00000);
    }

    @NotNull
    public static final <T> o0OO00o<T> o00oo00O() {
        return o0OoOoO.f14398o00oo0O0;
    }

    @NotNull
    public static final <T> o0OO00o<T> o00oo0O0(@NotNull T... tArr) {
        return new o0O0o(tArr);
    }

    @NotNull
    public static final <T> o0OO00o<T> o00oo0OO(T t) {
        return new o00oo(t);
    }
}
