package org.osmdroid.views.overlay.mylocation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashSet;
import java.util.Set;
import org.osmdroid.util.NetworkLocationIgnorer;
/* loaded from: classes3.dex */
public class GpsMyLocationProvider implements IMyLocationProvider, LocationListener {
    private final Set<String> locationSources;
    private Location mLocation;
    private LocationManager mLocationManager;
    private IMyLocationConsumer mMyLocationConsumer;
    private long mLocationUpdateMinTime = 0;
    private float mLocationUpdateMinDistance = 0.0f;
    private NetworkLocationIgnorer mIgnorer = new NetworkLocationIgnorer();

    public GpsMyLocationProvider(Context context) {
        HashSet hashSet = new HashSet();
        this.locationSources = hashSet;
        this.mLocationManager = (LocationManager) context.getSystemService(FirebaseAnalytics.Param.LOCATION);
        hashSet.add("gps");
        hashSet.add("network");
    }

    public void addLocationSource(String str) {
        this.locationSources.add(str);
    }

    public void clearLocationSources() {
        this.locationSources.clear();
    }

    @Override // org.osmdroid.views.overlay.mylocation.IMyLocationProvider
    public void destroy() {
        stopLocationProvider();
        this.mLocation = null;
        this.mLocationManager = null;
        this.mMyLocationConsumer = null;
        this.mIgnorer = null;
    }

    @Override // org.osmdroid.views.overlay.mylocation.IMyLocationProvider
    public Location getLastKnownLocation() {
        return this.mLocation;
    }

    public Set<String> getLocationSources() {
        return this.locationSources;
    }

    public float getLocationUpdateMinDistance() {
        return this.mLocationUpdateMinDistance;
    }

    public long getLocationUpdateMinTime() {
        return this.mLocationUpdateMinTime;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        if (this.mIgnorer == null || location == null || location.getProvider() == null || this.mIgnorer.shouldIgnore(location.getProvider(), System.currentTimeMillis())) {
            return;
        }
        this.mLocation = location;
        IMyLocationConsumer iMyLocationConsumer = this.mMyLocationConsumer;
        if (iMyLocationConsumer != null) {
            iMyLocationConsumer.onLocationChanged(location, this);
        }
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public void setLocationUpdateMinDistance(float f) {
        this.mLocationUpdateMinDistance = f;
    }

    public void setLocationUpdateMinTime(long j) {
        this.mLocationUpdateMinTime = j;
    }

    @Override // org.osmdroid.views.overlay.mylocation.IMyLocationProvider
    @SuppressLint({"MissingPermission"})
    public boolean startLocationProvider(IMyLocationConsumer iMyLocationConsumer) {
        this.mMyLocationConsumer = iMyLocationConsumer;
        boolean z = false;
        for (String str : this.mLocationManager.getProviders(true)) {
            if (this.locationSources.contains(str)) {
                try {
                    this.mLocationManager.requestLocationUpdates(str, this.mLocationUpdateMinTime, this.mLocationUpdateMinDistance, this);
                    z = true;
                } catch (Throwable unused) {
                }
            }
        }
        return z;
    }

    @Override // org.osmdroid.views.overlay.mylocation.IMyLocationProvider
    @SuppressLint({"MissingPermission"})
    public void stopLocationProvider() {
        this.mMyLocationConsumer = null;
        LocationManager locationManager = this.mLocationManager;
        if (locationManager != null) {
            try {
                locationManager.removeUpdates(this);
            } catch (Throwable unused) {
            }
        }
    }
}
