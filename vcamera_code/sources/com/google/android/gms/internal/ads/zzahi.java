package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.util.Map;
/* loaded from: classes2.dex */
public final class zzahi implements zzzu {
    public static final zzaab zza = new zzaab() { // from class: com.google.android.gms.internal.ads.zzahh
        @Override // com.google.android.gms.internal.ads.zzaab
        public final zzzu[] zza() {
            zzaab zzaabVar = zzahi.zza;
            return new zzzu[]{new zzahi(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzaab
        public final /* synthetic */ zzzu[] zzb(Uri uri, Map map) {
            return zzaaa.zza(this, uri, map);
        }
    };
    private final zzahj zzb;
    private final zzen zzc;
    private final zzen zzd;
    private final zzem zze;
    private zzzx zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;

    public zzahi() {
        this(0);
    }

    public zzahi(int i) {
        this.zzb = new zzahj(true, null);
        this.zzc = new zzen(2048);
        this.zzh = -1L;
        zzen zzenVar = new zzen(10);
        this.zzd = zzenVar;
        byte[] zzH = zzenVar.zzH();
        this.zze = new zzem(zzH, zzH.length);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final int zza(zzzv zzzvVar, zzaau zzaauVar) throws IOException {
        zzdl.zzb(this.zzf);
        int zza2 = zzzvVar.zza(this.zzc.zzH(), 0, 2048);
        if (!this.zzj) {
            this.zzf.zzN(new zzaaw(C.TIME_UNSET, 0L));
            this.zzj = true;
        }
        if (zza2 == -1) {
            return -1;
        }
        this.zzc.zzF(0);
        this.zzc.zzE(zza2);
        if (!this.zzi) {
            this.zzb.zzd(this.zzg, 4);
            this.zzi = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzb(zzzx zzzxVar) {
        this.zzf = zzzxVar;
        this.zzb.zzb(zzzxVar, new zzaiz(Integer.MIN_VALUE, 0, 1));
        zzzxVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzc(long j, long j2) {
        this.zzi = false;
        this.zzb.zze();
        this.zzg = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzd(zzzv zzzvVar) throws IOException {
        int i = 0;
        while (true) {
            zzzk zzzkVar = (zzzk) zzzvVar;
            zzzkVar.zzm(this.zzd.zzH(), 0, 10, false);
            this.zzd.zzF(0);
            if (this.zzd.zzm() != 4801587) {
                break;
            }
            this.zzd.zzG(3);
            int zzj = this.zzd.zzj();
            i += zzj + 10;
            zzzkVar.zzl(zzj, false);
        }
        zzzvVar.zzj();
        zzzk zzzkVar2 = (zzzk) zzzvVar;
        zzzkVar2.zzl(i, false);
        if (this.zzh == -1) {
            this.zzh = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            zzzkVar2.zzm(this.zzd.zzH(), 0, 2, false);
            this.zzd.zzF(0);
            if (zzahj.zzf(this.zzd.zzo())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                zzzkVar2.zzm(this.zzd.zzH(), 0, 4, false);
                this.zze.zzj(14);
                int zzd = this.zze.zzd(13);
                if (zzd > 6) {
                    zzzkVar2.zzl(zzd - 6, false);
                    i3 += zzd;
                }
            }
            i4++;
            zzzvVar.zzj();
            zzzkVar2.zzl(i4, false);
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }
}
