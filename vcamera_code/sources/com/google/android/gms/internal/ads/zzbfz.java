package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbfz extends zzbfa {
    public final /* synthetic */ zzbgc zza;

    public /* synthetic */ zzbfz(zzbgc zzbgcVar, zzbfy zzbfyVar) {
        this.zza = zzbgcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfb
    public final void zze(zzber zzberVar, String str) {
        zzbgc zzbgcVar = this.zza;
        if (zzbgc.zza(zzbgcVar) == null) {
            return;
        }
        zzbgc.zza(zzbgcVar).onCustomClick(zzbgc.zzc(zzbgcVar, zzberVar), str);
    }
}
