package o0O00Oo;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Comparator;
/* loaded from: classes.dex */
public class o0O00O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public int f11101o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public ByteBuffer f11102o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f11103o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public o0O00OOO f11104o00oOo0O = o0O00OOO.o00oOooO();

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f11105o00oOooO;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Comparator<Integer> {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f11107o00oo0O0;

        public o00oOOo0(ByteBuffer byteBuffer) {
            this.f11107o00oo0O0 = byteBuffer;
        }

        @Override // java.util.Comparator
        /* renamed from: o00oOOo0 */
        public int compare(Integer num, Integer num2) {
            return o0O00O.this.o00oo0o0(num, num2, this.f11107o00oo0O0);
        }
    }

    public static boolean o00oOOo0(ByteBuffer byteBuffer, String str) {
        if (str.length() == 4) {
            for (int i = 0; i < 4; i++) {
                if (str.charAt(i) != ((char) byteBuffer.get(byteBuffer.position() + 4 + i))) {
                    return false;
                }
            }
            return true;
        }
        throw new AssertionError("FlatBuffers: file identifier must be length 4");
    }

    public static int o00oOo00(int i, ByteBuffer byteBuffer) {
        return byteBuffer.getInt(i) + i;
    }

    public static int o00oOo0O(int i, int i2, ByteBuffer byteBuffer) {
        int capacity = byteBuffer.capacity() - i2;
        return byteBuffer.getShort((i + capacity) - byteBuffer.getInt(capacity)) + capacity;
    }

    public static String o00oOoOO(int i, ByteBuffer byteBuffer, o0O00OOO o0o00ooo) {
        int i2 = byteBuffer.getInt(i) + i;
        return o0o00ooo.o00oOOo0(byteBuffer, i2 + 4, byteBuffer.getInt(i2));
    }

    public static o0O00O o00oOoo0(o0O00O o0o00o, int i, ByteBuffer byteBuffer) {
        o0o00o.o00oOoO0(byteBuffer.getInt(i) + i, byteBuffer);
        return o0o00o;
    }

    public static int o00oo0O(int i, byte[] bArr, ByteBuffer byteBuffer) {
        int i2 = byteBuffer.getInt(i) + i;
        int i3 = byteBuffer.getInt(i2);
        int length = bArr.length;
        int i4 = i2 + 4;
        int min = Math.min(i3, length);
        for (int i5 = 0; i5 < min; i5++) {
            int i6 = i5 + i4;
            if (byteBuffer.get(i6) != bArr[i5]) {
                return byteBuffer.get(i6) - bArr[i5];
            }
        }
        return i3 - length;
    }

    public static int o00oo0O0(int i, int i2, ByteBuffer byteBuffer) {
        int i3 = byteBuffer.getInt(i) + i;
        int i4 = byteBuffer.getInt(i2) + i2;
        int i5 = byteBuffer.getInt(i3);
        int i6 = byteBuffer.getInt(i4);
        int i7 = i3 + 4;
        int i8 = i4 + 4;
        int min = Math.min(i5, i6);
        for (int i9 = 0; i9 < min; i9++) {
            int i10 = i9 + i7;
            int i11 = i9 + i8;
            if (byteBuffer.get(i10) != byteBuffer.get(i11)) {
                return byteBuffer.get(i10) - byteBuffer.get(i11);
            }
        }
        return i5 - i6;
    }

    public int o00oOOoO(int i) {
        return this.f11102o00oOOoO.getInt(i) + i;
    }

    public void o00oOo0o() {
        o00oOoO0(0, null);
    }

    public String o00oOoO(int i) {
        return o00oOoOO(i, this.f11102o00oOOoO, this.f11104o00oOo0O);
    }

    public void o00oOoO0(int i, ByteBuffer byteBuffer) {
        short s;
        this.f11102o00oOOoO = byteBuffer;
        if (byteBuffer != null) {
            this.f11101o00oOOo0 = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f11103o00oOo00 = i2;
            s = this.f11102o00oOOoO.getShort(i2);
        } else {
            s = 0;
            this.f11101o00oOOo0 = 0;
            this.f11103o00oOo00 = 0;
        }
        this.f11105o00oOooO = s;
    }

    public o0O00O o00oOoOo(o0O00O o0o00o, int i) {
        return o00oOoo0(o0o00o, i, this.f11102o00oOOoO);
    }

    public int o00oOooO(int i) {
        if (i < this.f11105o00oOooO) {
            return this.f11102o00oOOoO.getShort(this.f11103o00oOo00 + i);
        }
        return 0;
    }

    public int o00oOooo(int i) {
        int i2 = i + this.f11101o00oOOo0;
        return this.f11102o00oOOoO.getInt(i2) + i2 + 4;
    }

    public ByteBuffer o00oo0(ByteBuffer byteBuffer, int i, int i2) {
        int o00oOooO2 = o00oOooO(i);
        if (o00oOooO2 == 0) {
            return null;
        }
        int o00oOooo2 = o00oOooo(o00oOooO2);
        byteBuffer.rewind();
        byteBuffer.limit((o00oo0OO(o00oOooO2) * i2) + o00oOooo2);
        byteBuffer.position(o00oOooo2);
        return byteBuffer;
    }

    public ByteBuffer o00oo00O(int i, int i2) {
        int o00oOooO2 = o00oOooO(i);
        if (o00oOooO2 == 0) {
            return null;
        }
        ByteBuffer order = this.f11102o00oOOoO.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int o00oOooo2 = o00oOooo(o00oOooO2);
        order.position(o00oOooo2);
        order.limit((o00oo0OO(o00oOooO2) * i2) + o00oOooo2);
        return order;
    }

    public int o00oo0OO(int i) {
        int i2 = i + this.f11101o00oOOo0;
        return this.f11102o00oOOoO.getInt(this.f11102o00oOOoO.getInt(i2) + i2);
    }

    public ByteBuffer o00oo0Oo() {
        return this.f11102o00oOOoO;
    }

    public void o00oo0o(int[] iArr, ByteBuffer byteBuffer) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        Arrays.sort(numArr, new o00oOOo0(byteBuffer));
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = numArr[i2].intValue();
        }
    }

    public int o00oo0o0(Integer num, Integer num2, ByteBuffer byteBuffer) {
        return 0;
    }
}
