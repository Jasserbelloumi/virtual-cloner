package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* loaded from: classes2.dex */
public final class zzelt implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzelt(zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzelk(((zzelf) this.zza).zzb(), 10000L, (Clock) this.zzb.zzb());
    }
}
