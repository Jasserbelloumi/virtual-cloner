package com.google.android.gms.ads.mediation.rtb;

import com.google.android.gms.ads.AdError;
import javax.annotation.ParametersAreNonnullByDefault;
import o00oOooO.oo0oO0;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public interface SignalCallbacks {
    void onFailure(@oo0oO0 AdError adError);

    @Deprecated
    void onFailure(@oo0oO0 String str);

    void onSuccess(@oo0oO0 String str);
}
