package o0OOOoo0;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import o0OO0o.o00oo;
import o0OO0o.o0O000;
import o0OO0o.o0O0o;
import o0OO0o.o0OO000;
import o0OO0o.o0OO00o0;
import o0OO0o.oO0Oo0oo;
import o0OO0oO.o0;
import o0OO0oO.o00oOo00;
import o0OO0oO.o0O00000;
import o0OO0oO.o0O0o0;
import o0OOO0OO.o00oo00O;
import o0OOO0OO.o00oo0OO;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0OOO0O;
import o0OOOOO0.o0ooO;
import o0OOOo0o.o0O0O0Oo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOO00({"SMAP\nStringsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,825:1\n1174#2,2:826\n1#3:828\n1726#4,3:829\n*S KotlinDebug\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n*L\n73#1:826,2\n621#1:829,3\n*E\n"})
/* loaded from: classes3.dex */
public class oO0O00o0 extends oO0O00O {
    public static /* synthetic */ boolean o0O(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return o0O0oooo(str, str2, z);
    }

    @o00oo00O
    public static final String o0O0o0(byte[] bArr) {
        o0ooO.o00oo0O0(bArr, "bytes");
        return new String(bArr, oO00OOO.f13864o00oOOoO);
    }

    @o00oo00O
    public static final String o0O0o00O(StringBuffer stringBuffer) {
        o0ooO.o00oo0O0(stringBuffer, "stringBuffer");
        return new String(stringBuffer);
    }

    @o00oo00O
    public static final String o0O0o00o(StringBuilder sb) {
        o0ooO.o00oo0O0(sb, "stringBuilder");
        return new String(sb);
    }

    @o00oo00O
    public static final String o0O0o0O(byte[] bArr, int i, int i2) {
        o0ooO.o00oo0O0(bArr, "bytes");
        return new String(bArr, i, i2, oO00OOO.f13864o00oOOoO);
    }

    @o00oo00O
    public static final String o0O0o0OO(byte[] bArr, int i, int i2, Charset charset) {
        o0ooO.o00oo0O0(bArr, "bytes");
        o0ooO.o00oo0O0(charset, "charset");
        return new String(bArr, i, i2, charset);
    }

    @o00oo00O
    public static final String o0O0o0Oo(byte[] bArr, Charset charset) {
        o0ooO.o00oo0O0(bArr, "bytes");
        o0ooO.o00oo0O0(charset, "charset");
        return new String(bArr, charset);
    }

    @o00oo00O
    public static final String o0O0o0o(char[] cArr, int i, int i2) {
        o0ooO.o00oo0O0(cArr, "chars");
        return new String(cArr, i, i2);
    }

    @o00oo00O
    public static final String o0O0o0o0(char[] cArr) {
        o0ooO.o00oo0O0(cArr, "chars");
        return new String(cArr);
    }

    @o00oo(warningSince = "1.5")
    @o0O0o(message = "Use replaceFirstChar instead.", replaceWith = @o0OO000(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports = {"java.util.Locale"}))
    @NotNull
    public static final String o0O0o0oO(@NotNull String str) {
        o0ooO.o00oo0O0(str, "<this>");
        Locale locale = Locale.getDefault();
        o0ooO.o00oo0OO(locale, "getDefault()");
        return o0O0o0oo(str, locale);
    }

