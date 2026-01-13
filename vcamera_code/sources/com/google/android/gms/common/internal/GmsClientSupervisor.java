package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.Executor;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public abstract class GmsClientSupervisor {
    @VisibleForTesting
    @o0OO00OO
    public static HandlerThread zza = null;
    private static int zzb = 4225;
    private static final Object zzc = new Object();
    @o0OO00OO
    private static zzr zzd;
    private static boolean zze;

    @KeepForSdk
    public static int getDefaultBindFlags() {
        return zzb;
    }

    @oo0oO0
    @KeepForSdk
    public static GmsClientSupervisor getInstance(@oo0oO0 Context context) {
        synchronized (zzc) {
            if (zzd == null) {
                zzd = new zzr(context.getApplicationContext(), zze ? getOrStartHandlerThread().getLooper() : context.getMainLooper());
            }
        }
        return zzd;
    }

    @oo0oO0
    @KeepForSdk
    public static HandlerThread getOrStartHandlerThread() {
        synchronized (zzc) {
            HandlerThread handlerThread = zza;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            zza = handlerThread2;
            handlerThread2.start();
            return zza;
        }
    }

    @KeepForSdk
    public static void setUseHandlerThreadForCallbacks() {
        synchronized (zzc) {
            zzr zzrVar = zzd;
            if (zzrVar != null && !zze) {
                zzrVar.zzi(getOrStartHandlerThread().getLooper());
            }
            zze = true;
        }
    }

    @KeepForSdk
    public boolean bindService(@oo0oO0 ComponentName componentName, @oo0oO0 ServiceConnection serviceConnection, @oo0oO0 String str) {
        return zzc(new zzn(componentName, getDefaultBindFlags()), serviceConnection, str, null);
    }

    @KeepForSdk
    public boolean bindService(@oo0oO0 String str, @oo0oO0 ServiceConnection serviceConnection, @oo0oO0 String str2) {
        return zzc(new zzn(str, getDefaultBindFlags(), false), serviceConnection, str2, null);
    }

    @KeepForSdk
    public void unbindService(@oo0oO0 ComponentName componentName, @oo0oO0 ServiceConnection serviceConnection, @oo0oO0 String str) {
        zza(new zzn(componentName, getDefaultBindFlags()), serviceConnection, str);
    }

    @KeepForSdk
    public void unbindService(@oo0oO0 String str, @oo0oO0 ServiceConnection serviceConnection, @oo0oO0 String str2) {
        zza(new zzn(str, getDefaultBindFlags(), false), serviceConnection, str2);
    }

    public abstract void zza(zzn zznVar, ServiceConnection serviceConnection, String str);

    public final void zzb(@oo0oO0 String str, @oo0oO0 String str2, int i, @oo0oO0 ServiceConnection serviceConnection, @oo0oO0 String str3, boolean z) {
        zza(new zzn(str, str2, i, z), serviceConnection, str3);
    }

    public abstract boolean zzc(zzn zznVar, ServiceConnection serviceConnection, String str, @o0OO00OO Executor executor);
}
