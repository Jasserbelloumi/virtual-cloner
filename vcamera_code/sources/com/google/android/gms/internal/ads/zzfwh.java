package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
public final class zzfwh {
    private final zzgld zza;

    private zzfwh(zzgld zzgldVar) {
        this.zza = zzgldVar;
    }

    public static zzfwh zze(String str, byte[] bArr, int i) {
        zzglc zza = zzgld.zza();
        zza.zzb(str);
        zza.zzc(zzgpe.zzv(bArr));
        int i2 = i - 1;
        zza.zza(i2 != 0 ? i2 != 1 ? zzgme.RAW : zzgme.LEGACY : zzgme.TINK);
        return new zzfwh((zzgld) zza.zzal());
    }

    public final zzgld zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zza.zzg();
    }

    public final byte[] zzc() {
        return this.zza.zzf().zzE();
    }

    public final int zzd() {
        zzgme zze = this.zza.zze();
        zzgme zzgmeVar = zzgme.UNKNOWN_PREFIX;
        int ordinal = zze.ordinal();
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i;
    }
}
