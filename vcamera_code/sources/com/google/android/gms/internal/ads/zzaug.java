package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.ParametersAreNonnullByDefault;
import o00oOooO.o0OO00OO;
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public abstract class zzaug {
    @o0OO00OO
    private static MessageDigest zzb;
    public final Object zza = new Object();

    @o0OO00OO
    public final MessageDigest zza() {
        synchronized (this.zza) {
            MessageDigest messageDigest = zzb;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    zzb = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return zzb;
        }
    }

    public abstract byte[] zzb(String str);
}
