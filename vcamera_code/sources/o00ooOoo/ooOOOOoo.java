package o00ooOoo;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public final class ooOOOOoo {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f9526o00oOOo0 = "ActivityRecreator";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final Class<?> f9527o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final Field f9528o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final Method f9529o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final Method f9530o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final Handler f9531o00oOoO = new Handler(Looper.getMainLooper());

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final Method f9532o00oOoO0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final Field f9533o00oOooO;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ Object f9534o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o00oOo0O f9535o00oo0O0;

        public o00oOOo0(o00oOo0O o00ooo0o2, Object obj) {
            this.f9535o00oo0O0 = o00ooo0o2;
            this.f9534o00oo0O = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9535o00oo0O0.f9541o00oo0O0 = this.f9534o00oo0O;
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ o00oOo0O f9536o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Application f9537o00oo0O0;

        public o00oOOoO(Application application, o00oOo0O o00ooo0o2) {
            this.f9537o00oo0O0 = application;
            this.f9536o00oo0O = o00ooo0o2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9537o00oo0O0.unregisterActivityLifecycleCallbacks(this.f9536o00oo0O);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ Object f9538o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Object f9539o00oo0O0;

        public o00oOo00(Object obj, Object obj2) {
            this.f9539o00oo0O0 = obj;
            this.f9538o00oo0O = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = ooOOOOoo.f9529o00oOo0O;
                if (method != null) {
                    method.invoke(this.f9539o00oo0O0, this.f9538o00oo0O, Boolean.FALSE, "AppCompat recreation");
                } else {
                    ooOOOOoo.f9530o00oOo0o.invoke(this.f9539o00oo0O0, this.f9538o00oo0O, Boolean.FALSE);
                }
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOo0O implements Application.ActivityLifecycleCallbacks {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public Activity f9540o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public Object f9541o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final int f9542o00oo0Oo;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public boolean f9544o00oo0o0 = false;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public boolean f9543o00oo0o = false;

        /* renamed from: o00oo0oO  reason: collision with root package name */
        public boolean f9545o00oo0oO = false;

        public o00oOo0O(@oo0oO0 Activity activity) {
            this.f9540o00oo0O = activity;
            this.f9542o00oo0Oo = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f9540o00oo0O == activity) {
                this.f9540o00oo0O = null;
                this.f9543o00oo0o = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f9543o00oo0o || this.f9545o00oo0oO || this.f9544o00oo0o0 || !ooOOOOoo.o00oOoO(this.f9541o00oo0O0, this.f9542o00oo0Oo, activity)) {
                return;
            }
            this.f9545o00oo0oO = true;
            this.f9541o00oo0O0 = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f9540o00oo0O == activity) {
                this.f9544o00oo0o0 = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> o00oOOo02 = o00oOOo0();
        f9527o00oOOoO = o00oOOo02;
        f9528o00oOo00 = o00oOOoO();
        f9533o00oOooO = o00oOo0o();
        f9529o00oOo0O = o00oOooO(o00oOOo02);
        f9530o00oOo0o = o00oOo00(o00oOOo02);
        f9532o00oOoO0 = null;
    }

    public static Class<?> o00oOOo0() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field o00oOOoO() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method o00oOo00(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method o00oOo0O(Class<?> cls) {
        return null;
    }

    public static Field o00oOo0o() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean o00oOoO(Object obj, int i, Activity activity) {
        try {
            Object obj2 = f9533o00oOooO.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                f9531o00oOoO.postAtFrontOfQueue(new o00oOo00(f9528o00oOo00.get(activity), obj2));
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean o00oOoO0() {
        return false;
    }

    public static boolean o00oOoOO(@oo0oO0 Activity activity) {
        activity.recreate();
        return true;
    }

    public static Method o00oOooO(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }
}
