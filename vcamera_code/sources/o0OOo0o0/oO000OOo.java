package o0OOo0o0;

import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import o0OOOoo0.oO0O00O;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a,\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0000\u001a,\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\t2\b\b\u0002\u0010\u0007\u001a\u00020\tH\u0000¨\u0006\u000b"}, d2 = {"", "propertyName", "", "defaultValue", "o00oOo00", "", "minValue", "maxValue", "o00oOOo0", "", o00oOOoO.f12961o00oOo00, "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/internal/SystemPropsKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class oO000OOo {
    public static final int o00oOOo0(@NotNull String str, int i, int i2, int i3) {
        return (int) o00oOOoO(str, i, i2, i3);
    }

    public static final long o00oOOoO(@NotNull String str, long j, long j2, long j3) {
        String o00oOOoO2 = oO0Oo0oo.o00oOOoO(str);
        if (o00oOOoO2 == null) {
            return j;
        }
        Long o0O0Ooo2 = oO0O00O.o0O0Ooo(o00oOOoO2);
        if (o0O0Ooo2 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + o00oOOoO2 + '\'').toString());
        }
        long longValue = o0O0Ooo2.longValue();
        boolean z = false;
        if (j2 <= longValue && longValue <= j3) {
            z = true;
        }
        if (z) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
    }

    public static final boolean o00oOo00(@NotNull String str, boolean z) {
        String o00oOOoO2 = oO0Oo0oo.o00oOOoO(str);
        return o00oOOoO2 != null ? Boolean.parseBoolean(o00oOOoO2) : z;
    }

    public static long o00oOo0O(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return o00oOOoO(str, j, j4, j3);
    }

    public static int o00oOooO(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return o00oOOo0(str, i, i2, i3);
    }
}
