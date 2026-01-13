package com.google.android.gms.ads.identifier;

import android.net.Uri;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zza extends Thread {
    public final /* synthetic */ Map zza;

    public zza(AdvertisingIdClient advertisingIdClient, Map map) {
        this.zza = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.zza;
        Uri.Builder buildUpon = Uri.parse("=").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        zzc.zza(buildUpon.build().toString());
    }
}
