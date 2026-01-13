package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzexm implements zzfuf {
    public final /* synthetic */ zzeiq zza;
    public final /* synthetic */ zzfen zzb;
    public final /* synthetic */ zzfec zzc;
    public final /* synthetic */ zzexo zzd;
    public final /* synthetic */ zzexp zze;

    public zzexm(zzexp zzexpVar, zzeiq zzeiqVar, zzfen zzfenVar, zzfec zzfecVar, zzexo zzexoVar) {
        this.zze = zzexpVar;
        this.zza = zzeiqVar;
        this.zzb = zzfenVar;
        this.zzc = zzfecVar;
        this.zzd = zzexoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        zzevt zzevtVar;
        zzexf zzexfVar;
        zzdly zzk;
        zzfep zzfepVar;
        zzfen zzfenVar;
        Executor executor;
        zzevtVar = this.zze.zze;
        zzdlz zzdlzVar = (zzdlz) zzevtVar.zzd();
        final com.google.android.gms.ads.internal.client.zze zzb = zzdlzVar == null ? zzezx.zzb(th, null) : zzdlzVar.zzb().zza(th);
        synchronized (this.zze) {
            if (zzdlzVar != null) {
                zzdlzVar.zza().zza(zzb);
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexl
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzexf zzexfVar2;
                        zzexm zzexmVar = zzexm.this;
                        com.google.android.gms.ads.internal.client.zze zzeVar = zzb;
                        zzexfVar2 = zzexmVar.zze.zzd;
                        zzexfVar2.zza(zzeVar);
                    }
                });
            } else {
                zzexfVar = this.zze.zzd;
                zzexfVar.zza(zzb);
                zzk = this.zze.zzk(this.zzd);
                zzk.zze().zzb().zzc().zzd();
            }
            zzezr.zzb(zzb.zza, th, "RewardedAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbcd.zzc.zze()).booleanValue() || (zzfenVar = this.zzb) == null) {
                zzfepVar = this.zze.zzg;
                zzfec zzfecVar = this.zzc;
                zzfecVar.zza(zzb);
                zzfecVar.zzg(th);
                zzfecVar.zzf(false);
                zzfepVar.zzb(zzfecVar.zzl());
            } else {
                zzfenVar.zzc(zzb);
                zzfec zzfecVar2 = this.zzc;
                zzfecVar2.zzg(th);
                zzfecVar2.zzf(false);
                zzfenVar.zza(zzfecVar2);
                zzfenVar.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzexf zzexfVar;
        Executor executor;
        final zzexf zzexfVar2;
        zzexf zzexfVar3;
        zzfep zzfepVar;
        zzfen zzfenVar;
        zzdlu zzdluVar = (zzdlu) obj;
        synchronized (this.zze) {
            zzcyt zzn = zzdluVar.zzn();
            zzexfVar = this.zze.zzd;
            zzn.zzd(zzexfVar);
            this.zza.zzb(zzdluVar);
            zzexp zzexpVar = this.zze;
            executor = zzexpVar.zzb;
            zzexfVar2 = zzexpVar.zzd;
            zzexfVar2.getClass();
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexk
                @Override // java.lang.Runnable
                public final void run() {
                    zzexf.this.zzn();
                }
            });
            zzexfVar3 = this.zze.zzd;
            zzexfVar3.onAdMetadataChanged();
            if (!((Boolean) zzbcd.zzc.zze()).booleanValue() || (zzfenVar = this.zzb) == null) {
                zzfepVar = this.zze.zzg;
                zzfec zzfecVar = this.zzc;
                zzfecVar.zzb(zzdluVar.zzp().zzb);
                zzfecVar.zzd(zzdluVar.zzl().zzg());
                zzfecVar.zzf(true);
                zzfepVar.zzb(zzfecVar.zzl());
            } else {
                zzfenVar.zzf(zzdluVar.zzp().zzb);
                zzfenVar.zze(zzdluVar.zzl().zzg());
                zzfec zzfecVar2 = this.zzc;
                zzfecVar2.zzf(true);
                zzfenVar.zza(zzfecVar2);
                zzfenVar.zzg();
            }
        }
    }
}
