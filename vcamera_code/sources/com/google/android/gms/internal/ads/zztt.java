package com.google.android.gms.internal.ads;

import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
final class zztt {
    public final int zza;
    public final boolean zzb;

    public zztt(int i, boolean z) {
        this.zza = i;
        this.zzb = z;
    }

    public final boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zztt.class == obj.getClass()) {
            zztt zzttVar = (zztt) obj;
            if (this.zza == zzttVar.zza && this.zzb == zzttVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza * 31) + (this.zzb ? 1 : 0);
    }
}
