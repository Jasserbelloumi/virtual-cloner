package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzahs implements zzahn {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    @o0OO00OO
    private final zzajc zzb;
    @o0OO00OO
    private final zzen zzc;
    private final boolean[] zzd;
    private final zzahq zze;
    @o0OO00OO
    private final zzaic zzf;
    private zzahr zzg;
    private long zzh;
    private String zzi;
    private zzabb zzj;
    private boolean zzk;
    private long zzl;

    public zzahs() {
        this(null);
    }

    public zzahs(@o0OO00OO zzajc zzajcVar) {
        this.zzb = zzajcVar;
        this.zzd = new boolean[4];
        this.zze = new zzahq(128);
        this.zzl = C.TIME_UNSET;
        this.zzf = new zzaic(178, 128);
        this.zzc = new zzen();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0129  */
    @Override // com.google.android.gms.internal.ads.zzahn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzen r18) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahs.zza(com.google.android.gms.internal.ads.zzen):void");
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzb(zzzx zzzxVar, zzaiz zzaizVar) {
        zzaizVar.zzc();
        this.zzi = zzaizVar.zzb();
        zzabb zzv = zzzxVar.zzv(zzaizVar.zza(), 2);
        this.zzj = zzv;
        this.zzg = new zzahr(zzv);
        this.zzb.zzb(zzzxVar, zzaizVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzd(long j, int i) {
        if (j != C.TIME_UNSET) {
            this.zzl = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zze() {
        zzaar.zze(this.zzd);
        this.zze.zzb();
        zzahr zzahrVar = this.zzg;
        if (zzahrVar != null) {
            zzahrVar.zzd();
        }
        this.zzf.zzb();
        this.zzh = 0L;
        this.zzl = C.TIME_UNSET;
    }
}
