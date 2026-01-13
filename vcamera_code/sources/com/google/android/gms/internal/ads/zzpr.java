package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.PlaybackException;
import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzpr extends IOException {
    public final int zza;

    public zzpr(Throwable th, int i) {
        super(th);
        this.zza = PlaybackException.ERROR_CODE_DRM_SCHEME_UNSUPPORTED;
    }
}
