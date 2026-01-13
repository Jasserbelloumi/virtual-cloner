package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
/* loaded from: classes2.dex */
final class zzgcd implements zzgbt {
    private final zzgbo zza;
    private final int zzb;

    private zzgcd(zzgbo zzgboVar, int i) {
        this.zza = zzgboVar;
        this.zzb = i;
    }

    public static zzgcd zzc(int i) throws GeneralSecurityException {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? new zzgcd(new zzgbo("HmacSha512"), 3) : new zzgcd(new zzgbo("HmacSha384"), 2) : new zzgcd(new zzgbo("HmacSha256"), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzgbt
    public final zzgbu zza(byte[] bArr) throws GeneralSecurityException {
        KeyPair zzb = zzgne.zzb(zzgne.zzh(this.zzb));
        byte[] zze = zzgne.zze((ECPrivateKey) zzb.getPrivate(), zzgne.zzg(zzgne.zzh(this.zzb), 1, bArr));
        byte[] zzi = zzgne.zzi(this.zzb, 1, ((ECPublicKey) zzb.getPublic()).getW());
        byte[] zzb2 = zzgmv.zzb(zzi, bArr);
        byte[] zzd = zzgcc.zzd(zzb());
        zzgbo zzgboVar = this.zza;
        return new zzgbu(zzgboVar.zzb(null, zze, "eae_prk", zzb2, "shared_secret", zzd, zzgboVar.zza()), zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzgbt
    public final byte[] zzb() throws GeneralSecurityException {
        int i = this.zzb - 1;
        return i != 0 ? i != 1 ? zzgcc.zze : zzgcc.zzd : zzgcc.zzc;
    }
}
