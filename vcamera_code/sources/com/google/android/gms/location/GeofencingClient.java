package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
import java.util.List;
import o00oOooO.o0OO0oO0;
import o00oOooO.oo0oO0;
import oo0oO0.o00oo0;
/* loaded from: classes2.dex */
public interface GeofencingClient extends HasApiKey<Api.ApiOptions.NoOptions> {
    @o0OO0oO0(o00oo0.f17344o00ooOo)
    @oo0oO0
    Task<Void> addGeofences(@oo0oO0 GeofencingRequest geofencingRequest, @oo0oO0 PendingIntent pendingIntent);

    @oo0oO0
    Task<Void> removeGeofences(@oo0oO0 PendingIntent pendingIntent);

    @oo0oO0
    Task<Void> removeGeofences(@oo0oO0 List<String> list);
}