    @o00oo0OO
    @o00oo(warningSince = "1.5")
    @o0O0o(message = "Use replaceFirstChar instead.", replaceWith = @o0OO000(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports = {}))
    @NotNull
    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.4")
    public static final String o0O0o0oo(@NotNull String str, @NotNull Locale locale) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(locale, "locale");
        if (str.length() > 0) {
            char charAt = str.charAt(0);
            if (Character.isLowerCase(charAt)) {
                StringBuilder sb = new StringBuilder();
                char titleCase = Character.toTitleCase(charAt);
                if (titleCase != Character.toUpperCase(charAt)) {
                    sb.append(titleCase);
                } else {
                    String substring = str.substring(0, 1);
                    o0ooO.o00oo0OO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    o0ooO.o00oo0(substring, "null cannot be cast to non-null type java.lang.String");
                    String upperCase = substring.toUpperCase(locale);
                    o0ooO.o00oo0OO(upperCase, "this as java.lang.String).toUpperCase(locale)");
                    sb.append(upperCase);
                }
                String substring2 = str.substring(1);
                o0ooO.o00oo0OO(substring2, "this as java.lang.String).substring(startIndex)");
                sb.append(substring2);
                String sb2 = sb.toString();
                o0ooO.o00oo0OO(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            }
            return str;
        }
        return str;
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.4")
    @NotNull
    public static final String o0O0oO(@NotNull char[] cArr) {
        o0ooO.o00oo0O0(cArr, "<this>");
        return new String(cArr);
    }

    @o00oo00O
    public static final int o0O0oO0(String str, int i, int i2) {
        o0ooO.o00oo0O0(str, "<this>");
        return str.codePointCount(i, i2);
    }

    public static final int o0O0oO0O(@NotNull String str, @NotNull String str2, boolean z) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(str2, "other");
        return z ? str.compareToIgnoreCase(str2) : str.compareTo(str2);
    }

    public static /* synthetic */ int o0O0oO0o(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return o0O0oO0O(str, str2, z);
    }

    public static /* synthetic */ String o0O0oOO(char[] cArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = cArr.length;
        }
        return o0O0oOO0(cArr, i, i2);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.4")
    @NotNull
    public static final String o0O0oOO0(@NotNull char[] cArr, int i, int i2) {
        o0ooO.o00oo0O0(cArr, "<this>");
        o00oOo00.Companion.o00oOOo0(i, i2, cArr.length);
        return new String(cArr, i, i2 - i);
    }

    @o0OO00o0(version = "1.5")
    public static final boolean o0O0oOOO(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, boolean z) {
        return z ? oO0O0.o0OOOooo(charSequence, charSequence2) : o0O0oo00(charSequence, charSequence2);
    }

    @o00oo(warningSince = "1.5")
    @o0O0o(message = "Use replaceFirstChar instead.", replaceWith = @o0OO000(expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports = {"java.util.Locale"}))
    @NotNull
    public static final String o0O0oOo(@NotNull String str) {
        o0ooO.o00oo0O0(str, "<this>");
        if (!(str.length() > 0) || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 1);
        o0ooO.o00oo0OO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        o0ooO.o00oo0(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase();
        o0ooO.o00oo0OO(lowerCase, "this as java.lang.String).toLowerCase()");
        sb.append(lowerCase);
        String substring2 = str.substring(1);
        o0ooO.o00oo0OO(substring2, "this as java.lang.String).substring(startIndex)");
        sb.append(substring2);
        return sb.toString();
    }

    @o00oo00O
    public static final boolean o0O0oOo0(String str, CharSequence charSequence) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(charSequence, "charSequence");
        return str.contentEquals(charSequence);
    }

