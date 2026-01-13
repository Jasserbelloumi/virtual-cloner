package com.google.android.gms.internal.ads;

import java.util.HashMap;
/* loaded from: classes2.dex */
public final class zzaqs extends zzaog {
    public Long zza;
    public Long zzb;

    public zzaqs() {
    }

    public zzaqs(String str) {
        HashMap zza = zzaog.zza(str);
        if (zza != null) {
            this.zza = (Long) zza.get(0);
            this.zzb = (Long) zza.get(1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final HashMap zzb() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(1, this.zzb);
        return hashMap;
    }
}
