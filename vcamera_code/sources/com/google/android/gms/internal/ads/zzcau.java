package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzcau implements Runnable {
    public final /* synthetic */ zzcax zza;

    public zzcau(zzcax zzcaxVar) {
        this.zza = zzcaxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzK("surfaceCreated", new String[0]);
    }
}
