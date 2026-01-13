package com.google.android.gms.internal.ads;

import javax.annotation.concurrent.GuardedBy;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzevj implements zzevt {
    private final zzevt zza;
    @GuardedBy("this")
    @o0OO00OO
    private zzctw zzb;

    public zzevj(zzevt zzevtVar) {
        this.zza = zzevtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevt
    /* renamed from: zza */
    public final synchronized zzctw zzd() {
        return this.zzb;
    }

    public final synchronized zzfut zzb(zzevu zzevuVar, zzevs zzevsVar, @o0OO00OO zzctw zzctwVar) {
        this.zzb = zzctwVar;
        if (zzevuVar.zza == null) {
            return ((zzevi) this.zza).zzb(zzevuVar, zzevsVar, zzctwVar);
        }
        zzcrt zzb = zzctwVar.zzb();
        return zzb.zzi(zzb.zzk(zzfuj.zzh(zzevuVar.zza)));
    }

    @Override // com.google.android.gms.internal.ads.zzevt
    public final /* bridge */ /* synthetic */ zzfut zzc(zzevu zzevuVar, zzevs zzevsVar, @o0OO00OO Object obj) {
        return zzb(zzevuVar, zzevsVar, null);
    }
}
