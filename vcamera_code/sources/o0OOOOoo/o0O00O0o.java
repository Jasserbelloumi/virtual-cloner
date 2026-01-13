package o0OOOOoo;

import o0OO0o.o0O000;
import o0OO0o.o0OO00o0;
import o0OO0o.oO0Oo0oo;
import o0OOO0OO.o00oo00O;
/* loaded from: classes3.dex */
public class o0O00O0o extends o0OoO00O {
    public static final int o0(int i) {
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final double o00oOo00(double d, double d2) {
        return Math.IEEEremainder(d, d2);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final double o00oOo0O(double d) {
        return Math.abs(d);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o00oOo0o(float f) {
        return Math.abs(f);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final long o00oOoO(long j) {
        return Math.abs(j);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final int o00oOoO0(int i) {
        return Math.abs(i);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final double o00oOoOO(double d) {
        return Math.acos(d);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o00oOoOo(float f) {
        return (float) Math.acos(f);
    }

    @o0OO00o0(version = "1.2")
    public static final double o00oOoo0(double d) {
        if (d < 1.0d) {
            return Double.NaN;
        }
        if (d > o0O00.f13674o00oOo0o) {
            return Math.log(d) + o0O00.f13671o00oOOoO;
        }
        double d2 = 1;
        double d3 = d - d2;
        if (d3 >= o0O00.f13673o00oOo0O) {
            return Math.log(Math.sqrt((d * d) - d2) + d);
        }
        double sqrt = Math.sqrt(d3);
        if (sqrt >= o0O00.f13676o00oOooO) {
            sqrt -= ((sqrt * sqrt) * sqrt) / 12;
        }
        return sqrt * Math.sqrt(2.0d);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o00oOooO(float f, float f2) {
        return (float) Math.IEEEremainder(f, f2);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o00oOooo(float f) {
        return (float) o00oOoo0(f);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o00oo00O
    @o0OO00o0(version = "1.8")
    public static final double o00oo(double d) {
        return Math.cbrt(d);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o00oo0(float f) {
        return (float) Math.asin(f);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final double o00oo00O(double d) {
        return Math.asin(d);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final double o00oo0O(double d) {
        return Math.atan(d);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o00oo0O0(float f) {
        return (float) o00oo0OO(f);
    }

    @o0OO00o0(version = "1.2")
    public static final double o00oo0OO(double d) {
        double sqrt;
        double d2 = o0O00.f13673o00oOo0O;
        if (d < d2) {
            return d <= (-d2) ? -o00oo0OO(-d) : Math.abs(d) >= o0O00.f13676o00oOooO ? d - (((d * d) * d) / 6) : d;
        }
        if (d <= o0O00.f13675o00oOoO0) {
            sqrt = Math.sqrt((d * d) + 1);
        } else if (d > o0O00.f13674o00oOo0o) {
            return Math.log(d) + o0O00.f13671o00oOOoO;
        } else {
            d *= 2;
            sqrt = 1 / d;
        }
        return Math.log(sqrt + d);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o00oo0Oo(float f) {
        return (float) Math.atan(f);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o00oo0o(float f, float f2) {
        return (float) Math.atan2(f, f2);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final double o00oo0o0(double d, double d2) {
        return Math.atan2(d, d2);
    }

    @o0OO00o0(version = "1.2")
    public static final double o00oo0oO(double d) {
        if (Math.abs(d) < o0O00.f13673o00oOo0O) {
            return Math.abs(d) > o0O00.f13676o00oOooO ? d + (((d * d) * d) / 3) : d;
        }
        double d2 = 1;
        return Math.log((d2 + d) / (d2 - d)) / 2;
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o00ooO(float f) {
        return (float) Math.cos(f);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final double o00ooO0(double d) {
        return Math.ceil(d);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o00oo00O
    @o0OO00o0(version = "1.8")
    public static final float o00ooO00(float f) {
        return (float) Math.cbrt(f);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o00ooO0O(float f) {
        return (float) Math.ceil(f);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final double o00ooO0o(double d) {
        return Math.cos(d);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o00ooOO(float f) {
        return (float) Math.cosh(f);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final double o00ooOO0(double d) {
        return Math.cosh(d);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final double o00ooOOo(double d) {
        return Math.exp(d);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final double o00ooOo(double d) {
        return Math.expm1(d);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o00ooOo0(float f) {
        return (float) Math.exp(f);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o00ooOoO(float f) {
        return (float) Math.expm1(f);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final double o00ooOoo(double d) {
        return Math.floor(d);
    }

    public static final double o00ooo0(double d) {
        return Math.abs(d);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o00ooo00(float f) {
        return (float) Math.floor(f);
    }

    public static final float o00ooo0O(float f) {
        return Math.abs(f);
    }

    public static final int o00ooo0o(int i) {
        return Math.abs(i);
    }

    public static final long o00oooO(long j) {
        return Math.abs(j);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static /* synthetic */ void o00oooOO(double d) {
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static /* synthetic */ void o00oooOo(float f) {
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static /* synthetic */ void o00oooo(long j) {
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static /* synthetic */ void o00oooo0(int i) {
    }

    public static final double o00ooooO(double d) {
        return Math.signum(d);
    }

    public static final float o00ooooo(float f) {
        return Math.signum(f);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o0O00(float f) {
        return (float) Math.log(f);
    }

    @o0OO00o0(version = "1.2")
    public static /* synthetic */ void o0O000(int i) {
    }

    public static final int o0O00000(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static /* synthetic */ void o0O0000O(double d) {
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static /* synthetic */ void o0O0000o(float f) {
    }

    @o0OO00o0(version = "1.2")
    public static /* synthetic */ void o0O000O(long j) {
    }

    public static final float o0O000Oo(float f) {
        return Math.ulp(f);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final double o0O000o(double d, double d2) {
        return Math.hypot(d, d2);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static /* synthetic */ void o0O000o0(float f) {
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final double o0O000oo(double d) {
        return Math.log(d);
    }

    @o0OO00o0(version = "1.2")
    public static final float o0O00O(float f, float f2) {
        if (f2 > 0.0f) {
            if (f2 == 1.0f) {
                return Float.NaN;
            }
            return (float) (Math.log(f) / Math.log(f2));
        }
        return Float.NaN;
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final double o0O00O0(double d) {
        return Math.log1p(d);
    }

    @o0OO00o0(version = "1.2")
    public static final double o0O00O0o(double d, double d2) {
        if (d2 > 0.0d) {
            if (d2 == 1.0d) {
                return Double.NaN;
            }
            return Math.log(d) / Math.log(d2);
        }
        return Double.NaN;
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final double o0O00OO(double d) {
        return Math.log10(d);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o0O00OOO(float f) {
        return (float) Math.log10(f);
    }

    @o0OO00o0(version = "1.2")
    public static final double o0O00Oo(double d) {
        return Math.log(d) / o0O00.f13671o00oOOoO;
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final double o0O00OoO(double d, double d2) {
        return Math.max(d, d2);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o0O00Ooo(float f, float f2) {
        return Math.max(f, f2);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o0O00o(float f, float f2) {
        return Math.min(f, f2);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final int o0O00o00(int i, int i2) {
        return Math.max(i, i2);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final long o0O00o0O(long j, long j2) {
        return Math.max(j, j2);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final double o0O00o0o(double d, double d2) {
        return Math.min(d, d2);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final int o0O00oO0(int i, int i2) {
        return Math.min(i, i2);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final long o0O0O0O(long j, long j2) {
        return Math.min(j, j2);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final double o0O0O0Oo(double d, double d2) {
        return Math.nextAfter(d, d2);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final double o0O0O0o(double d) {
        return Math.nextUp(d);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o0O0O0o0(float f, float f2) {
        return Math.nextAfter(f, f2);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o0O0O0oO(float f) {
        return Math.nextUp(f);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final double o0O0O0oo(double d, double d2) {
        return Math.pow(d, d2);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final double o0O0OO(double d) {
        return Math.rint(d);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o0O0OO0(float f, float f2) {
        return (float) Math.pow(f, f2);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o0O0OO0O(float f, int i) {
        return (float) Math.pow(f, i);
    }

    @o0OO00o0(version = "1.2")
    public static final int o0O0OOO(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o0O0OOO0(float f) {
        return (float) Math.rint(f);
    }

    @o0OO00o0(version = "1.2")
    public static final int o0O0OOOo(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    @o0OO00o0(version = "1.2")
    public static final long o0O0OOo(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d);
    }

    @o0OO00o0(version = "1.2")
    public static final long o0O0OOoO(float f) {
        return o0O0OOo(f);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final double o0O0OOoo(double d) {
        return Math.signum(d);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o0O0Oo(float f) {
        return (float) Math.sinh(f);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final double o0O0Oo0(double d) {
        return Math.sin(d);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o0O0Oo0O(float f) {
        return (float) Math.sin(f);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final double o0O0Oo0o(double d) {
        return Math.sinh(d);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o0O0OoO(float f) {
        return (float) Math.tan(f);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o0O0OoO0(float f) {
        return (float) Math.sqrt(f);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final double o0O0OoOo(double d) {
        return Math.tanh(d);
    }

    @o0OO00o0(version = "1.2")
    public static final double o0O0Ooo(double d) {
        return (Double.isNaN(d) || Double.isInfinite(d)) ? d : d > 0.0d ? Math.floor(d) : Math.ceil(d);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o0O0Ooo0(float f) {
        return (float) Math.tanh(f);
    }

    @o0OO00o0(version = "1.2")
    public static final float o0O0OooO(float f) {
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            return f;
        }
        return (float) (f > 0.0f ? Math.floor(f) : Math.ceil(f));
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final double o0O0Oooo(double d) {
        return Math.sqrt(d);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o0O0o(float f) {
        return (float) o00oo0oO(f);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final double o0O0o00(double d, int i) {
        return Math.copySign(d, i);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final double o0O0o000(double d, double d2) {
        return Math.copySign(d, d2);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o0O0o00O(float f, float f2) {
        return Math.copySign(f, f2);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o0O0o00o(float f, int i) {
        return Math.copySign(f, i);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o0O0oo0o(float f) {
        return Math.nextAfter(f, Double.NEGATIVE_INFINITY);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o0OoO00O(float f) {
        return (float) Math.log1p(f);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static /* synthetic */ void o0OoOoOO(double d) {
    }

    public static final double o0OoOoOo(double d) {
        return Math.ulp(d);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o0OooO0(float f) {
        return Math.signum(f);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final double o0oO0O0o(double d) {
        return Math.nextAfter(d, Double.NEGATIVE_INFINITY);
    }

    @o0OO00o0(version = "1.2")
    public static final float o0oO0Ooo(float f) {
        return (float) (Math.log(f) / o0O00.f13671o00oOOoO);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final double o0ooO(double d, int i) {
        return Math.pow(d, i);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o0ooOoOO(float f, float f2) {
        return (float) Math.hypot(f, f2);
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final double oo0OOoo(double d) {
        return Math.tan(d);
    }
}
