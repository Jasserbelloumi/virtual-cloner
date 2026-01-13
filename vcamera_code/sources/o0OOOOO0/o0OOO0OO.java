package o0OOOOO0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import o0OOOOO.o00oo0;
/* loaded from: classes3.dex */
public class o0OOO0OO {
    public static Collection o00oOOo0(Object obj) {
        if ((obj instanceof o0OOOOO.o00oOOo0) && !(obj instanceof o0OOOOO.o00oOOoO)) {
            o00ooo0o(obj, "kotlin.collections.MutableCollection");
        }
        return o00oo0o0(obj);
    }

    public static Collection o00oOOoO(Object obj, String str) {
        if ((obj instanceof o0OOOOO.o00oOOo0) && !(obj instanceof o0OOOOO.o00oOOoO)) {
            o00oooO(str);
        }
        return o00oo0o0(obj);
    }

    public static Iterable o00oOo00(Object obj) {
        if ((obj instanceof o0OOOOO.o00oOOo0) && !(obj instanceof o0OOOOO.o00oOo00)) {
            o00ooo0o(obj, "kotlin.collections.MutableIterable");
        }
        return o00oo0o(obj);
    }

    public static Iterator o00oOo0O(Object obj) {
        if ((obj instanceof o0OOOOO.o00oOOo0) && !(obj instanceof o0OOOOO.o00oOo0O)) {
            o00ooo0o(obj, "kotlin.collections.MutableIterator");
        }
        return o00oo0oO(obj);
    }

    public static Iterator o00oOo0o(Object obj, String str) {
        if ((obj instanceof o0OOOOO.o00oOOo0) && !(obj instanceof o0OOOOO.o00oOo0O)) {
            o00oooO(str);
        }
        return o00oo0oO(obj);
    }

    public static List o00oOoO(Object obj, String str) {
        if ((obj instanceof o0OOOOO.o00oOOo0) && !(obj instanceof o0OOOOO.o00oOoO)) {
            o00oooO(str);
        }
        return o0O0o(obj);
    }

    public static List o00oOoO0(Object obj) {
        if ((obj instanceof o0OOOOO.o00oOOo0) && !(obj instanceof o0OOOOO.o00oOoO)) {
            o00ooo0o(obj, "kotlin.collections.MutableList");
        }
        return o0O0o(obj);
    }

    public static ListIterator o00oOoOO(Object obj) {
        if ((obj instanceof o0OOOOO.o00oOOo0) && !(obj instanceof o0OOOOO.o00oo00O)) {
            o00ooo0o(obj, "kotlin.collections.MutableListIterator");
        }
        return o00oo(obj);
    }

    public static ListIterator o00oOoOo(Object obj, String str) {
        if ((obj instanceof o0OOOOO.o00oOOo0) && !(obj instanceof o0OOOOO.o00oo00O)) {
            o00oooO(str);
        }
        return o00oo(obj);
    }

    public static Map o00oOoo0(Object obj) {
        if ((obj instanceof o0OOOOO.o00oOOo0) && !(obj instanceof o0OOOOO.o00oo0)) {
            o00ooo0o(obj, "kotlin.collections.MutableMap");
        }
        return o00ooO00(obj);
    }

    public static Iterable o00oOooO(Object obj, String str) {
        if ((obj instanceof o0OOOOO.o00oOOo0) && !(obj instanceof o0OOOOO.o00oOo00)) {
            o00oooO(str);
        }
        return o00oo0o(obj);
    }

    public static Map o00oOooo(Object obj, String str) {
        if ((obj instanceof o0OOOOO.o00oOOo0) && !(obj instanceof o0OOOOO.o00oo0)) {
            o00oooO(str);
        }
        return o00ooO00(obj);
    }

    public static ListIterator o00oo(Object obj) {
        try {
            return (ListIterator) obj;
        } catch (ClassCastException e) {
            throw o00ooo0O(e);
        }
    }

    public static Map.Entry o00oo0(Object obj, String str) {
        if ((obj instanceof o0OOOOO.o00oOOo0) && !(obj instanceof o00oo0.o00oOOo0)) {
            o00oooO(str);
        }
        return o00ooO0(obj);
    }

    public static Map.Entry o00oo00O(Object obj) {
        if ((obj instanceof o0OOOOO.o00oOOo0) && !(obj instanceof o00oo0.o00oOOo0)) {
            o00ooo0o(obj, "kotlin.collections.MutableMap.MutableEntry");
        }
        return o00ooO0(obj);
    }

    public static Object o00oo0O(Object obj, int i) {
        if (obj != null && !o00ooO(obj, i)) {
            o00ooo0o(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }

    public static Set o00oo0O0(Object obj, String str) {
        if ((obj instanceof o0OOOOO.o00oOOo0) && !(obj instanceof o0OOOOO.o00oo0OO)) {
            o00oooO(str);
        }
        return o00ooO0O(obj);
    }

    public static Set o00oo0OO(Object obj) {
        if ((obj instanceof o0OOOOO.o00oOOo0) && !(obj instanceof o0OOOOO.o00oo0OO)) {
            o00ooo0o(obj, "kotlin.collections.MutableSet");
        }
        return o00ooO0O(obj);
    }

    public static Object o00oo0Oo(Object obj, int i, String str) {
        if (obj != null && !o00ooO(obj, i)) {
            o00oooO(str);
        }
        return obj;
    }

    public static Iterable o00oo0o(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw o00ooo0O(e);
        }
    }

    public static Collection o00oo0o0(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            throw o00ooo0O(e);
        }
    }

