package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzapm implements zzfis {
    public final /* synthetic */ zzfhp zza;

    public zzapm(zzfhp zzfhpVar) {
        this.zza = zzfhpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfis
    public final void zza(int i, long j) {
        this.zza.zzd(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfis
    public final void zzb(int i, long j, String str) {
        this.zza.zze(i, System.currentTimeMillis() - j, str);
    }
}
