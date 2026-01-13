package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
final class zzftu extends zzftv {
    public final /* synthetic */ zzftw zza;
    private final Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzftu(zzftw zzftwVar, Callable callable, Executor executor) {
        super(zzftwVar, executor);
        this.zza = zzftwVar;
        callable.getClass();
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzfus
    public final Object zza() throws Exception {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzfus
    public final String zzb() {
        return this.zzc.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzftv
    public final void zzc(Object obj) {
        this.zza.zzd(obj);
    }
}
