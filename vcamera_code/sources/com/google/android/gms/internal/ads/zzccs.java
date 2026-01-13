package com.google.android.gms.internal.ads;

import java.util.HashMap;
import o00ooOoo.oOo000Oo;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzccs implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ zzccu zzd;

    public zzccs(zzccu zzccuVar, String str, String str2, long j) {
        this.zzd = zzccuVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(oOo000Oo.f9217o0O00o0o, "precacheComplete");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("totalDuration", Long.toString(this.zzc));
        zzccu.zze(this.zzd, "onPrecacheEvent", hashMap);
    }
}
