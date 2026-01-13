package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OOooO0;
/* JADX INFO: Access modifiers changed from: package-private */
@o0OOooO0(31)
/* loaded from: classes2.dex */
public final class zzir {
    @o0O0O0Oo
    public static zzno zza(Context context, zzjc zzjcVar, boolean z) {
        zznk zzb = zznk.zzb(context);
        if (zzb == null) {
            zzee.zze("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new zzno(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z) {
            zzjcVar.zzC(zzb);
        }
        return new zzno(zzb.zza());
    }
}
