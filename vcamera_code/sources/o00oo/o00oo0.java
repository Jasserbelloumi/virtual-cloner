package o00oo;

import java.util.Arrays;
/* loaded from: classes.dex */
public class o00oo0 {

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f7223o00oOoO = 0;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static String f7224o00oOoO0 = "Oscillator";

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f7225o00oOoOO = 1;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f7226o00oOoOo = 2;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f7227o00oOoo0 = 3;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final int f7228o00oOooo = 4;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final int f7229o00oo0 = 6;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final int f7230o00oo00O = 5;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public double[] f7233o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f7236o00oOooO;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public float[] f7231o00oOOo0 = new float[0];

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public double[] f7232o00oOOoO = new double[0];

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public double f7234o00oOo0O = 6.283185307179586d;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public boolean f7235o00oOo0o = false;

    public void o00oOOo0(double d, float f) {
        int length = this.f7231o00oOOo0.length + 1;
        int binarySearch = Arrays.binarySearch(this.f7232o00oOOoO, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.f7232o00oOOoO = Arrays.copyOf(this.f7232o00oOOoO, length);
        this.f7231o00oOOo0 = Arrays.copyOf(this.f7231o00oOOo0, length);
        this.f7233o00oOo00 = new double[length];
        double[] dArr = this.f7232o00oOOoO;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.f7232o00oOOoO[binarySearch] = d;
        this.f7231o00oOOo0[binarySearch] = f;
        this.f7235o00oOo0o = false;
    }

    public double o00oOOoO(double d) {
        if (d <= 0.0d) {
            d = 1.0E-5d;
        } else if (d >= 1.0d) {
            d = 0.999999d;
        }
        int binarySearch = Arrays.binarySearch(this.f7232o00oOOoO, d);
        if (binarySearch <= 0 && binarySearch != 0) {
            int i = (-binarySearch) - 1;
            float[] fArr = this.f7231o00oOOo0;
            float f = fArr[i];
            int i2 = i - 1;
            float f2 = fArr[i2];
            double d2 = f - f2;
            double[] dArr = this.f7232o00oOOoO;
            double d3 = dArr[i];
            double d4 = dArr[i2];
            double d5 = d2 / (d3 - d4);
            return (f2 - (d5 * d4)) + (d * d5);
        }
        return 0.0d;
    }

    public double o00oOo00(double d) {
        if (d < 0.0d) {
            d = 0.0d;
        } else if (d > 1.0d) {
            d = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.f7232o00oOOoO, d);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch != 0) {
            int i = (-binarySearch) - 1;
            float[] fArr = this.f7231o00oOOo0;
            float f = fArr[i];
            int i2 = i - 1;
            float f2 = fArr[i2];
            double d2 = f - f2;
            double[] dArr = this.f7232o00oOOoO;
            double d3 = dArr[i];
            double d4 = dArr[i2];
            double d5 = d2 / (d3 - d4);
            return ((((d * d) - (d4 * d4)) * d5) / 2.0d) + ((d - d4) * (f2 - (d5 * d4))) + this.f7233o00oOo00[i2];
        }
        return 0.0d;
    }

    public double o00oOo0O(double d) {
        double abs;
        switch (this.f7236o00oOooO) {
            case 1:
                return Math.signum(0.5d - (o00oOo00(d) % 1.0d));
            case 2:
                abs = Math.abs((((o00oOo00(d) * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((o00oOo00(d) * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((o00oOo00(d) * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(o00oOo00(d) * this.f7234o00oOo0O);
            case 6:
                double abs2 = 1.0d - Math.abs(((o00oOo00(d) * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            default:
                return Math.sin(o00oOo00(d) * this.f7234o00oOo0O);
        }
        return 1.0d - abs;
    }

    public void o00oOo0o() {
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        int i;
        int i2 = 0;
        double d = 0.0d;
        while (true) {
            if (i2 >= this.f7231o00oOOo0.length) {
                break;
            }
            d += fArr[i2];
            i2++;
        }
        double d2 = 0.0d;
        int i3 = 1;
        while (true) {
            if (i3 >= this.f7231o00oOOo0.length) {
                break;
            }
            double[] dArr = this.f7232o00oOOoO;
            d2 += (dArr[i3] - dArr[i3 - 1]) * ((fArr2[i] + fArr2[i3]) / 2.0f);
            i3++;
        }
        int i4 = 0;
        while (true) {
            float[] fArr4 = this.f7231o00oOOo0;
            if (i4 >= fArr4.length) {
                break;
            }
            fArr4[i4] = (float) (fArr4[i4] * (d / d2));
            i4++;
        }
        this.f7233o00oOo00[0] = 0.0d;
        int i5 = 1;
        while (true) {
            if (i5 >= this.f7231o00oOOo0.length) {
                this.f7235o00oOo0o = true;
                return;
            }
            int i6 = i5 - 1;
            double[] dArr2 = this.f7232o00oOOoO;
            double d3 = dArr2[i5] - dArr2[i6];
            double[] dArr3 = this.f7233o00oOo00;
            dArr3[i5] = (d3 * ((fArr3[i6] + fArr3[i5]) / 2.0f)) + dArr3[i6];
            i5++;
        }
    }

    public void o00oOoO0(int i) {
        this.f7236o00oOooO = i;
    }

    public double o00oOooO(double d) {
        switch (this.f7236o00oOooO) {
            case 1:
                return 0.0d;
            case 2:
                return Math.signum((((o00oOo00(d) * 4.0d) + 3.0d) % 4.0d) - 2.0d) * o00oOOoO(d) * 4.0d;
            case 3:
                return o00oOOoO(d) * 2.0d;
            case 4:
                return (-o00oOOoO(d)) * 2.0d;
            case 5:
                return Math.sin(o00oOo00(d) * this.f7234o00oOo0O) * o00oOOoO(d) * (-this.f7234o00oOo0O);
            case 6:
                return ((((o00oOo00(d) * 4.0d) + 2.0d) % 4.0d) - 2.0d) * o00oOOoO(d) * 4.0d;
            default:
                return Math.cos(o00oOo00(d) * this.f7234o00oOo0O) * o00oOOoO(d) * this.f7234o00oOo0O;
        }
    }

    public String toString() {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("pos =");
        o00oOOo02.append(Arrays.toString(this.f7232o00oOOoO));
        o00oOOo02.append(" period=");
        o00oOOo02.append(Arrays.toString(this.f7231o00oOOo0));
        return o00oOOo02.toString();
    }
}
