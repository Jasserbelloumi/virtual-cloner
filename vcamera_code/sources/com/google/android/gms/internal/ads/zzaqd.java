package com.google.android.gms.internal.ads;

import java.util.HashMap;
/* loaded from: classes2.dex */
public final class zzaqd extends zzaog {
    public long zza;
    public long zzb;

    public zzaqd() {
        this.zza = -1L;
        this.zzb = -1L;
    }

    public zzaqd(String str) {
        this.zza = -1L;
        this.zzb = -1L;
        HashMap zza = zzaog.zza(str);
        if (zza != null) {
            this.zza = ((Long) zza.get(0)).longValue();
            this.zzb = ((Long) zza.get(1)).longValue();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final HashMap zzb() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, Long.valueOf(this.zza));
        hashMap.put(1, Long.valueOf(this.zzb));
        return hashMap;
    }
}
