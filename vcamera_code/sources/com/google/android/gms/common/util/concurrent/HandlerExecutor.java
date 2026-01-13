package com.google.android.gms.common.util.concurrent;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.common.zzi;
import java.util.concurrent.Executor;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public class HandlerExecutor implements Executor {
    private final Handler zza;

    @KeepForSdk
    public HandlerExecutor(@oo0oO0 Looper looper) {
        this.zza = new zzi(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@oo0oO0 Runnable runnable) {
        this.zza.post(runnable);
    }
}
