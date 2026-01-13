package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzbd;
import com.google.android.gms.maps.model.PointOfInterest;
/* loaded from: classes2.dex */
final class zzr extends zzbd {
    public final /* synthetic */ GoogleMap.OnPoiClickListener zza;

    public zzr(GoogleMap googleMap, GoogleMap.OnPoiClickListener onPoiClickListener) {
        this.zza = onPoiClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbe
    public final void zzb(PointOfInterest pointOfInterest) throws RemoteException {
        this.zza.onPoiClick(pointOfInterest);
    }
}
