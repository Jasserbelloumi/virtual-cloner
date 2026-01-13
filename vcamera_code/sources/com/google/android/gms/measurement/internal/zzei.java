package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0ooOoOO.oO0OoOO0;
/* loaded from: classes2.dex */
public final class zzei {
    @oo0oO0
    public final String zza;
    @oo0oO0
    public final String zzb;
    public final long zzc;
    @oo0oO0
    public final Bundle zzd;

    public zzei(@oo0oO0 String str, @oo0oO0 String str2, @o0OO00OO Bundle bundle, long j) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = bundle;
        this.zzc = j;
    }

    public static zzei zzb(zzaw zzawVar) {
        return new zzei(zzawVar.zza, zzawVar.zzc, zzawVar.zzb.zzc(), zzawVar.zzd);
    }

    public final String toString() {
        String str = this.zzb;
        String str2 = this.zza;
        String obj = this.zzd.toString();
        StringBuilder o00oOOo02 = oO0OoOO0.o00oOOo0("origin=", str, ",name=", str2, ",params=");
        o00oOOo02.append(obj);
        return o00oOOo02.toString();
    }

    public final zzaw zza() {
        return new zzaw(this.zza, new zzau(new Bundle(this.zzd)), this.zzb, this.zzc);
    }
}
