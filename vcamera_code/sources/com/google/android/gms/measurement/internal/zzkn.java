package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes2.dex */
final class zzkn implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb = "_err";
    public final /* synthetic */ Bundle zzc;
    public final /* synthetic */ zzko zzd;

    public zzkn(zzko zzkoVar, String str, String str2, Bundle bundle) {
        this.zzd = zzkoVar;
        this.zza = str;
        this.zzc = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzd.zza.zzF((zzaw) Preconditions.checkNotNull(this.zzd.zza.zzv().zzz(this.zza, this.zzb, this.zzc, "auto", this.zzd.zza.zzav().currentTimeMillis(), false, true)), this.zza);
    }
}
