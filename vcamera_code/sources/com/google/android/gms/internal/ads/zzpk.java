package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzpk implements zzof {
    public final /* synthetic */ zzpl zza;

    public /* synthetic */ zzpk(zzpl zzplVar, zzpj zzpjVar) {
        this.zza = zzplVar;
    }

    @Override // com.google.android.gms.internal.ads.zzof
    public final void zza(Exception exc) {
        zzee.zzc("MediaCodecAudioRenderer", "Audio sink error", exc);
        zzpl.zzU(this.zza).zzb(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzof
    public final void zzb() {
        zzpl zzplVar = this.zza;
        if (zzpl.zzT(zzplVar) != null) {
            zzpl.zzT(zzplVar).zzb();
        }
    }
}
