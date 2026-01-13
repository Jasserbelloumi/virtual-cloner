package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
abstract class zzacg {
    public final zzabb zza;

    public zzacg(zzabb zzabbVar) {
        this.zza = zzabbVar;
    }

    public abstract boolean zza(zzen zzenVar) throws zzbu;

    public abstract boolean zzb(zzen zzenVar, long j) throws zzbu;

    public final boolean zzf(zzen zzenVar, long j) throws zzbu {
        return zza(zzenVar) && zzb(zzenVar, j);
    }
}
