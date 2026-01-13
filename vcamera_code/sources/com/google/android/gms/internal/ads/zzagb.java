package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.util.MimeTypes;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
final class zzagb {
    public final zzagg zza;
    public final zzagj zzb;
    public final zzabb zzc;
    @o0OO00OO
    public final zzabc zzd;
    public int zze;

    public zzagb(zzagg zzaggVar, zzagj zzagjVar, zzabb zzabbVar) {
        this.zza = zzaggVar;
        this.zzb = zzagjVar;
        this.zzc = zzabbVar;
        this.zzd = MimeTypes.AUDIO_TRUEHD.equals(zzaggVar.zzf.zzm) ? new zzabc() : null;
    }
}