    public static Iterator o00oo0oO(Object obj) {
        try {
            return (Iterator) obj;
        } catch (ClassCastException e) {
            throw o00ooo0O(e);
        }
    }

    public static boolean o00ooO(Object obj, int i) {
        return (obj instanceof o0OO0o.o0O000o0) && o00ooO0o(obj) == i;
    }

    public static Map.Entry o00ooO0(Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e) {
            throw o00ooo0O(e);
        }
    }

    public static Map o00ooO00(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw o00ooo0O(e);
        }
    }

    public static Set o00ooO0O(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            throw o00ooo0O(e);
        }
    }

    public static int o00ooO0o(Object obj) {
        if (obj instanceof o0O00o00) {
            return ((o0O00o00) obj).getArity();
        }
        if (obj instanceof o0OOOO.o00oOOo0) {
            return 0;
        }
        if (obj instanceof o0OOOO.o00oo) {
            return 1;
        }
        if (obj instanceof o0OOOO.o0O00000) {
            return 2;
        }
        if (obj instanceof o0OOOO.o0O0000O) {
            return 3;
        }
        if (obj instanceof o0OOOO.o0O000) {
            return 4;
        }
        if (obj instanceof o0OOOO.o0O000O) {
            return 5;
        }
        if (obj instanceof o0OOOO.o0OoOoOo) {
            return 6;
        }
        if (obj instanceof o0OOOO.o0O000Oo) {
            return 7;
        }
        if (obj instanceof o0OOOO.o0O000o0) {
            return 8;
        }
        if (obj instanceof o0OOOO.o0O00) {
            return 9;
        }
        if (obj instanceof o0OOOO.o00oOOoO) {
            return 10;
        }
        if (obj instanceof o0OOOO.o00oOo00) {
            return 11;
        }
        if (obj instanceof o0OOOO.o00oOo0O) {
            return 12;
        }
        if (obj instanceof o0OOOO.o00oOoO) {
            return 13;
        }
        if (obj instanceof o0OOOO.o00oo00O) {
            return 14;
        }
        if (obj instanceof o0OOOO.o00oo0) {
            return 15;
        }
        if (obj instanceof o0OOOO.o00oo0OO) {
            return 16;
        }
        if (obj instanceof o0OOOO.o00oo0O0) {
            return 17;
        }
        if (obj instanceof o0OOOO.o00oo0O) {
            return 18;
        }
        if (obj instanceof o0OOOO.o0O0o) {
            return 19;
        }
        if (obj instanceof o0OOOO.o00ooO0) {
            return 20;
        }
        if (obj instanceof o0OOOO.o00ooO) {
            return 21;
        }
        return obj instanceof o0OOOO.o0 ? 22 : -1;
    }

    public static boolean o00ooOO(Object obj) {
        return (obj instanceof Iterable) && (!(obj instanceof o0OOOOO.o00oOOo0) || (obj instanceof o0OOOOO.o00oOo00));
    }

    public static boolean o00ooOO0(Object obj) {
        return (obj instanceof Collection) && (!(obj instanceof o0OOOOO.o00oOOo0) || (obj instanceof o0OOOOO.o00oOOoO));
    }

    public static boolean o00ooOOo(Object obj) {
        return (obj instanceof Iterator) && (!(obj instanceof o0OOOOO.o00oOOo0) || (obj instanceof o0OOOOO.o00oOo0O));
    }

    public static boolean o00ooOo(Object obj) {
        return (obj instanceof ListIterator) && (!(obj instanceof o0OOOOO.o00oOOo0) || (obj instanceof o0OOOOO.o00oo00O));
    }

    public static boolean o00ooOo0(Object obj) {
        return (obj instanceof List) && (!(obj instanceof o0OOOOO.o00oOOo0) || (obj instanceof o0OOOOO.o00oOoO));
    }

    public static boolean o00ooOoO(Object obj) {
        return (obj instanceof Map) && (!(obj instanceof o0OOOOO.o00oOOo0) || (obj instanceof o0OOOOO.o00oo0));
    }

    public static boolean o00ooOoo(Object obj) {
        return (obj instanceof Map.Entry) && (!(obj instanceof o0OOOOO.o00oOOo0) || (obj instanceof o00oo0.o00oOOo0));
    }

    public static <T extends Throwable> T o00ooo0(T t) {
        return (T) o0ooO.o00ooO(t, o0OOO0OO.class.getName());
    }

    public static boolean o00ooo00(Object obj) {
        return (obj instanceof Set) && (!(obj instanceof o0OOOOO.o00oOOo0) || (obj instanceof o0OOOOO.o00oo0OO));
    }

    public static ClassCastException o00ooo0O(ClassCastException classCastException) {
        throw ((ClassCastException) o00ooo0(classCastException));
    }

    public static void o00ooo0o(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        o00oooO(name + " cannot be cast to " + str);
    }

    public static void o00oooO(String str) {
        throw o00ooo0O(new ClassCastException(str));
    }

    public static List o0O0o(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw o00ooo0O(e);
        }
    }
}
