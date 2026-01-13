package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* loaded from: classes2.dex */
public final class zzgaw extends zzgcu {
    public zzgaw() {
        super(zzgip.class, new zzgau(zzfvu.class));
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final zzgct zza() {
        return new zzgav(this, zzgis.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final zzgkx zzb() {
        return zzgkx.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* synthetic */ zzgrw zzc(zzgpe zzgpeVar) throws zzgqy {
        return zzgip.zze(zzgpeVar, zzgpy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void zze(zzgrw zzgrwVar) throws GeneralSecurityException {
        zzgip zzgipVar = (zzgip) zzgrwVar;
        zzgog.zzb(zzgipVar.zza(), 0);
        if (zzgipVar.zzf().zzd() != 64) {
            throw new InvalidKeyException(o00ooO0.o00oOoO.o00oOOo0("invalid key size: ", zzgipVar.zzf().zzd(), ". Valid keys must have 64 bytes."));
        }
    }
}
