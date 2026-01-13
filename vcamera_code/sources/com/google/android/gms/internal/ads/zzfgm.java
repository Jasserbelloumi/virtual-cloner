package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.webkit.WebView;
/* loaded from: classes2.dex */
public final class zzfgm extends zzfgl {
    @SuppressLint({"SetJavaScriptEnabled"})
    public zzfgm(WebView webView) {
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        zzi(webView);
    }
}
