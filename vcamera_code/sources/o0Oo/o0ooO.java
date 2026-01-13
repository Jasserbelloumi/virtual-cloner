package o0Oo;

import android.support.v4.media.o00oOOo0;
import o00ooOoo.oO00O0oO;
/* loaded from: classes3.dex */
public final class o0ooO {
    public static long o00oOOo0(String str) {
        return o00oOOoO(str, 0, str.length());
    }

    public static long o00oOOoO(String str, int i, int i2) {
        long j;
        if (str != null) {
            if (i >= 0) {
                if (i2 >= i) {
                    if (i2 > str.length()) {
                        StringBuilder o00oOOo02 = oO00O0oO.o00oOOo0("endIndex > string.length: ", i2, " > ");
                        o00oOOo02.append(str.length());
                        throw new IllegalArgumentException(o00oOOo02.toString());
                    }
                    long j2 = 0;
                    while (i < i2) {
                        char charAt = str.charAt(i);
                        if (charAt < 128) {
                            j2++;
                        } else {
                            if (charAt < 2048) {
                                j = 2;
                            } else if (charAt < 55296 || charAt > 57343) {
                                j = 3;
                            } else {
                                int i3 = i + 1;
                                char charAt2 = i3 < i2 ? str.charAt(i3) : (char) 0;
                                if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                                    j2++;
                                    i = i3;
                                } else {
                                    j2 += 4;
                                    i += 2;
                                }
                            }
                            j2 += j;
                        }
                        i++;
                    }
                    return j2;
                }
                throw new IllegalArgumentException(o0O00Oo.o0oO0Ooo.o00oOOo0("endIndex < beginIndex: ", i2, " < ", i));
            }
            throw new IllegalArgumentException(o00oOOo0.o00oOOo0("beginIndex < 0: ", i));
        }
        throw new IllegalArgumentException("string == null");
    }
}
