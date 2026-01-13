package com.google.android.gms.common.stats;

import android.support.v4.media.session.o00oOo00;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o00oOooO.oo0oO0;
@KeepForSdk
@Deprecated
/* loaded from: classes.dex */
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {

    @KeepForSdk
    /* loaded from: classes.dex */
    public interface Types {
        @KeepForSdk
        public static final int EVENT_TYPE_ACQUIRE_WAKE_LOCK = 7;
        @KeepForSdk
        public static final int EVENT_TYPE_RELEASE_WAKE_LOCK = 8;
    }

    @oo0oO0
    public final String toString() {
        long zzc = zzc();
        int zza = zza();
        long zzb = zzb();
        String zzd = zzd();
        StringBuilder sb = new StringBuilder();
        sb.append(zzc);
        sb.append("\t");
        sb.append(zza);
        sb.append("\t");
        return o00oOo00.o00oOOo0(sb, zzb, zzd);
    }

    public abstract int zza();

    public abstract long zzb();

    public abstract long zzc();

    @oo0oO0
    public abstract String zzd();
}
