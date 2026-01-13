package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;
import o00oOooO.oo0oO0;
@Deprecated
/* loaded from: classes.dex */
public interface MediationBannerListener {
    void onAdClicked(@oo0oO0 MediationBannerAdapter mediationBannerAdapter);

    void onAdClosed(@oo0oO0 MediationBannerAdapter mediationBannerAdapter);

    @Deprecated
    void onAdFailedToLoad(@oo0oO0 MediationBannerAdapter mediationBannerAdapter, int i);

    void onAdFailedToLoad(@oo0oO0 MediationBannerAdapter mediationBannerAdapter, @oo0oO0 AdError adError);

    void onAdLeftApplication(@oo0oO0 MediationBannerAdapter mediationBannerAdapter);

    void onAdLoaded(@oo0oO0 MediationBannerAdapter mediationBannerAdapter);

    void onAdOpened(@oo0oO0 MediationBannerAdapter mediationBannerAdapter);

    void zzd(@oo0oO0 MediationBannerAdapter mediationBannerAdapter, @oo0oO0 String str, @oo0oO0 String str2);
}
