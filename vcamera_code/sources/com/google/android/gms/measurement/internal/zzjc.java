package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzjc implements Runnable {
    public final /* synthetic */ zzq zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ zzac zzc;
    public final /* synthetic */ zzac zzd;
    public final /* synthetic */ zzjm zze;

    public zzjc(zzjm zzjmVar, boolean z, zzq zzqVar, boolean z2, zzac zzacVar, zzac zzacVar2) {
        this.zze = zzjmVar;
        this.zza = zzqVar;
        this.zzb = z2;
        this.zzc = zzacVar;
        this.zzd = zzacVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdx zzdxVar;
        zzjm zzjmVar = this.zze;
        zzdxVar = zzjmVar.zzb;
        if (zzdxVar == null) {
            o00oOOo0.o00oOOo0(zzjmVar.zzt, "Discarding data. Failed to send conditional user property to service");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        this.zze.zzD(zzdxVar, this.zzb ? null : this.zzc, this.zza);
        this.zze.zzQ();
    }
}
