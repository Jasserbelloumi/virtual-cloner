package com.google.android.gms.internal.measurement;

import android.support.v4.media.o00oOo0O;
import java.io.Serializable;
import javax.annotation.CheckForNull;
/* loaded from: classes2.dex */
final class zzij implements Serializable, zzii {
    public final zzii zza;
    public volatile transient boolean zzb;
    @CheckForNull
    public transient Object zzc;

    public zzij(zzii zziiVar) {
        zziiVar.getClass();
        this.zza = zziiVar;
    }

    public final String toString() {
        Object obj;
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Suppliers.memoize(");
        if (this.zzb) {
            StringBuilder o00oOOo03 = o00oOo0O.o00oOOo0("<supplier that returned ");
            o00oOOo03.append(this.zzc);
            o00oOOo03.append(">");
            obj = o00oOOo03.toString();
        } else {
            obj = this.zza;
        }
        o00oOOo02.append(obj);
        o00oOOo02.append(")");
        return o00oOOo02.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    Object zza = this.zza.zza();
                    this.zzc = zza;
                    this.zzb = true;
                    return zza;
                }
            }
        }
        return this.zzc;
    }
}
