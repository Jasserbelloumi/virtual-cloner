package o0O00o00;

import android.view.animation.Interpolator;
import o00oOoO0.o00oOoO;
/* loaded from: classes.dex */
public abstract class o00oOo0O implements Interpolator {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final float[] f11135o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final float f11136o00oOOoO;

    public o00oOo0O(float[] fArr) {
        this.f11135o00oOOo0 = fArr;
        this.f11136o00oOOoO = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f11135o00oOOo0;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f11136o00oOOoO;
        float f3 = (f - (min * f2)) / f2;
        float[] fArr2 = this.f11135o00oOOo0;
        float f4 = fArr2[min];
        return o00oOoO.o00oOOo0(fArr2[min + 1], f4, f3, f4);
    }
}
