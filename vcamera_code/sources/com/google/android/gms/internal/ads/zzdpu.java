package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* loaded from: classes2.dex */
public final class zzdpu implements zzgwy {
    private final zzgxl zza;

    public zzdpu(zzgxl zzgxlVar) {
        this.zza = zzgxlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdpt((Clock) this.zza.zzb());
    }
}
