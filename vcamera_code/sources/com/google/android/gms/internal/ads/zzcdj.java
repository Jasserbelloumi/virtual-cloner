package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
/* loaded from: classes2.dex */
final class zzcdj implements zzfg {
    private final zzfg zza;
    private final long zzb;
    private final zzfg zzc;
    private long zzd;
    private Uri zze;

    public zzcdj(zzfg zzfgVar, int i, zzfg zzfgVar2) {
        this.zza = zzfgVar;
        this.zzb = i;
        this.zzc = zzfgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.zzd;
        long j2 = this.zzb;
        if (j < j2) {
            int zza = this.zza.zza(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.zzd + zza;
            this.zzd = j3;
            i3 = zza;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j >= this.zzb) {
            int zza2 = this.zzc.zza(bArr, i + i3, i2 - i3);
            int i4 = i3 + zza2;
            this.zzd += zza2;
            return i4;
        }
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final long zzb(zzfl zzflVar) throws IOException {
        zzfl zzflVar2;
        this.zze = zzflVar.zza;
        long j = zzflVar.zzf;
        long j2 = this.zzb;
        zzfl zzflVar3 = null;
        if (j >= j2) {
            zzflVar2 = null;
        } else {
            long j3 = zzflVar.zzg;
            long j4 = j2 - j;
            if (j3 != -1) {
                j4 = Math.min(j3, j4);
            }
            zzflVar2 = new zzfl(zzflVar.zza, null, j, j, j4, null, 0);
        }
        long j5 = zzflVar.zzg;
        if (j5 == -1 || zzflVar.zzf + j5 > this.zzb) {
            long max = Math.max(this.zzb, zzflVar.zzf);
            long j6 = zzflVar.zzg;
            zzflVar3 = new zzfl(zzflVar.zza, null, max, max, j6 != -1 ? Math.min(j6, (zzflVar.zzf + j6) - this.zzb) : -1L, null, 0);
        }
        long zzb = zzflVar2 != null ? this.zza.zzb(zzflVar2) : 0L;
        long zzb2 = zzflVar3 != null ? this.zzc.zzb(zzflVar3) : 0L;
        this.zzd = zzflVar.zzf;
        if (zzb == -1 || zzb2 == -1) {
            return -1L;
        }
        return zzb + zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final Map zze() {
        return zzfqn.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzfg
    public final void zzf(zzgi zzgiVar) {
    }
}
