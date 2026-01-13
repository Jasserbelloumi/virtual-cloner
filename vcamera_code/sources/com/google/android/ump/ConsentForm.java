package com.google.android.ump;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public interface ConsentForm {

    /* loaded from: classes2.dex */
    public interface OnConsentFormDismissedListener {
        void onConsentFormDismissed(@o0OO00OO FormError formError);
    }

    void show(@RecentlyNonNull Activity activity, @RecentlyNonNull OnConsentFormDismissedListener onConsentFormDismissedListener);
}
