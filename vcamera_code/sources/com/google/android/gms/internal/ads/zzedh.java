package com.google.android.gms.internal.ads;

import o00oOooO.o0OO00OO;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class zzedh implements zzeav {
    private final zzdnd zza;

    public zzedh(zzdnd zzdndVar) {
        this.zza = zzdndVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeav
    @o0OO00OO
    public final zzeaw zza(String str, JSONObject jSONObject) throws zzezc {
        return new zzeaw(this.zza.zzc(str, jSONObject), new zzecq(), str);
    }
}
