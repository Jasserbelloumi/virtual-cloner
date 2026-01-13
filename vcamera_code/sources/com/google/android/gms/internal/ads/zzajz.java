package com.google.android.gms.internal.ads;

import java.util.concurrent.BlockingQueue;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzajz implements Runnable {
    public final /* synthetic */ zzako zza;
    public final /* synthetic */ zzaka zzb;

    public zzajz(zzaka zzakaVar, zzako zzakoVar) {
        this.zzb = zzakaVar;
        this.zza = zzakoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.zzb.zzc;
            blockingQueue.put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
