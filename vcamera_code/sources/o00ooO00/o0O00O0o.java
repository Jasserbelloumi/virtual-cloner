package o00ooO00;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
/* loaded from: classes.dex */
public abstract class o0O00O0o {

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final String f8647o00oOoo0 = "SplineSet";

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final int f8648o00oOooo = 0;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final int f8649o00oo0 = 2;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final int f8650o00oo00O = 1;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static float f8651o00oo0OO = 6.2831855f;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public o00oo.o00oOOoO f8652o00oOOo0;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f8655o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public String f8656o00oOo0o;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public long f8659o00oOoOO;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f8653o00oOOoO = 0;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int[] f8654o00oOo00 = new int[10];

    /* renamed from: o00oOooO  reason: collision with root package name */
    public float[][] f8661o00oOooO = (float[][]) Array.newInstance(Float.TYPE, 10, 3);

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public float[] f8658o00oOoO0 = new float[3];

    /* renamed from: o00oOoO  reason: collision with root package name */
    public boolean f8657o00oOoO = false;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public float f8660o00oOoOo = Float.NaN;

    /* loaded from: classes.dex */
    public static class o00oOOo0 extends o0O00O0o {
        @Override // o00ooO00.o0O00O0o
        public boolean o00oOoO0(View view, float f, long j, o00ooO00.o00oo0O0 o00oo0o02) {
            view.setAlpha(o00oOOoO(f, j, view, o00oo0o02));
            return this.f8657o00oOoO;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO extends o0O00O0o {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public SparseArray<androidx.constraintlayout.widget.o00oOOo0> f8662o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public String f8663o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public SparseArray<float[]> f8664o00oo0Oo = new SparseArray<>();

        /* renamed from: o00oo0o  reason: collision with root package name */
        public float[] f8665o00oo0o;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public float[] f8666o00oo0o0;

        public o00oOOoO(String str, SparseArray<androidx.constraintlayout.widget.o00oOOo0> sparseArray) {
            this.f8663o00oo0O0 = str.split(",")[1];
            this.f8662o00oo0O = sparseArray;
        }

        @Override // o00ooO00.o0O00O0o
        public void o00oOo0o(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // o00ooO00.o0O00O0o
        public boolean o00oOoO0(View view, float f, long j, o00ooO00.o00oo0O0 o00oo0o02) {
            this.f8652o00oOOo0.o00oOo0O(f, this.f8666o00oo0o0);
            float[] fArr = this.f8666o00oo0o0;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = j - this.f8659o00oOoOO;
            if (Float.isNaN(this.f8660o00oOoOo)) {
                float o00oOOo02 = o00oo0o02.o00oOOo0(view, this.f8663o00oo0O0, 0);
                this.f8660o00oOoOo = o00oOOo02;
                if (Float.isNaN(o00oOOo02)) {
                    this.f8660o00oOoOo = 0.0f;
                }
            }
            float f4 = (float) ((((j2 * 1.0E-9d) * f2) + this.f8660o00oOoOo) % 1.0d);
            this.f8660o00oOoOo = f4;
            this.f8659o00oOoOO = j;
            float o00oOOo03 = o00oOOo0(f4);
            this.f8657o00oOoO = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.f8665o00oo0o;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z = this.f8657o00oOoO;
                float f5 = this.f8666o00oo0o0[i];
                this.f8657o00oOoO = z | (((double) f5) != 0.0d);
                fArr2[i] = (f5 * o00oOOo03) + f3;
                i++;
            }
            this.f8662o00oo0O.valueAt(0).o00oo00O(view, this.f8665o00oo0o);
            if (f2 != 0.0f) {
                this.f8657o00oOoO = true;
            }
            return this.f8657o00oOoO;
        }

        @Override // o00ooO00.o0O00O0o
        public void o00oOoOo(int i) {
            float[] fArr;
            int size = this.f8662o00oo0O.size();
            int o00oOoO02 = this.f8662o00oo0O.valueAt(0).o00oOoO0();
            double[] dArr = new double[size];
            int i2 = o00oOoO02 + 2;
            this.f8666o00oo0o0 = new float[i2];
            this.f8665o00oo0o = new float[o00oOoO02];
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, i2);
            for (int i3 = 0; i3 < size; i3++) {
                int keyAt = this.f8662o00oo0O.keyAt(i3);
                float[] valueAt = this.f8664o00oo0Oo.valueAt(i3);
                dArr[i3] = keyAt * 0.01d;
                this.f8662o00oo0O.valueAt(i3).o00oOo0o(this.f8666o00oo0o0);
                int i4 = 0;
                while (true) {
                    if (i4 < this.f8666o00oo0o0.length) {
                        dArr2[i3][i4] = fArr[i4];
                        i4++;
                    }
                }
                double[] dArr3 = dArr2[i3];
                dArr3[o00oOoO02] = valueAt[0];
                dArr3[o00oOoO02 + 1] = valueAt[1];
            }
            this.f8652o00oOOo0 = o00oo.o00oOOoO.o00oOOo0(i, dArr, dArr2);
        }

        public void o00oOoo0(int i, androidx.constraintlayout.widget.o00oOOo0 o00oooo02, float f, int i2, float f2) {
            this.f8662o00oo0O.append(i, o00oooo02);
            this.f8664o00oo0Oo.append(i, new float[]{f, f2});
            this.f8653o00oOOoO = Math.max(this.f8653o00oOOoO, i2);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 extends o0O00O0o {
        @Override // o00ooO00.o0O00O0o
        public boolean o00oOoO0(View view, float f, long j, o00ooO00.o00oo0O0 o00oo0o02) {
            view.setElevation(o00oOOoO(f, j, view, o00oo0o02));
            return this.f8657o00oOoO;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo0O extends o0O00O0o {
        @Override // o00ooO00.o0O00O0o
        public boolean o00oOoO0(View view, float f, long j, o00ooO00.o00oo0O0 o00oo0o02) {
            return this.f8657o00oOoO;
        }

        public boolean o00oOoo0(View view, o00ooO00.o00oo0O0 o00oo0o02, float f, long j, double d, double d2) {
            view.setRotation(o00oOOoO(f, j, view, o00oo0o02) + ((float) Math.toDegrees(Math.atan2(d2, d))));
            return this.f8657o00oOoO;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOoO extends o0O00O0o {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public boolean f8667o00oo0O0 = false;

        @Override // o00ooO00.o0O00O0o
        public boolean o00oOoO0(View view, float f, long j, o00ooO00.o00oo0O0 o00oo0o02) {
            if (view instanceof o0O000Oo) {
                ((o0O000Oo) view).setProgress(o00oOOoO(f, j, view, o00oo0o02));
            } else if (this.f8667o00oo0O0) {
                return false;
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f8667o00oo0O0 = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(o00oOOoO(f, j, view, o00oo0o02)));
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            return this.f8657o00oOoO;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo extends o0O00O0o {
        @Override // o00ooO00.o0O00O0o
        public boolean o00oOoO0(View view, float f, long j, o00ooO00.o00oo0O0 o00oo0o02) {
            view.setTranslationX(o00oOOoO(f, j, view, o00oo0o02));
            return this.f8657o00oOoO;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0 extends o0O00O0o {
        @Override // o00ooO00.o0O00O0o
        public boolean o00oOoO0(View view, float f, long j, o00ooO00.o00oo0O0 o00oo0o02) {
            view.setRotationX(o00oOOoO(f, j, view, o00oo0o02));
            return this.f8657o00oOoO;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo00O extends o0O00O0o {
        @Override // o00ooO00.o0O00O0o
        public boolean o00oOoO0(View view, float f, long j, o00ooO00.o00oo0O0 o00oo0o02) {
            view.setRotation(o00oOOoO(f, j, view, o00oo0o02));
            return this.f8657o00oOoO;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0O extends o0O00O0o {
        @Override // o00ooO00.o0O00O0o
        public boolean o00oOoO0(View view, float f, long j, o00ooO00.o00oo0O0 o00oo0o02) {
            view.setScaleY(o00oOOoO(f, j, view, o00oo0o02));
            return this.f8657o00oOoO;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0O0 extends o0O00O0o {
        @Override // o00ooO00.o0O00O0o
        public boolean o00oOoO0(View view, float f, long j, o00ooO00.o00oo0O0 o00oo0o02) {
            view.setScaleX(o00oOOoO(f, j, view, o00oo0o02));
            return this.f8657o00oOoO;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0OO extends o0O00O0o {
        @Override // o00ooO00.o0O00O0o
        public boolean o00oOoO0(View view, float f, long j, o00ooO00.o00oo0O0 o00oo0o02) {
            view.setRotationY(o00oOOoO(f, j, view, o00oo0o02));
            return this.f8657o00oOoO;
        }
    }

    /* loaded from: classes.dex */
    public static class o00ooO extends o0O00O0o {
        @Override // o00ooO00.o0O00O0o
        public boolean o00oOoO0(View view, float f, long j, o00ooO00.o00oo0O0 o00oo0o02) {
            view.setTranslationZ(o00oOOoO(f, j, view, o00oo0o02));
            return this.f8657o00oOoO;
        }
    }

    /* loaded from: classes.dex */
    public static class o00ooO0 extends o0O00O0o {
        @Override // o00ooO00.o0O00O0o
        public boolean o00oOoO0(View view, float f, long j, o00ooO00.o00oo0O0 o00oo0o02) {
            view.setTranslationY(o00oOOoO(f, j, view, o00oo0o02));
            return this.f8657o00oOoO;
        }
    }

    /* loaded from: classes.dex */
    public static class o0O0o {
        public static void o00oOOo0(int[] iArr, float[][] fArr, int i, int i2) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i2;
            iArr2[1] = i;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = i3 - 1;
                int i5 = iArr2[i4];
                i3 = i4 - 1;
                int i6 = iArr2[i3];
                if (i5 < i6) {
                    int o00oOOoO2 = o00oOOoO(iArr, fArr, i5, i6);
                    int i7 = i3 + 1;
                    iArr2[i3] = o00oOOoO2 - 1;
                    int i8 = i7 + 1;
                    iArr2[i7] = i5;
                    int i9 = i8 + 1;
                    iArr2[i8] = i6;
                    i3 = i9 + 1;
                    iArr2[i9] = o00oOOoO2 + 1;
                }
            }
        }

        public static int o00oOOoO(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    o00oOo00(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            o00oOo00(iArr, fArr, i4, i2);
            return i4;
        }

        public static void o00oOo00(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float[] fArr2 = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = fArr2;
        }
    }

    public static o0O00O0o o00oOo0O(String str, long j) {
        o0O00O0o o00oo0Var;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals(o00ooO00.o00oo0.f8115o00oOoOo)) {
                    c = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals(o00ooO00.o00oo0.f8116o00oOoo0)) {
                    c = 1;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals(o00ooO00.o00oo0.f8125o00oo0o)) {
                    c = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals(o00ooO00.o00oo0.f8127o00oo0oO)) {
                    c = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals(o00ooO00.o00oo0.f8129o0O0o)) {
                    c = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals(o00ooO00.o00oo0.f8123o00oo0OO)) {
                    c = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals(o00ooO00.o00oo0.f8122o00oo0O0)) {
                    c = 7;
                    break;
                }
                break;
            case -40300674:
                if (str.equals(o00ooO00.o00oo0.f8114o00oOoOO)) {
                    c = '\b';
                    break;
                }
                break;
            case -4379043:
                if (str.equals(o00ooO00.o00oo0.f8112o00oOoO)) {
                    c = '\t';
                    break;
                }
                break;
            case 37232917:
                if (str.equals(o00ooO00.o00oo0.f8119o00oo0)) {
                    c = '\n';
                    break;
                }
                break;
            case 92909918:
                if (str.equals(o00ooO00.o00oo0.f8113o00oOoO0)) {
                    c = 11;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                o00oo0Var = new o00oo0();
                break;
            case 1:
                o00oo0Var = new o00oo0OO();
                break;
            case 2:
                o00oo0Var = new o00oo();
                break;
            case 3:
                o00oo0Var = new o00ooO0();
                break;
            case 4:
                o00oo0Var = new o00ooO();
                break;
            case 5:
                o00oo0Var = new o00oOoO();
                break;
            case 6:
                o00oo0Var = new o00oo0O0();
                break;
            case 7:
                o00oo0Var = new o00oo0O();
                break;
            case '\b':
                o00oo0Var = new o00oo00O();
                break;
            case '\t':
                o00oo0Var = new o00oOo00();
                break;
            case '\n':
                o00oo0Var = new o00oOo0O();
                break;
            case 11:
                o00oo0Var = new o00oOOo0();
                break;
            default:
                return null;
        }
        o00oo0Var.o00oOoO(j);
        return o00oo0Var;
    }

    public static o0O00O0o o00oOooO(String str, SparseArray<androidx.constraintlayout.widget.o00oOOo0> sparseArray) {
        return new o00oOOoO(str, sparseArray);
    }

    public float o00oOOo0(float f) {
        float abs;
        switch (this.f8653o00oOOoO) {
            case 1:
                return Math.signum(f * f8651o00oo0OO);
            case 2:
                abs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f * f8651o00oo0OO);
            case 6:
                float abs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin(f * f8651o00oo0OO);
        }
        return 1.0f - abs;
    }

    public float o00oOOoO(float f, long j, View view, o00ooO00.o00oo0O0 o00oo0o02) {
        this.f8652o00oOOo0.o00oOo0O(f, this.f8658o00oOoO0);
        float[] fArr = this.f8658o00oOoO0;
        float f2 = fArr[1];
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i == 0) {
            this.f8657o00oOoO = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f8660o00oOoOo)) {
            float o00oOOo02 = o00oo0o02.o00oOOo0(view, this.f8656o00oOo0o, 0);
            this.f8660o00oOoOo = o00oOOo02;
            if (Float.isNaN(o00oOOo02)) {
                this.f8660o00oOoOo = 0.0f;
            }
        }
        float f3 = (float) (((((j - this.f8659o00oOoOO) * 1.0E-9d) * f2) + this.f8660o00oOoOo) % 1.0d);
        this.f8660o00oOoOo = f3;
        o00oo0o02.o00oOOoO(view, this.f8656o00oOo0o, 0, f3);
        this.f8659o00oOoOO = j;
        float f4 = this.f8658o00oOoO0[0];
        float o00oOOo03 = (o00oOOo0(this.f8660o00oOoOo) * f4) + this.f8658o00oOoO0[2];
        this.f8657o00oOoO = (f4 == 0.0f && i == 0) ? false : true;
        return o00oOOo03;
    }

    public o00oo.o00oOOoO o00oOo00() {
        return this.f8652o00oOOo0;
    }

    public void o00oOo0o(int i, float f, float f2, int i2, float f3) {
        int[] iArr = this.f8654o00oOo00;
        int i3 = this.f8655o00oOo0O;
        iArr[i3] = i;
        float[] fArr = this.f8661o00oOooO[i3];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        this.f8653o00oOOoO = Math.max(this.f8653o00oOOoO, i2);
        this.f8655o00oOo0O++;
    }

    public void o00oOoO(long j) {
        this.f8659o00oOoOO = j;
    }

    public abstract boolean o00oOoO0(View view, float f, long j, o00ooO00.o00oo0O0 o00oo0o02);

    public void o00oOoOO(String str) {
        this.f8656o00oOo0o = str;
    }

    public void o00oOoOo(int i) {
        int i2;
        int i3 = this.f8655o00oOo0O;
        if (i3 == 0) {
            return;
        }
        o0O0o.o00oOOo0(this.f8654o00oOo00, this.f8661o00oOooO, 0, i3 - 1);
        int i4 = 1;
        int i5 = 0;
        while (true) {
            int[] iArr = this.f8654o00oOo00;
            if (i4 >= iArr.length) {
                break;
            }
            if (iArr[i4] != iArr[i4 - 1]) {
                i5++;
            }
            i4++;
        }
        if (i5 == 0) {
            i5 = 1;
        }
        double[] dArr = new double[i5];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, i5, 3);
        int i6 = 0;
        for (i2 = 0; i2 < this.f8655o00oOo0O; i2 = i2 + 1) {
            if (i2 > 0) {
                int[] iArr2 = this.f8654o00oOo00;
                i2 = iArr2[i2] == iArr2[i2 - 1] ? i2 + 1 : 0;
            }
            dArr[i6] = this.f8654o00oOo00[i2] * 0.01d;
            double[] dArr3 = dArr2[i6];
            float[] fArr = this.f8661o00oOooO[i2];
            dArr3[0] = fArr[0];
            dArr3[1] = fArr[1];
            dArr3[2] = fArr[2];
            i6++;
        }
        this.f8652o00oOOo0 = o00oo.o00oOOoO.o00oOOo0(i, dArr, dArr2);
    }

    public String toString() {
        String str = this.f8656o00oOo0o;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f8655o00oOo0O; i++) {
            StringBuilder o00oOOo02 = androidx.appcompat.widget.o00oOo0O.o00oOOo0(str, "[");
            o00oOOo02.append(this.f8654o00oOo00[i]);
            o00oOOo02.append(" , ");
            o00oOOo02.append(decimalFormat.format(this.f8661o00oOooO[i]));
            o00oOOo02.append("] ");
            str = o00oOOo02.toString();
        }
        return str;
    }
}
