package o00oo;
/* loaded from: classes.dex */
public class o00oOoO extends o00oOOoO {

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final String f7219o00oOoO0 = "LinearCurveFit";

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public double[][] f7220o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public double f7221o00oOo0o;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public double[] f7222o00oOooO;

    public o00oOoO(double[] dArr, double[][] dArr2) {
        this.f7221o00oOo0o = Double.NaN;
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f7222o00oOooO = dArr;
        this.f7220o00oOo0O = dArr2;
        if (length2 <= 2) {
            return;
        }
        int i = 0;
        double d = 0.0d;
        while (true) {
            double d2 = d;
            if (i >= dArr.length) {
                this.f7221o00oOo0o = 0.0d;
                return;
            }
            double d3 = dArr2[i][0];
            if (i > 0) {
                Math.hypot(d3 - d, d3 - d2);
            }
            i++;
            d = d3;
        }
    }

    @Override // o00oo.o00oOOoO
    public double o00oOo00(double d, int i) {
        double[] dArr = this.f7222o00oOooO;
        int length = dArr.length;
        int i2 = 0;
        if (d <= dArr[0]) {
            return this.f7220o00oOo0O[0][i];
        }
        int i3 = length - 1;
        if (d >= dArr[i3]) {
            return this.f7220o00oOo0O[i3][i];
        }
        while (i2 < i3) {
            double[] dArr2 = this.f7222o00oOooO;
            double d2 = dArr2[i2];
            if (d == d2) {
                return this.f7220o00oOo0O[i2][i];
            }
            int i4 = i2 + 1;
            double d3 = dArr2[i4];
            if (d < d3) {
                double d4 = (d - d2) / (d3 - d2);
                double[][] dArr3 = this.f7220o00oOo0O;
                return (dArr3[i4][i] * d4) + ((1.0d - d4) * dArr3[i2][i]);
            }
            i2 = i4;
        }
        return 0.0d;
    }

