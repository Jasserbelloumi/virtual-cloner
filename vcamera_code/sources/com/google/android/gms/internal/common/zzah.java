package com.google.android.gms.internal.common;

import android.support.v4.media.o00oOOo0;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.jspecify.nullness.NullMarked;
@NullMarked
/* loaded from: classes2.dex */
public final class zzah {
    @CanIgnoreReturnValue
    public static Object[] zza(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(o00oOOo0.o00oOOo0("at index ", i2));
            }
        }
        return objArr;
    }
}
