package o0OoOoOO;

import android.text.TextUtils;
import java.util.Locale;
import o00oOooO.o0O0O0Oo;
/* loaded from: classes.dex */
public final class o0OO0oO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final Locale f16859o00oOOo0 = new Locale("", "");

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f16860o00oOOoO = "Arab";

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f16861o00oOo00 = "Hebr";

    @o00oOooO.o0OOooO0(17)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static int o00oOOo0(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    public static int o00oOOo0(@o00oOooO.oo0oO0 Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    public static int o00oOOoO(@o00oOooO.o0OO00OO Locale locale) {
        return o00oOOo0.o00oOOo0(locale);
    }

    @o00oOooO.oo0oO0
    public static String o00oOo00(@o00oOooO.oo0oO0 String str) {
        return TextUtils.htmlEncode(str);
    }
}
