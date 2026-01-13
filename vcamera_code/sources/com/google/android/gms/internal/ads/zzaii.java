package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import java.io.IOException;
/* loaded from: classes2.dex */
final class zzaii {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzeu zza = new zzeu(0);
    private long zzf = C.TIME_UNSET;
    private long zzg = C.TIME_UNSET;
    private long zzh = C.TIME_UNSET;
    private final zzen zzb = new zzen();

    public static long zzc(zzen zzenVar) {
        int zzc = zzenVar.zzc();
        if (zzenVar.zza() < 9) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        zzenVar.zzB(bArr, 0, 9);
        zzenVar.zzF(zzc);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((255 & bArr[3]) << 5) | ((b3 & 248) >> 3);
                }
            }
        }
        return C.TIME_UNSET;
    }

    private final int zzf(zzzv zzzvVar) {
        zzen zzenVar = this.zzb;
        byte[] bArr = zzew.zzf;
        int length = bArr.length;
        zzenVar.zzD(bArr, 0);
        this.zzc = true;
        zzzvVar.zzj();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final int zza(zzzv zzzvVar, zzaau zzaauVar) throws IOException {
        boolean z = this.zze;
        long j = C.TIME_UNSET;
        if (!z) {
            long zzd = zzzvVar.zzd();
            int min = (int) Math.min((long) SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US, zzd);
            long j2 = zzd - min;
            if (zzzvVar.zzf() != j2) {
                zzaauVar.zza = j2;
                return 1;
            }
            this.zzb.zzC(min);
            zzzvVar.zzj();
            ((zzzk) zzzvVar).zzm(this.zzb.zzH(), 0, min, false);
            zzen zzenVar = this.zzb;
            int zzc = zzenVar.zzc();
            int zzd2 = zzenVar.zzd() - 4;
            while (true) {
                if (zzd2 < zzc) {
                    break;
                }
                if (zzg(zzenVar.zzH(), zzd2) == 442) {
                    zzenVar.zzF(zzd2 + 4);
                    long zzc2 = zzc(zzenVar);
                    if (zzc2 != C.TIME_UNSET) {
                        j = zzc2;
                        break;
                    }
                }
                zzd2--;
            }
            this.zzg = j;
            this.zze = true;
            return 0;
        } else if (this.zzg == C.TIME_UNSET) {
            zzf(zzzvVar);
            return 0;
        } else if (this.zzd) {
            long j3 = this.zzf;
            if (j3 == C.TIME_UNSET) {
                zzf(zzzvVar);
                return 0;
            }
            long zzb = this.zza.zzb(this.zzg) - this.zza.zzb(j3);
            this.zzh = zzb;
            if (zzb < 0) {
                zzee.zze("PsDurationReader", "Invalid duration: " + zzb + ". Using TIME_UNSET instead.");
                this.zzh = C.TIME_UNSET;
            }
            zzf(zzzvVar);
            return 0;
        } else {
            int min2 = (int) Math.min((long) SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US, zzzvVar.zzd());
            if (zzzvVar.zzf() != 0) {
                zzaauVar.zza = 0L;
                return 1;
            }
            this.zzb.zzC(min2);
            zzzvVar.zzj();
            ((zzzk) zzzvVar).zzm(this.zzb.zzH(), 0, min2, false);
            zzen zzenVar2 = this.zzb;
            int zzc3 = zzenVar2.zzc();
            int zzd3 = zzenVar2.zzd();
            while (true) {
                if (zzc3 >= zzd3 - 3) {
                    break;
                }
                if (zzg(zzenVar2.zzH(), zzc3) == 442) {
                    zzenVar2.zzF(zzc3 + 4);
                    long zzc4 = zzc(zzenVar2);
                    if (zzc4 != C.TIME_UNSET) {
                        j = zzc4;
                        break;
                    }
                }
                zzc3++;
            }
            this.zzf = j;
            this.zzd = true;
            return 0;
        }
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzeu zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }
}
