package o0O000oo;

import android.view.ViewGroup;
/* loaded from: classes.dex */
public final class o0OoOoOo {

    @o00oOooO.o0OOooO0(17)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o00oOooO.o0O0O0Oo
        public static int o00oOOo0(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        @o00oOooO.o0O0O0Oo
        public static int o00oOOoO(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        @o00oOooO.o0O0O0Oo
        public static int o00oOo00(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOo0O(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.resolveLayoutDirection(i);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOo0o(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setLayoutDirection(i);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOoO(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setMarginStart(i);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOoO0(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setMarginEnd(i);
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOooO(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }
    }

    public static int o00oOOo0(@o00oOooO.oo0oO0 ViewGroup.MarginLayoutParams marginLayoutParams) {
        int o00oOOo02 = o00oOOo0.o00oOOo0(marginLayoutParams);
        if (o00oOOo02 == 0 || o00oOOo02 == 1) {
            return o00oOOo02;
        }
        return 0;
    }

    public static int o00oOOoO(@o00oOooO.oo0oO0 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return o00oOOo0.o00oOOoO(marginLayoutParams);
    }

    public static int o00oOo00(@o00oOooO.oo0oO0 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return o00oOOo0.o00oOo00(marginLayoutParams);
    }

    public static void o00oOo0O(@o00oOooO.oo0oO0 ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        o00oOOo0.o00oOo0O(marginLayoutParams, i);
    }

    public static void o00oOo0o(@o00oOooO.oo0oO0 ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        o00oOOo0.o00oOo0o(marginLayoutParams, i);
    }

    public static void o00oOoO(@o00oOooO.oo0oO0 ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        o00oOOo0.o00oOoO(marginLayoutParams, i);
    }

    public static void o00oOoO0(@o00oOooO.oo0oO0 ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        o00oOOo0.o00oOoO0(marginLayoutParams, i);
    }

    public static boolean o00oOooO(@o00oOooO.oo0oO0 ViewGroup.MarginLayoutParams marginLayoutParams) {
        return o00oOOo0.o00oOooO(marginLayoutParams);
    }
}
