package com.google.android.gms.internal.ads;

import androidx.fragment.app.o0O00;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzaav {
    public final zzaay zza;
    public final zzaay zzb;

    public zzaav(zzaay zzaayVar, zzaay zzaayVar2) {
        this.zza = zzaayVar;
        this.zzb = zzaayVar2;
    }

    public final boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaav.class == obj.getClass()) {
            zzaav zzaavVar = (zzaav) obj;
            if (this.zza.equals(zzaavVar.zza) && this.zzb.equals(zzaavVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        return o0O00.o00oOOo0("[", this.zza.toString(), this.zza.equals(this.zzb) ? "" : ", ".concat(this.zzb.toString()), "]");
    }
}
