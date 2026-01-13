package o0OoOoOO;

import android.annotation.SuppressLint;
import android.icu.util.ULocale;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import o00oOooO.o0O0O0Oo;
/* loaded from: classes.dex */
public final class o0OO00o0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f16856o00oOOo0 = "ICUCompat";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static Method f16857o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static Method f16858o00oOo00;

    @o00oOooO.o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static String o00oOOo0(Locale locale) {
            return locale.getScript();
        }
    }

    @o00oOooO.o0OOooO0(24)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0O0O0Oo
        public static ULocale o00oOOo0(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        @o0O0O0Oo
        public static ULocale o00oOOoO(Locale locale) {
            return ULocale.forLocale(locale);
        }

        @o0O0O0Oo
        public static String o00oOo00(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static String o00oOOo0(Locale locale) {
        String locale2 = locale.toString();
        try {
            Method method = f16858o00oOo00;
            if (method != null) {
                return (String) method.invoke(null, locale2);
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return locale2;
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static String o00oOOoO(String str) {
        try {
            Method method = f16857o00oOOoO;
            if (method != null) {
                return (String) method.invoke(null, str);
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return null;
    }

    @o00oOooO.o0OO00OO
    public static String o00oOo00(@o00oOooO.oo0oO0 Locale locale) {
        return o00oOOoO.o00oOo00(o00oOOoO.o00oOOo0(o00oOOoO.o00oOOoO(locale)));
    }
}
