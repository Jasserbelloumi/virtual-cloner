package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.zzjs;
import com.google.android.gms.measurement.internal.zzjt;
import o00oOooO.o0O;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O00o0o.o00oo00O;
/* loaded from: classes2.dex */
public final class AppMeasurementService extends Service implements zzjs {
    private zzjt zza;

    private final zzjt zzd() {
        if (this.zza == null) {
            this.zza = new zzjt(this);
        }
        return this.zza;
    }

    @Override // android.app.Service
    @o0O
    @o0OO00OO
    public IBinder onBind(@oo0oO0 Intent intent) {
        return zzd().zzb(intent);
    }

    @Override // android.app.Service
    @o0O
    public void onCreate() {
        super.onCreate();
        zzd().zze();
    }

    @Override // android.app.Service
    @o0O
    public void onDestroy() {
        zzd().zzf();
        super.onDestroy();
    }

    @Override // android.app.Service
    @o0O
    public void onRebind(@oo0oO0 Intent intent) {
        zzd().zzg(intent);
    }

    @Override // android.app.Service
    @o0O
    public int onStartCommand(@oo0oO0 Intent intent, int i, int i2) {
        zzd().zza(intent, i, i2);
        return 2;
    }

    @Override // android.app.Service
    @o0O
    public boolean onUnbind(@oo0oO0 Intent intent) {
        zzd().zzj(intent);
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    public final void zza(@oo0oO0 Intent intent) {
        o00oo00O.completeWakefulIntent(intent);
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    public final void zzb(@oo0oO0 JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    public final boolean zzc(int i) {
        return stopSelfResult(i);
    }
}
