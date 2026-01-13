package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
/* loaded from: classes2.dex */
public final class zzbvp extends zzbvc {
    private final RewardedInterstitialAdLoadCallback zza;
    private final zzbvq zzb;

    public zzbvp(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzbvq zzbvqVar) {
        this.zza = rewardedInterstitialAdLoadCallback;
        this.zzb = zzbvqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final void zze(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza != null) {
            zzeVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final void zzg() {
        if (this.zza == null || this.zzb != null) {
        }
    }
}
