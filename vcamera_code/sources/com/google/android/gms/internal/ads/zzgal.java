package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* loaded from: classes2.dex */
public final class zzgal extends zzgam {
    public zzgal(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgam
    public final zzgak zza(byte[] bArr, int i) throws InvalidKeyException {
        return new zzgaj(bArr, i);
    }
}
