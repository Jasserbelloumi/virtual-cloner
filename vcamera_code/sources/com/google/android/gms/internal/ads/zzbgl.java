package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.preference.o0O000;
import java.util.Map;
import o00ooOoo.oO0O0O0;
import o00ooOoo.oOo000Oo;
/* loaded from: classes2.dex */
public final class zzbgl implements zzbhp {
    @Override // com.google.android.gms.internal.ads.zzbhp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcei zzceiVar = (zzcei) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get(oO0O0O0.f9051o00oOoo0);
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get(oOo000Oo.o00oo0OO.f9386o00oo0O0);
            if (TextUtils.isEmpty(str2)) {
                zzbza.zzj("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                zzbza.zzj("No timestamp given for CSI tick.");
            } else {
                try {
                    long parseLong = (Long.parseLong(str4) - com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()) + com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                    if (true == TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    zzceiVar.zzm().zzc(str2, str3, parseLong);
                } catch (NumberFormatException e) {
                    zzbza.zzk("Malformed timestamp for CSI tick.", e);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                zzbza.zzj("No value given for CSI experiment.");
            } else {
                zzceiVar.zzm().zza().zzd("e", str5);
            }
        } else if (o0O000.f3924o00oOoO.equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                zzbza.zzj("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                zzbza.zzj("No name given for CSI extra.");
            } else {
                zzceiVar.zzm().zza().zzd(str6, str7);
            }
        }
    }
}
