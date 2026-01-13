package com.google.android.gms.maps.internal;

import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zza {
    public static byte zza(@o0OO00OO Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : (byte) 1;
        }
        return (byte) -1;
    }

    @o0OO00OO
    public static Boolean zzb(byte b) {
        if (b != 0) {
            if (b != 1) {
                return null;
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
