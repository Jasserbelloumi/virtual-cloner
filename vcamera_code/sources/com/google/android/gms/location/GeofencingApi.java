package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import java.util.List;
import o00oOooO.o0OO0oO0;
import o00oOooO.oo0oO0;
import oo0oO0.o00oo0;
@Deprecated
/* loaded from: classes2.dex */
public interface GeofencingApi {
    @o0OO0oO0(o00oo0.f17344o00ooOo)
    @oo0oO0
    PendingResult<Status> addGeofences(@oo0oO0 GoogleApiClient googleApiClient, @oo0oO0 GeofencingRequest geofencingRequest, @oo0oO0 PendingIntent pendingIntent);

    @o0OO0oO0(o00oo0.f17344o00ooOo)
    @oo0oO0
    @Deprecated
    PendingResult<Status> addGeofences(@oo0oO0 GoogleApiClient googleApiClient, @oo0oO0 List<Geofence> list, @oo0oO0 PendingIntent pendingIntent);

    @oo0oO0
    PendingResult<Status> removeGeofences(@oo0oO0 GoogleApiClient googleApiClient, @oo0oO0 PendingIntent pendingIntent);

    @oo0oO0
    PendingResult<Status> removeGeofences(@oo0oO0 GoogleApiClient googleApiClient, @oo0oO0 List<String> list);
}
