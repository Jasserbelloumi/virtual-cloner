package com.google.android.gms.measurement.internal;
/* loaded from: classes2.dex */
final class zzgc implements Runnable {
    public final /* synthetic */ zzaw zza;
    public final /* synthetic */ zzq zzb;
    public final /* synthetic */ zzgj zzc;

    public zzgc(zzgj zzgjVar, zzaw zzawVar, zzq zzqVar) {
        this.zzc = zzgjVar;
        this.zza = zzawVar;
        this.zzb = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzv(this.zzc.zzb(this.zza, this.zzb), this.zzb);
    }
}
