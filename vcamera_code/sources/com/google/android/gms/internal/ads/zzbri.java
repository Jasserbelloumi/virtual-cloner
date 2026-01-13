package com.google.android.gms.internal.ads;

import o00oOooO.o0OO00OO;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class zzbri {
    public final boolean zza;
    public final String zzb;

    public zzbri(boolean z, String str) {
        this.zza = z;
        this.zzb = str;
    }

    @o0OO00OO
    public static zzbri zza(JSONObject jSONObject) {
        return new zzbri(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""));
    }
}
