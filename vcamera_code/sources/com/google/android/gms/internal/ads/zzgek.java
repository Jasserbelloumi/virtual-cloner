package com.google.android.gms.internal.ads;

import android.os.Build;
import com.google.android.exoplayer2.C;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import javax.annotation.Nullable;
/* loaded from: classes2.dex */
public final class zzgek {
    public static final Charset zza = Charset.forName(C.UTF8_NAME);

    public static int zza() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i = 0;
        while (i == 0) {
            secureRandom.nextBytes(bArr);
            i = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i;
    }

    public static final zzgoj zzb(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '!' || charAt > '~') {
                throw new zzgej("Not a printable ASCII character: " + charAt);
            }
            bArr[i] = (byte) charAt;
        }
        return zzgoj.zzb(bArr);
    }

    @Nullable
    public static Integer zzc() {
        return Integer.valueOf(Build.VERSION.SDK_INT);
    }
}
