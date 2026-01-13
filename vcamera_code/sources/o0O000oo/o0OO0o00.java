package o0O000oo;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.util.Objects;
/* loaded from: classes.dex */
public final class o0OO0o00 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f10699o00oOOo0 = "ViewParentCompat";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static int[] f10700o00oOOoO;

    @o00oOooO.o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o00oOooO.o0O0O0Oo
        public static void o00oOOo0(ViewParent viewParent, View view, View view2, int i) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }
    }

    @o00oOooO.o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o00oOooO.o0O0O0Oo
        public static boolean o00oOOo0(ViewParent viewParent, View view, float f, float f2, boolean z) {
            return viewParent.onNestedFling(view, f, f2, z);
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOOoO(ViewParent viewParent, View view, float f, float f2) {
            return viewParent.onNestedPreFling(view, f, f2);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOo00(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            viewParent.onNestedPreScroll(view, i, i2, iArr);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOo0O(ViewParent viewParent, View view, View view2, int i) {
            viewParent.onNestedScrollAccepted(view, view2, i);
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOo0o(ViewParent viewParent, View view, View view2, int i) {
            return viewParent.onStartNestedScroll(view, view2, i);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOoO0(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOooO(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            viewParent.onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public static int[] o00oOOo0() {
        int[] iArr = f10700o00oOOoO;
        if (iArr == null) {
            f10700o00oOOoO = new int[2];
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        return f10700o00oOOoO;
    }

    public static void o00oOOoO(@o00oOooO.oo0oO0 ViewParent viewParent, @o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 View view2, int i) {
        o00oOOo0.o00oOOo0(viewParent, view, view2, i);
    }

    public static boolean o00oOo00(@o00oOooO.oo0oO0 ViewParent viewParent, @o00oOooO.oo0oO0 View view, float f, float f2, boolean z) {
        try {
            return o00oOOoO.o00oOOo0(viewParent, view, f, f2, z);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParent);
            return false;
        }
    }

    public static void o00oOo0O(@o00oOooO.oo0oO0 ViewParent viewParent, @o00oOooO.oo0oO0 View view, int i, int i2, @o00oOooO.oo0oO0 int[] iArr) {
        o00oOo0o(viewParent, view, i, i2, iArr, 0);
    }

    public static void o00oOo0o(@o00oOooO.oo0oO0 ViewParent viewParent, @o00oOooO.oo0oO0 View view, int i, int i2, @o00oOooO.oo0oO0 int[] iArr, int i3) {
        if (viewParent instanceof o0oO0O0o) {
            ((o0oO0O0o) viewParent).onNestedPreScroll(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            try {
                o00oOOoO.o00oOo00(viewParent, view, i, i2, iArr);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }

    public static void o00oOoO(@o00oOooO.oo0oO0 ViewParent viewParent, @o00oOooO.oo0oO0 View view, int i, int i2, int i3, int i4, int i5) {
        o00oOoOO(viewParent, view, i, i2, i3, i4, i5, o00oOOo0());
    }

    public static void o00oOoO0(@o00oOooO.oo0oO0 ViewParent viewParent, @o00oOooO.oo0oO0 View view, int i, int i2, int i3, int i4) {
        o00oOoOO(viewParent, view, i, i2, i3, i4, 0, o00oOOo0());
    }

    public static void o00oOoOO(@o00oOooO.oo0oO0 ViewParent viewParent, @o00oOooO.oo0oO0 View view, int i, int i2, int i3, int i4, int i5, @o00oOooO.oo0oO0 int[] iArr) {
        if (viewParent instanceof o0O0oo0o) {
            ((o0O0oo0o) viewParent).onNestedScroll(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof o0oO0O0o) {
            ((o0oO0O0o) viewParent).onNestedScroll(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            try {
                o00oOOoO.o00oOooO(viewParent, view, i, i2, i3, i4);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }

    public static void o00oOoOo(@o00oOooO.oo0oO0 ViewParent viewParent, @o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 View view2, int i) {
        o00oOoo0(viewParent, view, view2, i, 0);
    }

    public static void o00oOoo0(@o00oOooO.oo0oO0 ViewParent viewParent, @o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 View view2, int i, int i2) {
        if (viewParent instanceof o0oO0O0o) {
            ((o0oO0O0o) viewParent).onNestedScrollAccepted(view, view2, i, i2);
        } else if (i2 == 0) {
            try {
                o00oOOoO.o00oOo0O(viewParent, view, view2, i);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }

    public static boolean o00oOooO(@o00oOooO.oo0oO0 ViewParent viewParent, @o00oOooO.oo0oO0 View view, float f, float f2) {
        try {
            return o00oOOoO.o00oOOoO(viewParent, view, f, f2);
        } catch (AbstractMethodError unused) {
            Objects.toString(viewParent);
            return false;
        }
    }

    public static boolean o00oOooo(@o00oOooO.oo0oO0 ViewParent viewParent, @o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 View view2, int i) {
        return o00oo00O(viewParent, view, view2, i, 0);
    }

    public static void o00oo0(@o00oOooO.oo0oO0 ViewParent viewParent, @o00oOooO.oo0oO0 View view) {
        o00oo0OO(viewParent, view, 0);
    }

    public static boolean o00oo00O(@o00oOooO.oo0oO0 ViewParent viewParent, @o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 View view2, int i, int i2) {
        if (viewParent instanceof o0oO0O0o) {
            return ((o0oO0O0o) viewParent).onStartNestedScroll(view, view2, i, i2);
        }
        if (i2 == 0) {
            try {
                return o00oOOoO.o00oOo0o(viewParent, view, view2, i);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
                return false;
            }
        }
        return false;
    }

    @Deprecated
    public static boolean o00oo0O0(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public static void o00oo0OO(@o00oOooO.oo0oO0 ViewParent viewParent, @o00oOooO.oo0oO0 View view, int i) {
        if (viewParent instanceof o0oO0O0o) {
            ((o0oO0O0o) viewParent).onStopNestedScroll(view, i);
        } else if (i == 0) {
            try {
                o00oOOoO.o00oOoO0(viewParent, view);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParent);
            }
        }
    }
}
