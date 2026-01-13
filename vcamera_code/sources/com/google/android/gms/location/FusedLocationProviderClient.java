package com.google.android.gms.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO0;
import o00oOooO.oo0oO0;
import oo0oO0.o00oo0;
/* loaded from: classes2.dex */
public interface FusedLocationProviderClient extends HasApiKey<Api.ApiOptions.NoOptions> {
    @oo0oO0
    @Deprecated
    public static final String KEY_MOCK_LOCATION = "mockLocation";
    @oo0oO0
    @Deprecated
    public static final String KEY_VERTICAL_ACCURACY = "verticalAccuracy";

    @oo0oO0
    Task<Void> flushLocations();

    @o0OO0oO0(anyOf = {o00oo0.f17346o00ooOoO, o00oo0.f17344o00ooOo})
    @oo0oO0
    Task<Location> getCurrentLocation(int i, @o0OO00OO CancellationToken cancellationToken);

    @o0OO0oO0(anyOf = {o00oo0.f17346o00ooOoO, o00oo0.f17344o00ooOo})
    @oo0oO0
    Task<Location> getCurrentLocation(@oo0oO0 CurrentLocationRequest currentLocationRequest, @o0OO00OO CancellationToken cancellationToken);

    @o0OO0oO0(anyOf = {o00oo0.f17346o00ooOoO, o00oo0.f17344o00ooOo})
    @oo0oO0
    Task<Location> getLastLocation();

    @o0OO0oO0(anyOf = {o00oo0.f17346o00ooOoO, o00oo0.f17344o00ooOo})
    @oo0oO0
    Task<Location> getLastLocation(@oo0oO0 LastLocationRequest lastLocationRequest);

    @o0OO0oO0(anyOf = {o00oo0.f17346o00ooOoO, o00oo0.f17344o00ooOo})
    @oo0oO0
    Task<LocationAvailability> getLocationAvailability();

    @oo0oO0
    Task<Void> removeLocationUpdates(@oo0oO0 PendingIntent pendingIntent);

    @oo0oO0
    Task<Void> removeLocationUpdates(@oo0oO0 LocationCallback locationCallback);

    @oo0oO0
    Task<Void> removeLocationUpdates(@oo0oO0 LocationListener locationListener);

    @o0OO0oO0(anyOf = {o00oo0.f17346o00ooOoO, o00oo0.f17344o00ooOo})
    @oo0oO0
    Task<Void> requestLocationUpdates(@oo0oO0 LocationRequest locationRequest, @oo0oO0 PendingIntent pendingIntent);

    @o0OO0oO0(anyOf = {o00oo0.f17346o00ooOoO, o00oo0.f17344o00ooOo})
    @oo0oO0
    Task<Void> requestLocationUpdates(@oo0oO0 LocationRequest locationRequest, @oo0oO0 LocationCallback locationCallback, @o0OO00OO Looper looper);

    @o0OO0oO0(anyOf = {o00oo0.f17346o00ooOoO, o00oo0.f17344o00ooOo})
    @oo0oO0
    Task<Void> requestLocationUpdates(@oo0oO0 LocationRequest locationRequest, @oo0oO0 LocationListener locationListener, @o0OO00OO Looper looper);

    @o0OO0oO0(anyOf = {o00oo0.f17346o00ooOoO, o00oo0.f17344o00ooOo})
    @oo0oO0
    Task<Void> requestLocationUpdates(@oo0oO0 LocationRequest locationRequest, @oo0oO0 Executor executor, @oo0oO0 LocationCallback locationCallback);

    @o0OO0oO0(anyOf = {o00oo0.f17346o00ooOoO, o00oo0.f17344o00ooOo})
    @oo0oO0
    Task<Void> requestLocationUpdates(@oo0oO0 LocationRequest locationRequest, @oo0oO0 Executor executor, @oo0oO0 LocationListener locationListener);

    @o0OO0oO0(anyOf = {o00oo0.f17346o00ooOoO, o00oo0.f17344o00ooOo})
    @oo0oO0
    Task<Void> setMockLocation(@oo0oO0 Location location);

    @o0OO0oO0(anyOf = {o00oo0.f17346o00ooOoO, o00oo0.f17344o00ooOo})
    @oo0oO0
    Task<Void> setMockMode(boolean z);
}
