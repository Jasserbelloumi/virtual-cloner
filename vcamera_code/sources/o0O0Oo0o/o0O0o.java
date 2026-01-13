package o0O0Oo0o;

import android.animation.TypeEvaluator;
import o00oOoO0.o00oOoO;
/* loaded from: classes.dex */
public class o0O0o implements TypeEvaluator<float[]> {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public float[] f11939o00oOOo0;

    public o0O0o(float[] fArr) {
        this.f11939o00oOOo0 = fArr;
    }

    @Override // android.animation.TypeEvaluator
    /* renamed from: o00oOOo0 */
    public float[] evaluate(float f, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.f11939o00oOOo0;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i = 0; i < fArr3.length; i++) {
            float f2 = fArr[i];
            fArr3[i] = o00oOoO.o00oOOo0(fArr2[i], f2, f, f2);
        }
        return fArr3;
    }
}
