package com.google.android.gms.internal.ads;

import android.net.Uri;
import o00oOooO.o0OO00OO;
import o00oOooO.oO0Oo;
/* loaded from: classes2.dex */
public final class zzbmt extends zzbzf {
    private final zzbms zza;

    public zzbmt(zzbms zzbmsVar, @o0OO00OO String str) {
        super(str);
        this.zza = zzbmsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzf, com.google.android.gms.internal.ads.zzbys
    @oO0Oo
    public final boolean zza(String str) {
        zzbza.zze("LeibnizHttpUrlPinger pinging URL: ".concat(String.valueOf(str)));
        if ("oda".equals(Uri.parse(str).getScheme())) {
            return true;
        }
        zzbza.zze("URL does not match oda:// scheme, falling back on HttpUrlPinger");
        return super.zza(str);
    }
}
