package o0ooO0O0;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import external.org.apache.commons.lang3.ClassUtils;
import java.lang.reflect.Method;
import java.util.HashSet;
import multispace.multiapp.clone.ClassNotFoundError;
import multispace.multiapp.clone.XC_MethodHook;
import multispace.multiapp.clone.XposedBridge;
import multispace.multiapp.clone.XposedHelpers;
import o0OOoO0.o00oo;
import o0OOoo0O.o0OO0oO;
/* loaded from: classes3.dex */
public class oO0O0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final ClassLoader f17057o00oOOo0 = ClassLoader.getSystemClassLoader();

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static HashSet<Method> f17058o00oOOoO = new HashSet<>();

    /* loaded from: classes3.dex */
    public static class o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public Class f17059o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public Method f17060o00oOOoO;

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
            Method method = o00oOo002.f17060o00oOOoO;
            if (method == null) {
                XposedHelpers.findAndHookMethod(cls, str, objArr);
            } else if (!f17058o00oOOoO.contains(method)) {
                XposedHelpers.findAndHookMethod(o00oOo002.f17059o00oOOo0, str, objArr);
                f17058o00oOOoO.add(o00oOo002.f17060o00oOOoO);
            }
        } catch (Throwable unused) {
        }
    }

    public static Class<?> o00oOOoO(String str, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = f17057o00oOOo0;
        }
        try {
            return ClassUtils.getClass(classLoader, str, false);
        } catch (ClassNotFoundException e) {
            throw new ClassNotFoundError(e);
        }
    }

    public static o00oOOoO o00oOo00(Class<?> cls, String str, Class<?>... clsArr) {
        o00oOOoO o00ooooo2 = new o00oOOoO(null);
        Class<?> cls2 = cls;
        while (true) {
            try {
                Method declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                declaredMethod.setAccessible(true);
                o00ooooo2.f17060o00oOOoO = declaredMethod;
                o00ooooo2.f17059o00oOOo0 = cls2;
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
        StringBuilder sb = new StringBuilder(o00oo.o00oOOo0(new byte[]{124}, new byte[]{84, 106, -110, -123, -28, -89, 75, -28}));
        int length = clsArr.length;
        boolean z = true;
        for (int i = 0; i < length; i++) {
            Class<?> cls = clsArr[i];
            if (z) {
                z = false;
            } else {
                sb.append(o00oo.o00oOOo0(new byte[]{-120}, new byte[]{-92, 118, -46, -1, -10, 19, 38, 66}));
            }
            sb.append(cls != null ? cls.getCanonicalName() : o00oo.o00oOOo0(new byte[]{-79, -29, -68, 54}, new byte[]{-33, -106, -48, 90, 66, -89, -93, 114}));
        }
        sb.append(o00oo.o00oOOo0(new byte[]{-19}, new byte[]{-60, 0, 0, -100, -45, -27, -30, 87}));
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
                throw new ClassNotFoundError(o00oo.o00oOOo0(new byte[]{Ascii.ETB, -64, 65, 70, -45, 5, 89, 111, Ascii.NAK, -127, 71, 94, -50, 5, Ascii.CR, 103, Ascii.DC2, -46, 71, 7, -48, Ascii.SI, 89, 42, 5, -60, 19, 73, -53, Ascii.FF, 65}, new byte[]{103, -95, 51, 39, -66, 96, 45, 10}), (Throwable) null);
            }
            if (!(obj instanceof XC_MethodHook)) {
                if (clsArr == null) {
                    clsArr = new Class[length + 1];
                }
                if (obj instanceof Class) {
                    clsArr[length] = (Class) obj;
                } else if (!(obj instanceof String)) {
                    throw new ClassNotFoundError(o00oo.o00oOOo0(new byte[]{-116, 70, -112, -60, -82, -14, -71, 95, -114, 7, -106, -36, -77, -14, -19, 87, -119, 84, -106, -123, -90, -2, -71, 82, -103, 85, -62, -57, -90, -73, -66, 74, -103, 68, -117, -61, -86, -14, -87, Ascii.SUB, -99, 84, -62, -26, -81, -10, -66, 73, -36, 72, -112, -123, -112, -29, -65, 83, -110, SignedBytes.MAX_POWER_OF_TWO}, new byte[]{-4, 39, -30, -91, -61, -105, -51, 58}), (Throwable) null);
                } else {
                    clsArr[length] = o00oOOoO((String) obj, classLoader);
                }
            }
        }
        return clsArr == null ? new Class[0] : clsArr;
    }
}
