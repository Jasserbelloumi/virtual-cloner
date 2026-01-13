package com.google.android.gms.internal.ads;

import java.util.Map;
import o0ooOoOO.oO0OoOO0;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final /* synthetic */ class zzbkj {
    public static void zza(zzbkk zzbkkVar, String str, Map map) {
        try {
            zzbkkVar.zze(str, com.google.android.gms.ads.internal.client.zzay.zzb().zzj(map));
        } catch (JSONException unused) {
            zzbza.zzj("Could not convert parameters to JSON.");
        }
    }

    public static void zzb(zzbkk zzbkkVar, String str, JSONObject jSONObject) {
        StringBuilder o00oOOo02 = oO0OoOO0.o00oOOo0("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        zzbza.zze("Dispatching AFMA event: ".concat(o00oOOo02.toString()));
        zzbkkVar.zza(o00oOOo02.toString());
    }

    public static void zzc(zzbkk zzbkkVar, String str, String str2) {
        zzbkkVar.zza(str + "(" + str2 + ");");
    }

    public static void zzd(zzbkk zzbkkVar, String str, JSONObject jSONObject) {
        zzbkkVar.zzb(str, jSONObject.toString());
    }
}
