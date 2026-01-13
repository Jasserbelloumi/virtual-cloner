package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
/* loaded from: classes2.dex */
final class zzjh implements Runnable {
    public final /* synthetic */ ComponentName zza;
    public final /* synthetic */ zzjl zzb;

    public zzjh(zzjl zzjlVar, ComponentName componentName) {
        this.zzb = zzjlVar;
        this.zza = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjm.zzo(this.zzb.zza, this.zza);
    }
}
