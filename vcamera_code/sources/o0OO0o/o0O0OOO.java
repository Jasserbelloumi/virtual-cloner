package o0OO0o;
/* loaded from: classes.dex */
public class o0O0OOO extends o0O0OOO0 {
    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final int o0O00o(int i) {
        return Integer.bitCount(i);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final int o0O00o0O(int i) {
        return Integer.numberOfLeadingZeros(i);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final int o0O00o0o(long j) {
        return Long.numberOfLeadingZeros(j);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final int o0O00oO0(long j) {
        return Long.bitCount(j);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final int o0O0O0O(int i) {
        return Integer.numberOfTrailingZeros(i);
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.2")
    public static final float o0O0O0Oo(o0OOOOO0.o0O00O o0o00o, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o, "<this>");
        return Float.intBitsToFloat(i);
    }

    @o0OOO0OO.o00oo00O
    public static final boolean o0O0O0o(float f) {
        return (Float.isInfinite(f) || Float.isNaN(f)) ? false : true;
    }

    @o0OOO0OO.o00oo00O
    public static final boolean o0O0O0o0(double d) {
        return (Double.isInfinite(d) || Double.isNaN(d)) ? false : true;
    }

    @o0OOO0OO.o00oo00O
    public static final boolean o0O0O0oO(double d) {
        return Double.isInfinite(d);
    }

    @o0OOO0OO.o00oo00O
    public static final boolean o0O0O0oo(float f) {
        return Float.isInfinite(f);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.6")
    public static final long o0O0OO(long j, int i) {
        return Long.rotateLeft(j, i);
    }

    @o0OOO0OO.o00oo00O
    public static final boolean o0O0OO0(float f) {
        return Float.isNaN(f);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.6")
    public static final int o0O0OO0O(int i, int i2) {
        return Integer.rotateLeft(i, i2);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.6")
    public static final long o0O0OOO(long j, int i) {
        return Long.rotateRight(j, i);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.6")
    public static final int o0O0OOO0(int i, int i2) {
        return Integer.rotateRight(i, i2);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final int o0O0OOOo(int i) {
        return Integer.highestOneBit(i);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final long o0O0OOo(long j) {
        return Long.highestOneBit(j);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final int o0O0OOoO(int i) {
        return Integer.lowestOneBit(i);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final long o0O0OOoo(long j) {
        return Long.lowestOneBit(j);
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.2")
    public static final long o0O0Oo0(double d) {
        return Double.doubleToLongBits(d);
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.2")
    public static final int o0O0Oo0O(float f) {
        return Float.floatToRawIntBits(f);
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.2")
    public static final long o0O0Oo0o(double d) {
        return Double.doubleToRawLongBits(d);
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.2")
    public static final double o0O0oo0o(o0OOOOO0.o0O00O0 o0o00o0, long j) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o0, "<this>");
        return Double.longBitsToDouble(j);
    }

    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.2")
    public static final int o0OooO0(float f) {
        return Float.floatToIntBits(f);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final int o0oO0O0o(long j) {
        return Long.numberOfTrailingZeros(j);
    }

    @o0OOO0OO.o00oo00O
    public static final boolean o0ooO(double d) {
        return Double.isNaN(d);
    }
}
