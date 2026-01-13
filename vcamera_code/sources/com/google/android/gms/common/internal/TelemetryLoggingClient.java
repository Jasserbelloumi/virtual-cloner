package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.DoNotMock;
import com.google.errorprone.annotations.RestrictedInheritance;
import o00oOooO.oo0oO0;
@DoNotMock("Use canonical fakes instead. go/cheezhead-testing-methodology")
@KeepForSdk
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", explanation = "Use canonical fakes instead.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes.dex */
public interface TelemetryLoggingClient extends HasApiKey<TelemetryLoggingOptions> {
    @oo0oO0
    @KeepForSdk
    Task<Void> log(@oo0oO0 TelemetryData telemetryData);
}
