package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.util.HashMap;
import o00ooOoo.oOo000Oo;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzccq implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ int zzd;
    public final /* synthetic */ long zze;
    public final /* synthetic */ long zzf;
    public final /* synthetic */ boolean zzg;
    public final /* synthetic */ int zzh;
    public final /* synthetic */ int zzi;
    public final /* synthetic */ zzccu zzj;

    public zzccq(zzccu zzccuVar, String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        this.zzj = zzccuVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = i2;
        this.zze = j;
        this.zzf = j2;
        this.zzg = z;
        this.zzh = i3;
        this.zzi = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(oOo000Oo.f9217o0O00o0o, "precacheProgress");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("bytesLoaded", Integer.toString(this.zzc));
        hashMap.put("totalBytes", Integer.toString(this.zzd));
        hashMap.put("bufferedDuration", Long.toString(this.zze));
        hashMap.put("totalDuration", Long.toString(this.zzf));
        hashMap.put("cacheReady", true != this.zzg ? SessionDescription.SUPPORTED_SDP_VERSION : "1");
        hashMap.put("playerCount", Integer.toString(this.zzh));
        hashMap.put("playerPreparedCount", Integer.toString(this.zzi));
        zzccu.zze(this.zzj, "onPrecacheEvent", hashMap);
    }
}
