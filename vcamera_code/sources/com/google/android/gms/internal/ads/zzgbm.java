package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
/* loaded from: classes2.dex */
final class zzgbm implements zzgbp {
    private final int zza;

    public zzgbm(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(android.support.v4.media.o00oOOo0.o00oOOo0("Unsupported key length: ", i));
        }
        this.zza = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgbp
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgbp
    public final byte[] zzb() throws GeneralSecurityException {
        int i = this.zza;
        if (i != 16) {
            if (i == 32) {
                return zzgcc.zzj;
            }
            throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
        }
        return zzgcc.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzgbp
    public final byte[] zzc(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        int length = bArr.length;
        if (length == this.zza) {
            return new zzgai(bArr, false).zzb(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException(android.support.v4.media.o00oOOo0.o00oOOo0("Unexpected key length: ", length));
    }
}
