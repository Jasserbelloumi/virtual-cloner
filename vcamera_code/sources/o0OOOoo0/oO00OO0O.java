package o0OOOoo0;

import java.util.Locale;
import o0OO0o.o00oo;
import o0OO0o.o0O;
import o0OO0o.o0O000;
import o0OO0o.o0O0o;
import o0OO0o.o0OO000;
import o0OO0o.o0OO00o0;
import o0OO0o.oO0Oo0oo;
import o0OOO0OO.o00oo00O;
import o0OOOOO0.o0ooO;
import o0OOOo0o.o0O0O0Oo;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public class oO00OO0O {
    @o0O
    public static final int o00oOOo0(int i) {
        if (new o0O0O0Oo(2, 36).o00oOoo0(i)) {
            return i;
        }
        StringBuilder o00oOOo02 = o00ooOoo.oO00O0oO.o00oOOo0("radix ", i, " was not in valid range ");
        o00oOOo02.append(new o0O0O0Oo(2, 36));
        throw new IllegalArgumentException(o00oOOo02.toString());
    }

    public static final int o00oOOoO(char c, int i) {
        return Character.digit((int) c, i);
    }

    @NotNull
    public static final oOo00OO0 o00oOo00(char c) {
        return oOo00OO0.Companion.o00oOOo0(Character.getType(c));
    }

    @o00oo00O
    public static final boolean o00oOo0O(char c) {
        return Character.isDefined(c);
    }

    @o00oo00O
    public static final boolean o00oOo0o(char c) {
        return Character.isDigit(c);
    }

    @o00oo00O
    public static final boolean o00oOoO(char c) {
        return Character.isISOControl(c);
    }

    @o00oo00O
    public static final boolean o00oOoO0(char c) {
        return Character.isHighSurrogate(c);
    }

    @o00oo00O
    public static final boolean o00oOoOO(char c) {
        return Character.isIdentifierIgnorable(c);
    }

    @o00oo00O
    public static final boolean o00oOoOo(char c) {
        return Character.isJavaIdentifierPart(c);
    }

    @o00oo00O
    public static final boolean o00oOoo0(char c) {
        return Character.isJavaIdentifierStart(c);
    }

    @NotNull
    public static final oO00O0oO o00oOooO(char c) {
        return oO00O0oO.Companion.o00oOOoO(Character.getDirectionality(c));
    }

    @o00oo00O
    public static final boolean o00oOooo(char c) {
        return Character.isLetter(c);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o00oo00O
    @o0OO00o0(version = "1.5")
    public static final char o00oo(char c) {
        return Character.toTitleCase(c);
    }

    @o00oo00O
    public static final boolean o00oo0(char c) {
        return Character.isLowSurrogate(c);
    }

    @o00oo00O
    public static final boolean o00oo00O(char c) {
        return Character.isLetterOrDigit(c);
    }

    @o00oo00O
    public static final boolean o00oo0O(char c) {
        return Character.isUpperCase(c);
    }

    @o00oo00O
    public static final boolean o00oo0O0(char c) {
        return Character.isTitleCase(c);
    }

    @o00oo00O
    public static final boolean o00oo0OO(char c) {
        return Character.isLowerCase(c);
    }

    public static final boolean o00oo0Oo(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.5")
    @NotNull
    public static final String o00oo0o(char c, @NotNull Locale locale) {
        o0ooO.o00oo0O0(locale, "locale");
        String valueOf = String.valueOf(c);
        o0ooO.o00oo0(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(locale);
        o0ooO.o00oo0OO(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o00oo00O
    @o0OO00o0(version = "1.5")
    public static final String o00oo0o0(char c) {
        String valueOf = String.valueOf(c);
        o0ooO.o00oo0(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(Locale.ROOT);
        o0ooO.o00oo0OO(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o00oo00O
    @o0OO00o0(version = "1.5")
    public static final char o00oo0oO(char c) {
        return Character.toLowerCase(c);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.5")
    @NotNull
    public static final String o00ooO(char c, @NotNull Locale locale) {
        o0ooO.o00oo0O0(locale, "locale");
        String valueOf = String.valueOf(c);
        o0ooO.o00oo0(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(locale);
        o0ooO.o00oo0OO(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    @o00oo(warningSince = "1.5")
    @o00oo00O
    @o0O0o(message = "Use titlecaseChar() instead.", replaceWith = @o0OO000(expression = "titlecaseChar()", imports = {}))
    public static final char o00ooO0(char c) {
        return Character.toTitleCase(c);
    }

    @o00oo(warningSince = "1.5")
    @o00oo00O
    @o0O0o(message = "Use lowercaseChar() instead.", replaceWith = @o0OO000(expression = "lowercaseChar()", imports = {}))
    public static final char o00ooO00(char c) {
        return Character.toLowerCase(c);
    }

    @o00oo(warningSince = "1.5")
    @o00oo00O
    @o0O0o(message = "Use uppercaseChar() instead.", replaceWith = @o0OO000(expression = "uppercaseChar()", imports = {}))
    public static final char o00ooO0O(char c) {
        return Character.toUpperCase(c);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o00oo00O
    @o0OO00o0(version = "1.5")
    public static final String o00ooO0o(char c) {
        String valueOf = String.valueOf(c);
        o0ooO.o00oo0(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        o0ooO.o00oo0OO(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o00oo00O
    @o0OO00o0(version = "1.5")
    public static final char o00ooOO0(char c) {
        return Character.toUpperCase(c);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.5")
    @NotNull
    public static final String o0O0o(char c, @NotNull Locale locale) {
        o0ooO.o00oo0O0(locale, "locale");
        String o00ooO2 = o00ooO(c, locale);
        if (o00ooO2.length() <= 1) {
            String valueOf = String.valueOf(c);
            o0ooO.o00oo0(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            o0ooO.o00oo0OO(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return !o0ooO.o00oOoO0(o00ooO2, upperCase) ? o00ooO2 : String.valueOf(Character.toTitleCase(c));
        } else if (c == 329) {
            return o00ooO2;
        } else {
            char charAt = o00ooO2.charAt(0);
            o0ooO.o00oo0(o00ooO2, "null cannot be cast to non-null type java.lang.String");
            String substring = o00ooO2.substring(1);
            o0ooO.o00oo0OO(substring, "this as java.lang.String).substring(startIndex)");
            o0ooO.o00oo0(substring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = substring.toLowerCase(Locale.ROOT);
            o0ooO.o00oo0OO(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return charAt + lowerCase;
        }
    }
}
