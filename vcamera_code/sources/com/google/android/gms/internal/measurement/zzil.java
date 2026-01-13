package com.google.android.gms.internal.measurement;

import android.support.v4.media.o00oOo0O;
import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;
/* loaded from: classes2.dex */
final class zzil implements Serializable, zzii {
    public final Object zza;

    public zzil(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzil) {
            Object obj2 = this.zza;
            Object obj3 = ((zzil) obj).zza;
            return obj2 == obj3 || obj2.equals(obj3);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Suppliers.ofInstance(");
        o00oOOo02.append(this.zza);
        o00oOOo02.append(")");
        return o00oOOo02.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    public final Object zza() {
        return this.zza;
    }
}
