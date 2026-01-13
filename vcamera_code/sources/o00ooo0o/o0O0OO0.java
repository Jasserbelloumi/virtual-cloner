package o00ooo0o;

import java.lang.reflect.Array;
/* loaded from: classes.dex */
public final class o0O0OO0 {
    public static int[] o00oOOo0(int[] iArr, int i, int i2) {
        if (i + 1 > iArr.length) {
            int[] iArr2 = new int[o00oOo0O(i)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr = iArr2;
        }
        iArr[i] = i2;
        return iArr;
    }

    public static long[] o00oOOoO(long[] jArr, int i, long j) {
        if (i + 1 > jArr.length) {
            long[] jArr2 = new long[o00oOo0O(i)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            jArr = jArr2;
        }
        jArr[i] = j;
        return jArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object[], java.lang.Object] */
    public static <T> T[] o00oOo00(T[] tArr, int i, T t) {
        if (i + 1 > tArr.length) {
            ?? r0 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), o00oOo0O(i));
            System.arraycopy(tArr, 0, r0, 0, i);
            tArr = r0;
        }
        tArr[i] = t;
        return tArr;
    }

    public static int o00oOo0O(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }

    public static int[] o00oOo0o(int[] iArr, int i, int i2, int i3) {
        if (i + 1 <= iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i - i2);
            iArr[i2] = i3;
            return iArr;
        }
        int[] iArr2 = new int[o00oOo0O(i)];
        System.arraycopy(iArr, 0, iArr2, 0, i2);
        iArr2[i2] = i3;
        System.arraycopy(iArr, i2, iArr2, i2 + 1, iArr.length - i2);
        return iArr2;
    }

    public static <T> T[] o00oOoO(T[] tArr, int i, int i2, T t) {
        if (i + 1 <= tArr.length) {
            System.arraycopy(tArr, i2, tArr, i2 + 1, i - i2);
            tArr[i2] = t;
            return tArr;
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), o00oOo0O(i)));
        System.arraycopy(tArr, 0, tArr2, 0, i2);
        tArr2[i2] = t;
        System.arraycopy(tArr, i2, tArr2, i2 + 1, tArr.length - i2);
        return tArr2;
    }

    public static long[] o00oOoO0(long[] jArr, int i, int i2, long j) {
        if (i + 1 <= jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i - i2);
            jArr[i2] = j;
            return jArr;
        }
        long[] jArr2 = new long[o00oOo0O(i)];
        System.arraycopy(jArr, 0, jArr2, 0, i2);
        jArr2[i2] = j;
        System.arraycopy(jArr, i2, jArr2, i2 + 1, jArr.length - i2);
        return jArr2;
    }

    public static boolean[] o00oOoOO(boolean[] zArr, int i, int i2, boolean z) {
        if (i + 1 <= zArr.length) {
            System.arraycopy(zArr, i2, zArr, i2 + 1, i - i2);
            zArr[i2] = z;
            return zArr;
        }
        boolean[] zArr2 = new boolean[o00oOo0O(i)];
        System.arraycopy(zArr, 0, zArr2, 0, i2);
        zArr2[i2] = z;
        System.arraycopy(zArr, i2, zArr2, i2 + 1, zArr.length - i2);
        return zArr2;
    }

    public static boolean[] o00oOooO(boolean[] zArr, int i, boolean z) {
        if (i + 1 > zArr.length) {
            boolean[] zArr2 = new boolean[o00oOo0O(i)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            zArr = zArr2;
        }
        zArr[i] = z;
        return zArr;
    }
}
