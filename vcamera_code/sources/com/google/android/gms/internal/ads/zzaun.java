package com.google.android.gms.internal.ads;

import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzaun {
    public final long zza;
    public final String zzb;
    public final int zzc;

    public zzaun(long j, String str, int i) {
        this.zza = j;
        this.zzb = str;
        this.zzc = i;
    }

    public final boolean equals(@o0OO00OO Object obj) {
        if (obj != null && (obj instanceof zzaun)) {
            zzaun zzaunVar = (zzaun) obj;
            if (zzaunVar.zza == this.zza && zzaunVar.zzc == this.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
