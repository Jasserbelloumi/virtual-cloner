package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzcbl implements Runnable {
    private final zzcax zza;
    private boolean zzb = false;

    public zzcbl(zzcax zzcaxVar) {
        this.zza = zzcaxVar;
    }

    private final void zzc() {
        zzfkr zzfkrVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzfkrVar.removeCallbacks(this);
        zzfkrVar.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zza.zzt();
        zzc();
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzt();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
