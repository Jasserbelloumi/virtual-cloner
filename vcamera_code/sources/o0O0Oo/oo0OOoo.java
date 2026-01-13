package o0O0Oo;

import android.animation.TypeEvaluator;
import o00oOoO0.o00oOoO;
import o00oOooO.o0OO0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class oo0OOoo implements TypeEvaluator {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final oo0OOoo f11759o00oOOo0 = new oo0OOoo();

    public static oo0OOoo o00oOOo0() {
        return f11759o00oOOo0;
    }

    @Override // android.animation.TypeEvaluator
    public Object evaluate(float f, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f2 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float o00oOOo02 = o00oOoO.o00oOOo0(((intValue2 >> 24) & 255) / 255.0f, f2, f, f2);
        float o00oOOo03 = o00oOoO.o00oOOo0(pow4, pow, f, pow);
        float o00oOOo04 = o00oOoO.o00oOOo0((float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d), pow2, f, pow2);
        float o00oOOo05 = o00oOoO.o00oOOo0((float) Math.pow((intValue2 & 255) / 255.0f, 2.2d), pow3, f, pow3);
        int round = Math.round(((float) Math.pow(o00oOOo03, 0.45454545454545453d)) * 255.0f) << 16;
        return Integer.valueOf(Math.round(((float) Math.pow(o00oOOo05, 0.45454545454545453d)) * 255.0f) | round | (Math.round(o00oOOo02 * 255.0f) << 24) | (Math.round(((float) Math.pow(o00oOOo04, 0.45454545454545453d)) * 255.0f) << 8));
    }
}
