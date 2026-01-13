package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzbqm extends zzbfa {
    public final /* synthetic */ zzbqp zza;

    public /* synthetic */ zzbqm(zzbqp zzbqpVar, zzbql zzbqlVar) {
        this.zza = zzbqpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfb
    public final void zze(zzber zzberVar, String str) {
        zzbqp zzbqpVar = this.zza;
        if (zzbqp.zzc(zzbqpVar) == null) {
            return;
        }
        zzbqp.zzc(zzbqpVar).onCustomClick(zzbqp.zze(zzbqpVar, zzberVar), str);
    }
}
