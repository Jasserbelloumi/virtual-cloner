package com.google.android.gms.internal.ads;

import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzagg {
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final zzaf zzf;
    public final int zzg;
    @o0OO00OO
    public final long[] zzh;
    @o0OO00OO
    public final long[] zzi;
    public final int zzj;
    @o0OO00OO
    private final zzagh[] zzk;

    public zzagg(int i, int i2, long j, long j2, long j3, zzaf zzafVar, int i3, @o0OO00OO zzagh[] zzaghVarArr, int i4, @o0OO00OO long[] jArr, @o0OO00OO long[] jArr2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = j3;
        this.zzf = zzafVar;
        this.zzg = i3;
        this.zzk = zzaghVarArr;
        this.zzj = i4;
        this.zzh = jArr;
        this.zzi = jArr2;
    }

    @o0OO00OO
    public final zzagh zza(int i) {
        zzagh[] zzaghVarArr = this.zzk;
        if (zzaghVarArr == null) {
            return null;
        }
        return zzaghVarArr[i];
    }
}
