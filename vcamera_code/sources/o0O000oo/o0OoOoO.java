package o0O000oo;

import android.content.Context;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class o0OoOoO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f10812o00oOOo0 = "ViewConfigCompat";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static Method f10813o00oOOoO;

    @o00oOooO.o0OOooO0(26)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o00oOooO.o0O0O0Oo
        public static float o00oOOo0(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        @o00oOooO.o0O0O0Oo
        public static float o00oOOoO(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    @o00oOooO.o0OOooO0(28)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o00oOooO.o0O0O0Oo
        public static int o00oOOo0(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOOoO(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    public static float o00oOOo0(ViewConfiguration viewConfiguration, Context context) {
        Method method = f10813o00oOOoO;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    public static float o00oOOoO(@o00oOooO.oo0oO0 ViewConfiguration viewConfiguration, @o00oOooO.oo0oO0 Context context) {
        return o00oOOo0.o00oOOo0(viewConfiguration);
    }

    public static int o00oOo00(@o00oOooO.oo0oO0 ViewConfiguration viewConfiguration) {
        return o00oOOoO.o00oOOo0(viewConfiguration);
    }

    public static float o00oOo0O(@o00oOooO.oo0oO0 ViewConfiguration viewConfiguration, @o00oOooO.oo0oO0 Context context) {
        return o00oOOo0.o00oOOoO(viewConfiguration);
    }

    @Deprecated
    public static boolean o00oOo0o(ViewConfiguration viewConfiguration) {
        return viewConfiguration.hasPermanentMenuKey();
    }

    public static boolean o00oOoO0(@o00oOooO.oo0oO0 ViewConfiguration viewConfiguration, @o00oOooO.oo0oO0 Context context) {
        return o00oOOoO.o00oOOoO(viewConfiguration);
    }

    @Deprecated
    public static int o00oOooO(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledPagingTouchSlop();
    }
}
