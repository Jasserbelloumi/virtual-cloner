package o0OOOoo0;

import java.util.Locale;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class oOo0o0oO {
    @NotNull
    public static final String o00oOOo0(char c) {
        String valueOf = String.valueOf(c);
        o0ooO.o00oo0(valueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        o0ooO.o00oo0OO(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (upperCase.length() > 1) {
            if (c == 329) {
                return upperCase;
            }
            char charAt = upperCase.charAt(0);
            o0ooO.o00oo0(upperCase, "null cannot be cast to non-null type java.lang.String");
            String substring = upperCase.substring(1);
            o0ooO.o00oo0OO(substring, "this as java.lang.String).substring(startIndex)");
            o0ooO.o00oo0(substring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = substring.toLowerCase(locale);
            o0ooO.o00oo0OO(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return charAt + lowerCase;
        }
        return String.valueOf(Character.toTitleCase(c));
    }
}
