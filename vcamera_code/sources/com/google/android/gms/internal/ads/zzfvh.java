package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfvh extends zzfus {
    public final /* synthetic */ zzfvj zza;
    private final zzftp zzb;

    public zzfvh(zzfvj zzfvjVar, zzftp zzftpVar) {
        this.zza = zzfvjVar;
        zzftpVar.getClass();
        this.zzb = zzftpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfus
    public final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzfut zza = this.zzb.zza();
        zzfnu.zzd(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.zzb);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfus
    public final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfus
    public final void zzd(Throwable th) {
        this.zza.zze(th);
    }

    @Override // com.google.android.gms.internal.ads.zzfus
    public final /* synthetic */ void zze(Object obj) {
        this.zza.zzt((zzfut) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfus
    public final boolean zzg() {
        return this.zza.isDone();
    }
}
