package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMap;
/* loaded from: classes2.dex */
final class zzj extends com.google.android.gms.maps.internal.zzan {
    public final /* synthetic */ GoogleMap.OnMapLoadedCallback zza;

    public zzj(GoogleMap googleMap, GoogleMap.OnMapLoadedCallback onMapLoadedCallback) {
        this.zza = onMapLoadedCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzao
    public final void zzb() throws RemoteException {
        this.zza.onMapLoaded();
    }
}
