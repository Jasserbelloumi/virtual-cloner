package com.google.android.gms.internal.ads;

import android.webkit.WebView;
/* loaded from: classes2.dex */
final class zzfgn implements Runnable {
    public final /* synthetic */ zzfgo zza;
    private final WebView zzb;

    public zzfgn(zzfgo zzfgoVar) {
        WebView webView;
        this.zza = zzfgoVar;
        webView = zzfgoVar.zza;
        this.zzb = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
