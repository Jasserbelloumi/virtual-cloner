package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzeun implements zzfuf {
    public final /* synthetic */ zzeiq zza;
    public final /* synthetic */ zzfen zzb;
    public final /* synthetic */ zzfec zzc;
    public final /* synthetic */ zzcph zzd;
    public final /* synthetic */ zzeuo zze;

    public zzeun(zzeuo zzeuoVar, zzeiq zzeiqVar, zzfen zzfenVar, zzfec zzfecVar, zzcph zzcphVar) {
        this.zze = zzeuoVar;
        this.zza = zzeiqVar;
        this.zzb = zzfenVar;
        this.zzc = zzfecVar;
        this.zzd = zzcphVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        zzcxd zzcxdVar;
        zzczk zzczkVar;
        zzfep zzfepVar;
        zzfen zzfenVar;
        Executor executor;
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zzd().zza(th);
        synchronized (this.zze) {
            this.zze.zzl = null;
            this.zzd.zzf().zza(zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhy)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeum
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeib zzeibVar;
                        zzeun zzeunVar = zzeun.this;
                        com.google.android.gms.ads.internal.client.zze zzeVar = zza;
                        zzeibVar = zzeunVar.zze.zzd;
                        zzeibVar.zza(zzeVar);
                    }
                });
            }
            zzeuo zzeuoVar = this.zze;
            zzcxdVar = zzeuoVar.zzh;
            zzczkVar = zzeuoVar.zzj;
            zzcxdVar.zzd(zzczkVar.zzc());
            zzezr.zzb(zza.zza, th, "BannerAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbcd.zzc.zze()).booleanValue() || (zzfenVar = this.zzb) == null) {
                zzfepVar = this.zze.zzi;
                zzfec zzfecVar = this.zzc;
                zzfecVar.zza(zza);
                zzfecVar.zzg(th);
                zzfecVar.zzf(false);
                zzfepVar.zzb(zzfecVar.zzl());
            } else {
                zzfenVar.zzc(zza);
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
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        zzcxd zzcxdVar;
        zzfep zzfepVar;
        zzfen zzfenVar;
        Executor executor;
        final zzeib zzeibVar;
        zzeib zzeibVar2;
        zzeif zzeifVar;
        zzcok zzcokVar = (zzcok) obj;
        synchronized (this.zze) {
            this.zze.zzl = null;
            viewGroup = this.zze.zzf;
            viewGroup.removeAllViews();
            if (zzcokVar.zzc() != null) {
                ViewParent parent = zzcokVar.zzc().getParent();
                if (parent instanceof ViewGroup) {
                    String zzg = zzcokVar.zzl() != null ? zzcokVar.zzl().zzg() : "";
                    zzbza.zzj("Banner view provided from " + zzg + " already has a parent view. Removing its old parent.");
                    ((ViewGroup) parent).removeView(zzcokVar.zzc());
                }
            }
            zzbaj zzbajVar = zzbar.zzhy;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbajVar)).booleanValue()) {
                zzcyt zzn = zzcokVar.zzn();
                zzeibVar2 = this.zze.zzd;
                zzn.zza(zzeibVar2);
                zzeifVar = this.zze.zze;
                zzn.zzc(zzeifVar);
            }
            viewGroup2 = this.zze.zzf;
            viewGroup2.addView(zzcokVar.zzc());
            this.zza.zzb(zzcokVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbajVar)).booleanValue()) {
                zzeuo zzeuoVar = this.zze;
                executor = zzeuoVar.zzb;
                zzeibVar = zzeuoVar.zzd;
                zzeibVar.getClass();
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeul
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeib.this.zzn();
                    }
                });
            }
            zzcxdVar = this.zze.zzh;
            zzcxdVar.zzd(zzcokVar.zza());
            if (!((Boolean) zzbcd.zzc.zze()).booleanValue() || (zzfenVar = this.zzb) == null) {
                zzfepVar = this.zze.zzi;
                zzfec zzfecVar = this.zzc;
                zzfecVar.zzb(zzcokVar.zzp().zzb);
                zzfecVar.zzd(zzcokVar.zzl().zzg());
                zzfecVar.zzf(true);
                zzfepVar.zzb(zzfecVar.zzl());
            } else {
                zzfenVar.zzf(zzcokVar.zzp().zzb);
                zzfenVar.zze(zzcokVar.zzl().zzg());
                zzfec zzfecVar2 = this.zzc;
                zzfecVar2.zzf(true);
                zzfenVar.zza(zzfecVar2);
                zzfenVar.zzg();
            }
        }
    }
}
