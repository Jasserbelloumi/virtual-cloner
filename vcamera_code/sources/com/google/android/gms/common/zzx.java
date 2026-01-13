package com.google.android.gms.common;

import android.util.Log;
import com.google.errorprone.annotations.CheckReturnValue;
import javax.annotation.Nullable;
import o00oOooO.oo0oO0;
/* JADX INFO: Access modifiers changed from: package-private */
@CheckReturnValue
/* loaded from: classes.dex */
public class zzx {
    private static final zzx zze = new zzx(true, 3, 1, null, null);
    public final boolean zza;
    @Nullable
    public final String zzb;
    @Nullable
    public final Throwable zzc;
    public final int zzd;

    private zzx(boolean z, int i, int i2, @Nullable String str, @Nullable Throwable th) {
        this.zza = z;
        this.zzd = i;
        this.zzb = str;
        this.zzc = th;
    }

    @Deprecated
    public static zzx zzb() {
        return zze;
    }

    public static zzx zzc(@oo0oO0 String str) {
        return new zzx(false, 1, 5, str, null);
    }

    public static zzx zzd(@oo0oO0 String str, @oo0oO0 Throwable th) {
        return new zzx(false, 1, 5, str, th);
    }

    public static zzx zzf(int i) {
        return new zzx(true, i, 1, null, null);
    }

    public static zzx zzg(int i, int i2, @oo0oO0 String str, @Nullable Throwable th) {
        return new zzx(false, i, i2, str, th);
    }

    @Nullable
    public String zza() {
        return this.zzb;
    }

    public final void zze() {
        if (this.zza || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        Throwable th = this.zzc;
        zza();
    }
}
