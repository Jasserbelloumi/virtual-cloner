package com.google.android.gms.ads;

import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class LoadAdError extends AdError {
    @o0OO00OO
    private final ResponseInfo zza;

    public LoadAdError(int i, @oo0oO0 String str, @oo0oO0 String str2, @o0OO00OO AdError adError, @o0OO00OO ResponseInfo responseInfo) {
        super(i, str, str2, adError);
        this.zza = responseInfo;
    }

    @o0OO00OO
    public ResponseInfo getResponseInfo() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.AdError
    @oo0oO0
    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    @Override // com.google.android.gms.ads.AdError
    @oo0oO0
    public final JSONObject zzb() throws JSONException {
        JSONObject zzb = super.zzb();
        ResponseInfo responseInfo = getResponseInfo();
        zzb.put("Response Info", responseInfo == null ? "null" : responseInfo.zzd());
        return zzb;
    }
}
