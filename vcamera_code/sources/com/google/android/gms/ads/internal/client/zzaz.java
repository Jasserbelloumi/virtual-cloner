package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;
/* loaded from: classes.dex */
public class zzaz extends AdListener {
    private final Object zza = new Object();
    private AdListener zzb;

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        synchronized (this.zza) {
            if (this.zzb != null) {
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        synchronized (this.zza) {
            AdListener adListener = this.zzb;
            if (adListener != null) {
                adListener.onAdClosed();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        synchronized (this.zza) {
            AdListener adListener = this.zzb;
            if (adListener != null) {
                adListener.onAdImpression();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        synchronized (this.zza) {
            AdListener adListener = this.zzb;
            if (adListener != null) {
                adListener.onAdOpened();
            }
        }
    }

    public final void zza(AdListener adListener) {
        synchronized (this.zza) {
            this.zzb = adListener;
        }
    }
}
