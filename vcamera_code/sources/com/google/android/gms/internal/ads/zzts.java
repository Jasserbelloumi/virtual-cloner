package com.google.android.gms.internal.ads;

import java.io.IOException;
/* loaded from: classes2.dex */
final class zzts implements zzuj {
    public final /* synthetic */ zztv zza;
    private final int zzb;

    public zzts(zztv zztvVar, int i) {
        this.zza = zztvVar;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzuj
    public final int zza(zzjo zzjoVar, zzgr zzgrVar, int i) {
        return this.zza.zzg(this.zzb, zzjoVar, zzgrVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzuj
    public final int zzb(long j) {
        return this.zza.zzi(this.zzb, j);
    }

    @Override // com.google.android.gms.internal.ads.zzuj
    public final void zzd() throws IOException {
        this.zza.zzH(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzuj
    public final boolean zze() {
        return this.zza.zzO(this.zzb);
    }
}
