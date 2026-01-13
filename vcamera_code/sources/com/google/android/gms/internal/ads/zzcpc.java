package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
public final class zzcpc implements zzgwy {
    private final zzcor zza;
    private final zzgxl zzb;
    private final zzgxl zzc;

    public zzcpc(zzcor zzcorVar, zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzcorVar;
        this.zzb = zzgxlVar;
        this.zzc = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    /* renamed from: zza */
    public final zzbwn zzb() {
        return new zzbwn(((zzcgj) this.zzb).zza(), ((zzcuf) this.zzc).zza().zzf);
    }
}
