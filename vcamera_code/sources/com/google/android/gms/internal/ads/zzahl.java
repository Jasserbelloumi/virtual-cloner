package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzahl implements zzahn {
    @o0OO00OO
    private final String zzb;
    private String zzc;
    private zzabb zzd;
    private int zzf;
    private int zzg;
    private long zzh;
    private zzaf zzi;
    private int zzj;
    private final zzen zza = new zzen(new byte[18]);
    private int zze = 0;
    private long zzk = C.TIME_UNSET;

    public zzahl(@o0OO00OO String str) {
        this.zzb = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0143  */
    @Override // com.google.android.gms.internal.ads.zzahn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzen r18) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahl.zza(com.google.android.gms.internal.ads.zzen):void");
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzb(zzzx zzzxVar, zzaiz zzaizVar) {
        zzaizVar.zzc();
        this.zzc = zzaizVar.zzb();
        this.zzd = zzzxVar.zzv(zzaizVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzd(long j, int i) {
        if (j != C.TIME_UNSET) {
            this.zzk = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zze() {
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzk = C.TIME_UNSET;
    }
}
