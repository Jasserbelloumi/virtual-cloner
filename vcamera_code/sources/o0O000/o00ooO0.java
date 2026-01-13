package o0O000;

import android.os.LocaleList;
import java.util.Locale;
import o00oOooO.o0O0o00O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOO00;
import o00oOooO.o0OOooO0;
import o00oOooO.o0OoOoO;
import o00oOooO.oo0oO0;
import o0O000.o00oOOo0;
import o0OoOoOO.o0OO00o0;
/* loaded from: classes.dex */
public final class o00ooO0 {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final o00ooO0 f10114o00oOOoO = o00oOOo0(new Locale[0]);

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0 f10115o00oOOo0;

    @o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final Locale[] f10116o00oOOo0 = {new Locale("en", "XA"), new Locale("ar", "XB")};

        @o00oOooO.o0O0O0Oo
        public static Locale o00oOOo0(String str) {
            return Locale.forLanguageTag(str);
        }

        public static boolean o00oOOoO(Locale locale) {
            for (Locale locale2 : f10116o00oOOo0) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOo00(@oo0oO0 Locale locale, @oo0oO0 Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || o00oOOoO(locale) || o00oOOoO(locale2)) {
                return false;
            }
            String o00oOo002 = o0OO00o0.o00oOo00(locale);
            if (o00oOo002.isEmpty()) {
                String country = locale.getCountry();
                return country.isEmpty() || country.equals(locale2.getCountry());
            }
            return o00oOo002.equals(o0OO00o0.o00oOo00(locale2));
        }
    }

    @o0OOooO0(24)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o00oOooO.o0O0O0Oo
        public static LocaleList o00oOOo0(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        @o00oOooO.o0O0O0Oo
        public static LocaleList o00oOOoO() {
            return LocaleList.getAdjustedDefault();
        }

        @o00oOooO.o0O0O0Oo
        public static LocaleList o00oOo00() {
            return LocaleList.getDefault();
        }
    }

    public o00ooO0(o0 o0Var) {
        this.f10115o00oOOo0 = o0Var;
    }

    @oo0oO0
    public static o00ooO0 o00oOOo0(@oo0oO0 Locale... localeArr) {
        return o00oo0OO(o00oOOoO.o00oOOo0(localeArr));
    }

    public static Locale o00oOOoO(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (!str.contains("_")) {
            return new Locale(str);
        } else {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException(android.support.v4.media.o00oOoO.o00oOOo0("Can not parse language tag: [", str, "]"));
    }

    @oo0oO0
    public static o00ooO0 o00oOo00(@o0OO00OO String str) {
        if (str == null || str.isEmpty()) {
            return f10114o00oOOoO;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = o00oOOo0.o00oOOo0(split[i]);
        }
        return o00oOOo0(localeArr);
    }

    @oo0oO0
    @o0OOO00(min = 1)
    public static o00ooO0 o00oOo0O() {
        return o00oo0OO(o00oOOoO.o00oOOoO());
    }

    @oo0oO0
    @o0OOO00(min = 1)
    public static o00ooO0 o00oOo0o() {
        return o00oo0OO(o00oOOoO.o00oOo00());
    }

    @oo0oO0
    public static o00ooO0 o00oOoO0() {
        return f10114o00oOOoO;
    }

    @o0OOooO0(21)
    @o0OoOoO(markerClass = {o00oOOo0.InterfaceC0120o00oOOo0.class})
    public static boolean o00oOoo0(@oo0oO0 Locale locale, @oo0oO0 Locale locale2) {
        return o0O000.o00oOOo0.o00oOoo0() ? LocaleList.matchesLanguageAndScript(locale, locale2) : o00oOOo0.o00oOo00(locale, locale2);
    }

    @o0OOooO0(24)
    @Deprecated
    public static o00ooO0 o00oo0O0(Object obj) {
        return o00oo0OO((LocaleList) obj);
    }

    @o0OOooO0(24)
    @oo0oO0
    public static o00ooO0 o00oo0OO(@oo0oO0 LocaleList localeList) {
        return new o00ooO0(new o0O00000(localeList));
    }

    public boolean equals(Object obj) {
        return (obj instanceof o00ooO0) && this.f10115o00oOOo0.equals(((o00ooO0) obj).f10115o00oOOo0);
    }

    public int hashCode() {
        return this.f10115o00oOOo0.hashCode();
    }

    @o0OO00OO
    public Locale o00oOoO(@oo0oO0 String[] strArr) {
        return this.f10115o00oOOo0.o00oOooO(strArr);
    }

    @o0O0o00O(from = -1)
    public int o00oOoOO(@o0OO00OO Locale locale) {
        return this.f10115o00oOOo0.o00oOOo0(locale);
    }

    public boolean o00oOoOo() {
        return this.f10115o00oOOo0.isEmpty();
    }

    @o0OO00OO
    public Locale o00oOooO(int i) {
        return this.f10115o00oOOo0.get(i);
    }

    @o0O0o00O(from = 0)
    public int o00oOooo() {
        return this.f10115o00oOOo0.size();
    }

    @o0OO00OO
    public Object o00oo0() {
        return this.f10115o00oOOo0.o00oOo00();
    }

    @oo0oO0
    public String o00oo00O() {
        return this.f10115o00oOOo0.o00oOOoO();
    }

    @oo0oO0
    public String toString() {
        return this.f10115o00oOOo0.toString();
    }
}
