package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public class zzqv extends zzgp {
    @o0OO00OO
    public final zzqx zza;
    @o0OO00OO
    public final String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzqv(Throwable th, @o0OO00OO zzqx zzqxVar) {
        super("Decoder failed: ".concat(String.valueOf(zzqxVar == null ? null : zzqxVar.zza)), th);
        String str = null;
        this.zza = zzqxVar;
        if (zzew.zza >= 21 && (th instanceof MediaCodec.CodecException)) {
            str = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.zzb = str;
    }
}
