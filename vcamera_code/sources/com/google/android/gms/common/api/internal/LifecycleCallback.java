package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import o00oOooO.o0O;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public class LifecycleCallback {
    @oo0oO0
    @KeepForSdk
    public final LifecycleFragment mLifecycleFragment;

    @KeepForSdk
    public LifecycleCallback(@oo0oO0 LifecycleFragment lifecycleFragment) {
        this.mLifecycleFragment = lifecycleFragment;
    }

    @Keep
    private static LifecycleFragment getChimeraLifecycleFragmentImpl(LifecycleActivity lifecycleActivity) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    @oo0oO0
    @KeepForSdk
    public static LifecycleFragment getFragment(@oo0oO0 Activity activity) {
        return getFragment(new LifecycleActivity(activity));
    }

    @oo0oO0
    @KeepForSdk
    public static LifecycleFragment getFragment(@oo0oO0 ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    @oo0oO0
    @KeepForSdk
    public static LifecycleFragment getFragment(@oo0oO0 LifecycleActivity lifecycleActivity) {
        if (lifecycleActivity.zzd()) {
            return zzd.zzc(lifecycleActivity.zzb());
        }
        if (lifecycleActivity.zzc()) {
            return zzb.zzc(lifecycleActivity.zza());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @o0O
    @KeepForSdk
    public void dump(@oo0oO0 String str, @oo0oO0 FileDescriptor fileDescriptor, @oo0oO0 PrintWriter printWriter, @oo0oO0 String[] strArr) {
    }

    @oo0oO0
    @KeepForSdk
    public Activity getActivity() {
        Activity lifecycleActivity = this.mLifecycleFragment.getLifecycleActivity();
        Preconditions.checkNotNull(lifecycleActivity);
        return lifecycleActivity;
    }

    @o0O
    @KeepForSdk
    public void onActivityResult(int i, int i2, @oo0oO0 Intent intent) {
    }

    @o0O
    @KeepForSdk
    public void onCreate(@o0OO00OO Bundle bundle) {
    }

    @o0O
    @KeepForSdk
    public void onDestroy() {
    }

    @o0O
    @KeepForSdk
    public void onResume() {
    }

    @o0O
    @KeepForSdk
    public void onSaveInstanceState(@oo0oO0 Bundle bundle) {
    }

    @o0O
    @KeepForSdk
    public void onStart() {
    }

    @o0O
    @KeepForSdk
    public void onStop() {
    }
}
