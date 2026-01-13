package o0OO0o;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
/* loaded from: classes.dex */
public class o0O0OO extends o0O0OO0 {
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.2")
    public static final BigInteger o00oo(BigInteger bigInteger, BigInteger bigInteger2) {
        o0OOOOO0.o0ooO.o00oo0O0(bigInteger, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(bigInteger2, "other");
        BigInteger or = bigInteger.or(bigInteger2);
        o0OOOOO0.o0ooO.o00oo0OO(or, "this.or(other)");
        return or;
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.2")
    public static final BigInteger o00oo0O(BigInteger bigInteger, BigInteger bigInteger2) {
        o0OOOOO0.o0ooO.o00oo0O0(bigInteger, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(bigInteger2, "other");
        BigInteger and = bigInteger.and(bigInteger2);
        o0OOOOO0.o0ooO.o00oo0OO(and, "this.and(other)");
        return and;
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.2")
    public static final BigInteger o00oo0Oo(BigInteger bigInteger) {
        o0OOOOO0.o0ooO.o00oo0O0(bigInteger, "<this>");
        BigInteger subtract = bigInteger.subtract(BigInteger.ONE);
        o0OOOOO0.o0ooO.o00oo0OO(subtract, "this.subtract(BigInteger.ONE)");
        return subtract;
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.2")
    public static final BigInteger o00oo0o(BigInteger bigInteger) {
        o0OOOOO0.o0ooO.o00oo0O0(bigInteger, "<this>");
        BigInteger add = bigInteger.add(BigInteger.ONE);
        o0OOOOO0.o0ooO.o00oo0OO(add, "this.add(BigInteger.ONE)");
        return add;
    }

    @o0OOO0OO.o00oo00O
    public static final BigInteger o00oo0o0(BigInteger bigInteger, BigInteger bigInteger2) {
        o0OOOOO0.o0ooO.o00oo0O0(bigInteger, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(bigInteger2, "other");
        BigInteger divide = bigInteger.divide(bigInteger2);
        o0OOOOO0.o0ooO.o00oo0OO(divide, "this.divide(other)");
        return divide;
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.2")
    public static final BigInteger o00oo0oO(BigInteger bigInteger) {
        o0OOOOO0.o0ooO.o00oo0O0(bigInteger, "<this>");
        BigInteger not = bigInteger.not();
        o0OOOOO0.o0ooO.o00oo0OO(not, "this.not()");
        return not;
    }

    @o0OOO0OO.o00oo00O
    public static final BigInteger o00ooO(BigInteger bigInteger, BigInteger bigInteger2) {
        o0OOOOO0.o0ooO.o00oo0O0(bigInteger, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(bigInteger2, "other");
        BigInteger multiply = bigInteger.multiply(bigInteger2);
        o0OOOOO0.o0ooO.o00oo0OO(multiply, "this.multiply(other)");
        return multiply;
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.1")
    public static final BigInteger o00ooO0(BigInteger bigInteger, BigInteger bigInteger2) {
        o0OOOOO0.o0ooO.o00oo0O0(bigInteger, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(bigInteger2, "other");
        BigInteger remainder = bigInteger.remainder(bigInteger2);
        o0OOOOO0.o0ooO.o00oo0OO(remainder, "this.remainder(other)");
        return remainder;
    }

    @o0OOO0OO.o00oo00O
    public static final BigInteger o00ooO00(BigInteger bigInteger, BigInteger bigInteger2) {
        o0OOOOO0.o0ooO.o00oo0O0(bigInteger, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(bigInteger2, "other");
        BigInteger add = bigInteger.add(bigInteger2);
        o0OOOOO0.o0ooO.o00oo0OO(add, "this.add(other)");
        return add;
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.2")
    public static final BigInteger o00ooO0O(BigInteger bigInteger, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(bigInteger, "<this>");
        BigInteger shiftLeft = bigInteger.shiftLeft(i);
        o0OOOOO0.o0ooO.o00oo0OO(shiftLeft, "this.shiftLeft(n)");
        return shiftLeft;
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.2")
    public static final BigInteger o00ooO0o(BigInteger bigInteger, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(bigInteger, "<this>");
        BigInteger shiftRight = bigInteger.shiftRight(i);
        o0OOOOO0.o0ooO.o00oo0OO(shiftRight, "this.shiftRight(n)");
        return shiftRight;
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.2")
    public static final BigDecimal o00ooOO(BigInteger bigInteger, int i, MathContext mathContext) {
        o0OOOOO0.o0ooO.o00oo0O0(bigInteger, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i, mathContext);
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.2")
    public static final BigDecimal o00ooOO0(BigInteger bigInteger) {
        o0OOOOO0.o0ooO.o00oo0O0(bigInteger, "<this>");
        return new BigDecimal(bigInteger);
    }

    public static /* synthetic */ BigDecimal o00ooOOo(BigInteger bigInteger, int i, MathContext mathContext, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            mathContext = MathContext.UNLIMITED;
            o0OOOOO0.o0ooO.o00oo0OO(mathContext, "UNLIMITED");
        }
        o0OOOOO0.o0ooO.o00oo0O0(bigInteger, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i, mathContext);
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.2")
    public static final BigInteger o00ooOo(long j) {
        BigInteger valueOf = BigInteger.valueOf(j);
        o0OOOOO0.o0ooO.o00oo0OO(valueOf, "valueOf(this)");
        return valueOf;
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.2")
    public static final BigInteger o00ooOo0(int i) {
        BigInteger valueOf = BigInteger.valueOf(i);
        o0OOOOO0.o0ooO.o00oo0OO(valueOf, "valueOf(this.toLong())");
        return valueOf;
    }

    @o0OOO0OO.o00oo00O
    public static final BigInteger o00ooOoO(BigInteger bigInteger) {
        o0OOOOO0.o0ooO.o00oo0O0(bigInteger, "<this>");
        BigInteger negate = bigInteger.negate();
        o0OOOOO0.o0ooO.o00oo0OO(negate, "this.negate()");
        return negate;
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.2")
    public static final BigInteger o00ooOoo(BigInteger bigInteger, BigInteger bigInteger2) {
        o0OOOOO0.o0ooO.o00oo0O0(bigInteger, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(bigInteger2, "other");
        BigInteger xor = bigInteger.xor(bigInteger2);
        o0OOOOO0.o0ooO.o00oo0OO(xor, "this.xor(other)");
        return xor;
    }

    @o0OOO0OO.o00oo00O
    public static final BigInteger o0O0o(BigInteger bigInteger, BigInteger bigInteger2) {
        o0OOOOO0.o0ooO.o00oo0O0(bigInteger, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(bigInteger2, "other");
        BigInteger subtract = bigInteger.subtract(bigInteger2);
        o0OOOOO0.o0ooO.o00oo0OO(subtract, "this.subtract(other)");
        return subtract;
    }
}
