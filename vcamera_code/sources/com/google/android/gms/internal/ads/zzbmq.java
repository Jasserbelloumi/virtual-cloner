package com.google.android.gms.internal.ads;

import o00oOooO.o0OO00OO;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
final class zzbmq implements zzbic {
    public final /* synthetic */ zzbmr zza;
    private final zzbzs zzb;

    public zzbmq(zzbmr zzbmrVar, zzbzs zzbzsVar) {
        this.zza = zzbmrVar;
        this.zzb = zzbzsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    public final void zza(@o0OO00OO String str) {
        try {
            if (str == null) {
                this.zzb.zze(new zzblu());
            } else {
                this.zzb.zze(new zzblu(str));
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    public final void zzb(JSONObject jSONObject) {
        try {
            this.zzb.zzd(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.zzb.zze(e);
        }
    }
}
