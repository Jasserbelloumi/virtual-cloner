package com.google.android.gms.measurement.internal;
/* loaded from: classes2.dex */
final class zzjv implements Runnable {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzkc zzb;

    public zzjv(zzkc zzkcVar, long j) {
        this.zzb = zzkcVar;
        this.zza = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkc.zzj(this.zzb, this.zza);
    }
}
