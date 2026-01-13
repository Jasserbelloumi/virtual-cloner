package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzqs {
    public final zzqx zza;
    public final MediaFormat zzb;
    public final zzaf zzc;
    @o0OO00OO
    public final Surface zzd;
    @o0OO00OO
    public final MediaCrypto zze = null;

    private zzqs(zzqx zzqxVar, MediaFormat mediaFormat, zzaf zzafVar, @o0OO00OO Surface surface, @o0OO00OO MediaCrypto mediaCrypto, int i) {
        this.zza = zzqxVar;
        this.zzb = mediaFormat;
        this.zzc = zzafVar;
        this.zzd = surface;
    }

    public static zzqs zza(zzqx zzqxVar, MediaFormat mediaFormat, zzaf zzafVar, @o0OO00OO MediaCrypto mediaCrypto) {
        return new zzqs(zzqxVar, mediaFormat, zzafVar, null, null, 0);
    }

    public static zzqs zzb(zzqx zzqxVar, MediaFormat mediaFormat, zzaf zzafVar, @o0OO00OO Surface surface, @o0OO00OO MediaCrypto mediaCrypto) {
        return new zzqs(zzqxVar, mediaFormat, zzafVar, surface, null, 0);
    }
}
