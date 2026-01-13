package com.google.android.gms.measurement.internal;
/* loaded from: classes2.dex */
final class zzeo implements Runnable {
    public final /* synthetic */ boolean zza;
    public final /* synthetic */ zzep zzb;

    public zzeo(zzep zzepVar, boolean z) {
        this.zzb = zzepVar;
        this.zza = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkt zzktVar;
        zzktVar = this.zzb.zzb;
        zzktVar.zzJ(this.zza);
    }
}
