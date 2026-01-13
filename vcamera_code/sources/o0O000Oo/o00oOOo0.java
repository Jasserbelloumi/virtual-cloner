package o0O000Oo;

import android.content.Context;
import android.telephony.mbms.ServiceInfo;
import java.util.Locale;
import java.util.Set;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oOOo0 {

    @o0OOooO0(28)
    /* renamed from: o0O000Oo.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0128o00oOOo0 {
        public static CharSequence o00oOOo0(Context context, ServiceInfo serviceInfo) {
            Set<Locale> namedContentLocales = serviceInfo.getNamedContentLocales();
            if (namedContentLocales.isEmpty()) {
                return null;
            }
            String[] strArr = new String[namedContentLocales.size()];
            int i = 0;
            for (Locale locale : serviceInfo.getNamedContentLocales()) {
                strArr[i] = locale.toLanguageTag();
                i++;
            }
            Locale firstMatch = context.getResources().getConfiguration().getLocales().getFirstMatch(strArr);
            if (firstMatch == null) {
                return null;
            }
            return serviceInfo.getNameForLocale(firstMatch);
        }
    }

    @o0OO00OO
    public static CharSequence o00oOOo0(@oo0oO0 Context context, @oo0oO0 ServiceInfo serviceInfo) {
        return C0128o00oOOo0.o00oOOo0(context, serviceInfo);
    }
}
