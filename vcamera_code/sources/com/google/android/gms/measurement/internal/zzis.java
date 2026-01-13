package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzis implements Runnable {
    public final /* synthetic */ zzq zza;
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzb;
    public final /* synthetic */ zzjm zzc;

    public zzis(zzjm zzjmVar, zzq zzqVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzc = zzjmVar;
        this.zza = zzqVar;
        this.zzb = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdx zzdxVar;
        String str = null;
        try {
            try {
                if (this.zzc.zzt.zzm().zzc().zzi(zzah.ANALYTICS_STORAGE)) {
                    zzjm zzjmVar = this.zzc;
                    zzdxVar = zzjmVar.zzb;
                    if (zzdxVar == null) {
                        zzjmVar.zzt.zzay().zzd().zza("Failed to get app instance id");
                    } else {
                        Preconditions.checkNotNull(this.zza);
                        str = zzdxVar.zzd(this.zza);
                        if (str != null) {
                            this.zzc.zzt.zzq().zzO(str);
                            this.zzc.zzt.zzm().zze.zzb(str);
                        }
                        this.zzc.zzQ();
                    }
                } else {
                    this.zzc.zzt.zzay().zzl().zza("Analytics storage consent denied; will not get app instance id");
                    this.zzc.zzt.zzq().zzO(null);
                    this.zzc.zzt.zzm().zze.zzb(null);
                }
            } catch (RemoteException e) {
                this.zzc.zzt.zzay().zzd().zzb("Failed to get app instance id", e);
            }
        } finally {
            this.zzc.zzt.zzv().zzV(this.zzb, null);
        }
    }
}
