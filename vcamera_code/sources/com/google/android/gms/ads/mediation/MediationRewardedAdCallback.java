package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.rewarded.RewardItem;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public interface MediationRewardedAdCallback extends MediationAdCallback {
    void onAdFailedToShow(@oo0oO0 AdError adError);

    @Deprecated
    void onAdFailedToShow(@oo0oO0 String str);

    void onUserEarnedReward(@oo0oO0 RewardItem rewardItem);

    void onVideoComplete();

    void onVideoStart();
}
