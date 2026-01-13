package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhq implements Runnable {
    public final /* synthetic */ Boolean zza;
    public final /* synthetic */ zzhx zzb;

    public zzhq(zzhx zzhxVar, Boolean bool) {
        this.zzb = zzhxVar;
        this.zza = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzaa(this.zza, true);
    }
}
