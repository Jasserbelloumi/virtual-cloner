package com.google.android.gms.internal.ads;

import android.content.Context;
/* loaded from: classes2.dex */
public final class zzezr {
    public static void zza(Context context, boolean z) {
        String str;
        if (z) {
            str = "This request is sent from a test device.";
        } else {
            com.google.android.gms.ads.internal.client.zzay.zzb();
            str = "Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + zzbyt.zzz(context) + "\")) to get test ads on this device.";
        }
        zzbza.zzi(str);
    }

    public static void zzb(int i, Throwable th, String str) {
        zzbza.zzi("Ad failed to load : " + i);
        com.google.android.gms.ads.internal.util.zze.zzb(str, th);
        if (i == 3) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzo().zzt(th, str);
    }
}
