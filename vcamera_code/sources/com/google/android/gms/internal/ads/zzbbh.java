package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import o00oOooO.o0OO00OO;
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes2.dex */
public final class zzbbh {
    private final Map zza = new HashMap();
    private final zzbbj zzb;

    public zzbbh(zzbbj zzbbjVar) {
        this.zzb = zzbbjVar;
    }

    public final zzbbj zza() {
        return this.zzb;
    }

    public final void zzb(String str, @o0OO00OO zzbbg zzbbgVar) {
        this.zza.put(str, zzbbgVar);
    }

    public final void zzc(String str, String str2, long j) {
        zzbbj zzbbjVar = this.zzb;
        zzbbg zzbbgVar = (zzbbg) this.zza.get(str2);
        String[] strArr = {str};
        if (zzbbgVar != null) {
            zzbbjVar.zze(zzbbgVar, j, strArr);
        }
        this.zza.put(str, new zzbbg(j, null, null));
    }
}
