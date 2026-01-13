package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class zzgdt {
    private final Map zza;
    private final Map zzb;

    public zzgdt() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public zzgdt(zzgdx zzgdxVar) {
        this.zza = new HashMap(zzgdx.zzd(zzgdxVar));
        this.zzb = new HashMap(zzgdx.zze(zzgdxVar));
    }

    public final zzgdt zza(zzgdr zzgdrVar) throws GeneralSecurityException {
        zzgdv zzgdvVar = new zzgdv(zzgdrVar.zzc(), zzgdrVar.zzd(), null);
        if (this.zza.containsKey(zzgdvVar)) {
            zzgdr zzgdrVar2 = (zzgdr) this.zza.get(zzgdvVar);
            if (!zzgdrVar2.equals(zzgdrVar) || !zzgdrVar.equals(zzgdrVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzgdvVar.toString()));
            }
        } else {
            this.zza.put(zzgdvVar, zzgdrVar);
        }
        return this;
    }

    public final zzgdt zzb(zzfxc zzfxcVar) throws GeneralSecurityException {
        if (zzfxcVar != null) {
            Map map = this.zzb;
            Class zzb = zzfxcVar.zzb();
            if (map.containsKey(zzb)) {
                zzfxc zzfxcVar2 = (zzfxc) this.zzb.get(zzb);
                if (!zzfxcVar2.equals(zzfxcVar) || !zzfxcVar.equals(zzfxcVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(zzb.toString()));
                }
            } else {
                this.zzb.put(zzb, zzfxcVar);
            }
            return this;
        }
        throw new NullPointerException("wrapper must be non-null");
    }
}
