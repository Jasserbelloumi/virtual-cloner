package com.google.android.gms.common.stats;

import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import o00oOooO.oo0oO0;
@KeepForSdk
@Deprecated
/* loaded from: classes.dex */
public class StatsUtils {
    @oo0oO0
    @KeepForSdk
    public static String getEventKey(@oo0oO0 PowerManager.WakeLock wakeLock, @oo0oO0 String str) {
        String valueOf = String.valueOf((Process.myPid() << 32) | System.identityHashCode(wakeLock));
        if (true == TextUtils.isEmpty(str)) {
            str = "";
        }
        return String.valueOf(valueOf).concat(String.valueOf(str));
    }
}
