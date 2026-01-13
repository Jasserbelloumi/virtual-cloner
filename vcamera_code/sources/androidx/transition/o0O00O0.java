package androidx.transition;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o0O00O0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f5177o00oOOo0 = "ViewGroupUtilsApi14";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f5178o00oOOoO = 4;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static LayoutTransition f5179o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static boolean f5180o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static Method f5181o00oOo0o;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static boolean f5182o00oOoO0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static Field f5183o00oOooO;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends LayoutTransition {
        @Override // android.animation.LayoutTransition
        public boolean isChangingLayout() {
            return true;
        }
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static void o00oOOo0(LayoutTransition layoutTransition) {
        if (!f5182o00oOoO0) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f5181o00oOo0o = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f5182o00oOoO0 = true;
        }
        Method method = f5181o00oOo0o;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
    }

    public static void o00oOOoO(@oo0oO0 ViewGroup viewGroup, boolean z) {
        boolean z2 = false;
        if (f5179o00oOo00 == null) {
            o00oOOo0 o00oooo02 = new o00oOOo0();
            f5179o00oOo00 = o00oooo02;
            o00oooo02.setAnimator(2, null);
            f5179o00oOo00.setAnimator(0, null);
            f5179o00oOo00.setAnimator(1, null);
            f5179o00oOo00.setAnimator(3, null);
            f5179o00oOo00.setAnimator(4, null);
        }
        if (z) {
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null) {
                if (layoutTransition.isRunning()) {
                    o00oOOo0(layoutTransition);
                }
                if (layoutTransition != f5179o00oOo00) {
                    viewGroup.setTag(R.id.transition_layout_save, layoutTransition);
                }
            }
            viewGroup.setLayoutTransition(f5179o00oOo00);
            return;
        }
        viewGroup.setLayoutTransition(null);
        if (!f5180o00oOo0O) {
            try {
                Field declaredField = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                f5183o00oOooO = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f5180o00oOo0O = true;
        }
        Field field = f5183o00oOooO;
        if (field != null) {
            try {
                boolean z3 = field.getBoolean(viewGroup);
                if (z3) {
                    try {
                        f5183o00oOooO.setBoolean(viewGroup, false);
                    } catch (IllegalAccessException unused2) {
                    }
                }
                z2 = z3;
            } catch (IllegalAccessException unused3) {
            }
        }
        if (z2) {
            viewGroup.requestLayout();
        }
        int i = R.id.transition_layout_save;
        LayoutTransition layoutTransition2 = (LayoutTransition) viewGroup.getTag(i);
        if (layoutTransition2 != null) {
            viewGroup.setTag(i, null);
            viewGroup.setLayoutTransition(layoutTransition2);
        }
    }
}
