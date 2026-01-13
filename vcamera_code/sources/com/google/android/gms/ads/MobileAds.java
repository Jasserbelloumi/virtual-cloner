package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.zzej;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbrt;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzbza;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO0;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class MobileAds {
    @oo0oO0
    public static final String ERROR_DOMAIN = "com.google.android.gms.ads";

    private MobileAds() {
    }

    public static void disableMediationAdapterInitialization(@oo0oO0 Context context) {
        zzej.zzf().zzk(context);
    }

    public static void enableSameAppKey(boolean z) {
        zzej.zzf().zzl(z);
    }

    @o0OO00OO
    public static InitializationStatus getInitializationStatus() {
        return zzej.zzf().zze();
    }

    @oo0oO0
    public static RequestConfiguration getRequestConfiguration() {
        return zzej.zzf().zzc();
    }

    @oo0oO0
    public static VersionInfo getVersion() {
        zzej.zzf();
        String[] split = TextUtils.split("22.0.0", "\\.");
        if (split.length != 3) {
            return new VersionInfo(0, 0, 0);
        }
        try {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        } catch (NumberFormatException unused) {
            return new VersionInfo(0, 0, 0);
        }
    }

    @o0OO0oO0("android.permission.INTERNET")
    public static void initialize(@oo0oO0 Context context) {
        zzej.zzf().zzm(context, null, null);
    }

    public static void initialize(@oo0oO0 Context context, @oo0oO0 OnInitializationCompleteListener onInitializationCompleteListener) {
        zzej.zzf().zzm(context, null, onInitializationCompleteListener);
    }

    public static void openAdInspector(@oo0oO0 Context context, @oo0oO0 OnAdInspectorClosedListener onAdInspectorClosedListener) {
        zzej.zzf().zzp(context, onAdInspectorClosedListener);
    }

    public static void openDebugMenu(@oo0oO0 Context context, @oo0oO0 String str) {
        zzej.zzf().zzq(context, str);
    }

    @KeepForSdk
    public static void registerRtbAdapter(@oo0oO0 Class<? extends RtbAdapter> cls) {
        zzej.zzf().zzr(cls);
    }

    @o0OOooO0(api = 21)
    public static void registerWebView(@oo0oO0 WebView webView) {
        zzej.zzf();
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (webView == null) {
            zzbza.zzg("The webview to be registered cannot be null.");
            return;
        }
        zzbxr zza = zzbrt.zza(webView.getContext());
        if (zza == null) {
            zzbza.zzj("Internal error, query info generator is null.");
            return;
        }
        try {
            zza.zzi(ObjectWrapper.wrap(webView));
        } catch (RemoteException e) {
            zzbza.zzh("", e);
        }
    }

    public static void setAppMuted(boolean z) {
        zzej.zzf().zzs(z);
    }

    public static void setAppVolume(float f) {
        zzej.zzf().zzt(f);
    }

    @KeepForSdk
    private static void setPlugin(String str) {
        zzej.zzf().zzu(str);
    }

    public static void setRequestConfiguration(@oo0oO0 RequestConfiguration requestConfiguration) {
        zzej.zzf().zzv(requestConfiguration);
    }
}
