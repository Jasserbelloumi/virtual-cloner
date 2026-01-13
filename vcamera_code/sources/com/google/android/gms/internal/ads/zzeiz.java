package com.google.android.gms.internal.ads;

import android.content.Context;
import o00ooo0.o0;
/* loaded from: classes2.dex */
public final class zzeiz implements zzepn {
    private final Context zza;

    public zzeiz(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        zzeja zzejaVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcx)).booleanValue()) {
            zzejaVar = new zzeja(o0.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0);
        } else {
            zzejaVar = null;
        }
        return zzfuj.zzh(zzejaVar);
    }
}
