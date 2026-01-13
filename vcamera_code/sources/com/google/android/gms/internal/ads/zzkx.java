package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* loaded from: classes2.dex */
final class zzkx extends BroadcastReceiver {
    public final /* synthetic */ zzky zza;

    public /* synthetic */ zzkx(zzky zzkyVar, zzkw zzkwVar) {
        this.zza = zzkyVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final zzky zzkyVar = this.zza;
        zzky.zzc(zzkyVar).post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkv
            @Override // java.lang.Runnable
            public final void run() {
                zzky.zzd(zzky.this);
            }
        });
    }
}
