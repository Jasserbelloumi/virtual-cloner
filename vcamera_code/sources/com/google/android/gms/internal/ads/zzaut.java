package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzaut extends zzava {
    @o0OO00OO
    private final AppOpenAd.AppOpenAdLoadCallback zza;
    private final String zzb;

    public zzaut(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.zza = appOpenAdLoadCallback;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzavb
    public final void zzb(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzavb
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza != null) {
            zzeVar.zzb();
            AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.zza;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavb
    public final void zzd(zzauy zzauyVar) {
        if (this.zza != null) {
            new zzauu(zzauyVar, this.zzb);
            AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.zza;
        }
    }
}
