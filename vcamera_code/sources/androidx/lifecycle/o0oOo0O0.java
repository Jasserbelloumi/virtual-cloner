package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.o0O00;
import androidx.lifecycle.oooOO0;
import o00oOooO.o0o0000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes.dex */
public final class o0oOo0O0 implements o0O0O0O {

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final long f3416o00ooO0 = 700;
    @NotNull

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final o00oOOoO f3417o00ooO00 = new o00oOOoO(null);
    @NotNull

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final o0oOo0O0 f3418o00ooO0O = new o0oOo0O0();

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f3420o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public int f3421o00oo0O0;
    @Nullable

    /* renamed from: o00oo0o  reason: collision with root package name */
    public Handler f3423o00oo0o;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public boolean f3422o00oo0Oo = true;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public boolean f3424o00oo0o0 = true;
    @NotNull

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public final o0O0oo0o f3425o00oo0oO = new o0O0oo0o(this);
    @NotNull

    /* renamed from: o0O0o  reason: collision with root package name */
    public final Runnable f3426o0O0o = new Runnable() { // from class: androidx.lifecycle.o0O0o00O
        @Override // java.lang.Runnable
        public final void run() {
            o0oOo0O0.o00oOoOO(o0oOo0O0.this);
        }
    };
    @NotNull

    /* renamed from: o00oo  reason: collision with root package name */
    public final oooOO0.o00oOOo0 f3419o00oo = new o00oOo0O();

    @o00oOooO.o0OOooO0(29)
    /* loaded from: classes.dex */
    public static final class o00oOOo0 {
        @NotNull

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final o00oOOo0 f3427o00oOOo0 = new o00oOOo0();

