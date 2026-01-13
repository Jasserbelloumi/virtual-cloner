package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzig implements Runnable {
    public final /* synthetic */ Bundle zza;
    public final /* synthetic */ zzie zzb;
    public final /* synthetic */ zzie zzc;
    public final /* synthetic */ long zzd;
    public final /* synthetic */ zzim zze;

    public zzig(zzim zzimVar, Bundle bundle, zzie zzieVar, zzie zzieVar2, long j) {
        this.zze = zzimVar;
        this.zza = bundle;
        this.zzb = zzieVar;
        this.zzc = zzieVar2;
        this.zzd = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzim.zzp(this.zze, this.zza, this.zzb, this.zzc, this.zzd);
    }
}
