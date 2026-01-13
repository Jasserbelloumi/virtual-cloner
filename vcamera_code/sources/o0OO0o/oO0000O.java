package o0OO0o;
@o0OOOO0o.o00oo0OO(name = "UNumbersKt")
/* loaded from: classes.dex */
public final class oO0000O {
    @oO0Oo0oo(markerClass = {o0OoOoOo.class, o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final int o00oOOo0(byte b) {
        return Integer.numberOfLeadingZeros(b & 255) - 24;
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class, o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final int o00oOOoO(long j) {
        return Long.numberOfLeadingZeros(j);
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class, o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final int o00oOo00(int i) {
        return Integer.numberOfLeadingZeros(i);
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class, o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final int o00oOo0O(byte b) {
        return Integer.bitCount(o0OOOO.o00oOooo(b & 255));
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class, o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final int o00oOo0o(long j) {
        return Long.bitCount(j);
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class, o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final int o00oOoO(short s) {
        return Integer.bitCount(o0OOOO.o00oOooo(s & oO0000Oo.f13232o00oo0o0));
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class, o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final int o00oOoO0(int i) {
        return Integer.bitCount(i);
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class, o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final int o00oOoOO(byte b) {
        return Integer.numberOfTrailingZeros(b | 256);
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class, o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final int o00oOoOo(long j) {
        return Long.numberOfTrailingZeros(j);
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class, o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final int o00oOoo0(int i) {
        return Integer.numberOfTrailingZeros(i);
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class, o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final int o00oOooO(short s) {
        return Integer.numberOfLeadingZeros(s & oO0000Oo.f13232o00oo0o0) - 16;
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class, o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final int o00oOooo(short s) {
        return Integer.numberOfTrailingZeros(s | oO0000Oo.f13230o00oo0Oo);
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class, o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final int o00oo(int i) {
        return o0OOOO.o00oOooo(Integer.highestOneBit(i));
    }

    @oO0Oo0oo(markerClass = {o0O000.class, o0OoOoOo.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.6")
    public static final byte o00oo0(byte b, int i) {
        return o0OOO0O.o00oOooo(o0O0OOOo.o0O0Ooo0(b, i));
    }

    @oO0Oo0oo(markerClass = {o0O000.class, o0OoOoOo.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.6")
    public static final long o00oo00O(long j, int i) {
        return o0oo0000.o00oOooo(Long.rotateLeft(j, i));
    }

    @oO0Oo0oo(markerClass = {o0O000.class, o0OoOoOo.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.6")
    public static final long o00oo0O(long j, int i) {
        return o0oo0000.o00oOooo(Long.rotateRight(j, i));
    }

    @oO0Oo0oo(markerClass = {o0O000.class, o0OoOoOo.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.6")
    public static final short o00oo0O0(short s, int i) {
        return oO0000Oo.o00oOooo(o0O0OOOo.o0O0Ooo(s, i));
    }

    @oO0Oo0oo(markerClass = {o0O000.class, o0OoOoOo.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.6")
    public static final int o00oo0OO(int i, int i2) {
        return o0OOOO.o00oOooo(Integer.rotateLeft(i, i2));
    }

    @oO0Oo0oo(markerClass = {o0O000.class, o0OoOoOo.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.6")
    public static final byte o00oo0Oo(byte b, int i) {
        return o0OOO0O.o00oOooo(o0O0OOOo.o0O0OooO(b, i));
    }

    @oO0Oo0oo(markerClass = {o0O000.class, o0OoOoOo.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.6")
    public static final short o00oo0o(short s, int i) {
        return oO0000Oo.o00oOooo(o0O0OOOo.o0O0o000(s, i));
    }

    @oO0Oo0oo(markerClass = {o0O000.class, o0OoOoOo.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.6")
    public static final int o00oo0o0(int i, int i2) {
        return o0OOOO.o00oOooo(Integer.rotateRight(i, i2));
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class, o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final byte o00oo0oO(byte b) {
        return o0OOO0O.o00oOooo((byte) Integer.highestOneBit(b & 255));
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class, o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final short o00ooO(short s) {
        return oO0000Oo.o00oOooo((short) Integer.lowestOneBit(s & oO0000Oo.f13232o00oo0o0));
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class, o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final byte o00ooO0(byte b) {
        return o0OOO0O.o00oOooo((byte) Integer.lowestOneBit(b & 255));
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class, o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final short o00ooO00(short s) {
        return oO0000Oo.o00oOooo((short) Integer.highestOneBit(s & oO0000Oo.f13232o00oo0o0));
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class, o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final long o00ooO0O(long j) {
        return o0oo0000.o00oOooo(Long.lowestOneBit(j));
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class, o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final int o00ooO0o(int i) {
        return o0OOOO.o00oOooo(Integer.lowestOneBit(i));
    }

    @oO0Oo0oo(markerClass = {o0OoOoOo.class, o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.5")
    public static final long o0O0o(long j) {
        return o0oo0000.o00oOooo(Long.highestOneBit(j));
    }
}
