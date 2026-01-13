package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzik implements Runnable {
    public final /* synthetic */ zzie zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ zzim zzc;

    public zzik(zzim zzimVar, zzie zzieVar, long j) {
        this.zzc = zzimVar;
        this.zza = zzieVar;
        this.zzb = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzB(this.zza, false, this.zzb);
        zzim zzimVar = this.zzc;
        zzimVar.zza = null;
        zzimVar.zzt.zzt().zzG(null);
    }
}
