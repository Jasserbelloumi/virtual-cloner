package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
abstract class zzgtg {
    public abstract int zza(Object obj);

    public abstract int zzb(Object obj);

    public abstract Object zzc(Object obj);

    public abstract Object zzd(Object obj);

    public abstract Object zze(Object obj, Object obj2);

    public abstract Object zzf();

    public abstract Object zzg(Object obj);

    public abstract void zzh(Object obj, int i, int i2);

    public abstract void zzi(Object obj, int i, long j);

    public abstract void zzj(Object obj, int i, Object obj2);

    public abstract void zzk(Object obj, int i, zzgpe zzgpeVar);

    public abstract void zzl(Object obj, int i, long j);

    public abstract void zzm(Object obj);

    public abstract void zzn(Object obj, Object obj2);

    public abstract void zzo(Object obj, Object obj2);

    public final boolean zzp(Object obj, zzgsh zzgshVar) throws IOException {
        int zzd = zzgshVar.zzd();
        int i = zzd >>> 3;
        int i2 = zzd & 7;
        if (i2 == 0) {
            zzl(obj, i, zzgshVar.zzl());
            return true;
        } else if (i2 == 1) {
            zzi(obj, i, zzgshVar.zzk());
            return true;
        } else if (i2 == 2) {
            zzk(obj, i, zzgshVar.zzp());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    zzh(obj, i, zzgshVar.zzf());
                    return true;
                }
                throw zzgqy.zza();
            }
            return false;
        } else {
            Object zzf = zzf();
            int i3 = i << 3;
            while (zzgshVar.zzc() != Integer.MAX_VALUE && zzp(zzf, zzgshVar)) {
            }
            if ((4 | i3) == zzgshVar.zzd()) {
                zzg(zzf);
                zzj(obj, i, zzf);
                return true;
            }
            throw zzgqy.zzb();
        }
    }

    public abstract boolean zzq(zzgsh zzgshVar);

    public abstract void zzr(Object obj, zzgpu zzgpuVar) throws IOException;
}
