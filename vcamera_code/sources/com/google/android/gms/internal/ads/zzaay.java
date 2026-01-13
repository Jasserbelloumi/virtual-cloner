package com.google.android.gms.internal.ads;

import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzaay {
    public static final zzaay zza = new zzaay(0, 0);
    public final long zzb;
    public final long zzc;

    public zzaay(long j, long j2) {
        this.zzb = j;
        this.zzc = j2;
    }

    public final boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaay.class == obj.getClass()) {
            zzaay zzaayVar = (zzaay) obj;
            if (this.zzb == zzaayVar.zzb && this.zzc == zzaayVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        long j = this.zzb;
        return android.support.v4.media.session.o00oOo00.o00oOOo0(androidx.concurrent.futures.o00oOOo0.o00oOOo0("[timeUs=", j, ", position="), this.zzc, "]");
    }
}
