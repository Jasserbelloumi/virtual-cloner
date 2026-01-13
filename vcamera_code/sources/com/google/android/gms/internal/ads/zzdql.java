package com.google.android.gms.internal.ads;

import androidx.fragment.app.o0O00;
import o00oOooO.o0OO00OO;
import o00ooOoo.oOo000Oo;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdql {
    @o0OO00OO
    private Long zza;
    private final String zzb;
    @o0OO00OO
    private String zzc;
    @o0OO00OO
    private Integer zzd;
    @o0OO00OO
    private String zze;
    @o0OO00OO
    private Integer zzf;

    public /* synthetic */ zzdql(String str, zzdqk zzdqkVar) {
        this.zzb = str;
    }

    public static /* bridge */ /* synthetic */ String zza(zzdql zzdqlVar) {
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziR);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdqlVar.zza);
            jSONObject.put("eventCategory", zzdqlVar.zzb);
            jSONObject.putOpt(oOo000Oo.f9217o0O00o0o, zzdqlVar.zzc);
            jSONObject.putOpt("errorCode", zzdqlVar.zzd);
            jSONObject.putOpt("rewardType", zzdqlVar.zze);
            jSONObject.putOpt("rewardAmount", zzdqlVar.zzf);
        } catch (JSONException unused) {
            zzbza.zzj("Could not convert parameters to JSON.");
        }
        return o0O00.o00oOOo0(str, "(\"h5adsEvent\",", jSONObject.toString(), ");");
    }
}
