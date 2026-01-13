package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzgc {
    private final Map zza = new HashMap();
    @o0OO00OO
    private Map zzb;

    public final synchronized Map zza() {
        if (this.zzb == null) {
            this.zzb = Collections.unmodifiableMap(new HashMap(this.zza));
        }
        return this.zzb;
    }
}
