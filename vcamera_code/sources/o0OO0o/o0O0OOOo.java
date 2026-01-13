package o0OO0o;
/* loaded from: classes.dex */
public class o0O0OOOo extends o0O0OOO {
    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final int o0O0Oo(byte b) {
        return Integer.numberOfLeadingZeros(b & 255) - 24;
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final int o0O0OoO(byte b) {
        return Integer.numberOfTrailingZeros(b | 256);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final int o0O0OoO0(byte b) {
        return Integer.bitCount(b & 255);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final int o0O0OoOo(short s) {
        return Integer.numberOfTrailingZeros(s | oO0000Oo.f13230o00oo0Oo);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.6")
    public static final short o0O0Ooo(short s, int i) {
        int i2 = i & 15;
        return (short) (((s & 65535) >>> (16 - i2)) | (s << i2));
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.6")
    public static final byte o0O0Ooo0(byte b, int i) {
        int i2 = i & 7;
        return (byte) (((b & 255) >>> (8 - i2)) | (b << i2));
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.6")
    public static final byte o0O0OooO(byte b, int i) {
        int i2 = i & 7;
        return (byte) (((b & 255) >>> i2) | (b << (8 - i2)));
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final int o0O0Oooo(short s) {
        return Integer.numberOfLeadingZeros(s & oO0000Oo.f13232o00oo0o0) - 16;
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final short o0O0o0(short s) {
        return (short) Integer.lowestOneBit(s);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final byte o0O0o00(byte b) {
        return (byte) Integer.highestOneBit(b & 255);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.6")
    public static final short o0O0o000(short s, int i) {
        int i2 = i & 15;
        return (short) (((s & 65535) >>> i2) | (s << (16 - i2)));
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final short o0O0o00O(short s) {
        return (short) Integer.highestOneBit(s & oO0000Oo.f13232o00oo0o0);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final byte o0O0o00o(byte b) {
        return (byte) Integer.lowestOneBit(b);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OOO0OO.o00oo00O
    @o0OO00o0(version = "1.4")
    public static final int oo0OOoo(short s) {
        return Integer.bitCount(s & oO0000Oo.f13232o00oo0o0);
    }
}
