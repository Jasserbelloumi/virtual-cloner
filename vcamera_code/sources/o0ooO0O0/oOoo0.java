package o0ooO0O0;

import com.google.common.base.Ascii;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import external.org.apache.commons.lang3.ClassUtils;
import java.lang.reflect.Method;
import java.util.HashSet;
import o0OOoO0.o00oo;
import o0OOoo0O.o0OO0oO;
/* loaded from: classes3.dex */
public class oOoo0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final ClassLoader f17138o00oOOo0 = ClassLoader.getSystemClassLoader();

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static HashSet<Method> f17139o00oOOoO = new HashSet<>();

    /* loaded from: classes3.dex */
    public static class o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public Class f17140o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public Method f17141o00oOOoO;

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
            Method method = o00oOo002.f17141o00oOOoO;
            if (method == null) {
                XposedHelpers.findAndHookMethod(cls, str, objArr);
            } else if (!f17139o00oOOoO.contains(method)) {
                XposedHelpers.findAndHookMethod(o00oOo002.f17140o00oOOo0, str, objArr);
                f17139o00oOOoO.add(o00oOo002.f17141o00oOOoO);
            }
        } catch (Throwable unused) {
        }
    }

    public static Class<?> o00oOOoO(String str, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = f17138o00oOOo0;
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
                o00ooooo2.f17141o00oOOoO = declaredMethod;
                o00ooooo2.f17140o00oOOo0 = cls2;
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
        StringBuilder sb = new StringBuilder(o00oo.o00oOOo0(new byte[]{34}, new byte[]{10, -53, -62, -16, -76, 71, -14, 54}));
        int length = clsArr.length;
        boolean z = true;
        for (int i = 0; i < length; i++) {
            Class<?> cls = clsArr[i];
            if (z) {
                z = false;
            } else {
                sb.append(o00oo.o00oOOo0(new byte[]{47}, new byte[]{3, 97, -114, -5, -114, -24, Ascii.CR, 85}));
            }
            sb.append(cls != null ? cls.getCanonicalName() : o00oo.o00oOOo0(new byte[]{Ascii.US, -25, -118, 36}, new byte[]{113, -110, -26, 72, -26, 103, -21, 52}));
        }
        sb.append(o00oo.o00oOOo0(new byte[]{-66}, new byte[]{-105, 44, -23, Ascii.US, -47, 68, 0, 76}));
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
                throw new XposedHelpers.ClassNotFoundError(o00oo.o00oOOo0(new byte[]{-94, 56, -3, -78, 73, 0, 93, 3, -96, 121, -5, -86, 84, 0, 9, Ascii.VT, -89, 42, -5, -13, 74, 10, 93, 70, -80, 60, -81, -67, 81, 9, 69}, new byte[]{-46, 89, -113, -45, 36, 101, 41, 102}), (Throwable) null);
            }
            if (!(obj instanceof XC_MethodHook)) {
                if (clsArr == null) {
                    clsArr = new Class[length + 1];
                }
                if (obj instanceof Class) {
                    clsArr[length] = (Class) obj;
                } else if (!(obj instanceof String)) {
                    throw new XposedHelpers.ClassNotFoundError(o00oo.o00oOOo0(new byte[]{Ascii.DC4, -121, -47, -91, Ascii.SYN, 96, 67, -33, Ascii.SYN, -58, -41, -67, Ascii.VT, 96, Ascii.ETB, -41, 17, -107, -41, -28, Ascii.RS, 108, 67, -46, 1, -108, -125, -90, Ascii.RS, 37, 68, -54, 1, -123, -54, -94, Ascii.DC2, 96, 83, -102, 5, -107, -125, -121, Ascii.ETB, 100, 68, -55, 68, -119, -47, -28, 40, 113, 69, -45, 10, -127}, new byte[]{100, -26, -93, -60, 123, 5, 55, -70}), (Throwable) null);
                } else {
                    clsArr[length] = o00oOOoO((String) obj, classLoader);
                }
            }
        }
        return clsArr == null ? new Class[0] : clsArr;
    }
}
