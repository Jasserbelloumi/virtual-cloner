package o0O0Oo0o;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
/* loaded from: classes.dex */
public class o0O000o0 implements TypeEvaluator<Rect> {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public Rect f11915o00oOOo0;

    public o0O000o0() {
    }

    public o0O000o0(Rect rect) {
        this.f11915o00oOOo0 = rect;
    }

    @Override // android.animation.TypeEvaluator
    /* renamed from: o00oOOo0 */
    public Rect evaluate(float f, Rect rect, Rect rect2) {
        int i = rect.left;
        int i2 = i + ((int) ((rect2.left - i) * f));
        int i3 = rect.top;
        int i4 = i3 + ((int) ((rect2.top - i3) * f));
        int i5 = rect.right;
        int i6 = i5 + ((int) ((rect2.right - i5) * f));
        int i7 = rect.bottom;
        int i8 = i7 + ((int) ((rect2.bottom - i7) * f));
        Rect rect3 = this.f11915o00oOOo0;
        if (rect3 == null) {
            return new Rect(i2, i4, i6, i8);
        }
        rect3.set(i2, i4, i6, i8);
        return this.f11915o00oOOo0;
    }
}
