package com.google.android.gms.ads.mediation;

import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import java.util.List;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public abstract class Adapter implements MediationExtrasReceiver {
    @oo0oO0
    public abstract com.google.android.gms.ads.VersionInfo getSDKVersionInfo();

    @oo0oO0
    public abstract com.google.android.gms.ads.VersionInfo getVersionInfo();

    public abstract void initialize(@oo0oO0 Context context, @oo0oO0 InitializationCompleteCallback initializationCompleteCallback, @oo0oO0 List<MediationConfiguration> list);

    public void loadAppOpenAd(@oo0oO0 MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @oo0oO0 MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        mediationAdLoadCallback.onFailure(new AdError(7, getClass().getSimpleName().concat(" does not support app open ads."), MobileAds.ERROR_DOMAIN));
    }

    public void loadInterscrollerAd(@oo0oO0 MediationBannerAdConfiguration mediationBannerAdConfiguration, @oo0oO0 MediationAdLoadCallback<MediationInterscrollerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        mediationAdLoadCallback.onFailure(new AdError(7, getClass().getSimpleName().concat(" does not support interscroller ads."), MobileAds.ERROR_DOMAIN));
    }

    public void loadInterstitialAd(@oo0oO0 MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @oo0oO0 MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        mediationAdLoadCallback.onFailure(new AdError(7, getClass().getSimpleName().concat(" does not support interstitial ads."), MobileAds.ERROR_DOMAIN));
    }
}
