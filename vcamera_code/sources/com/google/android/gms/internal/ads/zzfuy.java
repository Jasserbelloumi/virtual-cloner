package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfsx;
/* loaded from: classes2.dex */
final class zzfuy extends zzfsx.zzi implements Runnable {
    private final Runnable zza;

    public zzfuy(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Error | RuntimeException e) {
            zze(e);
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    public final String zza() {
        return android.support.v4.media.o00oOoO.o00oOOo0("task=[", this.zza.toString(), "]");
    }
}
