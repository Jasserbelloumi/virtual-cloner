package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.MediaPeriodQueue;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
final class zzjr {
    public final zzsq zza;
    public final Object zzb;
    public final zzuj[] zzc;
    public boolean zzd;
    public boolean zze;
    public zzjs zzf;
    public boolean zzg;
    private final boolean[] zzh;
    private final zzko[] zzi;
    private final zzwk zzj;
    private final zzkg zzk;
    @o0OO00OO
    private zzjr zzl;
    private zzur zzm;
    private zzwl zzn;
    private long zzo;

    public zzjr(zzko[] zzkoVarArr, long j, zzwk zzwkVar, zzwt zzwtVar, zzkg zzkgVar, zzjs zzjsVar, zzwl zzwlVar, byte[] bArr) {
        this.zzi = zzkoVarArr;
        this.zzo = j;
        this.zzj = zzwkVar;
        this.zzk = zzkgVar;
        zzss zzssVar = zzjsVar.zza;
        this.zzb = zzssVar.zza;
        this.zzf = zzjsVar;
        this.zzm = zzur.zza;
        this.zzn = zzwlVar;
        this.zzc = new zzuj[2];
        this.zzh = new boolean[2];
        long j2 = zzjsVar.zzb;
        long j3 = zzjsVar.zzd;
        zzsq zzo = zzkgVar.zzo(zzssVar, zzwtVar, j2);
        this.zza = j3 != C.TIME_UNSET ? new zzrx(zzo, true, 0L, j3) : zzo;
    }

    private final void zzs() {
        if (!zzu()) {
            return;
        }
        int i = 0;
        while (true) {
            zzwl zzwlVar = this.zzn;
            if (i >= zzwlVar.zza) {
                return;
            }
            zzwlVar.zzb(i);
            zzwe zzweVar = this.zzn.zzc[i];
            i++;
        }
    }

    private final void zzt() {
        if (!zzu()) {
            return;
        }
        int i = 0;
        while (true) {
            zzwl zzwlVar = this.zzn;
            if (i >= zzwlVar.zza) {
                return;
            }
            zzwlVar.zzb(i);
            zzwe zzweVar = this.zzn.zzc[i];
            i++;
        }
    }

    private final boolean zzu() {
        return this.zzl == null;
    }

    public final long zza(zzwl zzwlVar, long j, boolean z) {
        return zzb(zzwlVar, j, false, new boolean[2]);
    }

    public final long zzb(zzwl zzwlVar, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= zzwlVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzh;
            if (z || !zzwlVar.zza(this.zzn, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            zzko[] zzkoVarArr = this.zzi;
            if (i2 >= 2) {
                break;
            }
            zzkoVarArr[i2].zzb();
            i2++;
        }
        zzs();
        this.zzn = zzwlVar;
        zzt();
        long zzf = this.zza.zzf(zzwlVar.zzc, this.zzh, this.zzc, zArr, j);
        int i3 = 0;
        while (true) {
            zzko[] zzkoVarArr2 = this.zzi;
            if (i3 >= 2) {
                break;
            }
            zzkoVarArr2[i3].zzb();
            i3++;
        }
        this.zze = false;
        int i4 = 0;
        while (true) {
            zzuj[] zzujVarArr = this.zzc;
            if (i4 >= 2) {
                return zzf;
            }
            if (zzujVarArr[i4] != null) {
                zzdl.zzf(zzwlVar.zzb(i4));
                this.zzi[i4].zzb();
                this.zze = true;
            } else {
                zzdl.zzf(zzwlVar.zzc[i4] == null);
            }
            i4++;
        }
    }

    public final long zzc() {
        if (this.zzd) {
            long zzb = this.zze ? this.zza.zzb() : Long.MIN_VALUE;
            return zzb == Long.MIN_VALUE ? this.zzf.zze : zzb;
        }
        return this.zzf.zzb;
    }

    public final long zzd() {
        if (this.zzd) {
            return this.zza.zzc();
        }
        return 0L;
    }

    public final long zze() {
        return this.zzo;
    }

    public final long zzf() {
        return this.zzf.zzb + this.zzo;
    }

    @o0OO00OO
    public final zzjr zzg() {
        return this.zzl;
    }

    public final zzur zzh() {
        return this.zzm;
    }

    public final zzwl zzi() {
        return this.zzn;
    }

    public final zzwl zzj(float f, zzcn zzcnVar) throws zzhj {
        zzwe[] zzweVarArr;
        zzwl zzn = this.zzj.zzn(this.zzi, this.zzm, this.zzf.zza, zzcnVar);
        for (zzwe zzweVar : zzn.zzc) {
        }
        return zzn;
    }

    public final void zzk(long j) {
        zzdl.zzf(zzu());
        this.zza.zzo(j - this.zzo);
    }

    public final void zzl(float f, zzcn zzcnVar) throws zzhj {
        this.zzd = true;
        this.zzm = this.zza.zzh();
        zzwl zzj = zzj(f, zzcnVar);
        zzjs zzjsVar = this.zzf;
        long j = zzjsVar.zzb;
        long j2 = zzjsVar.zze;
        if (j2 != C.TIME_UNSET && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        long zza = zza(zzj, j, false);
        long j3 = this.zzo;
        zzjs zzjsVar2 = this.zzf;
        this.zzo = (zzjsVar2.zzb - zza) + j3;
        this.zzf = zzjsVar2.zzb(zza);
    }

    public final void zzm(long j) {
        zzdl.zzf(zzu());
        if (this.zzd) {
            this.zza.zzm(j - this.zzo);
        }
    }

    public final void zzn() {
        zzs();
        zzkg zzkgVar = this.zzk;
        zzsq zzsqVar = this.zza;
        try {
            if (zzsqVar instanceof zzrx) {
                zzkgVar.zzh(((zzrx) zzsqVar).zza);
            } else {
                zzkgVar.zzh(zzsqVar);
            }
        } catch (RuntimeException e) {
            zzee.zzc("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void zzo(@o0OO00OO zzjr zzjrVar) {
        if (zzjrVar == this.zzl) {
            return;
        }
        zzs();
        this.zzl = zzjrVar;
        zzt();
    }

    public final void zzp(long j) {
        this.zzo = MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US;
    }

    public final void zzq() {
        zzsq zzsqVar = this.zza;
        if (zzsqVar instanceof zzrx) {
            long j = this.zzf.zzd;
            if (j == C.TIME_UNSET) {
                j = Long.MIN_VALUE;
            }
            ((zzrx) zzsqVar).zzn(0L, j);
        }
    }

    public final boolean zzr() {
        return this.zzd && (!this.zze || this.zza.zzb() == Long.MIN_VALUE);
    }
}
