package com.google.android.gms.internal.ads;

import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzcqe {
    private final zzcxd zza;
    @o0OO00OO
    private final zzczk zzb;

    public zzcqe(zzcxd zzcxdVar, @o0OO00OO zzczk zzczkVar) {
        this.zza = zzcxdVar;
        this.zzb = zzczkVar;
    }

    public final zzcxd zza() {
        return this.zza;
    }

    @o0OO00OO
    public final zzczk zzb() {
        return this.zzb;
    }

    public final zzdbu zzc() {
        zzczk zzczkVar = this.zzb;
        return zzczkVar != null ? new zzdbu(zzczkVar, zzbzn.zzf) : new zzdbu(new zzcqd(this), zzbzn.zzf);
    }
}
