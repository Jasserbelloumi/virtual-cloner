package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import o00ooOO0.o0O000O;
/* loaded from: classes2.dex */
public final class zzakg {
    private final String zza;
    private final String zzb;

    public zzakg(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzakg.class == obj.getClass()) {
            zzakg zzakgVar = (zzakg) obj;
            if (TextUtils.equals(this.zza, zzakgVar.zza) && TextUtils.equals(this.zzb, zzakgVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        return o0O000O.o00oOOo0("Header[name=", this.zza, ",value=", this.zzb, "]");
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
