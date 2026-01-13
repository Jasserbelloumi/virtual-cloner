package o00oo;

import java.lang.reflect.Array;
/* loaded from: classes.dex */
public class o00oOo0O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public int f7207o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public o00oOOo0[][] f7208o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f7209o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public double f7210o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public double[][] f7211o00oOo0o;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public double[] f7212o00oOooO;

    /* loaded from: classes.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final double f7213o00oOo0O = 0.3333333333333333d;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final double f7214o00oOo0o = 0.5d;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public double f7215o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public double f7216o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public double f7217o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public double f7218o00oOooO;

        public o00oOOo0(double d, double d2, double d3, double d4) {
            this.f7215o00oOOo0 = d;
            this.f7216o00oOOoO = d2;
            this.f7217o00oOo00 = d3;
            this.f7218o00oOooO = d4;
        }

        public double o00oOOo0(double d) {
            return (((((this.f7218o00oOooO * d) + this.f7217o00oOo00) * d) + this.f7216o00oOOoO) * d) + this.f7215o00oOOo0;
        }

        public double o00oOOoO(double d) {
            return (((this.f7217o00oOo00 * 0.5d) + (this.f7218o00oOooO * 0.3333333333333333d * d)) * d) + this.f7216o00oOOoO;
        }
    }

    public o00oOo0O() {
    }

    public o00oOo0O(double[][] dArr) {
        o00oOoO0(dArr);
    }

    public static o00oOOo0[] o00oOOoO(int i, double[] dArr) {
        double[] dArr2 = new double[i];
        double[] dArr3 = new double[i];
        double[] dArr4 = new double[i];
        int i2 = i - 1;
        int i3 = 0;
        dArr2[0] = 0.5d;
        int i4 = 1;
        for (int i5 = 1; i5 < i2; i5++) {
            dArr2[i5] = 1.0d / (4.0d - dArr2[i5 - 1]);
        }
        int i6 = i2 - 1;
        dArr2[i2] = 1.0d / (2.0d - dArr2[i6]);
        dArr3[0] = (dArr[1] - dArr[0]) * 3.0d * dArr2[0];
        while (i4 < i2) {
            int i7 = i4 + 1;
            int i8 = i4 - 1;
            dArr3[i4] = (((dArr[i7] - dArr[i8]) * 3.0d) - dArr3[i8]) * dArr2[i4];
            i4 = i7;
        }
        double d = (((dArr[i2] - dArr[i6]) * 3.0d) - dArr3[i6]) * dArr2[i2];
        dArr3[i2] = d;
        dArr4[i2] = d;
        while (i6 >= 0) {
            dArr4[i6] = dArr3[i6] - (dArr2[i6] * dArr4[i6 + 1]);
            i6--;
        }
        o00oOOo0[] o00oooo0Arr = new o00oOOo0[i2];
        while (i3 < i2) {
            double d2 = dArr[i3];
            double d3 = dArr4[i3];
            int i9 = i3 + 1;
            double d4 = dArr[i9];
            double d5 = dArr4[i9];
            o00oooo0Arr[i3] = new o00oOOo0((float) d2, d3, (((d4 - d2) * 3.0d) - (d3 * 2.0d)) - d5, ((d2 - d4) * 2.0d) + d3 + d5);
            i3 = i9;
        }
        return o00oooo0Arr;
    }

    public double o00oOOo0(o00oOOo0[] o00oooo0Arr) {
        int i;
        int length = o00oooo0Arr.length;
        double[] dArr = new double[o00oooo0Arr.length];
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        while (true) {
            i = 0;
            if (d2 >= 1.0d) {
                break;
            }
            double d4 = 0.0d;
            while (i < o00oooo0Arr.length) {
                double d5 = dArr[i];
                double o00oOOo02 = o00oooo0Arr[i].o00oOOo0(d2);
                dArr[i] = o00oOOo02;
                double d6 = d5 - o00oOOo02;
                d4 += d6 * d6;
                i++;
            }
            if (d2 > 0.0d) {
                d3 += Math.sqrt(d4);
            }
            d2 += 0.1d;
        }
        while (i < o00oooo0Arr.length) {
            double d7 = dArr[i];
            double o00oOOo03 = o00oooo0Arr[i].o00oOOo0(1.0d);
            dArr[i] = o00oOOo03;
            double d8 = d7 - o00oOOo03;
            d += d8 * d8;
            i++;
        }
        return Math.sqrt(d) + d3;
    }

    public double o00oOo00(double d, int i) {
        double[] dArr;
        double d2 = d * this.f7210o00oOo0O;
        int i2 = 0;
        while (true) {
            dArr = this.f7212o00oOooO;
            if (i2 >= dArr.length - 1) {
                break;
            }
            double d3 = dArr[i2];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            i2++;
        }
        return this.f7208o00oOOoO[i][i2].o00oOOo0(d2 / dArr[i2]);
    }

    public void o00oOo0O(double d, float[] fArr) {
        double d2 = d * this.f7210o00oOo0O;
        int i = 0;
        while (true) {
            double[] dArr = this.f7212o00oOooO;
            if (i >= dArr.length - 1) {
                break;
            }
            double d3 = dArr[i];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            i++;
        }
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr[i2] = (float) this.f7208o00oOOoO[i2][i].o00oOOo0(d2 / this.f7212o00oOooO[i]);
        }
    }

    public void o00oOo0o(double d, double[] dArr) {
        double d2 = d * this.f7210o00oOo0O;
        int i = 0;
        while (true) {
            double[] dArr2 = this.f7212o00oOooO;
            if (i >= dArr2.length - 1) {
                break;
            }
            double d3 = dArr2[i];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            i++;
        }
        for (int i2 = 0; i2 < dArr.length; i2++) {
            dArr[i2] = this.f7208o00oOOoO[i2][i].o00oOOoO(d2 / this.f7212o00oOooO[i]);
        }
    }

    public void o00oOoO0(double[][] dArr) {
        int i;
        int length = dArr[0].length;
        this.f7209o00oOo00 = length;
        int length2 = dArr.length;
        this.f7207o00oOOo0 = length2;
        this.f7211o00oOo0o = (double[][]) Array.newInstance(Double.TYPE, length, length2);
        this.f7208o00oOOoO = new o00oOOo0[this.f7209o00oOo00];
        for (int i2 = 0; i2 < this.f7209o00oOo00; i2++) {
            for (int i3 = 0; i3 < this.f7207o00oOOo0; i3++) {
                this.f7211o00oOo0o[i2][i3] = dArr[i3][i2];
            }
        }
        int i4 = 0;
        while (true) {
            i = this.f7209o00oOo00;
            if (i4 >= i) {
                break;
            }
            o00oOOo0[][] o00oooo0Arr = this.f7208o00oOOoO;
            double[] dArr2 = this.f7211o00oOo0o[i4];
            o00oooo0Arr[i4] = o00oOOoO(dArr2.length, dArr2);
            i4++;
        }
        this.f7212o00oOooO = new double[this.f7207o00oOOo0 - 1];
        this.f7210o00oOo0O = 0.0d;
        o00oOOo0[] o00oooo0Arr2 = new o00oOOo0[i];
        for (int i5 = 0; i5 < this.f7212o00oOooO.length; i5++) {
            for (int i6 = 0; i6 < this.f7209o00oOo00; i6++) {
                o00oooo0Arr2[i6] = this.f7208o00oOOoO[i6][i5];
            }
            double d = this.f7210o00oOo0O;
            double[] dArr3 = this.f7212o00oOooO;
            double o00oOOo02 = o00oOOo0(o00oooo0Arr2);
            dArr3[i5] = o00oOOo02;
            this.f7210o00oOo0O = d + o00oOOo02;
        }
    }

    public void o00oOooO(double d, double[] dArr) {
        double d2 = d * this.f7210o00oOo0O;
        int i = 0;
        while (true) {
            double[] dArr2 = this.f7212o00oOooO;
            if (i >= dArr2.length - 1) {
                break;
            }
            double d3 = dArr2[i];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            i++;
        }
        for (int i2 = 0; i2 < dArr.length; i2++) {
            dArr[i2] = this.f7208o00oOOoO[i2][i].o00oOOo0(d2 / this.f7212o00oOooO[i]);
        }
    }
}
