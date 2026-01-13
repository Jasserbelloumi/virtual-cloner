package o00ooO00;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.R;
import java.util.HashMap;
/* loaded from: classes.dex */
public class o00ooO0 extends o00ooO {

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public static final String f8229o00ooo0o = "KeyPosition";

    /* renamed from: o00oooO  reason: collision with root package name */
    public static final String f8230o00oooO = "KeyPosition";

    /* renamed from: o00oooOO  reason: collision with root package name */
    public static final int f8231o00oooOO = 2;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public static final int f8232o00oooOo = 1;

    /* renamed from: o00oooo  reason: collision with root package name */
    public static final int f8233o00oooo = 2;

    /* renamed from: o00oooo0  reason: collision with root package name */
    public static final int f8234o00oooo0 = 0;

    /* renamed from: o00ooooO  reason: collision with root package name */
    public static final String f8235o00ooooO = "percentY";

    /* renamed from: o00ooooo  reason: collision with root package name */
    public static final String f8236o00ooooo = "percentX";

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public String f8238o00ooO0o = null;

    /* renamed from: o00ooO  reason: collision with root package name */
    public int f8237o00ooO = o00oo0.f8111o00oOo0o;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public int f8240o00ooOO0 = 0;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public float f8239o00ooOO = Float.NaN;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public float f8241o00ooOOo = Float.NaN;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public float f8243o00ooOo0 = Float.NaN;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public float f8242o00ooOo = Float.NaN;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public float f8244o00ooOoO = Float.NaN;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public float f8245o00ooOoo = Float.NaN;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public int f8247o00ooo00 = 0;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public float f8246o00ooo0 = Float.NaN;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public float f8248o00ooo0O = Float.NaN;

