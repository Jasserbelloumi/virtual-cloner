package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfvg extends zzftz {
    @CheckForNull
    private zzfut zza;
    @CheckForNull
    private ScheduledFuture zzb;

    private zzfvg(zzfut zzfutVar) {
        zzfutVar.getClass();
        this.zza = zzfutVar;
    }

    public static zzfut zzg(zzfut zzfutVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzfvg zzfvgVar = new zzfvg(zzfutVar);
        zzfvd zzfvdVar = new zzfvd(zzfvgVar);
        zzfvgVar.zzb = scheduledExecutorService.schedule(zzfvdVar, j, timeUnit);
        zzfutVar.zzc(zzfvdVar, zzftx.INSTANCE);
        return zzfvgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    @CheckForNull
    public final String zza() {
        zzfut zzfutVar = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (zzfutVar != null) {
            String o00oOOo02 = android.support.v4.media.o00oOoO.o00oOOo0("inputFuture=[", zzfutVar.toString(), "]");
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    return o00oOOo02 + ", remaining delay=[" + delay + " ms]";
                }
                return o00oOOo02;
            }
            return o00oOOo02;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    public final void zzb() {
        zzs(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}
