package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class zzgdx {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzgdx(zzgdt zzgdtVar, zzgdw zzgdwVar) {
        Map map;
        Map map2;
        map = zzgdtVar.zza;
        this.zza = new HashMap(map);
        map2 = zzgdtVar.zzb;
        this.zzb = new HashMap(map2);
    }

    public final Class zza(Class cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            return ((zzfxc) this.zzb.get(cls)).zza();
        }
        throw new GeneralSecurityException(android.support.v4.media.o00oOoO.o00oOOo0("No input primitive class for ", cls.toString(), " available"));
    }

    public final Object zzb(zzfvx zzfvxVar, Class cls) throws GeneralSecurityException {
        zzgdv zzgdvVar = new zzgdv(zzfvxVar.getClass(), cls, null);
        if (this.zza.containsKey(zzgdvVar)) {
            return ((zzgdr) this.zza.get(zzgdvVar)).zza(zzfvxVar);
        }
        throw new GeneralSecurityException(android.support.v4.media.o00oOoO.o00oOOo0("No PrimitiveConstructor for ", zzgdvVar.toString(), " available"));
    }

    public final Object zzc(zzfxb zzfxbVar, Class cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            zzfxc zzfxcVar = (zzfxc) this.zzb.get(cls);
            if (zzfxbVar.zzc().equals(zzfxcVar.zza()) && zzfxcVar.zza().equals(zzfxbVar.zzc())) {
                return zzfxcVar.zzc(zzfxbVar);
            }
            throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
    }
}
