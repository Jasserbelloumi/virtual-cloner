package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public class InstantApps {
    private static Context zza;
    @o0OO00OO
    private static Boolean zzb;

    @KeepForSdk
    public static synchronized boolean isInstantApp(@oo0oO0 Context context) {
        Boolean bool;
        Boolean bool2;
        synchronized (InstantApps.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = zza;
            if (context2 != null && (bool2 = zzb) != null && context2 == applicationContext) {
                return bool2.booleanValue();
            }
            zzb = null;
            if (!PlatformVersion.isAtLeastO()) {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    zzb = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    bool = Boolean.FALSE;
                }
                zza = applicationContext;
                return zzb.booleanValue();
            }
            bool = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            zzb = bool;
            zza = applicationContext;
            return zzb.booleanValue();
        }
    }
}
