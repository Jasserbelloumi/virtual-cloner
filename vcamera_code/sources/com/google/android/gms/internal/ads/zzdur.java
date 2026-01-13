package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public final class zzdur extends zzdut {
    public zzdur(Context context) {
        this.zzf = new zzbsn(context, com.google.android.gms.ads.internal.zzt.zzt().zzb(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbzs zzbzsVar;
        zzdvi zzdviVar;
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzg(this.zze, new zzdus(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    zzbzsVar = this.zza;
                    zzdviVar = new zzdvi(1);
                    zzbzsVar.zze(zzdviVar);
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "RemoteAdRequestClientTask.onConnected");
                    zzbzsVar = this.zza;
                    zzdviVar = new zzdvi(1);
                    zzbzsVar.zze(zzdviVar);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdut, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@oo0oO0 ConnectionResult connectionResult) {
        zzbza.zze("Cannot connect to remote service, fallback to local instance.");
        this.zza.zze(new zzdvi(1));
    }
}
