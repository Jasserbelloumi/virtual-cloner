package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzbco;
import com.google.android.gms.internal.ads.zzbza;
/* loaded from: classes.dex */
public final class zze extends zzbza {
    public static void zza(String str) {
        if (!zzc() || str == null || str.length() <= 4000) {
            return;
        }
        for (String str2 : zzbza.zza.zzd(str)) {
        }
    }

    public static void zzb(String str, Throwable th) {
        zzc();
    }

    public static boolean zzc() {
        return zzbza.zzm(2) && ((Boolean) zzbco.zza.zze()).booleanValue();
    }
}
