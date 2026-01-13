package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.gms.common.util.VisibleForTesting;
/* loaded from: classes2.dex */
public final class zzcdg implements zzjp {
    private final zzwt zza = new zzwt(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    @Override // com.google.android.gms.internal.ads.zzjp
    public final long zza() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final void zzb() {
        zzj(false);
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final void zzc() {
        zzj(true);
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final void zzd() {
        zzj(true);
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final void zze(zzkn[] zzknVarArr, zzur zzurVar, zzwe[] zzweVarArr) {
        int i = 0;
        this.zzf = 0;
        while (true) {
            int length = zzknVarArr.length;
            if (i >= 2) {
                this.zza.zzf(this.zzf);
                return;
            }
            if (zzweVarArr[i] != null) {
                this.zzf += zzknVarArr[i].zzb() != 1 ? DefaultLoadControl.DEFAULT_VIDEO_BUFFER_SIZE : 13107200;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final boolean zzg(long j, long j2, float f) {
        boolean z = true;
        boolean z2 = j2 > this.zzc ? false : j2 < this.zzb ? true : true;
        int zza = this.zza.zza();
        int i = this.zzf;
        if (!z2 && (!z2 || !this.zzg || zza >= i)) {
            z = false;
        }
        this.zzg = z;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final boolean zzh(long j, float f, boolean z, long j2) {
        long j3 = z ? this.zze : this.zzd;
        return j3 <= 0 || j >= j3;
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final zzwt zzi() {
        return this.zza;
    }

    @VisibleForTesting
    public final void zzj(boolean z) {
        this.zzf = 0;
        this.zzg = false;
        if (z) {
            this.zza.zze();
        }
    }

    public final synchronized void zzk(int i) {
        this.zzd = i * 1000;
    }

    public final synchronized void zzl(int i) {
        this.zze = i * 1000;
    }

    public final synchronized void zzm(int i) {
        this.zzc = i * 1000;
    }

    public final synchronized void zzn(int i) {
        this.zzb = i * 1000;
    }
}
