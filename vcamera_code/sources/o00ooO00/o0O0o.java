package o00ooO00;

import android.annotation.TargetApi;
import android.view.View;
import androidx.constraintlayout.widget.o00oOOo0;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class o0O0o {

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final String f8669o00oOoO = "KeyCycleOscillator";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public o00oo.o00oOOoO f8670o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public o00oOo0O f8671o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public androidx.constraintlayout.widget.o00oOOo0 f8672o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f8673o00oOo0O = 0;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public int f8674o00oOo0o = 0;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public ArrayList<o0O000> f8675o00oOoO0 = new ArrayList<>();

    /* renamed from: o00oOooO  reason: collision with root package name */
    public String f8676o00oOooO;

    /* loaded from: classes.dex */
    public static class o0 extends o0O0o {
        @Override // o00ooO00.o0O0o
        public void o00oOoO0(View view, float f) {
            view.setTranslationX(o00oOOo0(f));
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Comparator<o0O000> {
        public o00oOOo0() {
        }

        @Override // java.util.Comparator
        /* renamed from: o00oOOo0 */
        public int compare(o0O000 o0o000, o0O000 o0o0002) {
            return Integer.compare(o0o000.f8695o00oOOo0, o0o0002.f8695o00oOOo0);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO extends o0O0o {
        @Override // o00ooO00.o0O0o
        public void o00oOoO0(View view, float f) {
            view.setAlpha(o00oOOo0(f));
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 extends o0O0o {

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public float[] f8678o00oOoOO = new float[1];

        @Override // o00ooO00.o0O0o
        public void o00oOoO0(View view, float f) {
            this.f8678o00oOoOO[0] = o00oOOo0(f);
            this.f8672o00oOo00.o00oo00O(view, this.f8678o00oOoOO);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo0O {

        /* renamed from: o00oo0  reason: collision with root package name */
        public static final int f8679o00oo0 = -1;

        /* renamed from: o00oo0OO  reason: collision with root package name */
        public static final String f8680o00oo0OO = "CycleOscillator";

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final int f8681o00oOOo0;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public float[] f8683o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public float[] f8684o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public float[] f8685o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public int f8686o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public float[] f8687o00oOoO0;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public o00oo.o00oOOoO f8688o00oOoOO;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public double[] f8689o00oOoOo;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public double[] f8690o00oOoo0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public double[] f8691o00oOooO;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public float f8692o00oOooo;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public o00oo.o00oo0 f8682o00oOOoO = new o00oo.o00oo0();

        /* renamed from: o00oo00O  reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.o00oOOo0> f8693o00oo00O = new HashMap<>();

        public o00oOo0O(int i, int i2, int i3) {
            this.f8686o00oOoO = i;
            this.f8681o00oOOo0 = i2;
            this.f8682o00oOOoO.o00oOoO0(i);
            this.f8683o00oOo00 = new float[i3];
            this.f8691o00oOooO = new double[i3];
            this.f8684o00oOo0O = new float[i3];
            this.f8685o00oOo0o = new float[i3];
            this.f8687o00oOoO0 = new float[i3];
        }

        public final androidx.constraintlayout.widget.o00oOOo0 o00oOOo0(String str, o00oOOo0.o00oOOoO o00ooooo2) {
            if (!this.f8693o00oo00O.containsKey(str)) {
                androidx.constraintlayout.widget.o00oOOo0 o00oooo02 = new androidx.constraintlayout.widget.o00oOOo0(str, o00ooooo2);
                this.f8693o00oo00O.put(str, o00oooo02);
                return o00oooo02;
            }
            androidx.constraintlayout.widget.o00oOOo0 o00oooo03 = this.f8693o00oo00O.get(str);
            if (o00oooo03.o00oOooO() == o00ooooo2) {
                return o00oooo03;
            }
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("ConstraintAttribute is already a ");
            o00oOOo02.append(o00oooo03.o00oOooO().name());
            throw new IllegalArgumentException(o00oOOo02.toString());
        }

        public double o00oOOoO(float f) {
            o00oo.o00oOOoO o00ooooo2 = this.f8688o00oOoOO;
            if (o00ooooo2 != null) {
                double d = f;
                o00ooooo2.o00oOoO0(d, this.f8690o00oOoo0);
                this.f8688o00oOoOO.o00oOooO(d, this.f8689o00oOoOo);
            } else {
                double[] dArr = this.f8690o00oOoo0;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
            }
            double d2 = f;
            double o00oOo0O2 = this.f8682o00oOOoO.o00oOo0O(d2);
            double o00oOooO2 = this.f8682o00oOOoO.o00oOooO(d2);
            double[] dArr2 = this.f8690o00oOoo0;
            return (o00oOooO2 * this.f8689o00oOoOo[1]) + (o00oOo0O2 * dArr2[1]) + dArr2[0];
        }

        public double o00oOo00(float f) {
            o00oo.o00oOOoO o00ooooo2 = this.f8688o00oOoOO;
            if (o00ooooo2 != null) {
                o00ooooo2.o00oOooO(f, this.f8689o00oOoOo);
            } else {
                double[] dArr = this.f8689o00oOoOo;
                dArr[0] = this.f8685o00oOo0o[0];
                dArr[1] = this.f8683o00oOo00[0];
            }
            return (this.f8682o00oOOoO.o00oOo0O(f) * this.f8689o00oOoOo[1]) + this.f8689o00oOoOo[0];
        }

        public void o00oOo0O(float f) {
            float[] fArr;
            this.f8692o00oOooo = f;
            double[][] dArr = (double[][]) Array.newInstance(Double.TYPE, this.f8691o00oOooO.length, 2);
            float[] fArr2 = this.f8683o00oOo00;
            this.f8689o00oOoOo = new double[fArr2.length + 1];
            this.f8690o00oOoo0 = new double[fArr2.length + 1];
            if (this.f8691o00oOooO[0] > 0.0d) {
                this.f8682o00oOOoO.o00oOOo0(0.0d, this.f8684o00oOo0O[0]);
            }
            double[] dArr2 = this.f8691o00oOooO;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.f8682o00oOOoO.o00oOOo0(1.0d, this.f8684o00oOo0O[length]);
            }
            for (int i = 0; i < dArr.length; i++) {
                dArr[i][0] = this.f8685o00oOo0o[i];
                int i2 = 0;
                while (true) {
                    if (i2 < this.f8683o00oOo00.length) {
                        dArr[i2][1] = fArr[i2];
                        i2++;
                    }
                }
                this.f8682o00oOOoO.o00oOOo0(this.f8691o00oOooO[i], this.f8684o00oOo0O[i]);
            }
            this.f8682o00oOOoO.o00oOo0o();
            double[] dArr3 = this.f8691o00oOooO;
            this.f8688o00oOoOO = dArr3.length > 1 ? o00oo.o00oOOoO.o00oOOo0(0, dArr3, dArr) : null;
        }

        public void o00oOooO(int i, int i2, float f, float f2, float f3) {
            this.f8691o00oOooO[i] = i2 / 100.0d;
            this.f8684o00oOo0O[i] = f;
            this.f8685o00oOo0o[i] = f2;
            this.f8683o00oOo00[i] = f3;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOoO extends o0O0o {
        @Override // o00ooO00.o0O0o
        public void o00oOoO0(View view, float f) {
            view.setElevation(o00oOOo0(f));
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo extends o0O0o {
        @Override // o00ooO00.o0O0o
        public void o00oOoO0(View view, float f) {
            view.setRotationY(o00oOOo0(f));
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0 {
        public static int o00oOOo0(int[] iArr, float[] fArr, float[] fArr2, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    o00oOo00(iArr, fArr, fArr2, i4, i);
                    i4++;
                }
                i++;
            }
            o00oOo00(iArr, fArr, fArr2, i4, i2);
            return i4;
        }

        public static void o00oOOoO(int[] iArr, float[] fArr, float[] fArr2, int i, int i2) {
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
                    int o00oOOo02 = o00oOOo0(iArr, fArr, fArr2, i5, i6);
                    int i7 = i3 + 1;
                    iArr2[i3] = o00oOOo02 - 1;
                    int i8 = i7 + 1;
                    iArr2[i7] = i5;
                    int i9 = i8 + 1;
                    iArr2[i8] = i6;
                    i3 = i9 + 1;
                    iArr2[i9] = o00oOOo02 + 1;
                }
            }
        }

        public static void o00oOo00(int[] iArr, float[] fArr, float[] fArr2, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
            float f2 = fArr2[i];
            fArr2[i] = fArr2[i2];
            fArr2[i2] = f2;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo00O {
        public static int o00oOOo0(int[] iArr, float[] fArr, int i, int i2) {
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

        public static void o00oOOoO(int[] iArr, float[] fArr, int i, int i2) {
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
                    int o00oOOo02 = o00oOOo0(iArr, fArr, i5, i6);
                    int i7 = i3 + 1;
                    iArr2[i3] = o00oOOo02 - 1;
                    int i8 = i7 + 1;
                    iArr2[i7] = i5;
                    int i9 = i8 + 1;
                    iArr2[i8] = i6;
                    i3 = i9 + 1;
                    iArr2[i9] = o00oOOo02 + 1;
                }
            }
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
    public static class o00oo0O extends o0O0o {
        @Override // o00ooO00.o0O0o
        public void o00oOoO0(View view, float f) {
            view.setRotation(o00oOOo0(f));
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0O0 extends o0O0o {

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public boolean f8694o00oOoOO = false;

        @Override // o00ooO00.o0O0o
        public void o00oOoO0(View view, float f) {
            if (view instanceof o0O000Oo) {
                ((o0O000Oo) view).setProgress(o00oOOo0(f));
            } else if (this.f8694o00oOoOO) {
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f8694o00oOoOO = true;
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
    public static class o00oo0OO extends o0O0o {
        @Override // o00ooO00.o0O0o
        public void o00oOoO0(View view, float f) {
        }

        public void o00oOoo0(View view, float f, double d, double d2) {
            view.setRotation(o00oOOo0(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    /* loaded from: classes.dex */
    public static class o00ooO extends o0O0o {
        @Override // o00ooO00.o0O0o
        public void o00oOoO0(View view, float f) {
            view.setScaleY(o00oOOo0(f));
        }
    }

    /* loaded from: classes.dex */
    public static class o00ooO0 extends o0O0o {
        @Override // o00ooO00.o0O0o
        public void o00oOoO0(View view, float f) {
            view.setScaleX(o00oOOo0(f));
        }
    }

    /* loaded from: classes.dex */
    public static class o0O000 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f8695o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public float f8696o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public float f8697o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public float f8698o00oOooO;

        public o0O000(int i, float f, float f2, float f3) {
            this.f8695o00oOOo0 = i;
            this.f8696o00oOOoO = f3;
            this.f8697o00oOo00 = f2;
            this.f8698o00oOooO = f;
        }
    }

    /* loaded from: classes.dex */
    public static class o0O00000 extends o0O0o {
        @Override // o00ooO00.o0O0o
        public void o00oOoO0(View view, float f) {
            view.setTranslationY(o00oOOo0(f));
        }
    }

    /* loaded from: classes.dex */
    public static class o0O0000O extends o0O0o {
        @Override // o00ooO00.o0O0o
        public void o00oOoO0(View view, float f) {
            view.setTranslationZ(o00oOOo0(f));
        }
    }

    /* renamed from: o00ooO00.o0O0o$o0O0o  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0111o0O0o extends o0O0o {
        @Override // o00ooO00.o0O0o
        public void o00oOoO0(View view, float f) {
            view.setRotationX(o00oOOo0(f));
        }
    }

    public static o0O0o o00oOooO(String str) {
        if (str.startsWith(o00ooO00.o00oo0.f8128o00ooO00)) {
            return new o00oOo00();
        }
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
            case -40300674:
                if (str.equals(o00ooO00.o00oo0.f8114o00oOoOO)) {
                    c = '\t';
                    break;
                }
                break;
            case -4379043:
                if (str.equals(o00ooO00.o00oo0.f8112o00oOoO)) {
                    c = '\n';
                    break;
                }
                break;
            case 37232917:
                if (str.equals(o00ooO00.o00oo0.f8119o00oo0)) {
                    c = 11;
                    break;
                }
                break;
            case 92909918:
                if (str.equals(o00ooO00.o00oo0.f8113o00oOoO0)) {
                    c = '\f';
                    break;
                }
                break;
            case 156108012:
                if (str.equals(o00ooO00.o00oo0.f8124o00oo0Oo)) {
                    c = '\r';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C0111o0O0o();
            case 1:
                return new o00oo();
            case 2:
                return new o0();
            case 3:
                return new o0O00000();
            case 4:
                return new o0O0000O();
            case 5:
                return new o00oo0O0();
            case 6:
                return new o00ooO0();
            case 7:
                return new o00ooO();
            case '\b':
                return new o00oOOoO();
            case '\t':
                return new o00oo0O();
            case '\n':
                return new o00oOoO();
            case 11:
                return new o00oo0OO();
            case '\f':
                return new o00oOOoO();
            case '\r':
                return new o00oOOoO();
            default:
                return null;
        }
    }

    public float o00oOOo0(float f) {
        return (float) this.f8671o00oOOoO.o00oOo00(f);
    }

    public o00oo.o00oOOoO o00oOOoO() {
        return this.f8670o00oOOo0;
    }

    public float o00oOo00(float f) {
        return (float) this.f8671o00oOOoO.o00oOOoO(f);
    }

    public void o00oOo0O(int i, int i2, int i3, float f, float f2, float f3) {
        this.f8675o00oOoO0.add(new o0O000(i, f, f2, f3));
        if (i3 != -1) {
            this.f8674o00oOo0o = i3;
        }
        this.f8673o00oOo0O = i2;
    }

    public void o00oOo0o(int i, int i2, int i3, float f, float f2, float f3, androidx.constraintlayout.widget.o00oOOo0 o00oooo02) {
        this.f8675o00oOoO0.add(new o0O000(i, f, f2, f3));
        if (i3 != -1) {
            this.f8674o00oOo0o = i3;
        }
        this.f8673o00oOo0O = i2;
        this.f8672o00oOo00 = o00oooo02;
    }

    public void o00oOoO(String str) {
        this.f8676o00oOooO = str;
    }

    public abstract void o00oOoO0(View view, float f);

    @TargetApi(19)
    public void o00oOoOO(float f) {
        int size = this.f8675o00oOoO0.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.f8675o00oOoO0, new o00oOOo0());
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, 2);
        this.f8671o00oOOoO = new o00oOo0O(this.f8673o00oOo0O, this.f8674o00oOo0o, size);
        Iterator<o0O000> it = this.f8675o00oOoO0.iterator();
        int i = 0;
        while (it.hasNext()) {
            o0O000 next = it.next();
            float f2 = next.f8698o00oOooO;
            dArr[i] = f2 * 0.01d;
            double[] dArr3 = dArr2[i];
            float f3 = next.f8696o00oOOoO;
            dArr3[0] = f3;
            float f4 = next.f8697o00oOo00;
            dArr3[1] = f4;
            this.f8671o00oOOoO.o00oOooO(i, next.f8695o00oOOo0, f2, f4, f3);
            i++;
        }
        this.f8671o00oOOoO.o00oOo0O(f);
        this.f8670o00oOOo0 = o00oo.o00oOOoO.o00oOOo0(0, dArr, dArr2);
    }

    public boolean o00oOoOo() {
        return this.f8674o00oOo0o == 1;
    }

    public String toString() {
        String str = this.f8676o00oOooO;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<o0O000> it = this.f8675o00oOoO0.iterator();
        while (it.hasNext()) {
            o0O000 next = it.next();
            StringBuilder o00oOOo02 = androidx.appcompat.widget.o00oOo0O.o00oOOo0(str, "[");
            o00oOOo02.append(next.f8695o00oOOo0);
            o00oOOo02.append(" , ");
            o00oOOo02.append(decimalFormat.format(next.f8696o00oOOoO));
            o00oOOo02.append("] ");
            str = o00oOOo02.toString();
        }
        return str;
    }
}
