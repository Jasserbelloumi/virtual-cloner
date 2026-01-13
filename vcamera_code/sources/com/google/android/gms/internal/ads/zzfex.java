package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
public final class zzfex extends zzgqm implements zzgrx {
    private static final zzfex zzb;
    private zzgqv zzd = zzgqm.zzaM();

    static {
        zzfex zzfexVar = new zzfex();
        zzb = zzfexVar;
        zzgqm.zzaT(zzfex.class, zzfexVar);
    }

    private zzfex() {
    }

    public static zzfeu zzc() {
        return (zzfeu) zzb.zzaA();
    }

    public static /* synthetic */ zzfex zzd() {
        return zzb;
    }

    public static /* synthetic */ void zze(zzfex zzfexVar) {
        zzfexVar.zzd = zzgqm.zzaM();
    }

    public static /* synthetic */ void zzf(zzfex zzfexVar, zzfew zzfewVar) {
        zzfewVar.getClass();
        zzgqv zzgqvVar = zzfexVar.zzd;
        if (!zzgqvVar.zzc()) {
            zzfexVar.zzd = zzgqm.zzaN(zzgqvVar);
        }
        zzfexVar.zzd.add(zzfewVar);
    }

    public final int zza() {
        return this.zzd.size();
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
                    return new zzfeu(null);
                }
                return new zzfex();
            }
            return zzgqm.zzaQ(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzfew.class});
        }
        return (byte) 1;
    }
}
