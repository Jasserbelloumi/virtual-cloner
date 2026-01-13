package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfuv implements Executor {
    public final /* synthetic */ Executor zza;
    public final /* synthetic */ zzfsx zzb;

    public zzfuv(Executor executor, zzfsx zzfsxVar) {
        this.zza = executor;
        this.zzb = zzfsxVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.zza.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.zzb.zze(e);
        }
    }
}
