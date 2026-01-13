package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcfa implements Runnable {
    public final /* synthetic */ zzcfb zza;

    public zzcfa(zzcfb zzcfbVar) {
        this.zza = zzcfbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*android.webkit.WebView*/.destroy();
    }
}
