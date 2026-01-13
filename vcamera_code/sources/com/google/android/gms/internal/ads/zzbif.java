package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
/* loaded from: classes2.dex */
public final class zzbif implements zzbhp {
    private final zzbie zza;

    public zzbif(zzbie zzbieVar) {
        this.zza = zzbieVar;
    }

    public static void zzb(zzcei zzceiVar, zzbie zzbieVar) {
        zzceiVar.zzad("/reward", new zzbif(zzbieVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.zza.zzc();
                return;
            } else if ("video_complete".equals(str)) {
                this.zza.zzb();
                return;
            } else {
                return;
            }
        }
        zzbup zzbupVar = null;
        try {
            int parseInt = Integer.parseInt((String) map.get("amount"));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzbupVar = new zzbup(str2, parseInt);
            }
        } catch (NumberFormatException e) {
            zzbza.zzk("Unable to parse reward amount.", e);
        }
        this.zza.zza(zzbupVar);
    }
}
