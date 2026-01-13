package com.google.android.gms.internal.ads;

import java.util.HashSet;
import o00oOooO.o0o0000;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class zzfgv {
    private JSONObject zza;
    private final zzfhe zzb;

    public zzfgv(zzfhe zzfheVar) {
        this.zzb = zzfheVar;
    }

    @o0o0000
    public final JSONObject zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zzb.zzb(new zzfhf(this, null));
    }

    public final void zzc(JSONObject jSONObject, HashSet hashSet, long j) {
        this.zzb.zzb(new zzfhg(this, hashSet, jSONObject, j, null));
    }

    public final void zzd(JSONObject jSONObject, HashSet hashSet, long j) {
        this.zzb.zzb(new zzfhh(this, hashSet, jSONObject, j, null));
    }

    @o0o0000
    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}
