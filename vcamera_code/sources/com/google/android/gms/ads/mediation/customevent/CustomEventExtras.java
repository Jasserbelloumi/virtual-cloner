package com.google.android.gms.ads.mediation.customevent;

import java.util.HashMap;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@Deprecated
/* loaded from: classes.dex */
public final class CustomEventExtras {
    private final HashMap zza = new HashMap();

    @o0OO00OO
    public Object getExtra(@oo0oO0 String str) {
        return this.zza.get(str);
    }

    public void setExtra(@oo0oO0 String str, @oo0oO0 Object obj) {
        this.zza.put(str, obj);
    }
}
