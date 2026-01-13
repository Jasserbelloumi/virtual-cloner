package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;
import o00oOooO.oo0oO0;
@Deprecated
/* loaded from: classes.dex */
public interface MediationInterstitialListener {
    void onAdClicked(@oo0oO0 MediationInterstitialAdapter mediationInterstitialAdapter);

    void onAdClosed(@oo0oO0 MediationInterstitialAdapter mediationInterstitialAdapter);

    @Deprecated
    void onAdFailedToLoad(@oo0oO0 MediationInterstitialAdapter mediationInterstitialAdapter, int i);

    void onAdFailedToLoad(@oo0oO0 MediationInterstitialAdapter mediationInterstitialAdapter, @oo0oO0 AdError adError);

    void onAdLeftApplication(@oo0oO0 MediationInterstitialAdapter mediationInterstitialAdapter);

    void onAdLoaded(@oo0oO0 MediationInterstitialAdapter mediationInterstitialAdapter);

    void onAdOpened(@oo0oO0 MediationInterstitialAdapter mediationInterstitialAdapter);
}
