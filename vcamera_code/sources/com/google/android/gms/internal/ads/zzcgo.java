package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
/* loaded from: classes2.dex */
public final class zzcgo implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzcgo(zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdrm zzdrmVar = (zzdrm) this.zza.zzb();
        zzfuu zzfuuVar = zzbzn.zza;
        zzgxg.zzb(zzfuuVar);
        Set singleton = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbw)).booleanValue() ? Collections.singleton(new zzdbu(zzdrmVar, zzfuuVar)) : Collections.emptySet();
        zzgxg.zzb(singleton);
        return singleton;
    }
}
