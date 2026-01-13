package o0O000;

import android.annotation.SuppressLint;
import android.os.Build;
import java.util.Locale;
import o00oOooO.o0OO0o;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00oOOo0 {

    @o0OO0o
    /* renamed from: o0O000.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public @interface InterfaceC0120o00oOOo0 {
    }

    @o00oOooO.o0O00O0o(api = 24)
    @Deprecated
    public static boolean o00oOOo0() {
        return true;
    }

    @o00oOooO.o0O00O0o(api = 25)
    @Deprecated
    public static boolean o00oOOoO() {
        return true;
    }

    @o00oOooO.o0O00O0o(api = 26)
    @Deprecated
    public static boolean o00oOo00() {
        return true;
    }

    @o00oOooO.o0O00O0o(api = 28)
    @Deprecated
    public static boolean o00oOo0O() {
        return true;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.TESTS})
    public static boolean o00oOo0o(@oo0oO0 String str, @oo0oO0 String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }

    @o00oOooO.o0O00O0o(api = 30)
    @Deprecated
    public static boolean o00oOoO() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @o00oOooO.o0O00O0o(api = 29)
    @Deprecated
    public static boolean o00oOoO0() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @o00oOooO.o0O00O0o(api = 31, codename = "S")
    @SuppressLint({"RestrictedApi"})
    @Deprecated
    public static boolean o00oOoOO() {
        int i = Build.VERSION.SDK_INT;
        return i >= 31 || (i >= 30 && o00oOo0o("S", Build.VERSION.CODENAME));
    }

    @InterfaceC0120o00oOOo0
    @o00oOooO.o0O00O0o(api = 32, codename = "Sv2")
    @Deprecated
    public static boolean o00oOoOo() {
        int i = Build.VERSION.SDK_INT;
        return i >= 32 || (i >= 31 && o00oOo0o("Sv2", Build.VERSION.CODENAME));
    }

    @InterfaceC0120o00oOOo0
    @o00oOooO.o0O00O0o(api = 33, codename = "Tiramisu")
    public static boolean o00oOoo0() {
        int i = Build.VERSION.SDK_INT;
        return i >= 33 || (i >= 32 && o00oOo0o("Tiramisu", Build.VERSION.CODENAME));
    }

    @o00oOooO.o0O00O0o(api = 27)
    @Deprecated
    public static boolean o00oOooO() {
        return true;
    }

    @InterfaceC0120o00oOOo0
    @o00oOooO.o0O00O0o(codename = "UpsideDownCake")
    public static boolean o00oOooo() {
        return Build.VERSION.SDK_INT >= 33 && o00oOo0o("UpsideDownCake", Build.VERSION.CODENAME);
    }
}
