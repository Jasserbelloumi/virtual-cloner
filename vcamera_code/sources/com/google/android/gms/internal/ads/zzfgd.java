package com.google.android.gms.internal.ads;

import android.webkit.WebView;
/* loaded from: classes2.dex */
final class zzfgd implements Runnable {
    public final /* synthetic */ WebView zza;
    public final /* synthetic */ String zzb;

    public zzfgd(zzfge zzfgeVar, WebView webView, String str) {
        this.zza = webView;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.loadUrl(this.zzb);
    }
}
