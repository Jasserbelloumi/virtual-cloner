package o0OOOoo0;

import com.google.android.exoplayer2.C;
import o0OO0o.o0OO00o0;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public class oO0O00O extends oO0O00 {
    @o0OO00o0(version = "1.1")
    @Nullable
    public static final Byte o0O0OoO(@NotNull String str, int i) {
        int intValue;
        o0ooO.o00oo0O0(str, "<this>");
        Integer o0O0Ooo02 = o0O0Ooo0(str, i);
        if (o0O0Ooo02 == null || (intValue = o0O0Ooo02.intValue()) < -128 || intValue > 127) {
            return null;
        }
        return Byte.valueOf((byte) intValue);
    }

    @NotNull
    public static final Void o0O0OoO0(@NotNull String str) {
        o0ooO.o00oo0O0(str, "input");
        throw new NumberFormatException("Invalid number format: '" + str + '\'');
    }

    @o0OO00o0(version = "1.1")
    @Nullable
    public static final Integer o0O0OoOo(@NotNull String str) {
        o0ooO.o00oo0O0(str, "<this>");
        return o0O0Ooo0(str, 10);
    }

    @o0OO00o0(version = "1.1")
    @Nullable
    public static final Long o0O0Ooo(@NotNull String str) {
        o0ooO.o00oo0O0(str, "<this>");
        return o0O0OooO(str, 10);
    }

    @o0OO00o0(version = "1.1")
    @Nullable
    public static final Integer o0O0Ooo0(@NotNull String str, int i) {
        boolean z;
        int i2;
        o0ooO.o00oo0O0(str, "<this>");
        oO00OO0O.o00oOOo0(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        int o00oo0o2 = o0ooO.o00oo0o(charAt, 48);
        int i4 = C.RATE_UNSET_INT;
        int i5 = 1;
        if (o00oo0o2 >= 0) {
            z = false;
            i5 = 0;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                i4 = Integer.MIN_VALUE;
                z = true;
            } else if (charAt != '+') {
                return null;
            } else {
                z = false;
            }
        }
        int i6 = -59652323;
        while (i5 < length) {
            int digit = Character.digit((int) str.charAt(i5), i);
            if (digit < 0) {
                return null;
            }
            if ((i3 < i6 && (i6 != -59652323 || i3 < (i6 = i4 / i))) || (i2 = i3 * i) < i4 + digit) {
                return null;
            }
            i3 = i2 - digit;
            i5++;
        }
        return z ? Integer.valueOf(i3) : Integer.valueOf(-i3);
    }

    @o0OO00o0(version = "1.1")
    @Nullable
    public static final Long o0O0OooO(@NotNull String str, int i) {
        o0ooO.o00oo0O0(str, "<this>");
        oO00OO0O.o00oOOo0(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        int o00oo0o2 = o0ooO.o00oo0o(charAt, 48);
        long j = C.TIME_UNSET;
        boolean z = true;
        if (o00oo0o2 >= 0) {
            z = false;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                j = Long.MIN_VALUE;
                i2 = 1;
            } else if (charAt != '+') {
                return null;
            } else {
                z = false;
                i2 = 1;
            }
        }
        long j2 = -256204778801521550L;
        long j3 = 0;
        long j4 = -256204778801521550L;
        while (i2 < length) {
            int digit = Character.digit((int) str.charAt(i2), i);
            if (digit < 0) {
                return null;
            }
            if (j3 < j4) {
                if (j4 == j2) {
                    j4 = j / i;
                    if (j3 < j4) {
                    }
                }
                return null;
            }
            long j5 = j3 * i;
            long j6 = digit;
            if (j5 < j + j6) {
                return null;
            }
            j3 = j5 - j6;
            i2++;
            j2 = -256204778801521550L;
        }
        return z ? Long.valueOf(j3) : Long.valueOf(-j3);
    }

    @o0OO00o0(version = "1.1")
    @Nullable
    public static final Short o0O0o00(@NotNull String str, int i) {
        int intValue;
        o0ooO.o00oo0O0(str, "<this>");
        Integer o0O0Ooo02 = o0O0Ooo0(str, i);
        if (o0O0Ooo02 == null || (intValue = o0O0Ooo02.intValue()) < -32768 || intValue > 32767) {
            return null;
        }
        return Short.valueOf((short) intValue);
    }

    @o0OO00o0(version = "1.1")
    @Nullable
    public static final Short o0O0o000(@NotNull String str) {
        o0ooO.o00oo0O0(str, "<this>");
        return o0O0o00(str, 10);
    }

    @o0OO00o0(version = "1.1")
    @Nullable
    public static final Byte oo0OOoo(@NotNull String str) {
        o0ooO.o00oo0O0(str, "<this>");
        return o0O0OoO(str, 10);
    }
}
