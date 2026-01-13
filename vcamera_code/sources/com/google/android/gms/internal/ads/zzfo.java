package com.google.android.gms.internal.ads;

import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzfo implements zzff {
    @o0OO00OO
    private zzgi zzb;
    @o0OO00OO
    private String zzc;
    private boolean zzf;
    private final zzgc zza = new zzgc();
    private int zzd = 8000;
    private int zze = 8000;

    public final zzfo zzb(boolean z) {
        this.zzf = true;
        return this;
    }

    public final zzfo zzc(int i) {
        this.zzd = i;
        return this;
    }

    public final zzfo zzd(int i) {
        this.zze = i;
        return this;
    }

    public final zzfo zze(@o0OO00OO zzgi zzgiVar) {
        this.zzb = zzgiVar;
        return this;
    }

    public final zzfo zzf(@o0OO00OO String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzff
    /* renamed from: zzg */
    public final zzft zza() {
        zzft zzftVar = new zzft(this.zzc, this.zzd, this.zze, this.zzf, this.zza);
        zzgi zzgiVar = this.zzb;
        if (zzgiVar != null) {
            zzftVar.zzf(zzgiVar);
        }
        return zzftVar;
    }
}
