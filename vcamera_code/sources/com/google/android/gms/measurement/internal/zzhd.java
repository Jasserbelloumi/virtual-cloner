package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhd implements Runnable {
    public final /* synthetic */ AtomicReference zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ zzhx zzc;

    public zzhd(zzhx zzhxVar, AtomicReference atomicReference, boolean z) {
        this.zzc = zzhxVar;
        this.zza = atomicReference;
        this.zzb = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzt.zzt().zzx(this.zza, this.zzb);
    }
}
