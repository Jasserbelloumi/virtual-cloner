package o00ooo0o;

import android.graphics.Color;
import o00oOoO0.o00oOoO;
import o00oOooO.oo0oO0;
import o00oooOo.oOO00OO;
/* loaded from: classes.dex */
public final class o0O0O0O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final float[][] f9720o00oOOo0 = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final float[][] f9721o00oOOoO = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final float[] f9722o00oOo00 = {95.047f, 100.0f, 108.883f};

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final float[][] f9723o00oOooO = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static int o00oOOo0(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = (f > 8.0f ? 1 : (f == 8.0f ? 0 : -1)) > 0 ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f9722o00oOo00;
        return oOO00OO.o00oOoO0(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    public static float o00oOOoO(int i) {
        return o00oOo00(o00oOoO0(i));
    }

    public static float o00oOo00(float f) {
        float f2 = f / 100.0f;
        return f2 <= 0.008856452f ? f2 * 903.2963f : (((float) Math.cbrt(f2)) * 116.0f) - 16.0f;
    }

    public static float o00oOo0O(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    @oo0oO0
    public static float[] o00oOo0o(int i) {
        float o00oOo0O2 = o00oOo0O(Color.red(i));
        float o00oOo0O3 = o00oOo0O(Color.green(i));
        float o00oOo0O4 = o00oOo0O(Color.blue(i));
        float[][] fArr = f9723o00oOooO;
        float[] fArr2 = fArr[0];
        float f = (fArr2[2] * o00oOo0O4) + (fArr2[1] * o00oOo0O3) + (fArr2[0] * o00oOo0O2);
        float[] fArr3 = fArr[1];
        float f2 = fArr3[1] * o00oOo0O3;
        float f3 = fArr3[2] * o00oOo0O4;
        float[] fArr4 = fArr[2];
        return new float[]{f, f3 + f2 + (fArr3[0] * o00oOo0O2), (o00oOo0O4 * fArr4[2]) + (o00oOo0O3 * fArr4[1]) + (o00oOo0O2 * fArr4[0])};
    }

    public static float o00oOoO(float f) {
        return (f > 8.0f ? (float) Math.pow((f + 16.0d) / 116.0d, 3.0d) : f / 903.2963f) * 100.0f;
    }

    public static float o00oOoO0(int i) {
        float o00oOo0O2 = o00oOo0O(Color.red(i));
        float o00oOo0O3 = o00oOo0O(Color.green(i));
        float o00oOo0O4 = o00oOo0O(Color.blue(i));
        float[] fArr = f9723o00oOooO[1];
        return (o00oOo0O4 * fArr[2]) + (o00oOo0O3 * fArr[1]) + (o00oOo0O2 * fArr[0]);
    }

    public static float o00oOooO(float f, float f2, float f3) {
        return o00oOoO.o00oOOo0(f2, f, f3, f);
    }
}
