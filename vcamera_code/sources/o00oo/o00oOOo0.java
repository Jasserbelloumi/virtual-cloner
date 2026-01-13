package o00oo;

import java.util.Arrays;
/* loaded from: classes.dex */
public class o00oOOo0 extends o00oOOoO {

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f7155o00oOo0o = 1;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f7156o00oOoO = 3;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f7157o00oOoO0 = 2;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f7158o00oOoOO = 0;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f7159o00oOoOo = 1;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f7160o00oOoo0 = 2;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final int f7161o00oOooo = 3;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public C0103o00oOOo0[] f7162o00oOo0O;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final double[] f7163o00oOooO;

    /* renamed from: o00oo.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0103o00oOOo0 {

        /* renamed from: o00oo0o  reason: collision with root package name */
        public static double[] f7164o00oo0o = new double[91];

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public static final String f7165o00oo0o0 = "Arc";

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public static final double f7166o00oo0oO = 0.001d;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public double[] f7167o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public double f7168o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public double f7169o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public double f7170o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public double f7171o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public double f7172o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public double f7173o00oOoO0;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public double f7174o00oOoOO;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public double f7175o00oOoOo;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public double f7176o00oOoo0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public double f7177o00oOooO;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public double f7178o00oOooo;

        /* renamed from: o00oo0  reason: collision with root package name */
        public double f7179o00oo0;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public double f7180o00oo00O;

        /* renamed from: o00oo0O  reason: collision with root package name */
        public boolean f7181o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public double f7182o00oo0O0;

        /* renamed from: o00oo0OO  reason: collision with root package name */
        public double f7183o00oo0OO;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public boolean f7184o00oo0Oo;

        public C0103o00oOOo0(int i, double d, double d2, double d3, double d4, double d5, double d6) {
            this.f7184o00oo0Oo = false;
            this.f7181o00oo0O = i == 1;
            this.f7169o00oOo00 = d;
            this.f7177o00oOooO = d2;
            this.f7174o00oOoOO = 1.0d / (d2 - d);
            if (3 == i) {
                this.f7184o00oo0Oo = true;
            }
            double d7 = d5 - d3;
            double d8 = d6 - d4;
            if (!this.f7184o00oo0Oo && Math.abs(d7) >= 0.001d && Math.abs(d8) >= 0.001d) {
                this.f7167o00oOOo0 = new double[101];
                boolean z = this.f7181o00oo0O;
                this.f7175o00oOoOo = d7 * (z ? -1 : 1);
                this.f7176o00oOoo0 = d8 * (z ? 1 : -1);
                this.f7178o00oOooo = z ? d5 : d3;
                this.f7180o00oo00O = z ? d4 : d6;
                o00oOOo0(d3, d4, d5, d6);
                this.f7179o00oo0 = this.f7168o00oOOoO * this.f7174o00oOoOO;
                return;
            }
            this.f7184o00oo0Oo = true;
            this.f7170o00oOo0O = d3;
            this.f7171o00oOo0o = d5;
            this.f7173o00oOoO0 = d4;
            this.f7172o00oOoO = d6;
            double hypot = Math.hypot(d8, d7);
            this.f7168o00oOOoO = hypot;
            this.f7179o00oo0 = hypot * this.f7174o00oOoOO;
            double d9 = this.f7177o00oOooO;
            double d10 = this.f7169o00oOo00;
            this.f7178o00oOooo = d7 / (d9 - d10);
            this.f7180o00oo00O = d8 / (d9 - d10);
        }

