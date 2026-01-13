package com.google.android.gms.internal.ads;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import o00ooOoo.oOo000Oo;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
final class zzdrz {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private final int zzf;
    private final boolean zzg;

    public zzdrz(String str, String str2, String str3, int i, String str4, int i2, boolean z) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = i;
        this.zze = str4;
        this.zzf = i2;
        this.zzg = z;
    }

    public final JSONObject zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.zza);
        jSONObject.put("version", this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziz)).booleanValue()) {
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, this.zzb);
        }
        jSONObject.put(oOo000Oo.f9246o0ooO, this.zzd);
        jSONObject.put("description", this.zze);
        jSONObject.put("initializationLatencyMillis", this.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziA)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.zzg);
        }
        return jSONObject;
    }
}
