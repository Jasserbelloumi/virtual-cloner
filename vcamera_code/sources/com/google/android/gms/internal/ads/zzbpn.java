package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
final class zzbpn implements MediationAdLoadCallback {
    public final /* synthetic */ zzboz zza;
    public final /* synthetic */ zzbnl zzb;
    public final /* synthetic */ zzbpo zzc;

    public zzbpn(zzbpo zzbpoVar, zzboz zzbozVar, zzbnl zzbnlVar) {
        this.zzc = zzbpoVar;
        this.zza = zzbozVar;
        this.zzb = zzbnlVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.zza.zzf(adError.zza());
        } catch (RemoteException e) {
            zzbza.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    @o0OO00OO
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        MediationRewardedAd mediationRewardedAd = (MediationRewardedAd) obj;
        if (mediationRewardedAd != null) {
            try {
                this.zzc.zzc = mediationRewardedAd;
                this.zza.zzg();
            } catch (RemoteException e) {
                zzbza.zzh("", e);
            }
            return new zzbpp(this.zzb);
        }
        zzbza.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.zza.zze("Adapter returned null.");
            return null;
        } catch (RemoteException e2) {
            zzbza.zzh("", e2);
            return null;
        }
    }
}
