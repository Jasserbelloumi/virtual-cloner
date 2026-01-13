package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import o00oOooO.o0o0000;
@o0o0000
/* loaded from: classes2.dex */
public final class zzsm extends zzcn {
    private final zzbg zzc;

    public zzsm(zzbg zzbgVar) {
        this.zzc = zzbgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final int zza(Object obj) {
        return obj == zzsl.zzd ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final zzck zzd(int i, zzck zzckVar, boolean z) {
        zzckVar.zzk(z ? 0 : null, z ? zzsl.zzd : null, 0, C.TIME_UNSET, 0L, zzd.zza, true);
        return zzckVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final zzcm zze(int i, zzcm zzcmVar, long j) {
        zzcmVar.zza(zzcm.zza, this.zzc, null, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, false, true, null, 0L, C.TIME_UNSET, 0, 0, 0L);
        zzcmVar.zzl = true;
        return zzcmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcn
    public final Object zzf(int i) {
        return zzsl.zzd;
    }
}
