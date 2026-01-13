package o0OOO0OO;

import o0OO0o.o0O;
import o0OO0o.o0OO00o0;
import o0OO0o.o0OOOO;
import o0OO0o.o0oo0000;
/* loaded from: classes3.dex */
public final class o0O000 {
    public static final int o00oOOo0(int i, int i2, int i3) {
        int remainderUnsigned = Integer.remainderUnsigned(i, i3);
        int remainderUnsigned2 = Integer.remainderUnsigned(i2, i3);
        int compareUnsigned = Integer.compareUnsigned(remainderUnsigned, remainderUnsigned2);
        int o00oOooo2 = o0OOOO.o00oOooo(remainderUnsigned - remainderUnsigned2);
        return compareUnsigned >= 0 ? o00oOooo2 : o00oOooo2 + i3;
    }

    public static final long o00oOOoO(long j, long j2, long j3) {
        long remainderUnsigned = Long.remainderUnsigned(j, j3);
        long remainderUnsigned2 = Long.remainderUnsigned(j2, j3);
        int compareUnsigned = Long.compareUnsigned(remainderUnsigned, remainderUnsigned2);
        long o00oOooo2 = o0oo0000.o00oOooo(remainderUnsigned - remainderUnsigned2);
        return compareUnsigned >= 0 ? o00oOooo2 : o00oOooo2 + j3;
    }

    @o0O
    @o0OO00o0(version = "1.3")
    public static final long o00oOo00(long j, long j2, long j3) {
        int i = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i > 0) {
            return Long.compareUnsigned(j, j2) >= 0 ? j2 : j2 - o00oOOoO(j2, j, o0oo0000.o00oOooo(j3));
        } else if (i < 0) {
            return Long.compareUnsigned(j, j2) <= 0 ? j2 : j2 + o00oOOoO(j, j2, o0oo0000.o00oOooo(-j3));
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    @o0O
    @o0OO00o0(version = "1.3")
    public static final int o00oOooO(int i, int i2, int i3) {
        if (i3 > 0) {
            return Integer.compareUnsigned(i, i2) >= 0 ? i2 : i2 - o00oOOo0(i2, i, o0OOOO.o00oOooo(i3));
        } else if (i3 < 0) {
            return Integer.compareUnsigned(i, i2) <= 0 ? i2 : i2 + o00oOOo0(i, i2, o0OOOO.o00oOooo(-i3));
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }
}
