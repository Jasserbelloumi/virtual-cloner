package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbnc;
import com.google.android.gms.internal.ads.zzbqv;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public class OfflinePingSender extends Worker {
    private final zzbqv zza;

    public OfflinePingSender(@oo0oO0 Context context, @oo0oO0 WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = zzay.zza().zzm(context, new zzbnc());
    }

    @Override // androidx.work.Worker
    @oo0oO0
    public final ListenableWorker.o00oOOo0 doWork() {
        try {
            this.zza.zzf();
            return new ListenableWorker.o00oOOo0.o00oOo00();
        } catch (RemoteException unused) {
            return new ListenableWorker.o00oOOo0.C0063o00oOOo0();
        }
    }
}
