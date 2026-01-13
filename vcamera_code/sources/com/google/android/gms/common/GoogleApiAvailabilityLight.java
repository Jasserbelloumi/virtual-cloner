package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.media.o00oOo0O;
import android.text.TextUtils;
import com.google.android.exoplayer2.C;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@ShowFirstParty
@KeepForSdk
/* loaded from: classes.dex */
public class GoogleApiAvailabilityLight {
    @oo0oO0
    @KeepForSdk
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @oo0oO0
    @KeepForSdk
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    @KeepForSdk
    public static final String TRACKING_SOURCE_DIALOG = "d";
    @KeepForSdk
    public static final String TRACKING_SOURCE_NOTIFICATION = "n";
    @KeepForSdk
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    private static final GoogleApiAvailabilityLight zza = new GoogleApiAvailabilityLight();

    @oo0oO0
    @KeepForSdk
    public static GoogleApiAvailabilityLight getInstance() {
        return zza;
    }

    @KeepForSdk
    public void cancelAvailabilityErrorNotifications(@oo0oO0 Context context) {
        GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(context);
    }

    @ShowFirstParty
    @KeepForSdk
    public int getApkVersion(@oo0oO0 Context context) {
        return GooglePlayServicesUtilLight.getApkVersion(context);
    }

    @ShowFirstParty
    @KeepForSdk
    public int getClientVersion(@oo0oO0 Context context) {
        return GooglePlayServicesUtilLight.getClientVersion(context);
    }

    @o0OO00OO
    @Deprecated
    @ShowFirstParty
    @KeepForSdk
    public Intent getErrorResolutionIntent(int i) {
        return getErrorResolutionIntent(null, i, null);
    }

    @ShowFirstParty
    @o0OO00OO
    @KeepForSdk
    public Intent getErrorResolutionIntent(@o0OO00OO Context context, int i, @o0OO00OO String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            return com.google.android.gms.common.internal.zzt.zzc("com.google.android.gms");
        } else if (context == null || !DeviceProperties.isWearableWithoutPlayStore(context)) {
            StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("gcore_");
            o00oOOo02.append(GOOGLE_PLAY_SERVICES_VERSION_CODE);
            o00oOOo02.append("-");
            if (!TextUtils.isEmpty(str)) {
                o00oOOo02.append(str);
            }
            o00oOOo02.append("-");
            if (context != null) {
                o00oOOo02.append(context.getPackageName());
            }
            o00oOOo02.append("-");
            if (context != null) {
                try {
                    o00oOOo02.append(Wrappers.packageManager(context).getPackageInfo(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return com.google.android.gms.common.internal.zzt.zzb("com.google.android.gms", o00oOOo02.toString());
        } else {
            return com.google.android.gms.common.internal.zzt.zza();
        }
    }

    @o0OO00OO
    @KeepForSdk
    public PendingIntent getErrorResolutionPendingIntent(@oo0oO0 Context context, int i, int i2) {
        return getErrorResolutionPendingIntent(context, i, i2, null);
    }

    @ShowFirstParty
    @o0OO00OO
    @KeepForSdk
    public PendingIntent getErrorResolutionPendingIntent(@oo0oO0 Context context, int i, int i2, @o0OO00OO String str) {
        Intent errorResolutionIntent = getErrorResolutionIntent(context, i, str);
        if (errorResolutionIntent == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, errorResolutionIntent, com.google.android.gms.internal.common.zzd.zza | C.BUFFER_FLAG_FIRST_SAMPLE);
    }

    @oo0oO0
    @KeepForSdk
    public String getErrorString(int i) {
        return GooglePlayServicesUtilLight.getErrorString(i);
    }

    @HideFirstParty
    @KeepForSdk
    public int isGooglePlayServicesAvailable(@oo0oO0 Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @KeepForSdk
    public int isGooglePlayServicesAvailable(@oo0oO0 Context context, int i) {
        int isGooglePlayServicesAvailable = GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, i);
        if (GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, isGooglePlayServicesAvailable)) {
            return 18;
        }
        return isGooglePlayServicesAvailable;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPlayServicesPossiblyUpdating(@oo0oO0 Context context, int i) {
        return GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, i);
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPlayStorePossiblyUpdating(@oo0oO0 Context context, int i) {
        return GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context, i);
    }

    @KeepForSdk
    public boolean isUninstalledAppPossiblyUpdating(@oo0oO0 Context context, @oo0oO0 String str) {
        return GooglePlayServicesUtilLight.zza(context, str);
    }

    @KeepForSdk
    public boolean isUserResolvableError(int i) {
        return GooglePlayServicesUtilLight.isUserRecoverableError(i);
    }

    @KeepForSdk
    public void verifyGooglePlayServicesIsAvailable(@oo0oO0 Context context, int i) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        GooglePlayServicesUtilLight.ensurePlayServicesAvailable(context, i);
    }
}
