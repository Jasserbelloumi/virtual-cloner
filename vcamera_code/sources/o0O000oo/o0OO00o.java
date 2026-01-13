package o0O000oo;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
/* loaded from: classes.dex */
public final class o0OO00o {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f10694o00oOOo0 = 0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f10695o00oOOoO = 1;

    @o00oOooO.o0OOooO0(18)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o00oOooO.o0O0O0Oo
        public static int o00oOOo0(ViewGroup viewGroup) {
            return viewGroup.getLayoutMode();
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOOoO(ViewGroup viewGroup, int i) {
            viewGroup.setLayoutMode(i);
        }
    }

    @o00oOooO.o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o00oOooO.o0O0O0Oo
        public static int o00oOOo0(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOOoO(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOo00(ViewGroup viewGroup, boolean z) {
            viewGroup.setTransitionGroup(z);
        }
    }

    public static int o00oOOo0(@o00oOooO.oo0oO0 ViewGroup viewGroup) {
        return o00oOOo0.o00oOOo0(viewGroup);
    }

    public static int o00oOOoO(@o00oOooO.oo0oO0 ViewGroup viewGroup) {
        return o00oOOoO.o00oOOo0(viewGroup);
    }

    public static boolean o00oOo00(@o00oOooO.oo0oO0 ViewGroup viewGroup) {
        return o00oOOoO.o00oOOoO(viewGroup);
    }

    public static void o00oOo0O(@o00oOooO.oo0oO0 ViewGroup viewGroup, int i) {
        o00oOOo0.o00oOOoO(viewGroup, i);
    }

    @Deprecated
    public static void o00oOo0o(ViewGroup viewGroup, boolean z) {
        viewGroup.setMotionEventSplittingEnabled(z);
    }

    public static void o00oOoO0(@o00oOooO.oo0oO0 ViewGroup viewGroup, boolean z) {
        o00oOOoO.o00oOo00(viewGroup, z);
    }

    @Deprecated
    public static boolean o00oOooO(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return viewGroup.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
