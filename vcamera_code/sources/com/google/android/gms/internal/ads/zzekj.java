package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
/* loaded from: classes2.dex */
public final class zzekj implements zzepm {
    private final com.google.android.gms.ads.internal.client.zzw zza;
    private final zzbzg zzb;
    private final boolean zzc;

    public zzekj(com.google.android.gms.ads.internal.client.zzw zzwVar, zzbzg zzbzgVar, boolean z) {
        this.zza = zzwVar;
        this.zzb = zzbzgVar;
        this.zzc = z;
    }

    @Override // com.google.android.gms.internal.ads.zzepm
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        String str;
        Bundle bundle = (Bundle) obj;
        if (this.zzb.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeN)).intValue()) {
            bundle.putString("app_open_version", "2");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeO)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzc);
        }
        com.google.android.gms.ads.internal.client.zzw zzwVar = this.zza;
        if (zzwVar != null) {
            int i = zzwVar.zza;
            if (i == 1) {
                str = TtmlNode.TAG_P;
            } else if (i != 2) {
                return;
            } else {
                str = "l";
            }
            bundle.putString("avo", str);
        }
    }
}
