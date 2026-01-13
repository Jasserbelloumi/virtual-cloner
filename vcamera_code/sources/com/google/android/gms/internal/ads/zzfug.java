package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfug implements Runnable {
    public final Future zza;
    public final zzfuf zzb;

    public zzfug(Future future, zzfuf zzfufVar) {
        this.zza = future;
        this.zzb = zzfufVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable zza;
        Future future = this.zza;
        if ((future instanceof zzfvm) && (zza = zzfvn.zza((zzfvm) future)) != null) {
            this.zzb.zza(zza);
            return;
        }
        try {
            this.zzb.zzb(zzfuj.zzo(this.zza));
        } catch (Error e) {
            e = e;
            this.zzb.zza(e);
        } catch (RuntimeException e2) {
            e = e2;
            this.zzb.zza(e);
        } catch (ExecutionException e3) {
            this.zzb.zza(e3.getCause());
        }
    }

    public final String toString() {
        zzfnn zza = zzfno.zza(this);
        zza.zza(this.zzb);
        return zza.toString();
    }
}
