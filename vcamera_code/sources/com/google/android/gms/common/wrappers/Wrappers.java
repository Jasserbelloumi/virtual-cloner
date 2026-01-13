package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public class Wrappers {
    private static Wrappers zza = new Wrappers();
    @o0OO00OO
    private PackageManagerWrapper zzb = null;

    @oo0oO0
    @KeepForSdk
    public static PackageManagerWrapper packageManager(@oo0oO0 Context context) {
        return zza.zza(context);
    }

    @VisibleForTesting
    @oo0oO0
    public final synchronized PackageManagerWrapper zza(@oo0oO0 Context context) {
        if (this.zzb == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.zzb = new PackageManagerWrapper(context);
        }
        return this.zzb;
    }
}