    @o00oo0OO
    @o00oo(warningSince = "1.5")
    @o0O0o(message = "Use replaceFirstChar instead.", replaceWith = @o0OO000(expression = "replaceFirstChar { it.lowercase(locale) }", imports = {}))
    @NotNull
    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.4")
    public static final String o0O0oOoO(@NotNull String str, @NotNull Locale locale) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(locale, "locale");
        if (!(str.length() > 0) || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 1);
        o0ooO.o00oo0OO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        o0ooO.o00oo0(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase(locale);
        o0ooO.o00oo0OO(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        sb.append(lowerCase);
        String substring2 = str.substring(1);
        o0ooO.o00oo0OO(substring2, "this as java.lang.String).substring(startIndex)");
        sb.append(substring2);
        return sb.toString();
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.4")
    @NotNull
    public static final String o0O0oOoo(@NotNull byte[] bArr) {
        o0ooO.o00oo0O0(bArr, "<this>");
        return new String(bArr, oO00OOO.f13864o00oOOoO);
    }

    public static /* synthetic */ String o0O0oo(byte[] bArr, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return o0O0oo0(bArr, i, i2, z);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.4")
    @NotNull
    public static final String o0O0oo0(@NotNull byte[] bArr, int i, int i2, boolean z) {
        o0ooO.o00oo0O0(bArr, "<this>");
        o00oOo00.Companion.o00oOOo0(i, i2, bArr.length);
        if (z) {
            String charBuffer = oO00OOO.f13864o00oOOoO.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(bArr, i, i2 - i)).toString();
            o0ooO.o00oo0OO(charBuffer, "decoder.decode(ByteBuffe…- startIndex)).toString()");
            return charBuffer;
        }
        return new String(bArr, i, i2 - i, oO00OOO.f13864o00oOOoO);
    }

    @o0OO00o0(version = "1.5")
    public static final boolean o0O0oo00(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        return (!(charSequence instanceof String) || charSequence2 == null) ? oO0O0.o0OOo000(charSequence, charSequence2) : ((String) charSequence).contentEquals(charSequence2);
    }

    @o00oo00O
    public static final int o0O0oo0O(String str, int i) {
        o0ooO.o00oo0O0(str, "<this>");
        return str.codePointAt(i);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.4")
    @NotNull
    public static final byte[] o0O0ooO0(@NotNull String str) {
        o0ooO.o00oo0O0(str, "<this>");
        byte[] bytes = str.getBytes(oO00OOO.f13864o00oOOoO);
        o0ooO.o00oo0OO(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.4")
    @NotNull
    public static final byte[] o0O0ooOO(@NotNull String str, int i, int i2, boolean z) {
        o0ooO.o00oo0O0(str, "<this>");
        o00oOo00.Companion.o00oOOo0(i, i2, str.length());
        if (!z) {
            String substring = str.substring(i, i2);
            o0ooO.o00oo0OO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = oO00OOO.f13864o00oOOoO;
            o0ooO.o00oo0(substring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = substring.getBytes(charset);
            o0ooO.o00oo0OO(bytes, "this as java.lang.String).getBytes(charset)");
            return bytes;
        }
        ByteBuffer encode = oO00OOO.f13864o00oOOoO.newEncoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).encode(CharBuffer.wrap(str, i, i2));
        if (encode.hasArray() && encode.arrayOffset() == 0) {
            int remaining = encode.remaining();
            byte[] array = encode.array();
            o0ooO.o00oo00O(array);
            if (remaining == array.length) {
                byte[] array2 = encode.array();
                o0ooO.o00oo0OO(array2, "{\n        byteBuffer.array()\n    }");
                return array2;
            }
        }
        byte[] bArr = new byte[encode.remaining()];
        encode.get(bArr);
        return bArr;
    }

    public static final boolean o0O0ooo(@NotNull String str, @NotNull String str2, boolean z) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(str2, "suffix");
        return !z ? str.endsWith(str2) : o0OO0o0(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ byte[] o0O0ooo0(String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return o0O0ooOO(str, i, i2, z);
    }

    public static /* synthetic */ boolean o0O0oooO(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return o0O0ooo(str, str2, z);
    }

    public static final boolean o0O0oooo(@Nullable String str, @Nullable String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    @NotNull
    public static final List<String> o0OO(@NotNull CharSequence charSequence, @NotNull Pattern pattern, int i) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(pattern, "regex");
        oO0O0.o0OoOooO(i);
        if (i == 0) {
            i = -1;
        }
        String[] split = pattern.split(charSequence, i);
        o0ooO.o00oo0OO(split, "regex.split(this, if (limit == 0) -1 else limit)");
        return o0O00000.o00oo0o(split);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o00oo00O
    @o0OO00o0(version = "1.5")
    public static final String o0OO0(String str, Locale locale) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        o0ooO.o00oo0OO(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @o00oo(hiddenSince = "1.4")
    @o00oo00O
    @o0O0o(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    public static final /* synthetic */ String o0OO000(String str, Locale locale, Object... objArr) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(locale, "locale");
        o0ooO.o00oo0O0(objArr, "args");
        String format = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        o0ooO.o00oo0OO(format, "format(locale, this, *args)");
        return format;
    }

    @o00oo00O
    public static final String o0OO000o(String str, Object... objArr) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(objArr, "args");
        String format = String.format(str, Arrays.copyOf(objArr, objArr.length));
        o0ooO.o00oo0OO(format, "format(this, *args)");
        return format;
    }

    @o0OOOO0o.o00oo0OO(name = "formatNullable")
    @o00oo00O
    @o0OO00o0(version = "1.4")
    public static final String o0OO00OO(String str, Locale locale, Object... objArr) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(objArr, "args");
        String format = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        o0ooO.o00oo0OO(format, "format(locale, this, *args)");
        return format;
    }

    @NotNull
    public static final Comparator<String> o0OO00Oo(@NotNull o0OOO0O o0ooo0o) {
        o0ooO.o00oo0O0(o0ooo0o, "<this>");
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        o0ooO.o00oo0OO(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o00oo00O
    @o0OO00o0(version = "1.5")
    public static final String o0OO00o(String str) {
        o0ooO.o00oo0O0(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        o0ooO.o00oo0OO(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    @o00oo00O
    public static final String o0OO00o0(String str) {
        o0ooO.o00oo0O0(str, "<this>");
        String intern = str.intern();
        o0ooO.o00oo0OO(intern, "this as java.lang.String).intern()");
        return intern;
    }

    @o0OOOO0o.o00oo0OO(name = "formatNullable")
    @o00oo00O
    @o0OO00o0(version = "1.4")
    public static final String o0OO00oo(o0OOO0O o0ooo0o, Locale locale, String str, Object... objArr) {
        o0ooO.o00oo0O0(o0ooo0o, "<this>");
        o0ooO.o00oo0O0(str, "format");
        o0ooO.o00oo0O0(objArr, "args");
        String format = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        o0ooO.o00oo0OO(format, "format(locale, format, *args)");
        return format;
    }

    @o00oo00O
    public static final int o0OO0O0(String str, char c, int i) {
        o0ooO.o00oo0O0(str, "<this>");
        return str.indexOf(c, i);
    }

    @o00oo00O
    public static final int o0OO0O0O(String str, String str2, int i) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(str2, "str");
        return str.indexOf(str2, i);
    }

    @o00oo00O
    public static final int o0OO0OoO(String str, char c, int i) {
        o0ooO.o00oo0O0(str, "<this>");
        return str.lastIndexOf(c, i);
    }

    @o00oo00O
    public static final int o0OO0Ooo(String str, int i, int i2) {
        o0ooO.o00oo0O0(str, "<this>");
        return str.offsetByCodePoints(i, i2);
    }

    @NotNull
    public static final String o0OO0o(@NotNull CharSequence charSequence, int i) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        } else if (i != 0) {
            if (i != 1) {
                int length = charSequence.length();
                if (length != 0) {
                    if (length == 1) {
                        char charAt = charSequence.charAt(0);
                        char[] cArr = new char[i];
                        for (int i2 = 0; i2 < i; i2++) {
                            cArr[i2] = charAt;
                        }
                        return new String(cArr);
                    }
                    StringBuilder sb = new StringBuilder(charSequence.length() * i);
                    o0O0o0 o00oOOo02 = o0.o00oOOo0(1, i);
                    while (o00oOOo02.hasNext()) {
                        o00oOOo02.nextInt();
                        sb.append(charSequence);
                    }
                    String sb2 = sb.toString();
                    o0ooO.o00oo0OO(sb2, "{\n                    va…tring()\n                }");
                    return sb2;
                }
                return "";
            }
            return charSequence.toString();
        } else {
            return "";
        }
    }

    public static final boolean o0OO0o0(@NotNull String str, int i, @NotNull String str2, int i2, int i3, boolean z) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static final boolean o0OO0o00(@NotNull CharSequence charSequence, int i, @NotNull CharSequence charSequence2, int i2, int i3, boolean z) {
        o0ooO.o00oo0O0(charSequence, "<this>");
        o0ooO.o00oo0O0(charSequence2, "other");
        return ((charSequence instanceof String) && (charSequence2 instanceof String)) ? o0OO0o0((String) charSequence, i, (String) charSequence2, i2, i3, z) : oO0O0.o0Oo0o00(charSequence, i, charSequence2, i2, i3, z);
    }

    public static /* synthetic */ boolean o0OO0o0O(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            z = false;
        }
        return o0OO0o00(charSequence, i, charSequence2, i2, i3, z);
    }

    public static /* synthetic */ boolean o0OO0o0o(String str, int i, String str2, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            z = false;
        }
        return o0OO0o0(str, i, str2, i2, i3, z);
    }

    @NotNull
    public static final String o0OO0oO(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(str2, "oldValue");
        o0ooO.o00oo0O0(str3, "newValue");
        int i = 0;
        int o0OOoO0o2 = oO0O0.o0OOoO0o(str, str2, 0, z);
        if (o0OOoO0o2 < 0) {
            return str;
        }
        int length = str2.length();
        int i2 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append((CharSequence) str, i, o0OOoO0o2);
                sb.append(str3);
                i = o0OOoO0o2 + length;
                if (o0OOoO0o2 >= str.length()) {
                    break;
                }
                o0OOoO0o2 = oO0O0.o0OOoO0o(str, str2, o0OOoO0o2 + i2, z);
            } while (o0OOoO0o2 > 0);
            sb.append((CharSequence) str, i, str.length());
            String sb2 = sb.toString();
            o0ooO.o00oo0OO(sb2, "stringBuilder.append(this, i, length).toString()");
            return sb2;
        }
        throw new OutOfMemoryError();
    }

    @NotNull
    public static final String o0OO0oO0(@NotNull String str, char c, char c2, boolean z) {
        String sb;
        String str2;
        o0ooO.o00oo0O0(str, "<this>");
        if (z) {
            StringBuilder sb2 = new StringBuilder(str.length());
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (oO00OO.o00ooo00(charAt, c, z)) {
                    charAt = c2;
                }
                sb2.append(charAt);
            }
            sb = sb2.toString();
            str2 = "StringBuilder(capacity).…builderAction).toString()";
        } else {
            sb = str.replace(c, c2);
            str2 = "this as java.lang.String…replace(oldChar, newChar)";
        }
        o0ooO.o00oo0OO(sb, str2);
        return sb;
    }

    public static /* synthetic */ String o0OO0oOO(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return o0OO0oO0(str, c, c2, z);
    }

    @NotNull
    public static final String o0OO0oOo(@NotNull String str, char c, char c2, boolean z) {
        o0ooO.o00oo0O0(str, "<this>");
        int o0OOoOOO2 = oO0O0.o0OOoOOO(str, c, 0, z, 2, null);
        return o0OOoOOO2 < 0 ? str : oO0O0.o0OoOo(str, o0OOoOOO2, o0OOoOOO2 + 1, String.valueOf(c2)).toString();
    }

    @NotNull
    public static final String o0OO0oo0(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(str2, "oldValue");
        o0ooO.o00oo0O0(str3, "newValue");
        int o0OOoOo02 = oO0O0.o0OOoOo0(str, str2, 0, z, 2, null);
        return o0OOoOo02 < 0 ? str : oO0O0.o0OoOo(str, o0OOoOo02, str2.length() + o0OOoOo02, str3).toString();
    }

    public static /* synthetic */ String o0OO0ooO(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return o0OO0oOo(str, c, c2, z);
    }

    public static /* synthetic */ String o0OO0ooo(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return o0OO0oo0(str, str2, str3, z);
    }

    public static final boolean o0OOO0(@NotNull String str, @NotNull String str2, boolean z) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(str2, "prefix");
        return !z ? str.startsWith(str2) : o0OO0o0(str, 0, str2, 0, str2.length(), z);
    }

    public static /* synthetic */ List o0OOO00(CharSequence charSequence, Pattern pattern, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return o0OO(charSequence, pattern, i);
    }

    public static final boolean o0OOO00o(@NotNull String str, @NotNull String str2, int i, boolean z) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(str2, "prefix");
        return !z ? str.startsWith(str2, i) : o0OO0o0(str, i, str2, 0, str2.length(), z);
    }

    public static /* synthetic */ boolean o0OOO0O(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return o0OOO0(str, str2, z);
    }

    public static /* synthetic */ boolean o0OOO0O0(String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return o0OOO00o(str, str2, i, z);
    }

    @o00oo00O
    public static final String o0OOO0OO(String str, int i) {
        o0ooO.o00oo0O0(str, "<this>");
        String substring = str.substring(i);
        o0ooO.o00oo0OO(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    @o00oo00O
    public static final String o0OOO0Oo(String str, int i, int i2) {
        o0ooO.o00oo0O0(str, "<this>");
        String substring = str.substring(i, i2);
        o0ooO.o00oo0OO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @o00oo00O
    public static final byte[] o0OOO0o0(String str, Charset charset) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        o0ooO.o00oo0OO(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static /* synthetic */ byte[] o0OOO0oO(String str, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = oO00OOO.f13864o00oOOoO;
        }
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        o0ooO.o00oo0OO(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @o00oo00O
    public static final char[] o0OOO0oo(String str) {
        o0ooO.o00oo0O0(str, "<this>");
        char[] charArray = str.toCharArray();
        o0ooO.o00oo0OO(charArray, "this as java.lang.String).toCharArray()");
        return charArray;
    }

    @o00oo(warningSince = "1.5")
    @o00oo00O
    @o0O0o(message = "Use lowercase() instead.", replaceWith = @o0OO000(expression = "lowercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    public static final String o0OOOO(String str) {
        o0ooO.o00oo0O0(str, "<this>");
        String lowerCase = str.toLowerCase();
        o0ooO.o00oo0OO(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }

    public static /* synthetic */ char[] o0OOOO0(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return o0OOOOoO(str, i, i2);
    }

    @o00oo00O
    public static final char[] o0OOOO00(String str, char[] cArr, int i, int i2, int i3) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(cArr, FirebaseAnalytics.Param.DESTINATION);
        str.getChars(i2, i3, cArr, i);
        return cArr;
    }

    public static /* synthetic */ char[] o0OOOO0o(String str, char[] cArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = str.length();
        }
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(cArr, FirebaseAnalytics.Param.DESTINATION);
        str.getChars(i2, i3, cArr, i);
        return cArr;
    }

    @o00oo00O
    public static final Pattern o0OOOOO(String str, int i) {
        o0ooO.o00oo0O0(str, "<this>");
        Pattern compile = Pattern.compile(str, i);
        o0ooO.o00oo0OO(compile, "compile(this, flags)");
        return compile;
    }

    @o00oo(warningSince = "1.5")
    @o00oo00O
    @o0O0o(message = "Use lowercase() instead.", replaceWith = @o0OO000(expression = "lowercase(locale)", imports = {}))
    public static final String o0OOOOO0(String str, Locale locale) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        o0ooO.o00oo0OO(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    public static /* synthetic */ Pattern o0OOOOOO(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        o0ooO.o00oo0O0(str, "<this>");
        Pattern compile = Pattern.compile(str, i);
        o0ooO.o00oo0OO(compile, "compile(this, flags)");
        return compile;
    }

    @o00oo(warningSince = "1.5")
    @o00oo00O
    @o0O0o(message = "Use uppercase() instead.", replaceWith = @o0OO000(expression = "uppercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    public static final String o0OOOOOo(String str) {
        o0ooO.o00oo0O0(str, "<this>");
        String upperCase = str.toUpperCase();
        o0ooO.o00oo0OO(upperCase, "this as java.lang.String).toUpperCase()");
        return upperCase;
    }

    @o00oo(warningSince = "1.5")
    @o00oo00O
    @o0O0o(message = "Use uppercase() instead.", replaceWith = @o0OO000(expression = "uppercase(locale)", imports = {}))
    public static final String o0OOOOo(String str, Locale locale) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        o0ooO.o00oo0OO(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.4")
    @NotNull
    public static final char[] o0OOOOoO(@NotNull String str, int i, int i2) {
        o0ooO.o00oo0O0(str, "<this>");
        o00oOo00.Companion.o00oOOo0(i, i2, str.length());
        char[] cArr = new char[i2 - i];
        str.getChars(i, i2, cArr, 0);
        return cArr;
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o00oo00O
    @o0OO00o0(version = "1.5")
    public static final String o0OOOOoo(String str) {
        o0ooO.o00oo0O0(str, "<this>");
        String upperCase = str.toUpperCase(Locale.ROOT);
        o0ooO.o00oo0OO(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o00oo00O
    @o0OO00o0(version = "1.5")
    public static final String o0OOOo00(String str, Locale locale) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        o0ooO.o00oo0OO(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    @o00oo00O
    public static final int o0OOooO0(String str, String str2, int i) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(str2, "str");
        return str.lastIndexOf(str2, i);
    }

    public static /* synthetic */ String o0OOoooO(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return o0OO0oO(str, str2, str3, z);
    }

    public static final boolean o0OoOoO(@NotNull CharSequence charSequence) {
        boolean z;
        o0ooO.o00oo0O0(charSequence, "<this>");
        if (charSequence.length() != 0) {
            o0O0O0Oo o0OOo0o2 = oO0O0.o0OOo0o(charSequence);
            if (!(o0OOo0o2 instanceof Collection) || !((Collection) o0OOo0o2).isEmpty()) {
                Iterator<Integer> it = o0OOo0o2.iterator();
                while (it.hasNext()) {
                    if (!oO00OO0O.o00oo0Oo(charSequence.charAt(((o0O0o0) it).nextInt()))) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (!z) {
                return false;
            }
        }
        return true;
    }

    @o00oo00O
    public static final String o0oOo0O0(int[] iArr, int i, int i2) {
        o0ooO.o00oo0O0(iArr, "codePoints");
        return new String(iArr, i, i2);
    }

    @o00oo00O
    public static final String oo0oO0(o0OOO0O o0ooo0o, String str, Object... objArr) {
        o0ooO.o00oo0O0(o0ooo0o, "<this>");
        o0ooO.o00oo0O0(str, "format");
        o0ooO.o00oo0O0(objArr, "args");
        String format = String.format(str, Arrays.copyOf(objArr, objArr.length));
        o0ooO.o00oo0OO(format, "format(format, *args)");
        return format;
    }

    @o00oo00O
    public static final boolean oo0oOOo(String str, StringBuffer stringBuffer) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(stringBuffer, "stringBuilder");
        return str.contentEquals(stringBuffer);
    }

    @o00oo(hiddenSince = "1.4")
    @o00oo00O
    @o0O0o(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    public static final /* synthetic */ String oo0ooO(o0OOO0O o0ooo0o, Locale locale, String str, Object... objArr) {
        o0ooO.o00oo0O0(o0ooo0o, "<this>");
        o0ooO.o00oo0O0(locale, "locale");
        o0ooO.o00oo0O0(str, "format");
        o0ooO.o00oo0O0(objArr, "args");
        String format = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        o0ooO.o00oo0OO(format, "format(locale, format, *args)");
        return format;
    }

    @o00oo00O
    public static final int oooOO0(String str, int i) {
        o0ooO.o00oo0O0(str, "<this>");
        return str.codePointBefore(i);
    }
}
