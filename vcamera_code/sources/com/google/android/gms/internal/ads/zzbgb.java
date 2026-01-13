package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbgb extends zzbfd {
    public final /* synthetic */ zzbgc zza;

    public /* synthetic */ zzbgb(zzbgc zzbgcVar, zzbga zzbgaVar) {
        this.zza = zzbgcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfe
    public final void zze(zzber zzberVar) {
        NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener;
        NativeCustomTemplateAd zzf;
        zzbgc zzbgcVar = this.zza;
        onCustomTemplateAdLoadedListener = zzbgcVar.zza;
        zzf = zzbgcVar.zzf(zzberVar);
        onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded(zzf);
    }
}
