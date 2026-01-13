package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import o00oOooO.oo0oO0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzd implements zzq {
    private final Executor zza;
    private final Continuation zzb;
    private final zzw zzc;

    public zzd(@oo0oO0 Executor executor, @oo0oO0 Continuation continuation, @oo0oO0 zzw zzwVar) {
        this.zza = executor;
        this.zzb = continuation;
        this.zzc = zzwVar;
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzc() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.tasks.zzq
    public final void zzd(@oo0oO0 Task task) {
        this.zza.execute(new zzc(this, task));
    }
}
