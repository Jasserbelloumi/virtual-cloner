package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzftd extends zzftf {
    public zzftd(zzfut zzfutVar, zzftq zzftqVar) {
        super(zzfutVar, zzftqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzftf
    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Object obj2) throws Exception {
        zzftq zzftqVar = (zzftq) obj;
        zzfut zza = zzftqVar.zza(obj2);
        zzfnu.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzftqVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzftf
    public final /* synthetic */ void zzg(Object obj) {
        zzt((zzfut) obj);
    }
}
