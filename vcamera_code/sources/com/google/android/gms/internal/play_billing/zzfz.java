package com.google.android.gms.internal.play_billing;
/* loaded from: classes2.dex */
public final class zzfz extends zzcb implements zzdg {
    private static final zzfz zzb;
    private int zzd;
    private int zze;

    static {
        zzfz zzfzVar = new zzfz();
        zzb = zzfzVar;
        zzcb.zzp(zzfz.class, zzfzVar);
    }

    private zzfz() {
    }

    public static zzfz zzw() {
        return zzb;
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
                    return new zzfx(null);
                }
                return new zzfz();
            }
            return zzcb.zzm(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzd", "zze", zzfy.zza});
        }
        return (byte) 1;
    }
}
