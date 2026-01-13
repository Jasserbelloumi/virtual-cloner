package androidx.collection;
/* loaded from: classes.dex */
public class o00oo0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int[] f1701o00oOOo0 = new int[0];

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final long[] f1702o00oOOoO = new long[0];

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final Object[] f1703o00oOo00 = new Object[0];

    public static int o00oOOo0(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static int o00oOOoO(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = (jArr[i4] > j ? 1 : (jArr[i4] == j ? 0 : -1));
            if (i5 < 0) {
                i3 = i4 + 1;
            } else if (i5 <= 0) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static boolean o00oOo00(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int o00oOo0O(int i) {
        return o00oOooO(i * 4) / 4;
    }

    public static int o00oOo0o(int i) {
        return o00oOooO(i * 8) / 8;
    }

    public static int o00oOooO(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
        }
        return i;
    }
}
