package com.google.android.gms.ads.h5;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbit;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(api = 21)
/* loaded from: classes.dex */
public final class H5AdsRequestHandler {
    private final zzbit zza;

    public H5AdsRequestHandler(@oo0oO0 Context context, @oo0oO0 OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = new zzbit(context, onH5AdsEventListener);
    }

    public void clearAdObjects() {
        this.zza.zza();
    }

    public boolean handleH5AdsRequest(@oo0oO0 String str) {
        return this.zza.zzb(str);
    }

    public boolean shouldInterceptRequest(@oo0oO0 String str) {
        return zzbit.zzc(str);
    }
}
