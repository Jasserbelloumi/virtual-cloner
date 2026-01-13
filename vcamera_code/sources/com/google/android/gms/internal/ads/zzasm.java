package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public abstract class zzasm implements Callable {
    public final String zza = getClass().getSimpleName();
    public final zzaqx zzb;
    public final String zzc;
    public final String zzd;
    public final zzamv zze;
    public Method zzf;
    public final int zzg;
    public final int zzh;

    public zzasm(zzaqx zzaqxVar, String str, String str2, zzamv zzamvVar, int i, int i2) {
        this.zzb = zzaqxVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzamvVar;
        this.zzg = i;
        this.zzh = i2;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() throws Exception {
        zzk();
        return null;
    }

    public abstract void zza() throws IllegalAccessException, InvocationTargetException;

    public Void zzk() throws Exception {
        long nanoTime;
        Method zzj;
        int i;
        try {
            nanoTime = System.nanoTime();
            zzj = this.zzb.zzj(this.zzc, this.zzd);
            this.zzf = zzj;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        if (zzj == null) {
            return null;
        }
        zza();
        zzapr zzd = this.zzb.zzd();
        if (zzd != null && (i = this.zzg) != Integer.MIN_VALUE) {
            zzd.zzc(this.zzh, i, (System.nanoTime() - nanoTime) / 1000, null, null);
        }
        return null;
    }
}
