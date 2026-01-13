package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Map;
/* loaded from: classes2.dex */
final class zzbhn implements zzbhp {
    @Override // com.google.android.gms.internal.ads.zzbhp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcei zzceiVar = (zzcei) obj;
        if (map.keySet().contains(TtmlNode.START)) {
            zzceiVar.zzas(true);
        }
        if (map.keySet().contains("stop")) {
            zzceiVar.zzas(false);
        }
    }
}
