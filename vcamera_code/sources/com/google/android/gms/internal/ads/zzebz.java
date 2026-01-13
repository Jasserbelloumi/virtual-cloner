package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public final class zzebz implements zzeba {
    private final Context zza;
    private final zzcph zzb;
    private final Executor zzc;

    public zzebz(Context context, zzcph zzcphVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcphVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzeba
    public final /* bridge */ /* synthetic */ Object zza(zzeyo zzeyoVar, final zzeyc zzeycVar, zzeaw zzeawVar) throws zzezc, zzeek {
        final View zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhh)).booleanValue() && zzeycVar.zzah) {
            zzbno zzc = ((zzezs) zzeawVar.zzb).zzc();
            if (zzc == null) {
                zzbza.zzg("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzezc(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                zza = (View) ObjectWrapper.unwrap(zzc.zze());
                boolean zzf = zzc.zzf();
                if (zza == null) {
                    throw new zzezc(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        zza = (View) zzfuj.zzm(zzfuj.zzh(null), new zzftq() { // from class: com.google.android.gms.internal.ads.zzeby
                            @Override // com.google.android.gms.internal.ads.zzftq
                            public final zzfut zza(Object obj) {
                                return zzebz.this.zzc(zza, zzeycVar, obj);
                            }
                        }, zzbzn.zze).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzezc(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzezc(e2);
            }
        } else {
            zza = ((zzezs) zzeawVar.zzb).zza();
        }
        zzcph zzcphVar = this.zzb;
        zzcrb zzcrbVar = new zzcrb(zzeyoVar, zzeycVar, zzeawVar.zza);
        final zzezs zzezsVar = (zzezs) zzeawVar.zzb;
        zzcol zza2 = zzcphVar.zza(zzcrbVar, new zzcor(zza, null, new zzcqk() { // from class: com.google.android.gms.internal.ads.zzebx
            @Override // com.google.android.gms.internal.ads.zzcqk
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return zzezs.this.zzb();
            }
        }, (zzeyd) zzeycVar.zzv.get(0)));
        zza2.zzg().zza(zza);
        zza2.zzd().zzm(new zzcmm((zzezs) zzeawVar.zzb), this.zzc);
        ((zzecq) zzeawVar.zzc).zzc(zza2.zzj());
        return zza2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeba
    public final void zzb(zzeyo zzeyoVar, zzeyc zzeycVar, zzeaw zzeawVar) throws zzezc {
        com.google.android.gms.ads.internal.client.zzq zzqVar;
        com.google.android.gms.ads.internal.client.zzq zzqVar2 = zzeyoVar.zza.zza.zze;
        if (zzqVar2.zzn) {
            zzqVar = new com.google.android.gms.ads.internal.client.zzq(this.zza, com.google.android.gms.ads.zzb.zzd(zzqVar2.zze, zzqVar2.zzb));
        } else {
            zzqVar = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhh)).booleanValue() && zzeycVar.zzah) ? new com.google.android.gms.ads.internal.client.zzq(this.zza, com.google.android.gms.ads.zzb.zze(zzqVar2.zze, zzqVar2.zzb)) : zzezb.zza(this.zza, zzeycVar.zzv);
        }
        com.google.android.gms.ads.internal.client.zzq zzqVar3 = zzqVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhh)).booleanValue() && zzeycVar.zzah) {
            ((zzezs) zzeawVar.zzb).zzn(this.zza, zzqVar3, zzeyoVar.zza.zza.zzd, zzeycVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbu.zzl(zzeycVar.zzt), (zzbnl) zzeawVar.zzc);
        } else {
            ((zzezs) zzeawVar.zzb).zzm(this.zza, zzqVar3, zzeyoVar.zza.zza.zzd, zzeycVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbu.zzl(zzeycVar.zzt), (zzbnl) zzeawVar.zzc);
        }
    }

    public final /* synthetic */ zzfut zzc(View view, zzeyc zzeycVar, Object obj) throws Exception {
        return zzfuj.zzh(zzcpy.zza(this.zza, view, zzeycVar));
    }
}
