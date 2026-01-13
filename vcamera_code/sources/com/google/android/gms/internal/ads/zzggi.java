package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* loaded from: classes2.dex */
public final class zzggi implements zzgfd {
    private final zzgfk zza;

    public zzggi(zzgfk zzgfkVar) throws GeneralSecurityException {
        if (!zzgas.zza(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zza = zzgfkVar;
    }
}
