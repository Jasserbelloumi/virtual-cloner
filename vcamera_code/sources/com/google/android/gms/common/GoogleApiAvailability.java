package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.exoplayer2.C;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zabw;
import com.google.android.gms.common.api.internal.zabx;
import com.google.android.gms.common.api.internal.zacc;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.zag;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.internal.base.zad;
import com.google.android.gms.internal.base.zae;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.errorprone.annotations.RestrictedInheritance;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import o00oOooO.o0O;
import o00oOooO.o0O0OOOo;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o00ooOoo.oOo000Oo;
import oo0oO0.o00oOOoO;
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {zad.class, zae.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes.dex */
public class GoogleApiAvailability extends GoogleApiAvailabilityLight {
    @oo0oO0
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @o0O0OOOo("mLock")
    private String zac;
    private static final Object zaa = new Object();
    private static final GoogleApiAvailability zab = new GoogleApiAvailability();
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    @oo0oO0
    public static GoogleApiAvailability getInstance() {
        return zab;
    }

    @oo0oO0
    public static final Task zai(@oo0oO0 HasApiKey hasApiKey, @oo0oO0 HasApiKey... hasApiKeyArr) {
        Preconditions.checkNotNull(hasApiKey, "Requested API must not be null.");
        for (HasApiKey hasApiKey2 : hasApiKeyArr) {
            Preconditions.checkNotNull(hasApiKey2, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(hasApiKeyArr.length + 1);
        arrayList.add(hasApiKey);
        arrayList.addAll(Arrays.asList(hasApiKeyArr));
        return GoogleApiManager.zal().zao(arrayList);
    }

    @oo0oO0
    public Task<Void> checkApiAvailability(@oo0oO0 GoogleApi<?> googleApi, @oo0oO0 GoogleApi<?>... googleApiArr) {
        return zai(googleApi, googleApiArr).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.gms.common.zab
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Map map = (Map) obj;
                int i = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                return Tasks.forResult(null);
            }
        });
    }

    @oo0oO0
    public Task<Void> checkApiAvailability(@oo0oO0 HasApiKey<?> hasApiKey, @oo0oO0 HasApiKey<?>... hasApiKeyArr) {
        return zai(hasApiKey, hasApiKeyArr).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.gms.common.zaa
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Map map = (Map) obj;
                int i = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                return Tasks.forResult(null);
            }
        });
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ShowFirstParty
    @KeepForSdk
    public int getClientVersion(@oo0oO0 Context context) {
        return super.getClientVersion(context);
    }

    @o0OO00OO
    public Dialog getErrorDialog(@oo0oO0 Activity activity, int i, int i2) {
        return getErrorDialog(activity, i, i2, (DialogInterface.OnCancelListener) null);
    }

    @o0OO00OO
    public Dialog getErrorDialog(@oo0oO0 Activity activity, int i, int i2, @o0OO00OO DialogInterface.OnCancelListener onCancelListener) {
        return zaa(activity, i, zag.zab(activity, getErrorResolutionIntent(activity, i, GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG), i2), onCancelListener);
    }

    @o0OO00OO
    public Dialog getErrorDialog(@oo0oO0 Fragment fragment, int i, int i2) {
        return getErrorDialog(fragment, i, i2, (DialogInterface.OnCancelListener) null);
    }

    @o0OO00OO
    public Dialog getErrorDialog(@oo0oO0 Fragment fragment, int i, int i2, @o0OO00OO DialogInterface.OnCancelListener onCancelListener) {
        return zaa(fragment.requireContext(), i, zag.zac(fragment, getErrorResolutionIntent(fragment.requireContext(), i, GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG), i2), onCancelListener);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ShowFirstParty
    @o0OO00OO
    @KeepForSdk
    public Intent getErrorResolutionIntent(@o0OO00OO Context context, int i, @o0OO00OO String str) {
        return super.getErrorResolutionIntent(context, i, str);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @o0OO00OO
    public PendingIntent getErrorResolutionPendingIntent(@oo0oO0 Context context, int i, int i2) {
        return super.getErrorResolutionPendingIntent(context, i, i2);
    }

    @o0OO00OO
    public PendingIntent getErrorResolutionPendingIntent(@oo0oO0 Context context, @oo0oO0 ConnectionResult connectionResult) {
        return connectionResult.hasResolution() ? connectionResult.getResolution() : getErrorResolutionPendingIntent(context, connectionResult.getErrorCode(), 0);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @oo0oO0
    public final String getErrorString(int i) {
        return super.getErrorString(i);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @HideFirstParty
    public int isGooglePlayServicesAvailable(@oo0oO0 Context context) {
        return super.isGooglePlayServicesAvailable(context);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ShowFirstParty
    @KeepForSdk
    public int isGooglePlayServicesAvailable(@oo0oO0 Context context, int i) {
        return super.isGooglePlayServicesAvailable(context, i);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final boolean isUserResolvableError(int i) {
        return super.isUserResolvableError(i);
    }

    @o0O
    @oo0oO0
    public Task<Void> makeGooglePlayServicesAvailable(@oo0oO0 Activity activity) {
        int i = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        Preconditions.checkMainThread("makeGooglePlayServicesAvailable must be called from the main thread");
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(activity, i);
        if (isGooglePlayServicesAvailable == 0) {
            return Tasks.forResult(null);
        }
        zacc zaa2 = zacc.zaa(activity);
        zaa2.zah(new ConnectionResult(isGooglePlayServicesAvailable, null), 0);
        return zaa2.zad();
    }

    @TargetApi(26)
    public void setDefaultNotificationChannelId(@oo0oO0 Context context, @oo0oO0 String str) {
        if (PlatformVersion.isAtLeastO()) {
            Preconditions.checkNotNull(((NotificationManager) Preconditions.checkNotNull(context.getSystemService("notification"))).getNotificationChannel(str));
        }
        synchronized (zaa) {
            this.zac = str;
        }
    }

    public boolean showErrorDialogFragment(@oo0oO0 Activity activity, int i, int i2) {
        return showErrorDialogFragment(activity, i, i2, null);
    }

    public boolean showErrorDialogFragment(@oo0oO0 Activity activity, int i, int i2, @o0OO00OO DialogInterface.OnCancelListener onCancelListener) {
        Dialog errorDialog = getErrorDialog(activity, i, i2, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        zad(activity, errorDialog, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public void showErrorNotification(@oo0oO0 Context context, int i) {
        zae(context, i, null, getErrorResolutionPendingIntent(context, i, 0, GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION));
    }

    public void showErrorNotification(@oo0oO0 Context context, @oo0oO0 ConnectionResult connectionResult) {
        zae(context, connectionResult.getErrorCode(), null, getErrorResolutionPendingIntent(context, connectionResult));
    }

    @o0OO00OO
    public final Dialog zaa(@oo0oO0 Context context, int i, zag zagVar, @o0OO00OO DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(com.google.android.gms.common.internal.zac.zad(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String zac = com.google.android.gms.common.internal.zac.zac(context, i);
        if (zac != null) {
            builder.setPositiveButton(zac, zagVar);
        }
        String zag = com.google.android.gms.common.internal.zac.zag(context, i);
        if (zag != null) {
            builder.setTitle(zag);
        }
        String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i));
        new IllegalArgumentException();
        return builder.create();
    }

    @oo0oO0
    public final Dialog zab(@oo0oO0 Activity activity, @oo0oO0 DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(com.google.android.gms.common.internal.zac.zad(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        zad(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    @o0OO00OO
    public final zabx zac(Context context, zabw zabwVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme(o00oOOoO.f17287o00oOooo);
        zabx zabxVar = new zabx(zabwVar);
        zao.zaa(context, zabxVar, intentFilter);
        zabxVar.zaa(context);
        if (isUninstalledAppPossiblyUpdating(context, "com.google.android.gms")) {
            return zabxVar;
        }
        zabwVar.zaa();
        zabxVar.zab();
        return null;
    }

    public final void zad(Activity activity, Dialog dialog, String str, @o0OO00OO DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                SupportErrorDialogFragment.newInstance(dialog, onCancelListener).show(((FragmentActivity) activity).o00ooo0(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        ErrorDialogFragment.newInstance(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    public final void zae(Context context, int i, @o0OO00OO String str, @o0OO00OO PendingIntent pendingIntent) {
        int i2;
        String str2;
        String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null);
        new IllegalArgumentException();
        if (i == 18) {
            zaf(context);
        } else if (pendingIntent == null) {
        } else {
            String zaf = com.google.android.gms.common.internal.zac.zaf(context, i);
            String zae = com.google.android.gms.common.internal.zac.zae(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) Preconditions.checkNotNull(context.getSystemService("notification"));
            oOo000Oo.o00oo0 o00oo0Var = new oOo000Oo.o00oo0(context, (String) null);
            o00oo0Var.f9334o00ooO0o = true;
            o00oo0Var.o0O0000O(16, true);
            oOo000Oo.o00oo0 o0O0oo0o2 = o00oo0Var.o00oooOo(zaf).o0O0oo0o(new oOo000Oo.o00oOoO().o00ooO0o(zae));
            if (DeviceProperties.isWearable(context)) {
                Preconditions.checkState(PlatformVersion.isAtLeastKitKatWatch());
                o0O0oo0o2.o0O00o0O(context.getApplicationInfo().icon).o0O00O0o(2);
                if (DeviceProperties.isWearableWithoutPlayStore(context)) {
                    o0O0oo0o2.o00oOOo0(com.google.android.gms.base.R.drawable.common_full_open_on_phone, resources.getString(com.google.android.gms.base.R.string.common_open_on_phone), pendingIntent);
                } else {
                    o0O0oo0o2.o00oooO(pendingIntent);
                }
            } else {
                o0O0oo0o2.o0O00o0O(17301642).o0O0O0o0(resources.getString(com.google.android.gms.base.R.string.common_google_play_services_notification_ticker)).o0O0OO0O(System.currentTimeMillis()).o00oooO(pendingIntent).o00oooOO(zae);
            }
            if (PlatformVersion.isAtLeastO()) {
                Preconditions.checkState(PlatformVersion.isAtLeastO());
                synchronized (zaa) {
                    str2 = this.zac;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                    String zab2 = com.google.android.gms.common.internal.zac.zab(context);
                    if (notificationChannel == null) {
                        notificationChannel = new NotificationChannel("com.google.android.gms.availability", zab2, 4);
                    } else if (!zab2.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(zab2);
                    }
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                o0O0oo0o2.o00ooOoO(str2);
            }
            Notification o00oOoO2 = o0O0oo0o2.o00oOoO();
            if (i == 1 || i == 2 || i == 3) {
                GooglePlayServicesUtilLight.sCanceledAvailabilityNotification.set(false);
                i2 = GooglePlayServicesUtilLight.GMS_AVAILABILITY_NOTIFICATION_ID;
            } else {
                i2 = GooglePlayServicesUtilLight.GMS_GENERAL_ERROR_NOTIFICATION_ID;
            }
            notificationManager.notify(i2, o00oOoO2);
        }
    }

    public final void zaf(Context context) {
        new zac(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean zag(@oo0oO0 Activity activity, @oo0oO0 LifecycleFragment lifecycleFragment, int i, int i2, @o0OO00OO DialogInterface.OnCancelListener onCancelListener) {
        Dialog zaa2 = zaa(activity, i, zag.zad(lifecycleFragment, getErrorResolutionIntent(activity, i, GoogleApiAvailabilityLight.TRACKING_SOURCE_DIALOG), 2), onCancelListener);
        if (zaa2 == null) {
            return false;
        }
        zad(activity, zaa2, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public final boolean zah(@oo0oO0 Context context, @oo0oO0 ConnectionResult connectionResult, int i) {
        PendingIntent errorResolutionPendingIntent;
        if (InstantApps.isInstantApp(context) || (errorResolutionPendingIntent = getErrorResolutionPendingIntent(context, connectionResult)) == null) {
            return false;
        }
        zae(context, connectionResult.getErrorCode(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.zaa(context, errorResolutionPendingIntent, i, true), zap.zaa | C.BUFFER_FLAG_FIRST_SAMPLE));
        return true;
    }
}
