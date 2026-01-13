package o0OOOo0;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import o0OO0o.o0OO00o0;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import o0OOOo0o.o0O0O0Oo;
import o0OOOo0o.o0O0OO0;
import org.jetbrains.annotations.NotNull;
@o0OOO00({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/RandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
/* loaded from: classes3.dex */
public final class o00oo0OO {
    @o0OO00o0(version = "1.3")
    @NotNull
    public static final o00oo0 o00oOOo0(int i) {
        return new o00oo0O(i, i >> 31);
    }

    @o0OO00o0(version = "1.3")
    @NotNull
    public static final o00oo0 o00oOOoO(long j) {
        return new o00oo0O((int) j, (int) (j >> 32));
    }

    @NotNull
    public static final String o00oOo00(@NotNull Object obj, @NotNull Object obj2) {
        o0ooO.o00oo0O0(obj, "from");
        o0ooO.o00oo0O0(obj2, "until");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }

    public static final void o00oOo0O(int i, int i2) {
        if (!(i2 > i)) {
            throw new IllegalArgumentException(o00oOo00(Integer.valueOf(i), Integer.valueOf(i2)).toString());
        }
    }

    public static final void o00oOo0o(long j, long j2) {
        if (!(j2 > j)) {
            throw new IllegalArgumentException(o00oOo00(Long.valueOf(j), Long.valueOf(j2)).toString());
        }
    }

    @o0OO00o0(version = "1.3")
    public static final int o00oOoO(@NotNull o00oo0 o00oo0Var, @NotNull o0O0O0Oo o0o0o0oo) {
        o0ooO.o00oo0O0(o00oo0Var, "<this>");
        o0ooO.o00oo0O0(o0o0o0oo, SessionDescription.ATTR_RANGE);
        if (o0o0o0oo.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + o0o0o0oo);
        }
        int i = o0o0o0oo.f13749o00oo0O;
        if (i < Integer.MAX_VALUE) {
            return o00oo0Var.nextInt(o0o0o0oo.f13750o00oo0O0, i + 1);
        }
        int i2 = o0o0o0oo.f13750o00oo0O0;
        return i2 > Integer.MIN_VALUE ? o00oo0Var.nextInt(i2 - 1, i) + 1 : o00oo0Var.nextInt();
    }

    public static final int o00oOoO0(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    @o0OO00o0(version = "1.3")
    public static final long o00oOoOO(@NotNull o00oo0 o00oo0Var, @NotNull o0O0OO0 o0o0oo0) {
        o0ooO.o00oo0O0(o00oo0Var, "<this>");
        o0ooO.o00oo0O0(o0o0oo0, SessionDescription.ATTR_RANGE);
        if (o0o0oo0.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + o0o0oo0);
        }
        long j = o0o0oo0.f13717o00oo0O;
        if (j < Long.MAX_VALUE) {
            return o00oo0Var.nextLong(o0o0oo0.f13718o00oo0O0, j + 1);
        }
        long j2 = o0o0oo0.f13718o00oo0O0;
        return j2 > Long.MIN_VALUE ? o00oo0Var.nextLong(j2 - 1, j) + 1 : o00oo0Var.nextLong();
    }

    public static final int o00oOoOo(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }

    public static final void o00oOooO(double d, double d2) {
        if (!(d2 > d)) {
            throw new IllegalArgumentException(o00oOo00(Double.valueOf(d), Double.valueOf(d2)).toString());
        }
    }
}
