package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import com.google.android.exoplayer2.extractor.mp3.IndexSeeker;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaig implements zzzf {
    private final zzeu zza;
    private final zzen zzb = new zzen();

    public /* synthetic */ zzaig(zzeu zzeuVar, zzaif zzaifVar) {
        this.zza = zzeuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final zzze zza(zzzv zzzvVar, long j) throws IOException {
        int zzh;
        long j2;
        long zzf = zzzvVar.zzf();
        int min = (int) Math.min((long) SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US, zzzvVar.zzd() - zzf);
        this.zzb.zzC(min);
        ((zzzk) zzzvVar).zzm(this.zzb.zzH(), 0, min, false);
        zzen zzenVar = this.zzb;
        int i = -1;
        int i2 = -1;
        long j3 = -9223372036854775807L;
        while (zzenVar.zza() >= 4) {
            if (zzaih.zzh(zzenVar.zzH(), zzenVar.zzc()) != 442) {
                zzenVar.zzG(1);
            } else {
                zzenVar.zzG(4);
                long zzc = zzaii.zzc(zzenVar);
                if (zzc != C.TIME_UNSET) {
                    long zzb = this.zza.zzb(zzc);
                    if (zzb > j) {
                        if (j3 == C.TIME_UNSET) {
                            return zzze.zzd(zzb, zzf);
                        }
                        j2 = i2;
                    } else if (IndexSeeker.MIN_TIME_BETWEEN_POINTS_US + zzb > j) {
                        j2 = zzenVar.zzc();
                    } else {
                        i2 = zzenVar.zzc();
                        j3 = zzb;
                    }
                    return zzze.zze(zzf + j2);
                }
                int zzd = zzenVar.zzd();
                if (zzenVar.zza() >= 10) {
                    zzenVar.zzG(9);
                    int zzk = zzenVar.zzk() & 7;
                    if (zzenVar.zza() >= zzk) {
                        zzenVar.zzG(zzk);
                        if (zzenVar.zza() >= 4) {
                            if (zzaih.zzh(zzenVar.zzH(), zzenVar.zzc()) == 443) {
                                zzenVar.zzG(4);
                                int zzo = zzenVar.zzo();
                                if (zzenVar.zza() >= zzo) {
                                    zzenVar.zzG(zzo);
                                }
                            }
                            while (zzenVar.zza() >= 4 && (zzh = zzaih.zzh(zzenVar.zzH(), zzenVar.zzc())) != 442 && zzh != 441 && (zzh >>> 8) == 1) {
                                zzenVar.zzG(4);
                                if (zzenVar.zza() >= 2) {
                                    zzenVar.zzF(Math.min(zzenVar.zzd(), zzenVar.zzc() + zzenVar.zzo()));
                                }
                            }
                            i = zzenVar.zzc();
                        }
                    }
                }
                zzenVar.zzF(zzd);
                i = zzenVar.zzc();
            }
        }
        return j3 != C.TIME_UNSET ? zzze.zzf(j3, zzf + i) : zzze.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzb() {
        zzen zzenVar = this.zzb;
        byte[] bArr = zzew.zzf;
        int length = bArr.length;
        zzenVar.zzD(bArr, 0);
    }
}
