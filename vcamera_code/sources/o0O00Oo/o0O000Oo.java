package o0O00Oo;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o0O00Oo.o0OoOoOo;
/* loaded from: classes.dex */
public final class o0O000Oo extends o0O00O {

    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends o00oo0 {
        public o00oOOo0 o00oOo0o(int i, int i2, ByteBuffer byteBuffer) {
            o00oOOoO(i, i2, byteBuffer);
            return this;
        }

        public o0O000Oo o00oOoO(o0O000Oo o0o000oo, int i) {
            int o00oOOo02 = o00oOOo0(i);
            o0o000oo.o00oOoO0(this.f11055o00oOooO.getInt(o00oOOo02) + o00oOOo02, this.f11055o00oOooO);
            return o0o000oo;
        }

        public o0O000Oo o00oOoO0(int i) {
            return o00oOoO(new o0O000Oo(), i);
        }
    }

    public static void o00oo0oO() {
    }

    public static int o00ooO(o00ooO o00ooo, int[] iArr) {
        o00ooo.o0O00(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            o00ooo.o00oo0(iArr[length]);
        }
        return o00ooo.o00ooOOo();
    }

    public static void o00ooO0(o00ooO o00ooo, int i) {
        o00ooo.o00oo0OO(1, i, 0);
    }

    public static int o00ooO00(int i, ByteBuffer byteBuffer) {
        return byteBuffer.getInt(i) + i;
    }

    public static void o00ooO0O(o00ooO o00ooo, int i) {
        o00ooo.o00oo0OO(2, i, 0);
    }

    public static void o00ooO0o(o00ooO o00ooo, int i) {
        o00ooo.o00oOoo0(0, i, 0);
    }

    public static int o00ooOO(o00ooO o00ooo) {
        return o00ooo.o00ooOO();
    }

    public static int o00ooOO0(o00ooO o00ooo, int i, int i2, int i3) {
        o00ooo.o0O000oo(3);
        o00ooO0O(o00ooo, i3);
        o00ooO0(o00ooo, i2);
        o00ooo.o00oOoo0(0, i, 0);
        return o00ooo.o00ooOO();
    }

    public static void o00ooOOo(o00ooO o00ooo, int i) {
        o00ooo.o00ooOo0(i);
    }

    public static o0O000Oo o00ooOo(ByteBuffer byteBuffer) {
        return o00ooOoO(byteBuffer, new o0O000Oo());
    }

    public static void o00ooOo0(o00ooO o00ooo, int i) {
        o00ooo.o00ooo00(i);
    }

    public static o0O000Oo o00ooOoO(ByteBuffer byteBuffer, o0O000Oo o0o000oo) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        o0o000oo.o00oOoO0(byteBuffer.position() + byteBuffer.getInt(byteBuffer.position()), byteBuffer);
        return o0o000oo;
    }

    public static void o00oooo(o00ooO o00ooo) {
        o00ooo.o0O000oo(3);
    }

    public static void o00oooo0(o00ooO o00ooo, int i) {
        o00ooo.o0O00(4, i, 4);
    }

    public void o00oo(int i, ByteBuffer byteBuffer) {
        o00oOoO0(i, byteBuffer);
    }

    public o0OoOoOo o00ooOoo(int i) {
        return o00ooo00(new o0OoOoOo(), i);
    }

    public int o00ooo0() {
        int o00oOooO2 = o00oOooO(6);
        if (o00oOooO2 != 0) {
            return o00oo0OO(o00oOooO2);
        }
        return 0;
    }

    public o0OoOoOo o00ooo00(o0OoOoOo o0oooooo, int i) {
        int o00oOooO2 = o00oOooO(6);
        if (o00oOooO2 != 0) {
            o0oooooo.o00oOoO0(o00oOOoO((i * 4) + o00oOooo(o00oOooO2)), this.f11102o00oOOoO);
            return o0oooooo;
        }
        return null;
    }

    public o0OoOoOo.o00oOOo0 o00ooo0O() {
        return o00ooo0o(new o0OoOoOo.o00oOOo0());
    }

    public o0OoOoOo.o00oOOo0 o00ooo0o(o0OoOoOo.o00oOOo0 o00oooo02) {
        int o00oOooO2 = o00oOooO(6);
        if (o00oOooO2 != 0) {
            o00oooo02.o00oOOoO(o00oOooo(o00oOooO2), 4, this.f11102o00oOOoO);
            return o00oooo02;
        }
        return null;
    }

    public String o00oooO() {
        int o00oOooO2 = o00oOooO(8);
        if (o00oOooO2 != 0) {
            return o00oOoO(o00oOooO2 + this.f11101o00oOOo0);
        }
        return null;
    }

    public ByteBuffer o00oooOO() {
        return o00oo00O(8, 1);
    }

    public ByteBuffer o00oooOo(ByteBuffer byteBuffer) {
        return o00oo0(byteBuffer, 8, 1);
    }

    public int o00ooooO() {
        int o00oOooO2 = o00oOooO(4);
        if (o00oOooO2 != 0) {
            return this.f11102o00oOOoO.getInt(o00oOooO2 + this.f11101o00oOOo0);
        }
        return 0;
    }

    public o0O000Oo o0O0o(int i, ByteBuffer byteBuffer) {
        o00oOoO0(i, byteBuffer);
        return this;
    }
}
