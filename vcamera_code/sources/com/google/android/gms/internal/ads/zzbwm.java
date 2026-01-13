package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbwm extends zzbxg {
    private final Clock zzb;
    private final zzbwm zzc = this;
    private final zzgxl zzd;
    private final zzgxl zze;
    private final zzgxl zzf;
    private final zzgxl zzg;
    private final zzgxl zzh;
    private final zzgxl zzi;
    private final zzgxl zzj;
    private final zzgxl zzk;

    public /* synthetic */ zzbwm(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzbxf zzbxfVar, zzbwl zzbwlVar) {
        this.zzb = clock;
        zzgwy zza = zzgwz.zza(context);
        this.zzd = zza;
        zzgwy zza2 = zzgwz.zza(zzgVar);
        this.zze = zza2;
        zzgwy zza3 = zzgwz.zza(zzbxfVar);
        this.zzf = zza3;
        this.zzg = zzgwx.zzc(new zzbwe(zza, zza2, zza3));
        zzgwy zza4 = zzgwz.zza(clock);
        this.zzh = zza4;
        zzgxl zzc = zzgwx.zzc(new zzbwg(zza4, zza2, zza3));
        this.zzi = zzc;
        zzbwi zzbwiVar = new zzbwi(zza4, zzc);
        this.zzj = zzbwiVar;
        this.zzk = zzgwx.zzc(new zzbxl(zza, zzbwiVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbxg
    public final zzbwd zza() {
        return (zzbwd) this.zzg.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbxg
    public final zzbwh zzb() {
        return new zzbwh(this.zzb, (zzbwf) this.zzi.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzbxg
    public final zzbxk zzc() {
        return (zzbxk) this.zzk.zzb();
    }
}
