package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
final class zzbgw implements zzbhp {
    @Override // com.google.android.gms.internal.ads.zzbhp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zza;
        zzcei zzceiVar = (zzcei) obj;
        zzbdk zzK = zzceiVar.zzK();
        if (zzK == null || (zza = zzK.zza()) == null) {
            zzceiVar.zze("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzceiVar.zze("nativeAdViewSignalsReady", zza);
        }
    }
}
