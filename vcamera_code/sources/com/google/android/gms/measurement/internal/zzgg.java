package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
final class zzgg implements Callable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzgj zzb;

    public zzgg(zzgj zzgjVar, String str) {
        this.zzb = zzgjVar;
        this.zza = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzkt zzktVar;
        zzkt zzktVar2;
        zzktVar = this.zzb.zza;
        zzktVar.zzA();
        zzktVar2 = this.zzb.zza;
        return zzktVar2.zzi().zzu(this.zza);
    }
}
