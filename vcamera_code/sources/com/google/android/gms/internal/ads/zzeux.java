package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzeux implements zzfbd {
    private final zzevt zza;

    public zzeux(zzevt zzevtVar) {
        this.zza = zzevtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfbd
    public final zzfut zza(zzfbe zzfbeVar) {
        zzeuy zzeuyVar = (zzeuy) zzfbeVar;
        return ((zzeuu) this.zza).zzb(zzeuyVar.zzb, zzeuyVar.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfbd
    public final void zzb(zzfas zzfasVar) {
        zzfasVar.zza = ((zzeuu) this.zza).zza();
    }
}
