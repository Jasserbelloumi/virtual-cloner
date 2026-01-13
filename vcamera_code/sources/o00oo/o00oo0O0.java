package o00oo;

import o00ooO00.o0O0o;
import o00ooO00.o0OoO00O;
/* loaded from: classes.dex */
public class o00oo0O0 {

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static String f7241o00oOoO0 = "VelocityMatrix";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public float f7242o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public float f7243o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public float f7244o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public float f7245o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public float f7246o00oOo0o;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public float f7247o00oOooO;

    public void o00oOOo0(float f, float f2, int i, int i2, float[] fArr) {
        float f3;
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = (f2 - 0.5f) * 2.0f;
        float f7 = f4 + this.f7244o00oOo00;
        float f8 = f5 + this.f7247o00oOooO;
        float f9 = (this.f7242o00oOOo0 * (f - 0.5f) * 2.0f) + f7;
        float f10 = (this.f7243o00oOOoO * f6) + f8;
        float radians = (float) Math.toRadians(this.f7246o00oOo0o);
        float radians2 = (float) Math.toRadians(this.f7245o00oOo0O);
        double d = radians;
        double sin = Math.sin(d);
        double d2 = i2 * f6;
        double cos = Math.cos(d);
        fArr[0] = (((float) ((sin * ((-i) * f3)) - (Math.cos(d) * d2))) * radians2) + f9;
        fArr[1] = (radians2 * ((float) ((cos * (i * f3)) - (Math.sin(d) * d2)))) + f10;
    }

    public void o00oOOoO() {
        this.f7245o00oOo0O = 0.0f;
        this.f7247o00oOooO = 0.0f;
        this.f7244o00oOo00 = 0.0f;
        this.f7243o00oOOoO = 0.0f;
        this.f7242o00oOOo0 = 0.0f;
    }

    public void o00oOo00(o0O0o o0o0o, float f) {
        if (o0o0o != null) {
            this.f7245o00oOo0O = o0o0o.o00oOo00(f);
        }
    }

    public void o00oOo0O(o0O0o o0o0o, o0O0o o0o0o2, float f) {
        if (o0o0o == null && o0o0o2 == null) {
            return;
        }
        if (o0o0o == null) {
            this.f7242o00oOOo0 = o0o0o.o00oOo00(f);
        }
        if (o0o0o2 == null) {
            this.f7243o00oOOoO = o0o0o2.o00oOo00(f);
        }
    }

    public void o00oOo0o(o0OoO00O o0ooo00o, o0OoO00O o0ooo00o2, float f) {
        if (o0ooo00o != null) {
            this.f7242o00oOOo0 = o0ooo00o.o00oOo00(f);
        }
        if (o0ooo00o2 != null) {
            this.f7243o00oOOoO = o0ooo00o2.o00oOo00(f);
        }
    }

    public void o00oOoO(o0OoO00O o0ooo00o, o0OoO00O o0ooo00o2, float f) {
        if (o0ooo00o != null) {
            this.f7244o00oOo00 = o0ooo00o.o00oOo00(f);
        }
        if (o0ooo00o2 != null) {
            this.f7247o00oOooO = o0ooo00o2.o00oOo00(f);
        }
    }

    public void o00oOoO0(o0O0o o0o0o, o0O0o o0o0o2, float f) {
        if (o0o0o != null) {
            this.f7244o00oOo00 = o0o0o.o00oOo00(f);
        }
        if (o0o0o2 != null) {
            this.f7247o00oOooO = o0o0o2.o00oOo00(f);
        }
    }

    public void o00oOooO(o0OoO00O o0ooo00o, float f) {
        if (o0ooo00o != null) {
            this.f7245o00oOo0O = o0ooo00o.o00oOo00(f);
            this.f7246o00oOo0o = o0ooo00o.o00oOOo0(f);
        }
    }
}
