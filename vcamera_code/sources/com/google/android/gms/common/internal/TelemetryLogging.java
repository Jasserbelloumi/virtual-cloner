package com.google.android.gms.common.internal;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public class TelemetryLogging {
    private TelemetryLogging() {
    }

    @oo0oO0
    @KeepForSdk
    public static TelemetryLoggingClient getClient(@oo0oO0 Context context) {
        return getClient(context, TelemetryLoggingOptions.zaa);
    }

    @oo0oO0
    @KeepForSdk
    public static TelemetryLoggingClient getClient(@oo0oO0 Context context, @oo0oO0 TelemetryLoggingOptions telemetryLoggingOptions) {
        return new com.google.android.gms.common.internal.service.zao(context, telemetryLoggingOptions);
    }
}
