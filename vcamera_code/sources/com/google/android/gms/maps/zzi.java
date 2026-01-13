package com.google.android.gms.maps;

import android.location.Location;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzbb;
/* loaded from: classes2.dex */
final class zzi extends zzbb {
    public final /* synthetic */ GoogleMap.OnMyLocationClickListener zza;

    public zzi(GoogleMap googleMap, GoogleMap.OnMyLocationClickListener onMyLocationClickListener) {
        this.zza = onMyLocationClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbc
    public final void zzb(Location location) {
        this.zza.onMyLocationClick(location);
    }
}
