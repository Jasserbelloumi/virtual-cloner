package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
/* loaded from: classes2.dex */
public final class zzze {
    public static final zzze zza = new zzze(-3, C.TIME_UNSET, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzze(int i, long j, long j2) {
        this.zzb = i;
        this.zzc = j;
        this.zzd = j2;
    }

    public static zzze zzd(long j, long j2) {
        return new zzze(-1, j, j2);
    }

    public static zzze zze(long j) {
        return new zzze(0, C.TIME_UNSET, j);
    }

    public static zzze zzf(long j, long j2) {
        return new zzze(-2, j, j2);
    }
}
