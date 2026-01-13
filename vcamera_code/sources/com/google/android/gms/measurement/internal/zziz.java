package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zziz implements Runnable {
    public final /* synthetic */ zzq zza;
    public final /* synthetic */ zzjm zzb;

    public zziz(zzjm zzjmVar, zzq zzqVar) {
        this.zzb = zzjmVar;
        this.zza = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdx zzdxVar;
        zzjm zzjmVar = this.zzb;
        zzdxVar = zzjmVar.zzb;
        if (zzdxVar == null) {
            o00oOOo0.o00oOOo0(zzjmVar.zzt, "Failed to send measurementEnabled to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzdxVar.zzs(this.zza);
            this.zzb.zzQ();
        } catch (RemoteException e) {
            this.zzb.zzt.zzay().zzd().zzb("Failed to send measurementEnabled to the service", e);
        }
    }
}
