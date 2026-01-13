package o0OOOo0o;

import android.support.v4.media.o00oOo0O;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.common.primitives.UnsignedInts;
import java.util.NoSuchElementException;
import o0OO0o.o0O000;
import o0OO0o.o0OO00o0;
import o0OO0o.o0OOO0O;
import o0OO0o.o0OOOO;
import o0OO0o.o0OoOoOo;
import o0OO0o.o0oo0000;
import o0OO0o.oO0000Oo;
import o0OO0o.oO0Oo0oo;
import o0OO0o.oO0OoOO0;
import o0OOO0OO.o00oo00O;
import o0OOOo0.o00oo0;
import o0OOOo0.o00oo0O0;
import o0OOOo0o.o0O0o0;
import o0OOOo0o.o0O0o000;
import o0Oo0ooo.oO000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public class o0O {
    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    @NotNull
    public static final o0O0o00O o0(short s, short s2) {
        int i = s2 & oO0000Oo.f13232o00oo0o0;
        if (o0OOOOO0.o0ooO.o00oo0o(i, 0) <= 0) {
            o0O0o00O.f13738o00oo0o.getClass();
            return o0O0o00O.o00oOoOO();
        }
        return new o0O0o00O(o0OOOO.o00oOooo(s & oO0000Oo.f13232o00oo0o0), i - 1, null);
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final short o00oOOo0(short s, short s2) {
        return o0OOOOO0.o0ooO.o00oo0o(s & oO0000Oo.f13232o00oo0o0, 65535 & s2) < 0 ? s2 : s;
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final int o00oOOoO(int i, int i2) {
        return Integer.compareUnsigned(i, i2) < 0 ? i2 : i;
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final byte o00oOo00(byte b, byte b2) {
        return o0OOOOO0.o0ooO.o00oo0o(b & 255, b2 & 255) < 0 ? b2 : b;
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final short o00oOo0O(short s, short s2) {
        return o0OOOOO0.o0ooO.o00oo0o(s & oO0000Oo.f13232o00oo0o0, 65535 & s2) > 0 ? s2 : s;
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final int o00oOo0o(int i, int i2) {
        return Integer.compareUnsigned(i, i2) > 0 ? i2 : i;
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final long o00oOoO(long j, long j2) {
        return Long.compareUnsigned(j, j2) > 0 ? j2 : j;
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final byte o00oOoO0(byte b, byte b2) {
        return o0OOOOO0.o0ooO.o00oo0o(b & 255, b2 & 255) > 0 ? b2 : b;
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final long o00oOoOO(long j, @NotNull o0O00o00<o0oo0000> o0o00o00) {
        o0oo0000 o00oOo002;
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, SessionDescription.ATTR_RANGE);
        if (o0o00o00 instanceof o0oO0Ooo) {
            return ((o0oo0000) oo0OOoo.o00oooO(o0oo0000.o00oOooO(j), (o0oO0Ooo) o0o00o00)).f13227o00oo0O0;
        }
        if (o0o00o00.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + o0o00o00 + '.');
        }
        if (Long.compareUnsigned(j, o0o00o00.o00oOOo0().f13227o00oo0O0) < 0) {
            o00oOo002 = o0o00o00.o00oOOo0();
        } else if (Long.compareUnsigned(j, o0o00o00.o00oOo00().f13227o00oo0O0) <= 0) {
            return j;
        } else {
            o00oOo002 = o0o00o00.o00oOo00();
        }
        return o00oOo002.f13227o00oo0O0;
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final short o00oOoOo(short s, short s2, short s3) {
        int i = s2 & oO0000Oo.f13232o00oo0o0;
        int i2 = s3 & oO0000Oo.f13232o00oo0o0;
        if (o0OOOOO0.o0ooO.o00oo0o(i, i2) <= 0) {
            int i3 = 65535 & s;
            return o0OOOOO0.o0ooO.o00oo0o(i3, i) < 0 ? s2 : o0OOOOO0.o0ooO.o00oo0o(i3, i2) > 0 ? s3 : s;
        }
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Cannot coerce value to an empty range: maximum ");
        o00oOOo02.append((Object) oO0000Oo.o0O000o(s3));
        o00oOOo02.append(" is less than minimum ");
        o00oOOo02.append((Object) oO0000Oo.o0O000o(s2));
        o00oOOo02.append('.');
        throw new IllegalArgumentException(o00oOOo02.toString());
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final int o00oOoo0(int i, int i2, int i3) {
        if (Integer.compareUnsigned(i2, i3) <= 0) {
            return Integer.compareUnsigned(i, i2) < 0 ? i2 : Integer.compareUnsigned(i, i3) > 0 ? i3 : i;
        }
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Cannot coerce value to an empty range: maximum ");
        o00oOOo02.append((Object) o0OOOO.o0O000oo(i3));
        o00oOOo02.append(" is less than minimum ");
        o00oOOo02.append((Object) o0OOOO.o0O000oo(i2));
        o00oOOo02.append('.');
        throw new IllegalArgumentException(o00oOOo02.toString());
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final long o00oOooO(long j, long j2) {
        return Long.compareUnsigned(j, j2) < 0 ? j2 : j;
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final byte o00oOooo(byte b, byte b2, byte b3) {
        int i = b2 & 255;
        int i2 = b3 & 255;
        if (o0OOOOO0.o0ooO.o00oo0o(i, i2) <= 0) {
            int i3 = b & 255;
            return o0OOOOO0.o0ooO.o00oo0o(i3, i) < 0 ? b2 : o0OOOOO0.o0ooO.o00oo0o(i3, i2) > 0 ? b3 : b;
        }
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Cannot coerce value to an empty range: maximum ");
        o00oOOo02.append((Object) o0OOO0O.o0O000o(b3));
        o00oOOo02.append(" is less than minimum ");
        o00oOOo02.append((Object) o0OOO0O.o0O000o(b2));
        o00oOOo02.append('.');
        throw new IllegalArgumentException(o00oOOo02.toString());
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    @NotNull
    public static final o0O0o000 o00oo(short s, short s2) {
        o0O0o000.o00oOOo0 o00oooo02 = o0O0o000.f13734o00oo0o0;
        int o00oOooo2 = o0OOOO.o00oOooo(s & oO0000Oo.f13232o00oo0o0);
        int i = s2 & oO0000Oo.f13232o00oo0o0;
        o00oooo02.getClass();
        return new o0O0o000(o00oOooo2, i, -1);
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final int o00oo0(int i, @NotNull o0O00o00<o0OOOO> o0o00o00) {
        o0OOOO o00oOo002;
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, SessionDescription.ATTR_RANGE);
        if (o0o00o00 instanceof o0oO0Ooo) {
            return ((o0OOOO) oo0OOoo.o00oooO(o0OOOO.o00oOooO(i), (o0oO0Ooo) o0o00o00)).f13218o00oo0O0;
        }
        if (o0o00o00.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + o0o00o00 + '.');
        }
        if (Integer.compareUnsigned(i, o0o00o00.o00oOOo0().f13218o00oo0O0) < 0) {
            o00oOo002 = o0o00o00.o00oOOo0();
        } else if (Integer.compareUnsigned(i, o0o00o00.o00oOo00().f13218o00oo0O0) <= 0) {
            return i;
        } else {
            o00oOo002 = o0o00o00.o00oOo00();
        }
        return o00oOo002.f13218o00oo0O0;
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final long o00oo00O(long j, long j2, long j3) {
        if (Long.compareUnsigned(j2, j3) <= 0) {
            return Long.compareUnsigned(j, j2) < 0 ? j2 : Long.compareUnsigned(j, j3) > 0 ? j3 : j;
        }
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Cannot coerce value to an empty range: maximum ");
        o00oOOo02.append((Object) o0oo0000.o0O000oo(j3));
        o00oOOo02.append(" is less than minimum ");
        o00oOOo02.append((Object) oO0OoOO0.o00oOoo0(j2));
        o00oOOo02.append('.');
        throw new IllegalArgumentException(o00oOOo02.toString());
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final boolean o00oo0O(@NotNull oooOO0 ooooo0, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(ooooo0, "$this$contains");
        return ooooo0.o00oOoOo(o0oo0000.o00oOooo(i & UnsignedInts.INT_MASK));
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o00oo00O
    @o0OO00o0(version = "1.5")
    public static final boolean o00oo0O0(oooOO0 ooooo0, o0oo0000 o0oo0000Var) {
        o0OOOOO0.o0ooO.o00oo0O0(ooooo0, "$this$contains");
        return o0oo0000Var != null && ooooo0.o00oOoOo(o0oo0000Var.f13227o00oo0O0);
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final boolean o00oo0OO(@NotNull o0O0o00O o0o0o00o, byte b) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o00o, "$this$contains");
        return o0o0o00o.o00oOoOo(o0OOOO.o00oOooo(b & 255));
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final boolean o00oo0Oo(@NotNull oooOO0 ooooo0, byte b) {
        o0OOOOO0.o0ooO.o00oo0O0(ooooo0, "$this$contains");
        return ooooo0.o00oOoOo(o0oo0000.o00oOooo(b & 255));
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o00oo00O
    @o0OO00o0(version = "1.5")
    public static final boolean o00oo0o(o0O0o00O o0o0o00o, o0OOOO o0oooo) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o00o, "$this$contains");
        return o0oooo != null && o0o0o00o.o00oOoOo(o0oooo.f13218o00oo0O0);
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final boolean o00oo0o0(@NotNull o0O0o00O o0o0o00o, short s) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o00o, "$this$contains");
        return o0o0o00o.o00oOoOo(o0OOOO.o00oOooo(s & oO0000Oo.f13232o00oo0o0));
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final boolean o00oo0oO(@NotNull o0O0o00O o0o0o00o, long j) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o00o, "$this$contains");
        return o0oo0000.o00oOooo(j >>> 32) == 0 && o0o0o00o.o00oOoOo(o0OOOO.o00oOooo((int) j));
    }

    @o0OO00o0(version = "1.7")
    public static final long o00ooO(@NotNull o0O0o0 o0o0o0) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0, "<this>");
        if (o0o0o0.isEmpty()) {
            throw new NoSuchElementException("Progression " + o0o0o0 + " is empty.");
        }
        return o0o0o0.o00oOo0O();
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    @NotNull
    public static final o0O0o000 o00ooO0(byte b, byte b2) {
        o0O0o000.f13734o00oo0o0.getClass();
        return new o0O0o000(o0OOOO.o00oOooo(b & 255), b2 & 255, -1);
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    @NotNull
    public static final o0O0o000 o00ooO00(int i, int i2) {
        o0O0o000.f13734o00oo0o0.getClass();
        return new o0O0o000(i, i2, -1);
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    @NotNull
    public static final o0O0o0 o00ooO0O(long j, long j2) {
        return o0O0o0.f13726o00oo0o0.o00oOOo0(j, j2, -1L);
    }

    @o0OO00o0(version = "1.7")
    public static final int o00ooO0o(@NotNull o0O0o000 o0o0o000) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o000, "<this>");
        if (o0o0o000.isEmpty()) {
            throw new NoSuchElementException("Progression " + o0o0o000 + " is empty.");
        }
        return o0o0o000.o00oOo0O();
    }

    @o0OO00o0(version = "1.7")
    @Nullable
    public static final o0oo0000 o00ooOO(@NotNull o0O0o0 o0o0o0) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0, "<this>");
        if (o0o0o0.isEmpty()) {
            return null;
        }
        return o0oo0000.o00oOooO(o0o0o0.o00oOo0O());
    }

    @o0OO00o0(version = "1.7")
    @Nullable
    public static final o0OOOO o00ooOO0(@NotNull o0O0o000 o0o0o000) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o000, "<this>");
        if (o0o0o000.isEmpty()) {
            return null;
        }
        return o0OOOO.o00oOooO(o0o0o000.o00oOo0O());
    }

    @o0OO00o0(version = "1.7")
    public static final int o00ooOOo(@NotNull o0O0o000 o0o0o000) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o000, "<this>");
        if (o0o0o000.isEmpty()) {
            throw new NoSuchElementException("Progression " + o0o0o000 + " is empty.");
        }
        return o0o0o000.o00oOoO0();
    }

    @o0OO00o0(version = "1.7")
    @Nullable
    public static final o0OOOO o00ooOo(@NotNull o0O0o000 o0o0o000) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o000, "<this>");
        if (o0o0o000.isEmpty()) {
            return null;
        }
        return o0OOOO.o00oOooO(o0o0o000.o00oOoO0());
    }

    @o0OO00o0(version = "1.7")
    public static final long o00ooOo0(@NotNull o0O0o0 o0o0o0) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0, "<this>");
        if (o0o0o0.isEmpty()) {
            throw new NoSuchElementException("Progression " + o0o0o0 + " is empty.");
        }
        return o0o0o0.o00oOoO0();
    }

    @o0OO00o0(version = "1.7")
    @Nullable
    public static final o0oo0000 o00ooOoO(@NotNull o0O0o0 o0o0o0) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0, "<this>");
        if (o0o0o0.isEmpty()) {
            return null;
        }
        return o0oo0000.o00oOooO(o0o0o0.o00oOoO0());
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o00oo00O
    @o0OO00o0(version = "1.5")
    public static final int o00ooOoo(o0O0o00O o0o0o00o) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o00o, "<this>");
        return o00ooo00(o0o0o00o, o00oo0.Default);
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o00oo00O
    @o0OO00o0(version = "1.5")
    public static final long o00ooo0(oooOO0 ooooo0) {
        o0OOOOO0.o0ooO.o00oo0O0(ooooo0, "<this>");
        return o00ooo0O(ooooo0, o00oo0.Default);
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final int o00ooo00(@NotNull o0O0o00O o0o0o00o, @NotNull o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o00o, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        try {
            return o00oo0O0.o00oOoO(o00oo0Var, o0o0o00o);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final long o00ooo0O(@NotNull oooOO0 ooooo0, @NotNull o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(ooooo0, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        try {
            return o00oo0O0.o00oOooo(o00oo0Var, ooooo0);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @oO0Oo0oo(markerClass = {o0O000.class, o0OoOoOo.class})
    @o00oo00O
    @o0OO00o0(version = "1.5")
    public static final o0OOOO o00ooo0o(o0O0o00O o0o0o00o) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o00o, "<this>");
        return o00oooO(o0o0o00o, o00oo0.Default);
    }

    @oO0Oo0oo(markerClass = {o0O000.class, o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    @Nullable
    public static final o0OOOO o00oooO(@NotNull o0O0o00O o0o0o00o, @NotNull o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o00o, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        if (o0o0o00o.isEmpty()) {
            return null;
        }
        return o0OOOO.o00oOooO(o00oo0O0.o00oOoO(o00oo0Var, o0o0o00o));
    }

    @oO0Oo0oo(markerClass = {o0O000.class, o0OoOoOo.class})
    @o00oo00O
    @o0OO00o0(version = "1.5")
    public static final o0oo0000 o00oooOO(oooOO0 ooooo0) {
        o0OOOOO0.o0ooO.o00oo0O0(ooooo0, "<this>");
        return o00oooOo(ooooo0, o00oo0.Default);
    }

    @oO0Oo0oo(markerClass = {o0O000.class, o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    @Nullable
    public static final o0oo0000 o00oooOo(@NotNull oooOO0 ooooo0, @NotNull o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(ooooo0, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        if (ooooo0.isEmpty()) {
            return null;
        }
        return o0oo0000.o00oOooO(o00oo0O0.o00oOooo(o00oo0Var, ooooo0));
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    @NotNull
    public static final o0O0o0 o00oooo(@NotNull o0O0o0 o0o0o0) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0, "<this>");
        return o0O0o0.f13726o00oo0o0.o00oOOo0(o0o0o0.o00oOoO0(), o0o0o0.o00oOo0O(), -o0o0o0.o00oOoO());
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    @NotNull
    public static final o0O0o000 o00oooo0(@NotNull o0O0o000 o0o0o000) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o000, "<this>");
        o0O0o000.f13734o00oo0o0.getClass();
        return new o0O0o000(o0o0o000.o00oOoO0(), o0o0o000.o00oOo0O(), -o0o0o000.o00oOoO());
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    @NotNull
    public static final o0O0o000 o00ooooO(@NotNull o0O0o000 o0o0o000, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o000, "<this>");
        o0OooO0.o00oOOo0(i > 0, Integer.valueOf(i));
        o0O0o000.o00oOOo0 o00oooo02 = o0O0o000.f13734o00oo0o0;
        int o00oOo0O2 = o0o0o000.o00oOo0O();
        int o00oOoO02 = o0o0o000.o00oOoO0();
        if (o0o0o000.o00oOoO() <= 0) {
            i = -i;
        }
        o00oooo02.getClass();
        return new o0O0o000(o00oOo0O2, o00oOoO02, i);
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    @NotNull
    public static final o0O0o0 o00ooooo(@NotNull o0O0o0 o0o0o0, long j) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0, "<this>");
        o0OooO0.o00oOOo0(j > 0, Long.valueOf(j));
        o0O0o0.o00oOOo0 o00oooo02 = o0O0o0.f13726o00oo0o0;
        long o00oOo0O2 = o0o0o0.o00oOo0O();
        long o00oOoO02 = o0o0o0.o00oOoO0();
        if (o0o0o0.o00oOoO() <= 0) {
            j = -j;
        }
        return o00oooo02.o00oOOo0(o00oOo0O2, o00oOoO02, j);
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    @NotNull
    public static final o0O0o00O o0O00000(int i, int i2) {
        if (Integer.compareUnsigned(i2, 0) <= 0) {
            o0O0o00O.f13738o00oo0o.getClass();
            return o0O0o00O.o00oOoOO();
        }
        return new o0O0o00O(i, o0OOOO.o00oOooo(i2 - 1), null);
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    @NotNull
    public static final o0O0o00O o0O0000O(byte b, byte b2) {
        int i = b2 & 255;
        if (o0OOOOO0.o0ooO.o00oo0o(i, 0) <= 0) {
            o0O0o00O.f13738o00oo0o.getClass();
            return o0O0o00O.o00oOoOO();
        }
        return new o0O0o00O(o0OOOO.o00oOooo(b & 255), i - 1, null);
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    @NotNull
    public static final oooOO0 o0O0000o(long j, long j2) {
        if (Long.compareUnsigned(j2, 0L) <= 0) {
            oooOO0.f13760o00oo0o.getClass();
            return oooOO0.o00oOoOO();
        }
        return new oooOO0(j, j2 - o0oo0000.o00oOooo(1 & UnsignedInts.INT_MASK));
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class})
    @o0OO00o0(version = "1.5")
    public static final boolean o0O0o(@NotNull oooOO0 ooooo0, short s) {
        o0OOOOO0.o0ooO.o00oo0O0(ooooo0, "$this$contains");
        return ooooo0.o00oOoOo(o0oo0000.o00oOooo(s & oO000.f16696o00oo0o0));
    }
}
