package com.google.android.gms.measurement.internal;
/* loaded from: classes2.dex */
final class zzju implements Runnable {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzkc zzb;

    public zzju(zzkc zzkcVar, long j) {
        this.zzb = zzkcVar;
        this.zza = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkc.zzl(this.zzb, this.zza);
    }
}
