package com.google.android.gms.internal.ads;

import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzuw {
    public final long zza;
    public final long zzb;

    public zzuw(long j, long j2) {
        this.zza = j;
        this.zzb = j2;
    }

    public final boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzuw) {
            zzuw zzuwVar = (zzuw) obj;
            return this.zza == zzuwVar.zza && this.zzb == zzuwVar.zzb;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}
