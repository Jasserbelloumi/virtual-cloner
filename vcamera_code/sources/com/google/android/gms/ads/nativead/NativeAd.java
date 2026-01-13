package com.google.android.gms.ads.nativead;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public abstract class NativeAd {

    /* loaded from: classes.dex */
    public static abstract class AdChoicesInfo {
        @oo0oO0
        public abstract List<Image> getImages();

        @oo0oO0
        public abstract CharSequence getText();
    }

    /* loaded from: classes.dex */
    public static abstract class Image {
        @o0OO00OO
        public abstract Drawable getDrawable();

        public abstract double getScale();

        @o0OO00OO
        public abstract Uri getUri();
    }

    /* loaded from: classes.dex */
    public interface OnNativeAdLoadedListener {
        void onNativeAdLoaded(@oo0oO0 NativeAd nativeAd);
    }

    /* loaded from: classes.dex */
    public interface UnconfirmedClickListener {
        void onUnconfirmedClickCancelled();

        void onUnconfirmedClickReceived(@oo0oO0 String str);
    }

    public abstract void cancelUnconfirmedClick();

    public abstract void destroy();

    @Deprecated
    public abstract void enableCustomClickGesture();

    @o0OO00OO
    public abstract AdChoicesInfo getAdChoicesInfo();

    @o0OO00OO
    public abstract String getAdvertiser();

    @o0OO00OO
    public abstract String getBody();

    @o0OO00OO
    public abstract String getCallToAction();

    @oo0oO0
    public abstract Bundle getExtras();

    @o0OO00OO
    public abstract String getHeadline();

    @o0OO00OO
    public abstract Image getIcon();

    @oo0oO0
    public abstract List<Image> getImages();

    @o0OO00OO
    public abstract MediaContent getMediaContent();

    @oo0oO0
    public abstract List<MuteThisAdReason> getMuteThisAdReasons();

    @o0OO00OO
    public abstract String getPrice();

    @o0OO00OO
    public abstract ResponseInfo getResponseInfo();

    @o0OO00OO
    public abstract Double getStarRating();

    @o0OO00OO
    public abstract String getStore();

    @Deprecated
    public abstract boolean isCustomClickGestureEnabled();

    public abstract boolean isCustomMuteThisAdEnabled();

    public abstract void muteThisAd(@oo0oO0 MuteThisAdReason muteThisAdReason);

    public abstract void performClick(@oo0oO0 Bundle bundle);

    @Deprecated
    public abstract void recordCustomClickGesture();

    public abstract boolean recordImpression(@oo0oO0 Bundle bundle);

    public abstract void reportTouchEvent(@oo0oO0 Bundle bundle);

    public abstract void setMuteThisAdListener(@oo0oO0 MuteThisAdListener muteThisAdListener);

    public abstract void setOnPaidEventListener(@o0OO00OO OnPaidEventListener onPaidEventListener);

    public abstract void setUnconfirmedClickListener(@oo0oO0 UnconfirmedClickListener unconfirmedClickListener);

    @o0OO00OO
    public abstract Object zza();
}
