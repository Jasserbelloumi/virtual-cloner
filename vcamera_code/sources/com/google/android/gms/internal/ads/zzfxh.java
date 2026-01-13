package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfxh {
    public static final Charset zza = Charset.forName(C.UTF8_NAME);

    public static zzglq zza(zzgll zzgllVar) {
        zzgln zza2 = zzglq.zza();
        zza2.zzb(zzgllVar.zzc());
        for (zzglk zzglkVar : zzgllVar.zzi()) {
            zzglo zza3 = zzglp.zza();
            zza3.zzc(zzglkVar.zzc().zzg());
            zza3.zzd(zzglkVar.zzk());
            zza3.zzb(zzglkVar.zzf());
            zza3.zza(zzglkVar.zza());
            zza2.zza((zzglp) zza3.zzal());
        }
        return (zzglq) zza2.zzal();
    }

    public static void zzb(zzgll zzgllVar) throws GeneralSecurityException {
        int zzc = zzgllVar.zzc();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzglk zzglkVar : zzgllVar.zzi()) {
            if (zzglkVar.zzk() == 3) {
                if (!zzglkVar.zzj()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzglkVar.zza())));
                }
                if (zzglkVar.zzf() == zzgme.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzglkVar.zza())));
                }
                if (zzglkVar.zzk() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzglkVar.zza())));
                }
                if (zzglkVar.zza() == zzc) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                z2 &= zzglkVar.zzc().zzc() == zzgkx.ASYMMETRIC_PUBLIC;
                i++;
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
