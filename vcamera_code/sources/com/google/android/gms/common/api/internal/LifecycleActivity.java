package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public class LifecycleActivity {
    private final Object zza;

    public LifecycleActivity(@oo0oO0 Activity activity) {
        Preconditions.checkNotNull(activity, "Activity must not be null");
        this.zza = activity;
    }

    @KeepForSdk
    public LifecycleActivity(@oo0oO0 ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    @oo0oO0
    public final Activity zza() {
        return (Activity) this.zza;
    }

    @oo0oO0
    public final FragmentActivity zzb() {
        return (FragmentActivity) this.zza;
    }

    public final boolean zzc() {
        return this.zza instanceof Activity;
    }

    public final boolean zzd() {
        return this.zza instanceof FragmentActivity;
    }
}
