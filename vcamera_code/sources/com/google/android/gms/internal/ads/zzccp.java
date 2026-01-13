package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.util.HashMap;
import o00ooOoo.oOo000Oo;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzccp implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ long zzd;
    public final /* synthetic */ long zze;
    public final /* synthetic */ long zzf;
    public final /* synthetic */ long zzg;
    public final /* synthetic */ boolean zzh;
    public final /* synthetic */ int zzi;
    public final /* synthetic */ int zzj;
    public final /* synthetic */ zzccu zzk;

    public zzccp(zzccu zzccuVar, String str, String str2, long j, long j2, long j3, long j4, long j5, boolean z, int i, int i2) {
        this.zzk = zzccuVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = j3;
        this.zzf = j4;
        this.zzg = j5;
        this.zzh = z;
        this.zzi = i;
        this.zzj = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(oOo000Oo.f9217o0O00o0o, "precacheProgress");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("bufferedDuration", Long.toString(this.zzc));
        hashMap.put("totalDuration", Long.toString(this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbG)).booleanValue()) {
            hashMap.put("qoeLoadedBytes", Long.toString(this.zze));
            hashMap.put("qoeCachedBytes", Long.toString(this.zzf));
            hashMap.put("totalBytes", Long.toString(this.zzg));
            hashMap.put("reportTime", Long.toString(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
        }
        hashMap.put("cacheReady", true != this.zzh ? SessionDescription.SUPPORTED_SDP_VERSION : "1");
        hashMap.put("playerCount", Integer.toString(this.zzi));
        hashMap.put("playerPreparedCount", Integer.toString(this.zzj));
        zzccu.zze(this.zzk, "onPrecacheEvent", hashMap);
    }
}
