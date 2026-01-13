package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes2.dex */
final class zzeam extends TimerTask {
    public final /* synthetic */ AlertDialog zza;
    public final /* synthetic */ Timer zzb;
    public final /* synthetic */ com.google.android.gms.ads.internal.overlay.zzl zzc;

    public zzeam(AlertDialog alertDialog, Timer timer, com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zza = alertDialog;
        this.zzb = timer;
        this.zzc = zzlVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.zza.dismiss();
        this.zzb.cancel();
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzc;
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }
}