        public final void o00oOOo0(double d, double d2, double d3, double d4) {
            double[] dArr;
            double[] dArr2;
            double d5;
            double d6 = d3 - d;
            double d7 = d2 - d4;
            int i = 0;
            double d8 = 0.0d;
            double d9 = 0.0d;
            double d10 = 0.0d;
            while (true) {
                if (i >= f7164o00oo0o.length) {
                    break;
                }
                double d11 = d8;
                double radians = Math.toRadians((i * 90.0d) / (dArr.length - 1));
                double sin = Math.sin(radians) * d6;
                double cos = Math.cos(radians) * d7;
                if (i > 0) {
                    d5 = Math.hypot(sin - d9, cos - d10) + d11;
                    f7164o00oo0o[i] = d5;
                } else {
                    d5 = d11;
                }
                i++;
                d10 = cos;
                d8 = d5;
                d9 = sin;
            }
            double d12 = d8;
            this.f7168o00oOOoO = d12;
            int i2 = 0;
            while (true) {
                double[] dArr3 = f7164o00oo0o;
                if (i2 >= dArr3.length) {
                    break;
                }
                dArr3[i2] = dArr3[i2] / d12;
                i2++;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= this.f7167o00oOOo0.length) {
                    return;
                }
                double length = i3 / (dArr2.length - 1);
                int binarySearch = Arrays.binarySearch(f7164o00oo0o, length);
                if (binarySearch >= 0) {
                    this.f7167o00oOOo0[i3] = binarySearch / (f7164o00oo0o.length - 1);
                } else if (binarySearch == -1) {
                    this.f7167o00oOOo0[i3] = 0.0d;
                } else {
                    int i4 = -binarySearch;
                    int i5 = i4 - 2;
                    double[] dArr4 = f7164o00oo0o;
                    double d13 = dArr4[i5];
                    this.f7167o00oOOo0[i3] = (((length - d13) / (dArr4[i4 - 1] - d13)) + i5) / (dArr4.length - 1);
                }
                i3++;
            }
        }

        public double o00oOOoO() {
            double d = this.f7175o00oOoOo * this.f7182o00oo0O0;
            double hypot = this.f7179o00oo0 / Math.hypot(d, (-this.f7176o00oOoo0) * this.f7183o00oo0OO);
            if (this.f7181o00oo0O) {
                d = -d;
            }
            return d * hypot;
        }

        public double o00oOo00() {
            double d = this.f7175o00oOoOo * this.f7182o00oo0O0;
            double d2 = (-this.f7176o00oOoo0) * this.f7183o00oo0OO;
            double hypot = this.f7179o00oo0 / Math.hypot(d, d2);
            return this.f7181o00oo0O ? (-d2) * hypot : d2 * hypot;
        }

        public double o00oOo0O(double d) {
            return this.f7180o00oo00O;
        }

        public double o00oOo0o(double d) {
            double d2 = (d - this.f7169o00oOo00) * this.f7174o00oOoOO;
            double d3 = this.f7170o00oOo0O;
            return ((this.f7171o00oOo0o - d3) * d2) + d3;
        }

        public double o00oOoO() {
            return (this.f7175o00oOoOo * this.f7183o00oo0OO) + this.f7178o00oOooo;
        }

        public double o00oOoO0(double d) {
            double d2 = (d - this.f7169o00oOo00) * this.f7174o00oOoOO;
            double d3 = this.f7173o00oOoO0;
            return ((this.f7172o00oOoO - d3) * d2) + d3;
        }

        public double o00oOoOO() {
            return (this.f7176o00oOoo0 * this.f7182o00oo0O0) + this.f7180o00oo00O;
        }

        public double o00oOoOo(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f7167o00oOOo0;
            double length = d * (dArr.length - 1);
            int i = (int) length;
            double d2 = length - i;
            double d3 = dArr[i];
            return ((dArr[i + 1] - d3) * d2) + d3;
        }

        public void o00oOoo0(double d) {
            double o00oOoOo2 = o00oOoOo((this.f7181o00oo0O ? this.f7177o00oOooO - d : d - this.f7169o00oOo00) * this.f7174o00oOoOO) * 1.5707963267948966d;
            this.f7183o00oo0OO = Math.sin(o00oOoOo2);
            this.f7182o00oo0O0 = Math.cos(o00oOoOo2);
        }

        public double o00oOooO(double d) {
            return this.f7178o00oOooo;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r5 == 1) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o00oOOo0(int[] r25, double[] r26, double[][] r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            r24.<init>()
            r0.f7163o00oOooO = r1
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            o00oo.o00oOOo0$o00oOOo0[] r2 = new o00oo.o00oOOo0.C0103o00oOOo0[r2]
            r0.f7162o00oOo0O = r2
            r2 = 0
            r4 = r2
            r5 = r3
            r6 = r5
        L14:
            o00oo.o00oOOo0$o00oOOo0[] r7 = r0.f7162o00oOo0O
            int r8 = r7.length
            if (r4 >= r8) goto L4d
            r8 = r25[r4]
            r9 = 3
            r10 = 2
            if (r8 == 0) goto L2d
            if (r8 == r3) goto L2a
            if (r8 == r10) goto L28
            if (r8 == r9) goto L26
            goto L2e
        L26:
            if (r5 != r3) goto L2a
        L28:
            r5 = r10
            goto L2b
        L2a:
            r5 = r3
        L2b:
            r6 = r5
            goto L2e
        L2d:
            r6 = r9
        L2e:
            o00oo.o00oOOo0$o00oOOo0 r22 = new o00oo.o00oOOo0$o00oOOo0
            r10 = r1[r4]
            int r23 = r4 + 1
            r12 = r1[r23]
            r8 = r27[r4]
            r14 = r8[r2]
            r16 = r8[r3]
            r8 = r27[r23]
            r18 = r8[r2]
            r20 = r8[r3]
            r8 = r22
            r9 = r6
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r22
            r4 = r23
            goto L14
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o00oo.o00oOOo0.<init>(int[], double[], double[][]):void");
    }

    @Override // o00oo.o00oOOoO
    public double o00oOo00(double d, int i) {
        C0103o00oOOo0[] c0103o00oOOo0Arr = this.f7162o00oOo0O;
        int i2 = 0;
        double d2 = c0103o00oOOo0Arr[0].f7169o00oOo00;
        if (d < d2) {
            d = d2;
        } else if (d > c0103o00oOOo0Arr[c0103o00oOOo0Arr.length - 1].f7177o00oOooO) {
            d = c0103o00oOOo0Arr[c0103o00oOOo0Arr.length - 1].f7177o00oOooO;
        }
        while (true) {
            C0103o00oOOo0[] c0103o00oOOo0Arr2 = this.f7162o00oOo0O;
            if (i2 >= c0103o00oOOo0Arr2.length) {
                return Double.NaN;
            }
            C0103o00oOOo0 c0103o00oOOo0 = c0103o00oOOo0Arr2[i2];
            if (d <= c0103o00oOOo0.f7177o00oOooO) {
                if (c0103o00oOOo0.f7184o00oo0Oo) {
                    return i == 0 ? c0103o00oOOo0.o00oOo0o(d) : c0103o00oOOo0.o00oOoO0(d);
                }
                c0103o00oOOo0.o00oOoo0(d);
                C0103o00oOOo0[] c0103o00oOOo0Arr3 = this.f7162o00oOo0O;
                return i == 0 ? c0103o00oOOo0Arr3[i2].o00oOoO() : c0103o00oOOo0Arr3[i2].o00oOoOO();
            }
            i2++;
        }
    }

    @Override // o00oo.o00oOOoO
    public void o00oOo0O(double d, float[] fArr) {
        C0103o00oOOo0[] c0103o00oOOo0Arr = this.f7162o00oOo0O;
        double d2 = c0103o00oOOo0Arr[0].f7169o00oOo00;
        if (d < d2) {
            d = d2;
        } else if (d > c0103o00oOOo0Arr[c0103o00oOOo0Arr.length - 1].f7177o00oOooO) {
            d = c0103o00oOOo0Arr[c0103o00oOOo0Arr.length - 1].f7177o00oOooO;
        }
        int i = 0;
        while (true) {
            C0103o00oOOo0[] c0103o00oOOo0Arr2 = this.f7162o00oOo0O;
            if (i >= c0103o00oOOo0Arr2.length) {
                return;
            }
            C0103o00oOOo0 c0103o00oOOo0 = c0103o00oOOo0Arr2[i];
            if (d <= c0103o00oOOo0.f7177o00oOooO) {
                if (c0103o00oOOo0.f7184o00oo0Oo) {
                    fArr[0] = (float) c0103o00oOOo0.o00oOo0o(d);
                    fArr[1] = (float) this.f7162o00oOo0O[i].o00oOoO0(d);
                    return;
                }
                c0103o00oOOo0.o00oOoo0(d);
                fArr[0] = (float) this.f7162o00oOo0O[i].o00oOoO();
                fArr[1] = (float) this.f7162o00oOo0O[i].o00oOoOO();
                return;
            }
            i++;
        }
    }

    @Override // o00oo.o00oOOoO
    public double o00oOo0o(double d, int i) {
        C0103o00oOOo0[] c0103o00oOOo0Arr = this.f7162o00oOo0O;
        int i2 = 0;
        double d2 = c0103o00oOOo0Arr[0].f7169o00oOo00;
        if (d < d2) {
            d = d2;
        }
        if (d > c0103o00oOOo0Arr[c0103o00oOOo0Arr.length - 1].f7177o00oOooO) {
            d = c0103o00oOOo0Arr[c0103o00oOOo0Arr.length - 1].f7177o00oOooO;
        }
        while (true) {
            C0103o00oOOo0[] c0103o00oOOo0Arr2 = this.f7162o00oOo0O;
            if (i2 >= c0103o00oOOo0Arr2.length) {
                return Double.NaN;
            }
            C0103o00oOOo0 c0103o00oOOo0 = c0103o00oOOo0Arr2[i2];
            if (d <= c0103o00oOOo0.f7177o00oOooO) {
                if (c0103o00oOOo0.f7184o00oo0Oo) {
                    return i == 0 ? c0103o00oOOo0.o00oOooO(d) : c0103o00oOOo0.o00oOo0O(d);
                }
                c0103o00oOOo0.o00oOoo0(d);
                C0103o00oOOo0[] c0103o00oOOo0Arr3 = this.f7162o00oOo0O;
                return i == 0 ? c0103o00oOOo0Arr3[i2].o00oOOoO() : c0103o00oOOo0Arr3[i2].o00oOo00();
            }
            i2++;
        }
    }

    @Override // o00oo.o00oOOoO
    public double[] o00oOoO() {
        return this.f7163o00oOooO;
    }

    @Override // o00oo.o00oOOoO
    public void o00oOoO0(double d, double[] dArr) {
        C0103o00oOOo0[] c0103o00oOOo0Arr = this.f7162o00oOo0O;
        double d2 = c0103o00oOOo0Arr[0].f7169o00oOo00;
        if (d < d2) {
            d = d2;
        } else if (d > c0103o00oOOo0Arr[c0103o00oOOo0Arr.length - 1].f7177o00oOooO) {
            d = c0103o00oOOo0Arr[c0103o00oOOo0Arr.length - 1].f7177o00oOooO;
        }
        int i = 0;
        while (true) {
            C0103o00oOOo0[] c0103o00oOOo0Arr2 = this.f7162o00oOo0O;
            if (i >= c0103o00oOOo0Arr2.length) {
                return;
            }
            C0103o00oOOo0 c0103o00oOOo0 = c0103o00oOOo0Arr2[i];
            if (d <= c0103o00oOOo0.f7177o00oOooO) {
                if (c0103o00oOOo0.f7184o00oo0Oo) {
                    dArr[0] = c0103o00oOOo0.o00oOooO(d);
                    dArr[1] = this.f7162o00oOo0O[i].o00oOo0O(d);
                    return;
                }
                c0103o00oOOo0.o00oOoo0(d);
                dArr[0] = this.f7162o00oOo0O[i].o00oOOoO();
                dArr[1] = this.f7162o00oOo0O[i].o00oOo00();
                return;
            }
            i++;
        }
    }

    @Override // o00oo.o00oOOoO
    public void o00oOooO(double d, double[] dArr) {
        C0103o00oOOo0[] c0103o00oOOo0Arr = this.f7162o00oOo0O;
        double d2 = c0103o00oOOo0Arr[0].f7169o00oOo00;
        if (d < d2) {
            d = d2;
        }
        if (d > c0103o00oOOo0Arr[c0103o00oOOo0Arr.length - 1].f7177o00oOooO) {
            d = c0103o00oOOo0Arr[c0103o00oOOo0Arr.length - 1].f7177o00oOooO;
        }
        int i = 0;
        while (true) {
            C0103o00oOOo0[] c0103o00oOOo0Arr2 = this.f7162o00oOo0O;
            if (i >= c0103o00oOOo0Arr2.length) {
                return;
            }
            C0103o00oOOo0 c0103o00oOOo0 = c0103o00oOOo0Arr2[i];
            if (d <= c0103o00oOOo0.f7177o00oOooO) {
                if (c0103o00oOOo0.f7184o00oo0Oo) {
                    dArr[0] = c0103o00oOOo0.o00oOo0o(d);
                    dArr[1] = this.f7162o00oOo0O[i].o00oOoO0(d);
                    return;
                }
                c0103o00oOOo0.o00oOoo0(d);
                dArr[0] = this.f7162o00oOo0O[i].o00oOoO();
                dArr[1] = this.f7162o00oOo0O[i].o00oOoOO();
                return;
            }
            i++;
        }
    }
}
