package com.google.android.gms.internal.play_billing;
/* loaded from: classes2.dex */
public final class zzfb extends zzcb implements zzdg {
    private static final zzfb zzb;
    private int zzd;
    private int zze;
    private zzfj zzf;
    private zzfs zzg;

    static {
        zzfb zzfbVar = new zzfb();
        zzb = zzfbVar;
        zzcb.zzp(zzfb.class, zzfbVar);
    }

    private zzfb() {
    }

    public static zzfa zzv() {
        return (zzfa) zzb.zzg();
    }

    public static zzfb zzx(byte[] bArr, zzbn zzbnVar) throws zzci {
        return (zzfb) zzcb.zzj(zzb, bArr, zzbnVar);
    }

    public static /* synthetic */ void zzy(zzfb zzfbVar, zzfj zzfjVar) {
        zzfjVar.getClass();
        zzfbVar.zzf = zzfjVar;
        zzfbVar.zzd |= 2;
    }

    public static /* synthetic */ void zzz(zzfb zzfbVar, int i) {
        zzfbVar.zze = i - 1;
        zzfbVar.zzd |= 1;
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
                    return new zzfa(null);
                }
                return new zzfb();
            }
            return zzcb.zzm(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzfc.zza, "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
