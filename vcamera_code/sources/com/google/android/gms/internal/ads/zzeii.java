package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzeii implements zzeiq {
    public final /* synthetic */ zzeij zza;

    public zzeii(zzeij zzeijVar) {
        this.zza = zzeijVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeiq
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeiq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdcv zzdcvVar;
        zzdcv zzdcvVar2 = (zzdcv) obj;
        synchronized (this.zza) {
            this.zza.zzi = zzdcvVar2;
            zzdcvVar = this.zza.zzi;
            zzdcvVar.zzj();
        }
    }
}
