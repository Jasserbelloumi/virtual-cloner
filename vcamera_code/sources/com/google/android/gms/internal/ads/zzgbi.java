package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* loaded from: classes2.dex */
final class zzgbi implements zzfvw {
    public final zzfxb zza;
    private final zzggm zzb;

    public zzgbi(zzfxb zzfxbVar) {
        this.zza = zzfxbVar;
        this.zzb = zzfxbVar.zzf() ? zzgdd.zza().zzb().zza(zzgda.zza(zzfxbVar), "hybrid_encrypt", "encrypt") : zzgda.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfvw
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzfxb zzfxbVar = this.zza;
        if (zzfxbVar.zza() != null) {
            try {
                byte[] zzb = zzgmv.zzb(zzfxbVar.zza().zzg(), ((zzfvw) this.zza.zza().zze()).zza(bArr, bArr2));
                this.zza.zza().zza();
                int length = bArr.length;
                return zzb;
            } catch (GeneralSecurityException e) {
                throw e;
            }
        }
        throw new GeneralSecurityException("keyset without primary key");
    }
}