    /* loaded from: classes.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final int f8249o00oOOo0 = 1;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final int f8250o00oOOoO = 2;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final int f8251o00oOo00 = 3;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final int f8252o00oOo0O = 5;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final int f8253o00oOo0o = 6;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public static final int f8254o00oOoO = 8;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public static final int f8255o00oOoO0 = 7;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public static final int f8256o00oOoOO = 9;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public static final int f8257o00oOoOo = 10;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public static final int f8258o00oOoo0 = 11;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final int f8259o00oOooO = 4;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public static final int f8260o00oOooo = 12;

        /* renamed from: o00oo00O  reason: collision with root package name */
        public static SparseIntArray f8261o00oo00O;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8261o00oo00O = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyPosition_motionTarget, 1);
            f8261o00oo00O.append(R.styleable.KeyPosition_framePosition, 2);
            f8261o00oo00O.append(R.styleable.KeyPosition_transitionEasing, 3);
            f8261o00oo00O.append(R.styleable.KeyPosition_curveFit, 4);
            f8261o00oo00O.append(R.styleable.KeyPosition_drawPath, 5);
            f8261o00oo00O.append(R.styleable.KeyPosition_percentX, 6);
            f8261o00oo00O.append(R.styleable.KeyPosition_percentY, 7);
            f8261o00oo00O.append(R.styleable.KeyPosition_keyPositionType, 9);
            f8261o00oo00O.append(R.styleable.KeyPosition_sizePercent, 8);
            f8261o00oo00O.append(R.styleable.KeyPosition_percentWidth, 11);
            f8261o00oo00O.append(R.styleable.KeyPosition_percentHeight, 12);
            f8261o00oo00O.append(R.styleable.KeyPosition_pathMotionArc, 10);
        }

        public static void o00oOOoO(o00ooO0 o00ooo02, TypedArray typedArray) {
            float f;
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f8261o00oo00O.get(index)) {
                    case 1:
                        if (o0O000Oo.f8453o0O0OOO) {
                            int resourceId = typedArray.getResourceId(index, o00ooo02.f8131o00oOOoO);
                            o00ooo02.f8131o00oOOoO = resourceId;
                            if (resourceId != -1) {
                            }
                            o00ooo02.f8132o00oOo00 = typedArray.getString(index);
                        } else {
                            if (typedArray.peekValue(index).type != 3) {
                                o00ooo02.f8131o00oOOoO = typedArray.getResourceId(index, o00ooo02.f8131o00oOOoO);
                                continue;
                            }
                            o00ooo02.f8132o00oOo00 = typedArray.getString(index);
                        }
                    case 2:
                        o00ooo02.f8130o00oOOo0 = typedArray.getInt(index, o00ooo02.f8130o00oOOo0);
                        continue;
                    case 3:
                        o00ooo02.f8238o00ooO0o = typedArray.peekValue(index).type == 3 ? typedArray.getString(index) : o00oo.o00oOo00.f7198o00oOoo0[typedArray.getInteger(index, 0)];
                        continue;
                    case 4:
                        o00ooo02.f8228o00ooO0 = typedArray.getInteger(index, o00ooo02.f8228o00ooO0);
                        continue;
                    case 5:
                        o00ooo02.f8240o00ooOO0 = typedArray.getInt(index, o00ooo02.f8240o00ooOO0);
                        continue;
                    case 6:
                        o00ooo02.f8243o00ooOo0 = typedArray.getFloat(index, o00ooo02.f8243o00ooOo0);
                        continue;
                    case 7:
                        o00ooo02.f8242o00ooOo = typedArray.getFloat(index, o00ooo02.f8242o00ooOo);
                        continue;
                    case 8:
                        f = typedArray.getFloat(index, o00ooo02.f8241o00ooOOo);
                        o00ooo02.f8239o00ooOO = f;
                        break;
                    case 9:
                        o00ooo02.f8247o00ooo00 = typedArray.getInt(index, o00ooo02.f8247o00ooo00);
                        continue;
                    case 10:
                        o00ooo02.f8237o00ooO = typedArray.getInt(index, o00ooo02.f8237o00ooO);
                        continue;
                    case 11:
                        o00ooo02.f8239o00ooOO = typedArray.getFloat(index, o00ooo02.f8239o00ooOO);
                        continue;
                    case 12:
                        f = typedArray.getFloat(index, o00ooo02.f8241o00ooOOo);
                        break;
                    default:
                        Integer.toHexString(index);
                        f8261o00oo00O.get(index);
                        continue;
                }
                o00ooo02.f8241o00ooOOo = f;
            }
            int i2 = o00ooo02.f8130o00oOOo0;
        }
    }

    public o00ooO0() {
        this.f8134o00oOooO = 2;
    }

    @Override // o00ooO00.o00oo0
    public void o00oOOo0(HashMap<String, o0OoO00O> hashMap) {
    }

    @Override // o00ooO00.o00oo0
    public void o00oOo00(Context context, AttributeSet attributeSet) {
        o00oOOo0.o00oOOoO(this, context.obtainStyledAttributes(attributeSet, R.styleable.KeyPosition));
    }

    @Override // o00ooO00.o00oo0
    public void o00oOo0o(String str, Object obj) {
        float o00oOoO2;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c = 0;
                    break;
                }
                break;
            case -1127236479:
                if (str.equals("percentWidth")) {
                    c = 1;
                    break;
                }
                break;
            case -1017587252:
                if (str.equals("percentHeight")) {
                    c = 2;
                    break;
                }
                break;
            case -827014263:
                if (str.equals("drawPath")) {
                    c = 3;
                    break;
                }
                break;
            case -200259324:
                if (str.equals("sizePercent")) {
                    c = 4;
                    break;
                }
                break;
            case 428090547:
                if (str.equals(f8236o00ooooo)) {
                    c = 5;
                    break;
                }
                break;
            case 428090548:
                if (str.equals(f8235o00ooooO)) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f8238o00ooO0o = obj.toString();
                return;
            case 1:
                this.f8239o00ooOO = o00oOoO(obj);
                return;
            case 2:
                o00oOoO2 = o00oOoO(obj);
                break;
            case 3:
                this.f8240o00ooOO0 = o00oOoOO(obj);
                return;
            case 4:
                o00oOoO2 = o00oOoO(obj);
                this.f8239o00ooOO = o00oOoO2;
                break;
            case 5:
                this.f8243o00ooOo0 = o00oOoO(obj);
                return;
            case 6:
                this.f8242o00ooOo = o00oOoO(obj);
                return;
            default:
                return;
        }
        this.f8241o00ooOOo = o00oOoO2;
    }

    @Override // o00ooO00.o00ooO
    public void o00oOoOo(int i, int i2, float f, float f2, float f3, float f4) {
        int i3 = this.f8247o00ooo00;
        if (i3 == 1) {
            o00oo0O0(f, f2, f3, f4);
        } else if (i3 != 2) {
            o00oo0OO(f, f2, f3, f4);
        } else {
            o00oo0O(i, i2);
        }
    }

    @Override // o00ooO00.o00ooO
    public float o00oOoo0() {
        return this.f8246o00ooo0;
    }

    @Override // o00ooO00.o00ooO
    public float o00oOooo() {
        return this.f8248o00ooo0O;
    }

    @Override // o00ooO00.o00ooO
    public void o00oo0(View view, RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr) {
        int i = this.f8247o00ooo00;
        if (i == 1) {
            o00oo0o0(rectF, rectF2, f, f2, strArr, fArr);
        } else if (i != 2) {
            o00oo0Oo(rectF, rectF2, f, f2, strArr, fArr);
        } else {
            o00oo0o(view, rectF, rectF2, f, f2, strArr, fArr);
        }
    }

    @Override // o00ooO00.o00ooO
    public boolean o00oo00O(int i, int i2, RectF rectF, RectF rectF2, float f, float f2) {
        o00oOoOo(i, i2, rectF.centerX(), rectF.centerY(), rectF2.centerX(), rectF2.centerY());
        return Math.abs(f - this.f8246o00ooo0) < 20.0f && Math.abs(f2 - this.f8248o00ooo0O) < 20.0f;
    }

    public final void o00oo0O(int i, int i2) {
        float f = this.f8243o00ooOo0;
        float f2 = 0;
        this.f8246o00ooo0 = ((i - 0) * f) + f2;
        this.f8248o00ooo0O = ((i2 - 0) * f) + f2;
    }

    public final void o00oo0O0(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float f7 = this.f8243o00ooOo0;
        float f8 = (f5 * f7) + f;
        float f9 = this.f8242o00ooOo;
        this.f8246o00ooo0 = ((-f6) * f9) + f8;
        this.f8248o00ooo0O = (f5 * f9) + (f6 * f7) + f2;
    }

    public final void o00oo0OO(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float f7 = Float.isNaN(this.f8243o00ooOo0) ? 0.0f : this.f8243o00ooOo0;
        float f8 = Float.isNaN(this.f8245o00ooOoo) ? 0.0f : this.f8245o00ooOoo;
        float f9 = Float.isNaN(this.f8242o00ooOo) ? 0.0f : this.f8242o00ooOo;
        this.f8246o00ooo0 = (int) (((Float.isNaN(this.f8244o00ooOoO) ? 0.0f : this.f8244o00ooOoO) * f6) + (f7 * f5) + f);
        this.f8248o00ooo0O = (int) ((f6 * f9) + (f5 * f8) + f2);
    }

    public void o00oo0Oo(RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr) {
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float centerX2 = rectF2.centerX() - centerX;
        float centerY2 = rectF2.centerY() - centerY;
        String str = strArr[0];
        if (str == null) {
            strArr[0] = f8236o00ooooo;
            fArr[0] = (f - centerX) / centerX2;
            strArr[1] = f8235o00ooooO;
            fArr[1] = (f2 - centerY) / centerY2;
            return;
        }
        float f3 = (f - centerX) / centerX2;
        if (f8236o00ooooo.equals(str)) {
            fArr[0] = f3;
            fArr[1] = (f2 - centerY) / centerY2;
            return;
        }
        fArr[1] = f3;
        fArr[0] = (f2 - centerY) / centerY2;
    }

    public void o00oo0o(View view, RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr) {
        rectF.centerX();
        rectF.centerY();
        rectF2.centerX();
        rectF2.centerY();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        String str = strArr[0];
        if (str == null) {
            strArr[0] = f8236o00ooooo;
            fArr[0] = f / width;
            strArr[1] = f8235o00ooooO;
            fArr[1] = f2 / height;
            return;
        }
        float f3 = f / width;
        if (f8236o00ooooo.equals(str)) {
            fArr[0] = f3;
            fArr[1] = f2 / height;
            return;
        }
        fArr[1] = f3;
        fArr[0] = f2 / height;
    }

    public void o00oo0o0(RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr) {
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float centerX2 = rectF2.centerX() - centerX;
        float centerY2 = rectF2.centerY() - centerY;
        float hypot = (float) Math.hypot(centerX2, centerY2);
        if (hypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        float f3 = centerX2 / hypot;
        float f4 = centerY2 / hypot;
        float f5 = f2 - centerY;
        float f6 = f - centerX;
        float f7 = ((f3 * f5) - (f6 * f4)) / hypot;
        float f8 = ((f4 * f5) + (f3 * f6)) / hypot;
        String str = strArr[0];
        if (str != null) {
            if (f8236o00ooooo.equals(str)) {
                fArr[0] = f8;
                fArr[1] = f7;
                return;
            }
            return;
        }
        strArr[0] = f8236o00ooooo;
        strArr[1] = f8235o00ooooO;
        fArr[0] = f8;
        fArr[1] = f7;
    }
}
