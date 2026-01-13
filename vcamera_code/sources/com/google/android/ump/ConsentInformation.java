package com.google.android.ump;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes2.dex */
public interface ConsentInformation {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface ConsentStatus {
        public static final int NOT_REQUIRED = 1;
        public static final int OBTAINED = 3;
        public static final int REQUIRED = 2;
        public static final int UNKNOWN = 0;
    }

    /* loaded from: classes2.dex */
    public interface OnConsentInfoUpdateFailureListener {
        void onConsentInfoUpdateFailure(@RecentlyNonNull FormError formError);
    }

    /* loaded from: classes2.dex */
    public interface OnConsentInfoUpdateSuccessListener {
        void onConsentInfoUpdateSuccess();
    }

    int getConsentStatus();

    boolean isConsentFormAvailable();

    void requestConsentInfoUpdate(@RecentlyNonNull Activity activity, @RecentlyNonNull ConsentRequestParameters consentRequestParameters, @RecentlyNonNull OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, @RecentlyNonNull OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener);

    void reset();
}
