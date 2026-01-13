package o0O0Oo0o;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o0O00oO0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static boolean f11921o00oOOo0 = true;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static Method f11922o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static boolean f11923o00oOo00;

    public static int o00oOOo0(@oo0oO0 ViewGroup viewGroup, int i) {
        int childDrawingOrder;
        if (Build.VERSION.SDK_INT >= 29) {
            childDrawingOrder = viewGroup.getChildDrawingOrder(i);
            return childDrawingOrder;
        }
        if (!f11923o00oOo00) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", cls, cls);
                f11922o00oOOoO = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f11923o00oOo00 = true;
        }
        Method method = f11922o00oOOoO;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i))).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i;
    }

    public static o0O00OOO o00oOOoO(@oo0oO0 ViewGroup viewGroup) {
        return new o0O00OO(viewGroup);
    }

    @o0OOooO0(18)
    @SuppressLint({"NewApi"})
    public static void o00oOo00(@oo0oO0 ViewGroup viewGroup, boolean z) {
        if (f11921o00oOOo0) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f11921o00oOOo0 = false;
            }
        }
    }

    public static void o00oOooO(@oo0oO0 ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else {
            o00oOo00(viewGroup, z);
        }
    }
}
