package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.OptionalPendingResultImpl;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class PendingResults {
    private PendingResults() {
    }

    @oo0oO0
    public static PendingResult<Status> canceledPendingResult() {
        StatusPendingResult statusPendingResult = new StatusPendingResult(Looper.getMainLooper());
        statusPendingResult.cancel();
        return statusPendingResult;
    }

    @oo0oO0
    public static <R extends Result> PendingResult<R> canceledPendingResult(@oo0oO0 R r) {
        Preconditions.checkNotNull(r, "Result must not be null");
        Preconditions.checkArgument(r.getStatus().getStatusCode() == 16, "Status code must be CommonStatusCodes.CANCELED");
        zaf zafVar = new zaf(r);
        zafVar.cancel();
        return zafVar;
    }

    @oo0oO0
    @KeepForSdk
    public static <R extends Result> PendingResult<R> immediateFailedResult(@oo0oO0 R r, @oo0oO0 GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(r, "Result must not be null");
        Preconditions.checkArgument(!r.getStatus().isSuccess(), "Status code must not be SUCCESS");
        zag zagVar = new zag(googleApiClient, r);
        zagVar.setResult(r);
        return zagVar;
    }

    @oo0oO0
    public static <R extends Result> OptionalPendingResult<R> immediatePendingResult(@oo0oO0 R r) {
        Preconditions.checkNotNull(r, "Result must not be null");
        zah zahVar = new zah(null);
        zahVar.setResult(r);
        return new OptionalPendingResultImpl(zahVar);
    }

    @oo0oO0
    @KeepForSdk
    public static <R extends Result> OptionalPendingResult<R> immediatePendingResult(@oo0oO0 R r, @oo0oO0 GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(r, "Result must not be null");
        zah zahVar = new zah(googleApiClient);
        zahVar.setResult(r);
        return new OptionalPendingResultImpl(zahVar);
    }

    @oo0oO0
    public static PendingResult<Status> immediatePendingResult(@oo0oO0 Status status) {
        Preconditions.checkNotNull(status, "Result must not be null");
        StatusPendingResult statusPendingResult = new StatusPendingResult(Looper.getMainLooper());
        statusPendingResult.setResult(status);
        return statusPendingResult;
    }

    @oo0oO0
    @KeepForSdk
    public static PendingResult<Status> immediatePendingResult(@oo0oO0 Status status, @oo0oO0 GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(status, "Result must not be null");
        StatusPendingResult statusPendingResult = new StatusPendingResult(googleApiClient);
        statusPendingResult.setResult(status);
        return statusPendingResult;
    }
}
