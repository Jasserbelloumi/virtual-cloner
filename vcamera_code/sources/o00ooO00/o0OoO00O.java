package o00ooO00;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.Arrays;
/* loaded from: classes.dex */
public abstract class o0OoO00O {

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f8699o00oOo0o = "SplineSet";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public o00oo.o00oOOoO f8700o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int[] f8701o00oOOoO = new int[10];

    /* renamed from: o00oOo00  reason: collision with root package name */
    public float[] f8702o00oOo00 = new float[10];

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public String f8703o00oOo0O;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f8704o00oOooO;

    /* loaded from: classes.dex */
    public static class o0 extends o0OoO00O {
        @Override // o00ooO00.o0OoO00O
        public void o00oOoO0(View view, float f) {
            view.setTranslationY(o00oOOo0(f));
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOo0 extends o0OoO00O {
        @Override // o00ooO00.o0OoO00O
        public void o00oOoO0(View view, float f) {
            view.setAlpha(o00oOOo0(f));
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO extends o0OoO00O {

        /* renamed from: o00oOoO  reason: collision with root package name */
        public SparseArray<androidx.constraintlayout.widget.o00oOOo0> f8705o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public String f8706o00oOoO0;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public float[] f8707o00oOoOO;

        public o00oOOoO(String str, SparseArray<androidx.constraintlayout.widget.o00oOOo0> sparseArray) {
            this.f8706o00oOoO0 = str.split(",")[1];
            this.f8705o00oOoO = sparseArray;
        }

        @Override // o00ooO00.o0OoO00O
        public void o00oOo0o(int i, float f) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // o00ooO00.o0OoO00O
        public void o00oOoO0(View view, float f) {
            this.f8700o00oOOo0.o00oOo0O(f, this.f8707o00oOoOO);
            this.f8705o00oOoO.valueAt(0).o00oo00O(view, this.f8707o00oOoOO);
        }

        @Override // o00ooO00.o0OoO00O
        public void o00oOoOO(int i) {
            float[] fArr;
            int size = this.f8705o00oOoO.size();
            int o00oOoO02 = this.f8705o00oOoO.valueAt(0).o00oOoO0();
            double[] dArr = new double[size];
            this.f8707o00oOoOO = new float[o00oOoO02];
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, o00oOoO02);
            for (int i2 = 0; i2 < size; i2++) {
                dArr[i2] = this.f8705o00oOoO.keyAt(i2) * 0.01d;
                this.f8705o00oOoO.valueAt(i2).o00oOo0o(this.f8707o00oOoOO);
                int i3 = 0;
                while (true) {
                    if (i3 < this.f8707o00oOoOO.length) {
                        dArr2[i2][i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            this.f8700o00oOOo0 = o00oo.o00oOOoO.o00oOOo0(i, dArr, dArr2);
        }

        public void o00oOoOo(int i, androidx.constraintlayout.widget.o00oOOo0 o00oooo02) {
            this.f8705o00oOoO.append(i, o00oooo02);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 extends o0OoO00O {
        @Override // o00ooO00.o0OoO00O
        public void o00oOoO0(View view, float f) {
            view.setElevation(o00oOOo0(f));
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo0O extends o0OoO00O {
        @Override // o00ooO00.o0OoO00O
        public void o00oOoO0(View view, float f) {
        }

        public void o00oOoOo(View view, float f, double d, double d2) {
            view.setRotation(o00oOOo0(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOoO extends o0OoO00O {
        @Override // o00ooO00.o0OoO00O
        public void o00oOoO0(View view, float f) {
            view.setPivotX(o00oOOo0(f));
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo extends o0OoO00O {
        @Override // o00ooO00.o0OoO00O
        public void o00oOoO0(View view, float f) {
            view.setScaleY(o00oOOo0(f));
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0 extends o0OoO00O {

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public boolean f8708o00oOoO0 = false;

        @Override // o00ooO00.o0OoO00O
        public void o00oOoO0(View view, float f) {
            if (view instanceof o0O000Oo) {
                ((o0O000Oo) view).setProgress(o00oOOo0(f));
            } else if (this.f8708o00oOoO0) {
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f8708o00oOoO0 = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(o00oOOo0(f)));
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo00O extends o0OoO00O {
        @Override // o00ooO00.o0OoO00O
        public void o00oOoO0(View view, float f) {
            view.setPivotY(o00oOOo0(f));
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0O extends o0OoO00O {
        @Override // o00ooO00.o0OoO00O
        public void o00oOoO0(View view, float f) {
            view.setRotationY(o00oOOo0(f));
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0O0 extends o0OoO00O {
        @Override // o00ooO00.o0OoO00O
        public void o00oOoO0(View view, float f) {
            view.setRotationX(o00oOOo0(f));
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0OO extends o0OoO00O {
        @Override // o00ooO00.o0OoO00O
        public void o00oOoO0(View view, float f) {
            view.setRotation(o00oOOo0(f));
        }
    }

    /* loaded from: classes.dex */
    public static class o00ooO extends o0OoO00O {
        @Override // o00ooO00.o0OoO00O
        public void o00oOoO0(View view, float f) {
            view.setTranslationX(o00oOOo0(f));
        }
    }

    /* loaded from: classes.dex */
    public static class o00ooO0 {
        public static void o00oOOo0(int[] iArr, float[] fArr, int i, int i2) {
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

        public static int o00oOOoO(int[] iArr, float[] fArr, int i, int i2) {
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

        public static void o00oOo00(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
        }
    }

    /* loaded from: classes.dex */
    public static class o0O00000 extends o0OoO00O {
        @Override // o00ooO00.o0OoO00O
        public void o00oOoO0(View view, float f) {
            view.setTranslationZ(o00oOOo0(f));
        }
    }

    /* loaded from: classes.dex */
    public static class o0O0o extends o0OoO00O {
        @Override // o00ooO00.o0OoO00O
        public void o00oOoO0(View view, float f) {
            view.setScaleX(o00oOOo0(f));
        }
    }

    public static o0OoO00O o00oOo0O(String str) {
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
            case -797520672:
                if (str.equals(o00ooO00.o00oo0.f8126o00oo0o0)) {
                    c = '\b';
                    break;
                }
                break;
            case -760884510:
                if (str.equals(o00ooO00.o00oo0.f8117o00oOooo)) {
                    c = '\t';
                    break;
                }
                break;
            case -760884509:
                if (str.equals(o00ooO00.o00oo0.f8120o00oo00O)) {
                    c = '\n';
                    break;
                }
                break;
            case -40300674:
                if (str.equals(o00ooO00.o00oo0.f8114o00oOoOO)) {
                    c = 11;
                    break;
                }
                break;
            case -4379043:
                if (str.equals(o00ooO00.o00oo0.f8112o00oOoO)) {
                    c = '\f';
                    break;
                }
                break;
            case 37232917:
                if (str.equals(o00ooO00.o00oo0.f8119o00oo0)) {
                    c = '\r';
                    break;
                }
                break;
            case 92909918:
                if (str.equals(o00ooO00.o00oo0.f8113o00oOoO0)) {
                    c = 14;
                    break;
                }
                break;
            case 156108012:
                if (str.equals(o00ooO00.o00oo0.f8124o00oo0Oo)) {
                    c = 15;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new o00oo0O0();
            case 1:
                return new o00oo0O();
            case 2:
                return new o00ooO();
            case 3:
                return new o0();
            case 4:
                return new o0O00000();
            case 5:
                return new o00oo0();
            case 6:
                return new o0O0o();
            case 7:
                return new o00oo();
            case '\b':
                return new o00oOOo0();
            case '\t':
                return new o00oOoO();
            case '\n':
                return new o00oo00O();
            case 11:
                return new o00oo0OO();
            case '\f':
                return new o00oOo00();
            case '\r':
                return new o00oOo0O();
            case 14:
                return new o00oOOo0();
            case 15:
                return new o00oOOo0();
            default:
                return null;
        }
    }

    public static o0OoO00O o00oOooO(String str, SparseArray<androidx.constraintlayout.widget.o00oOOo0> sparseArray) {
        return new o00oOOoO(str, sparseArray);
    }

    public float o00oOOo0(float f) {
        return (float) this.f8700o00oOOo0.o00oOo00(f, 0);
    }

    public o00oo.o00oOOoO o00oOOoO() {
        return this.f8700o00oOOo0;
    }

    public float o00oOo00(float f) {
        return (float) this.f8700o00oOOo0.o00oOo0o(f, 0);
    }

    public void o00oOo0o(int i, float f) {
        int[] iArr = this.f8701o00oOOoO;
        if (iArr.length < this.f8704o00oOooO + 1) {
            this.f8701o00oOOoO = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f8702o00oOo00;
            this.f8702o00oOo00 = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f8701o00oOOoO;
        int i2 = this.f8704o00oOooO;
        iArr2[i2] = i;
        this.f8702o00oOo00[i2] = f;
        this.f8704o00oOooO = i2 + 1;
    }

    public void o00oOoO(String str) {
        this.f8703o00oOo0O = str;
    }

    public abstract void o00oOoO0(View view, float f);

    public void o00oOoOO(int i) {
        int i2;
        int i3 = this.f8704o00oOooO;
        if (i3 == 0) {
            return;
        }
        o00ooO0.o00oOOo0(this.f8701o00oOOoO, this.f8702o00oOo00, 0, i3 - 1);
        int i4 = 1;
        for (int i5 = 1; i5 < this.f8704o00oOooO; i5++) {
            int[] iArr = this.f8701o00oOOoO;
            if (iArr[i5 - 1] != iArr[i5]) {
                i4++;
            }
        }
        double[] dArr = new double[i4];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, i4, 1);
        int i6 = 0;
        for (i2 = 0; i2 < this.f8704o00oOooO; i2 = i2 + 1) {
            if (i2 > 0) {
                int[] iArr2 = this.f8701o00oOOoO;
                i2 = iArr2[i2] == iArr2[i2 - 1] ? i2 + 1 : 0;
            }
            dArr[i6] = this.f8701o00oOOoO[i2] * 0.01d;
            dArr2[i6][0] = this.f8702o00oOo00[i2];
            i6++;
        }
        this.f8700o00oOOo0 = o00oo.o00oOOoO.o00oOOo0(i, dArr, dArr2);
    }

    public String toString() {
        String str = this.f8703o00oOo0O;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f8704o00oOooO; i++) {
            StringBuilder o00oOOo02 = androidx.appcompat.widget.o00oOo0O.o00oOOo0(str, "[");
            o00oOOo02.append(this.f8701o00oOOoO[i]);
            o00oOOo02.append(" , ");
            o00oOOo02.append(decimalFormat.format(this.f8702o00oOo00[i]));
            o00oOOo02.append("] ");
            str = o00oOOo02.toString();
        }
        return str;
    }
}
