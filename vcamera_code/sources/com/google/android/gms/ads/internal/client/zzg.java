package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;
/* loaded from: classes.dex */
public final class zzg extends zzbg {
    private final AdListener zza;

    public zzg(AdListener adListener) {
        this.zza = adListener;
    }

    public final AdListener zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzc() {
        if (this.zza != null) {
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdClosed();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zze(int i) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf(zze zzeVar) {
        if (this.zza != null) {
            zzeVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzg() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() {
        if (this.zza != null) {
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzj() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzk() {
        AdListener adListener = this.zza;
        if (adListener != null) {
            adListener.onAdSwipeGestureClicked();
        }
    }
}
