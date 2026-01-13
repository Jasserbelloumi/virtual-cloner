package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
public final class zzasr extends zzgqm implements zzgrx {
    private static final zzasr zzb;
    private int zzd;
    private zzasu zze;
    private zzgpe zzf;
    private zzgpe zzg;

    static {
        zzasr zzasrVar = new zzasr();
        zzb = zzasrVar;
        zzgqm.zzaT(zzasr.class, zzasrVar);
    }

    private zzasr() {
        zzgpe zzgpeVar = zzgpe.zzb;
        this.zzf = zzgpeVar;
        this.zzg = zzgpeVar;
    }

    public static zzasr zzc(zzgpe zzgpeVar, zzgpy zzgpyVar) throws zzgqy {
        return (zzasr) zzgqm.zzaG(zzb, zzgpeVar, zzgpyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgqm
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzasq(null);
                }
                return new zzasr();
            }
            return zzgqm.zzaQ(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzasu zzd() {
        zzasu zzasuVar = this.zze;
        return zzasuVar == null ? zzasu.zzg() : zzasuVar;
    }

    public final zzgpe zze() {
        return this.zzg;
    }

    public final zzgpe zzf() {
        return this.zzf;
    }
}
