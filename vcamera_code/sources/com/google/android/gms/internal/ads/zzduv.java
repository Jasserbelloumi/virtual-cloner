package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public final class zzduv extends zzdut {
    public zzduv(Context context) {
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
                    this.zzf.zzp().zzf(this.zze, new zzdus(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    zzbzsVar = this.zza;
                    zzdviVar = new zzdvi(1);
                    zzbzsVar.zze(zzdviVar);
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "RemoteSignalsClientTask.onConnected");
                    zzbzsVar = this.zza;
                    zzdviVar = new zzdvi(1);
                    zzbzsVar.zze(zzdviVar);
                }
            }
        }
    }

    public final zzfut zzb(zzbtn zzbtnVar) {
        synchronized (this.zzb) {
            if (this.zzc) {
                return this.zza;
            }
            this.zzc = true;
            this.zze = zzbtnVar;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzduu
                @Override // java.lang.Runnable
                public final void run() {
                    zzduv.this.zza();
                }
            }, zzbzn.zzf);
            return this.zza;
        }
    }
}
