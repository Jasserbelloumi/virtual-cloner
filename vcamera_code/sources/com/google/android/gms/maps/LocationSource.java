package com.google.android.gms.maps;

import android.location.Location;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public interface LocationSource {

    /* loaded from: classes2.dex */
    public interface OnLocationChangedListener {
        void onLocationChanged(@oo0oO0 Location location);
    }

    void activate(@oo0oO0 OnLocationChangedListener onLocationChangedListener);

    void deactivate();
}
