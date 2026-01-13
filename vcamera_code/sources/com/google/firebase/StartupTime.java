package com.google.firebase;

import android.os.SystemClock;
import com.google.auto.value.AutoValue;
import o00oOooO.oo0oO0;
@AutoValue
/* loaded from: classes2.dex */
public abstract class StartupTime {
    @oo0oO0
    public static StartupTime create(long j, long j2, long j3) {
        return new AutoValue_StartupTime(j, j2, j3);
    }

    @oo0oO0
    public static StartupTime now() {
        return create(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long getElapsedRealtime();

    public abstract long getEpochMillis();

    public abstract long getUptimeMillis();
}
