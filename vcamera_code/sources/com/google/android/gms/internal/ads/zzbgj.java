package com.google.android.gms.internal.ads;

import java.util.Map;
/* loaded from: classes2.dex */
public final class zzbgj implements zzbhp {
    private final zzbgk zza;

    public zzbgj(zzbgk zzbgkVar) {
        this.zza = zzbgkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("name");
        if (str == null) {
            zzbza.zzj("App event with no name parameter.");
        } else {
            this.zza.zzbz(str, (String) map.get("info"));
        }
    }
}
