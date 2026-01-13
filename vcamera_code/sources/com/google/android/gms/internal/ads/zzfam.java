package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzfam {
    private final zzfal zza = new zzfal();
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;

    public final zzfal zza() {
        zzfal clone = this.zza.clone();
        zzfal zzfalVar = this.zza;
        zzfalVar.zza = false;
        zzfalVar.zzb = false;
        return clone;
    }

    public final String zzb() {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("\n\tPool does not exist: ");
        o00oOOo02.append(this.zzd);
        o00oOOo02.append("\n\tNew pools created: ");
        o00oOOo02.append(this.zzb);
        o00oOOo02.append("\n\tPools removed: ");
        o00oOOo02.append(this.zzc);
        o00oOOo02.append("\n\tEntries added: ");
        o00oOOo02.append(this.zzf);
        o00oOOo02.append("\n\tNo entries retrieved: ");
        return android.support.v4.media.o00oOo00.o00oOOo0(o00oOOo02, this.zze, "\n");
    }

    public final void zzc() {
        this.zzf++;
    }

    public final void zzd() {
        this.zzb++;
        this.zza.zza = true;
    }

    public final void zze() {
        this.zze++;
    }

    public final void zzf() {
        this.zzd++;
    }

    public final void zzg() {
        this.zzc++;
        this.zza.zzb = true;
    }
}
