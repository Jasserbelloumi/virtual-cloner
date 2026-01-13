package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
/* loaded from: classes2.dex */
public final class zzdfn implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzdfn(zzgxl zzgxlVar, zzgxl zzgxlVar2) {
        this.zza = zzgxlVar;
        this.zzb = zzgxlVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdbw((Context) this.zza.zzb(), new HashSet(), ((zzcrc) this.zzb).zza());
    }
}
