package o0O0000O;
/* loaded from: classes.dex */
public class o00oOOo0 {
    public static int o00oOOo0(int i, int i2) {
        int i3 = i + i2;
        if (((i ^ i3) & (i2 ^ i3)) >= 0) {
            return i3;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long o00oOOoO(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j3) & (j2 ^ j3)) >= 0) {
            return j3;
        }
        throw new ArithmeticException("long overflow");
    }

    public static double o00oOo00(double d, double d2, double d3) {
        return d < d2 ? d2 : d > d3 ? d3 : d;
    }

    public static int o00oOo0O(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static long o00oOo0o(long j, long j2, long j3) {
        return j < j2 ? j2 : j > j3 ? j3 : j;
    }

    public static long o00oOoO(long j) {
        if (j != Long.MIN_VALUE) {
            return j - 1;
        }
        throw new ArithmeticException("long overflow");
    }

    public static int o00oOoO0(int i) {
        if (i != Integer.MIN_VALUE) {
            return i - 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int o00oOoOO(int i) {
        if (i != Integer.MAX_VALUE) {
            return i + 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long o00oOoOo(long j) {
        if (j != Long.MAX_VALUE) {
            return j + 1;
        }
        throw new ArithmeticException("long overflow");
    }

    public static int o00oOoo0(int i, int i2) {
        long j = i * i2;
        int i3 = (int) j;
        if (i3 == j) {
            return i3;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static float o00oOooO(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    public static long o00oOooo(long j, long j2) {
        long j3 = j * j2;
        if (((Math.abs(j) | Math.abs(j2)) >>> 31) == 0 || ((j2 == 0 || j3 / j2 == j) && !(j == Long.MIN_VALUE && j2 == -1))) {
            return j3;
        }
        throw new ArithmeticException("long overflow");
    }

    public static long o00oo0(long j) {
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        throw new ArithmeticException("long overflow");
    }

    public static int o00oo00O(int i) {
        if (i != Integer.MIN_VALUE) {
            return -i;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int o00oo0O(long j) {
        int i = (int) j;
        if (i == j) {
            return i;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long o00oo0O0(long j, long j2) {
        long j3 = j - j2;
        if (((j ^ j3) & (j2 ^ j)) >= 0) {
            return j3;
        }
        throw new ArithmeticException("long overflow");
    }

    public static int o00oo0OO(int i, int i2) {
        int i3 = i - i2;
        if (((i ^ i3) & (i2 ^ i)) >= 0) {
            return i3;
        }
        throw new ArithmeticException("integer overflow");
    }
}
