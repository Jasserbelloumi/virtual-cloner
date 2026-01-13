package com.google.android.gms.internal.ads;

import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
final class zzafg implements zzafe {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    @o0OO00OO
    private final long[] zzf;

    private zzafg(long j, int i, long j2, long j3, @o0OO00OO long[] jArr) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
        this.zzf = jArr;
        this.zzd = j3;
        this.zze = j3 != -1 ? j + j3 : -1L;
    }

    @o0OO00OO
    public static zzafg zza(long j, long j2, zzaan zzaanVar, zzen zzenVar) {
        int zzn;
        int i = zzaanVar.zzg;
        int i2 = zzaanVar.zzd;
        int zze = zzenVar.zze();
        if ((zze & 1) != 1 || (zzn = zzenVar.zzn()) == 0) {
            return null;
        }
        int i3 = zze & 6;
        long zzw = zzew.zzw(zzn, i * 1000000, i2);
        if (i3 != 6) {
            return new zzafg(j2, zzaanVar.zzc, zzw, -1L, null);
        }
        long zzs = zzenVar.zzs();
        long[] jArr = new long[100];
        for (int i4 = 0; i4 < 100; i4++) {
            jArr[i4] = zzenVar.zzk();
        }
        if (j != -1) {
            long j3 = j2 + zzs;
            if (j != j3) {
                StringBuilder o00oOOo02 = androidx.concurrent.futures.o00oOOo0.o00oOOo0("XING data size mismatch: ", j, ", ");
                o00oOOo02.append(j3);
                zzee.zze("XingSeeker", o00oOOo02.toString());
            }
        }
        return new zzafg(j2, zzaanVar.zzc, zzw, zzs, jArr);
    }

    private final long zzd(int i) {
        return (this.zzc * i) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final long zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzafe
    public final long zzc(long j) {
        long j2 = j - this.zza;
        if (!zzh() || j2 <= this.zzb) {
            return 0L;
        }
        long[] jArr = (long[]) zzdl.zzb(this.zzf);
        double d = (j2 * 256.0d) / this.zzd;
        int zzd = zzew.zzd(jArr, (long) d, true, true);
        long zzd2 = zzd(zzd);
        long j3 = jArr[zzd];
        int i = zzd + 1;
        long zzd3 = zzd(i);
        long j4 = zzd == 99 ? 256L : jArr[i];
        return Math.round((j3 == j4 ? 0.0d : (d - j3) / (j4 - j3)) * (zzd3 - zzd2)) + zzd2;
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final zzaav zzg(long j) {
        long[] jArr;
        if (!zzh()) {
            zzaay zzaayVar = new zzaay(0L, this.zza + this.zzb);
            return new zzaav(zzaayVar, zzaayVar);
        }
        long zzr = zzew.zzr(j, 0L, this.zzc);
        double d = (zzr * 100.0d) / this.zzc;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                double d3 = ((long[]) zzdl.zzb(this.zzf))[i];
                d2 = (((i == 99 ? 256.0d : jArr[i + 1]) - d3) * (d - i)) + d3;
            }
        }
        zzaay zzaayVar2 = new zzaay(zzr, this.zza + zzew.zzr(Math.round((d2 / 256.0d) * this.zzd), this.zzb, this.zzd - 1));
        return new zzaav(zzaayVar2, zzaayVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final boolean zzh() {
        return this.zzf != null;
    }
}
