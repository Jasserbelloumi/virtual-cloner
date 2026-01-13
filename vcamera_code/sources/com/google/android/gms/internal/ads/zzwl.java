package com.google.android.gms.internal.ads;

import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzwl {
    public final int zza;
    public final zzkp[] zzb;
    public final zzwe[] zzc;
    public final zzcy zzd;
    @o0OO00OO
    public final Object zze;

    public zzwl(zzkp[] zzkpVarArr, zzwe[] zzweVarArr, zzcy zzcyVar, @o0OO00OO Object obj) {
        this.zzb = zzkpVarArr;
        this.zzc = (zzwe[]) zzweVarArr.clone();
        this.zzd = zzcyVar;
        this.zze = obj;
        this.zza = zzkpVarArr.length;
    }

    public final boolean zza(@o0OO00OO zzwl zzwlVar, int i) {
        return zzwlVar != null && zzew.zzU(this.zzb[i], zzwlVar.zzb[i]) && zzew.zzU(this.zzc[i], zzwlVar.zzc[i]);
    }

    public final boolean zzb(int i) {
        return this.zzb[i] != null;
    }
}
