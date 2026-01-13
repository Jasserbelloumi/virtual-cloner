package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzix implements Runnable {
    public final /* synthetic */ zzaw zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzc;
    public final /* synthetic */ zzjm zzd;

    public zzix(zzjm zzjmVar, zzaw zzawVar, String str, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzd = zzjmVar;
        this.zza = zzawVar;
        this.zzb = str;
        this.zzc = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdx zzdxVar;
        byte[] bArr = null;
        try {
            try {
                zzjm zzjmVar = this.zzd;
                zzdxVar = zzjmVar.zzb;
                if (zzdxVar == null) {
                    zzjmVar.zzt.zzay().zzd().zza("Discarding data. Failed to send event to service to bundle");
                } else {
                    bArr = zzdxVar.zzu(this.zza, this.zzb);
                    this.zzd.zzQ();
                }
            } catch (RemoteException e) {
                this.zzd.zzt.zzay().zzd().zzb("Failed to send event to the service to bundle", e);
            }
        } finally {
            this.zzd.zzt.zzv().zzS(this.zzc, bArr);
        }
    }
}
