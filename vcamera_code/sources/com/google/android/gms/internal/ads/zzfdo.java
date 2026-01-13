package com.google.android.gms.internal.ads;

import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
final class zzfdo {
    @oo0oO0
    public final String zza;
    @oo0oO0
    public final String zzb;

    public zzfdo(@oo0oO0 String str, @oo0oO0 String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(@o0OO00OO Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfdo) {
            zzfdo zzfdoVar = (zzfdo) obj;
            return this.zza.equals(zzfdoVar.zza) && this.zzb.equals(zzfdoVar.zzb);
        }
        return false;
    }

    public final int hashCode() {
        return String.valueOf(this.zza).concat(String.valueOf(this.zzb)).hashCode();
    }
}
