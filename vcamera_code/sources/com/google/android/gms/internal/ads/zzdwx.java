package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes2.dex */
public final class zzdwx implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzdwx(zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    /* renamed from: zza */
    public final zzdww zzb() {
        return new zzdww(((zzcgj) this.zza).zza(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
