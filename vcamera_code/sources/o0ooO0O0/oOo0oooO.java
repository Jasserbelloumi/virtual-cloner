package o0ooO0O0;

import java.util.Arrays;
import java.util.HashSet;
import multispace.multiapp.clone.app.App;
import o0O0oooo.o0OO;
/* loaded from: classes3.dex */
public class oOo0oooO {
    public static Class<?>[] o00oOOo0(Class cls) {
        HashSet hashSet = new HashSet();
        o00oOOoO(cls, hashSet);
        Class<?>[] clsArr = new Class[hashSet.size()];
        hashSet.toArray(clsArr);
        return clsArr;
    }

    public static void o00oOOoO(Class cls, HashSet<Class<?>> hashSet) {
        Class<?>[] interfaces = cls.getInterfaces();
        if (interfaces.length != 0) {
            hashSet.addAll(Arrays.asList(interfaces));
        }
        if (cls.getSuperclass() != Object.class) {
            o00oOOoO(cls.getSuperclass(), hashSet);
        }
    }

    public static <T> T o00oOo00(Object[] objArr, Class<T> cls) {
        int o00oOoO02;
        if (objArr == null || (o00oOoO02 = oO0OO00o.o00oOoO0(objArr, cls)) == -1) {
            return null;
        }
        return (T) objArr[o00oOoO02];
    }

    public static int o00oOo0O(Class[] clsArr, Class<?> cls) {
        for (int i = 0; i < clsArr.length; i++) {
            if (clsArr[i].equals(cls)) {
                return i;
            }
        }
        return -1;
    }

    public static String o00oOo0o(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof String) {
                String str = (String) obj;
                if (o0OO.o00oOoOo(str, 0, 0) != null) {
                    objArr[i] = App.o00oOOoO().getPackageName();
                    return str;
                }
            }
        }
        return null;
    }

    public static String o00oOoO(Object[] objArr, int i) {
        int o00oOo0O2 = oO0OO00o.o00oOo0O(objArr, String.class, i);
        if (o00oOo0O2 != -1) {
            String str = (String) objArr[o00oOo0O2];
            objArr[o00oOo0O2] = App.o00oOOoO().getPackageName();
            return str;
        }
        return null;
    }

    public static String o00oOoO0(Object[] objArr) {
        int o00oOoO2 = oO0OO00o.o00oOoO(objArr, String.class);
        if (o00oOoO2 != -1) {
            String str = (String) objArr[o00oOoO2];
            objArr[o00oOoO2] = App.o00oOOoO().getPackageName();
            return str;
        }
        return null;
    }

    public static int o00oOooO(Object[] objArr, Class<?> cls) {
        int i = 0;
        while (i < objArr.length) {
            Object obj = objArr[i];
            if ((obj != null && obj.getClass() == cls) || cls.isInstance(obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
