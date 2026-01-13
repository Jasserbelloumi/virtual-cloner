package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzao implements Runnable {
    public final /* synthetic */ zzgm zza;
    public final /* synthetic */ zzap zzb;

    public zzao(zzap zzapVar, zzgm zzgmVar) {
        this.zzb = zzapVar;
        this.zza = zzgmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzaw();
        if (zzab.zza()) {
            this.zza.zzaz().zzp(this);
            return;
        }
        boolean zze = this.zzb.zze();
        this.zzb.zzd = 0L;
        if (zze) {
            this.zzb.zzc();
        }
    }
}
