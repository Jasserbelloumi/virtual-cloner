package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.List;
import java.util.Map;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public abstract class UnifiedNativeAdMapper {
    private String zza;
    private List zzb;
    private String zzc;
    private NativeAd.Image zzd;
    private String zze;
    private String zzf;
    private Double zzg;
    private String zzh;
    private String zzi;
    private VideoController zzj;
    private boolean zzk;
    private View zzl;
    private View zzm;
    private Object zzn;
    private Bundle zzo = new Bundle();
    private boolean zzp;
    private boolean zzq;
    private float zzr;

    @oo0oO0
    public View getAdChoicesContent() {
        return this.zzl;
    }

    @oo0oO0
    public final String getAdvertiser() {
        return this.zzf;
    }

    @oo0oO0
    public final String getBody() {
        return this.zzc;
    }

    @oo0oO0
    public final String getCallToAction() {
        return this.zze;
    }

    public float getCurrentTime() {
        return 0.0f;
    }

    public float getDuration() {
        return 0.0f;
    }

    @oo0oO0
    public final Bundle getExtras() {
        return this.zzo;
    }

    @oo0oO0
    public final String getHeadline() {
        return this.zza;
    }

    @oo0oO0
    public final NativeAd.Image getIcon() {
        return this.zzd;
    }

    @oo0oO0
    public final List<NativeAd.Image> getImages() {
        return this.zzb;
    }

    public float getMediaContentAspectRatio() {
        return this.zzr;
    }

    public final boolean getOverrideClickHandling() {
        return this.zzq;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.zzp;
    }

    @oo0oO0
    public final String getPrice() {
        return this.zzi;
    }

    @oo0oO0
    public final Double getStarRating() {
        return this.zzg;
    }

    @oo0oO0
    public final String getStore() {
        return this.zzh;
    }

    public void handleClick(@oo0oO0 View view) {
    }

    public boolean hasVideoContent() {
        return this.zzk;
    }

    public void recordImpression() {
    }

    public void setAdChoicesContent(@oo0oO0 View view) {
        this.zzl = view;
    }

    public final void setAdvertiser(@oo0oO0 String str) {
        this.zzf = str;
    }

    public final void setBody(@oo0oO0 String str) {
        this.zzc = str;
    }

    public final void setCallToAction(@oo0oO0 String str) {
        this.zze = str;
    }

    public final void setExtras(@oo0oO0 Bundle bundle) {
        this.zzo = bundle;
    }

    public void setHasVideoContent(boolean z) {
        this.zzk = z;
    }

    public final void setHeadline(@oo0oO0 String str) {
        this.zza = str;
    }

    public final void setIcon(@oo0oO0 NativeAd.Image image) {
        this.zzd = image;
    }

    public final void setImages(@oo0oO0 List<NativeAd.Image> list) {
        this.zzb = list;
    }

    public void setMediaContentAspectRatio(float f) {
        this.zzr = f;
    }

    public void setMediaView(@oo0oO0 View view) {
        this.zzm = view;
    }

    public final void setOverrideClickHandling(boolean z) {
        this.zzq = z;
    }

    public final void setOverrideImpressionRecording(boolean z) {
        this.zzp = z;
    }

    public final void setPrice(@oo0oO0 String str) {
        this.zzi = str;
    }

    public final void setStarRating(@oo0oO0 Double d) {
        this.zzg = d;
    }

    public final void setStore(@oo0oO0 String str) {
        this.zzh = str;
    }

    public void trackViews(@oo0oO0 View view, @oo0oO0 Map<String, View> map, @oo0oO0 Map<String, View> map2) {
    }

    public void untrackView(@oo0oO0 View view) {
    }

    @oo0oO0
    public final View zza() {
        return this.zzm;
    }

    @oo0oO0
    public final VideoController zzb() {
        return this.zzj;
    }

    @oo0oO0
    public final Object zzc() {
        return this.zzn;
    }

    public final void zzd(@oo0oO0 Object obj) {
        this.zzn = obj;
    }

    public final void zze(@oo0oO0 VideoController videoController) {
        this.zzj = videoController;
    }
}
