package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;
/* loaded from: classes2.dex */
public final class zzfrr {
    public static Object zza(@CheckForNull Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(android.support.v4.media.o00oOOo0.o00oOOo0("at index ", i));
    }

    public static Object[] zzb(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            zza(objArr[i2], i2);
        }
        return objArr;
    }
}
