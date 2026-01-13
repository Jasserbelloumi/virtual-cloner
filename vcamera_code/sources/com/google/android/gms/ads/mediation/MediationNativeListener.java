package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import o00oOooO.oo0oO0;
@Deprecated
/* loaded from: classes.dex */
public interface MediationNativeListener {
    void onAdClicked(@oo0oO0 MediationNativeAdapter mediationNativeAdapter);

    void onAdClosed(@oo0oO0 MediationNativeAdapter mediationNativeAdapter);

    @Deprecated
    void onAdFailedToLoad(@oo0oO0 MediationNativeAdapter mediationNativeAdapter, int i);

    void onAdFailedToLoad(@oo0oO0 MediationNativeAdapter mediationNativeAdapter, @oo0oO0 AdError adError);

    void onAdImpression(@oo0oO0 MediationNativeAdapter mediationNativeAdapter);

    void onAdLeftApplication(@oo0oO0 MediationNativeAdapter mediationNativeAdapter);

    void onAdLoaded(@oo0oO0 MediationNativeAdapter mediationNativeAdapter, @oo0oO0 UnifiedNativeAdMapper unifiedNativeAdMapper);

    void onAdOpened(@oo0oO0 MediationNativeAdapter mediationNativeAdapter);

    void onVideoEnd(@oo0oO0 MediationNativeAdapter mediationNativeAdapter);

    void zzc(@oo0oO0 MediationNativeAdapter mediationNativeAdapter, @oo0oO0 NativeCustomTemplateAd nativeCustomTemplateAd);

    void zze(@oo0oO0 MediationNativeAdapter mediationNativeAdapter, @oo0oO0 NativeCustomTemplateAd nativeCustomTemplateAd, @oo0oO0 String str);
}
