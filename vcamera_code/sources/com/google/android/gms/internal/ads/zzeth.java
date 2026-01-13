package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzeth implements zzfuf {
    public final /* synthetic */ zzeiq zza;
    public final /* synthetic */ zzfen zzb;
    public final /* synthetic */ zzfec zzc;
    public final /* synthetic */ zzetj zzd;
    public final /* synthetic */ zzetk zze;

    public zzeth(zzetk zzetkVar, zzeiq zzeiqVar, zzfen zzfenVar, zzfec zzfecVar, zzetj zzetjVar) {
        this.zze = zzetkVar;
        this.zza = zzeiqVar;
        this.zzb = zzfenVar;
        this.zzc = zzfecVar;
        this.zzd = zzetjVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.android.gms.internal.ads.zzctw, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        zzevt zzevtVar;
        zzeua zzeuaVar;
        zzctv zzm;
        zzfep zzfepVar;
        zzfen zzfenVar;
        Executor executor;
        zzevtVar = this.zze.zze;
        zzcnu zzcnuVar = (zzcnu) zzevtVar.zzd();
        final com.google.android.gms.ads.internal.client.zze zzb = zzcnuVar == null ? zzezx.zzb(th, null) : zzcnuVar.zzb().zza(th);
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (zzcnuVar != null) {
                zzcnuVar.zzc().zza(zzb);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhz)).booleanValue()) {
                    executor = this.zze.zzc;
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzetg
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzeua zzeuaVar2;
                            zzeth zzethVar = zzeth.this;
                            com.google.android.gms.ads.internal.client.zze zzeVar = zzb;
                            zzeuaVar2 = zzethVar.zze.zzd;
                            zzeuaVar2.zza(zzeVar);
                        }
                    });
                }
            } else {
                zzeuaVar = this.zze.zzd;
                zzeuaVar.zza(zzb);
                zzm = this.zze.zzm(this.zzd);
                zzm.zzh().zzb().zzc().zzd();
            }
            zzezr.zzb(zzb.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbcd.zzc.zze()).booleanValue() || (zzfenVar = this.zzb) == null) {
                zzfepVar = this.zze.zzh;
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
        zzfep zzfepVar;
        zzfen zzfenVar;
        zzeua zzeuaVar;
        zzcqm zzcqmVar = (zzcqm) obj;
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhz)).booleanValue()) {
                zzcyt zzn = zzcqmVar.zzn();
                zzeuaVar = this.zze.zzd;
                zzn.zzb(zzeuaVar);
            }
            this.zza.zzb(zzcqmVar);
            if (!((Boolean) zzbcd.zzc.zze()).booleanValue() || (zzfenVar = this.zzb) == null) {
                zzfepVar = this.zze.zzh;
                zzfec zzfecVar = this.zzc;
                zzfecVar.zzb(zzcqmVar.zzp().zzb);
                zzfecVar.zzd(zzcqmVar.zzl().zzg());
                zzfecVar.zzf(true);
                zzfepVar.zzb(zzfecVar.zzl());
            } else {
                zzfenVar.zzf(zzcqmVar.zzp().zzb);
                zzfenVar.zze(zzcqmVar.zzl().zzg());
                zzfec zzfecVar2 = this.zzc;
                zzfecVar2.zzf(true);
                zzfenVar.zza(zzfecVar2);
                zzfenVar.zzg();
            }
        }
    }
}
