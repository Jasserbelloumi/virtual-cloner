package o00ooO00;

import androidx.constraintlayout.widget.o00oOOo0;
import androidx.constraintlayout.widget.o00oOoO;
import java.util.LinkedHashMap;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o0O000o0 implements Comparable<o0O000o0> {

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static final String f8577o00ooOOo = "MotionPaths";

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final boolean f8578o00ooOo = false;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public static final boolean f8579o00ooOo0 = false;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public static final int f8580o00ooOoO = 0;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public static final int f8581o00ooOoo = 1;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public static final int f8582o00ooo0 = 3;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public static final int f8583o00ooo00 = 2;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public static final int f8584o00ooo0O = 4;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public static final int f8585o00ooo0o = 5;

    /* renamed from: o00oooO  reason: collision with root package name */
    public static final int f8586o00oooO = 1;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public static final int f8587o00oooOO = 2;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public static final int f8588o00oooOo = 3;

    /* renamed from: o00oooo0  reason: collision with root package name */
    public static String[] f8589o00oooo0 = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: o00oo  reason: collision with root package name */
    public float f8590o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f8591o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public o00oo.o00oOo00 f8592o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public float f8593o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public float f8594o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public float f8595o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public float f8596o00oo0oO;

    /* renamed from: o00ooO  reason: collision with root package name */
    public int f8597o00ooO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public float f8598o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public float f8599o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public int f8600o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public LinkedHashMap<String, o00oOOo0> f8601o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public double[] f8602o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public double[] f8603o00ooOO0;

    /* renamed from: o0O0o  reason: collision with root package name */
    public float f8604o0O0o;

    public o0O000o0() {
        this.f8591o00oo0O = 0;
        this.f8599o00ooO00 = Float.NaN;
        this.f8598o00ooO0 = Float.NaN;
        this.f8600o00ooO0O = o00oo0.f8111o00oOo0o;
        this.f8601o00ooO0o = new LinkedHashMap<>();
        this.f8597o00ooO = 0;
        this.f8603o00ooOO0 = new double[18];
        this.f8602o00ooOO = new double[18];
    }

    public o0O000o0(int i, int i2, o00ooO0 o00ooo02, o0O000o0 o0o000o0, o0O000o0 o0o000o02) {
        this.f8591o00oo0O = 0;
        this.f8599o00ooO00 = Float.NaN;
        this.f8598o00ooO0 = Float.NaN;
        this.f8600o00ooO0O = o00oo0.f8111o00oOo0o;
        this.f8601o00ooO0o = new LinkedHashMap<>();
        this.f8597o00ooO = 0;
        this.f8603o00ooOO0 = new double[18];
        this.f8602o00ooOO = new double[18];
        int i3 = o00ooo02.f8247o00ooo00;
        if (i3 == 1) {
            o00oo0O(o00ooo02, o0o000o0, o0o000o02);
        } else if (i3 != 2) {
            o00oo0O0(o00ooo02, o0o000o0, o0o000o02);
        } else {
            o00oo0Oo(i, i2, o00ooo02, o0o000o0, o0o000o02);
        }
    }

    public static final float o00oo(float f, float f2, float f3, float f4, float f5, float f6) {
        return ((f6 - f4) * f2) + ((f5 - f3) * f) + f4;
    }

    public static final float o0O0o(float f, float f2, float f3, float f4, float f5, float f6) {
        return (((f5 - f3) * f2) - ((f6 - f4) * f)) + f3;
    }

    public void o00oOOoO(o00oOoO.o00oOOo0 o00oooo02) {
        this.f8592o00oo0O0 = o00oo.o00oOo00.o00oOo00(o00oooo02.f2093o00oOo00.f2221o00oOo00);
        o00oOoO.o00oOo00 o00ooo002 = o00oooo02.f2093o00oOo00;
        this.f8600o00ooO0O = o00ooo002.f2225o00oOooO;
        this.f8599o00ooO00 = o00ooo002.f2224o00oOoO0;
        this.f8591o00oo0O = o00ooo002.f2222o00oOo0O;
        this.f8598o00ooO0 = o00oooo02.f2092o00oOOoO.f2229o00oOo0O;
        for (String str : o00oooo02.f2095o00oOo0o.keySet()) {
            o00oOOo0 o00oooo03 = o00oooo02.f2095o00oOo0o.get(str);
            if (o00oooo03.o00oOooO() != o00oOOo0.o00oOOoO.STRING_TYPE) {
                this.f8601o00ooO0o.put(str, o00oooo03);
            }
        }
    }

    public final boolean o00oOo0O(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    public void o00oOo0o(o0O000o0 o0o000o0, boolean[] zArr, String[] strArr, boolean z) {
        zArr[0] = zArr[0] | o00oOo0O(this.f8595o00oo0o0, o0o000o0.f8595o00oo0o0);
        zArr[1] = zArr[1] | o00oOo0O(this.f8594o00oo0o, o0o000o0.f8594o00oo0o) | z;
        zArr[2] = z | o00oOo0O(this.f8596o00oo0oO, o0o000o0.f8596o00oo0oO) | zArr[2];
        zArr[3] = zArr[3] | o00oOo0O(this.f8604o0O0o, o0o000o0.f8604o0O0o);
        zArr[4] = o00oOo0O(this.f8590o00oo, o0o000o0.f8590o00oo) | zArr[4];
    }

    public void o00oOoO(double[] dArr, int[] iArr) {
        float[] fArr = {this.f8595o00oo0o0, this.f8594o00oo0o, this.f8596o00oo0oO, this.f8604o0O0o, this.f8590o00oo, this.f8599o00ooO00};
        int i = 0;
        for (int i2 : iArr) {
            if (i2 < 6) {
                dArr[i] = fArr[i2];
                i++;
            }
        }
    }

    public void o00oOoOo(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f8604o0O0o;
        float f2 = this.f8590o00oo;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f3 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 3) {
                f = f3;
            } else if (i3 == 4) {
                f2 = f3;
            }
        }
        fArr[i] = f;
        fArr[i + 1] = f2;
    }

    public void o00oOoo0(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f8594o00oo0o;
        float f2 = this.f8596o00oo0oO;
        float f3 = this.f8604o0O0o;
        float f4 = this.f8590o00oo;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        fArr[i] = (f3 / 2.0f) + f + 0.0f;
        fArr[i + 1] = (f4 / 2.0f) + f2 + 0.0f;
    }

    @Override // java.lang.Comparable
    /* renamed from: o00oOooO */
    public int compareTo(@oo0oO0 o0O000o0 o0o000o0) {
        return Float.compare(this.f8595o00oo0o0, o0o000o0.f8595o00oo0o0);
    }

    public int o00oOooo(String str, double[] dArr, int i) {
        o00oOOo0 o00oooo02 = this.f8601o00ooO0o.get(str);
        if (o00oooo02.o00oOoO0() == 1) {
            dArr[i] = o00oooo02.o00oOo0O();
            return 1;
        }
        int o00oOoO02 = o00oooo02.o00oOoO0();
        float[] fArr = new float[o00oOoO02];
        o00oooo02.o00oOo0o(fArr);
        int i2 = 0;
        while (i2 < o00oOoO02) {
            dArr[i] = fArr[i2];
            i2++;
            i++;
        }
        return o00oOoO02;
    }

    public void o00oo0(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f8594o00oo0o;
        float f2 = this.f8596o00oo0oO;
        float f3 = this.f8604o0O0o;
        float f4 = this.f8590o00oo;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        float f6 = f3 + f;
        float f7 = f4 + f2;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        int i4 = i + 1;
        fArr[i] = f + 0.0f;
        int i5 = i4 + 1;
        fArr[i4] = f2 + 0.0f;
        int i6 = i5 + 1;
        fArr[i5] = f6 + 0.0f;
        int i7 = i6 + 1;
        fArr[i6] = f2 + 0.0f;
        int i8 = i7 + 1;
        fArr[i7] = f6 + 0.0f;
        int i9 = i8 + 1;
        fArr[i8] = f7 + 0.0f;
        fArr[i9] = f + 0.0f;
        fArr[i9 + 1] = f7 + 0.0f;
    }

    public int o00oo00O(String str) {
        return this.f8601o00ooO0o.get(str).o00oOoO0();
    }

    public void o00oo0O(o00ooO0 o00ooo02, o0O000o0 o0o000o0, o0O000o0 o0o000o02) {
        float f;
        float f2;
        float f3 = o00ooo02.f8130o00oOOo0 / 100.0f;
        this.f8593o00oo0Oo = f3;
        this.f8591o00oo0O = o00ooo02.f8240o00ooOO0;
        float f4 = Float.isNaN(o00ooo02.f8239o00ooOO) ? f3 : o00ooo02.f8239o00ooOO;
        float f5 = Float.isNaN(o00ooo02.f8241o00ooOOo) ? f3 : o00ooo02.f8241o00ooOOo;
        float f6 = o0o000o02.f8604o0O0o - o0o000o0.f8604o0O0o;
        float f7 = o0o000o02.f8590o00oo - o0o000o0.f8590o00oo;
        this.f8595o00oo0o0 = this.f8593o00oo0Oo;
        if (!Float.isNaN(o00ooo02.f8243o00ooOo0)) {
            f3 = o00ooo02.f8243o00ooOo0;
        }
        float f8 = o0o000o0.f8594o00oo0o;
        float f9 = o0o000o0.f8604o0O0o;
        float f10 = o0o000o0.f8596o00oo0oO;
        float f11 = o0o000o0.f8590o00oo;
        float f12 = ((o0o000o02.f8604o0O0o / 2.0f) + o0o000o02.f8594o00oo0o) - ((f9 / 2.0f) + f8);
        float f13 = ((o0o000o02.f8590o00oo / 2.0f) + o0o000o02.f8596o00oo0oO) - ((f11 / 2.0f) + f10);
        float f14 = f12 * f3;
        float f15 = (f6 * f4) / 2.0f;
        this.f8594o00oo0o = (int) ((f8 + f14) - f15);
        float f16 = f3 * f13;
        float f17 = (f7 * f5) / 2.0f;
        this.f8596o00oo0oO = (int) ((f10 + f16) - f17);
        this.f8604o0O0o = (int) (f9 + f);
        this.f8590o00oo = (int) (f11 + f2);
        float f18 = Float.isNaN(o00ooo02.f8242o00ooOo) ? 0.0f : o00ooo02.f8242o00ooOo;
        this.f8597o00ooO = 1;
        float f19 = (int) ((o0o000o0.f8594o00oo0o + f14) - f15);
        float f20 = (int) ((o0o000o0.f8596o00oo0oO + f16) - f17);
        this.f8594o00oo0o = f19 + ((-f13) * f18);
        this.f8596o00oo0oO = f20 + (f12 * f18);
        this.f8592o00oo0O0 = o00oo.o00oOo00.o00oOo00(o00ooo02.f8238o00ooO0o);
        this.f8600o00ooO0O = o00ooo02.f8237o00ooO;
    }

    public void o00oo0O0(o00ooO0 o00ooo02, o0O000o0 o0o000o0, o0O000o0 o0o000o02) {
        float f = o00ooo02.f8130o00oOOo0 / 100.0f;
        this.f8593o00oo0Oo = f;
        this.f8591o00oo0O = o00ooo02.f8240o00ooOO0;
        float f2 = Float.isNaN(o00ooo02.f8239o00ooOO) ? f : o00ooo02.f8239o00ooOO;
        float f3 = Float.isNaN(o00ooo02.f8241o00ooOOo) ? f : o00ooo02.f8241o00ooOOo;
        float f4 = o0o000o02.f8604o0O0o;
        float f5 = o0o000o0.f8604o0O0o;
        float f6 = f4 - f5;
        float f7 = o0o000o02.f8590o00oo;
        float f8 = o0o000o0.f8590o00oo;
        float f9 = f7 - f8;
        this.f8595o00oo0o0 = this.f8593o00oo0Oo;
        float f10 = o0o000o0.f8594o00oo0o;
        float f11 = o0o000o0.f8596o00oo0oO;
        float f12 = ((f4 / 2.0f) + o0o000o02.f8594o00oo0o) - ((f5 / 2.0f) + f10);
        float f13 = ((f7 / 2.0f) + o0o000o02.f8596o00oo0oO) - ((f8 / 2.0f) + f11);
        float f14 = f6 * f2;
        float f15 = f14 / 2.0f;
        this.f8594o00oo0o = (int) (((f12 * f) + f10) - f15);
        float f16 = (f13 * f) + f11;
        float f17 = f9 * f3;
        float f18 = f17 / 2.0f;
        this.f8596o00oo0oO = (int) (f16 - f18);
        this.f8604o0O0o = (int) (f5 + f14);
        this.f8590o00oo = (int) (f8 + f17);
        float f19 = Float.isNaN(o00ooo02.f8243o00ooOo0) ? f : o00ooo02.f8243o00ooOo0;
        float f20 = Float.isNaN(o00ooo02.f8245o00ooOoo) ? 0.0f : o00ooo02.f8245o00ooOoo;
        if (!Float.isNaN(o00ooo02.f8242o00ooOo)) {
            f = o00ooo02.f8242o00ooOo;
        }
        float f21 = Float.isNaN(o00ooo02.f8244o00ooOoO) ? 0.0f : o00ooo02.f8244o00ooOoO;
        this.f8597o00ooO = 2;
        this.f8594o00oo0o = (int) (((f21 * f13) + ((f19 * f12) + o0o000o0.f8594o00oo0o)) - f15);
        this.f8596o00oo0oO = (int) (((f13 * f) + ((f12 * f20) + o0o000o0.f8596o00oo0oO)) - f18);
        this.f8592o00oo0O0 = o00oo.o00oOo00.o00oOo00(o00ooo02.f8238o00ooO0o);
        this.f8600o00ooO0O = o00ooo02.f8237o00ooO;
    }

    public boolean o00oo0OO(String str) {
        return this.f8601o00ooO0o.containsKey(str);
    }

    public void o00oo0Oo(int i, int i2, o00ooO0 o00ooo02, o0O000o0 o0o000o0, o0O000o0 o0o000o02) {
        float f = o00ooo02.f8130o00oOOo0 / 100.0f;
        this.f8593o00oo0Oo = f;
        this.f8591o00oo0O = o00ooo02.f8240o00ooOO0;
        float f2 = Float.isNaN(o00ooo02.f8239o00ooOO) ? f : o00ooo02.f8239o00ooOO;
        float f3 = Float.isNaN(o00ooo02.f8241o00ooOOo) ? f : o00ooo02.f8241o00ooOOo;
        float f4 = o0o000o02.f8604o0O0o;
        float f5 = o0o000o0.f8604o0O0o;
        float f6 = f4 - f5;
        float f7 = o0o000o02.f8590o00oo;
        float f8 = o0o000o0.f8590o00oo;
        float f9 = f7 - f8;
        this.f8595o00oo0o0 = this.f8593o00oo0Oo;
        float f10 = o0o000o0.f8594o00oo0o;
        float f11 = o0o000o0.f8596o00oo0oO;
        float f12 = (f4 / 2.0f) + o0o000o02.f8594o00oo0o;
        float f13 = (f7 / 2.0f) + o0o000o02.f8596o00oo0oO;
        float f14 = f6 * f2;
        this.f8594o00oo0o = (int) ((((f12 - ((f5 / 2.0f) + f10)) * f) + f10) - (f14 / 2.0f));
        float f15 = f9 * f3;
        this.f8596o00oo0oO = (int) ((((f13 - ((f8 / 2.0f) + f11)) * f) + f11) - (f15 / 2.0f));
        this.f8604o0O0o = (int) (f5 + f14);
        this.f8590o00oo = (int) (f8 + f15);
        this.f8597o00ooO = 3;
        if (!Float.isNaN(o00ooo02.f8243o00ooOo0)) {
            this.f8594o00oo0o = (int) (o00ooo02.f8243o00ooOo0 * ((int) (i - this.f8604o0O0o)));
        }
        if (!Float.isNaN(o00ooo02.f8242o00ooOo)) {
            this.f8596o00oo0oO = (int) (o00ooo02.f8242o00ooOo * ((int) (i2 - this.f8590o00oo)));
        }
        this.f8592o00oo0O0 = o00oo.o00oOo00.o00oOo00(o00ooo02.f8238o00ooO0o);
        this.f8600o00ooO0O = o00ooo02.f8237o00ooO;
    }

    public void o00oo0o(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((0.0f * f4) / 2.0f);
        float f9 = f5 - ((0.0f * f6) / 2.0f);
        fArr[0] = (((f4 * 1.0f) + f8) * f) + ((1.0f - f) * f8) + 0.0f;
        fArr[1] = (((f6 * 1.0f) + f9) * f2) + ((1.0f - f2) * f9) + 0.0f;
    }

    public void o00oo0o0(float f, float f2, float f3, float f4) {
        this.f8594o00oo0o = f;
        this.f8596o00oo0oO = f2;
        this.f8604o0O0o = f3;
        this.f8590o00oo = f4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b9, code lost:
        if (java.lang.Float.isNaN(Float.NaN) == false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o00oo0oO(android.view.View r22, int[] r23, double[] r24, double[] r25, double[] r26) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o00ooO00.o0O000o0.o00oo0oO(android.view.View, int[], double[], double[], double[]):void");
    }
}
