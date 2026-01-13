package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zziu implements Runnable {
    public final /* synthetic */ zzie zza;
    public final /* synthetic */ zzjm zzb;

    public zziu(zzjm zzjmVar, zzie zzieVar) {
        this.zzb = zzjmVar;
        this.zza = zzieVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdx zzdxVar;
        zzjm zzjmVar = this.zzb;
        zzdxVar = zzjmVar.zzb;
        if (zzdxVar == null) {
            o00oOOo0.o00oOOo0(zzjmVar.zzt, "Failed to send current screen to service");
            return;
        }
        try {
            zzie zzieVar = this.zza;
            if (zzieVar == null) {
                zzdxVar.zzq(0L, null, null, zzjmVar.zzt.zzau().getPackageName());
            } else {
                zzdxVar.zzq(zzieVar.zzc, zzieVar.zza, zzieVar.zzb, zzjmVar.zzt.zzau().getPackageName());
            }
            this.zzb.zzQ();
        } catch (RemoteException e) {
            this.zzb.zzt.zzay().zzd().zzb("Failed to send current screen to the service", e);
        }
    }
}
