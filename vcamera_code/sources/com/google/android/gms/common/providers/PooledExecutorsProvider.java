package com.google.android.gms.common.providers;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.ScheduledExecutorService;
import o00oOooO.oo0oO0;
@KeepForSdk
@Deprecated
/* loaded from: classes.dex */
public class PooledExecutorsProvider {
    private static PooledExecutorFactory zza;

    /* loaded from: classes.dex */
    public interface PooledExecutorFactory {
        @oo0oO0
        @KeepForSdk
        @Deprecated
        ScheduledExecutorService newSingleThreadScheduledExecutor();
    }

    private PooledExecutorsProvider() {
    }

    @oo0oO0
    @KeepForSdk
    @Deprecated
    public static synchronized PooledExecutorFactory getInstance() {
        PooledExecutorFactory pooledExecutorFactory;
        synchronized (PooledExecutorsProvider.class) {
            if (zza == null) {
                zza = new zza();
            }
            pooledExecutorFactory = zza;
        }
        return pooledExecutorFactory;
    }
}
