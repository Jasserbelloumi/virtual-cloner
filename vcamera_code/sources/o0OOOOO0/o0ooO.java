package o0OOOOO0;

import java.util.Arrays;
import o0OO0o.oO000O0O;
import o0ooOoOO.oO0OoOO0;
/* loaded from: classes3.dex */
public class o0ooO {

    @o0OO0o.o0OO00o0(version = "1.4")
    /* loaded from: classes3.dex */
    public static class o00oOOo0 {
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    public static boolean o00oOOo0(double d, Double d2) {
        return d2 != null && d == d2.doubleValue();
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    public static boolean o00oOOoO(float f, Float f2) {
        return f2 != null && f == f2.floatValue();
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    public static boolean o00oOo00(Double d, double d2) {
        return d != null && d.doubleValue() == d2;
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    public static boolean o00oOo0O(Float f, float f2) {
        return f != null && f.floatValue() == f2;
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    public static boolean o00oOo0o(Float f, Float f2) {
        if (f == null) {
            if (f2 == null) {
                return true;
            }
        } else if (f2 != null && f.floatValue() == f2.floatValue()) {
            return true;
        }
        return false;
    }

    public static void o00oOoO(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) o00ooO0o(new IllegalStateException(o00oOoOo.o00oo.o00oOOo0(str, " must not be null"))));
        }
    }

    public static boolean o00oOoO0(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void o00oOoOO(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) o00ooO0o(new IllegalStateException(str)));
        }
    }

    public static void o00oOoOo(Object obj, String str, String str2) {
        if (obj == null) {
            throw ((IllegalStateException) o00ooO0o(new IllegalStateException(androidx.fragment.app.o0O00.o00oOOo0("Field specified as non-null is null: ", str, ".", str2))));
        }
    }

    public static void o00oOoo0(String str) throws ClassNotFoundException {
        String replace = str.replace('/', '.');
        try {
            Class.forName(replace);
        } catch (ClassNotFoundException e) {
            throw ((ClassNotFoundException) o00ooO0o(new ClassNotFoundException(android.support.v4.media.o00oOoO.o00oOOo0("Class ", replace, " is not found. Please update the Kotlin runtime to the latest version"), e)));
        }
    }

    @o0OO0o.o0OO00o0(version = "1.1")
    public static boolean o00oOooO(Double d, Double d2) {
        if (d == null) {
            if (d2 == null) {
                return true;
            }
        } else if (d2 != null && d.doubleValue() == d2.doubleValue()) {
            return true;
        }
        return false;
    }

    public static void o00oOooo(String str, String str2) throws ClassNotFoundException {
        String replace = str.replace('/', '.');
        try {
            Class.forName(replace);
        } catch (ClassNotFoundException e) {
            throw ((ClassNotFoundException) o00ooO0o(new ClassNotFoundException(androidx.fragment.app.o0O00.o00oOOo0("Class ", replace, " is not found: this code requires the Kotlin runtime of version at least ", str2), e)));
        }
    }

    public static void o00oo() {
        o00oooOo();
    }

    public static void o00oo0(Object obj, String str) {
        if (obj == null) {
            o00ooo0(str);
        }
    }

    public static void o00oo00O(Object obj) {
        if (obj == null) {
            o00ooo00();
        }
    }

    public static void o00oo0O(Object obj, String str) {
        if (obj == null) {
            o00oooO(str);
        }
    }

    public static void o00oo0O0(Object obj, String str) {
        if (obj == null) {
            o00oooOO(str);
        }
    }

    public static void o00oo0OO(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) o00ooO0o(new NullPointerException(o00oOoOo.o00oo.o00oOOo0(str, " must not be null"))));
        }
    }

    public static void o00oo0Oo(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) o00ooO0o(new IllegalStateException(str)));
        }
    }

    public static int o00oo0o(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static void o00oo0o0(Object obj, String str, String str2) {
        if (obj == null) {
            throw ((IllegalStateException) o00ooO0o(new IllegalStateException(androidx.fragment.app.o0O00.o00oOOo0("Method specified as non-null returned null: ", str, ".", str2))));
        }
    }

    public static int o00oo0oO(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }

    public static <T extends Throwable> T o00ooO(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    public static void o00ooO0(int i, String str) {
        o00oooOo();
    }

    public static void o00ooO00(String str) {
        o00oooo0(str);
    }

    public static void o00ooO0O(int i, String str, String str2) {
        o00oooo0(str2);
    }

    public static <T extends Throwable> T o00ooO0o(T t) {
        return (T) o00ooO(t, o0ooO.class.getName());
    }

    public static void o00ooOO() {
        throw ((AssertionError) o00ooO0o(new AssertionError()));
    }

    public static String o00ooOO0(String str, Object obj) {
        return str + obj;
    }

    public static void o00ooOOo(String str) {
        throw ((AssertionError) o00ooO0o(new AssertionError(str)));
    }

    public static void o00ooOo(String str) {
        throw ((IllegalArgumentException) o00ooO0o(new IllegalArgumentException(str)));
    }

    public static void o00ooOo0() {
        throw ((IllegalArgumentException) o00ooO0o(new IllegalArgumentException()));
    }

    public static void o00ooOoO() {
        throw ((IllegalStateException) o00ooO0o(new IllegalStateException()));
    }

    public static void o00ooOoo(String str) {
        throw ((IllegalStateException) o00ooO0o(new IllegalStateException(str)));
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static void o00ooo0(String str) {
        throw ((NullPointerException) o00ooO0o(new NullPointerException(str)));
    }

    @o0OO0o.o0OO00o0(version = "1.4")
    public static void o00ooo00() {
        throw ((NullPointerException) o00ooO0o(new NullPointerException()));
    }

    public static void o00ooo0O() {
        throw ((o0OO0o.o0O00O0o) o00ooO0o(new o0OO0o.o0O00O0o()));
    }

    public static void o00ooo0o(String str) {
        throw ((o0OO0o.o0O00O0o) o00ooO0o(new o0OO0o.o0O00O0o(str)));
    }

    public static void o00oooO(String str) {
        throw ((IllegalArgumentException) o00ooO0o(new IllegalArgumentException(o0O0o(str))));
    }

    public static void o00oooOO(String str) {
        throw ((NullPointerException) o00ooO0o(new NullPointerException(o0O0o(str))));
    }

    public static void o00oooOo() {
        o00oooo0("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void o00oooo(String str) {
        throw ((oO000O0O) o00ooO0o(new oO000O0O(str)));
    }

    public static void o00oooo0(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void o00ooooO(String str) {
        o00oooo("lateinit property " + str + " has not been initialized");
    }

    public static String o0O0o(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = o0ooO.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        StringBuilder o00oOOo02 = oO0OoOO0.o00oOOo0("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        o00oOOo02.append(str);
        return o00oOOo02.toString();
    }
}
