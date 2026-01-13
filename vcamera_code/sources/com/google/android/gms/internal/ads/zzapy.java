package com.google.android.gms.internal.ads;

import java.util.HashMap;
/* loaded from: classes2.dex */
public final class zzapy extends zzaog {
    public Long zza;
    public Long zzb;
    public Long zzc;

    public zzapy() {
    }

    public zzapy(String str) {
        HashMap zza = zzaog.zza(str);
        if (zza != null) {
            this.zza = (Long) zza.get(0);
            this.zzb = (Long) zza.get(1);
            this.zzc = (Long) zza.get(2);
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
