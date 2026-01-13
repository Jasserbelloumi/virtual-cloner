package o0OOo0OO;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OO0o.o0O0oo0o;
import o0OOO0.o00oo00O;
import o0OOOO.o0O00000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BG\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\u0012\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR>\u0010\u0012\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000f8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lo0OOo0OO/oO00O0o0;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo0OO/o0OO0;", "value", "Lo0OO0o/oO0Ooooo;", "emit", "(Ljava/lang/Object;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "o00oOOo0", "(Lo0OO/o00oOo0O;)Ljava/lang/Object;", "o00oo0O0", "Lo0OOo0OO/o0OO0;", "collector", "Lkotlin/Function2;", "Lo0OO/o00oOo0O;", "", "Lo0OO0o/o0O000Oo;", "o00oo0O", "Lo0OOOO/o0O00000;", "action", "<init>", "(Lo0OOo0OO/o0OO0;Lo0OOOO/o0O00000;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO00O0o0<T> implements o0OO0<T> {
    @NotNull

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o0O00000<o0OO0<? super T>, o00oOo0O<? super o0OO0o.oO0Ooooo>, Object> f14479o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0OO0<T> f14480o00oo0O0;

    @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    @o00oo00O(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", i = {0, 0}, l = {419, 423}, m = "onSubscription", n = {"this", "safeCollector"}, s = {"L$0", "L$1"})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o0OOO0.o00oOo0O {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ oO00O0o0<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(oO00O0o0<T> oo00o0o0, o00oOo0O<? super o00oOOo0> o00ooo0o2) {
            super(o00ooo0o2);
            this.this$0 = oo00o0o0;
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.o00oOOo0(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oO00O0o0(@NotNull o0OO0<? super T> o0oo0, @NotNull o0O00000<? super o0OO0<? super T>, ? super o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o00000) {
        this.f14480o00oo0O0 = o0oo0;
        this.f14479o00oo0O = o0o00000;
    }

    @Override // o0OOo0OO.o0OO0
    @Nullable
    public Object emit(T t, @NotNull o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
        return this.f14480o00oo0O0.emit(t, o00ooo0o2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [o0OOo0Oo.oO0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o00oOOo0(@org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof o0OOo0OO.oO00O0o0.o00oOOo0
            if (r0 == 0) goto L13
            r0 = r7
            o0OOo0OO.oO00O0o0$o00oOOo0 r0 = (o0OOo0OO.oO00O0o0.o00oOOo0) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            o0OOo0OO.oO00O0o0$o00oOOo0 r0 = new o0OOo0OO.oO00O0o0$o00oOOo0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            o0OO0o.oo0ooO.o00oo0(r7)
            goto L75
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            java.lang.Object r2 = r0.L$1
            o0OOo0Oo.oO0 r2 = (o0OOo0Oo.oO0) r2
            java.lang.Object r4 = r0.L$0
            o0OOo0OO.oO00O0o0 r4 = (o0OOo0OO.oO00O0o0) r4
            o0OO0o.oo0ooO.o00oo0(r7)     // Catch: java.lang.Throwable -> L7b
            goto L5c
        L3e:
            o0OO0o.oo0ooO.o00oo0(r7)
            o0OOo0Oo.oO0 r2 = new o0OOo0Oo.oO0
            o0OOo0OO.o0OO0<T> r7 = r6.f14480o00oo0O0
            o0OO.o00oo0 r5 = r0.getContext()
            r2.<init>(r7, r5)
            o0OOOO.o0O00000<o0OOo0OO.o0OO0<? super T>, o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo>, java.lang.Object> r7 = r6.f14479o00oo0O     // Catch: java.lang.Throwable -> L7b
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L7b
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L7b
            r0.label = r4     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L7b
            if (r7 != r1) goto L5b
            return r1
        L5b:
            r4 = r6
        L5c:
            r2.releaseIntercepted()
            o0OOo0OO.o0OO0<T> r7 = r4.f14480o00oo0O0
            boolean r2 = r7 instanceof o0OOo0OO.oO00O0o0
            if (r2 == 0) goto L78
            o0OOo0OO.oO00O0o0 r7 = (o0OOo0OO.oO00O0o0) r7
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r7 = r7.o00oOOo0(r0)
            if (r7 != r1) goto L75
            return r1
        L75:
            o0OO0o.oO0Ooooo r7 = o0OO0o.oO0Ooooo.f13240o00oOOo0
            return r7
        L78:
            o0OO0o.oO0Ooooo r7 = o0OO0o.oO0Ooooo.f13240o00oOOo0
            return r7
        L7b:
            r7 = move-exception
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0OO.oO00O0o0.o00oOOo0(o0OO.o00oOo0O):java.lang.Object");
    }
}
