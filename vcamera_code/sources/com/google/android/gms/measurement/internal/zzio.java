package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzio implements Runnable {
    public final /* synthetic */ zzq zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ zzkw zzc;
    public final /* synthetic */ zzjm zzd;

    public zzio(zzjm zzjmVar, zzq zzqVar, boolean z, zzkw zzkwVar) {
        this.zzd = zzjmVar;
        this.zza = zzqVar;
        this.zzb = z;
        this.zzc = zzkwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdx zzdxVar;
        zzjm zzjmVar = this.zzd;
        zzdxVar = zzjmVar.zzb;
        if (zzdxVar == null) {
            o00oOOo0.o00oOOo0(zzjmVar.zzt, "Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        this.zzd.zzD(zzdxVar, this.zzb ? null : this.zzc, this.zza);
        this.zzd.zzQ();
    }
}
