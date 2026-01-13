package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbnc;
import com.google.android.gms.internal.ads.zzbza;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public class AdService extends IntentService {
    @oo0oO0
    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdService";

    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(@oo0oO0 Intent intent) {
        try {
            zzay.zza().zzm(this, new zzbnc()).zze(intent);
        } catch (RemoteException e) {
            zzbza.zzg("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }
}
