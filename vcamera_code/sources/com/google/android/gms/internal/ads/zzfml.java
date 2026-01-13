package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.TaskCompletionSource;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public abstract class zzfml implements Runnable {
    @o0OO00OO
    private final TaskCompletionSource zza;

    public zzfml() {
        this.zza = null;
    }

    public zzfml(@o0OO00OO TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zza();
        } catch (Exception e) {
            zzc(e);
        }
    }

    public abstract void zza();

    @o0OO00OO
    public final TaskCompletionSource zzb() {
        return this.zza;
    }

    public final void zzc(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.zza;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }
}
