package oo0ooO;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
/* loaded from: classes2.dex */
public final class o00oOOoO implements Application.ActivityLifecycleCallbacks {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public o00oo0OO<?> f17411o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public Activity f17412o00oo0O0;

    public o00oOOoO(o00oo0OO<?> o00oo0oo, Activity activity) {
        this.f17412o00oo0O0 = activity;
        this.f17411o00oo0O = o00oo0oo;
    }

    public void o00oOOo0() {
        Activity activity = this.f17412o00oo0O0;
        if (activity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            activity.registerActivityLifecycleCallbacks(this);
        } else {
            activity.getApplication().registerActivityLifecycleCallbacks(this);
        }
    }

    public void o00oOOoO() {
        Activity activity = this.f17412o00oo0O0;
        if (activity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            activity.unregisterActivityLifecycleCallbacks(this);
        } else {
            activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.f17412o00oo0O0 != activity) {
            return;
        }
        this.f17412o00oo0O0 = null;
        o00oo0OO<?> o00oo0oo = this.f17411o00oo0O;
        if (o00oo0oo == null) {
            return;
        }
        o00oo0oo.o00ooO();
        this.f17411o00oo0O = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        o00oo0OO<?> o00oo0oo;
        Activity activity2 = this.f17412o00oo0O0;
        if (activity2 == activity && activity2.isFinishing() && (o00oo0oo = this.f17411o00oo0O) != null && o00oo0oo.o00oo0o()) {
            this.f17411o00oo0O.o00oOo0o();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
