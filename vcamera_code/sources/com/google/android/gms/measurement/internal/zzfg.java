package com.google.android.gms.measurement.internal;

import java.util.List;
/* loaded from: classes2.dex */
final class zzfg implements com.google.android.gms.internal.measurement.zzr {
    public final /* synthetic */ zzfi zza;

    public zzfg(zzfi zzfiVar) {
        this.zza = zzfiVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i, String str, List list, boolean z, boolean z2) {
        zzef zzc;
        int i2 = i - 1;
        if (i2 == 0) {
            zzc = this.zza.zzt.zzay().zzc();
        } else if (i2 == 1) {
            zzeh zzay = this.zza.zzt.zzay();
            zzc = z ? zzay.zzh() : !z2 ? zzay.zze() : zzay.zzd();
        } else if (i2 == 3) {
            zzc = this.zza.zzt.zzay().zzj();
        } else if (i2 != 4) {
            zzc = this.zza.zzt.zzay().zzi();
        } else {
            zzeh zzay2 = this.zza.zzt.zzay();
            zzc = z ? zzay2.zzm() : !z2 ? zzay2.zzl() : zzay2.zzk();
        }
        int size = list.size();
        if (size == 1) {
            zzc.zzb(str, list.get(0));
        } else if (size == 2) {
            zzc.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzc.zza(str);
        } else {
            zzc.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
