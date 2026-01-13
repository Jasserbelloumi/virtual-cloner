package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ShowFirstParty;
import o00oOooO.oo0oO0;
@ShowFirstParty
/* loaded from: classes2.dex */
public final class zzfia {
    private final Context zza;
    private final Looper zzb;

    public zzfia(@oo0oO0 Context context, @oo0oO0 Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(@oo0oO0 String str) {
        zzfio zza = zzfiq.zza();
        zza.zza(this.zza.getPackageName());
        zza.zzc(2);
        zzfil zza2 = zzfim.zza();
        zza2.zza(str);
        zza2.zzb(2);
        zza.zzb(zza2);
        new zzfib(this.zza, this.zzb, (zzfiq) zza.zzal()).zza();
    }
}
