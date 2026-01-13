package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzctz {
    private final Context zza;
    private final zzeyx zzb;
    private final Bundle zzc;
    @o0OO00OO
    private final zzeyp zzd;
    @o0OO00OO
    private final zzctr zze;

    public /* synthetic */ zzctz(zzctx zzctxVar, zzcty zzctyVar) {
        this.zza = zzctx.zza(zzctxVar);
        this.zzb = zzctx.zzk(zzctxVar);
        this.zzc = zzctx.zzb(zzctxVar);
        this.zzd = zzctx.zzj(zzctxVar);
        this.zze = zzctx.zzc(zzctxVar);
    }

    public final Context zza(Context context) {
        return this.zza;
    }

    @o0OO00OO
    public final Bundle zzb() {
        return this.zzc;
    }

    @o0OO00OO
    public final zzctr zzc() {
        return this.zze;
    }

    public final zzctx zzd() {
        zzctx zzctxVar = new zzctx();
        zzctxVar.zzd(this.zza);
        zzctxVar.zzh(this.zzb);
        zzctxVar.zze(this.zzc);
        zzctxVar.zzf(this.zze);
        return zzctxVar;
    }

    @o0OO00OO
    public final zzeyp zze() {
        return this.zzd;
    }

    public final zzeyx zzf() {
        return this.zzb;
    }
}
