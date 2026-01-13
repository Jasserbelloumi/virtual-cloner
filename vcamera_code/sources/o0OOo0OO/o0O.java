package o0OOo0OO;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import o0OO0o.o0O0oo0o;
import o0OOO0.o00oOo0O;
import o0OOO0.o00oo00O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lo0OOo0OO/o0O;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo0OO/o0OO00o;", "Lo0OOo0OO/o0OO000o;", "Lo0OOo0OO/o0OO0;", "collector", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "(Lo0OOo0OO/o0OO0;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "o00oOoO0", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@o0OOo00O.oO0000o0
/* loaded from: classes3.dex */
public abstract class o0O<T> implements o0OO00o<T>, o0OO000o<T> {

    @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    @o00oo00O(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", i = {0}, l = {230}, m = "collect", n = {"safeCollector"}, s = {"L$0"})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o00oOo0O {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ o0O<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOo0(o0O<T> o0o, o0OO.o00oOo0O<? super o00oOOo0> o00ooo0o2) {
            super(o00ooo0o2);
            this.this$0 = o0o;
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.o00oOOo0(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    @Override // o0OOo0OO.o0OO00o
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o00oOOo0(@org.jetbrains.annotations.NotNull o0OOo0OO.o0OO0<? super T> r6, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof o0OOo0OO.o0O.o00oOOo0
            if (r0 == 0) goto L13
            r0 = r7
            o0OOo0OO.o0O$o00oOOo0 r0 = (o0OOo0OO.o0O.o00oOOo0) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            o0OOo0OO.o0O$o00oOOo0 r0 = new o0OOo0OO.o0O$o00oOOo0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.L$0
            o0OOo0Oo.oO0 r6 = (o0OOo0Oo.oO0) r6
            o0OO0o.oo0ooO.o00oo0(r7)     // Catch: java.lang.Throwable -> L2b
            goto L4d
        L2b:
            r7 = move-exception
            goto L57
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            o0OO0o.oo0ooO.o00oo0(r7)
            o0OOo0Oo.oO0 r7 = new o0OOo0Oo.oO0
            o0OO.o00oo0 r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L53
            r0.label = r3     // Catch: java.lang.Throwable -> L53
            java.lang.Object r6 = r5.o00oOoO0(r7, r0)     // Catch: java.lang.Throwable -> L53
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r6 = r7
        L4d:
            r6.releaseIntercepted()
            o0OO0o.oO0Ooooo r6 = o0OO0o.oO0Ooooo.f13240o00oOOo0
            return r6
        L53:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L57:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0OO.o0O.o00oOOo0(o0OOo0OO.o0OO0, o0OO.o00oOo0O):java.lang.Object");
    }

    @Nullable
    public abstract Object o00oOoO0(@NotNull o0OO0<? super T> o0oo0, @NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2);
}
