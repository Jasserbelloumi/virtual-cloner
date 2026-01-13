package com.google.android.gms.internal.ads;

import o00oOooO.o0OO00OO;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class zzefp implements zzeav {
    private final zzegt zza;

    public zzefp(zzegt zzegtVar) {
        this.zza = zzegtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeav
    @o0OO00OO
    public final zzeaw zza(String str, JSONObject jSONObject) throws zzezc {
        zzbpc zza = this.zza.zza(str);
        if (zza == null) {
            return null;
        }
        return new zzeaw(zza, new zzecq(), str);
    }
}
