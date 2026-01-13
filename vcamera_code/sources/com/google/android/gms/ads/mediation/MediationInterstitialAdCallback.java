package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public interface MediationInterstitialAdCallback extends MediationAdCallback {
    void onAdFailedToShow(@oo0oO0 AdError adError);

    @Deprecated
    void onAdFailedToShow(@oo0oO0 String str);

    void onAdLeftApplication();
}
