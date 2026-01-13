package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzffm {
    private final zzfft zza;
    private final WebView zzb;
    private final List zzc = new ArrayList();
    private final Map zzd = new HashMap();
    private final String zze = "";
    @o0OO00OO
    private final String zzf;
    private final zzffn zzg;

    private zzffm(zzfft zzfftVar, WebView webView, String str, List list, @o0OO00OO String str2, String str3, zzffn zzffnVar) {
        this.zza = zzfftVar;
        this.zzb = webView;
        this.zzg = zzffnVar;
        this.zzf = str2;
    }

    public static zzffm zzb(zzfft zzfftVar, WebView webView, @o0OO00OO String str, String str2) {
        return new zzffm(zzfftVar, webView, null, null, str, "", zzffn.HTML);
    }

    public static zzffm zzc(zzfft zzfftVar, WebView webView, @o0OO00OO String str, String str2) {
        return new zzffm(zzfftVar, webView, null, null, str, "", zzffn.JAVASCRIPT);
    }

    public final WebView zza() {
        return this.zzb;
    }

    public final zzffn zzd() {
        return this.zzg;
    }

    public final zzfft zze() {
        return this.zza;
    }

    @o0OO00OO
    public final String zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zze;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final Map zzi() {
        return Collections.unmodifiableMap(this.zzd);
    }
}
