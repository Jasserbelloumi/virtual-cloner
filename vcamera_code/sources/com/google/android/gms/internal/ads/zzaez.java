package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.exoplayer2.C;
/* loaded from: classes2.dex */
final class zzaez implements zzafe {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzaez(long[] jArr, long[] jArr2, long j) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j == C.TIME_UNSET ? zzew.zzv(jArr2[jArr2.length - 1]) : j;
    }

    public static zzaez zza(long j, zzadt zzadtVar, long j2) {
        int length = zzadtVar.zzd.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += zzadtVar.zzb + zzadtVar.zzd[i3];
            j3 += zzadtVar.zzc + zzadtVar.zze[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new zzaez(jArr, jArr2, j2);
    }

    private static Pair zzd(long j, long[] jArr, long[] jArr2) {
        Long valueOf;
        Long valueOf2;
        int zzd = zzew.zzd(jArr, j, true, true);
        long j2 = jArr[zzd];
        long j3 = jArr2[zzd];
        int i = zzd + 1;
        if (i == jArr.length) {
            valueOf = Long.valueOf(j2);
            valueOf2 = Long.valueOf(j3);
        } else {
            long j4 = jArr[i];
            long j5 = jArr2[i];
            double d = j4 == j2 ? 0.0d : (j - j2) / (j4 - j2);
            valueOf = Long.valueOf(j);
            valueOf2 = Long.valueOf(((long) (d * (j5 - j3))) + j3);
        }
        return Pair.create(valueOf, valueOf2);
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final long zzb() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final long zzc(long j) {
        return zzew.zzv(((Long) zzd(j, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final zzaav zzg(long j) {
        Pair zzd = zzd(zzew.zzz(zzew.zzr(j, 0L, this.zzc)), this.zzb, this.zza);
        zzaay zzaayVar = new zzaay(zzew.zzv(((Long) zzd.first).longValue()), ((Long) zzd.second).longValue());
        return new zzaav(zzaayVar, zzaayVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final boolean zzh() {
        return true;
    }
}
