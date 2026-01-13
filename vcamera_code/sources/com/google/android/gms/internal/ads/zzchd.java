package com.google.android.gms.internal.ads;

import android.content.Context;
/* loaded from: classes2.dex */
public final class zzchd implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzchd(zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    /* renamed from: zza */
    public final zzbty zzb() {
        Context zza = ((zzcgj) this.zza).zza();
        zzfep zzfepVar = (zzfep) this.zzb.zzb();
        zzbmf zzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(zza, zzbzg.zza(), zzfepVar);
        zzblz zzblzVar = zzbmc.zza;
        zzb.zza("google.afma.request.getAdDictionary", zzblzVar, zzblzVar);
        return new zzbtx(zza, com.google.android.gms.ads.internal.zzt.zzf().zzb(zza, zzbzg.zza(), zzfepVar).zza("google.afma.sdkConstants.getSdkConstants", zzblzVar, zzblzVar));
    }
}
