package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
final class zzbzj implements ThreadFactory {
    public final /* synthetic */ String zza;
    private final AtomicInteger zzb = new AtomicInteger(1);

    public zzbzj(String str) {
        this.zza = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.zza;
        int andIncrement = this.zzb.getAndIncrement();
        return new Thread(runnable, "AdWorker(" + str + ") #" + andIncrement);
    }
}
