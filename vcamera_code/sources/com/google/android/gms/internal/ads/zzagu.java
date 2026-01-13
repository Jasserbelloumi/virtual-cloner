package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* loaded from: classes2.dex */
final class zzagu extends zzagy {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    public static boolean zzd(zzen zzenVar) {
        return zzk(zzenVar, zza);
    }

    private static boolean zzk(zzen zzenVar, byte[] bArr) {
        if (zzenVar.zza() < 8) {
            return false;
        }
        int zzc = zzenVar.zzc();
        byte[] bArr2 = new byte[8];
        zzenVar.zzB(bArr2, 0, 8);
        zzenVar.zzF(zzc);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzagy
    public final long zza(zzen zzenVar) {
        return zzg(zzaas.zzb(zzenVar.zzH()));
    }

    @Override // com.google.android.gms.internal.ads.zzagy
    public final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagy
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean zzc(zzen zzenVar, long j, zzagv zzagvVar) throws zzbu {
        zzaf zzY;
        if (zzk(zzenVar, zza)) {
            byte[] copyOf = Arrays.copyOf(zzenVar.zzH(), zzenVar.zzd());
            int i = copyOf[9] & 255;
            List zzc = zzaas.zzc(copyOf);
            if (zzagvVar.zza != null) {
                return true;
            }
            zzad zzadVar = new zzad();
            zzadVar.zzS(MimeTypes.AUDIO_OPUS);
            zzadVar.zzw(i);
            zzadVar.zzT(OpusUtil.SAMPLE_RATE);
            zzadVar.zzI(zzc);
            zzY = zzadVar.zzY();
        } else if (!zzk(zzenVar, zzb)) {
            zzdl.zzb(zzagvVar.zza);
            return false;
        } else {
            zzdl.zzb(zzagvVar.zza);
            if (this.zzc) {
                return true;
            }
            this.zzc = true;
            zzenVar.zzG(8);
            zzbq zzb2 = zzabh.zzb(zzfqk.zzn(zzabh.zzc(zzenVar, false, false).zzb));
            if (zzb2 == null) {
                return true;
            }
            zzad zzb3 = zzagvVar.zza.zzb();
            zzb3.zzM(zzb2.zzd(zzagvVar.zza.zzk));
            zzY = zzb3.zzY();
        }
        zzagvVar.zza = zzY;
        return true;
    }
}
