package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import o00oOooO.o0o0000;
import o0OOOoo0.oOo0oooO;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class zzfge {
    private static final zzfge zza = new zzfge();

    private zzfge() {
    }

    public static final zzfge zza() {
        return zza;
    }

    @o0o0000
    public final void zzb(WebView webView, String str, Object... objArr) {
        String obj;
        if (webView == null) {
            zzffh.zza.booleanValue();
            return;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
        sb.append(str);
        sb.append("(");
        if (objArr.length > 0) {
            for (Object obj2 : objArr) {
                if (obj2 == null) {
                    obj = "\"\"";
                } else {
                    if (obj2 instanceof String) {
                        obj = obj2.toString();
                        if (!obj.startsWith("{")) {
                            sb.append(oOo0oooO.f13903o00oOOoO);
                            sb.append(obj);
                            sb.append(oOo0oooO.f13903o00oOOoO);
                        }
                    } else {
                        sb.append(obj2);
                    }
                    sb.append(",");
                }
                sb.append(obj);
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
        }
        sb.append(")}");
        String sb2 = sb.toString();
        Handler handler = webView.getHandler();
        if (handler == null || Looper.myLooper() == handler.getLooper()) {
            webView.loadUrl(sb2);
        } else {
            handler.post(new zzfgd(this, webView, sb2));
        }
    }

    public final void zzc(WebView webView) {
        zzb(webView, "finishSession", new Object[0]);
    }

    public final void zzd(WebView webView, JSONObject jSONObject) {
        zzb(webView, "init", jSONObject);
    }

    public final void zze(WebView webView, float f) {
        zzb(webView, "setDeviceVolume", Float.valueOf(f));
    }

    public final void zzf(WebView webView, String str) {
        zzb(webView, "setNativeViewHierarchy", str);
    }

    public final void zzg(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        zzb(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }
}
