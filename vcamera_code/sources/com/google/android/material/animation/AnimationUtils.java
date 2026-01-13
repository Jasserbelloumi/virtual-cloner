package com.google.android.material.animation;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import o00oOoO0.o00oOoO;
import o00oOooO.o0O0OO0;
import o00oOooO.o0OO0oO;
import o0O00o00.o00oOOo0;
import o0O00o00.o00oOOoO;
import o0O00o00.o00oOo00;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class AnimationUtils {
    public static final TimeInterpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    public static final TimeInterpolator FAST_OUT_SLOW_IN_INTERPOLATOR = new o00oOOoO();
    public static final TimeInterpolator FAST_OUT_LINEAR_IN_INTERPOLATOR = new o00oOOo0();
    public static final TimeInterpolator LINEAR_OUT_SLOW_IN_INTERPOLATOR = new o00oOo00();
    public static final TimeInterpolator DECELERATE_INTERPOLATOR = new DecelerateInterpolator();

    public static float lerp(float f, float f2, float f3) {
        return o00oOoO.o00oOOo0(f2, f, f3, f);
    }

    public static float lerp(float f, float f2, @o0O0OO0(from = 0.0d, to = 1.0d) float f3, @o0O0OO0(from = 0.0d, to = 1.0d) float f4, @o0O0OO0(from = 0.0d, to = 1.0d) float f5) {
        return f5 < f3 ? f : f5 > f4 ? f2 : lerp(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static int lerp(int i, int i2, float f) {
        return Math.round(f * (i2 - i)) + i;
    }
}
