package com.google.android.gms.ads.rewardedinterstitial;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbsf;
import com.google.android.gms.internal.ads.zzbvq;
import com.google.android.gms.internal.ads.zzbyp;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public abstract class RewardedInterstitialAd {
    public static void load(@oo0oO0 final Context context, @oo0oO0 final String str, @oo0oO0 final AdRequest adRequest, @oo0oO0 final RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(adRequest, "AdRequest cannot be null.");
        Preconditions.checkNotNull(rewardedInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbar.zzc(context);
        if (((Boolean) zzbci.zzl.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbar.zzjw)).booleanValue()) {
                zzbyp.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.rewardedinterstitial.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new zzbvq(context2, str2).zza(adRequest2.zza(), rewardedInterstitialAdLoadCallback);
                        } catch (IllegalStateException e) {
                            zzbsf.zza(context2).zzf(e, "RewardedInterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbvq(context, str).zza(adRequest.zza(), rewardedInterstitialAdLoadCallback);
    }

    public static void load(@oo0oO0 final Context context, @oo0oO0 final String str, @oo0oO0 final AdManagerAdRequest adManagerAdRequest, @oo0oO0 final RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        Preconditions.checkNotNull(rewardedInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbar.zzc(context);
        if (((Boolean) zzbci.zzl.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbar.zzjw)).booleanValue()) {
                zzbyp.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.rewardedinterstitial.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new zzbvq(context2, str2).zza(adManagerAdRequest2.zza(), rewardedInterstitialAdLoadCallback);
                        } catch (IllegalStateException e) {
                            zzbsf.zza(context2).zzf(e, "RewardedInterstitialAdManager.load");
                        }
                    }
                });
                return;
            }
        }
        new zzbvq(context, str).zza(adManagerAdRequest.zza(), rewardedInterstitialAdLoadCallback);
    }

    @oo0oO0
    public abstract Bundle getAdMetadata();

    @oo0oO0
    public abstract String getAdUnitId();

    @o0OO00OO
    public abstract FullScreenContentCallback getFullScreenContentCallback();

    @o0OO00OO
    public abstract OnAdMetadataChangedListener getOnAdMetadataChangedListener();

    @o0OO00OO
    public abstract OnPaidEventListener getOnPaidEventListener();

    @oo0oO0
    public abstract ResponseInfo getResponseInfo();

    @oo0oO0
    public abstract RewardItem getRewardItem();

    public abstract void setFullScreenContentCallback(@o0OO00OO FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z);

    public abstract void setOnAdMetadataChangedListener(@o0OO00OO OnAdMetadataChangedListener onAdMetadataChangedListener);

    public abstract void setOnPaidEventListener(@o0OO00OO OnPaidEventListener onPaidEventListener);

    public abstract void setServerSideVerificationOptions(@oo0oO0 ServerSideVerificationOptions serverSideVerificationOptions);

    public abstract void show(@oo0oO0 Activity activity, @oo0oO0 OnUserEarnedRewardListener onUserEarnedRewardListener);
}
