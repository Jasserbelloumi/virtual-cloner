package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
/* loaded from: classes2.dex */
public final class zzeau implements zzeat {
    @VisibleForTesting
    public final zzeat zza;
    private final zzfnj zzb;

    public zzeau(zzeat zzeatVar, zzfnj zzfnjVar) {
        this.zza = zzeatVar;
        this.zzb = zzfnjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeat
    public final zzfut zza(zzeyo zzeyoVar, zzeyc zzeycVar) {
        return zzfuj.zzl(this.zza.zza(zzeyoVar, zzeycVar), this.zzb, zzbzn.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzeat
    public final boolean zzb(zzeyo zzeyoVar, zzeyc zzeycVar) {
        return this.zza.zzb(zzeyoVar, zzeycVar);
    }
}
