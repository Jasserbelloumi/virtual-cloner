package com.google.android.gms.measurement.internal;

import android.os.Handler;
import o00oOooO.oO0Oo;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzjy {
    public final /* synthetic */ zzkc zza;
    private zzjx zzb;

    public zzjy(zzkc zzkcVar) {
        this.zza = zzkcVar;
    }

    @oO0Oo
    public final void zza(long j) {
        Handler handler;
        this.zzb = new zzjx(this, this.zza.zzt.zzav().currentTimeMillis(), j);
        handler = this.zza.zzd;
        handler.postDelayed(this.zzb, 2000L);
    }

    @oO0Oo
    public final void zzb() {
        Handler handler;
        this.zza.zzg();
        zzjx zzjxVar = this.zzb;
        if (zzjxVar != null) {
            handler = this.zza.zzd;
            handler.removeCallbacks(zzjxVar);
        }
        this.zza.zzt.zzm().zzm.zza(false);
    }
}
