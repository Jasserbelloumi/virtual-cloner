package o0OOo0OO;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OO0o.o0O0oo0o;
import o0OOO0.o00oo00O;
import o0OOOO.o0O00000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BG\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\u0012\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b¢\u0006\u0002\b\u000fø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR>\u0010\u0012\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b¢\u0006\u0002\b\u000f8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lo0OOo0OO/oO00O0o;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo0OO/oO000;", "Lo0OOo0OO/o0OO0;", "collector", "", "o00oOOo0", "(Lo0OOo0OO/o0OO0;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "o00oo0O0", "Lo0OOo0OO/oO000;", "sharedFlow", "Lkotlin/Function2;", "Lo0OO/o00oOo0O;", "Lo0OO0o/oO0Ooooo;", "", "Lo0OO0o/o0O000Oo;", "o00oo0O", "Lo0OOOO/o0O00000;", "action", "", "o00oOo0O", "()Ljava/util/List;", "replayCache", "<init>", "(Lo0OOo0OO/oO000;Lo0OOOO/o0O00000;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO00O0o<T> implements oO000<T> {
    @NotNull

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o0O00000<o0OO0<? super T>, o00oOo0O<? super o0OO0o.oO0Ooooo>, Object> f14477o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final oO000<T> f14478o00oo0O0;

    @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    @o00oo00O(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", i = {}, l = {409}, m = "collect", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o0OOO0.o00oOo0O {
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ oO00O0o<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(oO00O0o<T> oo00o0o, o00oOo0O<? super o00oOOo0> o00ooo0o2) {
            super(o00ooo0o2);
            this.this$0 = oo00o0o;
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.o00oOOo0(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oO00O0o(@NotNull oO000<? extends T> oo000, @NotNull o0O00000<? super o0OO0<? super T>, ? super o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o00000) {
        this.f14478o00oo0O0 = oo000;
        this.f14477o00oo0O = o0o00000;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // o0OOo0OO.oO000, o0OOo0OO.o0OO00o
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o00oOOo0(@org.jetbrains.annotations.NotNull o0OOo0OO.o0OO0<? super T> r6, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof o0OOo0OO.oO00O0o.o00oOOo0
            if (r0 == 0) goto L13
            r0 = r7
            o0OOo0OO.oO00O0o$o00oOOo0 r0 = (o0OOo0OO.oO00O0o.o00oOOo0) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            o0OOo0OO.oO00O0o$o00oOOo0 r0 = new o0OOo0OO.oO00O0o$o00oOOo0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            o0OO0o.oo0ooO.o00oo0(r7)
            goto L44
        L2f:
            o0OO0o.oo0ooO.o00oo0(r7)
            o0OOo0OO.oO000<T> r7 = r5.f14478o00oo0O0
            o0OOo0OO.oO00O0o0 r2 = new o0OOo0OO.oO00O0o0
            o0OOOO.o0O00000<o0OOo0OO.o0OO0<? super T>, o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo>, java.lang.Object> r4 = r5.f14477o00oo0O
            r2.<init>(r6, r4)
            r0.label = r3
            java.lang.Object r6 = r7.o00oOOo0(r2, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            o0OO0o.o0OoO00O r6 = new o0OO0o.o0OoO00O
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0OO.oO00O0o.o00oOOo0(o0OOo0OO.o0OO0, o0OO.o00oOo0O):java.lang.Object");
    }

    @Override // o0OOo0OO.oO000
    @NotNull
    public List<T> o00oOo0O() {
        return this.f14478o00oo0O0.o00oOo0O();
    }
}
