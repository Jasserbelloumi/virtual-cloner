package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfst extends zzfsv {
    public zzfst(zzfut zzfutVar, Class cls, zzftq zzftqVar) {
        super(zzfutVar, cls, zzftqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfsv
    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Throwable th) throws Exception {
        zzftq zzftqVar = (zzftq) obj;
        zzfut zza = zzftqVar.zza(th);
        zzfnu.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzftqVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfsv
    public final /* synthetic */ void zzg(Object obj) {
        zzt((zzfut) obj);
    }
}
