package com.google.android.gms.ads.formats;

import android.os.Bundle;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@Deprecated
/* loaded from: classes.dex */
public abstract class UnifiedNativeAd {

    @Deprecated
    /* loaded from: classes.dex */
    public interface OnUnifiedNativeAdLoadedListener {
        void onUnifiedNativeAdLoaded(@oo0oO0 UnifiedNativeAd unifiedNativeAd);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface UnconfirmedClickListener {
        void onUnconfirmedClickCancelled();

        void onUnconfirmedClickReceived(@oo0oO0 String str);
    }

    public abstract void cancelUnconfirmedClick();

    public abstract void destroy();

    public abstract void enableCustomClickGesture();

    @oo0oO0
    public abstract NativeAd.AdChoicesInfo getAdChoicesInfo();

    @oo0oO0
    public abstract String getAdvertiser();

    @oo0oO0
    public abstract String getBody();

    @oo0oO0
    public abstract String getCallToAction();

    @oo0oO0
    public abstract Bundle getExtras();

    @oo0oO0
    public abstract String getHeadline();

    @oo0oO0
    public abstract NativeAd.Image getIcon();

    @oo0oO0
    public abstract List<NativeAd.Image> getImages();

    @oo0oO0
    public abstract MediaContent getMediaContent();

    @oo0oO0
    @Deprecated
    public abstract String getMediationAdapterClassName();

    @oo0oO0
    public abstract List<MuteThisAdReason> getMuteThisAdReasons();

    @oo0oO0
    public abstract String getPrice();

    @o0OO00OO
    public abstract ResponseInfo getResponseInfo();

    @oo0oO0
    public abstract Double getStarRating();

    @oo0oO0
    public abstract String getStore();

    @oo0oO0
    @Deprecated
    public abstract VideoController getVideoController();

    public abstract boolean isCustomClickGestureEnabled();

    public abstract boolean isCustomMuteThisAdEnabled();

    public abstract void muteThisAd(@oo0oO0 MuteThisAdReason muteThisAdReason);

    @KeepForSdk
    public abstract void performClick(@oo0oO0 Bundle bundle);

    public abstract void recordCustomClickGesture();

    @KeepForSdk
    public abstract boolean recordImpression(@oo0oO0 Bundle bundle);

    @KeepForSdk
    public abstract void reportTouchEvent(@oo0oO0 Bundle bundle);

    public abstract void setMuteThisAdListener(@oo0oO0 MuteThisAdListener muteThisAdListener);

    public abstract void setOnPaidEventListener(@o0OO00OO OnPaidEventListener onPaidEventListener);

    public abstract void setUnconfirmedClickListener(@oo0oO0 UnconfirmedClickListener unconfirmedClickListener);

    @oo0oO0
    public abstract Object zza();
}
