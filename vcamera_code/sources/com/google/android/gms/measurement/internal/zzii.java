package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzii implements Runnable {
    public final /* synthetic */ zzim zza;

    public zzii(zzim zzimVar) {
        this.zza = zzimVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzie zzieVar;
        zzim zzimVar = this.zza;
        zzieVar = zzimVar.zzh;
        zzimVar.zza = zzieVar;
    }
}
