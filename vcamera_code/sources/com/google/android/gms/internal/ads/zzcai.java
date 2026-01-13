package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzcai implements Runnable {
    public final /* synthetic */ zzcan zza;

    public zzcai(zzcan zzcanVar) {
        this.zza = zzcanVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcao zzcaoVar;
        zzcao zzcaoVar2;
        zzcan zzcanVar = this.zza;
        zzcaoVar = zzcanVar.zzr;
        if (zzcaoVar != null) {
            zzcaoVar2 = zzcanVar.zzr;
            zzcaoVar2.zzh();
        }
    }
}
