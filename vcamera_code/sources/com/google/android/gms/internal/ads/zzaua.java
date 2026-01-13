package com.google.android.gms.internal.ads;

import android.view.View;
/* loaded from: classes2.dex */
final class zzaua implements Runnable {
    public final /* synthetic */ View zza;
    public final /* synthetic */ zzaue zzb;

    public zzaua(zzaue zzaueVar, View view) {
        this.zzb = zzaueVar;
        this.zza = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc(this.zza);
    }
}
