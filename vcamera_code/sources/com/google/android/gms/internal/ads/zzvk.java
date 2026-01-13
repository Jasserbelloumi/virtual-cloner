package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
final class zzvk extends zzvy implements Comparable {
    private final int zze;
    private final boolean zzf;
    @o0OO00OO
    private final String zzg;
    private final zzvq zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;

    public zzvk(int i, zzcp zzcpVar, int i2, zzvq zzvqVar, int i3, boolean z, zzfnv zzfnvVar) {
        super(i, zzcpVar, i2);
        int i4;
        int i5;
        int i6;
        boolean z2;
        this.zzh = zzvqVar;
        this.zzg = zzwc.zzf(this.zzd.zzd);
        int i7 = 0;
        this.zzi = zzwc.zzm(i3, false);
        int i8 = 0;
        while (true) {
            i4 = Integer.MAX_VALUE;
            if (i8 >= zzvqVar.zzq.size()) {
                i5 = 0;
                i8 = Integer.MAX_VALUE;
                break;
            }
            i5 = zzwc.zza(this.zzd, (String) zzvqVar.zzq.get(i8), false);
            if (i5 > 0) {
                break;
            }
            i8++;
        }
        this.zzk = i8;
        this.zzj = i5;
        int i9 = this.zzd.zzf;
        this.zzl = Integer.bitCount(0);
        zzaf zzafVar = this.zzd;
        int i10 = zzafVar.zzf;
        this.zzm = true;
        this.zzp = 1 == (zzafVar.zze & 1);
        this.zzq = zzafVar.zzz;
        this.zzr = zzafVar.zzA;
        this.zzs = zzafVar.zzi;
        this.zzf = zzfnvVar.zza(zzafVar);
        String[] zzag = zzew.zzag();
        int i11 = 0;
        while (true) {
            if (i11 >= zzag.length) {
                i6 = 0;
                i11 = Integer.MAX_VALUE;
                break;
            }
            i6 = zzwc.zza(this.zzd, zzag[i11], false);
            if (i6 > 0) {
                break;
            }
            i11++;
        }
        this.zzn = i11;
        this.zzo = i6;
        int i12 = 0;
        while (true) {
            if (i12 < zzvqVar.zzu.size()) {
                String str = this.zzd.zzm;
                if (str != null && str.equals(zzvqVar.zzu.get(i12))) {
                    i4 = i12;
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        this.zzt = i4;
        this.zzu = (i3 & 384) == 128;
        this.zzv = (i3 & 64) == 64;
        zzvq zzvqVar2 = this.zzh;
        if (zzwc.zzm(i3, zzvqVar2.zzQ) && ((z2 = this.zzf) || zzvqVar2.zzK)) {
            i7 = (!zzwc.zzm(i3, false) || !z2 || this.zzd.zzi == -1 || (!zzvqVar2.zzS && z)) ? 1 : 2;
        }
        this.zze = i7;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzvk zzvkVar) {
        zzfrs zzfrsVar;
        zzfrs zza;
        zzfrs zzfrsVar2;
        if (this.zzf && this.zzi) {
            zza = zzwc.zzc;
        } else {
            zzfrsVar = zzwc.zzc;
            zza = zzfrsVar.zza();
        }
        zzfpz zzc = zzfpz.zzj().zzd(this.zzi, zzvkVar.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(zzvkVar.zzk), zzfrs.zzc().zza()).zzb(this.zzj, zzvkVar.zzj).zzb(this.zzl, zzvkVar.zzl).zzd(this.zzp, zzvkVar.zzp).zzd(true, true).zzc(Integer.valueOf(this.zzn), Integer.valueOf(zzvkVar.zzn), zzfrs.zzc().zza()).zzb(this.zzo, zzvkVar.zzo).zzd(this.zzf, zzvkVar.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(zzvkVar.zzt), zzfrs.zzc().zza());
        Integer valueOf = Integer.valueOf(this.zzs);
        Integer valueOf2 = Integer.valueOf(zzvkVar.zzs);
        boolean z = this.zzh.zzz;
        zzfrsVar2 = zzwc.zzd;
        zzfpz zzc2 = zzc.zzc(valueOf, valueOf2, zzfrsVar2).zzd(this.zzu, zzvkVar.zzu).zzd(this.zzv, zzvkVar.zzv).zzc(Integer.valueOf(this.zzq), Integer.valueOf(zzvkVar.zzq), zza).zzc(Integer.valueOf(this.zzr), Integer.valueOf(zzvkVar.zzr), zza);
        Integer valueOf3 = Integer.valueOf(this.zzs);
        Integer valueOf4 = Integer.valueOf(zzvkVar.zzs);
        if (!zzew.zzU(this.zzg, zzvkVar.zzg)) {
            zza = zzwc.zzd;
        }
        return zzc2.zzc(valueOf3, valueOf4, zza).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final /* bridge */ /* synthetic */ boolean zzc(zzvy zzvyVar) {
        String str;
        zzvk zzvkVar = (zzvk) zzvyVar;
        boolean z = this.zzh.zzN;
        zzaf zzafVar = this.zzd;
        int i = zzafVar.zzz;
        if (i != -1) {
            zzaf zzafVar2 = zzvkVar.zzd;
            if (i == zzafVar2.zzz && (str = zzafVar.zzm) != null && TextUtils.equals(str, zzafVar2.zzm)) {
                boolean z2 = this.zzh.zzM;
                int i2 = this.zzd.zzA;
                return i2 != -1 && i2 == zzvkVar.zzd.zzA && this.zzu == zzvkVar.zzu && this.zzv == zzvkVar.zzv;
            }
            return false;
        }
        return false;
    }
}
