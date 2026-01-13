package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public class zzcfl extends zzcep {
    public zzcfl(zzcei zzceiVar, zzawe zzaweVar, boolean z) {
        super(zzceiVar, zzaweVar, z);
    }

    @o0OO00OO
    public final WebResourceResponse zzN(WebView webView, String str, @o0OO00OO Map map) {
        if (!(webView instanceof zzcei)) {
            zzbza.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcei zzceiVar = (zzcei) webView;
        zzbwb zzbwbVar = this.zza;
        if (zzbwbVar != null) {
            zzbwbVar.zzd(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzc(str, map);
        }
        if (zzceiVar.zzN() != null) {
            zzceiVar.zzN().zzE();
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzceiVar.zzO().zzi() ? zzbar.zzM : zzceiVar.zzaA() ? zzbar.zzL : zzbar.zzK);
        com.google.android.gms.ads.internal.zzt.zzp();
        return com.google.android.gms.ads.internal.util.zzs.zzt(zzceiVar.getContext(), zzceiVar.zzn().zza, str2);
    }
}
