package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.List;
import java.util.logging.Logger;
import o0ooOoOO.oO0OoOO0;
/* loaded from: classes2.dex */
public final class zzggf implements zzfxc {
    private static final Logger zza = Logger.getLogger(zzggf.class.getName());
    private static final byte[] zzb = {0};
    private static final zzggf zzc = new zzggf();

    public static void zze() throws GeneralSecurityException {
        zzfxf.zzp(zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final Class zza() {
        return zzfws.class;
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final Class zzb() {
        return zzfws.class;
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final /* bridge */ /* synthetic */ Object zzc(zzfxb zzfxbVar) throws GeneralSecurityException {
        for (List<zzfwx> list : zzfxbVar.zzd()) {
            for (zzfwx zzfwxVar : list) {
                if (zzfwxVar.zzb() instanceof zzggb) {
                    zzggb zzggbVar = (zzggb) zzfwxVar.zzb();
                    zzgoj zzb2 = zzgoj.zzb(zzfwxVar.zzg());
                    if (!zzb2.equals(zzggbVar.zzb())) {
                        String valueOf = String.valueOf(zzggbVar.zza());
                        String zzgojVar = zzggbVar.zzb().toString();
                        throw new GeneralSecurityException(android.support.v4.media.o00oOOoO.o00oOOo0(oO0OoOO0.o00oOOo0("Mac Key with parameters ", valueOf, " has wrong output prefix (", zzgojVar, ") instead of ("), zzb2.toString(), ")"));
                    }
                }
            }
        }
        return new zzgge(zzfxbVar, null);
    }
}
