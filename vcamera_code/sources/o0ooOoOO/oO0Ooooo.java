package o0ooOoOO;

import java.util.Objects;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class oO0Ooooo {

    @o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static boolean o00oOOo0(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        @o0O0O0Oo
        public static int o00oOOoO(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    public static boolean o00oOOo0(@o0OO00OO Object obj, @o0OO00OO Object obj2) {
        return o00oOOo0.o00oOOo0(obj, obj2);
    }

    public static int o00oOOoO(@o0OO00OO Object... objArr) {
        return o00oOOo0.o00oOOoO(objArr);
    }

    public static int o00oOo00(@o0OO00OO Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    @oo0oO0
    public static <T> T o00oOo0O(@o0OO00OO T t, @oo0oO0 String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    @o0OO00OO
    public static String o00oOo0o(@o0OO00OO Object obj, @o0OO00OO String str) {
        return obj != null ? obj.toString() : str;
    }

    @oo0oO0
    public static <T> T o00oOooO(@o0OO00OO T t) {
        t.getClass();
        return t;
    }
}
