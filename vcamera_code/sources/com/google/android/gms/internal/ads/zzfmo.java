package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfmo extends zzfml {
    public final /* synthetic */ TaskCompletionSource zza;
    public final /* synthetic */ zzfml zzb;
    public final /* synthetic */ zzfmv zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfmo(zzfmv zzfmvVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, zzfml zzfmlVar) {
        super(taskCompletionSource);
        this.zzc = zzfmvVar;
        this.zza = taskCompletionSource2;
        this.zzb = zzfmlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfml
    public final void zza() {
        Object obj;
        AtomicInteger atomicInteger;
        zzfmk zzfmkVar;
        obj = this.zzc.zzg;
        synchronized (obj) {
            zzfmv.zzn(this.zzc, this.zza);
            atomicInteger = this.zzc.zzl;
            if (atomicInteger.getAndIncrement() > 0) {
                zzfmkVar = this.zzc.zzc;
                zzfmkVar.zzc("Already connected to the service.", new Object[0]);
            }
            zzfmv.zzp(this.zzc, this.zzb);
        }
    }
}
