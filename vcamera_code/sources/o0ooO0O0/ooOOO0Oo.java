package o0ooO0O0;

import com.google.common.base.Ascii;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import o0OOoO0.o00oo;
import o0Oo0oo0.o0OO0o00;
/* loaded from: classes3.dex */
public class ooOOO0Oo {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Object f17142o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final boolean f17143o00oOOoO = true;

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements InvocationHandler {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ boolean f17144o00oOOo0;

        public o00oOOo0(boolean z) {
            this.f17144o00oOOo0 = z;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            try {
                return new ooOOO0Oo(ooOOO0Oo.this.f17142o00oOOo0).o00oOo0o(name, objArr).o00oo0O0();
            } catch (ooOOO00O e) {
                if (this.f17144o00oOOo0) {
                    Map map = (Map) ooOOO0Oo.this.f17142o00oOOo0;
                    int length = objArr == null ? 0 : objArr.length;
                    if (length == 0 && name.startsWith(o00oo.o00oOOo0(new byte[]{1, 38, 109}, new byte[]{102, 67, Ascii.EM, 117, -80, -7, 114, -12}))) {
                        return map.get(ooOOO0Oo.o00ooOO0(name.substring(3)));
                    }
                    if (length == 0 && name.startsWith(o00oo.o00oOOo0(new byte[]{115, -2}, new byte[]{Ascii.SUB, -115, 41, 98, -63, 125, -47, -18}))) {
                        return map.get(ooOOO0Oo.o00ooOO0(name.substring(2)));
                    }
                    if (length == 1 && name.startsWith(o00oo.o00oOOo0(new byte[]{54, -93, -91}, new byte[]{69, -58, -47, 89, -57, 69, 96, Ascii.FF}))) {
                        map.put(ooOOO0Oo.o00ooOO0(name.substring(3)), objArr[0]);
                        return null;
                    }
                }
                throw e;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class o00oOOoO {
    }

    public ooOOO0Oo(Class<?> cls) {
        this.f17142o00oOOo0 = cls;
    }

    public ooOOO0Oo(Object obj) {
        this.f17142o00oOOo0 = obj;
    }

    public static <T extends AccessibleObject> T o00oOo00(T t) {
        if (t == null) {
            return null;
        }
        if (t instanceof Member) {
            Member member = (Member) t;
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                return t;
            }
        }
        if (!t.isAccessible()) {
            t.setAccessible(true);
        }
        return t;
    }

    public static ooOOO0Oo o00oo(Class<?> cls) {
        return new ooOOO0Oo(cls);
    }

    public static Class<?> o00oo0(String str) throws ooOOO00O {
        try {
            return Class.forName(str);
        } catch (Exception e) {
            throw new ooOOO00O(e);
        }
    }

    public static Class<?> o00oo0OO(String str, ClassLoader classLoader) throws ooOOO00O {
        try {
            return Class.forName(str, true, classLoader);
        } catch (Exception e) {
            throw new ooOOO00O(e);
        }
    }

    public static String o00oo0Oo(Method method) {
        StringBuilder sb = new StringBuilder(40);
        sb.append(Modifier.toString(method.getModifiers()));
        sb.append(" ");
        sb.append(method.getReturnType().getName());
        sb.append(" ");
        sb.append(method.getName());
        sb.append(o00oo.o00oOOo0(new byte[]{82}, new byte[]{122, -96, Ascii.SI, -77, -70, 79, -106, 75}));
        Class<?>[] parameterTypes = method.getParameterTypes();
        for (Class<?> cls : parameterTypes) {
            sb.append(cls.getName());
            sb.append(o00oo.o00oOOo0(new byte[]{-41, 95}, new byte[]{-5, Byte.MAX_VALUE, 119, Ascii.ESC, -96, -123, -126, 76}));
        }
        if (parameterTypes.length > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(o00oo.o00oOOo0(new byte[]{52}, new byte[]{Ascii.GS, Ascii.EM, -61, 105, -28, 53, -110, -106}));
        return sb.toString();
    }

    public static ooOOO0Oo o00ooO(Method method, Object obj, Object... objArr) throws ooOOO00O {
        try {
            o00oOo00(method);
            if (method.getReturnType() == Void.TYPE) {
                method.invoke(obj, objArr);
                return new ooOOO0Oo(obj);
            }
            return new ooOOO0Oo(method.invoke(obj, objArr));
        } catch (Exception e) {
            throw new ooOOO00O(e);
        }
    }

    public static ooOOO0Oo o00ooO0(String str) throws ooOOO00O {
        return new ooOOO0Oo(o00oo0(str));
    }

    public static ooOOO0Oo o00ooO00(Object obj) {
        return new ooOOO0Oo(obj);
    }

    public static ooOOO0Oo o00ooO0O(String str, ClassLoader classLoader) throws ooOOO00O {
        return new ooOOO0Oo(o00oo0OO(str, classLoader));
    }

    public static ooOOO0Oo o00ooO0o(Constructor<?> constructor, Object... objArr) throws ooOOO00O {
        try {
            return new ooOOO0Oo(((Constructor) o00oOo00(constructor)).newInstance(objArr));
        } catch (Exception e) {
            throw new ooOOO00O(e);
        }
    }

    public static String o00ooOO0(String str) {
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            return str.toLowerCase();
        }
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }

    public static Class<?>[] o00ooOo(Object... objArr) {
        if (objArr == null) {
            return new Class[0];
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            clsArr[i] = obj == null ? o00oOOoO.class : obj.getClass();
        }
        return clsArr;
    }

    public static Object o00ooOoO(Object obj) {
        return obj instanceof ooOOO0Oo ? ((ooOOO0Oo) obj).o00oo0O0() : obj;
    }

    public static Class<?> o00ooOoo(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return cls.isPrimitive() ? Boolean.TYPE == cls ? Boolean.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : Byte.TYPE == cls ? Byte.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Character.TYPE == cls ? Character.class : Void.TYPE == cls ? Void.class : cls : cls;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ooOOO0Oo) && this.f17142o00oOOo0.equals(((ooOOO0Oo) obj).o00oo0O0());
    }

    public int hashCode() {
        return this.f17142o00oOOo0.hashCode();
    }

    public ooOOO0Oo o00oOo0O(String str) throws ooOOO00O {
        return o00oOo0o(str, new Object[0]);
    }

    public ooOOO0Oo o00oOo0o(String str, Object... objArr) throws ooOOO00O {
        Class<?>[] o00ooOo2 = o00ooOo(objArr);
        try {
            try {
                return o00ooO(o00oOoOo(str, o00ooOo2), this.f17142o00oOOo0, objArr);
            } catch (NoSuchMethodException e) {
                throw new ooOOO00O(e);
            }
        } catch (NoSuchMethodException unused) {
            return o00ooO(o00ooOOo(str, o00ooOo2), this.f17142o00oOOo0, objArr);
        }
    }

    public ooOOO0Oo o00oOoO() throws ooOOO00O {
        return o00oOoOO(new Object[0]);
    }

    public ooOOO0Oo o00oOoO0(String str, Object... objArr) throws ooOOO00O {
        Class<?>[] o00ooOo2 = o00ooOo(objArr);
        Method[] declaredMethods = o00ooOo0().getDeclaredMethods();
        int length = declaredMethods.length;
        Method method = null;
        int i = 0;
        char c = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Method method2 = declaredMethods[i];
            if (o00oo0o0(method2, str, o00ooOo2)) {
                c = 2;
                method = method2;
                break;
            }
            if (o0O0o(method2, str, o00ooOo2)) {
                c = 1;
            } else {
                if (method2.getName().equals(str)) {
                    if (method2.getParameterTypes().length == 0) {
                        if (c != 0) {
                        }
                    }
                }
                i++;
            }
            method = method2;
            i++;
        }
        if (method != null) {
            if (c == 0) {
                objArr = new Object[0];
            }
            if (c == 1) {
                objArr = new Object[]{objArr};
            }
            return o00ooO(method, this.f17142o00oOOo0, objArr);
        }
        throw new ooOOO00O(o00oo.o00oOOo0(new byte[]{-79, Ascii.SO, -84, -4, -73, 38, -43, 32, -69, 65, -22, -2, -89, 60, -39, 111, -71, Ascii.SO, -2, -79}, new byte[]{-33, 97, -116, -111, -46, 82, -67, 79}) + str, new NoSuchMethodException(o00oo.o00oOOo0(new byte[]{Ascii.FS, -42, -9, 120, 90, -4, Ascii.SUB, 92, 63, -36, -93, 114, 80, -21, 78}, new byte[]{82, -71, -41, Ascii.SUB, 63, -113, 110, 124}) + str + o00oo.o00oOOo0(new byte[]{117, 120, -59, -124, 105, Ascii.RS, -74, 6, 39, 110, -63, -125, o0OO0o00.f16655o00oOoOO}, new byte[]{85, Ascii.SI, -84, -16, 1, 62, -58, 103}) + Arrays.toString(o00ooOo2) + o00oo.o00oOOo0(new byte[]{-37, -108, -60, -8, Ascii.SO, -20, -19, -100, -98, -41, -51, -30, Ascii.ETB, -26, -87, -34, -108, -103, -117, -7, Ascii.ESC, -8, -88, -34}, new byte[]{-5, -9, -85, -115, 98, -120, -51, -2}) + o00ooOo0() + o00oo.o00oOOo0(new byte[]{10}, new byte[]{36, -105, 123, 122, -6, -127, Ascii.EM, Byte.MIN_VALUE})));
    }

