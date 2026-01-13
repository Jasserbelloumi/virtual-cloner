package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzccl implements Runnable {
    public final /* synthetic */ zzccm zza;

    public zzccl(zzccm zzccmVar) {
        this.zza = zzccmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzt.zzy().zzc(this.zza);
    }
}
