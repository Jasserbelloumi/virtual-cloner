package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;
/* loaded from: classes2.dex */
final class zzdfe implements zzbhp {
    private final WeakReference zza;

    public /* synthetic */ zzdfe(zzdff zzdffVar, zzdfd zzdfdVar) {
        this.zza = new WeakReference(zzdffVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final void zza(Object obj, Map map) {
        zzdff zzdffVar = (zzdff) this.zza.get();
        if (zzdffVar == null) {
            return;
        }
        zzdff.zzc(zzdffVar).zza();
    }
}