    public ooOOO0Oo o00oOoOO(Object... objArr) throws ooOOO00O {
        Constructor<?>[] declaredConstructors;
        Class<?>[] o00ooOo2 = o00ooOo(objArr);
        try {
            return o00ooO0o(o00ooOo0().getDeclaredConstructor(o00ooOo2), objArr);
        } catch (NoSuchMethodException e) {
            for (Constructor<?> constructor : o00ooOo0().getDeclaredConstructors()) {
                if (o00oo0o(constructor.getParameterTypes(), o00ooOo2)) {
                    return o00ooO0o(constructor, objArr);
                }
            }
            throw new ooOOO00O(e);
        }
    }

    public Method o00oOoOo(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> o00ooOo02 = o00ooOo0();
        try {
            return o00ooOo02.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            do {
                try {
                    return o00ooOo02.getDeclaredMethod(str, clsArr);
                } catch (NoSuchMethodException unused2) {
                    o00ooOo02 = o00ooOo02.getSuperclass();
                    if (o00ooOo02 == null) {
                        throw new NoSuchMethodException();
                    }
                }
            } while (o00ooOo02 == null);
            throw new NoSuchMethodException();
        }
    }

    public ooOOO0Oo o00oOoo0(String str) throws ooOOO00O {
        try {
            return new ooOOO0Oo(o00oOooo(str).get(this.f17142o00oOOo0));
        } catch (Exception e) {
            throw new ooOOO00O(this.f17142o00oOOo0.getClass().getName(), e);
        }
    }

