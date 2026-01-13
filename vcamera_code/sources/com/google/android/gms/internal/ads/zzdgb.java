package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdgb implements zzatf {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzdgd zzb;

    public zzdgb(zzdgd zzdgdVar, String str) {
        this.zzb = zzdgdVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zzc(zzate zzateVar) {
        Map map;
        zzdie zzdieVar;
        zzdie zzdieVar2;
        zzdie zzdieVar3;
        zzdie zzdieVar4;
        Map map2;
        zzdie zzdieVar5;
        zzdie zzdieVar6;
        zzdie zzdieVar7;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbA)).booleanValue()) {
            if (zzateVar.zzj) {
                map = this.zzb.zzy;
                map.put(this.zza, Boolean.TRUE);
                zzdgd zzdgdVar = this.zzb;
                zzdieVar = zzdgdVar.zzo;
                View zzf = zzdieVar.zzf();
                zzdieVar2 = this.zzb.zzo;
                Map zzl = zzdieVar2.zzl();
                zzdieVar3 = this.zzb.zzo;
                zzdgdVar.zzA(zzf, zzl, zzdieVar3.zzm(), true);
                return;
            }
            return;
        }
        synchronized (this) {
            if (zzateVar.zzj) {
                zzdgd zzdgdVar2 = this.zzb;
                zzdieVar4 = zzdgdVar2.zzo;
                if (zzdieVar4 == null) {
                    return;
                }
                map2 = zzdgdVar2.zzy;
                map2.put(this.zza, Boolean.TRUE);
                zzdgd zzdgdVar3 = this.zzb;
                zzdieVar5 = zzdgdVar3.zzo;
                View zzf2 = zzdieVar5.zzf();
                zzdieVar6 = this.zzb.zzo;
                Map zzl2 = zzdieVar6.zzl();
                zzdieVar7 = this.zzb.zzo;
                zzdgdVar3.zzA(zzf2, zzl2, zzdieVar7.zzm(), true);
            }
        }
    }
}
