package o0Oo00oO;

import com.google.common.base.Ascii;
import o0OOoO0.o00oo;
/* loaded from: classes3.dex */
public class o0O0000O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static double f15671o00oOOo0 = 3.141592653589793d;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static double f15672o00oOOoO = 52.35987755982988d;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static double f15673o00oOo00 = 6378245.0d;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static double f15674o00oOooO = 0.006693421622965943d;

    public static double[] o00oOOo0(double d, double d2) {
        double d3 = d2 - 0.0065d;
        double d4 = d - 0.006d;
        double sqrt = Math.sqrt((d4 * d4) + (d3 * d3)) - (Math.sin(f15672o00oOOoO * d4) * 2.0E-5d);
        double atan2 = Math.atan2(d4, d3) - (Math.cos(d3 * f15672o00oOOoO) * 3.0E-6d);
        return new double[]{Math.sin(atan2) * sqrt, Math.cos(atan2) * sqrt};
    }

    public static double[] o00oOOoO(double d, double d2) {
        double[] o00oOOo02 = o00oOOo0(d, d2);
        double[] o00oOooO2 = o00oOooO(o00oOOo02[0], o00oOOo02[1]);
        o00oOooO2[0] = o00oOoO(o00oOooO2[0]);
        o00oOooO2[1] = o00oOoO(o00oOooO2[1]);
        return o00oOooO2;
    }

    public static double[] o00oOo00(double d, double d2) {
        double sin = (Math.sin(f15672o00oOOoO * d) * 2.0E-5d) + Math.sqrt((d * d) + (d2 * d2));
        double cos = (Math.cos(d2 * f15672o00oOOoO) * 3.0E-6d) + Math.atan2(d, d2);
        return new double[]{(Math.sin(cos) * sin) + 0.006d, (Math.cos(cos) * sin) + 0.0065d};
    }

    public static double[] o00oOo0O(double d, double d2) {
        if (o00oOoO0(d, d2)) {
            return new double[]{d, d2};
        }
        double d3 = d2 - 105.0d;
        double d4 = d - 35.0d;
        double o00oOoOo2 = o00oOoOo(d3, d4);
        double o00oOoo02 = o00oOoo0(d3, d4);
        double d5 = (d / 180.0d) * f15671o00oOOo0;
        double sin = Math.sin(d5);
        double d6 = 1.0d - ((f15674o00oOooO * sin) * sin);
        double sqrt = Math.sqrt(d6);
        double d7 = f15673o00oOo00;
        return new double[]{d + ((o00oOoOo2 * 180.0d) / ((((1.0d - f15674o00oOooO) * d7) / (d6 * sqrt)) * f15671o00oOOo0)), d2 + ((o00oOoo02 * 180.0d) / ((Math.cos(d5) * (d7 / sqrt)) * f15671o00oOOo0))};
    }

    public static double[] o00oOo0o(double d, double d2) {
        double[] o00oOo0O2 = o00oOo0O(d, d2);
        return o00oOo00(o00oOo0O2[0], o00oOo0O2[1]);
    }

    public static double o00oOoO(double d) {
        return Double.valueOf(String.format(o00oo.o00oOOo0(new byte[]{-96, 37, Ascii.NAK, 17}, new byte[]{-123, Ascii.VT, 35, 119, -104, Ascii.EM, -45, -1}), Double.valueOf(d))).doubleValue();
    }

    public static boolean o00oOoO0(double d, double d2) {
        return d2 < 72.004d || d2 > 137.8347d || d < 0.8293d || d > 55.8271d;
    }

    public static double[] o00oOoOO(double d, double d2) {
        if (o00oOoO0(d, d2)) {
            return new double[]{d, d2};
        }
        double d3 = d2 - 105.0d;
        double d4 = d - 35.0d;
        double o00oOoOo2 = o00oOoOo(d3, d4);
        double o00oOoo02 = o00oOoo0(d3, d4);
        double d5 = (d / 180.0d) * f15671o00oOOo0;
        double sin = Math.sin(d5);
        double d6 = 1.0d - ((f15674o00oOooO * sin) * sin);
        double sqrt = Math.sqrt(d6);
        double d7 = f15673o00oOo00;
        return new double[]{d + ((o00oOoOo2 * 180.0d) / ((((1.0d - f15674o00oOooO) * d7) / (d6 * sqrt)) * f15671o00oOOo0)), d2 + ((o00oOoo02 * 180.0d) / ((Math.cos(d5) * (d7 / sqrt)) * f15671o00oOOo0))};
    }

    public static double o00oOoOo(double d, double d2) {
        double d3 = d * 2.0d;
        double d4 = d2 * 0.2d * d2;
        double sqrt = (Math.sqrt(Math.abs(d)) * 0.2d) + (0.1d * d * d2) + d4 + (d2 * 3.0d) + (-100.0d) + d3;
        double sin = Math.sin(d3 * f15671o00oOOo0) * 20.0d;
        return ((((Math.sin((d2 * f15671o00oOOo0) / 30.0d) * 320.0d) + (Math.sin((d2 / 12.0d) * f15671o00oOOo0) * 160.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d2 / 3.0d) * f15671o00oOOo0) * 40.0d) + (Math.sin(f15671o00oOOo0 * d2) * 20.0d)) * 2.0d) / 3.0d) + (((sin + (Math.sin((d * 6.0d) * f15671o00oOOo0) * 20.0d)) * 2.0d) / 3.0d) + sqrt;
    }

    public static double o00oOoo0(double d, double d2) {
        double d3 = d2 * 2.0d;
        double d4 = d * 0.1d;
        double d5 = d4 * d;
        double d6 = d4 * d2;
        return ((((Math.sin((d / 30.0d) * f15671o00oOOo0) * 300.0d) + (Math.sin((d / 12.0d) * f15671o00oOOo0) * 150.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d / 3.0d) * f15671o00oOOo0) * 40.0d) + (Math.sin(f15671o00oOOo0 * d) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d * 2.0d) * f15671o00oOOo0) * 20.0d) + (Math.sin((6.0d * d) * f15671o00oOOo0) * 20.0d)) * 2.0d) / 3.0d) + (Math.sqrt(Math.abs(d)) * 0.1d) + d6 + d5 + d3 + d + 300.0d;
    }

    public static double[] o00oOooO(double d, double d2) {
        double[] o00oOoOO2 = o00oOoOO(d, d2);
        return new double[]{(d * 2.0d) - o00oOoOO2[0], (d2 * 2.0d) - o00oOoOO2[1]};
    }
}
