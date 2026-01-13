package o0OOoO0o;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0oooo.o0OO;
import o0OOoO0.o00oo;
import o0OOoOo0.ooOOO0Oo;
import o0OOoo0O.o0OO0oO;
import o0OOoo0o.oO00O0oO;
import o0Oo00oO.o0O00000;
import o0Oo00oO.o0O000O;
import o0ooO0O0.oO0O00O;
import o0ooO0O0.oO0OO0O;
/* loaded from: classes3.dex */
public class o0OO0 implements o0OO.o00oOOoO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static Application f14868o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static Activity f14869o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static boolean f14870o00oOo00;

    /* loaded from: classes3.dex */
    public class o00oOOoO implements Application.ActivityLifecycleCallbacks {

        /* loaded from: classes3.dex */
        public class o00oOOo0 implements Runnable {

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ Activity f14873o00oo0O0;

            public o00oOOo0(Activity activity) {
                this.f14873o00oo0O0 = activity;
            }

            @Override // java.lang.Runnable
            public void run() {
                oO0O00O.o00oo0oO(this.f14873o00oo0O0);
            }
        }

        public o00oOOoO() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@oo0oO0 Activity activity, @o0OO00OO Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@oo0oO0 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@oo0oO0 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@oo0oO0 Activity activity) {
            o0OO0.f14869o00oOOoO = activity;
            if (ooOOO0Oo.o00oOo00() && o0OO0.f14870o00oOo00) {
                try {
                    o0OO0oO.o00oOOo0().f14961o00oo0O.o00oOo00();
                } catch (Throwable unused) {
                }
                try {
                    if (o0OO0oO.o00oOOo0().o00ooOO() != null && o0OO0oO.f14946o00oOOo0.o00ooOO().f15190o00oOOo0 != null) {
                        o0OO0oO.f14946o00oOOo0.o00ooOO().f15190o00oOOo0.o00oo0O0();
                    }
                } catch (Throwable unused2) {
                }
                oO0OO0O.o00oOo0o(new o00oOOo0(activity), 1000L);
                o0OO0.f14870o00oOo00 = false;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@oo0oO0 Activity activity, @oo0oO0 Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@oo0oO0 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@oo0oO0 Activity activity) {
        }
    }

    @Override // o0O0oooo.o0OO.o00oOOoO
    public void o00oOOo0(Application application) {
    }

    @Override // o0O0oooo.o0OO.o00oOOoO
    public void o00oOOoO(Application application) {
        f14868o00oOOo0 = application;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0037 -> B:19:0x003a). Please submit an issue!!! */
    @Override // o0O0oooo.o0OO.o00oOOoO
    public void o00oOo00(Application application) {
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (!ooOOO0Oo.o00oOOo0()) {
            if (ooOOO0Oo.o00oOo00()) {
                application.registerActivityLifecycleCallbacks(new o00oOOoO());
                o0OO0oO.o00oOo00();
                new o0O00000().o00oOOo0(application);
            }
            oO00O0oO.o00oOOo0();
        }
        try {
            new o0O00000().o00oOOo0(application);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        new o0O000O().o00oOOo0(application);
        oO00O0oO.o00oOOo0();
    }

    public final boolean o00oOo0O(Application application) {
        try {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) application.getSystemService(o00oo.o00oOOo0(new byte[]{-95, -94, 93, -38, -126, -127, 46, -87}, new byte[]{-64, -63, 41, -77, -12, -24, 90, -48}))).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == Process.myPid()) {
                    return runningAppProcessInfo.processName.equals(application.getPackageName());
                }
            }
        } catch (Exception unused) {
        }
        return true;
    }

    @Override // o0O0oooo.o0OO.o00oOOoO
    public void o00oOooO(Object obj, Context context) {
    }
}
