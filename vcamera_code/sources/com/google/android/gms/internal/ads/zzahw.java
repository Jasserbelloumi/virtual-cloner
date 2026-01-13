package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* loaded from: classes2.dex */
public final class zzahw implements zzahn {
    private final zzaio zza;
    private long zze;
    private String zzg;
    private zzabb zzh;
    private zzahv zzi;
    private boolean zzj;
    private boolean zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzaic zzb = new zzaic(7, 128);
    private final zzaic zzc = new zzaic(8, 128);
    private final zzaic zzd = new zzaic(6, 128);
    private long zzk = C.TIME_UNSET;
    private final zzen zzm = new zzen();

    public zzahw(zzaio zzaioVar, boolean z, boolean z2) {
        this.zza = zzaioVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(byte[] bArr, int i, int i2) {
        if (!this.zzj) {
            this.zzb.zza(bArr, i, i2);
            this.zzc.zza(bArr, i, i2);
        }
        this.zzd.zza(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017a A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzahn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzen r20) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahw.zza(com.google.android.gms.internal.ads.zzen):void");
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzb(zzzx zzzxVar, zzaiz zzaizVar) {
        zzaizVar.zzc();
        this.zzg = zzaizVar.zzb();
        zzabb zzv = zzzxVar.zzv(zzaizVar.zza(), 2);
        this.zzh = zzv;
        this.zzi = new zzahv(zzv, false, false);
        this.zza.zzb(zzzxVar, zzaizVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzd(long j, int i) {
        if (j != C.TIME_UNSET) {
            this.zzk = j;
        }
        this.zzl |= (i & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zze() {
        this.zze = 0L;
        this.zzl = false;
        this.zzk = C.TIME_UNSET;
        zzaar.zze(this.zzf);
        this.zzb.zzb();
        this.zzc.zzb();
        this.zzd.zzb();
        zzahv zzahvVar = this.zzi;
        if (zzahvVar != null) {
            zzahvVar.zzc();
        }
    }
}
