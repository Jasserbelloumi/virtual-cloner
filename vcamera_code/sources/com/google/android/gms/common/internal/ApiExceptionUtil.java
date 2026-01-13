package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public class ApiExceptionUtil {
    @oo0oO0
    @KeepForSdk
    public static ApiException fromStatus(@oo0oO0 Status status) {
        return status.hasResolution() ? new ResolvableApiException(status) : new ApiException(status);
    }
}
