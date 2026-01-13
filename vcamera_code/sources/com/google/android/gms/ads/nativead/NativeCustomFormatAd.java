package com.google.android.gms.ads.nativead;

import android.view.View;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public interface NativeCustomFormatAd {
    @oo0oO0
    public static final String ASSET_NAME_VIDEO = "_videoMediaView";

    /* loaded from: classes.dex */
    public interface DisplayOpenMeasurement {
        void setView(@oo0oO0 View view);

        boolean start();
    }

    /* loaded from: classes.dex */
    public interface OnCustomClickListener {
        void onCustomClick(@oo0oO0 NativeCustomFormatAd nativeCustomFormatAd, @oo0oO0 String str);
    }

    /* loaded from: classes.dex */
    public interface OnCustomFormatAdLoadedListener {
        void onCustomFormatAdLoaded(@oo0oO0 NativeCustomFormatAd nativeCustomFormatAd);
    }

    void destroy();

    @o0OO00OO
    List<String> getAvailableAssetNames();

    @o0OO00OO
    String getCustomFormatId();

    @oo0oO0
    DisplayOpenMeasurement getDisplayOpenMeasurement();

    @o0OO00OO
    NativeAd.Image getImage(@oo0oO0 String str);

    @o0OO00OO
    MediaContent getMediaContent();

    @o0OO00OO
    CharSequence getText(@oo0oO0 String str);

    void performClick(@oo0oO0 String str);

    void recordImpression();
}
