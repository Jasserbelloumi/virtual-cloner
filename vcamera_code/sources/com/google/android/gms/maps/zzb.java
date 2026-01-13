package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
/* loaded from: classes2.dex */
final class zzb extends com.google.android.gms.maps.internal.zzav {
    public final /* synthetic */ GoogleMap.OnMarkerDragListener zza;

    public zzb(GoogleMap googleMap, GoogleMap.OnMarkerDragListener onMarkerDragListener) {
        this.zza = onMarkerDragListener;
    }

    @Override // com.google.android.gms.maps.internal.zzaw
    public final void zzb(com.google.android.gms.internal.maps.zzaa zzaaVar) {
        this.zza.onMarkerDrag(new Marker(zzaaVar));
    }

    @Override // com.google.android.gms.maps.internal.zzaw
    public final void zzc(com.google.android.gms.internal.maps.zzaa zzaaVar) {
        this.zza.onMarkerDragEnd(new Marker(zzaaVar));
    }

    @Override // com.google.android.gms.maps.internal.zzaw
    public final void zzd(com.google.android.gms.internal.maps.zzaa zzaaVar) {
        this.zza.onMarkerDragStart(new Marker(zzaaVar));
    }
}
