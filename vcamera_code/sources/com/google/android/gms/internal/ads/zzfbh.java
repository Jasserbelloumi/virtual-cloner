package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfbh {
    private final long zza;
    private long zzc;
    private final zzfbg zzb = new zzfbg();
    private int zzd = 0;
    private int zze = 0;
    private int zzf = 0;

    public zzfbh() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        this.zza = currentTimeMillis;
        this.zzc = currentTimeMillis;
    }

    public final int zza() {
        return this.zzd;
    }

    public final long zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final zzfbg zzd() {
        zzfbg clone = this.zzb.clone();
        zzfbg zzfbgVar = this.zzb;
        zzfbgVar.zza = false;
        zzfbgVar.zzb = 0;
        return clone;
    }

    public final String zze() {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Created: ");
        o00oOOo02.append(this.zza);
        o00oOOo02.append(" Last accessed: ");
        o00oOOo02.append(this.zzc);
        o00oOOo02.append(" Accesses: ");
        o00oOOo02.append(this.zzd);
        o00oOOo02.append("\nEntries retrieved: Valid: ");
        o00oOOo02.append(this.zze);
        o00oOOo02.append(" Stale: ");
        o00oOOo02.append(this.zzf);
        return o00oOOo02.toString();
    }

    public final void zzf() {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        this.zzd++;
    }

    public final void zzg() {
        this.zzf++;
        this.zzb.zzb++;
    }

    public final void zzh() {
        this.zze++;
        this.zzb.zza = true;
    }
}
