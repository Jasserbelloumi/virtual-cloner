package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.util.Map;
/* loaded from: classes2.dex */
public final class zzahc implements zzzu {
    public static final zzaab zza = new zzaab() { // from class: com.google.android.gms.internal.ads.zzahb
        @Override // com.google.android.gms.internal.ads.zzaab
        public final zzzu[] zza() {
            zzaab zzaabVar = zzahc.zza;
            return new zzzu[]{new zzahc()};
        }

        @Override // com.google.android.gms.internal.ads.zzaab
        public final /* synthetic */ zzzu[] zzb(Uri uri, Map map) {
            return zzaaa.zza(this, uri, map);
        }
    };
    private final zzahd zzb = new zzahd(null);
    private final zzen zzc = new zzen(2786);
    private boolean zzd;

    @Override // com.google.android.gms.internal.ads.zzzu
    public final int zza(zzzv zzzvVar, zzaau zzaauVar) throws IOException {
        int zza2 = zzzvVar.zza(this.zzc.zzH(), 0, 2786);
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
        zzen zzenVar = new zzen(10);
        int i = 0;
        while (true) {
            zzzk zzzkVar = (zzzk) zzzvVar;
            zzzkVar.zzm(zzenVar.zzH(), 0, 10, false);
            zzenVar.zzF(0);
            if (zzenVar.zzm() != 4801587) {
                break;
            }
            zzenVar.zzG(3);
            int zzj = zzenVar.zzj();
            i += zzj + 10;
            zzzkVar.zzl(zzj, false);
        }
        zzzvVar.zzj();
        zzzk zzzkVar2 = (zzzk) zzzvVar;
        zzzkVar2.zzl(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            zzzkVar2.zzm(zzenVar.zzH(), 0, 6, false);
            zzenVar.zzF(0);
            if (zzenVar.zzo() != 2935) {
                zzzvVar.zzj();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                zzzkVar2.zzl(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int zzb = zzyv.zzb(zzenVar.zzH());
                if (zzb == -1) {
                    return false;
                }
                zzzkVar2.zzl(zzb - 6, false);
            }
        }
    }
}
