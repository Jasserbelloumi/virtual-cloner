package com.google.android.gms.location;

import com.google.android.gms.common.api.Response;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public class LocationSettingsResponse extends Response<LocationSettingsResult> {
    public LocationSettingsResponse(@oo0oO0 LocationSettingsResult locationSettingsResult) {
        super(locationSettingsResult);
    }

    @o0OO00OO
    public LocationSettingsStates getLocationSettingsStates() {
        return getResult().getLocationSettingsStates();
    }
}
