package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.zag;
import com.google.android.gms.common.util.VisibleForTesting;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class GooglePlayServicesUtil extends GooglePlayServicesUtilLight {
    @oo0oO0
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";
    @oo0oO0
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    @oo0oO0
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    private GooglePlayServicesUtil() {
    }

    @o0OO00OO
    @Deprecated
    public static Dialog getErrorDialog(int i, @oo0oO0 Activity activity, int i2) {
        return getErrorDialog(i, activity, i2, null);
    }

    @o0OO00OO
    @Deprecated
    public static Dialog getErrorDialog(int i, @oo0oO0 Activity activity, int i2, @o0OO00OO DialogInterface.OnCancelListener onCancelListener) {
        if (true == GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity, i)) {
            i = 18;
        }
        return GoogleApiAvailability.getInstance().getErrorDialog(activity, i, i2, onCancelListener);
    }

    @oo0oO0
    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i, @oo0oO0 Context context, int i2) {
        return GooglePlayServicesUtilLight.getErrorPendingIntent(i, context, i2);
    }

    @VisibleForTesting
    @oo0oO0
    @Deprecated
    public static String getErrorString(int i) {
        return GooglePlayServicesUtilLight.getErrorString(i);
    }

    @oo0oO0
    public static Context getRemoteContext(@oo0oO0 Context context) {
        return GooglePlayServicesUtilLight.getRemoteContext(context);
    }

    @oo0oO0
    public static Resources getRemoteResource(@oo0oO0 Context context) {
        return GooglePlayServicesUtilLight.getRemoteResource(context);
    }

    @HideFirstParty
    @Deprecated
    public static int isGooglePlayServicesAvailable(@oo0oO0 Context context) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context);
    }

    @KeepForSdk
    @Deprecated
    public static int isGooglePlayServicesAvailable(@oo0oO0 Context context, int i) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, i);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i) {
        return GooglePlayServicesUtilLight.isUserRecoverableError(i);
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i, @oo0oO0 Activity activity, int i2) {
        return showErrorDialogFragment(i, activity, i2, null);
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i, @oo0oO0 Activity activity, int i2, @o0OO00OO DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i, activity, null, i2, onCancelListener);
    }

    public static boolean showErrorDialogFragment(int i, @oo0oO0 Activity activity, @o0OO00OO Fragment fragment, int i2, @o0OO00OO DialogInterface.OnCancelListener onCancelListener) {
        if (true == GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity, i)) {
            i = 18;
        }
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        if (fragment == null) {
            return googleApiAvailability.showErrorDialogFragment(activity, i, i2, onCancelListener);
        }
        Dialog zaa = googleApiAvailability.zaa(activity, i, zag.zac(fragment, GoogleApiAvailability.getInstance().getErrorResolutionIntent(activity, i, GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG), i2), onCancelListener);
        if (zaa == null) {
            return false;
        }
        googleApiAvailability.zad(activity, zaa, GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    @Deprecated
    public static void showErrorNotification(int i, @oo0oO0 Context context) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        if (GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, i) || GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context, i)) {
            googleApiAvailability.zaf(context);
        } else {
            googleApiAvailability.showErrorNotification(context, i);
        }
    }
}
