package com.google.android.gms.internal.ads;

import java.util.Arrays;
import o00oOooO.o0OO00OO;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* loaded from: classes2.dex */
final class zzago extends zzagy {
    @o0OO00OO
    private zzaah zza;
    @o0OO00OO
    private zzagn zzb;

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzagy
    public final long zza(zzen zzenVar) {
        if (zzd(zzenVar.zzH())) {
            int i = (zzenVar.zzH()[2] & 255) >> 4;
            if (i != 6) {
                if (i == 7) {
                    i = 7;
                }
                int zza = zzaad.zza(zzenVar, i);
                zzenVar.zzF(0);
                return zza;
            }
            zzenVar.zzG(4);
            zzenVar.zzu();
            int zza2 = zzaad.zza(zzenVar, i);
            zzenVar.zzF(0);
            return zza2;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzagy
    public final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagy
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean zzc(zzen zzenVar, long j, zzagv zzagvVar) {
        byte[] zzH = zzenVar.zzH();
        zzaah zzaahVar = this.zza;
        if (zzaahVar == null) {
            zzaah zzaahVar2 = new zzaah(zzH, 17);
            this.zza = zzaahVar2;
            zzagvVar.zza = zzaahVar2.zzc(Arrays.copyOfRange(zzH, 9, zzenVar.zzd()), null);
            return true;
        } else if ((zzH[0] & Byte.MAX_VALUE) == 3) {
            zzaag zzb = zzaae.zzb(zzenVar);
            zzaah zzf = zzaahVar.zzf(zzb);
            this.zza = zzf;
            this.zzb = new zzagn(zzf, zzb);
            return true;
        } else if (zzd(zzH)) {
            zzagn zzagnVar = this.zzb;
            if (zzagnVar != null) {
                zzagnVar.zza(j);
                zzagvVar.zzb = this.zzb;
            }
            zzagvVar.zza.getClass();
            return false;
        } else {
            return true;
        }
    }
}
