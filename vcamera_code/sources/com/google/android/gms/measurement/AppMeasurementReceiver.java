package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzfa;
import o00oOooO.o0O;
import o00oOooO.oo0oO0;
import o0O00o0o.o00oo00O;
/* loaded from: classes2.dex */
public final class AppMeasurementReceiver extends o00oo00O implements zzfa.zza {
    private zzfa zza;

    @oo0oO0
    public BroadcastReceiver.PendingResult doGoAsync() {
        return goAsync();
    }

    @Override // com.google.android.gms.measurement.internal.zzfa.zza
    @o0O
    public void doStartService(@oo0oO0 Context context, @oo0oO0 Intent intent) {
        o00oo00O.startWakefulService(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    @o0O
    public void onReceive(@oo0oO0 Context context, @oo0oO0 Intent intent) {
        if (this.zza == null) {
            this.zza = new zzfa(this);
        }
        this.zza.zza(context, intent);
    }
}
