package com.google.android.gms.maps;

import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.internal.zzbn;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
/* loaded from: classes2.dex */
final class zzak extends zzbn {
    public final /* synthetic */ StreetViewPanorama.OnStreetViewPanoramaClickListener zza;

    public zzak(StreetViewPanorama streetViewPanorama, StreetViewPanorama.OnStreetViewPanoramaClickListener onStreetViewPanoramaClickListener) {
        this.zza = onStreetViewPanoramaClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbo
    public final void zzb(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        this.zza.onStreetViewPanoramaClick(streetViewPanoramaOrientation);
    }
}
