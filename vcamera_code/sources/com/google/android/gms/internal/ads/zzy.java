package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;
/* loaded from: classes2.dex */
public final class zzy {
    private final SparseBooleanArray zza = new SparseBooleanArray();
    private boolean zzb;

    public final zzy zza(int i) {
        zzdl.zzf(!this.zzb);
        this.zza.append(i, true);
        return this;
    }

    public final zzaa zzb() {
        zzdl.zzf(!this.zzb);
        this.zzb = true;
        return new zzaa(this.zza, null);
    }
}
