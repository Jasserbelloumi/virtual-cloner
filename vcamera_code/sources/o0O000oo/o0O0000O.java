package o0O000oo;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o00oOooO.o0OO0oO;
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o0O0000O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static boolean f10520o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static Method f10521o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static boolean f10522o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static Field f10523o00oOooO;

    /* loaded from: classes.dex */
    public interface o00oOOo0 {
        boolean o00oOoOo(@o00oOooO.oo0oO0 KeyEvent keyEvent);
    }

    public static boolean o00oOOo0(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f10520o00oOOo0) {
            try {
                f10521o00oOOoO = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f10520o00oOOo0 = true;
        }
        Method method = f10521o00oOOoO;
        if (method != null) {
            try {
                Object invoke = method.invoke(actionBar, keyEvent);
                if (invoke == null) {
                    return false;
                }
                return ((Boolean) invoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    public static boolean o00oOOoO(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && o00oOOo0(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (o0O0o00O.o00ooO0O(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    public static boolean o00oOo00(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener o00oOo0o2 = o00oOo0o(dialog);
        if (o00oOo0o2 == null || !o00oOo0o2.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            Window window = dialog.getWindow();
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (o0O0o00O.o00ooO0O(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
        }
        return true;
    }

    @SuppressLint({"LambdaLast"})
    public static boolean o00oOo0O(@o00oOooO.oo0oO0 o00oOOo0 o00oooo02, @o00oOooO.o0OO00OO View view, @o00oOooO.o0OO00OO Window.Callback callback, @o00oOooO.oo0oO0 KeyEvent keyEvent) {
        if (o00oooo02 == null) {
            return false;
        }
        return o00oooo02.o00oOoOo(keyEvent);
    }

    public static DialogInterface.OnKeyListener o00oOo0o(Dialog dialog) {
        if (!f10522o00oOo00) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f10523o00oOooO = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f10522o00oOo00 = true;
        }
        Field field = f10523o00oOooO;
        if (field != null) {
            try {
                return (DialogInterface.OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused2) {
                return null;
            }
        }
        return null;
    }

    public static boolean o00oOooO(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 KeyEvent keyEvent) {
        return o0O0o00O.o00ooO0o(view, keyEvent);
    }
}
