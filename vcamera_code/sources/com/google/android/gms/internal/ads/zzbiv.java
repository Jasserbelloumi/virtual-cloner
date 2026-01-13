package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.h5.H5AdsRequestHandler;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
@o0OOooO0(api = 21)
/* loaded from: classes2.dex */
public final class zzbiv extends zzbii {
    public static final /* synthetic */ int zza = 0;
    @o0OO00OO
    private WebViewClient zzb;
    private final H5AdsRequestHandler zzc;
    private final WebView zzd;

    public zzbiv(Context context, final WebView webView) {
        context.getClass();
        webView.getClass();
        zzfnu.zzf(webView.getSettings().getJavaScriptEnabled(), "JavaScript must be enabled on the WebView.");
        this.zzd = webView;
        this.zzc = new H5AdsRequestHandler(context, new OnH5AdsEventListener() { // from class: com.google.android.gms.internal.ads.zzbiu
            @Override // com.google.android.gms.ads.h5.OnH5AdsEventListener
            public final void onH5AdsEvent(String str) {
                WebView webView2 = webView;
                int i = zzbiv.zza;
                webView2.evaluateJavascript(str, null);
            }
        });
    }

    private final boolean zzc(WebView webView) {
        if (this.zzd.equals(webView)) {
            return true;
        }
        zzbza.zzg("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    @o0OO00OO
    public final WebViewClient getDelegate() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbii, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (zzc(webView) && !this.zzc.handleH5AdsRequest(str)) {
            super.onLoadResource(webView, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbii, android.webkit.WebViewClient
    @o0OOooO0(api = 24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (zzc(this.zzd)) {
            if (this.zzc.handleH5AdsRequest(webResourceRequest.getUrl().toString())) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbii, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (zzc(webView)) {
            if (this.zzc.handleH5AdsRequest(str)) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
        return false;
    }

    public final void zza() {
        this.zzc.clearAdObjects();
    }

    public final void zzb(@o0OO00OO WebViewClient webViewClient) {
        zzfnu.zzf(webViewClient != this, "Delegate cannot be itself.");
        this.zzb = webViewClient;
    }
}
