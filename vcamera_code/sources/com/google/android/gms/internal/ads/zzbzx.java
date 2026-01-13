package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;
import o00oOooO.o0OO00OO;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbzx implements zzfuf {
    public final /* synthetic */ zzbzz zza;

    public zzbzx(zzbzz zzbzzVar) {
        this.zza = zzbzzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zza(Throwable th) {
        AtomicInteger atomicInteger;
        atomicInteger = this.zza.zzb;
        atomicInteger.set(-1);
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zzb(@o0OO00OO Object obj) {
        AtomicInteger atomicInteger;
        atomicInteger = this.zza.zzb;
        atomicInteger.set(1);
    }
}
