package com.google.android.gms.internal.measurement;

import android.support.v4.media.o00oOo0O;
import javax.annotation.CheckForNull;
/* loaded from: classes2.dex */
final class zzik implements zzii {
    @CheckForNull
    public volatile zzii zza;
    public volatile boolean zzb;
    @CheckForNull
    public Object zzc;

    public zzik(zzii zziiVar) {
        zziiVar.getClass();
        this.zza = zziiVar;
    }

    public final String toString() {
        Object obj = this.zza;
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Suppliers.memoize(");
        if (obj == null) {
            StringBuilder o00oOOo03 = o00oOo0O.o00oOOo0("<supplier that returned ");
            o00oOOo03.append(this.zzc);
            o00oOOo03.append(">");
            obj = o00oOOo03.toString();
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
                    zzii zziiVar = this.zza;
                    zziiVar.getClass();
                    Object zza = zziiVar.zza();
                    this.zzc = zza;
                    this.zzb = true;
                    this.zza = null;
                    return zza;
                }
            }
        }
        return this.zzc;
    }
}
