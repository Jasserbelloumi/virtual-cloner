package o0OOoo0O;

import com.google.common.base.Ascii;
import java.nio.FloatBuffer;
import java.util.Arrays;
import o0OOoO0.o00oo;
import o0OOoo0O.ooOOOOoo;
/* loaded from: classes3.dex */
public class o0OOO0 {

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f15055o00oOoOo = 4;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final float[] f15056o00oOoo0;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final float[] f15057o00oOooo;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final FloatBuffer f15058o00oo0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final FloatBuffer f15059o00oo00O;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final FloatBuffer f15060o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final float[] f15061o00oo0O0;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final float[] f15062o00oo0OO;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final FloatBuffer f15063o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final float[] f15064o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final float[] f15065o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final FloatBuffer f15066o00oo0oO;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final FloatBuffer f15067o0O0o;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public float[] f15068o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public FloatBuffer f15069o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public float[] f15070o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f15071o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public int f15072o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public int f15073o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public int f15074o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public o00oOOoO f15075o00oOoOO;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public FloatBuffer f15076o00oOooO;

    /* loaded from: classes3.dex */
    public static /* synthetic */ class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f15077o00oOOo0;

        static {
            int[] iArr = new int[o00oOOoO.values().length];
            f15077o00oOOo0 = iArr;
            try {
                iArr[o00oOOoO.TRIANGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15077o00oOOo0[o00oOOoO.RECTANGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15077o00oOOo0[o00oOOoO.FULL_RECTANGLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public enum o00oOOoO {
        TRIANGLE,
        RECTANGLE,
        FULL_RECTANGLE
    }

    static {
        float[] fArr = {0.0f, 0.57735026f, -0.5f, -0.28867513f, 0.5f, -0.28867513f};
        f15056o00oOoo0 = fArr;
        float[] fArr2 = {0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        f15057o00oOooo = fArr2;
        f15059o00oo00O = o0o0000.o00oOo00(fArr);
        f15058o00oo0 = o0o0000.o00oOo00(fArr2);
        float[] fArr3 = {-0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0.5f, 0.5f};
        f15062o00oo0OO = fArr3;
        float[] fArr4 = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        f15061o00oo0O0 = fArr4;
        f15060o00oo0O = o0o0000.o00oOo00(fArr3);
        f15063o00oo0Oo = o0o0000.o00oOo00(fArr4);
        float[] fArr5 = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        f15065o00oo0o0 = fArr5;
        float[] fArr6 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        f15064o00oo0o = fArr6;
        f15066o00oo0oO = o0o0000.o00oOo00(fArr5);
        f15067o0O0o = o0o0000.o00oOo00(fArr6);
    }

    public o0OOO0(o00oOOoO o00ooooo2) {
        int length;
        int i = o00oOOo0.f15077o00oOOo0[o00ooooo2.ordinal()];
        if (i == 1) {
            this.f15069o00oOOoO = f15059o00oo00O;
            this.f15076o00oOooO = f15058o00oo0;
            this.f15072o00oOo0o = 2;
            this.f15074o00oOoO0 = 2 * 4;
            length = f15056o00oOoo0.length;
        } else if (i == 2) {
            this.f15069o00oOOoO = f15060o00oo0O;
            this.f15076o00oOooO = f15063o00oo0Oo;
            this.f15072o00oOo0o = 2;
            this.f15074o00oOoO0 = 2 * 4;
            length = f15062o00oo0OO.length;
        } else if (i != 3) {
            throw new RuntimeException(o00oo.o00oOOo0(new byte[]{96, -16, -73, Ascii.GS, 43, Ascii.CAN, 91, 55, 70, -10, -67, 3, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, 79}, new byte[]{53, -98, -36, 115, 68, 111, 53, Ascii.ETB}) + o00ooooo2);
        } else {
            this.f15069o00oOOoO = f15066o00oo0oO;
            this.f15076o00oOooO = f15067o0O0o;
            this.f15072o00oOo0o = 2;
            this.f15074o00oOoO0 = 2 * 4;
            length = f15065o00oo0o0.length;
        }
        this.f15071o00oOo0O = length / 2;
        this.f15073o00oOoO = 8;
        this.f15075o00oOoOO = o00ooooo2;
    }

    public int o00oOOo0() {
        return this.f15072o00oOo0o;
    }

    public FloatBuffer o00oOOoO() {
        return this.f15076o00oOooO;
    }

    public int o00oOo00() {
        return this.f15073o00oOoO;
    }

    public int o00oOo0O() {
        return this.f15071o00oOo0O;
    }

    public int o00oOo0o() {
        return this.f15074o00oOoO0;
    }

    public final void o00oOoO(int i) {
        switch (i) {
            case 2002:
                o00oOooo(this.f15070o00oOo00, 0, 2);
                o00oOooo(this.f15070o00oOo00, 4, 6);
                return;
            case 2003:
                o00oOooo(this.f15070o00oOo00, 1, 5);
                o00oOooo(this.f15070o00oOo00, 3, 7);
                return;
            case 2004:
                o00oOooo(this.f15070o00oOo00, 0, 2);
                o00oOooo(this.f15070o00oOo00, 4, 6);
                o00oOooo(this.f15070o00oOo00, 1, 5);
                o00oOooo(this.f15070o00oOo00, 3, 7);
                return;
            default:
                return;
        }
    }

    public final void o00oOoO0(float f, float f2, float f3, float f4) {
        float f5 = f3 + f;
        float f6 = f4 + f2;
        float[] fArr = this.f15070o00oOo00;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f5;
        fArr[3] = f2;
        fArr[4] = f;
        fArr[5] = f6;
        fArr[6] = f5;
        fArr[7] = f6;
    }

    public final void o00oOoOO(int i) {
        if (i == 90) {
            float[] fArr = this.f15070o00oOo00;
            float f = fArr[0];
            float f2 = fArr[1];
            fArr[0] = fArr[4];
            fArr[1] = fArr[5];
            fArr[4] = fArr[6];
            fArr[5] = fArr[7];
            fArr[6] = fArr[2];
            fArr[7] = fArr[3];
            fArr[2] = f;
            fArr[3] = f2;
        } else if (i == 180) {
            o00oOooo(this.f15070o00oOo00, 0, 6);
            o00oOooo(this.f15070o00oOo00, 1, 7);
            o00oOooo(this.f15070o00oOo00, 2, 4);
            o00oOooo(this.f15070o00oOo00, 3, 5);
        } else if (i != 270) {
        } else {
            float[] fArr2 = this.f15070o00oOo00;
            float f3 = fArr2[0];
            float f4 = fArr2[1];
            fArr2[0] = fArr2[2];
            fArr2[1] = fArr2[3];
            fArr2[2] = fArr2[6];
            fArr2[3] = fArr2[7];
            fArr2[6] = fArr2[4];
            fArr2[7] = fArr2[5];
            fArr2[4] = f3;
            fArr2[5] = f4;
        }
    }

    public final void o00oOoOo(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 1001 || i * i4 == i2 * i3) {
            return;
        }
        float f = i / i2;
        float f2 = i3 / i4;
        if (i5 == 1002) {
            if (f < f2) {
                float f3 = f2 / f;
                float[] fArr = this.f15068o00oOOo0;
                fArr[1] = fArr[1] * f3;
                fArr[3] = fArr[3] * f3;
                fArr[5] = fArr[5] * f3;
                fArr[7] = fArr[7] * f3;
                return;
            }
            float f4 = f / f2;
            float[] fArr2 = this.f15068o00oOOo0;
            fArr2[0] = fArr2[0] * f4;
            fArr2[2] = fArr2[2] * f4;
            fArr2[4] = fArr2[4] * f4;
            fArr2[6] = fArr2[6] * f4;
        } else if (i5 == 1003) {
            if (f < f2) {
                float f5 = f / f2;
                float[] fArr3 = this.f15068o00oOOo0;
                fArr3[0] = fArr3[0] * f5;
                fArr3[2] = fArr3[2] * f5;
                fArr3[4] = fArr3[4] * f5;
                fArr3[6] = fArr3[6] * f5;
                return;
            }
            float f6 = f2 / f;
            float[] fArr4 = this.f15068o00oOOo0;
            fArr4[1] = fArr4[1] * f6;
            fArr4[3] = fArr4[3] * f6;
            fArr4[5] = fArr4[5] * f6;
            fArr4[7] = fArr4[7] * f6;
        }
    }

    public void o00oOoo0(ooOOOOoo oooooooo) {
        ooOOOOoo.o00oOOoO o00ooooo2;
        if (this.f15075o00oOoOO != o00oOOoO.FULL_RECTANGLE) {
            return;
        }
        float[] fArr = f15065o00oo0o0;
        this.f15068o00oOOo0 = Arrays.copyOf(fArr, fArr.length);
        this.f15070o00oOo00 = new float[8];
        ooOOOOoo.o00oOOo0 o00oooo02 = oooooooo.f15327o00oOOo0;
        if (o00oooo02 == null) {
            o00oooo02 = ooOOOOoo.f15316o00oOoO0;
        }
        o00oOoO0(o00oooo02.f15333o00oOOo0, o00oooo02.f15334o00oOOoO, o00oooo02.f15335o00oOo00, o00oooo02.f15336o00oOooO);
        o00oOoO(oooooooo.f15328o00oOOoO);
        o00oOoOO(oooooooo.f15329o00oOo00);
        ooOOOOoo.o00oOOoO o00ooooo3 = oooooooo.f15332o00oOooO;
        if (o00ooooo3 != null && (o00ooooo2 = oooooooo.f15330o00oOo0O) != null) {
            o00oOoOo(o00ooooo3.f15337o00oOOo0, o00ooooo3.f15338o00oOOoO, o00ooooo2.f15337o00oOOo0, o00ooooo2.f15338o00oOOoO, oooooooo.f15331o00oOo0o);
        }
        this.f15069o00oOOoO = o0o0000.o00oOo00(this.f15068o00oOOo0);
        this.f15076o00oOooO = o0o0000.o00oOo00(this.f15070o00oOo00);
    }

    public FloatBuffer o00oOooO() {
        return this.f15069o00oOOoO;
    }

    public final void o00oOooo(float[] fArr, int i, int i2) {
        float f = fArr[i];
        fArr[i] = fArr[i2];
        fArr[i2] = f;
    }

    public String toString() {
        if (this.f15075o00oOoOO != null) {
            return o00oo.o00oOOo0(new byte[]{67, -4, -120, 83, 47, 58, 90, -40, 125, -118, -98, 8, 120}, new byte[]{Ascii.CAN, -72, -6, 50, 88, 91, 56, -76}) + this.f15075o00oOoOO + o00oo.o00oOOo0(new byte[]{-119}, new byte[]{-44, -43, 49, Ascii.SYN, 84, 96, 92, -51});
        }
        return o00oo.o00oOOo0(new byte[]{-55, -60, -74, -4, -67, 2, Ascii.SO, 91, -9, -78, -96, -89, -22, 77, 66, Ascii.EM, -49}, new byte[]{-110, Byte.MIN_VALUE, -60, -99, -54, 99, 108, 55});
    }
}
