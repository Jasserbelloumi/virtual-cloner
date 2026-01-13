package com.google.android.gms.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzu;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class AdapterResponseInfo {
    private final zzu zza;
    @o0OO00OO
    private final AdError zzb;

    private AdapterResponseInfo(zzu zzuVar) {
        this.zza = zzuVar;
        com.google.android.gms.ads.internal.client.zze zzeVar = zzuVar.zzc;
        this.zzb = zzeVar == null ? null : zzeVar.zza();
    }

    @o0OO00OO
    public static AdapterResponseInfo zza(@o0OO00OO zzu zzuVar) {
        if (zzuVar != null) {
            return new AdapterResponseInfo(zzuVar);
        }
        return null;
    }

    @o0OO00OO
    public AdError getAdError() {
        return this.zzb;
    }

    @oo0oO0
    public String getAdSourceId() {
        return this.zza.zzf;
    }

    @oo0oO0
    public String getAdSourceInstanceId() {
        return this.zza.zzh;
    }

    @oo0oO0
    public String getAdSourceInstanceName() {
        return this.zza.zzg;
    }

    @oo0oO0
    public String getAdSourceName() {
        return this.zza.zze;
    }

    @oo0oO0
    public String getAdapterClassName() {
        return this.zza.zza;
    }

    @oo0oO0
    public Bundle getCredentials() {
        return this.zza.zzd;
    }

    public long getLatencyMillis() {
        return this.zza.zzb;
    }

    @oo0oO0
    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    @oo0oO0
    public final JSONObject zzb() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Adapter", this.zza.zza);
        jSONObject.put("Latency", this.zza.zzb);
        String adSourceName = getAdSourceName();
        if (adSourceName == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", adSourceName);
        }
        String adSourceId = getAdSourceId();
        if (adSourceId == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", adSourceId);
        }
        String adSourceInstanceName = getAdSourceInstanceName();
        if (adSourceInstanceName == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", adSourceInstanceName);
        }
        String adSourceInstanceId = getAdSourceInstanceId();
        if (adSourceInstanceId == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", adSourceInstanceId);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.zza.zzd.keySet()) {
            jSONObject2.put(str, this.zza.zzd.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        AdError adError = this.zzb;
        if (adError == null) {
            jSONObject.put("Ad Error", "null");
        } else {
            jSONObject.put("Ad Error", adError.zzb());
        }
        return jSONObject;
    }
}
