package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbdl;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbge;
import com.google.android.gms.internal.ads.zzbgf;
import com.google.android.gms.internal.ads.zzbnc;
import com.google.android.gms.internal.ads.zzbqp;
import com.google.android.gms.internal.ads.zzbqr;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzbza;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class AdLoader {
    private final zzp zza;
    private final Context zzb;
    private final zzbn zzc;

    /* loaded from: classes.dex */
    public static class Builder {
        private final Context zza;
        private final zzbq zzb;

        public Builder(@oo0oO0 Context context, @oo0oO0 String str) {
            zzbq zzc = zzay.zza().zzc(context, str, new zzbnc());
            this.zza = (Context) Preconditions.checkNotNull(context, "context cannot be null");
            this.zzb = zzc;
        }

        @oo0oO0
        public AdLoader build() {
            try {
                return new AdLoader(this.zza, this.zzb.zze(), zzp.zza);
            } catch (RemoteException e) {
                zzbza.zzh("Failed to build AdLoader.", e);
                return new AdLoader(this.zza, new zzeu().zzc(), zzp.zza);
            }
        }

        @oo0oO0
        public Builder forAdManagerAdView(@oo0oO0 OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener, @oo0oO0 AdSize... adSizeArr) {
            if (adSizeArr == null || adSizeArr.length <= 0) {
                throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                this.zzb.zzj(new zzbge(onAdManagerAdViewLoadedListener), new zzq(this.zza, adSizeArr));
            } catch (RemoteException e) {
                zzbza.zzk("Failed to add Google Ad Manager banner ad listener", e);
            }
            return this;
        }

        @oo0oO0
        public Builder forCustomFormatAd(@oo0oO0 String str, @oo0oO0 NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, @o0OO00OO NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
            zzbqp zzbqpVar = new zzbqp(onCustomFormatAdLoadedListener, onCustomClickListener);
            try {
                this.zzb.zzh(str, zzbqpVar.zzb(), zzbqpVar.zza());
            } catch (RemoteException e) {
                zzbza.zzk("Failed to add custom format ad listener", e);
            }
            return this;
        }

        @oo0oO0
        @Deprecated
        public Builder forCustomTemplateAd(@oo0oO0 String str, @oo0oO0 NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, @o0OO00OO NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
            zzbgc zzbgcVar = new zzbgc(onCustomTemplateAdLoadedListener, onCustomClickListener);
            try {
                this.zzb.zzh(str, zzbgcVar.zze(), zzbgcVar.zzd());
            } catch (RemoteException e) {
                zzbza.zzk("Failed to add custom template ad listener", e);
            }
            return this;
        }

        @oo0oO0
        public Builder forNativeAd(@oo0oO0 NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
            try {
                this.zzb.zzk(new zzbqr(onNativeAdLoadedListener));
            } catch (RemoteException e) {
                zzbza.zzk("Failed to add google native ad listener", e);
            }
            return this;
        }

        @oo0oO0
        @Deprecated
        public Builder forUnifiedNativeAd(@oo0oO0 UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
            try {
                this.zzb.zzk(new zzbgf(onUnifiedNativeAdLoadedListener));
            } catch (RemoteException e) {
                zzbza.zzk("Failed to add google native ad listener", e);
            }
            return this;
        }

        @oo0oO0
        public Builder withAdListener(@oo0oO0 AdListener adListener) {
            try {
                this.zzb.zzl(new com.google.android.gms.ads.internal.client.zzg(adListener));
            } catch (RemoteException e) {
                zzbza.zzk("Failed to set AdListener.", e);
            }
            return this;
        }

        @oo0oO0
        public Builder withAdManagerAdViewOptions(@oo0oO0 AdManagerAdViewOptions adManagerAdViewOptions) {
            try {
                this.zzb.zzm(adManagerAdViewOptions);
            } catch (RemoteException e) {
                zzbza.zzk("Failed to specify Ad Manager banner ad options", e);
            }
            return this;
        }

        @oo0oO0
        @Deprecated
        public Builder withNativeAdOptions(@oo0oO0 NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.zzo(new zzbdl(nativeAdOptions));
            } catch (RemoteException e) {
                zzbza.zzk("Failed to specify native ad options", e);
            }
            return this;
        }

        @oo0oO0
        public Builder withNativeAdOptions(@oo0oO0 com.google.android.gms.ads.nativead.NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.zzo(new zzbdl(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), -1, nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzfl(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zzc(), nativeAdOptions.getMediaAspectRatio(), nativeAdOptions.zza(), nativeAdOptions.zzb()));
            } catch (RemoteException e) {
                zzbza.zzk("Failed to specify native ad options", e);
            }
            return this;
        }
    }

    public AdLoader(Context context, zzbn zzbnVar, zzp zzpVar) {
        this.zzb = context;
        this.zzc = zzbnVar;
        this.zza = zzpVar;
    }

    private final void zzb(final zzdx zzdxVar) {
        zzbar.zzc(this.zzb);
        if (((Boolean) zzbci.zzc.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbar.zzjw)).booleanValue()) {
                zzbyp.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdLoader.this.zza(zzdxVar);
                    }
                });
                return;
            }
        }
        try {
            this.zzc.zzg(this.zza.zza(this.zzb, zzdxVar));
        } catch (RemoteException e) {
            zzbza.zzh("Failed to load ad.", e);
        }
    }

    public boolean isLoading() {
        try {
            return this.zzc.zzi();
        } catch (RemoteException e) {
            zzbza.zzk("Failed to check if ad is loading.", e);
            return false;
        }
    }

    @o0OO0oO0("android.permission.INTERNET")
    public void loadAd(@oo0oO0 AdRequest adRequest) {
    }

    public void loadAd(@oo0oO0 AdManagerAdRequest adManagerAdRequest) {
    }

    public final /* synthetic */ void zza(zzdx zzdxVar) {
        try {
            this.zzc.zzg(this.zza.zza(this.zzb, zzdxVar));
        } catch (RemoteException e) {
            zzbza.zzh("Failed to load ad.", e);
        }
    }
}
