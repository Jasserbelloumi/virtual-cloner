package o00ooo0o;

import o00oOooO.o0O00O;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00oooOo.oOO00OO;
import o0OOOOO0.o0O00O0;
/* loaded from: classes.dex */
public class o0O00oO0 {

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final float f9707o00oOoOo = 0.2f;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final float f9708o00oOoo0 = 1.0f;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final float f9709o00oOooo = 0.4f;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final float f9710o00oo00O = 0.01f;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final float f9711o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final float f9712o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final float f9713o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final float f9714o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final float f9715o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public final float f9716o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final float f9717o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public final float f9718o00oOoOO;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final float f9719o00oOooO;

    public o0O00oO0(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f9711o00oOOo0 = f;
        this.f9712o00oOOoO = f2;
        this.f9713o00oOo00 = f3;
        this.f9719o00oOooO = f4;
        this.f9714o00oOo0O = f5;
        this.f9715o00oOo0o = f6;
        this.f9717o00oOoO0 = f7;
        this.f9716o00oOoO = f8;
        this.f9718o00oOoOO = f9;
    }

    @o0OO00OO
    public static o0O00oO0 o00oOOoO(@o00oOooO.o0O0OO0(from = 0.0d, to = 360.0d) float f, @o00oOooO.o0O0OO0(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @o00oOooO.o0O0OO0(from = 0.0d, to = 100.0d) float f3) {
        float f4 = 1000.0f;
        float f5 = 0.0f;
        o0O00oO0 o0o00oo0 = null;
        float f6 = 100.0f;
        float f7 = 1000.0f;
        while (Math.abs(f5 - f6) > 0.01f) {
            float f8 = ((f6 - f5) / 2.0f) + f5;
            int o00oo0o02 = o00oOo0O(f8, f2, f).o00oo0o0();
            float o00oOOoO2 = o0O0O0O.o00oOOoO(o00oo0o02);
            float abs = Math.abs(f3 - o00oOOoO2);
            if (abs < 0.2f) {
                o0O00oO0 o00oOo002 = o00oOo00(o00oo0o02);
                float o00oOOo02 = o00oOo002.o00oOOo0(o00oOo0O(o00oOo002.o00oOoo0(), o00oOo002.o00oOoOO(), f));
                if (o00oOOo02 <= 1.0f) {
                    o0o00oo0 = o00oOo002;
                    f4 = abs;
                    f7 = o00oOOo02;
                }
            }
            if (f4 == 0.0f && f7 == 0.0f) {
                break;
            } else if (o00oOOoO2 < f3) {
                f5 = f8;
            } else {
                f6 = f8;
            }
        }
        return o0o00oo0;
    }

    @oo0oO0
    public static o0O00oO0 o00oOo00(@o0O00O int i) {
        return o00oOooO(i, o0O0o00O.f9759o00oOoo0);
    }

    @oo0oO0
    public static o0O00oO0 o00oOo0O(@o00oOooO.o0O0OO0(from = 0.0d, to = 100.0d) float f, @o00oOooO.o0O0OO0(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @o00oOooO.o0O0OO0(from = 0.0d, to = 360.0d) float f3) {
        return o00oOo0o(f, f2, f3, o0O0o00O.f9759o00oOoo0);
    }

    @oo0oO0
    public static o0O00oO0 o00oOo0o(@o00oOooO.o0O0OO0(from = 0.0d, to = 100.0d) float f, @o00oOooO.o0O0OO0(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @o00oOooO.o0O0OO0(from = 0.0d, to = 360.0d) float f3, o0O0o00O o0o0o00o) {
        double d;
        float sqrt = (o0o0o00o.f9760o00oOOo0 + 4.0f) * (4.0f / o0o0o00o.f9769o00oOooO) * ((float) Math.sqrt(f / 100.0d));
        float f4 = o0o0o00o.f9767o00oOoOO;
        float f5 = sqrt * f4;
        float f6 = f2 * f4;
        float sqrt2 = ((float) Math.sqrt(((f2 / ((float) Math.sqrt(d))) * o0o0o00o.f9769o00oOooO) / (o0o0o00o.f9760o00oOOo0 + 4.0f))) * 50.0f;
        float f7 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((f6 * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new o0O00oO0(f3, f2, f, f5, f6, sqrt2, f7, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    @oo0oO0
    public static o0O00oO0 o00oOooO(@o0O00O int i, @oo0oO0 o0O0o00O o0o0o00o) {
        float pow;
        float[] o00oOo0o2 = o0O0O0O.o00oOo0o(i);
        float[][] fArr = o0O0O0O.f9720o00oOOo0;
        float f = o00oOo0o2[0];
        float[] fArr2 = fArr[0];
        float f2 = o00oOo0o2[1];
        float f3 = fArr2[1] * f2;
        float f4 = o00oOo0o2[2];
        float f5 = (fArr2[2] * f4) + f3 + (fArr2[0] * f);
        float[] fArr3 = fArr[1];
        float f6 = fArr3[1] * f2;
        float f7 = fArr3[2] * f4;
        float[] fArr4 = fArr[2];
        float f8 = f * fArr4[0];
        float f9 = f4 * fArr4[2];
        float[] fArr5 = o0o0o00o.f9766o00oOoO0;
        float f10 = fArr5[0] * f5;
        float f11 = fArr5[1] * (f7 + f6 + (fArr3[0] * f));
        float f12 = fArr5[2] * (f9 + (f2 * fArr4[1]) + f8);
        float pow2 = (float) Math.pow((Math.abs(f10) * o0o0o00o.f9765o00oOoO) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f11) * o0o0o00o.f9765o00oOoO) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((Math.abs(f12) * o0o0o00o.f9765o00oOoO) / 100.0d, 0.42d);
        float signum = ((Math.signum(f10) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f11) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f12) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d = signum3;
        float f13 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d)) / 11.0f;
        float f14 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f15 = signum2 * 20.0f;
        float f16 = ((21.0f * signum3) + ((signum * 20.0f) + f15)) / 20.0f;
        float f17 = (((signum * 40.0f) + f15) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f14, f13)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f18 = atan2;
        float f19 = (3.1415927f * f18) / 180.0f;
        float pow5 = ((float) Math.pow((f17 * o0o0o00o.f9761o00oOOoO) / o0o0o00o.f9760o00oOOo0, o0o0o00o.f9769o00oOooO * o0o0o00o.f9768o00oOoOo)) * 100.0f;
        float sqrt = (o0o0o00o.f9760o00oOOo0 + 4.0f) * (4.0f / o0o0o00o.f9769o00oOooO) * ((float) Math.sqrt(pow5 / 100.0f)) * o0o0o00o.f9767o00oOoOO;
        float pow6 = ((float) Math.pow(1.64d - Math.pow(0.29d, o0o0o00o.f9764o00oOo0o), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f18) < 20.14d ? 360.0f + f18 : f18) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * o0o0o00o.f9763o00oOo0O) * o0o0o00o.f9762o00oOo00) * ((float) Math.sqrt((f14 * f14) + (f13 * f13)))) / (f16 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow5 / 100.0d));
        float f20 = pow6 * o0o0o00o.f9767o00oOoOO;
        float sqrt2 = ((float) Math.sqrt((pow * o0o0o00o.f9769o00oOooO) / (o0o0o00o.f9760o00oOOo0 + 4.0f))) * 50.0f;
        float f21 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((0.0228f * f20) + 1.0f)) * 43.85965f;
        double d2 = f19;
        return new o0O00oO0(f18, pow6, pow5, sqrt, f20, sqrt2, f21, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    @o0O00O
    public static int o00oo0O(@o00oOooO.o0O0OO0(from = 0.0d, to = 360.0d) float f, @o00oOooO.o0O0OO0(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @o00oOooO.o0O0OO0(from = 0.0d, to = 100.0d) float f3, @oo0oO0 o0O0o00O o0o0o00o) {
        if (f2 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
            return o0O0O0O.o00oOOo0(f3);
        }
        float min = f < 0.0f ? 0.0f : Math.min(360.0f, f);
        o0O00oO0 o0o00oo0 = null;
        boolean z = true;
        float f4 = 0.0f;
        float f5 = f2;
        while (Math.abs(f4 - f2) >= 0.4f) {
            o0O00oO0 o00oOOoO2 = o00oOOoO(min, f5, f3);
            if (z) {
                if (o00oOOoO2 != null) {
                    return o00oOOoO2.o00oo0Oo(o0o0o00o);
                }
                z = false;
            } else if (o00oOOoO2 == null) {
                f2 = f5;
            } else {
                f4 = f5;
                o0o00oo0 = o00oOOoO2;
            }
            f5 = ((f2 - f4) / 2.0f) + f4;
        }
        return o0o00oo0 == null ? o0O0O0O.o00oOOo0(f3) : o0o00oo0.o00oo0Oo(o0o0o00o);
    }

    public static int o00oo0O0(@o00oOooO.o0O0OO0(from = 0.0d, to = 360.0d) float f, @o00oOooO.o0O0OO0(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f2, @o00oOooO.o0O0OO0(from = 0.0d, to = 100.0d) float f3) {
        return o00oo0O(f, f2, f3, o0O0o00O.f9759o00oOoo0);
    }

    public float o00oOOo0(@oo0oO0 o0O00oO0 o0o00oo0) {
        float o00oOooo2 = o00oOooo() - o0o00oo0.o00oOooo();
        float o00oOoO02 = o00oOoO0() - o0o00oo0.o00oOoO0();
        float o00oOoO2 = o00oOoO() - o0o00oo0.o00oOoO();
        return (float) (Math.pow(Math.sqrt((o00oOoO2 * o00oOoO2) + (o00oOoO02 * o00oOoO02) + (o00oOooo2 * o00oOooo2)), 0.63d) * 1.41d);
    }

    @o00oOooO.o0O0OO0(from = o0O00O0.f13582o00oOo0O, fromInclusive = false, to = o0O00O0.f13586o00oOooO, toInclusive = false)
    public float o00oOoO() {
        return this.f9718o00oOoOO;
    }

    @o00oOooO.o0O0OO0(from = o0O00O0.f13582o00oOo0O, fromInclusive = false, to = o0O00O0.f13586o00oOooO, toInclusive = false)
    public float o00oOoO0() {
        return this.f9716o00oOoO;
    }

    @o00oOooO.o0O0OO0(from = 0.0d, to = o0O00O0.f13586o00oOooO, toInclusive = false)
    public float o00oOoOO() {
        return this.f9712o00oOOoO;
    }

    @o00oOooO.o0O0OO0(from = 0.0d, to = 360.0d, toInclusive = false)
    public float o00oOoOo() {
        return this.f9711o00oOOo0;
    }

    @o00oOooO.o0O0OO0(from = 0.0d, to = oOO00OO.f9783o00oOOoO)
    public float o00oOoo0() {
        return this.f9713o00oOo00;
    }

    @o00oOooO.o0O0OO0(from = 0.0d, to = oOO00OO.f9783o00oOOoO)
    public float o00oOooo() {
        return this.f9717o00oOoO0;
    }

    @o00oOooO.o0O0OO0(from = 0.0d, to = o0O00O0.f13586o00oOooO, toInclusive = false)
    public float o00oo0() {
        return this.f9719o00oOooO;
    }

    @o00oOooO.o0O0OO0(from = 0.0d, to = o0O00O0.f13586o00oOooO, toInclusive = false)
    public float o00oo00O() {
        return this.f9714o00oOo0O;
    }

    @o00oOooO.o0O0OO0(from = 0.0d, to = o0O00O0.f13586o00oOooO, toInclusive = false)
    public float o00oo0OO() {
        return this.f9715o00oOo0o;
    }

    @o0O00O
    public int o00oo0Oo(@oo0oO0 o0O0o00O o0o0o00o) {
        float pow = (float) Math.pow(((((double) o00oOoOO()) == 0.0d || ((double) o00oOoo0()) == 0.0d) ? 0.0f : o00oOoOO() / ((float) Math.sqrt(o00oOoo0() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, o0o0o00o.f9764o00oOo0o), 0.73d), 1.1111111111111112d);
        double o00oOoOo2 = (o00oOoOo() * 3.1415927f) / 180.0f;
        float pow2 = o0o0o00o.f9760o00oOOo0 * ((float) Math.pow(o00oOoo0() / 100.0d, (1.0d / o0o0o00o.f9769o00oOooO) / o0o0o00o.f9768o00oOoOo));
        float cos = ((float) (Math.cos(2.0d + o00oOoOo2) + 3.8d)) * 0.25f * 3846.1538f * o0o0o00o.f9763o00oOo0O * o0o0o00o.f9762o00oOo00;
        float f = pow2 / o0o0o00o.f9761o00oOOoO;
        float sin = (float) Math.sin(o00oOoOo2);
        float cos2 = (float) Math.cos(o00oOoOo2);
        float f2 = (((0.305f + f) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (cos * 23.0f)));
        float f3 = cos2 * f2;
        float f4 = f2 * sin;
        float f5 = f * 460.0f;
        float f6 = ((288.0f * f4) + ((451.0f * f3) + f5)) / 1403.0f;
        float f7 = ((f5 - (891.0f * f3)) - (261.0f * f4)) / 1403.0f;
        float f8 = ((f5 - (f3 * 220.0f)) - (f4 * 6300.0f)) / 1403.0f;
        float signum = (100.0f / o0o0o00o.f9765o00oOoO) * Math.signum(f6) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f6) * 27.13d) / (400.0d - Math.abs(f6))), 2.380952380952381d));
        float signum2 = (100.0f / o0o0o00o.f9765o00oOoO) * Math.signum(f7) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f7) * 27.13d) / (400.0d - Math.abs(f7))), 2.380952380952381d));
        float signum3 = Math.signum(f8);
        float[] fArr = o0o0o00o.f9766o00oOoO0;
        float f9 = signum / fArr[0];
        float f10 = signum2 / fArr[1];
        float pow3 = (((100.0f / o0o0o00o.f9765o00oOoO) * signum3) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f8) * 27.13d) / (400.0d - Math.abs(f8))), 2.380952380952381d))) / fArr[2];
        float[][] fArr2 = o0O0O0O.f9721o00oOOoO;
        float[] fArr3 = fArr2[0];
        float f11 = (fArr3[2] * pow3) + (fArr3[1] * f10) + (fArr3[0] * f9);
        float[] fArr4 = fArr2[1];
        float f12 = fArr4[1] * f10;
        float f13 = fArr4[2] * pow3;
        float[] fArr5 = fArr2[2];
        return oOO00OO.o00oOoO0(f11, f13 + f12 + (fArr4[0] * f9), (pow3 * fArr5[2]) + (f10 * fArr5[1]) + (f9 * fArr5[0]));
    }

    @o0O00O
    public int o00oo0o0() {
        return o00oo0Oo(o0O0o00O.f9759o00oOoo0);
    }
}
