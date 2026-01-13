package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
/* loaded from: classes2.dex */
final class zzw extends com.google.android.gms.maps.internal.zzq {
    public final /* synthetic */ GoogleMap.OnCameraMoveCanceledListener zza;

    public zzw(GoogleMap googleMap, GoogleMap.OnCameraMoveCanceledListener onCameraMoveCanceledListener) {
        this.zza = onCameraMoveCanceledListener;
    }

    @Override // com.google.android.gms.maps.internal.zzr
    public final void zzb() {
        this.zza.onCameraMoveCanceled();
    }
}
