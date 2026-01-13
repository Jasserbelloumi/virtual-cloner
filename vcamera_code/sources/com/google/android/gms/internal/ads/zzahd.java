package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzahd implements zzahn {
    private final zzem zza;
    private final zzen zzb;
    @o0OO00OO
    private final String zzc;
    private String zzd;
    private zzabb zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private zzaf zzj;
    private int zzk;
    private long zzl;

    public zzahd() {
        this(null);
    }

    public zzahd(@o0OO00OO String str) {
        zzem zzemVar = new zzem(new byte[128], 128);
        this.zza = zzemVar;
        this.zzb = new zzen(zzemVar.zza);
        this.zzf = 0;
        this.zzl = C.TIME_UNSET;
        this.zzc = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0101, code lost:
        if (r12.zzk() == 11) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0103, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0105, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0127, code lost:
        if (r0 == 11) goto L13;
     */
    @Override // com.google.android.gms.internal.ads.zzahn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzen r12) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahd.zza(com.google.android.gms.internal.ads.zzen):void");
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzb(zzzx zzzxVar, zzaiz zzaizVar) {
        zzaizVar.zzc();
        this.zzd = zzaizVar.zzb();
        this.zze = zzzxVar.zzv(zzaizVar.zza(), 1);
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
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = false;
        this.zzl = C.TIME_UNSET;
    }
}
