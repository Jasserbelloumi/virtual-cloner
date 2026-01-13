package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.util.Map;
/* loaded from: classes2.dex */
public final class zzahf implements zzzu {
    public static final zzaab zza = new zzaab() { // from class: com.google.android.gms.internal.ads.zzahe
        @Override // com.google.android.gms.internal.ads.zzaab
        public final zzzu[] zza() {
            zzaab zzaabVar = zzahf.zza;
            return new zzzu[]{new zzahf()};
        }

        @Override // com.google.android.gms.internal.ads.zzaab
        public final /* synthetic */ zzzu[] zzb(Uri uri, Map map) {
            return zzaaa.zza(this, uri, map);
        }
    };
    private final zzahg zzb = new zzahg(null);
    private final zzen zzc = new zzen(16384);
    private boolean zzd;

    @Override // com.google.android.gms.internal.ads.zzzu
    public final int zza(zzzv zzzvVar, zzaau zzaauVar) throws IOException {
        int zza2 = zzzvVar.zza(this.zzc.zzH(), 0, 16384);
        if (zza2 == -1) {
            return -1;
        }
        this.zzc.zzF(0);
        this.zzc.zzE(zza2);
        if (!this.zzd) {
            this.zzb.zzd(0L, 4);
            this.zzd = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzb(zzzx zzzxVar) {
        this.zzb.zzb(zzzxVar, new zzaiz(Integer.MIN_VALUE, 0, 1));
        zzzxVar.zzC();
        zzzxVar.zzN(new zzaaw(C.TIME_UNSET, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzc(long j, long j2) {
        this.zzd = false;
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzd(zzzv zzzvVar) throws IOException {
        int i;
        zzen zzenVar = new zzen(10);
        int i2 = 0;
        while (true) {
            zzzk zzzkVar = (zzzk) zzzvVar;
            zzzkVar.zzm(zzenVar.zzH(), 0, 10, false);
            zzenVar.zzF(0);
            if (zzenVar.zzm() != 4801587) {
                break;
            }
            zzenVar.zzG(3);
            int zzj = zzenVar.zzj();
            i2 += zzj + 10;
            zzzkVar.zzl(zzj, false);
        }
        zzzvVar.zzj();
        zzzk zzzkVar2 = (zzzk) zzzvVar;
        zzzkVar2.zzl(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            zzzkVar2.zzm(zzenVar.zzH(), 0, 7, false);
            zzenVar.zzF(0);
            int zzo = zzenVar.zzo();
            if (zzo == 44096 || zzo == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] zzH = zzenVar.zzH();
                int i6 = zzyy.zza;
                if (zzH.length < 7) {
                    i = -1;
                } else {
                    int i7 = ((zzH[2] & 255) << 8) | (zzH[3] & 255);
                    if (i7 == 65535) {
                        i7 = ((zzH[4] & 255) << 16) | ((zzH[5] & 255) << 8) | (zzH[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (zzo == 44097) {
                        i5 += 2;
                    }
                    i = i7 + i5;
                }
                if (i == -1) {
                    return false;
                }
                zzzkVar2.zzl(i - 7, false);
            } else {
                zzzvVar.zzj();
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                zzzkVar2.zzl(i4, false);
                i3 = 0;
            }
        }
    }
}
