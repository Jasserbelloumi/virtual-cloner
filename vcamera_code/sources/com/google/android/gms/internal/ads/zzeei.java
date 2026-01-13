package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;
/* loaded from: classes2.dex */
public final class zzeei {
    private final zzezm zza;
    private final zzdna zzb;
    private final zzdpi zzc;
    private final zzfdk zzd;

    public zzeei(zzezm zzezmVar, zzdna zzdnaVar, zzdpi zzdpiVar, zzfdk zzfdkVar) {
        this.zza = zzezmVar;
        this.zzb = zzdnaVar;
        this.zzc = zzdpiVar;
        this.zzd = zzfdkVar;
    }

    public final void zza(zzeyf zzeyfVar, zzeyc zzeycVar, int i, @Nullable zzeax zzeaxVar, long j) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhS)).booleanValue()) {
            zzfdj zzb = zzfdj.zzb("adapter_status");
            zzb.zzg(zzeyfVar);
            zzb.zzf(zzeycVar);
            zzb.zza("adapter_l", String.valueOf(j));
            zzb.zza("sc", Integer.toString(i));
            if (zzeaxVar != null) {
                zzb.zza("arec", Integer.toString(zzeaxVar.zzb().zza));
                String zza = this.zza.zza(zzeaxVar.getMessage());
                if (zza != null) {
                    zzb.zza("areec", zza);
                }
            }
            zzdmz zzb2 = this.zzb.zzb(zzeycVar.zzu);
            if (zzb2 != null) {
                zzb.zza("ancn", zzb2.zza);
                zzbpq zzbpqVar = zzb2.zzb;
                if (zzbpqVar != null) {
                    zzb.zza("adapter_v", zzbpqVar.toString());
                }
                zzbpq zzbpqVar2 = zzb2.zzc;
                if (zzbpqVar2 != null) {
                    zzb.zza("adapter_sv", zzbpqVar2.toString());
                }
            }
            this.zzd.zzb(zzb);
            return;
        }
        zzdph zza2 = this.zzc.zza();
        zza2.zze(zzeyfVar);
        zza2.zzd(zzeycVar);
        zza2.zzb("action", "adapter_status");
        zza2.zzb("adapter_l", String.valueOf(j));
        zza2.zzb("sc", Integer.toString(i));
        if (zzeaxVar != null) {
            zza2.zzb("arec", Integer.toString(zzeaxVar.zzb().zza));
            String zza3 = this.zza.zza(zzeaxVar.getMessage());
            if (zza3 != null) {
                zza2.zzb("areec", zza3);
            }
        }
        zzdmz zzb3 = this.zzb.zzb(zzeycVar.zzu);
        if (zzb3 != null) {
            zza2.zzb("ancn", zzb3.zza);
            zzbpq zzbpqVar3 = zzb3.zzb;
            if (zzbpqVar3 != null) {
                zza2.zzb("adapter_v", zzbpqVar3.toString());
            }
            zzbpq zzbpqVar4 = zzb3.zzc;
            if (zzbpqVar4 != null) {
                zza2.zzb("adapter_sv", zzbpqVar4.toString());
            }
        }
        zza2.zzg();
    }
}
