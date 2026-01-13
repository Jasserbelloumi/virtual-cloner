package o0OOoo0O;

import java.nio.FloatBuffer;
import o0OOoo0O.o0OOO0;
/* loaded from: classes3.dex */
public class o0OOOO {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public oO000OOo f15093o00oOOoO;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final oO0o0o f15092o00oOOo0 = new oO0o0o(o0OOO0.o00oOOoO.FULL_RECTANGLE);

    /* renamed from: o00oOo00  reason: collision with root package name */
    public FloatBuffer f15094o00oOo00 = null;

    public o0OOOO(oO000OOo oo000ooo) {
        this.f15093o00oOOoO = oo000ooo;
    }

    public void o00oOOo0(oO000OOo oo000ooo) {
        this.f15093o00oOOoO.o00oOooO();
        this.f15093o00oOOoO = oo000ooo;
    }

    public int o00oOOoO() {
        return this.f15093o00oOOoO.o00oOOo0();
    }

    public void o00oOo00(int i) {
        float[] fArr = o0o0000.f15122o00oOOoO;
        o00oOo0O(i, fArr, fArr);
    }

    public void o00oOo0O(int i, float[] fArr, float[] fArr2) {
        this.f15093o00oOOoO.o00oOOoO(fArr, this.f15094o00oOo00, 0, this.f15092o00oOOo0.o00oOo0O(), this.f15092o00oOOo0.o00oOOo0(), this.f15092o00oOOo0.o00oOo0o(), fArr2, this.f15092o00oOOo0.o00oOOoO(), i, this.f15092o00oOOo0.o00oOo00());
    }

    public oO000OOo o00oOo0o() {
        return this.f15093o00oOOoO;
    }

    public void o00oOoO(float f) {
        this.f15092o00oOOo0.o00oo00O(f);
    }

    public void o00oOoO0(boolean z) {
        oO000OOo oo000ooo = this.f15093o00oOOoO;
        if (oo000ooo != null) {
            if (z) {
                oo000ooo.o00oOooO();
            }
            this.f15093o00oOOoO = null;
        }
    }

    public void o00oOoOO(ooOOOOoo oooooooo) {
        this.f15092o00oOOo0.o00oOoo0(oooooooo);
    }

    public void o00oOoOo(FloatBuffer floatBuffer) {
        this.f15094o00oOo00 = floatBuffer;
    }

    public void o00oOooO(int i, float[] fArr) {
        o00oOo0O(i, o0o0000.f15122o00oOOoO, fArr);
    }
}
