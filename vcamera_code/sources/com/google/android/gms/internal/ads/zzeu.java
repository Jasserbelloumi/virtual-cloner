package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import o00oOoO0.o00oOOoO;
import o00oOooO.o0O0OOOo;
/* loaded from: classes2.dex */
public final class zzeu {
    @o0O0OOOo("this")
    private long zza;
    @o0O0OOOo("this")
    private long zzb;
    @o0O0OOOo("this")
    private long zzc;
    private final ThreadLocal zzd = new ThreadLocal();

    public zzeu(long j) {
        zzf(0L);
    }

    public final synchronized long zza(long j) {
        if (this.zzb == C.TIME_UNSET) {
            long j2 = this.zza;
            if (j2 == TimestampAdjuster.MODE_SHARED) {
                Long l = (Long) this.zzd.get();
                l.getClass();
                j2 = l.longValue();
            }
            this.zzb = j2 - j;
            notifyAll();
        }
        this.zzc = j;
        return j + this.zzb;
    }

    public final synchronized long zzb(long j) {
        if (j == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long j2 = this.zzc;
        if (j2 != C.TIME_UNSET) {
            long j3 = (j2 * 90000) / 1000000;
            long j4 = (o00oOOoO.o00oOo00.f6911o00ooo0o + j3) / o00oOOoO.o00oOo00.f6912o00oooO;
            long j5 = (((-1) + j4) * o00oOOoO.o00oOo00.f6912o00oooO) + j;
            long j6 = (j4 * o00oOOoO.o00oOo00.f6912o00oooO) + j;
            j = Math.abs(j5 - j3) < Math.abs(j6 - j3) ? j5 : j6;
        }
        return zza((j * 1000000) / 90000);
    }

    public final synchronized long zzc() {
        long j = this.zza;
        return (j == Long.MAX_VALUE || j == TimestampAdjuster.MODE_SHARED) ? C.TIME_UNSET : j;
    }

    public final synchronized long zzd() {
        long j;
        j = this.zzc;
        return j != C.TIME_UNSET ? j + this.zzb : zzc();
    }

    public final synchronized long zze() {
        return this.zzb;
    }

    public final synchronized void zzf(long j) {
        this.zza = j;
        this.zzb = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.zzc = C.TIME_UNSET;
    }
}
