package com.google.android.gms.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO0;
import o00oOooO.oo0oO0;
import oo0oO0.o00oo0;
@Deprecated
/* loaded from: classes2.dex */
public interface FusedLocationProviderApi {
    @oo0oO0
    @Deprecated
    public static final String KEY_LOCATION_CHANGED = "com.google.android.location.LOCATION";
    @oo0oO0
    @Deprecated
    public static final String KEY_MOCK_LOCATION = "mockLocation";

    @oo0oO0
    PendingResult<Status> flushLocations(@oo0oO0 GoogleApiClient googleApiClient);

    @o0OO00OO
    @o0OO0oO0(anyOf = {o00oo0.f17346o00ooOoO, o00oo0.f17344o00ooOo})
    Location getLastLocation(@oo0oO0 GoogleApiClient googleApiClient);

    @o0OO00OO
    @o0OO0oO0(anyOf = {o00oo0.f17346o00ooOoO, o00oo0.f17344o00ooOo})
    LocationAvailability getLocationAvailability(@oo0oO0 GoogleApiClient googleApiClient);

    @oo0oO0
    PendingResult<Status> removeLocationUpdates(@oo0oO0 GoogleApiClient googleApiClient, @oo0oO0 PendingIntent pendingIntent);

    @oo0oO0
    PendingResult<Status> removeLocationUpdates(@oo0oO0 GoogleApiClient googleApiClient, @oo0oO0 LocationCallback locationCallback);

    @oo0oO0
    PendingResult<Status> removeLocationUpdates(@oo0oO0 GoogleApiClient googleApiClient, @oo0oO0 LocationListener locationListener);

    @o0OO0oO0(anyOf = {o00oo0.f17346o00ooOoO, o00oo0.f17344o00ooOo})
    @oo0oO0
    PendingResult<Status> requestLocationUpdates(@oo0oO0 GoogleApiClient googleApiClient, @oo0oO0 LocationRequest locationRequest, @oo0oO0 PendingIntent pendingIntent);

    @o0OO0oO0(anyOf = {o00oo0.f17346o00ooOoO, o00oo0.f17344o00ooOo})
    @oo0oO0
    PendingResult<Status> requestLocationUpdates(@oo0oO0 GoogleApiClient googleApiClient, @oo0oO0 LocationRequest locationRequest, @oo0oO0 LocationCallback locationCallback, @oo0oO0 Looper looper);

    @o0OO0oO0(anyOf = {o00oo0.f17346o00ooOoO, o00oo0.f17344o00ooOo})
    @oo0oO0
    PendingResult<Status> requestLocationUpdates(@oo0oO0 GoogleApiClient googleApiClient, @oo0oO0 LocationRequest locationRequest, @oo0oO0 LocationListener locationListener);

    @o0OO0oO0(anyOf = {o00oo0.f17346o00ooOoO, o00oo0.f17344o00ooOo})
    @oo0oO0
    PendingResult<Status> requestLocationUpdates(@oo0oO0 GoogleApiClient googleApiClient, @oo0oO0 LocationRequest locationRequest, @oo0oO0 LocationListener locationListener, @oo0oO0 Looper looper);

    @o0OO0oO0(anyOf = {o00oo0.f17346o00ooOoO, o00oo0.f17344o00ooOo})
    @oo0oO0
    PendingResult<Status> setMockLocation(@oo0oO0 GoogleApiClient googleApiClient, @oo0oO0 Location location);

    @o0OO0oO0(anyOf = {o00oo0.f17346o00ooOoO, o00oo0.f17344o00ooOo})
    @oo0oO0
    PendingResult<Status> setMockMode(@oo0oO0 GoogleApiClient googleApiClient, boolean z);
}
