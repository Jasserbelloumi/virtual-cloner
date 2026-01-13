package o0OOoo0O;

import android.opengl.Matrix;
import com.google.common.base.Ascii;
import o0OOoO0.o00oo;
/* loaded from: classes3.dex */
public class oO000O {

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final String f15133o00oOooo = o00oo.o00oOOo0(new byte[]{42, Ascii.DC2, -44, -120}, new byte[]{124, 81, -75, -27, 59, -71, -105, 35});

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public o0OOO0 f15134o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public float[] f15135o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f15136o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public float f15137o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public float f15138o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public float f15139o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public float f15140o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public float[] f15141o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public boolean f15142o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public float[] f15143o00oOoo0 = new float[16];

    /* renamed from: o00oOooO  reason: collision with root package name */
    public float f15144o00oOooO;

    public oO000O(o0OOO0 o0ooo0) {
        this.f15134o00oOOo0 = o0ooo0;
        float[] fArr = new float[4];
        this.f15135o00oOOoO = fArr;
        fArr[3] = 1.0f;
        this.f15136o00oOo00 = -1;
        this.f15141o00oOoOO = new float[16];
        this.f15142o00oOoOo = false;
    }

    public void o00oOOo0(o0OOOO0o o0oooo0o, float[] fArr) {
        Matrix.multiplyMM(this.f15143o00oOoo0, 0, fArr, 0, o00oOooO(), 0);
        o0oooo0o.o00oOOo0(this.f15143o00oOoo0, this.f15135o00oOOoO, this.f15134o00oOOo0.o00oOooO(), 0, this.f15134o00oOOo0.o00oOo0O(), this.f15134o00oOOo0.o00oOOo0(), this.f15134o00oOOo0.o00oOo0o());
    }

    public void o00oOOoO(oO000OOo oo000ooo, float[] fArr) {
        Matrix.multiplyMM(this.f15143o00oOoo0, 0, fArr, 0, o00oOooO(), 0);
        oo000ooo.o00oOOoO(this.f15143o00oOoo0, this.f15134o00oOOo0.o00oOooO(), 0, this.f15134o00oOOo0.o00oOo0O(), this.f15134o00oOOo0.o00oOOo0(), this.f15134o00oOOo0.o00oOo0o(), o0o0000.f15122o00oOOoO, this.f15134o00oOOo0.o00oOOoO(), this.f15136o00oOo00, this.f15134o00oOOo0.o00oOo00());
    }

    public float[] o00oOo00() {
        return this.f15135o00oOOoO;
    }

    public float o00oOo0O() {
        return this.f15140o00oOoO0;
    }

    public float o00oOo0o() {
        return this.f15139o00oOoO;
    }

    public float o00oOoO() {
        return this.f15137o00oOo0O;
    }

    public float o00oOoO0() {
        return this.f15144o00oOooO;
    }

    public float o00oOoOO() {
        return this.f15138o00oOo0o;
    }

    public final void o00oOoOo() {
        float[] fArr = this.f15141o00oOoOO;
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, this.f15140o00oOoO0, this.f15139o00oOoO, 0.0f);
        float f = this.f15144o00oOooO;
        if (f != 0.0f) {
            Matrix.rotateM(fArr, 0, f, 0.0f, 0.0f, 1.0f);
        }
        Matrix.scaleM(fArr, 0, this.f15137o00oOo0O, this.f15138o00oOo0o, 1.0f);
        this.f15142o00oOoOo = true;
    }

    public void o00oOoo0(float f, float f2, float f3) {
        float[] fArr = this.f15135o00oOOoO;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
    }

    public float[] o00oOooO() {
        if (!this.f15142o00oOoOo) {
            o00oOoOo();
        }
        return this.f15141o00oOoOO;
    }

    public void o00oOooo(float f, float f2) {
        this.f15140o00oOoO0 = f;
        this.f15139o00oOoO = f2;
        this.f15142o00oOoOo = false;
    }

    public void o00oo0(float f, float f2) {
        this.f15137o00oOo0O = f;
        this.f15138o00oOo0o = f2;
        this.f15142o00oOoOo = false;
    }

    public void o00oo00O(float f) {
        while (f >= 360.0f) {
            f -= 360.0f;
        }
        while (f <= -360.0f) {
            f += 360.0f;
        }
        this.f15144o00oOooO = f;
        this.f15142o00oOoOo = false;
    }

    public void o00oo0OO(int i) {
        this.f15136o00oOo00 = i;
    }

    public String toString() {
        return o00oo.o00oOOo0(new byte[]{-3, 43, 47, Byte.MAX_VALUE, -51, 122, 106, 100, -62, 88, 47, 98, -41, 51}, new byte[]{-90, 120, 95, Ascii.CR, -92, Ascii.SO, Ascii.SI, 86}) + this.f15140o00oOoO0 + o00oo.o00oOOo0(new byte[]{117}, new byte[]{89, -83, -80, -36, 76, -103, 41, -117}) + this.f15139o00oOoO + o00oo.o00oOOo0(new byte[]{76, -111, -125, Ascii.GS, 76, 70, -48}, new byte[]{108, -30, -32, 124, 32, 35, -19, -64}) + this.f15137o00oOo0O + o00oo.o00oOOo0(new byte[]{-119}, new byte[]{-91, -113, 84, 45, -31, 3, 38, -80}) + this.f15138o00oOo0o + o00oo.o00oOOo0(new byte[]{-18, -125, -40, 70, 99, -45, Ascii.SO}, new byte[]{-50, -30, -74, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, Ascii.SI, -74, 51, Ascii.CAN}) + this.f15144o00oOooO + o00oo.o00oOOo0(new byte[]{46, 89, 69, 97, -113, 95, -2, -127}, new byte[]{Ascii.SO, 58, 42, Ascii.CR, -32, 45, -61, -6}) + this.f15135o00oOOoO[0] + o00oo.o00oOOo0(new byte[]{50}, new byte[]{Ascii.RS, 2, -4, 45, -124, Ascii.DC2, 39, 63}) + this.f15135o00oOOoO[1] + o00oo.o00oOOo0(new byte[]{-124}, new byte[]{-88, Ascii.ETB, -92, 82, -109, -119, -16, -2}) + this.f15135o00oOOoO[2] + o00oo.o00oOOo0(new byte[]{-88, Ascii.FF, -47, 75, 56, -19, -35, 45, -71, 73, -120}, new byte[]{-43, 44, -75, 57, 89, -102, -68, 79}) + this.f15134o00oOOo0 + o00oo.o00oOOo0(new byte[]{-31}, new byte[]{-68, -96, -47, 5, 92, -115, -12, -125});
    }
}
