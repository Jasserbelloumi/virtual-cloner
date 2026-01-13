package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import o00oOooO.o0OOooO0;
import o00oOooO.o0o0000;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\f\u0010\tJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0007H\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000e\u001a\u00020\rH\u0003R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001c¨\u0006 "}, d2 = {"Landroidx/window/layout/o0O00O0o;", "Landroidx/window/layout/o0OoO00O;", "Landroid/app/Activity;", "activity", "Landroidx/window/layout/o0O00O0;", "o00oOo00", "o00oOooO", "Landroid/graphics/Rect;", "o00oOoO", "(Landroid/app/Activity;)Landroid/graphics/Rect;", "o00oOoO0", "o00oOo0o", "o00oOo0O", "Landroid/view/Display;", "display", "Landroid/graphics/Point;", "o00oOoo0", "(Landroid/view/Display;)Landroid/graphics/Point;", "bounds", "Lo0OO0o/oO0Ooooo;", "o00oOooo", "Landroid/content/Context;", "context", "", "o00oOoOo", "Landroid/view/DisplayCutout;", "o00oOoOO", "", "Ljava/lang/String;", "TAG", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class o0O00O0o implements o0OoO00O {
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final o0O00O0o f5539o00oOOoO = new o0O00O0o();
    @NotNull

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f5540o00oOo00;

    static {
        String simpleName = o0O00O0o.class.getSimpleName();
        o0ooO.o00oo0OO(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        f5540o00oOo00 = simpleName;
    }

    @Override // androidx.window.layout.o0OoO00O
    @NotNull
    public o0O00O0 o00oOo00(@NotNull Activity activity) {
        o0ooO.o00oo0O0(activity, "activity");
        int i = Build.VERSION.SDK_INT;
        return new o0O00O0(i >= 30 ? o00oOo0O.f5479o00oOOo0.o00oOOo0(activity) : i >= 29 ? o00oOoO(activity) : o00oOoO0(activity));
    }

    @o0OOooO0(14)
    @NotNull
    public final Rect o00oOo0O(@NotNull Activity activity) {
        int i;
        o0ooO.o00oo0O0(activity, "activity");
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        o0ooO.o00oo0OO(defaultDisplay, "defaultDisplay");
        Point o00oOoo02 = o00oOoo0(defaultDisplay);
        Rect rect = new Rect();
        int i2 = o00oOoo02.x;
        if (i2 == 0 || (i = o00oOoo02.y) == 0) {
            defaultDisplay.getRectSize(rect);
        } else {
            rect.right = i2;
            rect.bottom = i;
        }
        return rect;
    }

    @o0OOooO0(24)
    @NotNull
    public final Rect o00oOo0o(@NotNull Activity activity) {
        o0ooO.o00oo0O0(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!o00oOOo0.f5478o00oOOo0.o00oOOo0(activity)) {
            o0ooO.o00oo0OO(defaultDisplay, "defaultDisplay");
            Point o00oOoo02 = o00oOoo0(defaultDisplay);
            int o00oOoOo2 = o00oOoOo(activity);
            int i = rect.bottom;
            if (i + o00oOoOo2 == o00oOoo02.y) {
                rect.bottom = i + o00oOoOo2;
            } else {
                int i2 = rect.right;
                if (i2 + o00oOoOo2 == o00oOoo02.x) {
                    rect.right = i2 + o00oOoOo2;
                }
            }
        }
        return rect;
    }

    @o0OOooO0(29)
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    @NotNull
    public final Rect o00oOoO(@NotNull Activity activity) {
        o0ooO.o00oo0O0(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
            if (invoke != null) {
                return new Rect((Rect) invoke);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
        } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
            return o00oOoO0(activity);
        }
    }

    @o0OOooO0(28)
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    @NotNull
    public final Rect o00oOoO0(@NotNull Activity activity) {
        DisplayCutout o00oOoOO2;
        Object invoke;
        o0ooO.o00oo0O0(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (o00oOOo0.f5478o00oOOo0.o00oOOo0(activity)) {
                invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                if (invoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
            } else {
                invoke = obj.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(obj, new Object[0]);
                if (invoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
            }
            rect.set((Rect) invoke);
        } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
            o00oOooo(activity, rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        o00oOoO o00oooo2 = o00oOoO.f5480o00oOOo0;
        o0ooO.o00oo0OO(defaultDisplay, "currentDisplay");
        o00oooo2.o00oOOo0(defaultDisplay, point);
        o00oOOo0 o00oooo02 = o00oOOo0.f5478o00oOOo0;
        if (!o00oooo02.o00oOOo0(activity)) {
            int o00oOoOo2 = o00oOoOo(activity);
            int i = rect.bottom;
            if (i + o00oOoOo2 == point.y) {
                rect.bottom = i + o00oOoOo2;
            } else {
                int i2 = rect.right;
                if (i2 + o00oOoOo2 == point.x) {
                    rect.right = i2 + o00oOoOo2;
                } else if (rect.left == o00oOoOo2) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !o00oooo02.o00oOOo0(activity) && (o00oOoOO2 = o00oOoOO(defaultDisplay)) != null) {
            int i3 = rect.left;
            o00oo00O o00oo00o = o00oo00O.f5493o00oOOo0;
            if (i3 == o00oo00o.o00oOOoO(o00oOoOO2)) {
                rect.left = 0;
            }
            if (point.x - rect.right == o00oo00o.o00oOo00(o00oOoOO2)) {
                rect.right = o00oo00o.o00oOo00(o00oOoOO2) + rect.right;
            }
            if (rect.top == o00oo00o.o00oOooO(o00oOoOO2)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == o00oo00o.o00oOOo0(o00oOoOO2)) {
                rect.bottom = o00oo00o.o00oOOo0(o00oOoOO2) + rect.bottom;
            }
        }
        return rect;
    }

    @o0OOooO0(28)
    @SuppressLint({"BanUncheckedReflection"})
    public final DisplayCutout o00oOoOO(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);
            constructor.setAccessible(true);
            Object newInstance = constructor.newInstance(new Object[0]);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, newInstance);
            Field declaredField = newInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(newInstance);
            if (obj instanceof DisplayCutout) {
                return (DisplayCutout) obj;
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return null;
    }

    public final int o00oOoOo(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    @o0OOooO0(14)
    @o0o0000
    @NotNull
    public final Point o00oOoo0(@NotNull Display display) {
        o0ooO.o00oo0O0(display, "display");
        Point point = new Point();
        o00oOoO.f5480o00oOOo0.o00oOOo0(display, point);
        return point;
    }

    @Override // androidx.window.layout.o0OoO00O
    @NotNull
    public o0O00O0 o00oOooO(@NotNull Activity activity) {
        Rect rect;
        o0ooO.o00oo0O0(activity, "activity");
        if (Build.VERSION.SDK_INT >= 30) {
            rect = o00oOo0O.f5479o00oOOo0.o00oOOoO(activity);
        } else {
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            o0ooO.o00oo0OO(defaultDisplay, "display");
            Point o00oOoo02 = o00oOoo0(defaultDisplay);
            rect = new Rect(0, 0, o00oOoo02.x, o00oOoo02.y);
        }
        return new o0O00O0(rect);
    }

    public final void o00oOooo(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }
}
