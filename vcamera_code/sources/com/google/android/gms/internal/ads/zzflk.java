package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzflk extends zzfmd {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzfmd
    public final zzfmd zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmd
    public final zzfmd zzb(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmd
    public final zzfme zzc() {
        return new zzflm(this.zza, this.zzb, null);
    }
}
