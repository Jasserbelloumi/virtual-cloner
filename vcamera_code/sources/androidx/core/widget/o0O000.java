package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o0O000 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f2519o00oOOo0 = "PopupWindowCompatApi21";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static Method f2520o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static boolean f2521o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static boolean f2522o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static Field f2523o00oOo0o;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static boolean f2524o00oOoO0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static Method f2525o00oOooO;

    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static void o00oOOo0(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2, i3);
        }
    }

    @o0OOooO0(23)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0O0O0Oo
        public static boolean o00oOOo0(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        @o0O0O0Oo
        public static int o00oOOoO(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        @o0O0O0Oo
        public static void o00oOo00(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        @o0O0O0Oo
        public static void o00oOooO(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }
    }

    public static boolean o00oOOo0(@oo0oO0 PopupWindow popupWindow) {
        return o00oOOoO.o00oOOo0(popupWindow);
    }

    public static int o00oOOoO(@oo0oO0 PopupWindow popupWindow) {
        return o00oOOoO.o00oOOoO(popupWindow);
    }

    public static void o00oOo00(@oo0oO0 PopupWindow popupWindow, boolean z) {
        o00oOOoO.o00oOo00(popupWindow, z);
    }

    public static void o00oOo0O(@oo0oO0 PopupWindow popupWindow, @oo0oO0 View view, int i, int i2, int i3) {
        o00oOOo0.o00oOOo0(popupWindow, view, i, i2, i3);
    }

    public static void o00oOooO(@oo0oO0 PopupWindow popupWindow, int i) {
        o00oOOoO.o00oOooO(popupWindow, i);
    }
}
