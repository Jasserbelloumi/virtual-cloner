package com.google.android.gms.internal.ads;

import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
final class zzaff implements zzafe {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;

    private zzaff(long[] jArr, long[] jArr2, long j, long j2) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j2;
    }

    @o0OO00OO
    public static zzaff zza(long j, long j2, zzaan zzaanVar, zzen zzenVar) {
        int zzk;
        zzenVar.zzG(10);
        int zze = zzenVar.zze();
        if (zze <= 0) {
            return null;
        }
        int i = zzaanVar.zzd;
        long zzw = zzew.zzw(zze, (i >= 32000 ? 1152 : 576) * 1000000, i);
        int zzo = zzenVar.zzo();
        int zzo2 = zzenVar.zzo();
        int zzo3 = zzenVar.zzo();
        zzenVar.zzG(2);
        long j3 = j2 + zzaanVar.zzc;
        long[] jArr = new long[zzo];
        long[] jArr2 = new long[zzo];
        int i2 = 0;
        long j4 = j2;
        while (i2 < zzo) {
            long j5 = zzw;
            jArr[i2] = (i2 * zzw) / zzo;
            jArr2[i2] = Math.max(j4, j3);
            if (zzo3 == 1) {
                zzk = zzenVar.zzk();
            } else if (zzo3 == 2) {
                zzk = zzenVar.zzo();
            } else if (zzo3 == 3) {
                zzk = zzenVar.zzm();
            } else if (zzo3 != 4) {
                return null;
            } else {
                zzk = zzenVar.zzn();
            }
            j4 += zzk * zzo2;
            i2++;
            zzw = j5;
        }
        long j6 = zzw;
        if (j != -1 && j != j4) {
            StringBuilder o00oOOo02 = androidx.concurrent.futures.o00oOOo0.o00oOOo0("VBRI data size mismatch: ", j, ", ");
            o00oOOo02.append(j4);
            zzee.zze("VbriSeeker", o00oOOo02.toString());
        }
        return new zzaff(jArr, jArr2, j6, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final long zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final long zzc(long j) {
        return this.zza[zzew.zzd(this.zzb, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final zzaav zzg(long j) {
        int zzd = zzew.zzd(this.zza, j, true, true);
        zzaay zzaayVar = new zzaay(this.zza[zzd], this.zzb[zzd]);
        if (zzaayVar.zzb < j) {
            long[] jArr = this.zza;
            if (zzd != jArr.length - 1) {
                int i = zzd + 1;
                return new zzaav(zzaayVar, new zzaay(jArr[i], this.zzb[i]));
            }
        }
        return new zzaav(zzaayVar, zzaayVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final boolean zzh() {
        return true;
    }
}
