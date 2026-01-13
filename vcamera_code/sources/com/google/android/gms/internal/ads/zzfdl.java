package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes2.dex */
public final class zzfdl implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;

    public zzfdl(zzgxl zzgxlVar, zzgxl zzgxlVar2, zzgxl zzgxlVar3) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
        this.zzc = zzgxlVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgws zza = zzgwx.zza(this.zza);
        zzgws zza2 = zzgwx.zza(this.zzb);
        Object zzfdnVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhT)).booleanValue() ? new zzfdn((zzfdk) zza.zzb(), (ScheduledExecutorService) this.zzc.zzb()) : (zzfdk) zza2.zzb();
        zzgxg.zzb(zzfdnVar);
        return zzfdnVar;
    }
}
