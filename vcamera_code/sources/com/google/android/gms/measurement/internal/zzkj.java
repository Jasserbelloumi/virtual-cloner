package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzkj implements Runnable {
    public final /* synthetic */ zzku zza;
    public final /* synthetic */ zzkt zzb;

    public zzkj(zzkt zzktVar, zzku zzkuVar) {
        this.zzb = zzktVar;
        this.zza = zzkuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkt.zzy(this.zzb, this.zza);
        this.zzb.zzS();
    }
}
