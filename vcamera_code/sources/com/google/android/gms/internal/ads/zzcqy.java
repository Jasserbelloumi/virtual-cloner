package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcqy implements zzfuf {
    public final /* synthetic */ zzfuf zza;
    public final /* synthetic */ zzcra zzb;

    public zzcqy(zzcra zzcraVar, zzfuf zzfufVar) {
        this.zzb = zzcraVar;
        this.zza = zzfufVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        this.zza.zza(th);
        zzbzn.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqx
            @Override // java.lang.Runnable
            public final void run() {
                zzcra.this.zzd();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcra.zzb(this.zzb, ((zzcqt) obj).zza, this.zza);
    }
}
