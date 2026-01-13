package o0O00O0;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oOOoO {

    @o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static PathInterpolator o00oOOo0(float f, float f2) {
            return new PathInterpolator(f, f2);
        }

        @o0O0O0Oo
        public static PathInterpolator o00oOOoO(float f, float f2, float f3, float f4) {
            return new PathInterpolator(f, f2, f3, f4);
        }

        @o0O0O0Oo
        public static PathInterpolator o00oOo00(Path path) {
            return new PathInterpolator(path);
        }
    }

    @oo0oO0
    public static Interpolator o00oOOo0(float f, float f2) {
        return o00oOOo0.o00oOOo0(f, f2);
    }

    @oo0oO0
    public static Interpolator o00oOOoO(float f, float f2, float f3, float f4) {
        return o00oOOo0.o00oOOoO(f, f2, f3, f4);
    }

    @oo0oO0
    public static Interpolator o00oOo00(@oo0oO0 Path path) {
        return o00oOOo0.o00oOo00(path);
    }
}
