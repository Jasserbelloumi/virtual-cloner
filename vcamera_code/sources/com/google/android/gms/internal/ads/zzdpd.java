package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o00oOooO.o0OO00OO;
import o0O000.o00oo0OO;
@Deprecated
/* loaded from: classes2.dex */
public final class zzdpd {
    private final ConcurrentHashMap zza;
    private final zzbyn zzb;
    private final zzeyx zzc;
    private final String zzd;
    private final String zze;

    public zzdpd(zzdpn zzdpnVar, zzbyn zzbynVar, zzeyx zzeyxVar, String str, String str2) {
        ConcurrentHashMap zzc = zzdpnVar.zzc();
        this.zza = zzc;
        this.zzb = zzbynVar;
        this.zzc = zzeyxVar;
        this.zzd = str;
        this.zze = str2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgC)).booleanValue()) {
            int zze = com.google.android.gms.ads.nonagon.signalgeneration.zzf.zze(zzeyxVar);
            int i = zze - 1;
            if (i == 0) {
                zzc.put("scar", "false");
                return;
            }
            zzc.put("se", i != 1 ? i != 2 ? i != 3 ? "r_both" : "r_adstring" : "r_adinfo" : "query_g");
            zzc.put("scar", "true");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhb)).booleanValue()) {
                zzc.put(FirebaseAnalytics.Param.AD_FORMAT, str2);
            }
            if (zze == 2) {
                zzc.put("rid", str);
            }
            zzd("ragent", zzeyxVar.zzd.zzp);
            zzd("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzf.zza(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(zzeyxVar.zzd)));
        }
    }

    private final void zzd(String str, @o0OO00OO String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.put(str, str2);
    }

    public final Map zza() {
        return this.zza;
    }

    public final void zzb(zzeyo zzeyoVar) {
        ConcurrentHashMap concurrentHashMap;
        String str;
        if (zzeyoVar.zzb.zza.size() > 0) {
            switch (((zzeyc) zzeyoVar.zzb.zza.get(0)).zzb) {
                case 1:
                    concurrentHashMap = this.zza;
                    str = "banner";
                    concurrentHashMap.put(FirebaseAnalytics.Param.AD_FORMAT, str);
                    break;
                case 2:
                    concurrentHashMap = this.zza;
                    str = "interstitial";
                    concurrentHashMap.put(FirebaseAnalytics.Param.AD_FORMAT, str);
                    break;
                case 3:
                    concurrentHashMap = this.zza;
                    str = "native_express";
                    concurrentHashMap.put(FirebaseAnalytics.Param.AD_FORMAT, str);
                    break;
                case 4:
                    concurrentHashMap = this.zza;
                    str = "native_advanced";
                    concurrentHashMap.put(FirebaseAnalytics.Param.AD_FORMAT, str);
                    break;
                case 5:
                    concurrentHashMap = this.zza;
                    str = "rewarded";
                    concurrentHashMap.put(FirebaseAnalytics.Param.AD_FORMAT, str);
                    break;
                case 6:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
                    this.zza.put("as", true != this.zzb.zzj() ? SessionDescription.SUPPORTED_SDP_VERSION : "1");
                    break;
                default:
                    concurrentHashMap = this.zza;
                    str = o00oo0OO.f10107o00oOOoO;
                    concurrentHashMap.put(FirebaseAnalytics.Param.AD_FORMAT, str);
                    break;
            }
        }
        zzd("gqi", zzeyoVar.zzb.zzb.zzb);
    }

    public final void zzc(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
