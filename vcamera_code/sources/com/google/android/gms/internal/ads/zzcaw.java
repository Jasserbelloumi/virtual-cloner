package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzcaw implements Runnable {
    public final /* synthetic */ boolean zza;
    public final /* synthetic */ zzcax zzb;

    public zzcaw(zzcax zzcaxVar, boolean z) {
        this.zzb = zzcaxVar;
        this.zza = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzK("windowVisibilityChanged", "isVisible", String.valueOf(this.zza));
    }
}
