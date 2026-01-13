package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.annotation.KeepForSdk;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public abstract class ActivityLifecycleObserver {
    @oo0oO0
    @KeepForSdk
    public static final ActivityLifecycleObserver of(@oo0oO0 Activity activity) {
        return new zab(zaa.zaa(activity));
    }

    @oo0oO0
    @KeepForSdk
    public abstract ActivityLifecycleObserver onStopCallOnce(@oo0oO0 Runnable runnable);
}
