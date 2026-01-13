package o0OOo00O;

import kotlin.Metadata;
import o0OO.o00oo0;
import o0OO000o.o00oOOoO;
import o0OOO0.o00oOo0O;
import o0OOO00o.o00oOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0001\u001a\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u0007\u001a\u0019\u0010\u000b\u001a\u00020\u0003*\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\"\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"", "o00oOOo0", "(Lo0OO/o00oOo0O;)Ljava/lang/Object;", "", "timeMillis", "Lo0OO0o/oO0Ooooo;", o00oOOoO.f12961o00oOo00, "(JLo0OO/o00oOo0O;)Ljava/lang/Object;", "Lo0OOOooO/o0oO0O0o;", "duration", "o00oOo00", "o00oOo0O", "(J)J", "Lo0OO/o00oo0;", "Lo0OOo00O/o0OO0;", "o00oOooO", "(Lo0OO/o00oo0;)Lo0OOo00O/o0OO0;", "delay", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class o0OO0O0 {

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", i = {}, l = {148}, m = "awaitCancellation", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o00oOo0O {
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
            return o0OO0O0.o00oOOo0(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o00oOOo0(@org.jetbrains.annotations.NotNull o0OO.o00oOo0O<?> r4) {
        /*
            boolean r0 = r4 instanceof o0OOo00O.o0OO0O0.o00oOOo0
            if (r0 == 0) goto L13
            r0 = r4
            o0OOo00O.o0OO0O0$o00oOOo0 r0 = (o0OOo00O.o0OO0O0.o00oOOo0) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            o0OOo00O.o0OO0O0$o00oOOo0 r0 = new o0OOo00O.o0OO0O0$o00oOOo0
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.result
            o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2b:
            o0OO0o.oo0ooO.o00oo0(r4)
            goto L4c
        L2f:
            o0OO0o.oo0ooO.o00oo0(r4)
            r0.label = r3
            o0OOo00O.o0O00 r4 = new o0OOo00O.o0O00
            o0OO.o00oOo0O r2 = o0OOO00o.o00oOo00.o00oOooO(r0)
            r4.<init>(r2, r3)
            r4.o00ooo00()
            java.lang.Object r4 = r4.o00ooO00()
            if (r4 != r1) goto L49
            o0OOO0.o00oo0OO.o00oOo00(r0)
        L49:
            if (r4 != r1) goto L4c
            return r1
        L4c:
            o0OO0o.o0OoO00O r4 = new o0OO0o.o0OoO00O
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo00O.o0OO0O0.o00oOOo0(o0OO.o00oOo0O):java.lang.Object");
    }

    @Nullable
    public static final Object o00oOOoO(long j, @NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
        if (j <= 0) {
            return o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }
        o0O00 o0o00 = new o0O00(o00oOo00.o00oOooO(o00ooo0o2), 1);
        o0o00.o00ooo00();
        if (j < Long.MAX_VALUE) {
            o00oOooO(o0o00.getContext()).o00oOo0O(j, o0o00);
        }
        Object o00ooO002 = o0o00.o00ooO00();
        o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
        if (o00ooO002 == o00oooo02) {
            o0OOO0.o00oo0OO.o00oOo00(o00ooo0o2);
        }
        return o00ooO002 == o00oooo02 ? o00ooO002 : o0OO0o.oO0Ooooo.f13240o00oOOo0;
    }

    @Nullable
    public static final Object o00oOo00(long j, @NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
        Object o00oOOoO2 = o00oOOoO(o00oOo0O(j), o00ooo0o2);
        return o00oOOoO2 == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED ? o00oOOoO2 : o0OO0o.oO0Ooooo.f13240o00oOOo0;
    }

    public static final long o00oOo0O(long j) {
        o0OOOooO.o0oO0O0o.f13965o00oo0O.getClass();
        if (o0OOOooO.o0oO0O0o.o00oOooo(j, o0OOOooO.o0oO0O0o.f13966o00oo0Oo) > 0) {
            long o00ooo0o2 = o0OOOooO.o0oO0O0o.o00ooo0o(j);
            if (o00ooo0o2 < 1) {
                return 1L;
            }
            return o00ooo0o2;
        }
        return 0L;
    }

    @NotNull
    public static final o0OO0 o00oOooO(@NotNull o0OO.o00oo0 o00oo0Var) {
        o00oo0.o00oOOoO o00ooooo2 = o00oo0Var.get(o0OO.o00oOoO.f12926o00oOo0o);
        o0OO0 o0oo0 = o00ooooo2 instanceof o0OO0 ? (o0OO0) o00ooooo2 : null;
        return o0oo0 == null ? o0OO00o0.o00oOOo0() : o0oo0;
    }
}
