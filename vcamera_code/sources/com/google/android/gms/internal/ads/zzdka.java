package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public final class zzdka {
    private final Executor zza;
    private final zzcnq zzb;
    private final zzdbw zzc;

    public zzdka(Executor executor, zzcnq zzcnqVar, zzdbw zzdbwVar) {
        this.zza = executor;
        this.zzc = zzdbwVar;
        this.zzb = zzcnqVar;
    }

    public final void zza(final zzcei zzceiVar) {
        if (zzceiVar == null) {
            return;
        }
        this.zzc.zza(zzceiVar.zzF());
        this.zzc.zzm(new zzatf() { // from class: com.google.android.gms.internal.ads.zzdjw
            @Override // com.google.android.gms.internal.ads.zzatf
            public final void zzc(zzate zzateVar) {
                zzcfv zzN = zzcei.this.zzN();
                Rect rect = zzateVar.zzd;
                zzN.zzp(rect.left, rect.top, false);
            }
        }, this.zza);
        this.zzc.zzm(new zzatf() { // from class: com.google.android.gms.internal.ads.zzdjx
            @Override // com.google.android.gms.internal.ads.zzatf
            public final void zzc(zzate zzateVar) {
                zzcei zzceiVar2 = zzcei.this;
                HashMap hashMap = new HashMap();
                hashMap.put("isVisible", true != zzateVar.zzj ? SessionDescription.SUPPORTED_SDP_VERSION : "1");
                zzceiVar2.zzd("onAdVisibilityChanged", hashMap);
            }
        }, this.zza);
        this.zzc.zzm(this.zzb, this.zza);
        this.zzb.zzf(zzceiVar);
        zzceiVar.zzad("/trackActiveViewUnit", new zzbhp() { // from class: com.google.android.gms.internal.ads.zzdjy
            @Override // com.google.android.gms.internal.ads.zzbhp
            public final void zza(Object obj, Map map) {
                zzdka.this.zzb((zzcei) obj, map);
            }
        });
        zzceiVar.zzad("/untrackActiveViewUnit", new zzbhp() { // from class: com.google.android.gms.internal.ads.zzdjz
            @Override // com.google.android.gms.internal.ads.zzbhp
            public final void zza(Object obj, Map map) {
                zzdka.this.zzc((zzcei) obj, map);
            }
        });
    }

    public final /* synthetic */ void zzb(zzcei zzceiVar, Map map) {
        this.zzb.zzb();
    }

    public final /* synthetic */ void zzc(zzcei zzceiVar, Map map) {
        this.zzb.zza();
    }
}
