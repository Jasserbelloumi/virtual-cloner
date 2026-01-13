package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OOooO0;
@o0OOooO0(31)
/* loaded from: classes2.dex */
final class zzqy {
    @o0O0O0Oo
    public static void zza(zzqs zzqsVar, zzno zznoVar) {
        LogSessionId zza = zznoVar.zza();
        if (zza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        zzqsVar.zzb.setString("log-session-id", zza.getStringId());
    }
}
