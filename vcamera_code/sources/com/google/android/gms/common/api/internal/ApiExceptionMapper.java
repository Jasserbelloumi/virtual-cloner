package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public class ApiExceptionMapper implements StatusExceptionMapper {
    @Override // com.google.android.gms.common.api.internal.StatusExceptionMapper
    @oo0oO0
    public final Exception getException(@oo0oO0 Status status) {
        return ApiExceptionUtil.fromStatus(status);
    }
}
