package o0OOOooO;

import o0OOOOO0.o0OOO00;
import o0OOOooO.o0oO0O0o;
@o0OOO00({"SMAP\nlongSaturatedMath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,75:1\n74#1:76\n74#1:77\n74#1:78\n74#1:79\n74#1:80\n74#1:81\n*S KotlinDebug\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n15#1:76\n18#1:77\n36#1:78\n45#1:79\n52#1:80\n56#1:81\n*E\n"})
/* loaded from: classes3.dex */
public final class o0O0OOO {
    public static final long o00oOOo0(long j, long j2, long j3) {
        if (!o0oO0O0o.o0O000o0(j2) || (j ^ j3) >= 0) {
            return j;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    public static final boolean o00oOOoO(long j) {
        return ((j - 1) | 1) == Long.MAX_VALUE;
    }

    public static final long o00oOo00(long j, long j2) {
        long o00oooOO2 = o0oO0O0o.o00oooOO(j2);
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            return o00oOOo0(j, j2, o00oooOO2);
        }
        if ((1 | (o00oooOO2 - 1)) == Long.MAX_VALUE) {
            return o00oOooO(j, j2);
        }
        long j3 = j + o00oooOO2;
        return ((j ^ j3) & (o00oooOO2 ^ j3)) < 0 ? j < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j3;
    }

    public static final long o00oOo0O(long j, long j2) {
        return ((1 | (j2 - 1)) > Long.MAX_VALUE ? 1 : ((1 | (j2 - 1)) == Long.MAX_VALUE ? 0 : -1)) == 0 ? o0oO0O0o.o0O0O0O(o0O0O0Oo.o0O00OOO(j2, o0O0O0o0.DAYS)) : o00oOo0o(j, j2);
    }

    public static final long o00oOo0o(long j, long j2) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            o0oO0O0o.o00oOOo0 o00oooo02 = o0oO0O0o.f13965o00oo0O;
            return o0O0O0Oo.o0O00OOO(j3, o0O0O0o0.NANOSECONDS);
        }
        long j4 = 1000000;
        long j5 = (j % j4) - (j2 % j4);
        o0oO0O0o.o00oOOo0 o00oooo03 = o0oO0O0o.f13965o00oo0O;
        return o0oO0O0o.o0O00(o0O0O0Oo.o0O00OOO((j / j4) - (j2 / j4), o0O0O0o0.MILLISECONDS), o0O0O0Oo.o0O00OOO(j5, o0O0O0o0.NANOSECONDS));
    }

    public static final long o00oOoO0(long j, long j2) {
        if (!(((j2 - 1) | 1) == Long.MAX_VALUE)) {
            return (1 | (j - 1)) == Long.MAX_VALUE ? o0O0O0Oo.o0O00OOO(j, o0O0O0o0.DAYS) : o00oOo0o(j, j2);
        } else if (j == j2) {
            o0oO0O0o.f13965o00oo0O.getClass();
            return o0oO0O0o.f13966o00oo0Oo;
        } else {
            return o0oO0O0o.o0O0O0O(o0O0O0Oo.o0O00OOO(j2, o0O0O0o0.DAYS));
        }
    }

    public static final long o00oOooO(long j, long j2) {
        long o00oo0O02 = o0oO0O0o.o00oo0O0(j2, 2);
        if (((o0oO0O0o.o00oooOO(o00oo0O02) - 1) | 1) == Long.MAX_VALUE) {
            return (long) (o0oO0O0o.o0O00Oo(j2, o0O0O0o0.NANOSECONDS) + j);
        }
        return o00oOo00(o00oOo00(j, o00oo0O02), o0oO0O0o.o0O000oo(j2, o00oo0O02));
    }
}
