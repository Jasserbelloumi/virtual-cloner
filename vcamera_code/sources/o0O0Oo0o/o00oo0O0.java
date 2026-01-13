package o0O0Oo0o;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00oo0O0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static Method f11898o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static Method f11899o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static boolean f11900o00oOo00;

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static void o00oOOo0(@oo0oO0 Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z) {
                canvas.enableZ();
            } else {
                canvas.disableZ();
            }
        } else if (i == 28) {
            throw new IllegalStateException("This method doesn't work on Pie!");
        } else {
            if (!f11900o00oOo00) {
                try {
                    Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    f11898o00oOOo0 = declaredMethod;
                    declaredMethod.setAccessible(true);
                    Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                    f11899o00oOOoO = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f11900o00oOo00 = true;
            }
            if (z) {
                try {
                    Method method2 = f11898o00oOOo0;
                    if (method2 != null) {
                        method2.invoke(canvas, new Object[0]);
                    }
                } catch (IllegalAccessException unused2) {
                    return;
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e.getCause());
                }
            }
            if (z || (method = f11899o00oOOoO) == null) {
                return;
            }
            method.invoke(canvas, new Object[0]);
        }
    }
}
