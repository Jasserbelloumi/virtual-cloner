package o0O0Oo0o;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(21)
/* loaded from: classes.dex */
public class o00ooO0 implements o00oo {

    /* renamed from: o00oo  reason: collision with root package name */
    public static boolean f11901o00oo = false;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final String f11902o00oo0O = "GhostViewApi21";

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static Class<?> f11903o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static Method f11904o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static boolean f11905o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static boolean f11906o00oo0oO;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static Method f11907o0O0o;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final View f11908o00oo0O0;

    public o00ooO0(@oo0oO0 View view) {
        this.f11908o00oo0O0 = view;
    }

    public static o00oo o00oOOoO(View view, ViewGroup viewGroup, Matrix matrix) {
        o00oOo00();
        Method method = f11904o00oo0o;
        if (method != null) {
            try {
                return new o00ooO0((View) method.invoke(null, view, viewGroup, matrix));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return null;
    }

    public static void o00oOo00() {
        if (f11906o00oo0oO) {
            return;
        }
        try {
            o00oOooO();
            Method declaredMethod = f11903o00oo0Oo.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
            f11904o00oo0o = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        f11906o00oo0oO = true;
    }

    public static void o00oOo0O() {
        if (f11901o00oo) {
            return;
        }
        try {
            o00oOooO();
            Method declaredMethod = f11903o00oo0Oo.getDeclaredMethod("removeGhost", View.class);
            f11907o0O0o = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        f11901o00oo = true;
    }

    public static void o00oOo0o(View view) {
        o00oOo0O();
        Method method = f11907o0O0o;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    public static void o00oOooO() {
        if (f11905o00oo0o0) {
            return;
        }
        try {
            f11903o00oo0Oo = Class.forName("android.view.GhostView");
        } catch (ClassNotFoundException unused) {
        }
        f11905o00oo0o0 = true;
    }

    @Override // o0O0Oo0o.o00oo
    public void o00oOOo0(ViewGroup viewGroup, View view) {
    }

    @Override // o0O0Oo0o.o00oo
    public void setVisibility(int i) {
        this.f11908o00oo0O0.setVisibility(i);
    }
}
