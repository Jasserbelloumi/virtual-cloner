package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
/* loaded from: classes2.dex */
final class zzbgd implements Runnable {
    public final /* synthetic */ AdManagerAdView zza;
    public final /* synthetic */ com.google.android.gms.ads.internal.client.zzbu zzb;
    public final /* synthetic */ zzbge zzc;

    public zzbgd(zzbge zzbgeVar, AdManagerAdView adManagerAdView, com.google.android.gms.ads.internal.client.zzbu zzbuVar) {
        this.zzc = zzbgeVar;
        this.zza = adManagerAdView;
        this.zzb = zzbuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener;
        if (!this.zza.zzb(this.zzb)) {
            zzbza.zzj("Could not bind.");
            return;
        }
        onAdManagerAdViewLoadedListener = this.zzc.zza;
        onAdManagerAdViewLoadedListener.onAdManagerAdViewLoaded(this.zza);
    }
}
