package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@Deprecated
/* loaded from: classes.dex */
public interface CustomEventInterstitial extends CustomEvent {
    void requestInterstitialAd(@oo0oO0 Context context, @oo0oO0 CustomEventInterstitialListener customEventInterstitialListener, @o0OO00OO String str, @oo0oO0 MediationAdRequest mediationAdRequest, @o0OO00OO Bundle bundle);

    void showInterstitial();
}
