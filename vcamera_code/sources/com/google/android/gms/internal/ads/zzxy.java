package com.google.android.gms.internal.ads;

import android.view.Surface;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OOooO0;
@o0OOooO0(30)
/* loaded from: classes2.dex */
final class zzxy {
    @o0O0O0Oo
    public static void zza(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            zzee.zzc("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
