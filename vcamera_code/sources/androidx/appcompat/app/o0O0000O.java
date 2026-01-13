package androidx.appcompat.app;

import android.os.LocaleList;
import java.util.LinkedHashSet;
import java.util.Locale;
import o00oOooO.o0OOooO0;
@o0OOooO0(24)
/* loaded from: classes.dex */
public final class o0O0000O {
    public static o0O000.o00ooO0 o00oOOo0(o0O000.o00ooO0 o00ooo02, o0O000.o00ooO0 o00ooo03) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        while (i < o00ooo03.o00oOooo() + o00ooo02.o00oOooo()) {
            Locale o00oOooO2 = i < o00ooo02.o00oOooo() ? o00ooo02.o00oOooO(i) : o00ooo03.o00oOooO(i - o00ooo02.o00oOooo());
            if (o00oOooO2 != null) {
                linkedHashSet.add(o00oOooO2);
            }
            i++;
        }
        return o0O000.o00ooO0.o00oOOo0((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    public static o0O000.o00ooO0 o00oOOoO(LocaleList localeList, LocaleList localeList2) {
        return (localeList == null || localeList.isEmpty()) ? o0O000.o00ooO0.o00oOoO0() : o00oOOo0(o0O000.o00ooO0.o00oo0OO(localeList), o0O000.o00ooO0.o00oo0OO(localeList2));
    }

    public static o0O000.o00ooO0 o00oOo00(o0O000.o00ooO0 o00ooo02, o0O000.o00ooO0 o00ooo03) {
        return (o00ooo02 == null || o00ooo02.o00oOoOo()) ? o0O000.o00ooO0.o00oOoO0() : o00oOOo0(o00ooo02, o00ooo03);
    }
}
