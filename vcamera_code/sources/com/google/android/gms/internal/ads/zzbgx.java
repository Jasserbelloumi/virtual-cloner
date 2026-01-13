package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
final class zzbgx implements zzbhp {
    @Override // com.google.android.gms.internal.ads.zzbhp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zzb;
        zzcei zzceiVar = (zzcei) obj;
        zzbdk zzK = zzceiVar.zzK();
        if (zzK == null || (zzb = zzK.zzb()) == null) {
            zzceiVar.zze("nativeClickMetaReady", new JSONObject());
        } else {
            zzceiVar.zze("nativeClickMetaReady", zzb);
        }
    }
}
