package com.google.android.gms.internal.ads;

import java.util.List;
/* loaded from: classes2.dex */
final class zzbrx extends zzbrq {
    public final /* synthetic */ List zza;

    public zzbrx(zzbrz zzbrzVar, List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzbrr
    public final void zze(String str) {
        zzbza.zzg("Error recording click: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzbrr
    public final void zzf(List list) {
        zzbza.zzi("Recorded click: ".concat(this.zza.toString()));
    }
}
