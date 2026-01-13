package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import o00oOooO.o0OO00OO;
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzblw {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    @GuardedBy("lockClient")
    private zzbmf zzc;
    @GuardedBy("lockService")
    private zzbmf zzd;

    private static final Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final zzbmf zza(Context context, zzbzg zzbzgVar, @o0OO00OO zzfep zzfepVar) {
        zzbmf zzbmfVar;
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = new zzbmf(zzc(context), zzbzgVar, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zza), zzfepVar);
            }
            zzbmfVar = this.zzc;
        }
        return zzbmfVar;
    }

    public final zzbmf zzb(Context context, zzbzg zzbzgVar, zzfep zzfepVar) {
        zzbmf zzbmfVar;
        synchronized (this.zzb) {
            if (this.zzd == null) {
                this.zzd = new zzbmf(zzc(context), zzbzgVar, (String) zzbcu.zzb.zze(), zzfepVar);
            }
            zzbmfVar = this.zzd;
        }
        return zzbmfVar;
    }
}
