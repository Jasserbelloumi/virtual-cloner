package com.google.android.gms.internal.ads;

import o00oOooO.o0OO00OO;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbmi implements zzbic {
    public final /* synthetic */ zzbmj zza;
    private final zzbll zzb;
    private final zzbzs zzc;

    public zzbmi(zzbmj zzbmjVar, zzbll zzbllVar, zzbzs zzbzsVar) {
        this.zza = zzbmjVar;
        this.zzb = zzbllVar;
        this.zzc = zzbzsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    public final void zza(@o0OO00OO String str) {
        try {
            if (str == null) {
                this.zzc.zze(new zzblu());
            } else {
                this.zzc.zze(new zzblu(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            this.zzb.zzb();
            throw th;
        }
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    public final void zzb(JSONObject jSONObject) {
        zzblx zzblxVar;
        try {
            try {
                zzbzs zzbzsVar = this.zzc;
                zzblxVar = this.zza.zza;
                zzbzsVar.zzd(zzblxVar.zza(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e) {
                this.zzc.zze(e);
            }
        } finally {
            this.zzb.zzb();
        }
    }
}
