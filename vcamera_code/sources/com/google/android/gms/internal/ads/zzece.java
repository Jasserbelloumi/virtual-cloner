package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* loaded from: classes2.dex */
final class zzece extends zzbop {
    public final /* synthetic */ zzecf zza;
    private final zzeaw zzb;

    public /* synthetic */ zzece(zzecf zzecfVar, zzeaw zzeawVar, zzecd zzecdVar) {
        this.zza = zzecfVar;
        this.zzb = zzeawVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboq
    public final void zze(String str) throws RemoteException {
        ((zzecq) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzboq
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzecq) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzboq
    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzecf.zze(this.zza, (View) ObjectWrapper.unwrap(iObjectWrapper));
        ((zzecq) this.zzb.zzc).zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzboq
    public final void zzh(zzbno zzbnoVar) throws RemoteException {
        zzecf.zzd(this.zza, zzbnoVar);
        ((zzecq) this.zzb.zzc).zzo();
    }
}
