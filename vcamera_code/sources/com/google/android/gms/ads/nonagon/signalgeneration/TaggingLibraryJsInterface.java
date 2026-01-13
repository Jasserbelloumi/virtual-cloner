package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzapw;
import com.google.android.gms.internal.ads.zzapx;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzn;
import com.google.android.gms.internal.ads.zzdpn;
import com.google.android.gms.internal.ads.zzfff;
import com.google.android.gms.internal.ads.zzfuu;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TaggingLibraryJsInterface {
    private final Context zza;
    private final WebView zzb;
    private final zzapw zzc;
    private final int zzd;
    private final zzdpn zze;
    private final boolean zzf;
    private final zzfuu zzg = zzbzn.zze;
    private final zzfff zzh;

    public TaggingLibraryJsInterface(WebView webView, zzapw zzapwVar, zzdpn zzdpnVar, zzfff zzfffVar) {
        this.zzb = webView;
        Context context = webView.getContext();
        this.zza = context;
        this.zzc = zzapwVar;
        this.zze = zzdpnVar;
        zzbar.zzc(context);
        this.zzd = ((Integer) zzba.zzc().zzb(zzbar.zziG)).intValue();
        this.zzf = ((Boolean) zzba.zzc().zzb(zzbar.zziH)).booleanValue();
        this.zzh = zzfffVar;
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getClickSignals(String str) {
        try {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            String zze = this.zzc.zzc().zze(this.zza, str, this.zzb);
            if (this.zzf) {
                zzf.zzc(this.zze, null, "csg", new Pair("clat", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - currentTimeMillis)));
            }
            return zze;
        } catch (RuntimeException e) {
            zzbza.zzh("Exception getting click signals. ", e);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getClickSignalsWithTimeout(final String str, int i) {
        if (i <= 0) {
            zzbza.zzg("Invalid timeout for getting click signals. Timeout=" + i);
            return "";
        }
        try {
            return (String) zzbzn.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzas
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return TaggingLibraryJsInterface.this.getClickSignals(str);
                }
            }).get(Math.min(i, this.zzd), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzbza.zzh("Exception getting click signals with timeout. ", e);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getQueryInfo() {
        com.google.android.gms.ads.internal.zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final zzat zzatVar = new zzat(this, uuid);
        if (((Boolean) zzba.zzc().zzb(zzbar.zziJ)).booleanValue()) {
            this.zzg.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaq
                @Override // java.lang.Runnable
                public final void run() {
                    TaggingLibraryJsInterface.this.zzb(bundle, zzatVar);
                }
            });
        } else {
            Context context = this.zza;
            AdFormat adFormat = AdFormat.BANNER;
            AdRequest.Builder builder = new AdRequest.Builder();
            builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
            QueryInfo.generate(context, adFormat, builder.build(), zzatVar);
        }
        return uuid;
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getViewSignals() {
        try {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            String zzh = this.zzc.zzc().zzh(this.zza, this.zzb, null);
            if (this.zzf) {
                zzf.zzc(this.zze, null, "vsg", new Pair("vlat", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - currentTimeMillis)));
            }
            return zzh;
        } catch (RuntimeException e) {
            zzbza.zzh("Exception getting view signals. ", e);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            zzbza.zzg("Invalid timeout for getting view signals. Timeout=" + i);
            return "";
        }
        try {
            return (String) zzbzn.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzar
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return TaggingLibraryJsInterface.this.getViewSignals();
                }
            }).get(Math.min(i, this.zzd), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzbza.zzh("Exception getting view signals with timeout. ", e);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public void recordClick(final String str) {
        if (!((Boolean) zzba.zzc().zzb(zzbar.zziN)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        zzbzn.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzap
            @Override // java.lang.Runnable
            public final void run() {
                TaggingLibraryJsInterface.this.zzc(str);
            }
        });
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public void reportTouchEvent(String str) {
        int i;
        int i2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i3 = jSONObject.getInt("x");
            int i4 = jSONObject.getInt("y");
            int i5 = jSONObject.getInt("duration_ms");
            float f = (float) jSONObject.getDouble("force");
            int i6 = jSONObject.getInt("type");
            try {
                if (i6 != 0) {
                    if (i6 == 1) {
                        i2 = 1;
                    } else if (i6 == 2) {
                        i2 = 2;
                    } else if (i6 != 3) {
                        i = -1;
                    } else {
                        i2 = 3;
                    }
                    this.zzc.zzd(MotionEvent.obtain(0L, i5, i2, i3, i4, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
                    return;
                }
                i = 0;
                this.zzc.zzd(MotionEvent.obtain(0L, i5, i2, i3, i4, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
                return;
            } catch (RuntimeException e) {
                e = e;
                zzbza.zzh("Failed to parse the touch string. ", e);
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "TaggingLibraryJsInterface.reportTouchEvent");
                return;
            } catch (JSONException e2) {
                e = e2;
                zzbza.zzh("Failed to parse the touch string. ", e);
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "TaggingLibraryJsInterface.reportTouchEvent");
                return;
            }
            i2 = i;
        } catch (RuntimeException | JSONException e3) {
            e = e3;
        }
    }

    public final /* synthetic */ void zzb(Bundle bundle, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        CookieManager zzb = com.google.android.gms.ads.internal.zzt.zzq().zzb(this.zza);
        bundle.putBoolean("accept_3p_cookie", zzb != null ? zzb.acceptThirdPartyCookies(this.zzb) : false);
        Context context = this.zza;
        AdFormat adFormat = AdFormat.BANNER;
        AdRequest.Builder builder = new AdRequest.Builder();
        builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
        QueryInfo.generate(context, adFormat, builder.build(), queryInfoGenerationCallback);
    }

    public final /* synthetic */ void zzc(String str) {
        Uri parse = Uri.parse(str);
        try {
            parse = this.zzc.zza(parse, this.zza, this.zzb, null);
        } catch (zzapx e) {
            zzbza.zzf("Failed to append the click signal to URL: ", e);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "TaggingLibraryJsInterface.recordClick");
        }
        this.zzh.zzc(parse.toString(), null);
    }
}
