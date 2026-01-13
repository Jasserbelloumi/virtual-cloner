package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepForSdk;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public interface LifecycleFragment {
    @KeepForSdk
    void addCallback(@oo0oO0 String str, @oo0oO0 LifecycleCallback lifecycleCallback);

    @o0OO00OO
    @KeepForSdk
    <T extends LifecycleCallback> T getCallbackOrNull(@oo0oO0 String str, @oo0oO0 Class<T> cls);

    @o0OO00OO
    @KeepForSdk
    Activity getLifecycleActivity();

    @KeepForSdk
    boolean isCreated();

    @KeepForSdk
    boolean isStarted();

    @KeepForSdk
    void startActivityForResult(@oo0oO0 Intent intent, int i);
}
