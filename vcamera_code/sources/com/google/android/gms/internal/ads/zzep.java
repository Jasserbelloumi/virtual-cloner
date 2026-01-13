package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzep implements zzdm {
    @Override // com.google.android.gms.internal.ads.zzdm
    public final long zza() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.zzdm
    public final zzdv zzb(Looper looper, @o0OO00OO Handler.Callback callback) {
        return new zzes(new Handler(looper, callback));
    }
}
