package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@Deprecated
/* loaded from: classes.dex */
public interface MediationBannerAdapter extends MediationAdapter {
    @oo0oO0
    View getBannerView();

    void requestBannerAd(@oo0oO0 Context context, @oo0oO0 MediationBannerListener mediationBannerListener, @oo0oO0 Bundle bundle, @oo0oO0 AdSize adSize, @oo0oO0 MediationAdRequest mediationAdRequest, @o0OO00OO Bundle bundle2);
}
