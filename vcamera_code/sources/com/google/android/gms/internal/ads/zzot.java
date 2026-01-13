package com.google.android.gms.internal.ads;

import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzot {
    @o0OO00OO
    private zzov zzc;
    private zznq zzb = zznq.zza;
    public final zzos zza = zzos.zza;

    public final zzot zzb(zznq zznqVar) {
        this.zzb = zznqVar;
        return this;
    }

    public final zzot zzc(zzde[] zzdeVarArr) {
        this.zzc = new zzov(zzdeVarArr);
        return this;
    }

    public final zzpf zzd() {
        if (this.zzc == null) {
            this.zzc = new zzov(new zzde[0]);
        }
        return new zzpf(this, null);
    }
}
