package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class zzcnj implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;

    public zzcnj(zzgxl zzgxlVar, zzgxl zzgxlVar2, zzgxl zzgxlVar3) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
        this.zzc = zzgxlVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcng zzcngVar = (zzcng) this.zza.zzb();
        zzfuu zzfuuVar = zzbzn.zza;
        zzgxg.zzb(zzfuuVar);
        Set emptySet = ((JSONObject) this.zzc.zzb()) == null ? Collections.emptySet() : Collections.singleton(new zzdbu(zzcngVar, zzfuuVar));
        zzgxg.zzb(emptySet);
        return emptySet;
    }
}
