package com.google.android.gms.internal.ads;

import o00oOooO.o0OO00OO;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class zzcnr implements zzgwy {
    private final zzgxl zza;

    public zzcnr(zzgxl zzgxlVar) {
        this.zza = zzgxlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    @o0OO00OO
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((zzcrc) this.zza).zza().zzA);
        } catch (JSONException unused) {
            return null;
        }
    }
}
