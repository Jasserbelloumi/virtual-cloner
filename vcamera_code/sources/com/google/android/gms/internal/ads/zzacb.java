package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Collections;
/* loaded from: classes2.dex */
final class zzacb extends zzacg {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzacb(zzabb zzabbVar) {
        super(zzabbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacg
    public final boolean zza(zzen zzenVar) throws zzacf {
        zzaf zzY;
        if (this.zzc) {
            zzenVar.zzG(1);
        } else {
            int zzk = zzenVar.zzk();
            int i = zzk >> 4;
            this.zze = i;
            if (i == 2) {
                int i2 = zzb[(zzk >> 2) & 3];
                zzad zzadVar = new zzad();
                zzadVar.zzS(MimeTypes.AUDIO_MPEG);
                zzadVar.zzw(1);
                zzadVar.zzT(i2);
                zzY = zzadVar.zzY();
            } else if (i == 7 || i == 8) {
                zzad zzadVar2 = new zzad();
                zzadVar2.zzS(i == 7 ? MimeTypes.AUDIO_ALAW : MimeTypes.AUDIO_MLAW);
                zzadVar2.zzw(1);
                zzadVar2.zzT(8000);
                zzY = zzadVar2.zzY();
            } else {
                if (i != 10) {
                    throw new zzacf(android.support.v4.media.o00oOOo0.o00oOOo0("Audio format not supported: ", i));
                }
                this.zzc = true;
            }
            this.zza.zzk(zzY);
            this.zzd = true;
            this.zzc = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzacg
    public final boolean zzb(zzen zzenVar, long j) throws zzbu {
        if (this.zze == 2) {
            int zza = zzenVar.zza();
            this.zza.zzq(zzenVar, zza);
            this.zza.zzs(j, 1, zza, 0, null);
            return true;
        }
        int zzk = zzenVar.zzk();
        if (zzk != 0 || this.zzd) {
            if (this.zze != 10 || zzk == 1) {
                int zza2 = zzenVar.zza();
                this.zza.zzq(zzenVar, zza2);
                this.zza.zzs(j, 1, zza2, 0, null);
                return true;
            }
            return false;
        }
        int zza3 = zzenVar.zza();
        byte[] bArr = new byte[zza3];
        zzenVar.zzB(bArr, 0, zza3);
        zzyr zza4 = zzys.zza(bArr);
        zzad zzadVar = new zzad();
        zzadVar.zzS(MimeTypes.AUDIO_AAC);
        zzadVar.zzx(zza4.zzc);
        zzadVar.zzw(zza4.zzb);
        zzadVar.zzT(zza4.zza);
        zzadVar.zzI(Collections.singletonList(bArr));
        this.zza.zzk(zzadVar.zzY());
        this.zzd = true;
        return false;
    }
}
