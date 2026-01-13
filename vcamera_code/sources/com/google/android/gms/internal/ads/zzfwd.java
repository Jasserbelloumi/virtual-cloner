package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;
/* loaded from: classes2.dex */
final class zzfwd implements zzfwe {
    public final /* synthetic */ zzgdy zza;
    public final /* synthetic */ zzgcu zzb;

    public zzfwd(zzgdy zzgdyVar, zzgcu zzgcuVar) {
        this.zza = zzgdyVar;
        this.zzb = zzgcuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwe
    public final zzfvy zza(Class cls) throws GeneralSecurityException {
        try {
            return new zzfxd(this.zza, this.zzb, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfwe
    public final zzfvy zzb() {
        zzgdy zzgdyVar = this.zza;
        return new zzfxd(zzgdyVar, this.zzb, zzgdyVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzfwe
    public final Class zzc() {
        return this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzfwe
    public final Class zzd() {
        return this.zzb.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzfwe
    public final Set zze() {
        return this.zza.zzl();
    }
}
