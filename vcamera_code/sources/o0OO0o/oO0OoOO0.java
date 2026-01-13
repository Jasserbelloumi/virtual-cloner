package o0OO0o;

import com.google.common.primitives.UnsignedInts;
import o0OOOoo0.oO00OO0O;
import org.jetbrains.annotations.NotNull;
@o0OOOO0o.o00oo0OO(name = "UnsignedKt")
/* loaded from: classes.dex */
public final class oO0OoOO0 {
    @o0O
    public static final int o00oOOo0(double d) {
        if (!Double.isNaN(d) && d > o00oOo0o(0)) {
            if (d >= o00oOo0o(-1)) {
                return -1;
            }
            return d <= 2.147483647E9d ? o0OOOO.o00oOooo((int) d) : o0OOOO.o00oOooo((int) (d - Integer.MAX_VALUE)) + Integer.MAX_VALUE;
        }
        return 0;
    }

    @o0O
    public static final long o00oOOoO(double d) {
        if (!Double.isNaN(d) && d > o00oOoOo(0L)) {
            if (d >= o00oOoOo(-1L)) {
                return -1L;
            }
            return d < 9.223372036854776E18d ? o0oo0000.o00oOooo((long) d) : o0oo0000.o00oOooo((long) (d - 9.223372036854776E18d)) - Long.MIN_VALUE;
        }
        return 0L;
    }

    @o0O
    public static final int o00oOo00(int i, int i2) {
        return o0OOOOO0.o0ooO.o00oo0o(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
    }

    @o0O
    public static final int o00oOo0O(int i, int i2) {
        return o0OOOO.o00oOooo((int) ((i & UnsignedInts.INT_MASK) % (i2 & UnsignedInts.INT_MASK)));
    }

    @o0O
    public static final double o00oOo0o(int i) {
        return (((i >>> 31) << 30) * 2) + (Integer.MAX_VALUE & i);
    }

    @o0O
    public static final long o00oOoO(long j, long j2) {
        if (j2 < 0) {
            return Long.compareUnsigned(j, j2) < 0 ? o0oo0000.o00oOooo(0L) : o0oo0000.o00oOooo(1L);
        } else if (j >= 0) {
            return o0oo0000.o00oOooo(j / j2);
        } else {
            long j3 = ((j >>> 1) / j2) << 1;
            return j3 + (Long.compareUnsigned(o0oo0000.o00oOooo(j - (j3 * j2)), j2) < 0 ? 0 : 1);
        }
    }

    @o0O
    public static final int o00oOoO0(long j, long j2) {
        return o0OOOOO0.o0ooO.o00oo0oO(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    @o0O
    public static final long o00oOoOO(long j, long j2) {
        if (j2 < 0) {
            return Long.compareUnsigned(j, j2) < 0 ? j : o0oo0000.o00oOooo(j - j2);
        } else if (j >= 0) {
            return o0oo0000.o00oOooo(j % j2);
        } else {
            long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
            if (Long.compareUnsigned(o0oo0000.o00oOooo(j3), j2) < 0) {
                j2 = 0;
            }
            return j3 - j2;
        }
    }

    @o0O
    public static final double o00oOoOo(long j) {
        return ((j >>> 11) * 2048) + (j & 2047);
    }

    @NotNull
    public static final String o00oOoo0(long j) {
        return o00oOooo(j, 10);
    }

    @o0O
    public static final int o00oOooO(int i, int i2) {
        return o0OOOO.o00oOooo((int) ((i & UnsignedInts.INT_MASK) / (i2 & UnsignedInts.INT_MASK)));
    }

    @NotNull
    public static final String o00oOooo(long j, int i) {
        if (j >= 0) {
            String l = Long.toString(j, oO00OO0O.o00oOOo0(i));
            o0OOOOO0.o0ooO.o00oo0OO(l, "toString(this, checkRadix(radix))");
            return l;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb = new StringBuilder();
        String l2 = Long.toString(j3, oO00OO0O.o00oOOo0(i));
        o0OOOOO0.o0ooO.o00oo0OO(l2, "toString(this, checkRadix(radix))");
        sb.append(l2);
        String l3 = Long.toString(j4, oO00OO0O.o00oOOo0(i));
        o0OOOOO0.o0ooO.o00oo0OO(l3, "toString(this, checkRadix(radix))");
        sb.append(l3);
        return sb.toString();
    }
}
