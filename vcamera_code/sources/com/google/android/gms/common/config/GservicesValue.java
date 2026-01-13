package com.google.android.gms.common.config;

import android.os.Binder;
import android.os.StrictMode;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public abstract class GservicesValue<T> {
    private static final Object zzc = new Object();
    @oo0oO0
    public final String zza;
    @oo0oO0
    public final Object zzb;
    @o0OO00OO
    private Object zzd = null;

    public GservicesValue(@oo0oO0 String str, @oo0oO0 Object obj) {
        this.zza = str;
        this.zzb = obj;
    }

    @KeepForSdk
    public static boolean isInitialized() {
        synchronized (zzc) {
        }
        return false;
    }

    @oo0oO0
    @KeepForSdk
    public static GservicesValue<Float> value(@oo0oO0 String str, @oo0oO0 Float f) {
        return new zzd(str, f);
    }

    @oo0oO0
    @KeepForSdk
    public static GservicesValue<Integer> value(@oo0oO0 String str, @oo0oO0 Integer num) {
        return new zzc(str, num);
    }

    @oo0oO0
    @KeepForSdk
    public static GservicesValue<Long> value(@oo0oO0 String str, @oo0oO0 Long l) {
        return new zzb(str, l);
    }

    @oo0oO0
    @KeepForSdk
    public static GservicesValue<String> value(@oo0oO0 String str, @oo0oO0 String str2) {
        return new zze(str, str2);
    }

    @oo0oO0
    @KeepForSdk
    public static GservicesValue<Boolean> value(@oo0oO0 String str, boolean z) {
        return new zza(str, Boolean.valueOf(z));
    }

    @oo0oO0
    @KeepForSdk
    public final T get() {
        T t = (T) this.zzd;
        if (t != null) {
            return t;
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        Object obj = zzc;
        synchronized (obj) {
        }
        synchronized (obj) {
        }
        try {
            return (T) zza(this.zza);
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            T t2 = (T) zza(this.zza);
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return t2;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    @oo0oO0
    @KeepForSdk
    @Deprecated
    public final T getBinderSafe() {
        return get();
    }

    @VisibleForTesting
    @KeepForSdk
    public void override(@oo0oO0 T t) {
        this.zzd = t;
        Object obj = zzc;
        synchronized (obj) {
            synchronized (obj) {
            }
        }
    }

    @VisibleForTesting
    @KeepForSdk
    public void resetOverride() {
        this.zzd = null;
    }

    @oo0oO0
    public abstract Object zza(@oo0oO0 String str);
}
