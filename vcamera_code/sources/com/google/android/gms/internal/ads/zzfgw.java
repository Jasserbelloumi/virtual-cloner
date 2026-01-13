package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfgw implements Runnable {
    public final /* synthetic */ zzfhb zza;

    public zzfgw(zzfhb zzfhbVar) {
        this.zza = zzfhbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfgv zzfgvVar;
        zzfgvVar = this.zza.zzl;
        zzfgvVar.zzb();
    }
}
