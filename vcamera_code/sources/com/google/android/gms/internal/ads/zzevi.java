package com.google.android.gms.internal.ads;

import javax.annotation.concurrent.GuardedBy;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzevi implements zzevt {
    @GuardedBy("this")
    @o0OO00OO
    private zzctw zza;

    @Override // com.google.android.gms.internal.ads.zzevt
    /* renamed from: zza */
    public final synchronized zzctw zzd() {
        return this.zza;
    }

    public final synchronized zzfut zzb(zzevu zzevuVar, zzevs zzevsVar, @o0OO00OO zzctw zzctwVar) {
        zzcrt zzb;
        if (zzctwVar != null) {
            this.zza = zzctwVar;
        } else {
            this.zza = (zzctw) zzevsVar.zza(zzevuVar.zzb).zzh();
        }
        zzb = this.zza.zzb();
        return zzb.zzi(zzb.zzj());
    }

    @Override // com.google.android.gms.internal.ads.zzevt
    public final /* bridge */ /* synthetic */ zzfut zzc(zzevu zzevuVar, zzevs zzevsVar, @o0OO00OO Object obj) {
        return zzb(zzevuVar, zzevsVar, null);
    }
}
