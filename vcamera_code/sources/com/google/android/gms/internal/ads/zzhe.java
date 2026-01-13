package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.exoplayer2.C;
/* loaded from: classes2.dex */
public final class zzhe {
    private final long zza;
    private final long zzb;
    private long zzc = C.TIME_UNSET;
    private long zzd = C.TIME_UNSET;
    private long zzf = C.TIME_UNSET;
    private long zzg = C.TIME_UNSET;
    private float zzj = 0.97f;
    private float zzi = 1.03f;
    private float zzk = 1.0f;
    private long zzl = C.TIME_UNSET;
    private long zze = C.TIME_UNSET;
    private long zzh = C.TIME_UNSET;
    private long zzm = C.TIME_UNSET;
    private long zzn = C.TIME_UNSET;

    public /* synthetic */ zzhe(float f, float f2, long j, float f3, long j2, long j3, float f4, zzhd zzhdVar) {
        this.zza = j2;
        this.zzb = j3;
    }

    private static long zzf(long j, long j2, float f) {
        return (((float) j2) * 9.999871E-4f) + (((float) j) * 0.999f);
    }

    private final void zzg() {
        long j = this.zzc;
        if (j != C.TIME_UNSET) {
            long j2 = this.zzd;
            if (j2 != C.TIME_UNSET) {
                j = j2;
            }
            long j3 = this.zzf;
            if (j3 != C.TIME_UNSET && j < j3) {
                j = j3;
            }
            long j4 = this.zzg;
            if (j4 != C.TIME_UNSET && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.zze == j) {
            return;
        }
        this.zze = j;
        this.zzh = j;
        this.zzm = C.TIME_UNSET;
        this.zzn = C.TIME_UNSET;
        this.zzl = C.TIME_UNSET;
    }

    public final float zza(long j, long j2) {
        long zzf;
        long j3;
        if (this.zzc != C.TIME_UNSET) {
            long j4 = j - j2;
            long j5 = this.zzm;
            if (j5 == C.TIME_UNSET) {
                this.zzm = j4;
                zzf = 0;
            } else {
                long max = Math.max(j4, zzf(j5, j4, 0.999f));
                this.zzm = max;
                zzf = zzf(this.zzn, Math.abs(j4 - max), 0.999f);
            }
            this.zzn = zzf;
            if (this.zzl != C.TIME_UNSET && SystemClock.elapsedRealtime() - this.zzl < 1000) {
                return this.zzk;
            }
            this.zzl = SystemClock.elapsedRealtime();
            long j6 = (this.zzn * 3) + this.zzm;
            if (this.zzh > j6) {
                float zzv = (float) zzew.zzv(1000L);
                long[] jArr = {j6, this.zze, this.zzh - (((this.zzk - 1.0f) * zzv) + ((this.zzi - 1.0f) * zzv))};
                j3 = j6;
                for (int i = 1; i < 3; i++) {
                    long j7 = jArr[i];
                    if (j7 > j3) {
                        j3 = j7;
                    }
                }
                this.zzh = j3;
            } else {
                long zzr = zzew.zzr(j - (Math.max(0.0f, this.zzk - 1.0f) / 1.0E-7f), this.zzh, j6);
                this.zzh = zzr;
                long j8 = this.zzg;
                if (j8 == C.TIME_UNSET || zzr <= j8) {
                    j3 = zzr;
                } else {
                    this.zzh = j8;
                    j3 = j8;
                }
            }
            long j9 = j - j3;
            r2 = Math.abs(j9) >= this.zza ? zzew.zza((((float) j9) * 1.0E-7f) + 1.0f, this.zzj, this.zzi) : 1.0f;
            this.zzk = r2;
        }
        return r2;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final void zzc() {
        long j = this.zzh;
        if (j == C.TIME_UNSET) {
            return;
        }
        long j2 = j + this.zzb;
        this.zzh = j2;
        long j3 = this.zzg;
        if (j3 != C.TIME_UNSET && j2 > j3) {
            this.zzh = j3;
        }
        this.zzl = C.TIME_UNSET;
    }

    public final void zzd(zzaw zzawVar) {
        long j = zzawVar.zzc;
        this.zzc = zzew.zzv(C.TIME_UNSET);
        this.zzf = zzew.zzv(C.TIME_UNSET);
        this.zzg = zzew.zzv(C.TIME_UNSET);
        this.zzj = 0.97f;
        this.zzi = 1.03f;
        zzg();
    }

    public final void zze(long j) {
        this.zzd = j;
        zzg();
    }
}