    public <P> P o00oOooO(Class<P> cls) {
        return (P) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new o00oOOo0(this.f17142o00oOOo0 instanceof Map));
    }

    public final Field o00oOooo(String str) throws ooOOO00O {
        Class<?> o00ooOo02 = o00ooOo0();
        try {
            return o00ooOo02.getField(str);
        } catch (NoSuchFieldException e) {
            do {
                try {
                    return (Field) o00oOo00(o00ooOo02.getDeclaredField(str));
                } catch (NoSuchFieldException unused) {
                    o00ooOo02 = o00ooOo02.getSuperclass();
                    if (o00ooOo02 == null) {
                        throw new ooOOO00O(e);
                    }
                }
            } while (o00ooOo02 == null);
            throw new ooOOO00O(e);
        }
    }

    public Map<String, ooOOO0Oo> o00oo00O() {
        Field[] declaredFields;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Class<?> o00ooOo02 = o00ooOo0();
        do {
            for (Field field : o00ooOo02.getDeclaredFields()) {
                if ((!this.f17143o00oOOoO) ^ Modifier.isStatic(field.getModifiers())) {
                    String name = field.getName();
                    if (!linkedHashMap.containsKey(name)) {
                        linkedHashMap.put(name, o00oOoo0(name));
                    }
                }
            }
            o00ooOo02 = o00ooOo02.getSuperclass();
        } while (o00ooOo02 != null);
        return linkedHashMap;
    }

    public <T> T o00oo0O(String str) throws ooOOO00O {
        return (T) o00oOoo0(str).o00oo0O0();
    }

    public <T> T o00oo0O0() {
        return (T) this.f17142o00oOOo0;
    }

    public final boolean o00oo0o(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length == clsArr2.length) {
            for (int i = 0; i < clsArr2.length; i++) {
                if (clsArr2[i] != o00oOOoO.class && !o00ooOoo(clsArr[i]).isAssignableFrom(o00ooOoo(clsArr2[i]))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean o00oo0o0(Method method, String str, Class<?>[] clsArr) {
        return method.getName().equals(str) && o00oo0o(method.getParameterTypes(), clsArr);
    }

    public final boolean o00oo0oO(Class<?>[] clsArr) {
        return clsArr.length > 0 && clsArr[0].isAssignableFrom(Object[].class);
    }

    public ooOOO0Oo o00ooOO(String str, Object obj) throws ooOOO00O {
        try {
            Field o00oOooo2 = o00oOooo(str);
            o00oOooo2.setAccessible(true);
            o00oOooo2.set(this.f17142o00oOOo0, o00ooOoO(obj));
            return this;
        } catch (Exception e) {
            throw new ooOOO00O(e);
        }
    }

    public final Method o00ooOOo(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Method[] methods;
        Method[] declaredMethods;
        Class<?> o00ooOo02 = o00ooOo0();
        for (Method method : o00ooOo02.getMethods()) {
            if (o00oo0o0(method, str, clsArr)) {
                return method;
            }
        }
        do {
            for (Method method2 : o00ooOo02.getDeclaredMethods()) {
                if (o00oo0o0(method2, str, clsArr)) {
                    return method2;
                }
            }
            o00ooOo02 = o00ooOo02.getSuperclass();
        } while (o00ooOo02 != null);
        throw new NoSuchMethodException(o00oo.o00oOOo0(new byte[]{-8, 121, 9, -47, -112, -124, 117, -76, -41, 100, 9, -49, -100, -99, 116, -73, -46, 54}, new byte[]{-74, Ascii.SYN, 41, -94, -7, -23, Ascii.FS, -40}) + str + o00oo.o00oOOo0(new byte[]{44, 118, -118, -36, 62, -35, -100, -15, 126, 96, -114, -37, 118}, new byte[]{Ascii.FF, 1, -29, -88, 86, -3, -20, -112}) + Arrays.toString(clsArr) + o00oo.o00oOOo0(new byte[]{-70, -52, 0, -21, 115, -47, -57, -91, -1, -113, 9, -15, 106, -37, -125, -25, -11, -63, 79, -22, 102, -59, -126, -25}, new byte[]{-102, -81, 111, -98, Ascii.US, -75, -25, -57}) + o00ooOo0() + o00oo.o00oOOo0(new byte[]{70}, new byte[]{104, 97, 118, -28, 58, -35, 84, -52}));
    }

    public Class<?> o00ooOo0() {
        return this.f17143o00oOOoO ? (Class) this.f17142o00oOOo0 : this.f17142o00oOOo0.getClass();
    }

    public final boolean o0O0o(Method method, String str, Class<?>[] clsArr) {
        return method.getName().equals(str) && o00oo0oO(method.getParameterTypes());
    }

    public String toString() {
        return this.f17142o00oOOo0.toString();
    }
}
