package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
/* loaded from: classes2.dex */
final class zzd extends com.google.android.gms.maps.internal.zzag {
    public final /* synthetic */ GoogleMap.OnInfoWindowLongClickListener zza;

    public zzd(GoogleMap googleMap, GoogleMap.OnInfoWindowLongClickListener onInfoWindowLongClickListener) {
        this.zza = onInfoWindowLongClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzah
    public final void zzb(com.google.android.gms.internal.maps.zzaa zzaaVar) {
        this.zza.onInfoWindowLongClick(new Marker(zzaaVar));
    }
}
