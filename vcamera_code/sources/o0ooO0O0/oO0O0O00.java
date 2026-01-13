package o0ooO0O0;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import external.org.apache.commons.lang3.ClassUtils;
import java.lang.reflect.Method;
import java.util.HashSet;
import o0OOoO0.o00oo;
import o0OOoo0O.o0OO0oO;
/* loaded from: classes3.dex */
public class oO0O0O00 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final ClassLoader f17120o00oOOo0 = ClassLoader.getSystemClassLoader();

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static HashSet<Method> f17121o00oOOoO = new HashSet<>();

    /* loaded from: classes3.dex */
    public static class o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public Class f17122o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public Method f17123o00oOOoO;

        public o00oOOoO() {
        }

        public o00oOOoO(o00oOOo0 o00oooo02) {
        }
    }

    /* loaded from: classes3.dex */
    public static class o00oOo00 extends XC_MethodHook {
        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (o00oOo0O()) {
                o00oOOoO(methodHookParam);
            }
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (o00oOo0O()) {
                o00oOooO(methodHookParam);
            }
        }

        public void o00oOOoO(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
        }

        public boolean o00oOo0O() {
            return o0OO0oO.o00oOOo0().f14961o00oo0O.f14932o00oOOoO;
        }

        public void o00oOooO(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
        }
    }

    public static void o00oOOo0(Class<?> cls, String str, Object... objArr) {
        try {
            o00oOOoO o00oOo002 = o00oOo00(cls, str, o00oOooO(cls.getClassLoader(), objArr));
            Method method = o00oOo002.f17123o00oOOoO;
            if (method == null) {
                XposedHelpers.findAndHookMethod(cls, str, objArr);
            } else if (!f17121o00oOOoO.contains(method)) {
                XposedHelpers.findAndHookMethod(o00oOo002.f17122o00oOOo0, str, objArr);
                f17121o00oOOoO.add(o00oOo002.f17123o00oOOoO);
            }
        } catch (Throwable unused) {
        }
    }

    public static Class<?> o00oOOoO(String str, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = f17120o00oOOo0;
        }
        try {
            return ClassUtils.getClass(classLoader, str, false);
        } catch (ClassNotFoundException e) {
            throw new XposedHelpers.ClassNotFoundError(e);
        }
    }

    public static o00oOOoO o00oOo00(Class<?> cls, String str, Class<?>... clsArr) {
        o00oOOoO o00ooooo2 = new o00oOOoO(null);
        Class<?> cls2 = cls;
        while (true) {
            try {
                Method declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                declaredMethod.setAccessible(true);
                o00ooooo2.f17123o00oOOoO = declaredMethod;
                o00ooooo2.f17122o00oOOo0 = cls2;
                return o00ooooo2;
            } catch (NoSuchMethodException unused) {
                if (cls.getSuperclass() == null) {
                    return o00ooooo2;
                }
                cls2 = cls2.getSuperclass();
            }
        }
    }

    public static String o00oOo0O(Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder(o00oo.o00oOOo0(new byte[]{-25}, new byte[]{-49, -97, 0, 55, -103, 71, 43, 107}));
        int length = clsArr.length;
        boolean z = true;
        for (int i = 0; i < length; i++) {
            Class<?> cls = clsArr[i];
            if (z) {
                z = false;
            } else {
                sb.append(o00oo.o00oOOo0(new byte[]{60}, new byte[]{Ascii.DLE, -66, -24, -20, -62, -70, 58, -68}));
            }
            sb.append(cls != null ? cls.getCanonicalName() : o00oo.o00oOOo0(new byte[]{110, -70, -106, 9}, new byte[]{0, -49, -6, 101, -16, -86, -37, -81}));
        }
        sb.append(o00oo.o00oOOo0(new byte[]{-102}, new byte[]{-77, 47, -7, 66, 63, 8, -48, 114}));
        return sb.toString();
    }

    public static void o00oOo0o(Class<?> cls, String str, XC_MethodHook xC_MethodHook) {
        try {
            XposedBridge.hookAllMethods(cls, str, xC_MethodHook);
        } catch (Throwable unused) {
        }
    }

    public static Class<?>[] o00oOooO(ClassLoader classLoader, Object[] objArr) {
        Class<?>[] clsArr = null;
        for (int length = objArr.length - 1; length >= 0; length--) {
            Object obj = objArr[length];
            if (obj == null) {
                throw new XposedHelpers.ClassNotFoundError(o00oo.o00oOOo0(new byte[]{60, -11, -81, 36, -47, 124, -44, -65, 62, -76, -87, 60, -52, 124, Byte.MIN_VALUE, -73, 57, -25, -87, 101, -46, 118, -44, -6, 46, -15, -3, 43, -55, 117, -52}, new byte[]{76, -108, -35, 69, -68, Ascii.EM, -96, -38}), (Throwable) null);
            }
            if (!(obj instanceof XC_MethodHook)) {
                if (clsArr == null) {
                    clsArr = new Class[length + 1];
                }
                if (obj instanceof Class) {
                    clsArr[length] = (Class) obj;
                } else if (!(obj instanceof String)) {
                    throw new XposedHelpers.ClassNotFoundError(o00oo.o00oOOo0(new byte[]{83, -24, Ascii.DC2, 114, Ascii.ESC, 102, 78, 5, 81, -87, Ascii.DC4, 106, 6, 102, Ascii.SUB, Ascii.CR, 86, -6, Ascii.DC4, 51, 19, 106, 78, 8, 70, -5, SignedBytes.MAX_POWER_OF_TWO, 113, 19, 35, 73, Ascii.DLE, 70, -22, 9, 117, Ascii.US, 102, 94, SignedBytes.MAX_POWER_OF_TWO, 66, -6, SignedBytes.MAX_POWER_OF_TWO, 80, Ascii.SUB, 98, 73, 19, 3, -26, Ascii.DC2, 51, 37, 119, 72, 9, 77, -18}, new byte[]{35, -119, 96, 19, 118, 3, 58, 96}), (Throwable) null);
                } else {
                    clsArr[length] = o00oOOoO((String) obj, classLoader);
                }
            }
        }
        return clsArr == null ? new Class[0] : clsArr;
    }
}
