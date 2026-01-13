package com.google.android.gms.ads.admanager;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbsf;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class AdManagerAdView extends BaseAdView {
    public AdManagerAdView(@oo0oO0 Context context) {
        super(context, 0);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public AdManagerAdView(@oo0oO0 Context context, @oo0oO0 AttributeSet attributeSet) {
        super(context, attributeSet, true);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public AdManagerAdView(@oo0oO0 Context context, @oo0oO0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, true);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    @o0OO00OO
    public AdSize[] getAdSizes() {
        return this.zza.zzB();
    }

    @o0OO00OO
    public AppEventListener getAppEventListener() {
        return this.zza.zzh();
    }

    @oo0oO0
    public VideoController getVideoController() {
        return this.zza.zzf();
    }

    @o0OO00OO
    public VideoOptions getVideoOptions() {
        return this.zza.zzg();
    }

    @o0OO0oO0("android.permission.INTERNET")
    public void loadAd(@oo0oO0 AdManagerAdRequest adManagerAdRequest) {
    }

    public void recordManualImpression() {
        this.zza.zzo();
    }

    public void setAdSizes(@oo0oO0 AdSize... adSizeArr) {
        if (adSizeArr == null || adSizeArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.zza.zzt(adSizeArr);
    }

    public void setAppEventListener(@o0OO00OO AppEventListener appEventListener) {
        this.zza.zzv(appEventListener);
    }

    public void setManualImpressionsEnabled(boolean z) {
        this.zza.zzw(z);
    }

    public void setVideoOptions(@oo0oO0 VideoOptions videoOptions) {
        this.zza.zzy(videoOptions);
    }

    public final /* synthetic */ void zza(AdManagerAdRequest adManagerAdRequest) {
        try {
            this.zza.zzm(adManagerAdRequest.zza());
        } catch (IllegalStateException e) {
            zzbsf.zza(getContext()).zzf(e, "AdManagerAdView.loadAd");
        }
    }

    public final boolean zzb(zzbu zzbuVar) {
        return this.zza.zzz(zzbuVar);
    }
}
