package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.o0O00;
import androidx.lifecycle.o0O00OOO;
import androidx.lifecycle.o0O0O0O;
import java.lang.reflect.Field;
import o00oOooO.o0O;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(19)
/* loaded from: classes.dex */
final class ImmLeaksCleaner implements o0O00OOO {

    /* renamed from: o00oo  reason: collision with root package name */
    public static Field f32o00oo = null;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final int f33o00oo0O = 0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final int f34o00oo0Oo = 1;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static int f35o00oo0o = 0;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final int f36o00oo0o0 = 2;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static Field f37o00oo0oO;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static Field f38o0O0o;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public Activity f39o00oo0O0;

    public ImmLeaksCleaner(Activity activity) {
        this.f39o00oo0O0 = activity;
    }

    @o0O
    @SuppressLint({"SoonBlockedPrivateApi"})
    public static void o00oOo00() {
        try {
            f35o00oo0o = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f38o0O0o = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f32o00oo = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f37o00oo0oO = declaredField3;
            declaredField3.setAccessible(true);
            f35o00oo0o = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.o0O00OOO
    public void o00oOOoO(@oo0oO0 o0O0O0O o0o0o0o, @oo0oO0 o0O00.o00oOOo0 o00oooo02) {
        if (o00oooo02 != o0O00.o00oOOo0.ON_DESTROY) {
            return;
        }
        if (f35o00oo0o == 0) {
            o00oOo00();
        }
        if (f35o00oo0o == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f39o00oo0O0.getSystemService("input_method");
            try {
                Object obj = f37o00oo0oO.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f38o0O0o.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f32o00oo.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (ClassCastException unused2) {
                    } catch (IllegalAccessException unused3) {
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
