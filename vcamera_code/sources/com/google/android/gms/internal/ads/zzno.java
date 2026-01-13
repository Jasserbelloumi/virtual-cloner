package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
/* loaded from: classes2.dex */
public final class zzno {
    public static final zzno zza;
    @o0OO00OO
    private final zznn zzb;

    static {
        zza = zzew.zza < 31 ? new zzno() : new zzno(zznn.zza);
    }

    public zzno() {
        this.zzb = null;
        zzdl.zzf(zzew.zza < 31);
    }

    @o0OOooO0(31)
    public zzno(LogSessionId logSessionId) {
        this.zzb = new zznn(logSessionId);
    }

    private zzno(@o0OO00OO zznn zznnVar) {
        this.zzb = zznnVar;
    }

    @o0OOooO0(31)
    public final LogSessionId zza() {
        zznn zznnVar = this.zzb;
        zznnVar.getClass();
        return zznnVar.zzb;
    }
}
