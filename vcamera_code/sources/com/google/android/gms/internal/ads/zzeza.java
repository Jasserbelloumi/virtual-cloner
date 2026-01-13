package com.google.android.gms.internal.ads;

import o00oOooO.o0OO00OO;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class zzeza {
    private final JSONObject zza;

    public zzeza(JSONObject jSONObject) {
        this.zza = jSONObject;
    }

    @o0OO00OO
    public final String zza() {
        if (zzb() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    public final int zzb() {
        int optInt = this.zza.optInt("media_type", -1);
        if (optInt != 0) {
            return optInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
