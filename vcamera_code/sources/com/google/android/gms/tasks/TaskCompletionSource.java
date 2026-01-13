package com.google.android.gms.tasks;

import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public class TaskCompletionSource<TResult> {
    private final zzw zza = new zzw();

    public TaskCompletionSource() {
    }

    public TaskCompletionSource(@oo0oO0 CancellationToken cancellationToken) {
        cancellationToken.onCanceledRequested(new zzs(this));
    }

    @oo0oO0
    public Task<TResult> getTask() {
        return this.zza;
    }

    public void setException(@oo0oO0 Exception exc) {
        this.zza.zza(exc);
    }

    public void setResult(@o0OO00OO TResult tresult) {
        this.zza.zzb(tresult);
    }

    public boolean trySetException(@oo0oO0 Exception exc) {
        return this.zza.zzd(exc);
    }

    public boolean trySetResult(@o0OO00OO TResult tresult) {
        return this.zza.zze(tresult);
    }
}
