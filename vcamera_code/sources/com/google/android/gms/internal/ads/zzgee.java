package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* loaded from: classes2.dex */
final class zzgee {
    private final Class zza;
    private final zzgoj zzb;

    public /* synthetic */ zzgee(Class cls, zzgoj zzgojVar, zzged zzgedVar) {
        this.zza = cls;
        this.zzb = zzgojVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgee) {
            zzgee zzgeeVar = (zzgee) obj;
            return zzgeeVar.zza.equals(this.zza) && zzgeeVar.zzb.equals(this.zzb);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return android.support.v4.media.o00oOoO.o00oOOo0(this.zza.getSimpleName(), ", object identifier: ", String.valueOf(this.zzb));
    }
}
