package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import o00oOooO.o0OO0oO0;
import o00oOooO.oo0oO0;
import oo0oO0.o00oo0;
@Deprecated
/* loaded from: classes2.dex */
public interface ActivityRecognitionApi {
    @o0OO0oO0(anyOf = {o00oo0.f17338o00ooO00, "com.google.android.gms.permission.ACTIVITY_RECOGNITION"})
    @oo0oO0
    PendingResult<Status> removeActivityUpdates(@oo0oO0 GoogleApiClient googleApiClient, @oo0oO0 PendingIntent pendingIntent);

    @o0OO0oO0(anyOf = {o00oo0.f17338o00ooO00, "com.google.android.gms.permission.ACTIVITY_RECOGNITION"})
    @oo0oO0
    PendingResult<Status> requestActivityUpdates(@oo0oO0 GoogleApiClient googleApiClient, long j, @oo0oO0 PendingIntent pendingIntent);
}
