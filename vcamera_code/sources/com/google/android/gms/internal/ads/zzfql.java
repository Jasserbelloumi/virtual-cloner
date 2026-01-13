package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzfql {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzfql(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Multiple entries with same key: ");
        o00oOOo02.append(this.zza);
        o00oOOo02.append("=");
        o00oOOo02.append(this.zzb);
        o00oOOo02.append(" and ");
        o00oOOo02.append(this.zza);
        o00oOOo02.append("=");
        o00oOOo02.append(this.zzc);
        return new IllegalArgumentException(o00oOOo02.toString());
    }
}
