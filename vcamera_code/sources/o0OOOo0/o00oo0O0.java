package o0OOOo0;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.common.primitives.UnsignedInts;
import o0OO0o.o0OO00o0;
import o0OO0o.o0OOOO;
import o0OO0o.o0OoOoOo;
import o0OO0o.o0oo0000;
import o0OO0o.oO0Oo0oo;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import o0OOOo0o.o0O0o00O;
import o0OOOo0o.oooOO0;
import org.jetbrains.annotations.NotNull;
@o0OOO00({"SMAP\nURandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URandom.kt\nkotlin/random/URandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n1#2:156\n*E\n"})
/* loaded from: classes3.dex */
public final class o00oo0O0 {
    public static final void o00oOOo0(int i, int i2) {
        if (!(Integer.compareUnsigned(i2, i) > 0)) {
            throw new IllegalArgumentException(o00oo0OO.o00oOo00(o0OOOO.o00oOooO(i), new o0OOOO(i2)).toString());
        }
    }

    public static final void o00oOOoO(long j, long j2) {
        if (!(Long.compareUnsigned(j2, j) > 0)) {
            throw new IllegalArgumentException(o00oo0OO.o00oOo00(o0oo0000.o00oOooO(j), new o0oo0000(j2)).toString());
        }
    }

    @o0OoOoOo
    @o0OO00o0(version = "1.3")
    @NotNull
    public static final byte[] o00oOo00(@NotNull o00oo0 o00oo0Var, int i) {
        o0ooO.o00oo0O0(o00oo0Var, "<this>");
        byte[] nextBytes = o00oo0Var.nextBytes(i);
        o0ooO.o00oo0O0(nextBytes, "storage");
        return nextBytes;
    }

    @o0OoOoOo
    @o0OO00o0(version = "1.3")
    @NotNull
    public static final byte[] o00oOo0O(@NotNull o00oo0 o00oo0Var, @NotNull byte[] bArr, int i, int i2) {
        o0ooO.o00oo0O0(o00oo0Var, "$this$nextUBytes");
        o0ooO.o00oo0O0(bArr, "array");
        o00oo0Var.nextBytes(bArr, i, i2);
        return bArr;
    }

    public static byte[] o00oOo0o(o00oo0 o00oo0Var, byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return o00oOo0O(o00oo0Var, bArr, i, i2);
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final int o00oOoO(@NotNull o00oo0 o00oo0Var, @NotNull o0O0o00O o0o0o00o) {
        o0ooO.o00oo0O0(o00oo0Var, "<this>");
        o0ooO.o00oo0O0(o0o0o00o, SessionDescription.ATTR_RANGE);
        if (!o0o0o00o.isEmpty()) {
            return Integer.compareUnsigned(o0o0o00o.f13735o00oo0O, -1) < 0 ? o00oOoOO(o00oo0Var, o0o0o00o.f13736o00oo0O0, o0OOOO.o00oOooo(o0o0o00o.f13735o00oo0O + 1)) : Integer.compareUnsigned(o0o0o00o.f13736o00oo0O0, 0) > 0 ? o00oOoOO(o00oo0Var, o0OOOO.o00oOooo(o0o0o00o.f13736o00oo0O0 - 1), o0o0o00o.f13735o00oo0O) + 1 : o00oOoO0(o00oo0Var);
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + o0o0o00o);
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final int o00oOoO0(@NotNull o00oo0 o00oo0Var) {
        o0ooO.o00oo0O0(o00oo0Var, "<this>");
        return o0OOOO.o00oOooo(o00oo0Var.nextInt());
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final int o00oOoOO(@NotNull o00oo0 o00oo0Var, int i, int i2) {
        o0ooO.o00oo0O0(o00oo0Var, "$this$nextUInt");
        o00oOOo0(i, i2);
        return o0OOOO.o00oOooo(o00oo0Var.nextInt(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) ^ Integer.MIN_VALUE);
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final int o00oOoOo(@NotNull o00oo0 o00oo0Var, int i) {
        o0ooO.o00oo0O0(o00oo0Var, "$this$nextUInt");
        return o00oOoOO(o00oo0Var, 0, i);
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final long o00oOoo0(@NotNull o00oo0 o00oo0Var) {
        o0ooO.o00oo0O0(o00oo0Var, "<this>");
        return o0oo0000.o00oOooo(o00oo0Var.nextLong());
    }

    @o0OoOoOo
    @o0OO00o0(version = "1.3")
    @NotNull
    public static final byte[] o00oOooO(@NotNull o00oo0 o00oo0Var, @NotNull byte[] bArr) {
        o0ooO.o00oo0O0(o00oo0Var, "$this$nextUBytes");
        o0ooO.o00oo0O0(bArr, "array");
        o00oo0Var.nextBytes(bArr);
        return bArr;
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final long o00oOooo(@NotNull o00oo0 o00oo0Var, @NotNull oooOO0 ooooo0) {
        o0ooO.o00oo0O0(o00oo0Var, "<this>");
        o0ooO.o00oo0O0(ooooo0, SessionDescription.ATTR_RANGE);
        if (ooooo0.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + ooooo0);
        } else if (Long.compareUnsigned(ooooo0.f13727o00oo0O, -1L) < 0) {
            return o00oo0(o00oo0Var, ooooo0.f13728o00oo0O0, o0oo0000.o00oOooo(1 & UnsignedInts.INT_MASK) + ooooo0.f13727o00oo0O);
        } else if (Long.compareUnsigned(ooooo0.f13728o00oo0O0, 0L) > 0) {
            long j = ooooo0.f13728o00oo0O0;
            long j2 = 1 & UnsignedInts.INT_MASK;
            return o00oo0(o00oo0Var, j - o0oo0000.o00oOooo(j2), ooooo0.f13727o00oo0O) + j2;
        } else {
            return o00oOoo0(o00oo0Var);
        }
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final long o00oo0(@NotNull o00oo0 o00oo0Var, long j, long j2) {
        o0ooO.o00oo0O0(o00oo0Var, "$this$nextULong");
        o00oOOoO(j, j2);
        return o0oo0000.o00oOooo(o00oo0Var.nextLong(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) ^ Long.MIN_VALUE);
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final long o00oo00O(@NotNull o00oo0 o00oo0Var, long j) {
        o0ooO.o00oo0O0(o00oo0Var, "$this$nextULong");
        return o00oo0(o00oo0Var, 0L, j);
    }
}
