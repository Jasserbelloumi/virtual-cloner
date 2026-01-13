package com.google.android.gms.internal.ads;

import java.util.Map;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzcqo implements zzcqp {
    private final Map zza;

    public zzcqo(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcqp
    @o0OO00OO
    public final zzeat zza(int i, String str) {
        return (zzeat) this.zza.get(str);
    }
}
