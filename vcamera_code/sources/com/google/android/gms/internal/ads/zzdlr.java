package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzdlr implements zzbie {
    private final zzcvv zza;
    @o0OO00OO
    private final zzbup zzb;
    private final String zzc;
    private final String zzd;

    public zzdlr(zzcvv zzcvvVar, zzeyc zzeycVar) {
        this.zza = zzcvvVar;
        this.zzb = zzeycVar.zzm;
        this.zzc = zzeycVar.zzk;
        this.zzd = zzeycVar.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbie
    @ParametersAreNonnullByDefault
    public final void zza(zzbup zzbupVar) {
        int i;
        String str;
        zzbup zzbupVar2 = this.zzb;
        if (zzbupVar2 != null) {
            zzbupVar = zzbupVar2;
        }
        if (zzbupVar != null) {
            str = zzbupVar.zza;
            i = zzbupVar.zzb;
        } else {
            i = 1;
            str = "";
        }
        this.zza.zzd(new zzbua(str, i), this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbie
    public final void zzb() {
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbie
    public final void zzc() {
        this.zza.zzf();
    }
}
