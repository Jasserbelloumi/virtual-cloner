package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
/* loaded from: classes2.dex */
public final class zzbvj extends zzbvc {
    private final RewardedAdLoadCallback zza;
    private final RewardedAd zzb;

    public zzbvj(RewardedAdLoadCallback rewardedAdLoadCallback, RewardedAd rewardedAd) {
        this.zza = rewardedAdLoadCallback;
        this.zzb = rewardedAd;
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final void zze(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza != null) {
            zzeVar.zzb();
            RewardedAdLoadCallback rewardedAdLoadCallback = this.zza;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final void zzg() {
        if (this.zza != null) {
            RewardedAd rewardedAd = this.zzb;
        }
    }
}
