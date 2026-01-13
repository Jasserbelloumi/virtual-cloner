package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzs;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public class ConnectionTracker {
    private static final Object zzb = new Object();
    @Nullable
    private static volatile ConnectionTracker zzc;
    @VisibleForTesting
    @oo0oO0
    public ConcurrentHashMap zza = new ConcurrentHashMap();

    private ConnectionTracker() {
    }

    @oo0oO0
    @KeepForSdk
    public static ConnectionTracker getInstance() {
        if (zzc == null) {
            synchronized (zzb) {
                if (zzc == null) {
                    zzc = new ConnectionTracker();
                }
            }
        }
        ConnectionTracker connectionTracker = zzc;
        Preconditions.checkNotNull(connectionTracker);
        return connectionTracker;
    }

    private static void zzb(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private final boolean zzc(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z, @Nullable Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((Wrappers.packageManager(context).getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (zzd(serviceConnection)) {
            ServiceConnection serviceConnection2 = (ServiceConnection) this.zza.putIfAbsent(serviceConnection, serviceConnection);
            if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction());
            }
            try {
                boolean zze = zze(context, intent, serviceConnection, i, executor);
                if (zze) {
                    return zze;
                }
                return false;
            } finally {
                this.zza.remove(serviceConnection, serviceConnection);
            }
        }
        return zze(context, intent, serviceConnection, i, executor);
    }

    private static boolean zzd(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof zzs);
    }

    private static final boolean zze(Context context, Intent intent, ServiceConnection serviceConnection, int i, @Nullable Executor executor) {
        boolean bindService;
        if (!PlatformVersion.isAtLeastQ() || executor == null) {
            return context.bindService(intent, serviceConnection, i);
        }
        bindService = context.bindService(intent, i, executor, serviceConnection);
        return bindService;
    }

    @KeepForSdk
    public boolean bindService(@oo0oO0 Context context, @oo0oO0 Intent intent, @oo0oO0 ServiceConnection serviceConnection, int i) {
        return zzc(context, context.getClass().getName(), intent, serviceConnection, i, true, null);
    }

    @KeepForSdk
    public void unbindService(@oo0oO0 Context context, @oo0oO0 ServiceConnection serviceConnection) {
        if (!zzd(serviceConnection) || !this.zza.containsKey(serviceConnection)) {
            zzb(context, serviceConnection);
            return;
        }
        try {
            zzb(context, (ServiceConnection) this.zza.get(serviceConnection));
        } finally {
            this.zza.remove(serviceConnection);
        }
    }

    @KeepForSdk
    public void unbindServiceSafe(@oo0oO0 Context context, @oo0oO0 ServiceConnection serviceConnection) {
        try {
            unbindService(context, serviceConnection);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final boolean zza(@oo0oO0 Context context, @oo0oO0 String str, @oo0oO0 Intent intent, @oo0oO0 ServiceConnection serviceConnection, int i, @Nullable Executor executor) {
        return zzc(context, str, intent, serviceConnection, i, true, executor);
    }
}
