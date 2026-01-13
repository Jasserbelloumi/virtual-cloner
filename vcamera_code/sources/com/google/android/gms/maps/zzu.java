package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
/* loaded from: classes2.dex */
final class zzu extends com.google.android.gms.maps.internal.zzu {
    public final /* synthetic */ GoogleMap.OnCameraMoveStartedListener zza;

    public zzu(GoogleMap googleMap, GoogleMap.OnCameraMoveStartedListener onCameraMoveStartedListener) {
        this.zza = onCameraMoveStartedListener;
    }

    @Override // com.google.android.gms.maps.internal.zzv
    public final void zzb(int i) {
        this.zza.onCameraMoveStarted(i);
    }
}
