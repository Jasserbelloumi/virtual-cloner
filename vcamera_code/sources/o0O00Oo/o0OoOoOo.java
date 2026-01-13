package o0O00Oo;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public final class o0OoOoOo extends o0O00O {

    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends o00oo0 {
        public o00oOOo0 o00oOo0o(int i, int i2, ByteBuffer byteBuffer) {
            o00oOOoO(i, i2, byteBuffer);
            return this;
        }

        public o0OoOoOo o00oOoO(o0OoOoOo o0oooooo, int i) {
            int o00oOOo02 = o00oOOo0(i);
            o0oooooo.o00oOoO0(this.f11055o00oOooO.getInt(o00oOOo02) + o00oOOo02, this.f11055o00oOooO);
            return o0oooooo;
        }

        public o0OoOoOo o00oOoO0(int i) {
            return o00oOoO(new o0OoOoOo(), i);
        }
    }

    public static void o00oo0oO() {
    }

    public static void o00ooO(o00ooO o00ooo, short s) {
        o00ooo.o00oo0O0(5, s, 0);
    }

    public static void o00ooO0(o00ooO o00ooo, int i) {
        o00ooo.o00oo0OO(6, i, 0);
    }

    public static int o00ooO00(int i, ByteBuffer byteBuffer) {
        return byteBuffer.getInt(i) + i;
    }

    public static void o00ooO0O(o00ooO o00ooo, short s) {
        o00ooo.o00oo0O0(3, s, 0);
    }

    public static void o00ooO0o(o00ooO o00ooo, boolean z) {
        o00ooo.o00oOOoO(1, z, false);
    }

    public static void o00ooOO(o00ooO o00ooo, short s) {
        o00ooo.o00oo0O0(2, s, 0);
    }

    public static void o00ooOO0(o00ooO o00ooo, int i) {
        o00ooo.o00oOoo0(0, i, 0);
    }

    public static void o00ooOOo(o00ooO o00ooo, short s) {
        o00ooo.o00oo0O0(4, s, 0);
    }

    public static int o00ooo0o(o00ooO o00ooo, int[] iArr) {
        o00ooo.o0O00(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            o00ooo.o00oOoOo(iArr[length]);
        }
        return o00ooo.o00ooOOo();
    }

    public static int o00oooO(o00ooO o00ooo, int i, boolean z, short s, short s2, short s3, short s4, int i2) {
        o00ooo.o0O000oo(7);
        o00ooO0(o00ooo, i2);
        o00ooo.o00oOoo0(0, i, 0);
        o00ooO(o00ooo, s4);
        o00ooOOo(o00ooo, s3);
        o00ooO0O(o00ooo, s2);
        o00ooOO(o00ooo, s);
        o00ooO0o(o00ooo, z);
        return o00ooo.o00ooOO();
    }

    public static int o00oooOo(o00ooO o00ooo) {
        return o00ooo.o00ooOO();
    }

    public static o0OoOoOo o00oooo(ByteBuffer byteBuffer, o0OoOoOo o0oooooo) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        o0oooooo.o00oOoO0(byteBuffer.position() + byteBuffer.getInt(byteBuffer.position()), byteBuffer);
        return o0oooooo;
    }

    public static o0OoOoOo o00oooo0(ByteBuffer byteBuffer) {
        return o00oooo(byteBuffer, new o0OoOoOo());
    }

    public static void o0O00000(o00ooO o00ooo, int i) {
        o00ooo.o0O00(4, i, 4);
    }

    public static void o0O0000O(o00ooO o00ooo) {
        o00ooo.o0O000oo(7);
    }

    public short o0() {
        int o00oOooO2 = o00oOooO(8);
        if (o00oOooO2 != 0) {
            return this.f11102o00oOOoO.getShort(o00oOooO2 + this.f11101o00oOOo0);
        }
        return (short) 0;
    }

    public void o00oo(int i, ByteBuffer byteBuffer) {
        o00oOoO0(i, byteBuffer);
    }

    public ByteBuffer o00ooOo() {
        return o00oo00O(16, 4);
    }

    public int o00ooOo0(int i) {
        int o00oOooO2 = o00oOooO(16);
        if (o00oOooO2 != 0) {
            return this.f11102o00oOOoO.getInt((i * 4) + o00oOooo(o00oOooO2));
        }
        return 0;
    }

    public ByteBuffer o00ooOoO(ByteBuffer byteBuffer) {
        return o00oo0(byteBuffer, 16, 4);
    }

    public int o00ooOoo() {
        int o00oOooO2 = o00oOooO(16);
        if (o00oOooO2 != 0) {
            return o00oo0OO(o00oOooO2);
        }
        return 0;
    }

    public o0O000 o00ooo0(o0O000 o0o000) {
        int o00oOooO2 = o00oOooO(16);
        if (o00oOooO2 != 0) {
            o0o000.o00oOOoO(o00oOooo(o00oOooO2), 4, this.f11102o00oOOoO);
            return o0o000;
        }
        return null;
    }

    public o0O000 o00ooo00() {
        return o00ooo0(new o0O000());
    }

    public short o00ooo0O() {
        int o00oOooO2 = o00oOooO(10);
        if (o00oOooO2 != 0) {
            return this.f11102o00oOOoO.getShort(o00oOooO2 + this.f11101o00oOOo0);
        }
        return (short) 0;
    }

    public boolean o00oooOO() {
        int o00oOooO2 = o00oOooO(6);
        return (o00oOooO2 == 0 || this.f11102o00oOOoO.get(o00oOooO2 + this.f11101o00oOOo0) == 0) ? false : true;
    }

    public short o00ooooO() {
        int o00oOooO2 = o00oOooO(14);
        if (o00oOooO2 != 0) {
            return this.f11102o00oOOoO.getShort(o00oOooO2 + this.f11101o00oOOo0);
        }
        return (short) 0;
    }

    public int o00ooooo() {
        int o00oOooO2 = o00oOooO(4);
        if (o00oOooO2 != 0) {
            return this.f11102o00oOOoO.getInt(o00oOooO2 + this.f11101o00oOOo0);
        }
        return 0;
    }

    public short o0O0000o() {
        int o00oOooO2 = o00oOooO(12);
        if (o00oOooO2 != 0) {
            return this.f11102o00oOOoO.getShort(o00oOooO2 + this.f11101o00oOOo0);
        }
        return (short) 0;
    }

    public o0OoOoOo o0O0o(int i, ByteBuffer byteBuffer) {
        o00oOoO0(i, byteBuffer);
        return this;
    }
}
