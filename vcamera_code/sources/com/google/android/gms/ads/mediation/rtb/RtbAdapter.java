package com.google.android.gms.ads.mediation.rtb;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import javax.annotation.ParametersAreNonnullByDefault;
import o00oOooO.oo0oO0;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public abstract class RtbAdapter extends Adapter {
    public abstract void collectSignals(@oo0oO0 RtbSignalData rtbSignalData, @oo0oO0 SignalCallbacks signalCallbacks);

    public void loadRtbAppOpenAd(@oo0oO0 MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @oo0oO0 MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        loadAppOpenAd(mediationAppOpenAdConfiguration, mediationAdLoadCallback);
    }

    public void loadRtbBannerAd(@oo0oO0 MediationBannerAdConfiguration mediationBannerAdConfiguration, @oo0oO0 MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
    }

    public void loadRtbInterscrollerAd(@oo0oO0 MediationBannerAdConfiguration mediationBannerAdConfiguration, @oo0oO0 MediationAdLoadCallback<MediationInterscrollerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        mediationAdLoadCallback.onFailure(new AdError(7, getClass().getSimpleName().concat(" does not support interscroller ads."), MobileAds.ERROR_DOMAIN));
    }

    public void loadRtbInterstitialAd(@oo0oO0 MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @oo0oO0 MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        loadInterstitialAd(mediationInterstitialAdConfiguration, mediationAdLoadCallback);
    }

    public void loadRtbNativeAd(@oo0oO0 MediationNativeAdConfiguration mediationNativeAdConfiguration, @oo0oO0 MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
    }

    public void loadRtbRewardedAd(@oo0oO0 MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @oo0oO0 MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
    }

    public void loadRtbRewardedInterstitialAd(@oo0oO0 MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @oo0oO0 MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
    }
}
