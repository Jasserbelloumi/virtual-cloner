package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdLoadCallback;
/* loaded from: classes.dex */
public final class zzh extends zzbj {
    private final AdLoadCallback zza;
    private final Object zzb;

    public zzh(AdLoadCallback adLoadCallback, Object obj) {
        this.zza = adLoadCallback;
        this.zzb = obj;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzb(zze zzeVar) {
        if (this.zza != null) {
            zzeVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzc() {
        if (this.zza == null || this.zzb != null) {
        }
    }
}
