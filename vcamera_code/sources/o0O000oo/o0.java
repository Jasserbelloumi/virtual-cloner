package o0O000oo;

import android.graphics.Rect;
import android.view.Gravity;
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f10417o00oOOo0 = 8388608;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f10418o00oOOoO = 8388611;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f10419o00oOo00 = 8388613;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f10420o00oOooO = 8388615;

    @o00oOooO.o0OOooO0(17)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o00oOooO.o0O0O0Oo
        public static void o00oOOo0(int i, int i2, int i3, Rect rect, int i4, int i5, Rect rect2, int i6) {
            Gravity.apply(i, i2, i3, rect, i4, i5, rect2, i6);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOOoO(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOo00(int i, Rect rect, Rect rect2, int i2) {
            Gravity.applyDisplay(i, rect, rect2, i2);
        }
    }

    public static void o00oOOo0(int i, int i2, int i3, @o00oOooO.oo0oO0 Rect rect, int i4, int i5, @o00oOooO.oo0oO0 Rect rect2, int i6) {
        o00oOOo0.o00oOOo0(i, i2, i3, rect, i4, i5, rect2, i6);
    }

    public static void o00oOOoO(int i, int i2, int i3, @o00oOooO.oo0oO0 Rect rect, @o00oOooO.oo0oO0 Rect rect2, int i4) {
        o00oOOo0.o00oOOoO(i, i2, i3, rect, rect2, i4);
    }

    public static void o00oOo00(int i, @o00oOooO.oo0oO0 Rect rect, @o00oOooO.oo0oO0 Rect rect2, int i2) {
        o00oOOo0.o00oOo00(i, rect, rect2, i2);
    }

    public static int o00oOooO(int i, int i2) {
        return Gravity.getAbsoluteGravity(i, i2);
    }
}
