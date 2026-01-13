package com.google.android.gms.internal.ads;

import android.view.View;
/* loaded from: classes2.dex */
final class zzegh implements com.google.android.gms.ads.internal.zzf {
    public final /* synthetic */ zzbzs zza;
    public final /* synthetic */ zzeyo zzb;
    public final /* synthetic */ zzeyc zzc;
    public final /* synthetic */ zzegn zzd;
    public final /* synthetic */ zzegi zze;

    public zzegh(zzegi zzegiVar, zzbzs zzbzsVar, zzeyo zzeyoVar, zzeyc zzeycVar, zzegn zzegnVar) {
        this.zze = zzegiVar;
        this.zza = zzbzsVar;
        this.zzb = zzeyoVar;
        this.zzc = zzeycVar;
        this.zzd = zzegnVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zza(View view) {
        zzegr zzegrVar;
        zzbzs zzbzsVar = this.zza;
        zzegrVar = this.zze.zzd;
        zzbzsVar.zzd(zzegrVar.zza(this.zzb, this.zzc, view, this.zzd));
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
    }
}
