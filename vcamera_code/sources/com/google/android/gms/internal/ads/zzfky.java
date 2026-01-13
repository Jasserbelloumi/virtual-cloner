package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfky extends zzfsx {
    public Object zza;

    public zzfky(Object obj) {
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    public final String zza() {
        Object obj = this.zza;
        return obj == null ? "" : obj.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    public final void zzb() {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    public final boolean zzd(Object obj) {
        return super.zzd(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfsx
    public final boolean zze(Throwable th) {
        return super.zze(th);
    }
}
