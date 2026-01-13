package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
/* loaded from: classes2.dex */
public final class zzcfi {
    private final zzcfj zza;
    private final zzcfh zzb;

    public zzcfi(zzcfj zzcfjVar, zzcfh zzcfhVar, byte[] bArr) {
        this.zzb = zzcfhVar;
        this.zza = zzcfjVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.zzcfj, com.google.android.gms.internal.ads.zzcfq] */
    @JavascriptInterface
    public String getClickSignals(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "Click string is empty, not proceeding.";
        } else {
            ?? r0 = this.zza;
            zzapw zzI = r0.zzI();
            if (zzI == null) {
                str2 = "Signal utils is empty, ignoring.";
            } else {
                zzaps zzc = zzI.zzc();
                if (zzc == null) {
                    str2 = "Signals object is empty, ignoring.";
                } else if (r0.getContext() != null) {
                    Context context = this.zza.getContext();
                    zzcfj zzcfjVar = this.zza;
                    return zzc.zzf(context, str, (View) zzcfjVar, zzcfjVar.zzi());
                } else {
                    str2 = "Context is null, ignoring.";
                }
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza(str2);
        return "";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzcfj, com.google.android.gms.internal.ads.zzcfq] */
    @JavascriptInterface
    public String getViewSignals() {
        String str;
        ?? r0 = this.zza;
        zzapw zzI = r0.zzI();
        if (zzI == null) {
            str = "Signal utils is empty, ignoring.";
        } else {
            zzaps zzc = zzI.zzc();
            if (zzc == null) {
                str = "Signals object is empty, ignoring.";
            } else if (r0.getContext() != null) {
                Context context = this.zza.getContext();
                zzcfj zzcfjVar = this.zza;
                return zzc.zzh(context, (View) zzcfjVar, zzcfjVar.zzi());
            } else {
                str = "Context is null, ignoring.";
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza(str);
        return "";
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            zzbza.zzj("URL is empty, ignoring message");
        } else {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfg
                @Override // java.lang.Runnable
                public final void run() {
                    zzcfi.this.zza(str);
                }
            });
        }
    }

    public final /* synthetic */ void zza(String str) {
        zzcfh zzcfhVar = this.zzb;
        Uri parse = Uri.parse(str);
        zzcep zzaJ = ((zzcfb) zzcfhVar.zza).zzaJ();
        if (zzaJ == null) {
            zzbza.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            zzaJ.zzj(parse);
        }
    }
}
