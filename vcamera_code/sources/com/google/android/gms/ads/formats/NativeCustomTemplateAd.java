package com.google.android.gms.ads.formats;

import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.List;
import o00oOooO.oo0oO0;
@Deprecated
/* loaded from: classes.dex */
public interface NativeCustomTemplateAd {
    @oo0oO0
    public static final String ASSET_NAME_VIDEO = "_videoMediaView";

    /* loaded from: classes.dex */
    public interface DisplayOpenMeasurement {
        void setView(@oo0oO0 View view);

        boolean start();
    }

    /* loaded from: classes.dex */
    public interface OnCustomClickListener {
        void onCustomClick(@oo0oO0 NativeCustomTemplateAd nativeCustomTemplateAd, @oo0oO0 String str);
    }

    /* loaded from: classes.dex */
    public interface OnCustomTemplateAdLoadedListener {
        void onCustomTemplateAdLoaded(@oo0oO0 NativeCustomTemplateAd nativeCustomTemplateAd);
    }

    void destroy();

    @oo0oO0
    List<String> getAvailableAssetNames();

    @oo0oO0
    String getCustomTemplateId();

    @oo0oO0
    DisplayOpenMeasurement getDisplayOpenMeasurement();

    @oo0oO0
    NativeAd.Image getImage(@oo0oO0 String str);

    @oo0oO0
    CharSequence getText(@oo0oO0 String str);

    @oo0oO0
    VideoController getVideoController();

    @oo0oO0
    MediaView getVideoMediaView();

    void performClick(@oo0oO0 String str);

    void recordImpression();
}
