package o0OO0oO;

import o0OO0o.o0OOo000;
import o0OO0o.oO0000Oo;
import o0OO0o.oO0000o0;
import o0OO0o.ooo0Oo0;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o0OOOO00 {
    @o0OO0o.o0OoOoOo
    public static final int o00oOOo0(long[] jArr, int i, int i2) {
        long o00oOoo02 = ooo0Oo0.o00oOoo0(jArr, (i + i2) / 2);
        while (i <= i2) {
            while (Long.compareUnsigned(ooo0Oo0.o00oOoo0(jArr, i), o00oOoo02) < 0) {
                i++;
            }
            while (Long.compareUnsigned(ooo0Oo0.o00oOoo0(jArr, i2), o00oOoo02) > 0) {
                i2--;
            }
            if (i <= i2) {
                long o00oOoo03 = ooo0Oo0.o00oOoo0(jArr, i);
                jArr[i] = ooo0Oo0.o00oOoo0(jArr, i2);
                jArr[i2] = o00oOoo03;
                i++;
                i2--;
            }
        }
        return i;
    }

    @o0OO0o.o0OoOoOo
    public static final int o00oOOoO(byte[] bArr, int i, int i2) {
        int i3;
        byte o00oOoo02 = o0OO0o.o0OOO0OO.o00oOoo0(bArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                i3 = o00oOoo02 & 255;
                if (o0OOOOO0.o0ooO.o00oo0o(o0OO0o.o0OOO0OO.o00oOoo0(bArr, i) & 255, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (o0OOOOO0.o0ooO.o00oo0o(o0OO0o.o0OOO0OO.o00oOoo0(bArr, i2) & 255, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                byte o00oOoo03 = o0OO0o.o0OOO0OO.o00oOoo0(bArr, i);
                bArr[i] = o0OO0o.o0OOO0OO.o00oOoo0(bArr, i2);
                bArr[i2] = o00oOoo03;
                i++;
                i2--;
            }
        }
        return i;
    }

    @o0OO0o.o0OoOoOo
    public static final int o00oOo00(short[] sArr, int i, int i2) {
        int i3;
        short o00oOoo02 = oO0000o0.o00oOoo0(sArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                int o00oOoo03 = oO0000o0.o00oOoo0(sArr, i) & oO0000Oo.f13232o00oo0o0;
                i3 = o00oOoo02 & oO0000Oo.f13232o00oo0o0;
                if (o0OOOOO0.o0ooO.o00oo0o(o00oOoo03, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (o0OOOOO0.o0ooO.o00oo0o(oO0000o0.o00oOoo0(sArr, i2) & oO0000Oo.f13232o00oo0o0, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                short o00oOoo04 = oO0000o0.o00oOoo0(sArr, i);
                sArr[i] = oO0000o0.o00oOoo0(sArr, i2);
                sArr[i2] = o00oOoo04;
                i++;
                i2--;
            }
        }
        return i;
    }

    @o0OO0o.o0OoOoOo
    public static final void o00oOo0O(long[] jArr, int i, int i2) {
        int o00oOOo02 = o00oOOo0(jArr, i, i2);
        int i3 = o00oOOo02 - 1;
        if (i < i3) {
            o00oOo0O(jArr, i, i3);
        }
        if (o00oOOo02 < i2) {
            o00oOo0O(jArr, o00oOOo02, i2);
        }
    }

    @o0OO0o.o0OoOoOo
    public static final void o00oOo0o(byte[] bArr, int i, int i2) {
        int o00oOOoO2 = o00oOOoO(bArr, i, i2);
        int i3 = o00oOOoO2 - 1;
        if (i < i3) {
            o00oOo0o(bArr, i, i3);
        }
        if (o00oOOoO2 < i2) {
            o00oOo0o(bArr, o00oOOoO2, i2);
        }
    }

    @o0OO0o.o0OoOoOo
    public static final void o00oOoO(int[] iArr, int i, int i2) {
        int o00oOooO2 = o00oOooO(iArr, i, i2);
        int i3 = o00oOooO2 - 1;
        if (i < i3) {
            o00oOoO(iArr, i, i3);
        }
        if (o00oOooO2 < i2) {
            o00oOoO(iArr, o00oOooO2, i2);
        }
    }

    @o0OO0o.o0OoOoOo
    public static final void o00oOoO0(short[] sArr, int i, int i2) {
        int o00oOo002 = o00oOo00(sArr, i, i2);
        int i3 = o00oOo002 - 1;
        if (i < i3) {
            o00oOoO0(sArr, i, i3);
        }
        if (o00oOo002 < i2) {
            o00oOoO0(sArr, o00oOo002, i2);
        }
    }

    @o0OO0o.o0OoOoOo
    public static final void o00oOoOO(@NotNull long[] jArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "array");
        o00oOo0O(jArr, i, i2 - 1);
    }

    @o0OO0o.o0OoOoOo
    public static final void o00oOoOo(@NotNull byte[] bArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "array");
        o00oOo0o(bArr, i, i2 - 1);
    }

    @o0OO0o.o0OoOoOo
    public static final void o00oOoo0(@NotNull short[] sArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "array");
        o00oOoO0(sArr, i, i2 - 1);
    }

    @o0OO0o.o0OoOoOo
    public static final int o00oOooO(int[] iArr, int i, int i2) {
        int o00oOoo02 = o0OOo000.o00oOoo0(iArr, (i + i2) / 2);
        while (i <= i2) {
            while (Integer.compareUnsigned(o0OOo000.o00oOoo0(iArr, i), o00oOoo02) < 0) {
                i++;
            }
            while (Integer.compareUnsigned(o0OOo000.o00oOoo0(iArr, i2), o00oOoo02) > 0) {
                i2--;
            }
            if (i <= i2) {
                int o00oOoo03 = o0OOo000.o00oOoo0(iArr, i);
                iArr[i] = o0OOo000.o00oOoo0(iArr, i2);
                iArr[i2] = o00oOoo03;
                i++;
                i2--;
            }
        }
        return i;
    }

    @o0OO0o.o0OoOoOo
    public static final void o00oOooo(@NotNull int[] iArr, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "array");
        o00oOoO(iArr, i, i2 - 1);
    }
}
