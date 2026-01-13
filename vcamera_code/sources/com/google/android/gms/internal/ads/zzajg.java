package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
final class zzajg implements zzajf {
    private final zzzx zza;
    private final zzabb zzb;
    private final zzaji zzc;
    private final zzaf zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzajg(zzzx zzzxVar, zzabb zzabbVar, zzaji zzajiVar, String str, int i) throws zzbu {
        this.zza = zzzxVar;
        this.zzb = zzabbVar;
        this.zzc = zzajiVar;
        int i2 = zzajiVar.zzb * zzajiVar.zze;
        int i3 = zzajiVar.zzd;
        int i4 = i2 / 8;
        if (i3 != i4) {
            throw zzbu.zza("Expected block size: " + i4 + "; got: " + i3, null);
        }
        int i5 = zzajiVar.zzc * i4;
        int i6 = i5 * 8;
        int max = Math.max(i4, i5 / 10);
        this.zze = max;
        zzad zzadVar = new zzad();
        zzadVar.zzS(str);
        zzadVar.zzv(i6);
        zzadVar.zzO(i6);
        zzadVar.zzL(max);
        zzadVar.zzw(zzajiVar.zzb);
        zzadVar.zzT(zzajiVar.zzc);
        zzadVar.zzN(i);
        this.zzd = zzadVar.zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzajf
    public final void zza(int i, long j) {
        this.zza.zzN(new zzajl(this.zzc, 1, i, j));
        this.zzb.zzk(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzajf
    public final void zzb(long j) {
        this.zzf = j;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzajf
    public final boolean zzc(zzzv zzzvVar, long j) throws IOException {
        int i;
        zzaji zzajiVar;
        int i2;
        int i3;
        long j2 = j;
        while (true) {
            i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            if (i <= 0 || (i2 = this.zzg) >= (i3 = this.zze)) {
                break;
            }
            int zza = zzaaz.zza(this.zzb, zzzvVar, (int) Math.min(i3 - i2, j2), true);
            if (zza == -1) {
                j2 = 0;
            } else {
                this.zzg += zza;
                j2 -= zza;
            }
        }
        int i4 = this.zzc.zzd;
        int i5 = this.zzg / i4;
        if (i5 > 0) {
            int i6 = i5 * i4;
            int i7 = this.zzg - i6;
            this.zzb.zzs(this.zzf + zzew.zzw(this.zzh, 1000000L, zzajiVar.zzc), 1, i6, i7, null);
            this.zzh += i5;
            this.zzg = i7;
        }
        return i <= 0;
    }
}
