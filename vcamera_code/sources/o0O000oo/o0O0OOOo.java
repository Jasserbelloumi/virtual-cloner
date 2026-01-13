package o0O000oo;

import android.view.ScaleGestureDetector;
/* loaded from: classes.dex */
public final class o0O0OOOo {

    @o00oOooO.o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o00oOooO.o0O0O0Oo
        public static boolean o00oOOo0(ScaleGestureDetector scaleGestureDetector) {
            return scaleGestureDetector.isQuickScaleEnabled();
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOOoO(ScaleGestureDetector scaleGestureDetector, boolean z) {
            scaleGestureDetector.setQuickScaleEnabled(z);
        }
    }

    public static boolean o00oOOo0(@o00oOooO.oo0oO0 ScaleGestureDetector scaleGestureDetector) {
        return o00oOOo0.o00oOOo0(scaleGestureDetector);
    }

    @Deprecated
    public static boolean o00oOOoO(Object obj) {
        return o00oOOo0.o00oOOo0((ScaleGestureDetector) obj);
    }

    public static void o00oOo00(@o00oOooO.oo0oO0 ScaleGestureDetector scaleGestureDetector, boolean z) {
        o00oOOo0.o00oOOoO(scaleGestureDetector, z);
    }

    @Deprecated
    public static void o00oOooO(Object obj, boolean z) {
        o00oOOo0.o00oOOoO((ScaleGestureDetector) obj, z);
    }
}
