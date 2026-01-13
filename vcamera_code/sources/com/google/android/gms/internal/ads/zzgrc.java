package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
public class zzgrc {
    private static final zzgpy zzb = zzgpy.zza;
    public volatile zzgrw zza;
    private volatile zzgpe zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgrc) {
            zzgrc zzgrcVar = (zzgrc) obj;
            zzgrw zzgrwVar = this.zza;
            zzgrw zzgrwVar2 = zzgrcVar.zza;
            if (zzgrwVar == null && zzgrwVar2 == null) {
                return zzb().equals(zzgrcVar.zzb());
            }
            if (zzgrwVar == null || zzgrwVar2 == null) {
                if (zzgrwVar != null) {
                    zzgrcVar.zzc(zzgrwVar.zzbf());
                    return zzgrwVar.equals(zzgrcVar.zza);
                }
                zzc(zzgrwVar2.zzbf());
                return this.zza.equals(zzgrwVar2);
            }
            return zzgrwVar.equals(zzgrwVar2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzgpa) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzaz();
        }
        return 0;
    }

    public final zzgpe zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                return this.zzc;
            }
            this.zzc = this.zza == null ? zzgpe.zzb : this.zza.zzau();
            return this.zzc;
        }
    }

    public final void zzc(zzgrw zzgrwVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza == null) {
                try {
                    this.zza = zzgrwVar;
                    this.zzc = zzgpe.zzb;
                } catch (zzgqy unused) {
                    this.zza = zzgrwVar;
                    this.zzc = zzgpe.zzb;
                }
            }
        }
    }
}
