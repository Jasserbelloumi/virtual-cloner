package o0OO0o;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
/* loaded from: classes.dex */
public class o0O0OO0 {
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.2")
    public static final BigDecimal o00oOOo0(BigDecimal bigDecimal) {
        o0OOOOO0.o0ooO.o00oo0O0(bigDecimal, "<this>");
        BigDecimal subtract = bigDecimal.subtract(BigDecimal.ONE);
        o0OOOOO0.o0ooO.o00oo0OO(subtract, "this.subtract(BigDecimal.ONE)");
        return subtract;
    }

    @o0OOO0OO.o00oo00O
    public static final BigDecimal o00oOOoO(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        o0OOOOO0.o0ooO.o00oo0O0(bigDecimal, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(bigDecimal2, "other");
        BigDecimal divide = bigDecimal.divide(bigDecimal2, RoundingMode.HALF_EVEN);
        o0OOOOO0.o0ooO.o00oo0OO(divide, "this.divide(other, RoundingMode.HALF_EVEN)");
        return divide;
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.2")
    public static final BigDecimal o00oOo00(BigDecimal bigDecimal) {
        o0OOOOO0.o0ooO.o00oo0O0(bigDecimal, "<this>");
        BigDecimal add = bigDecimal.add(BigDecimal.ONE);
        o0OOOOO0.o0ooO.o00oo0OO(add, "this.add(BigDecimal.ONE)");
        return add;
    }

    @o0OOO0OO.o00oo00O
    public static final BigDecimal o00oOo0O(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        o0OOOOO0.o0ooO.o00oo0O0(bigDecimal, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(bigDecimal2, "other");
        BigDecimal add = bigDecimal.add(bigDecimal2);
        o0OOOOO0.o0ooO.o00oo0OO(add, "this.add(other)");
        return add;
    }

    @o0OOO0OO.o00oo00O
    public static final BigDecimal o00oOo0o(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        o0OOOOO0.o0ooO.o00oo0O0(bigDecimal, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(bigDecimal2, "other");
        BigDecimal remainder = bigDecimal.remainder(bigDecimal2);
        o0OOOOO0.o0ooO.o00oo0OO(remainder, "this.remainder(other)");
        return remainder;
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.2")
    public static final BigDecimal o00oOoO(double d) {
        return new BigDecimal(String.valueOf(d));
    }

    @o0OOO0OO.o00oo00O
    public static final BigDecimal o00oOoO0(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        o0OOOOO0.o0ooO.o00oo0O0(bigDecimal, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(bigDecimal2, "other");
        BigDecimal multiply = bigDecimal.multiply(bigDecimal2);
        o0OOOOO0.o0ooO.o00oo0OO(multiply, "this.multiply(other)");
        return multiply;
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.2")
    public static final BigDecimal o00oOoOO(double d, MathContext mathContext) {
        o0OOOOO0.o0ooO.o00oo0O0(mathContext, "mathContext");
        return new BigDecimal(String.valueOf(d), mathContext);
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.2")
    public static final BigDecimal o00oOoOo(float f) {
        return new BigDecimal(String.valueOf(f));
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.2")
    public static final BigDecimal o00oOoo0(float f, MathContext mathContext) {
        o0OOOOO0.o0ooO.o00oo0O0(mathContext, "mathContext");
        return new BigDecimal(String.valueOf(f), mathContext);
    }

    @o0OOO0OO.o00oo00O
    public static final BigDecimal o00oOooO(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        o0OOOOO0.o0ooO.o00oo0O0(bigDecimal, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(bigDecimal2, "other");
        BigDecimal subtract = bigDecimal.subtract(bigDecimal2);
        o0OOOOO0.o0ooO.o00oo0OO(subtract, "this.subtract(other)");
        return subtract;
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.2")
    public static final BigDecimal o00oOooo(int i) {
        BigDecimal valueOf = BigDecimal.valueOf(i);
        o0OOOOO0.o0ooO.o00oo0OO(valueOf, "valueOf(this.toLong())");
        return valueOf;
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.2")
    public static final BigDecimal o00oo0(long j) {
        BigDecimal valueOf = BigDecimal.valueOf(j);
        o0OOOOO0.o0ooO.o00oo0OO(valueOf, "valueOf(this)");
        return valueOf;
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.2")
    public static final BigDecimal o00oo00O(int i, MathContext mathContext) {
        o0OOOOO0.o0ooO.o00oo0O0(mathContext, "mathContext");
        return new BigDecimal(i, mathContext);
    }

    @o0OOO0OO.o00oo00O
    public static final BigDecimal o00oo0O0(BigDecimal bigDecimal) {
        o0OOOOO0.o0ooO.o00oo0O0(bigDecimal, "<this>");
        BigDecimal negate = bigDecimal.negate();
        o0OOOOO0.o0ooO.o00oo0OO(negate, "this.negate()");
        return negate;
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.2")
    public static final BigDecimal o00oo0OO(long j, MathContext mathContext) {
        o0OOOOO0.o0ooO.o00oo0O0(mathContext, "mathContext");
        return new BigDecimal(j, mathContext);
    }
}