        @o00oOooO.o0O0O0Oo
        @o0OOOO0o.o00ooO0
        public static final void o00oOOo0(@NotNull Activity activity, @NotNull Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            o0OOOOO0.o0ooO.o00oo0O0(activity, "activity");
            o0OOOOO0.o0ooO.o00oo0O0(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOOoO {
        public o00oOOoO() {
        }

        public o00oOOoO(o0OOOOO0.o0O00 o0o00) {
        }

        @o0o0000
        public static /* synthetic */ void o00oOOoO() {
        }

        @o0OOOO0o.o00ooO0
        @NotNull
        public final o0O0O0O o00oOOo0() {
            return o0oOo0O0.f3418o00ooO0O;
        }

        @o0OOOO0o.o00ooO0
        public final void o00oOo00(@NotNull Context context) {
            o0OOOOO0.o0ooO.o00oo0O0(context, "context");
            o0oOo0O0.f3418o00ooO0O.o00oOoO(context);
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOo00 extends o0O00000 {

        /* loaded from: classes.dex */
        public static final class o00oOOo0 extends o0O00000 {
            public final /* synthetic */ o0oOo0O0 this$0;

            public o00oOOo0(o0oOo0O0 o0ooo0o0) {
                this.this$0 = o0ooo0o0;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(@NotNull Activity activity) {
                o0OOOOO0.o0ooO.o00oo0O0(activity, "activity");
                this.this$0.o00oOo0O();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(@NotNull Activity activity) {
                o0OOOOO0.o0ooO.o00oo0O0(activity, "activity");
                this.this$0.o00oOo0o();
            }
        }

        public o00oOo00() {
        }

        @Override // androidx.lifecycle.o0O00000, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            o0OOOOO0.o0ooO.o00oo0O0(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                oooOO0.f3435o00oo0O.o00oOOoO(activity).o00oOoO(o0oOo0O0.this.f3419o00oo);
            }
        }

        @Override // androidx.lifecycle.o0O00000, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            o0OOOOO0.o0ooO.o00oo0O0(activity, "activity");
            o0oOo0O0.this.o00oOooO();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        @o00oOooO.o0OOooO0(29)
        public void onActivityPreCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            o0OOOOO0.o0ooO.o00oo0O0(activity, "activity");
            o00oOOo0.o00oOOo0(activity, new o00oOOo0(o0oOo0O0.this));
        }

        @Override // androidx.lifecycle.o0O00000, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            o0OOOOO0.o0ooO.o00oo0O0(activity, "activity");
            o0oOo0O0.this.o00oOoO0();
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOo0O implements oooOO0.o00oOOo0 {
        public o00oOo0O() {
        }

        @Override // androidx.lifecycle.oooOO0.o00oOOo0
        public void o00oOOo0() {
        }

        @Override // androidx.lifecycle.oooOO0.o00oOOo0
        public void onResume() {
            o0oOo0O0.this.o00oOo0O();
        }

        @Override // androidx.lifecycle.oooOO0.o00oOOo0
        public void onStart() {
            o0oOo0O0.this.o00oOo0o();
        }
    }

    public static final void o00oOoOO(o0oOo0O0 o0ooo0o0) {
        o0OOOOO0.o0ooO.o00oo0O0(o0ooo0o0, "this$0");
        o0ooo0o0.o00oOoOo();
        o0ooo0o0.o00oOoo0();
    }

    @o0OOOO0o.o00ooO0
    @NotNull
    public static final o0O0O0O o00oOooo() {
        f3417o00ooO00.getClass();
        return f3418o00ooO0O;
    }

    @o0OOOO0o.o00ooO0
    public static final void o00oo00O(@NotNull Context context) {
        f3417o00ooO00.o00oOo00(context);
    }

    @Override // androidx.lifecycle.o0O0O0O
    @NotNull
    public o0O00 getLifecycle() {
        return this.f3425o00oo0oO;
    }

    public final void o00oOo0O() {
        int i = this.f3420o00oo0O + 1;
        this.f3420o00oo0O = i;
        if (i == 1) {
            if (this.f3422o00oo0Oo) {
                this.f3425o00oo0oO.o00oOooo(o0O00.o00oOOo0.ON_RESUME);
                this.f3422o00oo0Oo = false;
                return;
            }
            Handler handler = this.f3423o00oo0o;
            o0OOOOO0.o0ooO.o00oo00O(handler);
            handler.removeCallbacks(this.f3426o0O0o);
        }
    }

    public final void o00oOo0o() {
        int i = this.f3421o00oo0O0 + 1;
        this.f3421o00oo0O0 = i;
        if (i == 1 && this.f3424o00oo0o0) {
            this.f3425o00oo0oO.o00oOooo(o0O00.o00oOOo0.ON_START);
            this.f3424o00oo0o0 = false;
        }
    }

    public final void o00oOoO(@NotNull Context context) {
        o0OOOOO0.o0ooO.o00oo0O0(context, "context");
        this.f3423o00oo0o = new Handler();
        this.f3425o00oo0oO.o00oOooo(o0O00.o00oOOo0.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        o0OOOOO0.o0ooO.o00oo0(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new o00oOo00());
    }

    public final void o00oOoO0() {
        this.f3421o00oo0O0--;
        o00oOoo0();
    }

    public final void o00oOoOo() {
        if (this.f3420o00oo0O == 0) {
            this.f3422o00oo0Oo = true;
            this.f3425o00oo0oO.o00oOooo(o0O00.o00oOOo0.ON_PAUSE);
        }
    }

    public final void o00oOoo0() {
        if (this.f3421o00oo0O0 == 0 && this.f3422o00oo0Oo) {
            this.f3425o00oo0oO.o00oOooo(o0O00.o00oOOo0.ON_STOP);
            this.f3424o00oo0o0 = true;
        }
    }

    public final void o00oOooO() {
        int i = this.f3420o00oo0O - 1;
        this.f3420o00oo0O = i;
        if (i == 0) {
            Handler handler = this.f3423o00oo0o;
            o0OOOOO0.o0ooO.o00oo00O(handler);
            handler.postDelayed(this.f3426o0O0o, 700L);
        }
    }
}
