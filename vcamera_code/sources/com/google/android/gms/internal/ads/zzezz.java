package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
/* loaded from: classes2.dex */
public final class zzezz implements zzgwy {
    private final zzezy zza;

    public zzezz(zzezy zzezyVar) {
        this.zza = zzezyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* synthetic */ Object zzb() {
        Clock defaultClock = DefaultClock.getInstance();
        zzgxg.zzb(defaultClock);
        return defaultClock;
    }
}
