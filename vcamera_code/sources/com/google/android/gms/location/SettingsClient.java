package com.google.android.gms.location;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public interface SettingsClient extends HasApiKey<Api.ApiOptions.NoOptions> {
    @oo0oO0
    Task<LocationSettingsResponse> checkLocationSettings(@oo0oO0 LocationSettingsRequest locationSettingsRequest);
}
