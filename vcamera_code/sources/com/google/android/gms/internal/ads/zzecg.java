package com.google.android.gms.internal.ads;

import android.content.Context;
/* loaded from: classes2.dex */
public final class zzecg implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzecg(zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    /* renamed from: zza */
    public final zzecf zzb() {
        return new zzecf((Context) this.zza.zzb(), (zzcph) this.zzb.zzb());
    }
}
