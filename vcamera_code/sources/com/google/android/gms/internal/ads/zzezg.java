package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public final class zzezg {
    private final zzeyc zza;
    private final zzeyf zzb;
    private final zzeaf zzc;
    private final zzfff zzd;
    private final zzfen zze;

    @VisibleForTesting
    public zzezg(zzeaf zzeafVar, zzfff zzfffVar, zzeyc zzeycVar, zzeyf zzeyfVar, zzfen zzfenVar) {
        this.zza = zzeycVar;
        this.zzb = zzeyfVar;
        this.zzc = zzeafVar;
        this.zzd = zzfffVar;
        this.zze = zzfenVar;
    }

    public final void zza(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), 2);
        }
    }

    public final void zzb(String str, int i) {
        if (!this.zza.zzaj) {
            this.zzd.zzc(str, this.zze);
            return;
        }
        this.zzc.zzd(new zzeah(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), this.zzb.zzb, str, i));
    }

    public final void zzc(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), i);
        }
    }
}
