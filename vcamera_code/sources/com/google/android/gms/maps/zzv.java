package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
/* loaded from: classes2.dex */
final class zzv extends com.google.android.gms.maps.internal.zzs {
    public final /* synthetic */ GoogleMap.OnCameraMoveListener zza;

    public zzv(GoogleMap googleMap, GoogleMap.OnCameraMoveListener onCameraMoveListener) {
        this.zza = onCameraMoveListener;
    }

    @Override // com.google.android.gms.maps.internal.zzt
    public final void zzb() {
        this.zza.onCameraMove();
    }
}
