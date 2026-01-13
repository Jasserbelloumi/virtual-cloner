package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
/* loaded from: classes2.dex */
public final class zzggj {
    private HashMap zza = new HashMap();

    public final zzggl zza() {
        if (this.zza != null) {
            zzggl zzgglVar = new zzggl(Collections.unmodifiableMap(this.zza), null);
            this.zza = null;
            return zzgglVar;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
