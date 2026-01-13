package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import o00oOooO.o0OO00OO;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class zzere implements zzepm {
    @VisibleForTesting
    @o0OO00OO
    public final String zza;
    @VisibleForTesting
    public final int zzb;

    public zzere(@o0OO00OO String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzepm
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (TextUtils.isEmpty(this.zza) || this.zzb == -1) {
            return;
        }
        try {
            JSONObject zzf = com.google.android.gms.ads.internal.util.zzbu.zzf(jSONObject, "pii");
            zzf.put("pvid", this.zza);
            zzf.put("pvid_s", this.zzb);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting gms core app set ID info.", e);
        }
    }
}
