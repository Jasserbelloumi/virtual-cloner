package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
final class zzgsi extends zzgow {
    public final zzgsm zza;
    public zzgoy zzb = zzb();
    public final /* synthetic */ zzgso zzc;

    public zzgsi(zzgso zzgsoVar) {
        this.zzc = zzgsoVar;
        this.zza = new zzgsm(zzgsoVar, null);
    }

    private final zzgoy zzb() {
        zzgsm zzgsmVar = this.zza;
        if (zzgsmVar.hasNext()) {
            return zzgsmVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgoy
    public final byte zza() {
        zzgoy zzgoyVar = this.zzb;
        if (zzgoyVar != null) {
            byte zza = zzgoyVar.zza();
            if (!this.zzb.hasNext()) {
                this.zzb = zzb();
            }
            return zza;
        }
        throw new NoSuchElementException();
    }
}
