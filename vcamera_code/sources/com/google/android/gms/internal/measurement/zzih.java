package com.google.android.gms.internal.measurement;

import android.support.v4.media.o00oOo0O;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzih extends zzig {
    private final Object zza;

    public zzih(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzih) {
            return this.zza.equals(((zzih) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Optional.of(");
        o00oOOo02.append(this.zza);
        o00oOOo02.append(")");
        return o00oOOo02.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzig
    public final Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzig
    public final boolean zzb() {
        return true;
    }
}
