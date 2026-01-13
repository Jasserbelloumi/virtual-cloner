package com.google.android.gms.internal.play_billing;

import o0ooOoOO.oO0OoOO0;
/* loaded from: classes2.dex */
final class zzv {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzv(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        String valueOf3 = String.valueOf(this.zza);
        String valueOf4 = String.valueOf(this.zzc);
        StringBuilder o00oOOo02 = oO0OoOO0.o00oOOo0("Multiple entries with same key: ", valueOf, "=", valueOf2, " and ");
        o00oOOo02.append(valueOf3);
        o00oOOo02.append("=");
        o00oOOo02.append(valueOf4);
        return new IllegalArgumentException(o00oOOo02.toString());
    }
}
