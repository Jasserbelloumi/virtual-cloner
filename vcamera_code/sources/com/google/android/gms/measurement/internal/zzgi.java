package com.google.android.gms.measurement.internal;
/* loaded from: classes2.dex */
final class zzgi implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ long zzd;
    public final /* synthetic */ zzgj zze;

    public zzgi(zzgj zzgjVar, String str, String str2, String str3, long j) {
        this.zze = zzgjVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkt zzktVar;
        zzkt zzktVar2;
        String str = this.zza;
        if (str == null) {
            zzktVar2 = this.zze.zza;
            zzktVar2.zzR(this.zzb, null);
            return;
        }
        zzie zzieVar = new zzie(this.zzc, str, this.zzd);
        zzktVar = this.zze.zza;
        zzktVar.zzR(this.zzb, zzieVar);
    }
}
