package o00oooOo;

import android.graphics.Color;
import android.support.v4.media.o00oOo0O;
import com.google.common.collect.LinkedHashMultimap;
import java.util.Objects;
import o00oOooO.o0O00O;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0O0OO0;
import o00oOooO.o0O0o00O;
import o00oOooO.o0OOooO0;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class oOO00OO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final double f9782o00oOOo0 = 95.047d;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final double f9783o00oOOoO = 100.0d;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final double f9784o00oOo00 = 108.883d;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final double f9785o00oOo0O = 903.3d;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f9786o00oOo0o = 10;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final ThreadLocal<double[]> f9787o00oOoO = new ThreadLocal<>();

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f9788o00oOoO0 = 1;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final double f9789o00oOooO = 0.008856d;

    @o0OOooO0(26)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static Color o00oOOo0(Color color, Color color2) {
            if (!Objects.equals(color.getModel(), color2.getModel())) {
                StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Color models must match (");
                o00oOOo02.append(color.getModel());
                o00oOOo02.append(" vs. ");
                o00oOOo02.append(color2.getModel());
                o00oOOo02.append(")");
                throw new IllegalArgumentException(o00oOOo02.toString());
            }
            if (!Objects.equals(color2.getColorSpace(), color.getColorSpace())) {
                color = color.convert(color2.getColorSpace());
            }
            float[] components = color.getComponents();
            float[] components2 = color2.getComponents();
            float alpha = color.alpha();
            float alpha2 = (1.0f - alpha) * color2.alpha();
            int componentCount = color2.getComponentCount() - 1;
            float f = alpha + alpha2;
            components2[componentCount] = f;
            if (f > 0.0f) {
                alpha /= f;
                alpha2 /= f;
            }
            for (int i = 0; i < componentCount; i++) {
                components2[i] = (components2[i] * alpha2) + (components[i] * alpha);
            }
            return Color.valueOf(components2, color2.getColorSpace());
        }
    }

    @o0O00O
    public static int o00oOOo0(@oo0oO0 float[] fArr) {
        int round;
        int round2;
        int round3;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float abs = (1.0f - Math.abs((f3 * 2.0f) - 1.0f)) * f2;
        float f4 = f3 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f) / 60) {
            case 0:
                round = Math.round((abs + f4) * 255.0f);
                round2 = Math.round((abs2 + f4) * 255.0f);
                round3 = Math.round(f4 * 255.0f);
                break;
            case 1:
                round = Math.round((abs2 + f4) * 255.0f);
                round2 = Math.round((abs + f4) * 255.0f);
                round3 = Math.round(f4 * 255.0f);
                break;
            case 2:
                round = Math.round(f4 * 255.0f);
                round2 = Math.round((abs + f4) * 255.0f);
                round3 = Math.round((abs2 + f4) * 255.0f);
                break;
            case 3:
                round = Math.round(f4 * 255.0f);
                round2 = Math.round((abs2 + f4) * 255.0f);
                round3 = Math.round((abs + f4) * 255.0f);
                break;
            case 4:
                round = Math.round((abs2 + f4) * 255.0f);
                round2 = Math.round(f4 * 255.0f);
                round3 = Math.round((abs + f4) * 255.0f);
                break;
            case 5:
            case 6:
                round = Math.round((abs + f4) * 255.0f);
                round2 = Math.round(f4 * 255.0f);
                round3 = Math.round((abs2 + f4) * 255.0f);
                break;
            default:
                round3 = 0;
                round = 0;
                round2 = 0;
                break;
        }
        return Color.rgb(o00ooO00(round, 0, 255), o00ooO00(round2, 0, 255), o00ooO00(round3, 0, 255));
    }

    @o0O00O
    public static int o00oOOoO(@o0O0OO0(from = 0.0d, to = 100.0d) double d, @o0O0OO0(from = -128.0d, to = 127.0d) double d2, @o0O0OO0(from = -128.0d, to = 127.0d) double d3) {
        double[] o00ooO0O2 = o00ooO0O();
        o00oOo00(d, d2, d3, o00ooO0O2);
        return o00oOoO0(o00ooO0O2[0], o00ooO0O2[1], o00ooO0O2[2]);
    }

    public static void o00oOo00(@o0O0OO0(from = 0.0d, to = 100.0d) double d, @o0O0OO0(from = -128.0d, to = 127.0d) double d2, @o0O0OO0(from = -128.0d, to = 127.0d) double d3, @oo0oO0 double[] dArr) {
        double d4 = (d + 16.0d) / 116.0d;
        double d5 = (d2 / 500.0d) + d4;
        double d6 = d4 - (d3 / 200.0d);
        double pow = Math.pow(d5, 3.0d);
        if (pow <= 0.008856d) {
            pow = ((d5 * 116.0d) - 16.0d) / 903.3d;
        }
        double pow2 = d > 7.9996247999999985d ? Math.pow(d4, 3.0d) : d / 903.3d;
        double pow3 = Math.pow(d6, 3.0d);
        if (pow3 <= 0.008856d) {
            pow3 = ((d6 * 116.0d) - 16.0d) / 903.3d;
        }
        dArr[0] = pow * 95.047d;
        dArr[1] = pow2 * 100.0d;
        dArr[2] = pow3 * 108.883d;
    }

    public static void o00oOo0O(@o0O0o00O(from = 0, to = 255) int i, @o0O0o00O(from = 0, to = 255) int i2, @o0O0o00O(from = 0, to = 255) int i3, @oo0oO0 double[] dArr) {
        o00oOo0o(i, i2, i3, dArr);
        o00oOoO(dArr[0], dArr[1], dArr[2], dArr);
    }

    public static void o00oOo0o(@o0O0o00O(from = 0, to = 255) int i, @o0O0o00O(from = 0, to = 255) int i2, @o0O0o00O(from = 0, to = 255) int i3, @oo0oO0 double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d = i / 255.0d;
        double pow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = i2 / 255.0d;
        double pow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = i3 / 255.0d;
        double pow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
        dArr[1] = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
        dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
    }

    public static void o00oOoO(@o0O0OO0(from = 0.0d, to = 95.047d) double d, @o0O0OO0(from = 0.0d, to = 100.0d) double d2, @o0O0OO0(from = 0.0d, to = 108.883d) double d3, @oo0oO0 double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outLab must have a length of 3.");
        }
        double o00ooO0o2 = o00ooO0o(d / 95.047d);
        double o00ooO0o3 = o00ooO0o(d2 / 100.0d);
        double o00ooO0o4 = o00ooO0o(d3 / 108.883d);
        dArr[0] = Math.max(0.0d, (116.0d * o00ooO0o3) - 16.0d);
        dArr[1] = (o00ooO0o2 - o00ooO0o3) * 500.0d;
        dArr[2] = (o00ooO0o3 - o00ooO0o4) * 200.0d;
    }

    @o0O00O
    public static int o00oOoO0(@o0O0OO0(from = 0.0d, to = 95.047d) double d, @o0O0OO0(from = 0.0d, to = 100.0d) double d2, @o0O0OO0(from = 0.0d, to = 108.883d) double d3) {
        double d4 = (((-0.4986d) * d3) + (((-1.5372d) * d2) + (3.2406d * d))) / 100.0d;
        double d5 = ((0.0415d * d3) + ((1.8758d * d2) + ((-0.9689d) * d))) / 100.0d;
        double d6 = ((1.057d * d3) + (((-0.204d) * d2) + (0.0557d * d))) / 100.0d;
        return Color.rgb(o00ooO00((int) Math.round((d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d) * 255.0d), 0, 255), o00ooO00((int) Math.round((d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d) * 255.0d), 0, 255), o00ooO00((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d), 0, 255));
    }

    @o0O00O
    public static int o00oOoOO(@o0O00O int i, @o0O00O int i2, @o0O0OO0(from = 0.0d, to = 1.0d) float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), (int) ((Color.red(i2) * f) + (Color.red(i) * f2)), (int) ((Color.green(i2) * f) + (Color.green(i) * f2)), (int) ((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static void o00oOoOo(@oo0oO0 float[] fArr, @oo0oO0 float[] fArr2, @o0O0OO0(from = 0.0d, to = 1.0d) float f, @oo0oO0 float[] fArr3) {
        if (fArr3.length != 3) {
            throw new IllegalArgumentException("result must have a length of 3.");
        }
        float f2 = 1.0f - f;
        fArr3[0] = o00oo0OO(fArr[0], fArr2[0], f);
        fArr3[1] = (fArr2[1] * f) + (fArr[1] * f2);
        fArr3[2] = (fArr2[2] * f) + (fArr[2] * f2);
    }

    public static void o00oOoo0(@oo0oO0 double[] dArr, @oo0oO0 double[] dArr2, @o0O0OO0(from = 0.0d, to = 1.0d) double d, @oo0oO0 double[] dArr3) {
        if (dArr3.length != 3) {
            throw new IllegalArgumentException("outResult must have a length of 3.");
        }
        double d2 = 1.0d - d;
        dArr3[0] = (dArr2[0] * d) + (dArr[0] * d2);
        dArr3[1] = (dArr2[1] * d) + (dArr[1] * d2);
        dArr3[2] = (dArr2[2] * d) + (dArr[2] * d2);
    }

    public static void o00oOooO(@o0O0o00O(from = 0, to = 255) int i, @o0O0o00O(from = 0, to = 255) int i2, @o0O0o00O(from = 0, to = 255) int i3, @oo0oO0 float[] fArr) {
        float f;
        float abs;
        float f2 = i / 255.0f;
        float f3 = i2 / 255.0f;
        float f4 = i3 / 255.0f;
        float max = Math.max(f2, Math.max(f3, f4));
        float min = Math.min(f2, Math.min(f3, f4));
        float f5 = max - min;
        float f6 = (max + min) / 2.0f;
        if (max == min) {
            f = 0.0f;
            abs = 0.0f;
        } else {
            f = max == f2 ? ((f3 - f4) / f5) % 6.0f : max == f3 ? ((f4 - f2) / f5) + 2.0f : 4.0f + ((f2 - f3) / f5);
            abs = f5 / (1.0f - Math.abs((2.0f * f6) - 1.0f));
        }
        float f7 = (f * 60.0f) % 360.0f;
        if (f7 < 0.0f) {
            f7 += 360.0f;
        }
        fArr[0] = o00oo(f7, 0.0f, 360.0f);
        fArr[1] = o00oo(abs, 0.0f, 1.0f);
        fArr[2] = o00oo(f6, 0.0f, 1.0f);
    }

    public static double o00oOooo(@o0O00O int i, @o0O00O int i2) {
        if (Color.alpha(i2) != 255) {
            StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("background can not be translucent: #");
            o00oOOo02.append(Integer.toHexString(i2));
            throw new IllegalArgumentException(o00oOOo02.toString());
        }
        if (Color.alpha(i) < 255) {
            i = o00oo0o(i, i2);
        }
        double o00oo00O2 = o00oo00O(i) + 0.05d;
        double o00oo00O3 = o00oo00O(i2) + 0.05d;
        return Math.max(o00oo00O2, o00oo00O3) / Math.min(o00oo00O2, o00oo00O3);
    }

    public static float o00oo(float f, float f2, float f3) {
        return f < f2 ? f2 : Math.min(f, f3);
    }

    public static int o00oo0(@o0O00O int i, @o0O00O int i2, float f) {
        int i3 = 255;
        if (Color.alpha(i2) != 255) {
            StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("background can not be translucent: #");
            o00oOOo02.append(Integer.toHexString(i2));
            throw new IllegalArgumentException(o00oOOo02.toString());
        }
        double d = f;
        if (o00oOooo(o00ooO(i, 255), i2) < d) {
            return -1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
            int i6 = (i4 + i3) / 2;
            if (o00oOooo(o00ooO(i, i6), i2) < d) {
                i4 = i6;
            } else {
                i3 = i6;
            }
        }
        return i3;
    }

    @o0O0OO0(from = 0.0d, to = LinkedHashMultimap.VALUE_SET_LOAD_FACTOR)
    public static double o00oo00O(@o0O00O int i) {
        double[] o00ooO0O2 = o00ooO0O();
        o00oo0Oo(i, o00ooO0O2);
        return o00ooO0O2[1] / 100.0d;
    }

    public static void o00oo0O(@o0O00O int i, @oo0oO0 double[] dArr) {
        o00oOo0O(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    public static void o00oo0O0(@o0O00O int i, @oo0oO0 float[] fArr) {
        o00oOooO(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    @o0o0000
    public static float o00oo0OO(float f, float f2, float f3) {
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > f) {
                f += 360.0f;
            } else {
                f2 += 360.0f;
            }
        }
        return (((f2 - f) * f3) + f) % 360.0f;
    }

    public static void o00oo0Oo(@o0O00O int i, @oo0oO0 double[] dArr) {
        o00oOo0o(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    public static int o00oo0o(@o0O00O int i, @o0O00O int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int o00oo0o02 = o00oo0o0(alpha2, alpha);
        return Color.argb(o00oo0o02, o0O0o(Color.red(i), alpha2, Color.red(i2), alpha, o00oo0o02), o0O0o(Color.green(i), alpha2, Color.green(i2), alpha, o00oo0o02), o0O0o(Color.blue(i), alpha2, Color.blue(i2), alpha, o00oo0o02));
    }

    public static int o00oo0o0(int i, int i2) {
        return 255 - (((255 - i) * (255 - i2)) / 255);
    }

    @o0OOooO0(26)
    @oo0oO0
    public static Color o00oo0oO(@oo0oO0 Color color, @oo0oO0 Color color2) {
        return o00oOOo0.o00oOOo0(color, color2);
    }

    @o0O00O
    public static int o00ooO(@o0O00O int i, @o0O0o00O(from = 0, to = 255) int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }

    public static double o00ooO0(@oo0oO0 double[] dArr, @oo0oO0 double[] dArr2) {
        double pow = Math.pow(dArr[0] - dArr2[0], 2.0d);
        return Math.sqrt(Math.pow(dArr[2] - dArr2[2], 2.0d) + Math.pow(dArr[1] - dArr2[1], 2.0d) + pow);
    }

    public static int o00ooO00(int i, int i2, int i3) {
        return i < i2 ? i2 : Math.min(i, i3);
    }

    public static double[] o00ooO0O() {
        ThreadLocal<double[]> threadLocal = f9787o00oOoO;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            double[] dArr2 = new double[3];
            threadLocal.set(dArr2);
            return dArr2;
        }
        return dArr;
    }

    public static double o00ooO0o(double d) {
        return d > 0.008856d ? Math.pow(d, 0.3333333333333333d) : ((d * 903.3d) + 16.0d) / 116.0d;
    }

    public static int o0O0o(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((255 - i2) * (i3 * i4)) + ((i * 255) * i2)) / (i5 * 255);
    }
}
