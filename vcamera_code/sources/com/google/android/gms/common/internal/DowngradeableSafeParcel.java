package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    private static final Object zza = new Object();
    private boolean zzb = false;

    @KeepForSdk
    public static boolean canUnparcelSafely(@oo0oO0 String str) {
        synchronized (zza) {
        }
        return true;
    }

    @o0OO00OO
    @KeepForSdk
    public static Integer getUnparcelClientVersion() {
        synchronized (zza) {
        }
        return null;
    }

    @KeepForSdk
    public abstract boolean prepareForClientVersion(int i);

    @KeepForSdk
    public void setShouldDowngrade(boolean z) {
        this.zzb = z;
    }

    @KeepForSdk
    public boolean shouldDowngrade() {
        return this.zzb;
    }
}
