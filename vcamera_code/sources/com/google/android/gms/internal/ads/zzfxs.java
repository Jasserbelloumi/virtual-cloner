package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfxs extends zzgct {
    public final /* synthetic */ zzfxt zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfxs(zzfxt zzfxtVar, Class cls) {
        super(cls);
        this.zza = zzfxtVar;
    }

    public static final zzghl zzf(zzgho zzghoVar) throws GeneralSecurityException {
        zzghk zzc = zzghl.zzc();
        zzc.zzb(zzghoVar.zzg());
        zzc.zza(zzgpe.zzv(zzgoe.zza(zzghoVar.zza())));
        zzc.zzc(0);
        return (zzghl) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* bridge */ /* synthetic */ zzgrw zza(zzgrw zzgrwVar) throws GeneralSecurityException {
        return zzf((zzgho) zzgrwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    public final /* synthetic */ zzgrw zzb(zzgpe zzgpeVar) throws zzgqy {
        return zzgho.zzf(zzgpeVar, zzgpy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgct
    /* renamed from: zze */
    public final void zzd(zzgho zzghoVar) throws GeneralSecurityException {
        zzgog.zza(zzghoVar.zza());
        zzfxt zzfxtVar = this.zza;
        zzfxt.zzm(zzghoVar.zzg());
    }
}
