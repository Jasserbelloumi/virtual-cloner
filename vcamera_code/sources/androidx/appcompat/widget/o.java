package androidx.appcompat.widget;

import android.graphics.Rect;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o00oOooO.o0OO0oO;
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f1017o00oOOo0 = "ViewUtils";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static Method f1018o00oOOoO;
    @o00oOooO.o0O00O0o(api = 27)
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final boolean f1019o00oOo00 = true;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f1018o00oOOoO = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            f1018o00oOOoO.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
    }

    public static void o00oOOo0(View view, Rect rect, Rect rect2) {
        Method method = f1018o00oOOoO;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean o00oOOoO(View view) {
        return o0O000oo.o0O0o00O.o0O000O(view) == 1;
    }

    public static void o00oOo00(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }
}
