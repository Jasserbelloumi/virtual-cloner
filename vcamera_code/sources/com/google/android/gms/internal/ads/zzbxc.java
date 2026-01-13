package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import o00oOooO.oo0oO0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbxc implements ThreadFactory {
    private final AtomicInteger zza = new AtomicInteger(1);

    public zzbxc(zzbxf zzbxfVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(@oo0oO0 Runnable runnable) {
        return new Thread(runnable, android.support.v4.media.o00oOOo0.o00oOOo0("AdWorker(SCION_TASK_EXECUTOR) #", this.zza.getAndIncrement()));
    }
}
