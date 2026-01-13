package o00oo;
/* loaded from: classes.dex */
public abstract class o00oOOoO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f7185o00oOOo0 = 0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f7186o00oOOoO = 1;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f7187o00oOo00 = 2;

    /* loaded from: classes.dex */
    public static class o00oOOo0 extends o00oOOoO {

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public double[] f7188o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public double f7189o00oOooO;

        public o00oOOo0(double d, double[] dArr) {
            this.f7189o00oOooO = d;
            this.f7188o00oOo0O = dArr;
        }

        @Override // o00oo.o00oOOoO
        public double o00oOo00(double d, int i) {
            return this.f7188o00oOo0O[i];
        }

        @Override // o00oo.o00oOOoO
        public void o00oOo0O(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.f7188o00oOo0O;
                if (i >= dArr.length) {
                    return;
                }
                fArr[i] = (float) dArr[i];
                i++;
            }
        }

        @Override // o00oo.o00oOOoO
        public double o00oOo0o(double d, int i) {
            return 0.0d;
        }

        @Override // o00oo.o00oOOoO
        public double[] o00oOoO() {
            return new double[]{this.f7189o00oOooO};
        }

        @Override // o00oo.o00oOOoO
        public void o00oOoO0(double d, double[] dArr) {
            for (int i = 0; i < this.f7188o00oOo0O.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        @Override // o00oo.o00oOOoO
        public void o00oOooO(double d, double[] dArr) {
            double[] dArr2 = this.f7188o00oOo0O;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }
    }

    public static o00oOOoO o00oOOo0(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        return i != 0 ? i != 2 ? new o00oOoO(dArr, dArr2) : new o00oOOo0(dArr[0], dArr2[0]) : new o00oo00O(dArr, dArr2);
    }

    public static o00oOOoO o00oOOoO(int[] iArr, double[] dArr, double[][] dArr2) {
        return new o00oo.o00oOOo0(iArr, dArr, dArr2);
    }

    public abstract double o00oOo00(double d, int i);

    public abstract void o00oOo0O(double d, float[] fArr);

    public abstract double o00oOo0o(double d, int i);

    public abstract double[] o00oOoO();

    public abstract void o00oOoO0(double d, double[] dArr);

    public abstract void o00oOooO(double d, double[] dArr);
}
