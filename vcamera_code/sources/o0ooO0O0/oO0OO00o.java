package o0ooO0O0;

import java.util.Arrays;
/* loaded from: classes3.dex */
public class oO0OO00o {
    public static void o00oOOo0(int i, int i2, int i3) throws ArrayIndexOutOfBoundsException {
        if ((i2 | i3) < 0 || i2 > i || i - i2 < i3) {
            throw new ArrayIndexOutOfBoundsException(i2);
        }
    }

    public static boolean o00oOOoO(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean o00oOo00(T[] tArr, T t) {
        return o00oOo0o(tArr, t) != -1;
    }

    public static int o00oOo0O(Object[] objArr, Class<?> cls, int i) {
        if (!o00oOoOo(objArr)) {
            int i2 = -1;
            for (Object obj : objArr) {
                i2++;
                if (obj != null && obj.getClass() == cls && i - 1 <= 0) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public static <T> int o00oOo0o(T[] tArr, T t) {
        if (tArr == null) {
            return -1;
        }
        for (int i = 0; i < tArr.length; i++) {
            if (oO0O0Oo0.o00oOOo0(tArr[i], t)) {
                return i;
            }
        }
        return -1;
    }

    public static int o00oOoO(Object[] objArr, Class<?> cls) {
        if (o00oOoOo(objArr)) {
            return -1;
        }
        for (int length = objArr.length; length > 0; length--) {
            int i = length - 1;
            Object obj = objArr[i];
            if (obj != null && obj.getClass() == cls) {
                return i;
            }
        }
        return -1;
    }

    public static int o00oOoO0(Object[] objArr, Class<?> cls) {
        if (!o00oOoOo(objArr)) {
            int i = -1;
            for (Object obj : objArr) {
                i++;
                if (obj != null && cls == obj.getClass()) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int o00oOoOO(Object[] objArr, Class<?> cls, int i) {
        if (objArr == null) {
            return -1;
        }
        while (i < objArr.length) {
            if (cls.isInstance(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static <T> boolean o00oOoOo(T[] tArr) {
        return tArr == null || tArr.length == 0;
    }

    public static int o00oOoo0(Class<?>[] clsArr, Class<?> cls) {
        if (clsArr == null) {
            return -1;
        }
        for (int i = 0; i < clsArr.length; i++) {
            if (clsArr[i] == cls) {
                return i;
            }
        }
        return -1;
    }

    public static <T> T o00oOooO(Object[] objArr, Class<?> cls) {
        int o00oOoO02 = o00oOoO0(objArr, cls);
        if (o00oOoO02 != -1) {
            return (T) objArr[o00oOoO02];
        }
        return null;
    }

    public static int o00oOooo(Class<?>[] clsArr, Class<?> cls, int i) {
        if (clsArr == null) {
            return -1;
        }
        while (i < clsArr.length) {
            if (cls == clsArr[i]) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static <T> T[] o00oo0(T[] tArr, int i) {
        if (tArr == null || i == 0) {
            return null;
        }
        return tArr.length == i ? tArr : (T[]) Arrays.copyOf(tArr, i);
    }

    public static Object[] o00oo00O(Object[] objArr, Object obj) {
        Object[] objArr2 = new Object[objArr.length + 1];
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        objArr2[objArr.length] = obj;
        return objArr2;
    }
}
