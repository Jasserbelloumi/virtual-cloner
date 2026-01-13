package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import o00oOooO.o0OOooO0;
@o0OOooO0(24)
/* loaded from: classes2.dex */
final class zzgn {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = new MediaCodec.CryptoInfo.Pattern(0, 0);

    public static /* bridge */ /* synthetic */ void zza(zzgn zzgnVar, int i, int i2) {
        zzgnVar.zzb.set(i, i2);
        zzgnVar.zza.setPattern(zzgnVar.zzb);
    }
}
