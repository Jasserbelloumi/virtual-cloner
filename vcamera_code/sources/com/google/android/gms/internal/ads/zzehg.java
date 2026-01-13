package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzehg implements zzeiq {
    public final /* synthetic */ zzehh zza;

    public zzehg(zzehh zzehhVar) {
        this.zza = zzehhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeiq
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzh = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeiq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcok zzcokVar;
        zzcok zzcokVar2;
        zzcok zzcokVar3;
        zzcok zzcokVar4 = (zzcok) obj;
        synchronized (this.zza) {
            zzehh zzehhVar = this.zza;
            zzcokVar = zzehhVar.zzh;
            if (zzcokVar != null) {
                zzcokVar3 = zzehhVar.zzh;
                zzcokVar3.zzb();
            }
            this.zza.zzh = zzcokVar4;
            zzcokVar2 = this.zza.zzh;
            zzcokVar2.zzj();
        }
    }
}
