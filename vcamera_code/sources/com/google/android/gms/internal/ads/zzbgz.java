package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
/* loaded from: classes2.dex */
final class zzbgz implements zzbhp {
    @Override // com.google.android.gms.internal.ads.zzbhp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        String str;
        zzcei zzceiVar = (zzcei) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            str = "Missing App Id, cannot show LMD Overlay without it";
        } else {
            zzfly zzj = zzflz.zzj();
            zzj.zzb((String) map.get("appId"));
            zzj.zzh(zzceiVar.getWidth());
            zzj.zzg(zzceiVar.zzF().getWindowToken());
            zzj.zzd((map.containsKey("gravityX") && map.containsKey("gravityY")) ? Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")) : 81);
            zzj.zze(map.containsKey("verticalMargin") ? Float.parseFloat((String) map.get("verticalMargin")) : 0.02f);
            if (map.containsKey("enifd")) {
                zzj.zza((String) map.get("enifd"));
            }
            try {
                com.google.android.gms.ads.internal.zzt.zzj().zzj(zzceiVar, zzj.zzi());
                return;
            } catch (NullPointerException e) {
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "DefaultGmsgHandlers.ShowLMDOverlay");
                str = "Missing parameters for LMD Overlay show request";
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza(str);
    }
}
