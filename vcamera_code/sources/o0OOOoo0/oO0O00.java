package o0OOOoo0;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import o0OO0o.o0O0o;
import o0OO0o.o0OO00o0;
import o0OOO0OO.o00oo00O;
import o0OOOO.o00oo;
import o0OOOO0o.o00oo0OO;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOO00({"SMAP\nStringNumberConversionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n*L\n1#1,283:1\n274#1,7:284\n274#1,7:291\n274#1,7:298\n274#1,7:305\n*S KotlinDebug\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n*L\n151#1:284,7\n158#1:291,7\n238#1:298,7\n249#1:305,7\n*E\n"})
/* loaded from: classes3.dex */
public class oO0O00 extends oO0O000o {
    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final BigDecimal o0O00o(String str) {
        o0ooO.o00oo0O0(str, "<this>");
        return new BigDecimal(str);
    }

    public static final <T> T o0O00o0o(String str, o00oo<? super String, ? extends T> o00ooVar) {
        try {
            if (oOo00ooO.f13901o00oOOoO.matches(str)) {
                return o00ooVar.invoke(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final BigDecimal o0O00oO0(String str, MathContext mathContext) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(mathContext, "mathContext");
        return new BigDecimal(str, mathContext);
    }

    @o0OO00o0(version = "1.2")
    @Nullable
    public static final BigDecimal o0O0O0O(@NotNull String str) {
        o0ooO.o00oo0O0(str, "<this>");
        try {
            if (oOo00ooO.f13901o00oOOoO.matches(str)) {
                return new BigDecimal(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final BigInteger o0O0O0Oo(String str, int i) {
        o0ooO.o00oo0O0(str, "<this>");
        return new BigInteger(str, oO00OO0O.o00oOOo0(i));
    }

    @o0OO00o0(version = "1.2")
    @Nullable
    public static final BigInteger o0O0O0o(@NotNull String str, int i) {
        o0ooO.o00oo0O0(str, "<this>");
        oO00OO0O.o00oOOo0(i);
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                for (int i2 = str.charAt(0) == '-' ? 1 : 0; i2 < length; i2++) {
                    if (Character.digit((int) str.charAt(i2), i) < 0) {
                        return null;
                    }
                }
            } else if (Character.digit((int) str.charAt(0), i) < 0) {
                return null;
            }
            return new BigInteger(str, oO00OO0O.o00oOOo0(i));
        }
        return null;
    }

    @o0OO00o0(version = "1.2")
    @Nullable
    public static final BigInteger o0O0O0o0(@NotNull String str) {
        o0ooO.o00oo0O0(str, "<this>");
        return o0O0O0o(str, 10);
    }

    @o0OO0o.o00oo(hiddenSince = "1.4")
    @o00oo00O
    @o0O0o(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    public static final /* synthetic */ boolean o0O0O0oO(String str) {
        o0ooO.o00oo0O0(str, "<this>");
        return Boolean.parseBoolean(str);
    }

    @o00oo0OO(name = "toBooleanNullable")
    @o00oo00O
    @o0OO00o0(version = "1.4")
    public static final boolean o0O0O0oo(String str) {
        return Boolean.parseBoolean(str);
    }

    @o0OO00o0(version = "1.1")
    @Nullable
    public static final Double o0O0OO(@NotNull String str) {
        o0ooO.o00oo0O0(str, "<this>");
        try {
            if (oOo00ooO.f13901o00oOOoO.matches(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @o00oo00O
    @o0OO00o0(version = "1.1")
    public static final byte o0O0OO0(String str, int i) {
        o0ooO.o00oo0O0(str, "<this>");
        return Byte.parseByte(str, oO00OO0O.o00oOOo0(i));
    }

    @o00oo00O
    public static final double o0O0OO0O(String str) {
        o0ooO.o00oo0O0(str, "<this>");
        return Double.parseDouble(str);
    }

    @o0OO00o0(version = "1.1")
    @Nullable
    public static final Float o0O0OOO(@NotNull String str) {
        o0ooO.o00oo0O0(str, "<this>");
        try {
            if (oOo00ooO.f13901o00oOOoO.matches(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @o00oo00O
    public static final float o0O0OOO0(String str) {
        o0ooO.o00oo0O0(str, "<this>");
        return Float.parseFloat(str);
    }

    @o00oo00O
    public static final int o0O0OOOo(String str) {
        o0ooO.o00oo0O0(str, "<this>");
        return Integer.parseInt(str);
    }

    @o00oo00O
    @o0OO00o0(version = "1.1")
    public static final int o0O0OOo(String str, int i) {
        o0ooO.o00oo0O0(str, "<this>");
        return Integer.parseInt(str, oO00OO0O.o00oOOo0(i));
    }

    @o00oo00O
    public static final long o0O0OOoO(String str) {
        o0ooO.o00oo0O0(str, "<this>");
        return Long.parseLong(str);
    }

    @o00oo00O
    @o0OO00o0(version = "1.1")
    public static final long o0O0OOoo(String str, int i) {
        o0ooO.o00oo0O0(str, "<this>");
        return Long.parseLong(str, oO00OO0O.o00oOOo0(i));
    }

    @o00oo00O
    @o0OO00o0(version = "1.1")
    public static final String o0O0Oo(long j, int i) {
        String l = Long.toString(j, oO00OO0O.o00oOOo0(i));
        o0ooO.o00oo0OO(l, "toString(this, checkRadix(radix))");
        return l;
    }

    @o00oo00O
    @o0OO00o0(version = "1.1")
    public static final short o0O0Oo0(String str, int i) {
        o0ooO.o00oo0O0(str, "<this>");
        return Short.parseShort(str, oO00OO0O.o00oOOo0(i));
    }

    @o00oo00O
    @o0OO00o0(version = "1.1")
    public static final String o0O0Oo0O(byte b, int i) {
        String num = Integer.toString(b, oO00OO0O.o00oOOo0(oO00OO0O.o00oOOo0(i)));
        o0ooO.o00oo0OO(num, "toString(this, checkRadix(radix))");
        return num;
    }

    @o00oo00O
    @o0OO00o0(version = "1.1")
    public static final String o0O0Oo0o(int i, int i2) {
        String num = Integer.toString(i, oO00OO0O.o00oOOo0(i2));
        o0ooO.o00oo0OO(num, "toString(this, checkRadix(radix))");
        return num;
    }

    @o00oo00O
    @o0OO00o0(version = "1.1")
    public static final String o0O0Oooo(short s, int i) {
        String num = Integer.toString(s, oO00OO0O.o00oOOo0(oO00OO0O.o00oOOo0(i)));
        o0ooO.o00oo0OO(num, "toString(this, checkRadix(radix))");
        return num;
    }

    @o00oo00O
    @o0OO00o0(version = "1.2")
    public static final BigInteger o0O0oo0o(String str) {
        o0ooO.o00oo0O0(str, "<this>");
        return new BigInteger(str);
    }

    @o00oo00O
    public static final short o0OooO0(String str) {
        o0ooO.o00oo0O0(str, "<this>");
        return Short.parseShort(str);
    }

    @o0OO00o0(version = "1.2")
    @Nullable
    public static final BigDecimal o0oO0O0o(@NotNull String str, @NotNull MathContext mathContext) {
        o0ooO.o00oo0O0(str, "<this>");
        o0ooO.o00oo0O0(mathContext, "mathContext");
        try {
            if (oOo00ooO.f13901o00oOOoO.matches(str)) {
                return new BigDecimal(str, mathContext);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @o00oo00O
    public static final byte o0ooO(String str) {
        o0ooO.o00oo0O0(str, "<this>");
        return Byte.parseByte(str);
    }
}