    @Override // o00oo.o00oOOoO
    public void o00oOo0O(double d, float[] fArr) {
        double[] dArr = this.f7222o00oOooO;
        int length = dArr.length;
        int i = 0;
        int length2 = this.f7220o00oOo0O[0].length;
        if (d <= dArr[0]) {
            for (int i2 = 0; i2 < length2; i2++) {
                fArr[i2] = (float) this.f7220o00oOo0O[0][i2];
            }
            return;
        }
        int i3 = length - 1;
        if (d >= dArr[i3]) {
            while (i < length2) {
                fArr[i] = (float) this.f7220o00oOo0O[i3][i];
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < i3) {
            if (d == this.f7222o00oOooO[i4]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    fArr[i5] = (float) this.f7220o00oOo0O[i4][i5];
                }
            }
            double[] dArr2 = this.f7222o00oOooO;
            int i6 = i4 + 1;
            double d2 = dArr2[i6];
            if (d < d2) {
                double d3 = dArr2[i4];
                double d4 = (d - d3) / (d2 - d3);
                while (i < length2) {
                    double[][] dArr3 = this.f7220o00oOo0O;
                    fArr[i] = (float) ((dArr3[i6][i] * d4) + ((1.0d - d4) * dArr3[i4][i]));
                    i++;
                }
                return;
            }
            i4 = i6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r8 >= r3) goto L3;
     */
    @Override // o00oo.o00oOOoO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public double o00oOo0o(double r8, int r10) {
        /*
            r7 = this;
            double[] r0 = r7.f7222o00oOooO
            int r1 = r0.length
            r2 = 0
            r3 = r0[r2]
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 >= 0) goto Lc
        La:
            r8 = r3
            goto L15
        Lc:
            int r3 = r1 + (-1)
            r3 = r0[r3]
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L15
            goto La
        L15:
            int r0 = r1 + (-1)
            if (r2 >= r0) goto L35
            double[] r0 = r7.f7222o00oOooO
            int r3 = r2 + 1
            r4 = r0[r3]
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 > 0) goto L33
            r8 = r0[r2]
            double r4 = r4 - r8
            double[][] r8 = r7.f7220o00oOo0O
            r9 = r8[r2]
            r0 = r9[r10]
            r8 = r8[r3]
            r8 = r8[r10]
            double r8 = r8 - r0
            double r8 = r8 / r4
            return r8
        L33:
            r2 = r3
            goto L15
        L35:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o00oo.o00oOoO.o00oOo0o(double, int):double");
    }

    @Override // o00oo.o00oOOoO
    public double[] o00oOoO() {
        return this.f7222o00oOooO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r11 >= r4) goto L3;
     */
    @Override // o00oo.o00oOOoO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o00oOoO0(double r11, double[] r13) {
        /*
            r10 = this;
            double[] r0 = r10.f7222o00oOooO
            int r1 = r0.length
            double[][] r2 = r10.f7220o00oOo0O
            r3 = 0
            r2 = r2[r3]
            int r2 = r2.length
            r4 = r0[r3]
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 > 0) goto L11
        Lf:
            r11 = r4
            goto L1a
        L11:
            int r4 = r1 + (-1)
            r4 = r0[r4]
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 < 0) goto L1a
            goto Lf
        L1a:
            r0 = r3
        L1b:
            int r4 = r1 + (-1)
            if (r0 >= r4) goto L41
            double[] r4 = r10.f7222o00oOooO
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r8 > 0) goto L3f
            r11 = r4[r0]
            double r6 = r6 - r11
        L2c:
            if (r3 >= r2) goto L41
            double[][] r11 = r10.f7220o00oOo0O
            r12 = r11[r0]
            r8 = r12[r3]
            r11 = r11[r5]
            r11 = r11[r3]
            double r11 = r11 - r8
            double r11 = r11 / r6
            r13[r3] = r11
            int r3 = r3 + 1
            goto L2c
        L3f:
            r0 = r5
            goto L1b
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o00oo.o00oOoO.o00oOoO0(double, double[]):void");
    }

    public final double o00oOoOO(double d) {
        if (Double.isNaN(this.f7221o00oOo0o)) {
            return 0.0d;
        }
        double[] dArr = this.f7222o00oOooO;
        int length = dArr.length;
        if (d <= dArr[0]) {
            return 0.0d;
        }
        int i = length - 1;
        if (d >= dArr[i]) {
            return this.f7221o00oOo0o;
        }
        double d2 = 0.0d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        int i2 = 0;
        while (i2 < i) {
            double[] dArr2 = this.f7220o00oOo0O[i2];
            double d5 = dArr2[0];
            double d6 = dArr2[1];
            if (i2 > 0) {
                d2 += Math.hypot(d5 - d3, d6 - d4);
            }
            double[] dArr3 = this.f7222o00oOooO;
            double d7 = dArr3[i2];
            if (d == d7) {
                return d2;
            }
            int i3 = i2 + 1;
            double d8 = dArr3[i3];
            if (d < d8) {
                double d9 = (d - d7) / (d8 - d7);
                double[][] dArr4 = this.f7220o00oOo0O;
                double[] dArr5 = dArr4[i2];
                double d10 = dArr5[0];
                double[] dArr6 = dArr4[i3];
                double d11 = dArr6[0];
                double d12 = 1.0d - d9;
                return Math.hypot(d6 - ((dArr6[1] * d9) + (dArr5[1] * d12)), d5 - ((d11 * d9) + (d10 * d12))) + d2;
            }
            i2 = i3;
            d3 = d5;
            d4 = d6;
        }
        return 0.0d;
    }

    @Override // o00oo.o00oOOoO
    public void o00oOooO(double d, double[] dArr) {
        double[] dArr2 = this.f7222o00oOooO;
        int length = dArr2.length;
        int i = 0;
        int length2 = this.f7220o00oOo0O[0].length;
        if (d <= dArr2[0]) {
            for (int i2 = 0; i2 < length2; i2++) {
                dArr[i2] = this.f7220o00oOo0O[0][i2];
            }
            return;
        }
        int i3 = length - 1;
        if (d >= dArr2[i3]) {
            while (i < length2) {
                dArr[i] = this.f7220o00oOo0O[i3][i];
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < i3) {
            if (d == this.f7222o00oOooO[i4]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    dArr[i5] = this.f7220o00oOo0O[i4][i5];
                }
            }
            double[] dArr3 = this.f7222o00oOooO;
            int i6 = i4 + 1;
            double d2 = dArr3[i6];
            if (d < d2) {
                double d3 = dArr3[i4];
                double d4 = (d - d3) / (d2 - d3);
                while (i < length2) {
                    double[][] dArr4 = this.f7220o00oOo0O;
                    dArr[i] = (dArr4[i6][i] * d4) + ((1.0d - d4) * dArr4[i4][i]);
                    i++;
                }
                return;
            }
            i4 = i6;
        }
    }
}
