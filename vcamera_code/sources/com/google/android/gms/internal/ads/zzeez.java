package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import o00oOooO.o0OO00OO;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class zzeez implements zzeav {
    @GuardedBy("this")
    private final Map zza = new HashMap();
    private final zzdnd zzb;

    public zzeez(zzdnd zzdndVar) {
        this.zzb = zzdndVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeav
    @o0OO00OO
    public final zzeaw zza(String str, JSONObject jSONObject) throws zzezc {
        zzeaw zzeawVar;
        synchronized (this) {
            zzeawVar = (zzeaw) this.zza.get(str);
            if (zzeawVar == null) {
                zzeawVar = new zzeaw(this.zzb.zzc(str, jSONObject), new zzecr(), str);
                this.zza.put(str, zzeawVar);
            }
        }
        return zzeawVar;
    }
}
