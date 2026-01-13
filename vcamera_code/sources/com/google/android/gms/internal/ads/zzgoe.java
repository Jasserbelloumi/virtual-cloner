package com.google.android.gms.internal.ads;

import java.security.SecureRandom;
/* loaded from: classes2.dex */
public final class zzgoe {
    private static final ThreadLocal zza = new zzgod();

    public static byte[] zza(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) zza.get()).nextBytes(bArr);
        return bArr;
    }
}
