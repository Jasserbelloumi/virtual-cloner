package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public class StatusPendingResult extends BasePendingResult<Status> {
    @Deprecated
    public StatusPendingResult(@oo0oO0 Looper looper) {
        super(looper);
    }

    @KeepForSdk
    public StatusPendingResult(@oo0oO0 GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    @oo0oO0
    public final /* bridge */ /* synthetic */ Status createFailedResult(@oo0oO0 Status status) {
        return status;
    }
}
