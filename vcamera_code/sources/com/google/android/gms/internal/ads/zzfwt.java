package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
@Deprecated
/* loaded from: classes2.dex */
public final class zzfwt {
    @Deprecated
    public static final zzfwp zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzgll zzh = zzgll.zzh(bArr, zzgpy.zza());
            for (zzglk zzglkVar : zzh.zzi()) {
                if (zzglkVar.zzc().zzc() == zzgkx.UNKNOWN_KEYMATERIAL || zzglkVar.zzc().zzc() == zzgkx.SYMMETRIC || zzglkVar.zzc().zzc() == zzgkx.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return zzfwp.zza(zzh);
        } catch (zzgqy unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
