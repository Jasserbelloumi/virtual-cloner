package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import o00oOooO.o0OOooO0;
@o0OOooO0(api = 21)
/* loaded from: classes2.dex */
public final class zzbij extends zzbil {
    private final OnH5AdsEventListener zza;

    public zzbij(OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbim
    public final void zzb(String str) {
        this.zza.onH5AdsEvent(str);
    }
}
