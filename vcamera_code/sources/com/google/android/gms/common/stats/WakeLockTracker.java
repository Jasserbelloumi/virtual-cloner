package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.List;
import o00oOooO.oo0oO0;
@KeepForSdk
@Deprecated
/* loaded from: classes.dex */
public class WakeLockTracker {
    private static WakeLockTracker zza = new WakeLockTracker();

    @oo0oO0
    @KeepForSdk
    public static WakeLockTracker getInstance() {
        return zza;
    }

    @KeepForSdk
    public void registerAcquireEvent(@oo0oO0 Context context, @oo0oO0 Intent intent, @oo0oO0 String str, @oo0oO0 String str2, @oo0oO0 String str3, int i, @oo0oO0 String str4) {
    }

    @KeepForSdk
    public void registerDeadlineEvent(@oo0oO0 Context context, @oo0oO0 String str, @oo0oO0 String str2, @oo0oO0 String str3, int i, @oo0oO0 List<String> list, boolean z, long j) {
    }

    @KeepForSdk
    public void registerEvent(@oo0oO0 Context context, @oo0oO0 String str, int i, @oo0oO0 String str2, @oo0oO0 String str3, @oo0oO0 String str4, int i2, @oo0oO0 List<String> list) {
    }

    @KeepForSdk
    public void registerEvent(@oo0oO0 Context context, @oo0oO0 String str, int i, @oo0oO0 String str2, @oo0oO0 String str3, @oo0oO0 String str4, int i2, @oo0oO0 List<String> list, long j) {
    }

    @KeepForSdk
    public void registerReleaseEvent(@oo0oO0 Context context, @oo0oO0 Intent intent) {
    }
}
