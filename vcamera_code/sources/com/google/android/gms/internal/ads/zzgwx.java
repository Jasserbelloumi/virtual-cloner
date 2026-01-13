package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
public final class zzgwx implements zzgxl, zzgws {
    private static final Object zza = new Object();
    private volatile zzgxl zzb;
    private volatile Object zzc = zza;

    private zzgwx(zzgxl zzgxlVar) {
        this.zzb = zzgxlVar;
    }

    public static zzgws zza(zzgxl zzgxlVar) {
        if (zzgxlVar instanceof zzgws) {
            return (zzgws) zzgxlVar;
        }
        zzgxlVar.getClass();
        return new zzgwx(zzgxlVar);
    }

    public static zzgxl zzc(zzgxl zzgxlVar) {
        zzgxlVar.getClass();
        return zzgxlVar instanceof zzgwx ? zzgxlVar : new zzgwx(zzgxlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgxl
    public final Object zzb() {
        Object obj = this.zzc;
        Object obj2 = zza;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.zzc;
                if (obj == obj2) {
                    obj = this.zzb.zzb();
                    Object obj3 = this.zzc;
                    if (obj3 != obj2 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.zzc = obj;
                    this.zzb = null;
                }
            }
        }
        return obj;
    }
}
