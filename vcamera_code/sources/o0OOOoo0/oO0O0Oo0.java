package o0OOOoo0;

import com.google.common.primitives.UnsignedInts;
import o0OO0o.o0OO00o0;
import o0OO0o.o0OOO0O;
import o0OO0o.o0OOOO;
import o0OO0o.o0OoO00O;
import o0OO0o.o0OoOoOo;
import o0OO0o.o0oo0000;
import o0OO0o.oO0000Oo;
import o0OO0o.oO0Oo0oo;
import o0OO0o.oO0OoOO0;
import o0OOOO0o.o00oo0OO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o00oo0OO(name = "UStringsKt")
/* loaded from: classes3.dex */
public final class oO0O0Oo0 {
    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    @NotNull
    public static final String o00oOOo0(long j, int i) {
        return oO0OoOO0.o00oOooo(j, oO00OO0O.o00oOOo0(i));
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    @NotNull
    public static final String o00oOOoO(byte b, int i) {
        String num = Integer.toString(b & 255, oO00OO0O.o00oOOo0(i));
        o0ooO.o00oo0OO(num, "toString(this, checkRadix(radix))");
        return num;
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    @NotNull
    public static final String o00oOo00(int i, int i2) {
        String l = Long.toString(i & UnsignedInts.INT_MASK, oO00OO0O.o00oOOo0(i2));
        o0ooO.o00oo0OO(l, "toString(this, checkRadix(radix))");
        return l;
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final byte o00oOo0O(@NotNull String str) {
        o0ooO.o00oo0O0(str, "<this>");
        o0OOO0O o00oOoO02 = o00oOoO0(str);
        if (o00oOoO02 != null) {
            return o00oOoO02.f13209o00oo0O0;
        }
        oO0O00O.o0O0OoO0(str);
        throw new o0OoO00O();
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final byte o00oOo0o(@NotNull String str, int i) {
        o0ooO.o00oo0O0(str, "<this>");
        o0OOO0O o00oOoO2 = o00oOoO(str, i);
        if (o00oOoO2 != null) {
            return o00oOoO2.f13209o00oo0O0;
        }
        oO0O00O.o0O0OoO0(str);
        throw new o0OoO00O();
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    @Nullable
    public static final o0OOO0O o00oOoO(@NotNull String str, int i) {
        o0ooO.o00oo0O0(str, "<this>");
        o0OOOO o00oOooo2 = o00oOooo(str, i);
        if (o00oOooo2 != null) {
            int i2 = o00oOooo2.f13218o00oo0O0;
            if (Integer.compareUnsigned(i2, 255) > 0) {
                return null;
            }
            return new o0OOO0O(o0OOO0O.o00oOooo((byte) i2));
        }
        return null;
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    @Nullable
    public static final o0OOO0O o00oOoO0(@NotNull String str) {
        o0ooO.o00oo0O0(str, "<this>");
        return o00oOoO(str, 10);
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final int o00oOoOO(@NotNull String str) {
        o0ooO.o00oo0O0(str, "<this>");
        o0OOOO o00oOoo02 = o00oOoo0(str);
        if (o00oOoo02 != null) {
            return o00oOoo02.f13218o00oo0O0;
        }
        oO0O00O.o0O0OoO0(str);
        throw new o0OoO00O();
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final int o00oOoOo(@NotNull String str, int i) {
        o0ooO.o00oo0O0(str, "<this>");
        o0OOOO o00oOooo2 = o00oOooo(str, i);
        if (o00oOooo2 != null) {
            return o00oOooo2.f13218o00oo0O0;
        }
        oO0O00O.o0O0OoO0(str);
        throw new o0OoO00O();
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    @Nullable
    public static final o0OOOO o00oOoo0(@NotNull String str) {
        o0ooO.o00oo0O0(str, "<this>");
        return o00oOooo(str, 10);
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    @NotNull
    public static final String o00oOooO(short s, int i) {
        String num = Integer.toString(s & oO0000Oo.f13232o00oo0o0, oO00OO0O.o00oOOo0(i));
        o0ooO.o00oo0OO(num, "toString(this, checkRadix(radix))");
        return num;
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    @Nullable
    public static final o0OOOO o00oOooo(@NotNull String str, int i) {
        o0ooO.o00oo0O0(str, "<this>");
        oO00OO0O.o00oOOo0(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        int i3 = 1;
        if (o0ooO.o00oo0o(charAt, 48) >= 0) {
            i3 = 0;
        } else if (length == 1 || charAt != '+') {
            return null;
        }
        int o00oOooo2 = o0OOOO.o00oOooo(i);
        int i4 = 119304647;
        while (i3 < length) {
            int digit = Character.digit((int) str.charAt(i3), i);
            if (digit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i2, i4) > 0) {
                if (i4 == 119304647) {
                    i4 = Integer.divideUnsigned(-1, o00oOooo2);
                    if (Integer.compareUnsigned(i2, i4) > 0) {
                    }
                }
                return null;
            }
            int i5 = i2 * o00oOooo2;
            int i6 = digit + i5;
            if (Integer.compareUnsigned(i6, i5) < 0) {
                return null;
            }
            i3++;
            i2 = i6;
        }
        return new o0OOOO(i2);
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final long o00oo0(@NotNull String str, int i) {
        o0ooO.o00oo0O0(str, "<this>");
        o0oo0000 o00oo0O02 = o00oo0O0(str, i);
        if (o00oo0O02 != null) {
            return o00oo0O02.f13227o00oo0O0;
        }
        oO0O00O.o0O0OoO0(str);
        throw new o0OoO00O();
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final long o00oo00O(@NotNull String str) {
        o0ooO.o00oo0O0(str, "<this>");
        o0oo0000 o00oo0OO2 = o00oo0OO(str);
        if (o00oo0OO2 != null) {
            return o00oo0OO2.f13227o00oo0O0;
        }
        oO0O00O.o0O0OoO0(str);
        throw new o0OoO00O();
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final short o00oo0O(@NotNull String str) {
        o0ooO.o00oo0O0(str, "<this>");
        oO0000Oo o00oo0o02 = o00oo0o0(str);
        if (o00oo0o02 != null) {
            return o00oo0o02.f13234o00oo0O0;
        }
        oO0O00O.o0O0OoO0(str);
        throw new o0OoO00O();
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    @Nullable
    public static final o0oo0000 o00oo0O0(@NotNull String str, int i) {
        int digit;
        o0ooO.o00oo0O0(str, "<this>");
        oO00OO0O.o00oOOo0(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        long j = -1;
        int i2 = 0;
        char charAt = str.charAt(0);
        if (o0ooO.o00oo0o(charAt, 48) < 0) {
            if (length == 1 || charAt != '+') {
                return null;
            }
            i2 = 1;
        }
        long o00oOooo2 = o0oo0000.o00oOooo(i);
        long j2 = 0;
        long j3 = 512409557603043100L;
        while (i2 < length) {
            if (Character.digit((int) str.charAt(i2), i) < 0) {
                return null;
            }
            if (Long.compareUnsigned(j2, j3) > 0) {
                if (j3 == 512409557603043100L) {
                    j3 = Long.divideUnsigned(j, o00oOooo2);
                    if (Long.compareUnsigned(j2, j3) > 0) {
                    }
                }
                return null;
            }
            long j4 = j2 * o00oOooo2;
            long o00oOooo3 = (o0OOOO.o00oOooo(digit) & UnsignedInts.INT_MASK) + j4;
            if (Long.compareUnsigned(o00oOooo3, j4) < 0) {
                return null;
            }
            i2++;
            j2 = o00oOooo3;
            j = -1;
        }
        return new o0oo0000(j2);
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    @Nullable
    public static final o0oo0000 o00oo0OO(@NotNull String str) {
        o0ooO.o00oo0O0(str, "<this>");
        return o00oo0O0(str, 10);
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final short o00oo0Oo(@NotNull String str, int i) {
        o0ooO.o00oo0O0(str, "<this>");
        oO0000Oo o00oo0o2 = o00oo0o(str, i);
        if (o00oo0o2 != null) {
            return o00oo0o2.f13234o00oo0O0;
        }
        oO0O00O.o0O0OoO0(str);
        throw new o0OoO00O();
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    @Nullable
    public static final oO0000Oo o00oo0o(@NotNull String str, int i) {
        o0ooO.o00oo0O0(str, "<this>");
        o0OOOO o00oOooo2 = o00oOooo(str, i);
        if (o00oOooo2 != null) {
            int i2 = o00oOooo2.f13218o00oo0O0;
            if (Integer.compareUnsigned(i2, 65535) > 0) {
                return null;
            }
            return new oO0000Oo(oO0000Oo.o00oOooo((short) i2));
        }
        return null;
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    @Nullable
    public static final oO0000Oo o00oo0o0(@NotNull String str) {
        o0ooO.o00oo0O0(str, "<this>");
        return o00oo0o(str, 10);
    }
}
