package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbvf extends RewardedAd {
    private final String zza;
    private final zzbuw zzb;
    private final Context zzc;
    private final zzbvo zzd = new zzbvo();
    @o0OO00OO
    private OnAdMetadataChangedListener zze;
    @o0OO00OO
    private OnPaidEventListener zzf;
    @o0OO00OO
    private FullScreenContentCallback zzg;

    public zzbvf(Context context, String str) {
        this.zzc = context.getApplicationContext();
        this.zza = str;
        this.zzb = com.google.android.gms.ads.internal.client.zzay.zza().zzq(context, str, new zzbnc());
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final Bundle getAdMetadata() {
        try {
            zzbuw zzbuwVar = this.zzb;
            if (zzbuwVar != null) {
                return zzbuwVar.zzb();
            }
        } catch (RemoteException e) {
            zzbza.zzl("#007 Could not call remote method.", e);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    @oo0oO0
    public final String getAdUnitId() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    @o0OO00OO
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    @o0OO00OO
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    @o0OO00OO
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    @oo0oO0
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdn zzdnVar = null;
        try {
            zzbuw zzbuwVar = this.zzb;
            if (zzbuwVar != null) {
                zzdnVar = zzbuwVar.zzc();
            }
        } catch (RemoteException e) {
            zzbza.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zzb(zzdnVar);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    @oo0oO0
    public final RewardItem getRewardItem() {
        try {
            zzbuw zzbuwVar = this.zzb;
            zzbut zzd = zzbuwVar != null ? zzbuwVar.zzd() : null;
            return zzd == null ? RewardItem.DEFAULT_REWARD : new zzbvg(zzd);
        } catch (RemoteException e) {
            zzbza.zzl("#007 Could not call remote method.", e);
            return RewardItem.DEFAULT_REWARD;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setFullScreenContentCallback(@o0OO00OO FullScreenContentCallback fullScreenContentCallback) {
        this.zzg = fullScreenContentCallback;
        this.zzd.zzb(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setImmersiveMode(boolean z) {
        try {
            zzbuw zzbuwVar = this.zzb;
            if (zzbuwVar != null) {
                zzbuwVar.zzh(z);
            }
        } catch (RemoteException e) {
            zzbza.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnAdMetadataChangedListener(@o0OO00OO OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.zze = onAdMetadataChangedListener;
            zzbuw zzbuwVar = this.zzb;
            if (zzbuwVar != null) {
                zzbuwVar.zzi(new com.google.android.gms.ads.internal.client.zzfd(onAdMetadataChangedListener));
            }
        } catch (RemoteException e) {
            zzbza.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnPaidEventListener(@o0OO00OO OnPaidEventListener onPaidEventListener) {
        try {
            this.zzf = onPaidEventListener;
            zzbuw zzbuwVar = this.zzb;
            if (zzbuwVar != null) {
                zzbuwVar.zzj(new com.google.android.gms.ads.internal.client.zzfe(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzbza.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setServerSideVerificationOptions(@o0OO00OO ServerSideVerificationOptions serverSideVerificationOptions) {
        if (serverSideVerificationOptions != null) {
            try {
                zzbuw zzbuwVar = this.zzb;
                if (zzbuwVar != null) {
                    zzbuwVar.zzl(new zzbvk(serverSideVerificationOptions));
                }
            } catch (RemoteException e) {
                zzbza.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void show(@oo0oO0 Activity activity, @oo0oO0 OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.zzd.zzc(onUserEarnedRewardListener);
        if (activity == null) {
            zzbza.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzbuw zzbuwVar = this.zzb;
            if (zzbuwVar != null) {
                zzbuwVar.zzk(this.zzd);
                this.zzb.zzm(ObjectWrapper.wrap(activity));
            }
        } catch (RemoteException e) {
            zzbza.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzdx zzdxVar, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            zzbuw zzbuwVar = this.zzb;
            if (zzbuwVar != null) {
                zzbuwVar.zzf(com.google.android.gms.ads.internal.client.zzp.zza.zza(this.zzc, zzdxVar), new zzbvj(rewardedAdLoadCallback, this));
            }
        } catch (RemoteException e) {
            zzbza.zzl("#007 Could not call remote method.", e);
        }
    }
}
