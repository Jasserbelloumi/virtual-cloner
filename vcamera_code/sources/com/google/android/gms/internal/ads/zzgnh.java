package com.google.android.gms.internal.ads;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;
/* loaded from: classes2.dex */
final class zzgnh implements zzgnm {
    private final zzgnv zza;

    @Override // com.google.android.gms.internal.ads.zzgnm
    public final Object zza(String str) throws GeneralSecurityException {
        for (Provider provider : zzgnn.zzb(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL")) {
            try {
                return this.zza.zza(str, provider);
            } catch (Exception unused) {
            }
        }
        return this.zza.zza(str, null);
    }
}
