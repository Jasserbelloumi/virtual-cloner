package com.google.android.gms.ads.rewarded;

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
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbsf;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzbza;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public abstract class RewardedAd {
    public static void load(@oo0oO0 final Context context, @oo0oO0 final String str, @oo0oO0 final AdRequest adRequest, @oo0oO0 final RewardedAdLoadCallback rewardedAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(adRequest, "AdRequest cannot be null.");
        Preconditions.checkNotNull(rewardedAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbar.zzc(context);
        if (((Boolean) zzbci.zzl.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbar.zzjw)).booleanValue()) {
                zzbyp.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.rewarded.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new zzbvf(context2, str2).zza(adRequest2.zza(), rewardedAdLoadCallback);
                        } catch (IllegalStateException e) {
                            zzbsf.zza(context2).zzf(e, "RewardedAd.load");
                        }
                    }
                });
                return;
            }
        }
        zzbza.zze("Loading on UI thread");
        new zzbvf(context, str).zza(adRequest.zza(), rewardedAdLoadCallback);
    }

    public static void load(@oo0oO0 final Context context, @oo0oO0 final String str, @oo0oO0 final AdManagerAdRequest adManagerAdRequest, @oo0oO0 final RewardedAdLoadCallback rewardedAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        Preconditions.checkNotNull(rewardedAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbar.zzc(context);
        if (((Boolean) zzbci.zzl.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbar.zzjw)).booleanValue()) {
                zzbza.zze("Loading on background thread");
                zzbyp.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.rewarded.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new zzbvf(context2, str2).zza(adManagerAdRequest2.zza(), rewardedAdLoadCallback);
                        } catch (IllegalStateException e) {
                            zzbsf.zza(context2).zzf(e, "RewardedAd.loadAdManager");
                        }
                    }
                });
                return;
            }
        }
        zzbza.zze("Loading on UI thread");
        new zzbvf(context, str).zza(adManagerAdRequest.zza(), rewardedAdLoadCallback);
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

    public abstract void setServerSideVerificationOptions(@o0OO00OO ServerSideVerificationOptions serverSideVerificationOptions);

    public abstract void show(@oo0oO0 Activity activity, @oo0oO0 OnUserEarnedRewardListener onUserEarnedRewardListener);
}
