package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;
import o00oOooO.o0o0000;
/* loaded from: classes2.dex */
public final class zzezj {
    @o0o0000
    public zzezj() {
        try {
            zzfxi.zza();
        } catch (GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to Configure Aead. ".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        zzgpb zzt = zzgpe.zzt();
        try {
            zzfvs.zzb(zzfwp.zzb(zzfwi.zza("AES128_GCM")), zzfvq.zzb(zzt));
        } catch (IOException | GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to generate key".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "CryptoUtils.generateKey");
        }
        String encodeToString = Base64.encodeToString(zzt.zzb().zzE(), 11);
        zzt.zzc();
        return encodeToString;
    }

    @Nullable
    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdpd zzdpdVar) {
        zzfwp zzc = zzc(str);
        if (zzc == null) {
            return null;
        }
        try {
            byte[] zza = ((zzfvo) zzc.zzd(zzfvo.class)).zza(bArr, bArr2);
            zzdpdVar.zza().put("ds", "1");
            return new String(zza, C.UTF8_NAME);
        } catch (UnsupportedEncodingException | GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to decrypt ".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "CryptoUtils.decrypt");
            zzdpdVar.zza().put("dsf", e.toString());
            return null;
        }
    }

    @Nullable
    private static final zzfwp zzc(String str) {
        try {
            return zzfvs.zza(zzfvp.zzb(Base64.decode(str, 11)));
        } catch (IOException | GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to get keysethandle".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "CryptoUtils.getHandle");
            return null;
        }
    }
}
