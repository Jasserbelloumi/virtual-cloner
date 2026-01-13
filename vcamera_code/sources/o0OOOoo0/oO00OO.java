package o0OOOoo0;

import o00ooO0.o00oOoO;
import o0O00Oo.o0oO0Ooo;
import o0OO0o.o0O000;
import o0OO0o.o0OO00o0;
import o0OO0o.oO0Oo0oo;
import o0OOO0OO.o00oo00O;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import o0OOOo0o.o0O00O;
import o0OOOo0o.o0O0O0Oo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOO00({"SMAP\nChar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Char.kt\nkotlin/text/CharsKt__CharKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,344:1\n1#2:345\n*E\n"})
/* loaded from: classes3.dex */
public class oO00OO extends oO00OO0O {
    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.5")
    public static final char o00ooOO(int i) {
        if (new o0O0O0Oo(0, 9).o00oOoo0(i)) {
            return (char) (i + 48);
        }
        throw new IllegalArgumentException(o00oOoO.o00oOOo0("Int ", i, " is not a decimal digit"));
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.5")
    public static final char o00ooOOo(int i, int i2) {
        if (new o0O0O0Oo(2, 36).o00oOoo0(i2)) {
            if (i < 0 || i >= i2) {
                throw new IllegalArgumentException(o0oO0Ooo.o00oOOo0("Digit ", i, " does not represent a valid digit in radix ", i2));
            }
            return (char) (i < 10 ? i + 48 : ((char) (i + 65)) - '\n');
        }
        throw new IllegalArgumentException(o00oOoO.o00oOOo0("Invalid radix: ", i2, ". Valid radix values are in range 2..36"));
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.5")
    public static final int o00ooOo(char c, int i) {
        Integer o00ooOoo2 = o00ooOoo(c, i);
        if (o00ooOoo2 != null) {
            return o00ooOoo2.intValue();
        }
        throw new IllegalArgumentException("Char " + c + " is not a digit in the given radix=" + i);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.5")
    public static final int o00ooOo0(char c) {
        int digit = Character.digit((int) c, 10);
        if (digit >= 0) {
            return digit;
        }
        throw new IllegalArgumentException("Char " + c + " is not a decimal digit");
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.5")
    @Nullable
    public static final Integer o00ooOoO(char c) {
        Integer valueOf = Integer.valueOf(Character.digit((int) c, 10));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.5")
    @Nullable
    public static final Integer o00ooOoo(char c, int i) {
        oO00OO0O.o00oOOo0(i);
        Integer valueOf = Integer.valueOf(Character.digit((int) c, i));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    public static /* synthetic */ boolean o00ooo0(char c, char c2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return o00ooo00(c, c2, z);
    }

    public static final boolean o00ooo00(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (z) {
            char upperCase = Character.toUpperCase(c);
            char upperCase2 = Character.toUpperCase(c2);
            return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
        }
        return false;
    }

    public static final boolean o00ooo0O(char c) {
        return new o0O00O((char) 55296, (char) 57343).o00oOoo0(c);
    }

    @o00oo00O
    public static final String o00ooo0o(char c, String str) {
        o0ooO.o00oo0O0(str, "other");
        return c + str;
    }

    @o0OO00o0(version = "1.5")
    @NotNull
    public static final String o00oooO(char c) {
        return oOo0o0oO.o00oOOo0(c);
    }
}
