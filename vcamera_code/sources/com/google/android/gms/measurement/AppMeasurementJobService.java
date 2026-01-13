package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzjs;
import com.google.android.gms.measurement.internal.zzjt;
import o00oOooO.o0O;
import o00oOooO.oo0oO0;
@TargetApi(24)
/* loaded from: classes2.dex */
public final class AppMeasurementJobService extends JobService implements zzjs {
    private zzjt zza;

    private final zzjt zzd() {
        if (this.zza == null) {
            this.zza = new zzjt(this);
        }
        return this.zza;
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

    @Override // android.app.job.JobService
    public boolean onStartJob(@oo0oO0 JobParameters jobParameters) {
        zzd().zzi(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(@oo0oO0 JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    @o0O
    public boolean onUnbind(@oo0oO0 Intent intent) {
        zzd().zzj(intent);
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    public final void zza(@oo0oO0 Intent intent) {
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    @TargetApi(24)
    public final void zzb(@oo0oO0 JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    @Override // com.google.android.gms.measurement.internal.zzjs
    public final boolean zzc(int i) {
        throw new UnsupportedOperationException();
    }
}
