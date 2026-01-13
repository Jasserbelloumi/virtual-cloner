package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.ads.zzbak;
import com.google.android.gms.internal.ads.zzbal;
import com.google.android.gms.internal.ads.zzbap;
/* loaded from: classes.dex */
public final class zzba {
    private static final zzba zza = new zzba();
    private final zzbak zzb;
    private final zzbal zzc;
    private final zzbap zzd;

    public zzba() {
        zzbak zzbakVar = new zzbak();
        zzbal zzbalVar = new zzbal();
        zzbap zzbapVar = new zzbap();
        this.zzb = zzbakVar;
        this.zzc = zzbalVar;
        this.zzd = zzbapVar;
    }

    public static zzbak zza() {
        return zza.zzb;
    }

    public static zzbal zzb() {
        return zza.zzc;
    }

    public static zzbap zzc() {
        return zza.zzd;
    }
}
