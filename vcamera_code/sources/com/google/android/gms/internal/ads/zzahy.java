package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* loaded from: classes2.dex */
public final class zzahy implements zzahn {
    private final zzaio zza;
    private String zzb;
    private zzabb zzc;
    private zzahx zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzaic zzg = new zzaic(32, 128);
    private final zzaic zzh = new zzaic(33, 128);
    private final zzaic zzi = new zzaic(34, 128);
    private final zzaic zzj = new zzaic(39, 128);
    private final zzaic zzk = new zzaic(40, 128);
    private long zzm = C.TIME_UNSET;
    private final zzen zzn = new zzen();

    public zzahy(zzaio zzaioVar) {
        this.zza = zzaioVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(byte[] bArr, int i, int i2) {
        this.zzd.zzb(bArr, i, i2);
        if (!this.zze) {
            this.zzg.zza(bArr, i, i2);
            this.zzh.zza(bArr, i, i2);
            this.zzi.zza(bArr, i, i2);
        }
        this.zzj.zza(bArr, i, i2);
        this.zzk.zza(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03a4  */
    @Override // com.google.android.gms.internal.ads.zzahn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzen r34) {
        /*
            Method dump skipped, instructions count: 971
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahy.zza(com.google.android.gms.internal.ads.zzen):void");
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzb(zzzx zzzxVar, zzaiz zzaizVar) {
        zzaizVar.zzc();
        this.zzb = zzaizVar.zzb();
        zzabb zzv = zzzxVar.zzv(zzaizVar.zza(), 2);
        this.zzc = zzv;
        this.zzd = new zzahx(zzv);
        this.zza.zzb(zzzxVar, zzaizVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzd(long j, int i) {
        if (j != C.TIME_UNSET) {
            this.zzm = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zze() {
        this.zzl = 0L;
        this.zzm = C.TIME_UNSET;
        zzaar.zze(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        zzahx zzahxVar = this.zzd;
        if (zzahxVar != null) {
            zzahxVar.zzc();
        }
    }
}
