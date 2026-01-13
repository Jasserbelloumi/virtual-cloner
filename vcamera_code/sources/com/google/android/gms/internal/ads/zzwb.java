package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzwb extends zzvy {
    private final boolean zze;
    private final zzvq zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final boolean zzo;
    private final boolean zzp;
    private final int zzq;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:139:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0091 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzwb(int r5, com.google.android.gms.internal.ads.zzcp r6, int r7, com.google.android.gms.internal.ads.zzvq r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwb.<init>(int, com.google.android.gms.internal.ads.zzcp, int, com.google.android.gms.internal.ads.zzvq, int, int, boolean):void");
    }

    public static /* synthetic */ int zza(zzwb zzwbVar, zzwb zzwbVar2) {
        zzfrs zzfrsVar;
        zzfrs zza;
        zzfrs zzfrsVar2;
        if (zzwbVar.zze && zzwbVar.zzh) {
            zza = zzwc.zzc;
        } else {
            zzfrsVar = zzwc.zzc;
            zza = zzfrsVar.zza();
        }
        zzfpz zzj = zzfpz.zzj();
        Integer valueOf = Integer.valueOf(zzwbVar.zzi);
        Integer valueOf2 = Integer.valueOf(zzwbVar2.zzi);
        boolean z = zzwbVar.zzf.zzz;
        zzfrsVar2 = zzwc.zzd;
        return zzj.zzc(valueOf, valueOf2, zzfrsVar2).zzc(Integer.valueOf(zzwbVar.zzj), Integer.valueOf(zzwbVar2.zzj), zza).zzc(Integer.valueOf(zzwbVar.zzi), Integer.valueOf(zzwbVar2.zzi), zza).zza();
    }

    public static /* synthetic */ int zzd(zzwb zzwbVar, zzwb zzwbVar2) {
        zzfpz zzc = zzfpz.zzj().zzd(zzwbVar.zzh, zzwbVar2.zzh).zzb(zzwbVar.zzl, zzwbVar2.zzl).zzd(true, true).zzd(zzwbVar.zze, zzwbVar2.zze).zzd(zzwbVar.zzg, zzwbVar2.zzg).zzc(Integer.valueOf(zzwbVar.zzk), Integer.valueOf(zzwbVar2.zzk), zzfrs.zzc().zza());
        boolean z = zzwbVar.zzo;
        zzfpz zzd = zzc.zzd(z, zzwbVar2.zzo);
        boolean z2 = zzwbVar.zzp;
        zzfpz zzd2 = zzd.zzd(z2, zzwbVar2.zzp);
        if (z && z2) {
            zzd2 = zzd2.zzb(zzwbVar.zzq, zzwbVar2.zzq);
        }
        return zzd2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final int zzb() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final /* bridge */ /* synthetic */ boolean zzc(zzvy zzvyVar) {
        zzwb zzwbVar = (zzwb) zzvyVar;
        if (zzew.zzU(this.zzd.zzm, zzwbVar.zzd.zzm)) {
            boolean z = this.zzf.zzJ;
            return this.zzo == zzwbVar.zzo && this.zzp == zzwbVar.zzp;
        }
        return false;
    }
}
