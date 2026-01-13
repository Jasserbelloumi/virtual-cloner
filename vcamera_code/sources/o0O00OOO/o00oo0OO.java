package o0O00OOO;

import o00oOooO.o0O0OO0;
import o00oOooO.o0OO0oO;
import o0O00OOO.o00oOOoO;
/* loaded from: classes.dex */
public final class o00oo0OO implements o00oo00O {

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final float f10976o00oOoo0 = 10000.0f;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final float f10977o00oOooo = 1500.0f;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final float f10978o00oo0 = 50.0f;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final float f10979o00oo00O = 200.0f;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final float f10980o00oo0O = 0.75f;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final float f10981o00oo0O0 = 0.5f;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final float f10982o00oo0OO = 0.2f;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final float f10983o00oo0Oo = 1.0f;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final double f10984o00oo0o = Double.MAX_VALUE;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final double f10985o00oo0o0 = 62.5d;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public double f10986o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public double f10987o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public boolean f10988o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public double f10989o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public double f10990o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public double f10991o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public double f10992o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public double f10993o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public final o00oOOoO.o0O00000 f10994o00oOoOo;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public double f10995o00oOooO;

    public o00oo0OO() {
        this.f10986o00oOOo0 = Math.sqrt(1500.0d);
        this.f10987o00oOOoO = 0.5d;
        this.f10988o00oOo00 = false;
        this.f10993o00oOoOO = Double.MAX_VALUE;
        this.f10994o00oOoOo = new o00oOOoO.o0O00000();
    }

    public o00oo0OO(float f) {
        this.f10986o00oOOo0 = Math.sqrt(1500.0d);
        this.f10987o00oOOoO = 0.5d;
        this.f10988o00oOo00 = false;
        this.f10993o00oOoOO = Double.MAX_VALUE;
        this.f10994o00oOoOo = new o00oOOoO.o0O00000();
        this.f10993o00oOoOO = f;
    }

    @Override // o0O00OOO.o00oo00O
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public boolean o00oOOo0(float f, float f2) {
        return ((double) Math.abs(f2)) < this.f10989o00oOo0O && ((double) Math.abs(f - ((float) this.f10993o00oOoOO))) < this.f10995o00oOooO;
    }

    @Override // o0O00OOO.o00oo00O
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public float o00oOOoO(float f, float f2) {
        float f3 = f - ((float) this.f10993o00oOoOO);
        double d = this.f10986o00oOOo0;
        return (float) (((-(d * d)) * f3) - (((d * 2.0d) * this.f10987o00oOOoO) * f2));
    }

    public float o00oOo00() {
        return (float) this.f10987o00oOOoO;
    }

    public float o00oOo0O() {
        double d = this.f10986o00oOOo0;
        return (float) (d * d);
    }

    public final void o00oOo0o() {
        if (this.f10988o00oOo00) {
            return;
        }
        if (this.f10993o00oOoOO == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d = this.f10987o00oOOoO;
        if (d > 1.0d) {
            double d2 = this.f10986o00oOOo0;
            this.f10990o00oOo0o = (Math.sqrt((d * d) - 1.0d) * d2) + ((-d) * d2);
            double d3 = this.f10987o00oOOoO;
            double d4 = this.f10986o00oOOo0;
            this.f10992o00oOoO0 = ((-d3) * d4) - (Math.sqrt((d3 * d3) - 1.0d) * d4);
        } else if (d >= 0.0d && d < 1.0d) {
            this.f10991o00oOoO = Math.sqrt(1.0d - (d * d)) * this.f10986o00oOOo0;
        }
        this.f10988o00oOo00 = true;
    }

    public o00oo0OO o00oOoO(float f) {
        this.f10993o00oOoOO = f;
        return this;
    }

    public o00oo0OO o00oOoO0(@o0O0OO0(from = 0.0d) float f) {
        if (f >= 0.0f) {
            this.f10987o00oOOoO = f;
            this.f10988o00oOo00 = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public o00oo0OO o00oOoOO(@o0O0OO0(from = 0.0d, fromInclusive = false) float f) {
        if (f > 0.0f) {
            this.f10986o00oOOo0 = Math.sqrt(f);
            this.f10988o00oOo00 = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public void o00oOoOo(double d) {
        double abs = Math.abs(d);
        this.f10995o00oOooO = abs;
        this.f10989o00oOo0O = abs * 62.5d;
    }

    public o00oOOoO.o0O00000 o00oOoo0(double d, double d2, long j) {
        double cos;
        double d3;
        o00oOo0o();
        double d4 = j / 1000.0d;
        double d5 = d - this.f10993o00oOoOO;
        double d6 = this.f10987o00oOOoO;
        if (d6 > 1.0d) {
            double d7 = this.f10992o00oOoO0;
            double d8 = this.f10990o00oOo0o;
            double d9 = d5 - (((d7 * d5) - d2) / (d7 - d8));
            double d10 = ((d5 * d7) - d2) / (d7 - d8);
            d3 = (Math.pow(2.718281828459045d, this.f10990o00oOo0o * d4) * d10) + (Math.pow(2.718281828459045d, d7 * d4) * d9);
            double d11 = this.f10992o00oOoO0;
            double pow = Math.pow(2.718281828459045d, d11 * d4) * d9 * d11;
            double d12 = this.f10990o00oOo0o;
            cos = (Math.pow(2.718281828459045d, d12 * d4) * d10 * d12) + pow;
        } else if (d6 == 1.0d) {
            double d13 = this.f10986o00oOOo0;
            double d14 = (d13 * d5) + d2;
            double d15 = (d14 * d4) + d5;
            double pow2 = Math.pow(2.718281828459045d, (-d13) * d4) * d15;
            double pow3 = Math.pow(2.718281828459045d, (-this.f10986o00oOOo0) * d4) * d15;
            double d16 = this.f10986o00oOOo0;
            cos = (Math.pow(2.718281828459045d, (-d16) * d4) * d14) + (pow3 * (-d16));
            d3 = pow2;
        } else {
            double d17 = 1.0d / this.f10991o00oOoO;
            double d18 = this.f10986o00oOOo0;
            double d19 = ((d6 * d18 * d5) + d2) * d17;
            double sin = ((Math.sin(this.f10991o00oOoO * d4) * d19) + (Math.cos(this.f10991o00oOoO * d4) * d5)) * Math.pow(2.718281828459045d, (-d6) * d18 * d4);
            double d20 = this.f10986o00oOOo0;
            double d21 = this.f10987o00oOOoO;
            double pow4 = Math.pow(2.718281828459045d, (-d21) * d20 * d4);
            double d22 = this.f10991o00oOoO;
            double d23 = (-d22) * d5;
            double d24 = this.f10991o00oOoO;
            cos = (((Math.cos(d24 * d4) * d19 * d24) + (Math.sin(d22 * d4) * d23)) * pow4) + ((-d20) * sin * d21);
            d3 = sin;
        }
        o00oOOoO.o0O00000 o0o00000 = this.f10994o00oOoOo;
        o0o00000.f10962o00oOOo0 = (float) (d3 + this.f10993o00oOoOO);
        o0o00000.f10963o00oOOoO = (float) cos;
        return o0o00000;
    }

    public float o00oOooO() {
        return (float) this.f10993o00oOoOO;
    }
}
