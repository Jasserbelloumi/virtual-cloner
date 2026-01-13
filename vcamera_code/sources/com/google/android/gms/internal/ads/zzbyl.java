package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.math.BigInteger;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes2.dex */
public final class zzbyl {
    @GuardedBy("this")
    private BigInteger zza = BigInteger.ONE;
    @GuardedBy("this")
    private String zzb = SessionDescription.SUPPORTED_SDP_VERSION;

    public final synchronized String zza() {
        String bigInteger;
        bigInteger = this.zza.toString();
        this.zza = this.zza.add(BigInteger.ONE);
        this.zzb = bigInteger;
        return bigInteger;
    }

    public final synchronized String zzb() {
        return this.zzb;
    }
}
