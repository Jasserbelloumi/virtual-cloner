package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzcav implements Runnable {
    public final /* synthetic */ zzcax zza;

    public zzcav(zzcax zzcaxVar) {
        this.zza = zzcaxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzK("surfaceDestroyed", new String[0]);
    }
}
