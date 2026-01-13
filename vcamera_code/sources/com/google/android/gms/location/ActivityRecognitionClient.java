package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
import o00oOooO.o0OO0oO0;
import o00oOooO.oo0oO0;
import oo0oO0.o00oo0;
/* loaded from: classes2.dex */
public interface ActivityRecognitionClient extends HasApiKey<Api.ApiOptions.NoOptions> {
    @o0OO0oO0(anyOf = {o00oo0.f17338o00ooO00, "com.google.android.gms.permission.ACTIVITY_RECOGNITION"})
    @oo0oO0
    Task<Void> removeActivityTransitionUpdates(@oo0oO0 PendingIntent pendingIntent);

    @o0OO0oO0(anyOf = {o00oo0.f17338o00ooO00, "com.google.android.gms.permission.ACTIVITY_RECOGNITION"})
    @oo0oO0
    Task<Void> removeActivityUpdates(@oo0oO0 PendingIntent pendingIntent);

    @oo0oO0
    Task<Void> removeSleepSegmentUpdates(@oo0oO0 PendingIntent pendingIntent);

    @o0OO0oO0(anyOf = {o00oo0.f17338o00ooO00, "com.google.android.gms.permission.ACTIVITY_RECOGNITION"})
    @oo0oO0
    Task<Void> requestActivityTransitionUpdates(@oo0oO0 ActivityTransitionRequest activityTransitionRequest, @oo0oO0 PendingIntent pendingIntent);

    @o0OO0oO0(anyOf = {o00oo0.f17338o00ooO00, "com.google.android.gms.permission.ACTIVITY_RECOGNITION"})
    @oo0oO0
    Task<Void> requestActivityUpdates(long j, @oo0oO0 PendingIntent pendingIntent);

    @o0OO0oO0(anyOf = {o00oo0.f17338o00ooO00, "com.google.android.gms.permission.ACTIVITY_RECOGNITION"})
    @oo0oO0
    Task<Void> requestSleepSegmentUpdates(@oo0oO0 PendingIntent pendingIntent, @oo0oO0 SleepSegmentRequest sleepSegmentRequest);
}
