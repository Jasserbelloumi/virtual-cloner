package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzflb extends zzfln {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzfln
    public final zzfln zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfln
    public final zzfln zzb(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfln
    public final zzflo zzc() {
        return new zzfld(this.zza, this.zzb, null);
    }
}
