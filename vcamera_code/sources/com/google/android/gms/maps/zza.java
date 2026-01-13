package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
/* loaded from: classes2.dex */
final class zza extends com.google.android.gms.maps.internal.zzat {
    public final /* synthetic */ GoogleMap.OnMarkerClickListener zza;

    public zza(GoogleMap googleMap, GoogleMap.OnMarkerClickListener onMarkerClickListener) {
        this.zza = onMarkerClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzau
    public final boolean zzb(com.google.android.gms.internal.maps.zzaa zzaaVar) {
        return this.zza.onMarkerClick(new Marker(zzaaVar));
    }
}
