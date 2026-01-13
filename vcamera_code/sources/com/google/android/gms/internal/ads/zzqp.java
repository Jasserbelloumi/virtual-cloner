package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
/* loaded from: classes2.dex */
final class zzqp {
    private long zza;
    private long zzb;
    private boolean zzc;

    private final long zzd(long j) {
        return Math.max(0L, ((this.zzb - 529) * 1000000) / j) + this.zza;
    }

    public final long zza(zzaf zzafVar) {
        return zzd(zzafVar.zzA);
    }

    public final long zzb(zzaf zzafVar, zzgr zzgrVar) {
        if (this.zzb == 0) {
            this.zza = zzgrVar.zzd;
        }
        if (this.zzc) {
            return zzgrVar.zzd;
        }
        ByteBuffer byteBuffer = zzgrVar.zzb;
        byteBuffer.getClass();
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i = (i << 8) | (byteBuffer.get(i2) & 255);
        }
        int zzc = zzaao.zzc(i);
        if (zzc != -1) {
            long zzd = zzd(zzafVar.zzA);
            this.zzb += zzc;
            return zzd;
        }
        this.zzc = true;
        this.zzb = 0L;
        this.zza = zzgrVar.zzd;
        zzee.zze("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
        return zzgrVar.zzd;
    }

    public final void zzc() {
        this.zza = 0L;
        this.zzb = 0L;
        this.zzc = false;
    }
}
