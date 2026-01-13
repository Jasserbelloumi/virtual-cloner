package com.google.android.gms.maps;

import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.internal.zzbl;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
/* loaded from: classes2.dex */
final class zzai extends zzbl {
    public final /* synthetic */ StreetViewPanorama.OnStreetViewPanoramaChangeListener zza;

    public zzai(StreetViewPanorama streetViewPanorama, StreetViewPanorama.OnStreetViewPanoramaChangeListener onStreetViewPanoramaChangeListener) {
        this.zza = onStreetViewPanoramaChangeListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbm
    public final void zzb(StreetViewPanoramaLocation streetViewPanoramaLocation) {
        this.zza.onStreetViewPanoramaChange(streetViewPanoramaLocation);
    }
}
