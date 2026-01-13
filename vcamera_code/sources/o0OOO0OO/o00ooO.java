package o0OOO0OO;

import o0OO0o.o0O;
/* loaded from: classes3.dex */
public final class o00ooO {
    public static final int o00oOOo0(int i, int i2, int i3) {
        int i4 = i % i3;
        if (i4 < 0) {
            i4 += i3;
        }
        int i5 = i2 % i3;
        if (i5 < 0) {
            i5 += i3;
        }
        int i6 = (i4 - i5) % i3;
        return i6 >= 0 ? i6 : i6 + i3;
    }

    public static final long o00oOOoO(long j, long j2, long j3) {
        return o00oOo0o(o00oOo0o(j, j3) - o00oOo0o(j2, j3), j3);
    }

    @o0O
    public static final int o00oOo00(int i, int i2, int i3) {
        if (i3 > 0) {
            return i >= i2 ? i2 : i2 - o00oOOo0(i2, i, i3);
        } else if (i3 < 0) {
            return i <= i2 ? i2 : i2 + o00oOOo0(i, i2, -i3);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    public static final int o00oOo0O(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    public static final long o00oOo0o(long j, long j2) {
        long j3 = j % j2;
        return j3 >= 0 ? j3 : j3 + j2;
    }

    @o0O
    public static final long o00oOooO(long j, long j2, long j3) {
        int i = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i > 0) {
            return j >= j2 ? j2 : j2 - o00oOOoO(j2, j, j3);
        } else if (i < 0) {
            return j <= j2 ? j2 : j2 + o00oOOoO(j, j2, -j3);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }
}
