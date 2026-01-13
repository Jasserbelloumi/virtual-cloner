package o00oo;

import o00ooO00.o0OoOoOo;
/* loaded from: classes.dex */
public class o00oo0OO extends o0OoOoOo {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public float f7248o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public float f7249o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public float f7250o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public float f7251o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public float f7252o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public float f7253o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public float f7254o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public float f7255o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public int f7256o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public String f7257o00oOoo0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public float f7258o00oOooO;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public boolean f7259o00oOooo = false;

    /* renamed from: o00oo0  reason: collision with root package name */
    public float f7260o00oo0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public float f7261o00oo00O;

    @Override // o00ooO00.o0OoOoOo, android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        float o00oOOoO2 = o00oOOoO(f);
        this.f7260o00oo0 = f;
        return this.f7259o00oOooo ? this.f7261o00oo00O - o00oOOoO2 : this.f7261o00oo00O + o00oOOoO2;
    }

    @Override // o00ooO00.o0OoOoOo
    public float o00oOOo0() {
        return this.f7259o00oOooo ? -o00oOo0O(this.f7260o00oo0) : o00oOo0O(this.f7260o00oo0);
    }

    public final float o00oOOoO(float f) {
        float f2 = this.f7258o00oOooO;
        if (f <= f2) {
            float f3 = this.f7248o00oOOo0;
            return ((((this.f7249o00oOOoO - f3) * f) * f) / (f2 * 2.0f)) + (f3 * f);
        }
        int i = this.f7256o00oOoOo;
        if (i == 1) {
            return this.f7254o00oOoO0;
        }
        float f4 = f - f2;
        float f5 = this.f7251o00oOo0O;
        if (f4 < f5) {
            float f6 = this.f7254o00oOoO0;
            float f7 = this.f7249o00oOOoO;
            return ((((this.f7250o00oOo00 - f7) * f4) * f4) / (f5 * 2.0f)) + (f7 * f4) + f6;
        } else if (i == 2) {
            return this.f7253o00oOoO;
        } else {
            float f8 = f4 - f5;
            float f9 = this.f7252o00oOo0o;
            if (f8 < f9) {
                float f10 = this.f7253o00oOoO;
                float f11 = this.f7250o00oOo00;
                return ((f11 * f8) + f10) - (((f11 * f8) * f8) / (f9 * 2.0f));
            }
            return this.f7255o00oOoOO;
        }
    }

    public void o00oOo00(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7;
        o00oo0OO o00oo0oo;
        float f8;
        this.f7261o00oo00O = f;
        boolean z = f > f2;
        this.f7259o00oOooo = z;
        if (z) {
            f8 = -f3;
            f7 = f - f2;
            o00oo0oo = this;
        } else {
            f7 = f2 - f;
            o00oo0oo = this;
            f8 = f3;
        }
        o00oo0oo.o00oOo0o(f8, f7, f5, f6, f4);
    }

    public float o00oOo0O(float f) {
        float f2;
        float f3;
        float f4 = this.f7258o00oOooO;
        if (f <= f4) {
            f2 = this.f7248o00oOOo0;
            f3 = this.f7249o00oOOoO;
        } else {
            int i = this.f7256o00oOoOo;
            if (i == 1) {
                return 0.0f;
            }
            f -= f4;
            f4 = this.f7251o00oOo0O;
            if (f >= f4) {
                if (i == 2) {
                    return this.f7253o00oOoO;
                }
                float f5 = f - f4;
                float f6 = this.f7252o00oOo0o;
                if (f5 < f6) {
                    float f7 = this.f7250o00oOo00;
                    return f7 - ((f5 * f7) / f6);
                }
                return this.f7255o00oOoOO;
            }
            f2 = this.f7249o00oOOoO;
            f3 = this.f7250o00oOo00;
        }
        return (((f3 - f2) * f) / f4) + f2;
    }

    public final void o00oOo0o(float f, float f2, float f3, float f4, float f5) {
        if (f == 0.0f) {
            f = 1.0E-4f;
        }
        this.f7248o00oOOo0 = f;
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < 0.0f) {
            float sqrt = (float) Math.sqrt((f2 - ((((-f) / f3) * f) / 2.0f)) * f3);
            if (sqrt < f4) {
                this.f7257o00oOoo0 = "backward accelerate, decelerate";
                this.f7256o00oOoOo = 2;
                this.f7248o00oOOo0 = f;
                this.f7249o00oOOoO = sqrt;
                this.f7250o00oOo00 = 0.0f;
                float f8 = (sqrt - f) / f3;
                this.f7258o00oOooO = f8;
                this.f7251o00oOo0O = sqrt / f3;
                this.f7254o00oOoO0 = ((f + sqrt) * f8) / 2.0f;
                this.f7253o00oOoO = f2;
                this.f7255o00oOoOO = f2;
                return;
            }
            this.f7257o00oOoo0 = "backward accelerate cruse decelerate";
            this.f7256o00oOoOo = 3;
            this.f7248o00oOOo0 = f;
            this.f7249o00oOOoO = f4;
            this.f7250o00oOo00 = f4;
            float f9 = (f4 - f) / f3;
            this.f7258o00oOooO = f9;
            float f10 = f4 / f3;
            this.f7252o00oOo0o = f10;
            float f11 = ((f + f4) * f9) / 2.0f;
            float f12 = (f10 * f4) / 2.0f;
            this.f7251o00oOo0O = ((f2 - f11) - f12) / f4;
            this.f7254o00oOoO0 = f11;
            this.f7253o00oOoO = f2 - f12;
            this.f7255o00oOoOO = f2;
        } else if (f7 >= f2) {
            this.f7257o00oOoo0 = "hard stop";
            this.f7256o00oOoOo = 1;
            this.f7248o00oOOo0 = f;
            this.f7249o00oOOoO = 0.0f;
            this.f7254o00oOoO0 = f2;
            this.f7258o00oOooO = (2.0f * f2) / f;
        } else {
            float f13 = f2 - f7;
            float f14 = f13 / f;
            if (f14 + f6 < f5) {
                this.f7257o00oOoo0 = "cruse decelerate";
                this.f7256o00oOoOo = 2;
                this.f7248o00oOOo0 = f;
                this.f7249o00oOOoO = f;
                this.f7250o00oOo00 = 0.0f;
                this.f7254o00oOoO0 = f13;
                this.f7253o00oOoO = f2;
                this.f7258o00oOooO = f14;
                this.f7251o00oOo0O = f6;
                return;
            }
            float sqrt2 = (float) Math.sqrt(((f * f) / 2.0f) + (f3 * f2));
            float f15 = (sqrt2 - f) / f3;
            this.f7258o00oOooO = f15;
            float f16 = sqrt2 / f3;
            this.f7251o00oOo0O = f16;
            if (sqrt2 < f4) {
                this.f7257o00oOoo0 = "accelerate decelerate";
                this.f7256o00oOoOo = 2;
                this.f7248o00oOOo0 = f;
                this.f7249o00oOOoO = sqrt2;
                this.f7250o00oOo00 = 0.0f;
                this.f7258o00oOooO = f15;
                this.f7251o00oOo0O = f16;
                this.f7254o00oOoO0 = ((f + sqrt2) * f15) / 2.0f;
                this.f7253o00oOoO = f2;
                return;
            }
            this.f7257o00oOoo0 = "accelerate cruse decelerate";
            this.f7256o00oOoOo = 3;
            this.f7248o00oOOo0 = f;
            this.f7249o00oOOoO = f4;
            this.f7250o00oOo00 = f4;
            float f17 = (f4 - f) / f3;
            this.f7258o00oOooO = f17;
            float f18 = f4 / f3;
            this.f7252o00oOo0o = f18;
            float f19 = ((f + f4) * f17) / 2.0f;
            float f20 = (f18 * f4) / 2.0f;
            this.f7251o00oOo0O = ((f2 - f19) - f20) / f4;
            this.f7254o00oOoO0 = f19;
            this.f7253o00oOoO = f2 - f20;
            this.f7255o00oOoOO = f2;
        }
    }

    public void o00oOooO(String str, String str2, float f) {
    }
}
