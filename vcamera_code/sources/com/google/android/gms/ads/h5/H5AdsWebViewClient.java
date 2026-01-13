package com.google.android.gms.ads.h5;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzbii;
import com.google.android.gms.internal.ads.zzbiv;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(api = 21)
/* loaded from: classes.dex */
public final class H5AdsWebViewClient extends zzbii {
    private final zzbiv zza;

    public H5AdsWebViewClient(@oo0oO0 Context context, @oo0oO0 WebView webView) {
        this.zza = new zzbiv(context, webView);
    }

    public void clearAdObjects() {
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    @oo0oO0
    public WebViewClient getDelegate() {
        return this.zza;
    }

    @o0OO00OO
    public WebViewClient getDelegateWebViewClient() {
        return this.zza.getDelegate();
    }

    public void setDelegateWebViewClient(@o0OO00OO WebViewClient webViewClient) {
        this.zza.zzb(webViewClient);
    }
}
