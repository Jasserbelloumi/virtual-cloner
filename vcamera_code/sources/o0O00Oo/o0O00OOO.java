package o0O00Oo;

import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public abstract class o0O00OOO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static o0O00OOO f11110o00oOOo0;

    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        public static void o00oOOo0(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws IllegalArgumentException {
            if (!o00oOo0o(b2)) {
                if ((((b2 + 112) + (b << Ascii.FS)) >> 30) == 0 && !o00oOo0o(b3) && !o00oOo0o(b4)) {
                    int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                    cArr[i] = o00oOo0O(i2);
                    cArr[i + 1] = o00oOoOo(i2);
                    return;
                }
            }
            throw new IllegalArgumentException("Invalid UTF-8");
        }

        public static void o00oOOoO(byte b, char[] cArr, int i) {
            cArr[i] = (char) b;
        }

        public static void o00oOo00(byte b, byte b2, byte b3, char[] cArr, int i) throws IllegalArgumentException {
            if (o00oOo0o(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || o00oOo0o(b3)))) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            cArr[i] = (char) (((b & Ascii.SI) << 12) | ((b2 & 63) << 6) | (b3 & 63));
        }

        public static char o00oOo0O(int i) {
            return (char) ((i >>> 10) + 55232);
        }

        public static boolean o00oOo0o(byte b) {
            return b > -65;
        }

        public static boolean o00oOoO(byte b) {
            return b < -16;
        }

        public static boolean o00oOoO0(byte b) {
            return b >= 0;
        }

        public static boolean o00oOoOO(byte b) {
            return b < -32;
        }

        public static char o00oOoOo(int i) {
            return (char) ((i & 1023) + 56320);
        }

        public static int o00oOoo0(byte b) {
            return b & 63;
        }

        public static void o00oOooO(byte b, byte b2, char[] cArr, int i) throws IllegalArgumentException {
            if (b < -62) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
            }
            if (o00oOo0o(b2)) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            cArr[i] = (char) (((b & Ascii.US) << 6) | (b2 & 63));
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO extends IllegalArgumentException {
        public o00oOOoO(int i, int i2) {
            super(o0oO0Ooo.o00oOOo0("Unpaired surrogate at index ", i, " of ", i2));
        }
    }

    public static void o00oOo0O(o0O00OOO o0o00ooo) {
        f11110o00oOOo0 = o0o00ooo;
    }

    public static o0O00OOO o00oOooO() {
        if (f11110o00oOOo0 == null) {
            f11110o00oOOo0 = new o0O0O0O();
        }
        return f11110o00oOOo0;
    }

    public abstract String o00oOOo0(ByteBuffer byteBuffer, int i, int i2);

    public abstract void o00oOOoO(CharSequence charSequence, ByteBuffer byteBuffer);

    public abstract int o00oOo00(CharSequence charSequence);
}
