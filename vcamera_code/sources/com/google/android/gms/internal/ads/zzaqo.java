package com.google.android.gms.internal.ads;

import java.util.HashMap;
/* loaded from: classes2.dex */
public final class zzaqo extends zzaog {
    public Long zza;
    public Boolean zzb;
    public Boolean zzc;

    public zzaqo() {
    }

    public zzaqo(String str) {
        HashMap zza = zzaog.zza(str);
        if (zza != null) {
            this.zza = (Long) zza.get(0);
            this.zzb = (Boolean) zza.get(1);
            this.zzc = (Boolean) zza.get(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final HashMap zzb() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(1, this.zzb);
        hashMap.put(2, this.zzc);
        return hashMap;
    }
}
