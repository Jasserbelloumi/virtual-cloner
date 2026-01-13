package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Map;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O000.o00oo0OO;
/* loaded from: classes2.dex */
public final class zzfdj {
    private final HashMap zza;
    private final zzfdp zzb;

    private zzfdj() {
        HashMap hashMap = new HashMap();
        this.zza = hashMap;
        this.zzb = new zzfdp(com.google.android.gms.ads.internal.zzt.zzB());
        hashMap.put("new_csi", "1");
    }

    public static zzfdj zzb(String str) {
        zzfdj zzfdjVar = new zzfdj();
        zzfdjVar.zza.put("action", str);
        return zzfdjVar;
    }

    public static zzfdj zzc(String str) {
        zzfdj zzfdjVar = new zzfdj();
        zzfdjVar.zza.put("request_id", str);
        return zzfdjVar;
    }

    public final zzfdj zza(@oo0oO0 String str, @oo0oO0 String str2) {
        this.zza.put(str, str2);
        return this;
    }

    public final zzfdj zzd(@oo0oO0 String str) {
        this.zzb.zzb(str);
        return this;
    }

    public final zzfdj zze(@oo0oO0 String str, @oo0oO0 String str2) {
        this.zzb.zzc(str, str2);
        return this;
    }

    public final zzfdj zzf(zzeyc zzeycVar) {
        this.zza.put("aai", zzeycVar.zzx);
        return this;
    }

    public final zzfdj zzg(zzeyf zzeyfVar) {
        if (!TextUtils.isEmpty(zzeyfVar.zzb)) {
            this.zza.put("gqi", zzeyfVar.zzb);
        }
        return this;
    }

    public final zzfdj zzh(zzeyo zzeyoVar, @o0OO00OO zzbyn zzbynVar) {
        HashMap hashMap;
        String str;
        zzeyn zzeynVar = zzeyoVar.zzb;
        zzg(zzeynVar.zzb);
        if (!zzeynVar.zza.isEmpty()) {
            int i = ((zzeyc) zzeynVar.zza.get(0)).zzb;
            String str2 = FirebaseAnalytics.Param.AD_FORMAT;
            switch (i) {
                case 1:
                    hashMap = this.zza;
                    str = "banner";
                    hashMap.put(str2, str);
                    break;
                case 2:
                    hashMap = this.zza;
                    str = "interstitial";
                    hashMap.put(str2, str);
                    break;
                case 3:
                    hashMap = this.zza;
                    str = "native_express";
                    hashMap.put(str2, str);
                    break;
                case 4:
                    hashMap = this.zza;
                    str = "native_advanced";
                    hashMap.put(str2, str);
                    break;
                case 5:
                    hashMap = this.zza;
                    str = "rewarded";
                    hashMap.put(str2, str);
                    break;
                case 6:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
                    if (zzbynVar != null) {
                        hashMap = this.zza;
                        str = true != zzbynVar.zzj() ? SessionDescription.SUPPORTED_SDP_VERSION : "1";
                        str2 = "as";
                        hashMap.put(str2, str);
                        break;
                    }
                    break;
                default:
                    hashMap = this.zza;
                    str = o00oo0OO.f10107o00oOOoO;
                    hashMap.put(str2, str);
                    break;
            }
        }
        return this;
    }

    public final zzfdj zzi(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    public final Map zzj() {
        HashMap hashMap = new HashMap(this.zza);
        for (zzfdo zzfdoVar : this.zzb.zza()) {
            hashMap.put(zzfdoVar.zza, zzfdoVar.zzb);
        }
        return hashMap;
    }
}
