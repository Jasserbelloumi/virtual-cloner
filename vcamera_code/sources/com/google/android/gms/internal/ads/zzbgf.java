package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;
/* loaded from: classes2.dex */
public final class zzbgf extends zzbfk {
    private final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener zza;

    public zzbgf(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.zza = onUnifiedNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final void zze(zzbfu zzbfuVar) {
        this.zza.onUnifiedNativeAdLoaded(new zzbfv(zzbfuVar));
    }
}
