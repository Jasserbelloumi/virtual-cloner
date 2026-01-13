package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class zzfds {
    private final Context zza;
    private final String zzb;
    private final String zzc;

    public zzfds(Context context, zzbzg zzbzgVar) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = zzbzgVar.zza;
    }

    public final void zza(Map map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzt.zzp();
        map.put("device", com.google.android.gms.ads.internal.util.zzs.zzp());
        map.put("app", this.zzb);
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean zzA = com.google.android.gms.ads.internal.util.zzs.zzA(this.zza);
        String str = SessionDescription.SUPPORTED_SDP_VERSION;
        map.put("is_lite_sdk", true != zzA ? SessionDescription.SUPPORTED_SDP_VERSION : "1");
        List zzb = zzbar.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgw)).booleanValue()) {
            zzb.addAll(com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzd());
        }
        map.put("e", TextUtils.join(",", zzb));
        map.put(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzjA)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (true == com.google.android.gms.ads.internal.util.zzs.zzx(this.zza)) {
                str = "1";
            }
            map.put("is_bstar", str);
        }
    }
}
