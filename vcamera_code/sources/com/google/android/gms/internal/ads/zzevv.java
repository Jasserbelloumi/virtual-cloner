package com.google.android.gms.internal.ads;

import android.content.Context;
/* loaded from: classes2.dex */
public final class zzevv implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;

    public zzevv(zzgxl zzgxlVar, zzgxl zzgxlVar2, zzgxl zzgxlVar3) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
        this.zzc = zzgxlVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    /* renamed from: zza */
    public final zzevt zzb() {
        Context context = (Context) this.zza.zzb();
        zzfaf zzfafVar = (zzfaf) this.zzb.zzb();
        zzfax zzfaxVar = (zzfax) this.zzc.zzb();
        zzbyd zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfT)).booleanValue() ? com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh() : com.google.android.gms.ads.internal.zzt.zzo().zzh().zzi();
        boolean z = false;
        if (zzh != null && zzh.zzh()) {
            z = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgj)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfS)).booleanValue() || z) {
                zzfaw zza = zzfaxVar.zza(zzfan.AppOpen, context, zzfafVar, new zzeux(new zzeuu()));
                zzevj zzevjVar = new zzevj(new zzevi());
                zzfaj zzfajVar = zza.zza;
                zzfuu zzfuuVar = zzbzn.zza;
                return new zzeuz(zzevjVar, new zzevf(zzfajVar, zzfuuVar), zza.zzb, zza.zza.zza().zzf, zzfuuVar);
            }
        }
        return new zzevi();
    }
}
