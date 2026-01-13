package com.google.android.gms.internal.ads;

import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
final class zzvw extends zzvy implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    public zzvw(int i, zzcp zzcpVar, int i2, zzvq zzvqVar, int i3, @o0OO00OO String str) {
        super(i, zzcpVar, i2);
        int i4;
        int i5 = 0;
        this.zzf = zzwc.zzm(i3, false);
        int i6 = this.zzd.zze;
        int i7 = zzvqVar.zzx;
        this.zzg = 1 == (i6 & 1);
        this.zzh = (i6 & 2) != 0;
        zzfqk zzp = zzvqVar.zzv.isEmpty() ? zzfqk.zzp("") : zzvqVar.zzv;
        int i8 = 0;
        while (true) {
            if (i8 >= zzp.size()) {
                i8 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
            i4 = zzwc.zza(this.zzd, (String) zzp.get(i8), false);
            if (i4 > 0) {
                break;
            }
            i8++;
        }
        this.zzi = i8;
        this.zzj = i4;
        int i9 = this.zzd.zzf;
        int bitCount = Integer.bitCount(0);
        this.zzk = bitCount;
        int i10 = this.zzd.zzf;
        this.zzm = false;
        int zza = zzwc.zza(this.zzd, str, zzwc.zzf(str) == null);
        this.zzl = zza;
        boolean z = i4 > 0 || (zzvqVar.zzv.isEmpty() && bitCount > 0) || this.zzg || (this.zzh && zza > 0);
        if (zzwc.zzm(i3, zzvqVar.zzQ) && z) {
            i5 = 1;
        }
        this.zze = i5;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzvw zzvwVar) {
        zzfpz zzb = zzfpz.zzj().zzd(this.zzf, zzvwVar.zzf).zzc(Integer.valueOf(this.zzi), Integer.valueOf(zzvwVar.zzi), zzfrs.zzc().zza()).zzb(this.zzj, zzvwVar.zzj).zzb(this.zzk, zzvwVar.zzk).zzd(this.zzg, zzvwVar.zzg).zzc(Boolean.valueOf(this.zzh), Boolean.valueOf(zzvwVar.zzh), this.zzj == 0 ? zzfrs.zzc() : zzfrs.zzc().zza()).zzb(this.zzl, zzvwVar.zzl);
        if (this.zzk == 0) {
            zzb = zzb.zze(false, false);
        }
        return zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final /* bridge */ /* synthetic */ boolean zzc(zzvy zzvyVar) {
        zzvw zzvwVar = (zzvw) zzvyVar;
        return false;
    }
}
