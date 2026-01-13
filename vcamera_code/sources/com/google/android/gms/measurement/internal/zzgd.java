package com.google.android.gms.measurement.internal;
/* loaded from: classes2.dex */
final class zzgd implements Runnable {
    public final /* synthetic */ zzaw zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzgj zzc;

    public zzgd(zzgj zzgjVar, zzaw zzawVar, String str) {
        this.zzc = zzgjVar;
        this.zza = zzawVar;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkt zzktVar;
        zzkt zzktVar2;
        zzktVar = this.zzc.zza;
        zzktVar.zzA();
        zzktVar2 = this.zzc.zza;
        zzktVar2.zzF(this.zza, this.zzb);
    }
}
