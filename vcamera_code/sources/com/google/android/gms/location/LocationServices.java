package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.location.zzau;
import com.google.android.gms.internal.location.zzbp;
import com.google.android.gms.internal.location.zzbv;
import com.google.android.gms.internal.location.zzbz;
import com.google.android.gms.internal.location.zzcc;
import com.google.android.gms.internal.location.zzce;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public class LocationServices {
    @oo0oO0
    @Deprecated
    public static final Api<Api.ApiOptions.NoOptions> API = zzbp.zzb;
    @oo0oO0
    @Deprecated
    public static final FusedLocationProviderApi FusedLocationApi = new zzau();
    @oo0oO0
    @Deprecated
    public static final GeofencingApi GeofencingApi = new zzbv();
    @oo0oO0
    @Deprecated
    public static final SettingsApi SettingsApi = new zzcc();

    private LocationServices() {
    }

    @oo0oO0
    public static FusedLocationProviderClient getFusedLocationProviderClient(@oo0oO0 Activity activity) {
        return new zzbp(activity);
    }

    @oo0oO0
    public static FusedLocationProviderClient getFusedLocationProviderClient(@oo0oO0 Context context) {
        return new zzbp(context);
    }

    @oo0oO0
    public static GeofencingClient getGeofencingClient(@oo0oO0 Activity activity) {
        return new zzbz(activity);
    }

    @oo0oO0
    public static GeofencingClient getGeofencingClient(@oo0oO0 Context context) {
        return new zzbz(context);
    }

    @oo0oO0
    public static SettingsClient getSettingsClient(@oo0oO0 Activity activity) {
        return new zzce(activity);
    }

    @oo0oO0
    public static SettingsClient getSettingsClient(@oo0oO0 Context context) {
        return new zzce(context);
    }
}
