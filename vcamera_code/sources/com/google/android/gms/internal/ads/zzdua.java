package com.google.android.gms.internal.ads;

import java.util.UUID;
/* loaded from: classes2.dex */
public final class zzdua implements zzgwy {
    public static zzdua zza() {
        zzdua zzduaVar;
        zzduaVar = zzdtz.zza;
        return zzduaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final /* synthetic */ Object zzb() {
        com.google.android.gms.ads.internal.zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        zzgxg.zzb(uuid);
        return uuid;
    }
}
