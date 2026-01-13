package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.o0O00;
import o00oOooO.o0OO0oO;
import o00ooOoo.oOo000Oo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class oooOO0 extends Fragment {
    @NotNull

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final o00oOOoO f3435o00oo0O = new o00oOOoO(null);
    @NotNull

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final String f3436o00oo0Oo = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";
    @Nullable

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public o00oOOo0 f3437o00oo0O0;

    /* loaded from: classes.dex */
    public interface o00oOOo0 {
        void o00oOOo0();

        void onResume();

        void onStart();
    }

    /* loaded from: classes.dex */
    public static final class o00oOOoO {
        public o00oOOoO() {
        }

        public o00oOOoO(o0OOOOO0.o0O00 o0o00) {
        }

        @o0OOOO0o.o00ooO0
        public static /* synthetic */ void o00oOo00(Activity activity) {
        }

        @o0OOOO0o.o00ooO0
        public final void o00oOOo0(@NotNull Activity activity, @NotNull o0O00.o00oOOo0 o00oooo02) {
            o0OOOOO0.o0ooO.o00oo0O0(activity, "activity");
            o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, oOo000Oo.f9217o0O00o0o);
            if (activity instanceof o0O0O0Oo) {
                ((o0O0O0Oo) activity).getLifecycle().o00oOooo(o00oooo02);
            } else if (activity instanceof o0O0O0O) {
                o0O00 lifecycle = ((o0O0O0O) activity).getLifecycle();
                if (lifecycle instanceof o0O0oo0o) {
                    ((o0O0oo0o) lifecycle).o00oOooo(o00oooo02);
                }
            }
        }

        @o0OOOO0o.o00oo0OO(name = "get")
        @NotNull
        public final oooOO0 o00oOOoO(@NotNull Activity activity) {
            o0OOOOO0.o0ooO.o00oo0O0(activity, "<this>");
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag(oooOO0.f3436o00oo0Oo);
            o0OOOOO0.o0ooO.o00oo0(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (oooOO0) findFragmentByTag;
        }

        @o0OOOO0o.o00ooO0
        public final void o00oOooO(@NotNull Activity activity) {
            o0OOOOO0.o0ooO.o00oo0O0(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                o00oOo00.Companion.o00oOOo0(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag(oooOO0.f3436o00oo0Oo) == null) {
                fragmentManager.beginTransaction().add(new oooOO0(), oooOO0.f3436o00oo0Oo).commit();
                fragmentManager.executePendingTransactions();
            }
        }
    }

    @o00oOooO.o0OOooO0(29)
    /* loaded from: classes.dex */
    public static final class o00oOo00 implements Application.ActivityLifecycleCallbacks {
        @NotNull
        public static final o00oOOo0 Companion = new o00oOOo0(null);

        /* loaded from: classes.dex */
        public static final class o00oOOo0 {
            public o00oOOo0() {
            }

            public o00oOOo0(o0OOOOO0.o0O00 o0o00) {
            }

            @o0OOOO0o.o00ooO0
            public final void o00oOOo0(@NotNull Activity activity) {
                o0OOOOO0.o0ooO.o00oo0O0(activity, "activity");
                activity.registerActivityLifecycleCallbacks(new o00oOo00());
            }
        }

        @o0OOOO0o.o00ooO0
        public static final void registerIn(@NotNull Activity activity) {
            Companion.o00oOOo0(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            o0OOOOO0.o0ooO.o00oo0O0(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull Activity activity) {
            o0OOOOO0.o0ooO.o00oo0O0(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            o0OOOOO0.o0ooO.o00oo0O0(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            o0OOOOO0.o0ooO.o00oo0O0(activity, "activity");
            oooOO0.f3435o00oo0O.o00oOOo0(activity, o0O00.o00oOOo0.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(@NotNull Activity activity) {
            o0OOOOO0.o0ooO.o00oo0O0(activity, "activity");
            oooOO0.f3435o00oo0O.o00oOOo0(activity, o0O00.o00oOOo0.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(@NotNull Activity activity) {
            o0OOOOO0.o0ooO.o00oo0O0(activity, "activity");
            oooOO0.f3435o00oo0O.o00oOOo0(activity, o0O00.o00oOOo0.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(@NotNull Activity activity) {
            o0OOOOO0.o0ooO.o00oo0O0(activity, "activity");
            oooOO0.f3435o00oo0O.o00oOOo0(activity, o0O00.o00oOOo0.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(@NotNull Activity activity) {
            o0OOOOO0.o0ooO.o00oo0O0(activity, "activity");
            oooOO0.f3435o00oo0O.o00oOOo0(activity, o0O00.o00oOOo0.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(@NotNull Activity activity) {
            o0OOOOO0.o0ooO.o00oo0O0(activity, "activity");
            oooOO0.f3435o00oo0O.o00oOOo0(activity, o0O00.o00oOOo0.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull Activity activity) {
            o0OOOOO0.o0ooO.o00oo0O0(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
            o0OOOOO0.o0ooO.o00oo0O0(activity, "activity");
            o0OOOOO0.o0ooO.o00oo0O0(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity) {
            o0OOOOO0.o0ooO.o00oo0O0(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            o0OOOOO0.o0ooO.o00oo0O0(activity, "activity");
        }
    }

    @o0OOOO0o.o00ooO0
    public static final void o00oOOoO(@NotNull Activity activity, @NotNull o0O00.o00oOOo0 o00oooo02) {
        f3435o00oo0O.o00oOOo0(activity, o00oooo02);
    }

    @o0OOOO0o.o00oo0OO(name = "get")
    @NotNull
    public static final oooOO0 o00oOo0o(@NotNull Activity activity) {
        return f3435o00oo0O.o00oOOoO(activity);
    }

    @o0OOOO0o.o00ooO0
    public static final void o00oOoO0(@NotNull Activity activity) {
        f3435o00oo0O.o00oOooO(activity);
    }

    public final void o00oOOo0(o0O00.o00oOOo0 o00oooo02) {
        if (Build.VERSION.SDK_INT < 29) {
            o00oOOoO o00ooooo2 = f3435o00oo0O;
            Activity activity = getActivity();
            o0OOOOO0.o0ooO.o00oo0OO(activity, "activity");
            o00ooooo2.o00oOOo0(activity, o00oooo02);
        }
    }

    public final void o00oOo00(o00oOOo0 o00oooo02) {
        if (o00oooo02 != null) {
            o00oooo02.o00oOOo0();
        }
    }

    public final void o00oOo0O(o00oOOo0 o00oooo02) {
        if (o00oooo02 != null) {
            o00oooo02.onStart();
        }
    }

    public final void o00oOoO(@Nullable o00oOOo0 o00oooo02) {
        this.f3437o00oo0O0 = o00oooo02;
    }

    public final void o00oOooO(o00oOOo0 o00oooo02) {
        if (o00oooo02 != null) {
            o00oooo02.onResume();
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        o00oOo00(this.f3437o00oo0O0);
        o00oOOo0(o0O00.o00oOOo0.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        o00oOOo0(o0O00.o00oOOo0.ON_DESTROY);
        this.f3437o00oo0O0 = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        o00oOOo0(o0O00.o00oOOo0.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        o00oOooO(this.f3437o00oo0O0);
        o00oOOo0(o0O00.o00oOOo0.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        o00oOo0O(this.f3437o00oo0O0);
        o00oOOo0(o0O00.o00oOOo0.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        o00oOOo0(o0O00.o00oOOo0.ON_STOP);
    }
}
