package com.google.android.gms.ads;

import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class AdError {
    @oo0oO0
    public static final String UNDEFINED_DOMAIN = "undefined";
    private final int zza;
    @oo0oO0
    private final String zzb;
    @oo0oO0
    private final String zzc;
    @o0OO00OO
    private final AdError zzd;

    public AdError(int i, @oo0oO0 String str, @oo0oO0 String str2) {
        this(i, str, str2, null);
    }

    public AdError(int i, @oo0oO0 String str, @oo0oO0 String str2, @o0OO00OO AdError adError) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = adError;
    }

    @o0OO00OO
    public AdError getCause() {
        return this.zzd;
    }

    public int getCode() {
        return this.zza;
    }

    @oo0oO0
    public String getDomain() {
        return this.zzc;
    }

    @oo0oO0
    public String getMessage() {
        return this.zzb;
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
    public final com.google.android.gms.ads.internal.client.zze zza() {
        com.google.android.gms.ads.internal.client.zze zzeVar;
        if (this.zzd == null) {
            zzeVar = null;
        } else {
            AdError adError = this.zzd;
            zzeVar = new com.google.android.gms.ads.internal.client.zze(adError.zza, adError.zzb, adError.zzc, null, null);
        }
        return new com.google.android.gms.ads.internal.client.zze(this.zza, this.zzb, this.zzc, zzeVar, null);
    }

    @oo0oO0
    public JSONObject zzb() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.zza);
        jSONObject.put("Message", this.zzb);
        jSONObject.put("Domain", this.zzc);
        AdError adError = this.zzd;
        jSONObject.put("Cause", adError == null ? "null" : adError.zzb());
        return jSONObject;
    }
}
