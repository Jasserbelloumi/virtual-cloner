package com.google.android.gms.internal.common;

import android.support.v4.media.o00oOo0O;
/* loaded from: classes2.dex */
final class zzl extends zzk {
    private final char zza;

    public zzl(char c) {
        this.zza = c;
    }

    public final String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("CharMatcher.is('");
        int i = this.zza;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        o00oOOo02.append(String.copyValueOf(cArr));
        o00oOOo02.append("')");
        return o00oOOo02.toString();
    }

    @Override // com.google.android.gms.internal.common.zzo
    public final boolean zza(char c) {
        return c == this.zza;
    }
}
