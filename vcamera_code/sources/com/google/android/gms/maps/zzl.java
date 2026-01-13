package com.google.android.gms.maps;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.maps.LocationSource;
import com.google.android.gms.maps.model.RuntimeRemoteException;
/* loaded from: classes2.dex */
final class zzl implements LocationSource.OnLocationChangedListener {
    public final /* synthetic */ com.google.android.gms.maps.internal.zzaj zza;

    public zzl(zzs zzsVar, com.google.android.gms.maps.internal.zzaj zzajVar) {
        this.zza = zzajVar;
    }

    @Override // com.google.android.gms.maps.LocationSource.OnLocationChangedListener
    public final void onLocationChanged(Location location) {
        try {
            this.zza.zzd(location);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
