package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzaks;
import com.google.android.gms.internal.ads.zzakx;
import com.google.android.gms.internal.ads.zzbza;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbh implements zzaks {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzbl zzb;

    public zzbh(zzbo zzboVar, String str, zzbl zzblVar) {
        this.zza = str;
        this.zzb = zzblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaks
    public final void zza(zzakx zzakxVar) {
        String str = this.zza;
        String obj = zzakxVar.toString();
        zzbza.zzj("Failed to load URL: " + str + "\n" + obj);
        this.zzb.zza((Object) null);
    }
}
