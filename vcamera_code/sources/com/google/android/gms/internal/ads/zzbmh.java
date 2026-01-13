package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzbmh implements zzbzu {
    public final /* synthetic */ zzbzs zza;
    public final /* synthetic */ zzbll zzb;

    public zzbmh(zzbmj zzbmjVar, zzbzs zzbzsVar, zzbll zzbllVar) {
        this.zza = zzbzsVar;
        this.zzb = zzbllVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzu
    public final void zza() {
        this.zza.zze(new zzblu("Unable to obtain a JavascriptEngine."));
        this.zzb.zzb();
    }
}
