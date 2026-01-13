package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfek implements zzfuf {
    public final /* synthetic */ zzfen zza;
    public final /* synthetic */ zzfec zzb;
    public final /* synthetic */ boolean zzc;

    public zzfek(zzfen zzfenVar, zzfec zzfecVar, boolean z) {
        this.zza = zzfenVar;
        this.zzb = zzfecVar;
        this.zzc = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        zzfec zzfecVar = this.zzb;
        if (zzfecVar.zzj()) {
            zzfen zzfenVar = this.zza;
            zzfecVar.zzg(th);
            zzfecVar.zzf(false);
            zzfenVar.zza(zzfecVar);
            if (this.zzc) {
                this.zza.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zzb(Object obj) {
        zzfen zzfenVar = this.zza;
        zzfec zzfecVar = this.zzb;
        zzfecVar.zzf(true);
        zzfenVar.zza(zzfecVar);
        if (this.zzc) {
            this.zza.zzg();
        }
    }
}
