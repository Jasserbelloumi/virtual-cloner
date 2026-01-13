package com.google.android.gms.internal.ads;

import java.math.BigInteger;
/* loaded from: classes2.dex */
public final class zzgci {
    public static byte[] zza(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        throw new IllegalArgumentException("n must not be negative");
    }
}
