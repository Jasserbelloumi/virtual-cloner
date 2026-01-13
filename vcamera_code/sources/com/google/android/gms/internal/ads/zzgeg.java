package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* loaded from: classes2.dex */
final class zzgeg {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgeg(Class cls, Class cls2, zzgef zzgefVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgeg) {
            zzgeg zzgegVar = (zzgeg) obj;
            return zzgegVar.zza.equals(this.zza) && zzgegVar.zzb.equals(this.zzb);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return android.support.v4.media.o00oOoO.o00oOOo0(this.zza.getSimpleName(), " with serialization type: ", this.zzb.getSimpleName());
    }
}
