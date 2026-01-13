package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.AdError;
import o00oOooO.oo0oO0;
@Deprecated
/* loaded from: classes.dex */
public interface CustomEventListener {
    void onAdClicked();

    void onAdClosed();

    @Deprecated
    void onAdFailedToLoad(int i);

    void onAdFailedToLoad(@oo0oO0 AdError adError);

    void onAdLeftApplication();

    void onAdOpened();
}
