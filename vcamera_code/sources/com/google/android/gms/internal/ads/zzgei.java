package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
/* loaded from: classes2.dex */
public final class zzgei {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public /* synthetic */ zzgei(zzgec zzgecVar, zzgeh zzgehVar) {
        this.zza = new HashMap(zzgec.zzf(zzgecVar));
        this.zzb = new HashMap(zzgec.zze(zzgecVar));
        this.zzc = new HashMap(zzgec.zzh(zzgecVar));
        this.zzd = new HashMap(zzgec.zzg(zzgecVar));
    }

    public final zzfvx zza(zzgeb zzgebVar, @Nullable zzfxg zzfxgVar) throws GeneralSecurityException {
        zzgee zzgeeVar = new zzgee(zzgebVar.getClass(), zzgebVar.zzd(), null);
        if (this.zzb.containsKey(zzgeeVar)) {
            return ((zzgcn) this.zzb.get(zzgeeVar)).zza(zzgebVar, zzfxgVar);
        }
        throw new GeneralSecurityException(android.support.v4.media.o00oOoO.o00oOOo0("No Key Parser for requested key type ", zzgeeVar.toString(), " available"));
    }

    public final boolean zzf(zzgeb zzgebVar) {
        return this.zzb.containsKey(new zzgee(zzgebVar.getClass(), zzgebVar.zzd(), null));
    }
}
