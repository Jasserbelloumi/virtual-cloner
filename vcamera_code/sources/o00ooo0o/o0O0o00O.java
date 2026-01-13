package o00ooo0o;

import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o0O0o00O {

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final o0O0o00O f9759o00oOoo0 = o00oOoo0(o0O0O0O.f9722o00oOo00, (float) ((o0O0O0O.o00oOoO(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final float f9760o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final float f9761o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final float f9762o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final float f9763o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final float f9764o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public final float f9765o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final float[] f9766o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public final float f9767o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public final float f9768o00oOoOo;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final float f9769o00oOooO;

    public o0O0o00O(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f9764o00oOo0o = f;
        this.f9760o00oOOo0 = f2;
        this.f9761o00oOOoO = f3;
        this.f9762o00oOo00 = f4;
        this.f9769o00oOooO = f5;
        this.f9763o00oOo0O = f6;
        this.f9766o00oOoO0 = fArr;
        this.f9765o00oOoO = f7;
        this.f9767o00oOoOO = f8;
        this.f9768o00oOoOo = f9;
    }

    @oo0oO0
    public static o0O0o00O o00oOoo0(@oo0oO0 float[] fArr, float f, float f2, float f3, boolean z) {
        float[][] fArr2 = o0O0O0O.f9720o00oOOo0;
        float f4 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f5 = fArr[1];
        float f6 = fArr3[1] * f5;
        float f7 = fArr[2];
        float f8 = (fArr3[2] * f7) + f6 + (fArr3[0] * f4);
        float[] fArr4 = fArr2[1];
        float f9 = (fArr4[2] * f7) + (fArr4[1] * f5) + (fArr4[0] * f4);
        float[] fArr5 = fArr2[2];
        float f10 = (f7 * fArr5[2]) + (f5 * fArr5[1]) + (f4 * fArr5[0]);
        float f11 = (f3 / 10.0f) + 0.8f;
        float f12 = ((double) f11) >= 0.9d ? ((f11 - 0.9f) * 10.0f * 0.100000024f) + 0.59f : ((f11 - 0.8f) * 10.0f * 0.065f) + 0.525f;
        float exp = z ? 1.0f : (1.0f - (((float) Math.exp(((-f) - 42.0f) / 92.0f)) * 0.2777778f)) * f11;
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f8) * exp) + 1.0f) - exp, (((100.0f / f9) * exp) + 1.0f) - exp, (((100.0f / f10) * exp) + 1.0f) - exp};
        float f13 = 1.0f / ((5.0f * f) + 1.0f);
        float f14 = f13 * f13 * f13 * f13;
        float f15 = 1.0f - f14;
        float cbrt = (0.1f * f15 * f15 * ((float) Math.cbrt(f * 5.0d))) + (f14 * f);
        float o00oOoO2 = o0O0O0O.o00oOoO(f2) / fArr[1];
        double d2 = o00oOoO2;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float pow2 = (float) Math.pow(((fArr6[2] * cbrt) * f10) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f8) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f9) / 100.0d, 0.42d), pow2};
        float f16 = fArr7[0];
        float f17 = (f16 * 400.0f) / (f16 + 27.13f);
        float f18 = fArr7[1];
        return new o0O0o00O(o00oOoO2, ((((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f) + (f17 * 2.0f) + ((f18 * 400.0f) / (f18 + 27.13f))) * pow, pow, pow, f12, f11, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public float o00oOOo0() {
        return this.f9760o00oOOo0;
    }

    public float o00oOOoO() {
        return this.f9769o00oOooO;
    }

    public float o00oOo00() {
        return this.f9765o00oOoO;
    }

    public float o00oOo0O() {
        return this.f9764o00oOo0o;
    }

    public float o00oOo0o() {
        return this.f9761o00oOOoO;
    }

    public float o00oOoO() {
        return this.f9762o00oOo00;
    }

    public float o00oOoO0() {
        return this.f9763o00oOo0O;
    }

    @oo0oO0
    public float[] o00oOoOO() {
        return this.f9766o00oOoO0;
    }

    public float o00oOoOo() {
        return this.f9768o00oOoOo;
    }

    public float o00oOooO() {
        return this.f9767o00oOoOO;
    }
}
