package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.AdError;
import javax.annotation.ParametersAreNonnullByDefault;
import o00oOooO.oo0oO0;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public interface MediationAdLoadCallback<MediationAdT, MediationAdCallbackT> {
    void onFailure(@oo0oO0 AdError adError);

    @Deprecated
    void onFailure(@oo0oO0 String str);

    @oo0oO0
    MediationAdCallbackT onSuccess(@oo0oO0 MediationAdT mediationadt);
}
