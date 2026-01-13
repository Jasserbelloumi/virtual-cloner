package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzcns implements zzaty {
    private final ScheduledExecutorService zza;
    private final Clock zzb;
    @GuardedBy("this")
    @o0OO00OO
    private ScheduledFuture zzc;
    @GuardedBy("this")
    private long zzd = -1;
    @GuardedBy("this")
    private long zze = -1;
    @GuardedBy("this")
    private Runnable zzf = null;
    @GuardedBy("this")
    private boolean zzg = false;

    public zzcns(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        this.zza = scheduledExecutorService;
        this.zzb = clock;
        com.google.android.gms.ads.internal.zzt.zzb().zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final void zza(boolean z) {
        if (z) {
            zzc();
        } else {
            zzb();
        }
    }

    @VisibleForTesting
    public final synchronized void zzb() {
        if (this.zzg) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture == null || scheduledFuture.isDone()) {
            this.zze = -1L;
        } else {
            this.zzc.cancel(true);
            this.zze = this.zzd - this.zzb.elapsedRealtime();
        }
        this.zzg = true;
    }

    @VisibleForTesting
    public final synchronized void zzc() {
        ScheduledFuture scheduledFuture;
        if (this.zzg) {
            if (this.zze > 0 && (scheduledFuture = this.zzc) != null && scheduledFuture.isCancelled()) {
                this.zzc = this.zza.schedule(this.zzf, this.zze, TimeUnit.MILLISECONDS);
            }
            this.zzg = false;
        }
    }

    public final synchronized void zzd(int i, Runnable runnable) {
        this.zzf = runnable;
        long j = i;
        this.zzd = this.zzb.elapsedRealtime() + j;
        this.zzc = this.zza.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }
}
