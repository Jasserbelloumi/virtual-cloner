package com.google.android.gms.internal.play_billing;
/* loaded from: classes2.dex */
public final class zzfv extends zzcb implements zzdg {
    private static final zzfv zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private zzfm zzg;

    static {
        zzfv zzfvVar = new zzfv();
        zzb = zzfvVar;
        zzcb.zzp(zzfv.class, zzfvVar);
    }

    private zzfv() {
    }

    public static /* synthetic */ void zzA(zzfv zzfvVar, zzff zzffVar) {
        zzffVar.getClass();
        zzfvVar.zzf = zzffVar;
        zzfvVar.zze = 3;
    }

    public static zzfu zzv() {
        return (zzfu) zzb.zzg();
    }

    public static /* synthetic */ void zzx(zzfv zzfvVar, zzfz zzfzVar) {
        zzfzVar.getClass();
        zzfvVar.zzf = zzfzVar;
        zzfvVar.zze = 4;
    }

    public static /* synthetic */ void zzy(zzfv zzfvVar, zzfm zzfmVar) {
        zzfvVar.zzg = zzfmVar;
        zzfvVar.zzd |= 1;
    }

    public static /* synthetic */ void zzz(zzfv zzfvVar, zzfb zzfbVar) {
        zzfbVar.getClass();
        zzfvVar.zzf = zzfbVar;
        zzfvVar.zze = 2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcb
    public final Object zzu(int i, Object obj, Object obj2) {
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
                    return new zzfu(null);
                }
                return new zzfv();
            }
            return zzcb.zzm(zzb, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zzfb.class, zzff.class, zzfz.class});
        }
        return (byte) 1;
    }
}
