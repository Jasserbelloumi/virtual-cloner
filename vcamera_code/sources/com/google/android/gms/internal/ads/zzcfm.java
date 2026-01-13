package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import o00oOooO.o0OO00OO;
@TargetApi(21)
/* loaded from: classes2.dex */
public final class zzcfm extends zzcfl {
    public zzcfm(zzcei zzceiVar, zzawe zzaweVar, boolean z) {
        super(zzceiVar, zzaweVar, z);
    }

    @Override // android.webkit.WebViewClient
    @o0OO00OO
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return zzN(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
