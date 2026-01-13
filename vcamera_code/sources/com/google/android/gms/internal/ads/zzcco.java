package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.util.HashMap;
import o00ooOoo.oOo000Oo;
/* loaded from: classes2.dex */
final class zzcco implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ int zzd;
    public final /* synthetic */ zzccu zze;

    public zzcco(zzccu zzccuVar, String str, String str2, int i, int i2, boolean z) {
        this.zze = zzccuVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(oOo000Oo.f9217o0O00o0o, "precacheProgress");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("bytesLoaded", Integer.toString(this.zzc));
        hashMap.put("totalBytes", Integer.toString(this.zzd));
        hashMap.put("cacheReady", SessionDescription.SUPPORTED_SDP_VERSION);
        zzccu.zze(this.zze, "onPrecacheEvent", hashMap);
    }
}
