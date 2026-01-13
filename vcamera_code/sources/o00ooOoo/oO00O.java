package o00ooOoo;

import android.app.LocaleManager;
import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.Locale;
import o00oOooO.o0O000O;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OOooO0;
import o00oOooO.o0OoOoO;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
import o0O000.o00oOOo0;
import o0O000.o00ooO0;
/* loaded from: classes.dex */
public final class oO00O {

    @o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static String o00oOOo0(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    @o0OOooO0(24)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0O0O0Oo
        public static o00ooO0 o00oOOo0(Configuration configuration) {
            return o00ooO0.o00oOo00(configuration.getLocales().toLanguageTags());
        }
    }

    @o0OOooO0(33)
    /* loaded from: classes.dex */
    public static class o00oOo00 {
        @o0O0O0Oo
        public static LocaleList o00oOOo0(Object obj) {
            return ((LocaleManager) obj).getSystemLocales();
        }
    }

    @o0o0000
    public static o00ooO0 o00oOOo0(Configuration configuration) {
        return o00oOOoO.o00oOOo0(configuration);
    }

    @o0OOooO0(33)
    public static Object o00oOOoO(Context context) {
        return context.getSystemService("locale");
    }

    @oo0oO0
    @o0O000O
    @o0OoOoO(markerClass = {o00oOOo0.InterfaceC0120o00oOOo0.class})
    public static o00ooO0 o00oOo00(@oo0oO0 Context context) {
        o00ooO0 o00oOoO02 = o00ooO0.o00oOoO0();
        if (o0O000.o00oOOo0.o00oOoo0()) {
            Object o00oOOoO2 = o00oOOoO(context);
            return o00oOOoO2 != null ? o00ooO0.o00oo0OO(o00oOo00.o00oOOo0(o00oOOoO2)) : o00oOoO02;
        }
        return o00oOOoO.o00oOOo0(context.getApplicationContext().getResources().getConfiguration());
    }
}
