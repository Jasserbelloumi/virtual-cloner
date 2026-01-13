package o0O00Oo;

import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import o00ooO0.o00oOoO;
/* loaded from: classes.dex */
public class o00ooO {

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final /* synthetic */ boolean f11059o00oo0OO = false;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public ByteBuffer f11060o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f11061o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f11062o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f11063o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public boolean f11064o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public int f11065o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public boolean f11066o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public int[] f11067o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public int f11068o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public int f11069o00oOoo0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int[] f11070o00oOooO;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public boolean f11071o00oOooo;

    /* renamed from: o00oo0  reason: collision with root package name */
    public final o0O00OOO f11072o00oo0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public o00oOOoO f11073o00oo00O;

    /* loaded from: classes.dex */
    public static class o00oOOo0 extends InputStream {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public ByteBuffer f11074o00oo0O0;

        public o00oOOo0(ByteBuffer byteBuffer) {
            this.f11074o00oo0O0 = byteBuffer;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            try {
                return this.f11074o00oo0O0.get() & 255;
            } catch (BufferUnderflowException unused) {
                return -1;
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oOOoO {
        public abstract ByteBuffer o00oOOo0(int i);

        public void o00oOOoO(ByteBuffer byteBuffer) {
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOo00 extends o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final o00oOo00 f11075o00oOOo0 = new o00oOo00();

        @Override // o0O00Oo.o00ooO.o00oOOoO
        public ByteBuffer o00oOOo0(int i) {
            return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public o00ooO() {
        this(1024);
    }

    public o00ooO(int i) {
        this(i, o00oOo00.f11075o00oOOo0, null, o0O00OOO.o00oOooO());
    }

    public o00ooO(int i, o00oOOoO o00ooooo2) {
        this(i, o00ooooo2, null, o0O00OOO.o00oOooO());
    }

    public o00ooO(int i, o00oOOoO o00ooooo2, ByteBuffer byteBuffer, o0O00OOO o0o00ooo) {
        this.f11062o00oOo00 = 1;
        this.f11070o00oOooO = null;
        this.f11063o00oOo0O = 0;
        this.f11064o00oOo0o = false;
        this.f11066o00oOoO0 = false;
        this.f11067o00oOoOO = new int[16];
        this.f11068o00oOoOo = 0;
        this.f11069o00oOoo0 = 0;
        this.f11071o00oOooo = false;
        i = i <= 0 ? 1 : i;
        this.f11073o00oo00O = o00ooooo2;
        if (byteBuffer != null) {
            this.f11060o00oOOo0 = byteBuffer;
            byteBuffer.clear();
            this.f11060o00oOOo0.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f11060o00oOOo0 = o00ooooo2.o00oOOo0(i);
        }
        this.f11072o00oo0 = o0o00ooo;
        this.f11061o00oOOoO = this.f11060o00oOOo0.capacity();
    }

    public o00ooO(ByteBuffer byteBuffer) {
        this(byteBuffer, new o00oOo00());
    }

    public o00ooO(ByteBuffer byteBuffer, o00oOOoO o00ooooo2) {
        this(byteBuffer.capacity(), o00ooooo2, byteBuffer, o0O00OOO.o00oOooO());
    }

    public static ByteBuffer o00oooO(ByteBuffer byteBuffer, o00oOOoO o00ooooo2) {
        int capacity = byteBuffer.capacity();
        if (((-1073741824) & capacity) == 0) {
            int i = capacity == 0 ? 1 : capacity << 1;
            byteBuffer.position(0);
            ByteBuffer o00oOOo02 = o00ooooo2.o00oOOo0(i);
            o00oOOo02.position(o00oOOo02.clear().capacity() - capacity);
            o00oOOo02.put(byteBuffer);
            return o00oOOo02;
        }
        throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
    }

    public static boolean o00oooOo(o0O00O o0o00o, int i) {
        return o0o00o.o00oOooO(i) != 0;
    }

    public void o0(boolean z) {
        ByteBuffer byteBuffer = this.f11060o00oOOo0;
        int i = this.f11061o00oOOoO - 1;
        this.f11061o00oOOoO = i;
        byteBuffer.put(i, z ? (byte) 1 : (byte) 0);
    }

    public void o00oOOo0(int i) {
        if (i != o00oooo()) {
            throw new AssertionError("FlatBuffers: struct must be serialized inline.");
        }
    }

    public void o00oOOoO(int i, boolean z, boolean z2) {
        if (this.f11071o00oOooo || z != z2) {
            o00oOo00(z);
            o0ooOoOO(i);
        }
    }

    public void o00oOo00(boolean z) {
        o00ooooo(1, 0);
        o0(z);
    }

    public void o00oOo0O(int i, byte b, int i2) {
        if (this.f11071o00oOooo || b != i2) {
            o00oOooO(b);
            o0ooOoOO(i);
        }
    }

    public void o00oOo0o(double d) {
        o00ooooo(8, 0);
        o0O0000O(d);
    }

    public void o00oOoO(float f) {
        o00ooooo(4, 0);
        o0O0000o(f);
    }

    public void o00oOoO0(int i, double d, double d2) {
        if (this.f11071o00oOooo || d != d2) {
            o00oOo0o(d);
            o0ooOoOO(i);
        }
    }

    public void o00oOoOO(int i, float f, double d) {
        if (this.f11071o00oOooo || f != d) {
            o00oOoO(f);
            o0ooOoOO(i);
        }
    }

    public void o00oOoOo(int i) {
        o00ooooo(4, 0);
        o0O000(i);
    }

    public void o00oOoo0(int i, int i2, int i3) {
        if (this.f11071o00oOooo || i2 != i3) {
            o00oOoOo(i2);
            o0ooOoOO(i);
        }
    }

    public void o00oOooO(byte b) {
        o00ooooo(1, 0);
        o0O00000(b);
    }

    public void o00oOooo(int i, long j, long j2) {
        if (this.f11071o00oOooo || j != j2) {
            o00oo00O(j);
            o0ooOoOO(i);
        }
    }

    public <T extends o0O00O> int o00oo(T t, int[] iArr) {
        t.o00oo0o(iArr, this.f11060o00oOOo0);
        return o00ooO0o(iArr);
    }

    public void o00oo0(int i) {
        o00ooooo(4, 0);
        o0O000((o00oooo() - i) + 4);
    }

    public void o00oo00O(long j) {
        o00ooooo(8, 0);
        o0O000O(j);
    }

    public void o00oo0O(short s) {
        o00ooooo(2, 0);
        o0OoOoOo(s);
    }

    public void o00oo0O0(int i, short s, int i2) {
        if (this.f11071o00oOooo || s != i2) {
            o00oo0O(s);
            o0ooOoOO(i);
        }
    }

    public void o00oo0OO(int i, int i2, int i3) {
        if (this.f11071o00oOooo || i2 != i3) {
            o00oo0(i2);
            o0ooOoOO(i);
        }
    }

    public void o00oo0Oo(int i, int i2, int i3) {
        if (i2 != i3) {
            o00oOOo0(i2);
            o0ooOoOO(i);
        }
    }

    public int o00oo0o(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        o0O00(1, remaining, 1);
        ByteBuffer byteBuffer2 = this.f11060o00oOOo0;
        int i = this.f11061o00oOOoO - remaining;
        this.f11061o00oOOoO = i;
        byteBuffer2.position(i);
        this.f11060o00oOOo0.put(byteBuffer);
        return o00ooOOo();
    }

    public void o00oo0o0() {
        this.f11061o00oOOoO = this.f11060o00oOOo0.capacity();
        this.f11060o00oOOo0.clear();
        this.f11062o00oOo00 = 1;
        while (true) {
            int i = this.f11063o00oOo0O;
            if (i <= 0) {
                this.f11063o00oOo0O = 0;
                this.f11064o00oOo0o = false;
                this.f11066o00oOoO0 = false;
                this.f11065o00oOoO = 0;
                this.f11068o00oOoOo = 0;
                this.f11069o00oOoo0 = 0;
                return;
            }
            int[] iArr = this.f11070o00oOooO;
            int i2 = i - 1;
            this.f11063o00oOo0O = i2;
            iArr[i2] = 0;
        }
    }

    public int o00oo0oO(byte[] bArr) {
        int length = bArr.length;
        o0O00(1, length, 1);
        ByteBuffer byteBuffer = this.f11060o00oOOo0;
        int i = this.f11061o00oOOoO - length;
        this.f11061o00oOOoO = i;
        byteBuffer.position(i);
        this.f11060o00oOOo0.put(bArr);
        return o00ooOOo();
    }

    public ByteBuffer o00ooO() {
        o00ooo0O();
        return this.f11060o00oOOo0;
    }

    public int o00ooO0(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        o00oOooO((byte) 0);
        o0O00(1, remaining, 1);
        ByteBuffer byteBuffer2 = this.f11060o00oOOo0;
        int i = this.f11061o00oOOoO - remaining;
        this.f11061o00oOOoO = i;
        byteBuffer2.position(i);
        this.f11060o00oOOo0.put(byteBuffer);
        return o00ooOOo();
    }

    public int o00ooO00(CharSequence charSequence) {
        int o00oOo002 = this.f11072o00oo0.o00oOo00(charSequence);
        o00oOooO((byte) 0);
        o0O00(1, o00oOo002, 1);
        ByteBuffer byteBuffer = this.f11060o00oOOo0;
        int i = this.f11061o00oOOoO - o00oOo002;
        this.f11061o00oOOoO = i;
        byteBuffer.position(i);
        this.f11072o00oo0.o00oOOoO(charSequence, this.f11060o00oOOo0);
        return o00ooOOo();
    }

    public ByteBuffer o00ooO0O(int i, int i2, int i3) {
        int i4 = i * i2;
        o0O00(i, i2, i3);
        ByteBuffer byteBuffer = this.f11060o00oOOo0;
        int i5 = this.f11061o00oOOoO - i4;
        this.f11061o00oOOoO = i5;
        byteBuffer.position(i5);
        ByteBuffer order = this.f11060o00oOOo0.slice().order(ByteOrder.LITTLE_ENDIAN);
        order.limit(i4);
        return order;
    }

    public int o00ooO0o(int[] iArr) {
        o00oooo0();
        o0O00(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            o00oo0(iArr[length]);
        }
        return o00ooOOo();
    }

    public int o00ooOO() {
        int i;
        if (this.f11070o00oOooO == null || !this.f11064o00oOo0o) {
            throw new AssertionError("FlatBuffers: endTable called without startTable");
        }
        o00oOoOo(0);
        int o00oooo2 = o00oooo();
        int i2 = this.f11063o00oOo0O - 1;
        while (i2 >= 0 && this.f11070o00oOooO[i2] == 0) {
            i2--;
        }
        int i3 = i2 + 1;
        while (i2 >= 0) {
            int i4 = this.f11070o00oOooO[i2];
            o00oo0O((short) (i4 != 0 ? o00oooo2 - i4 : 0));
            i2--;
        }
        o00oo0O((short) (o00oooo2 - this.f11065o00oOoO));
        o00oo0O((short) ((i3 + 2) * 2));
        int i5 = 0;
        loop2: while (true) {
            if (i5 >= this.f11068o00oOoOo) {
                i = 0;
                break;
            }
            int capacity = this.f11060o00oOOo0.capacity() - this.f11067o00oOoOO[i5];
            int i6 = this.f11061o00oOOoO;
            short s = this.f11060o00oOOo0.getShort(capacity);
            if (s == this.f11060o00oOOo0.getShort(i6)) {
                for (int i7 = 2; i7 < s; i7 += 2) {
                    if (this.f11060o00oOOo0.getShort(capacity + i7) != this.f11060o00oOOo0.getShort(i6 + i7)) {
                        break;
                    }
                }
                i = this.f11067o00oOoOO[i5];
                break loop2;
            }
            i5++;
        }
        if (i != 0) {
            int capacity2 = this.f11060o00oOOo0.capacity() - o00oooo2;
            this.f11061o00oOOoO = capacity2;
            this.f11060o00oOOo0.putInt(capacity2, i - o00oooo2);
        } else {
            int i8 = this.f11068o00oOoOo;
            int[] iArr = this.f11067o00oOoOO;
            if (i8 == iArr.length) {
                this.f11067o00oOoOO = Arrays.copyOf(iArr, i8 * 2);
            }
            int[] iArr2 = this.f11067o00oOoOO;
            int i9 = this.f11068o00oOoOo;
            this.f11068o00oOoOo = i9 + 1;
            iArr2[i9] = o00oooo();
            ByteBuffer byteBuffer = this.f11060o00oOOo0;
            byteBuffer.putInt(byteBuffer.capacity() - o00oooo2, o00oooo() - o00oooo2);
        }
        this.f11064o00oOo0o = false;
        return o00oooo2;
    }

    @Deprecated
    public final int o00ooOO0() {
        o00ooo0O();
        return this.f11061o00oOOoO;
    }

    public int o00ooOOo() {
        if (this.f11064o00oOo0o) {
            this.f11064o00oOo0o = false;
            o0O000(this.f11069o00oOoo0);
            return o00oooo();
        }
        throw new AssertionError("FlatBuffers: endVector called without startVector");
    }

    public void o00ooOo(int i, String str) {
        o00ooOoO(i, str, false);
    }

    public void o00ooOo0(int i) {
        o00ooOoo(i, false);
    }

    public void o00ooOoO(int i, String str, boolean z) {
        o00ooooo(this.f11062o00oOo00, (z ? 4 : 0) + 8);
        if (str.length() != 4) {
            throw new AssertionError("FlatBuffers: file identifier must be length 4");
        }
        for (int i2 = 3; i2 >= 0; i2--) {
            o00oOooO((byte) str.charAt(i2));
        }
        o00ooOoo(i, z);
    }

    public void o00ooOoo(int i, boolean z) {
        o00ooooo(this.f11062o00oOo00, (z ? 4 : 0) + 4);
        o00oo0(i);
        if (z) {
            o00oOoOo(this.f11060o00oOOo0.capacity() - this.f11061o00oOOoO);
        }
        this.f11060o00oOOo0.position(this.f11061o00oOOoO);
        this.f11066o00oOoO0 = true;
    }

    public void o00ooo0(int i, String str) {
        o00ooOoO(i, str, true);
    }

    public void o00ooo00(int i) {
        o00ooOoo(i, true);
    }

    public void o00ooo0O() {
        if (!this.f11066o00oOoO0) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    public o00ooO o00ooo0o(boolean z) {
        this.f11071o00oOooo = z;
        return this;
    }

    public o00ooO o00oooOO(ByteBuffer byteBuffer, o00oOOoO o00ooooo2) {
        this.f11073o00oo00O = o00ooooo2;
        this.f11060o00oOOo0 = byteBuffer;
        byteBuffer.clear();
        this.f11060o00oOOo0.order(ByteOrder.LITTLE_ENDIAN);
        this.f11062o00oOo00 = 1;
        this.f11061o00oOOoO = this.f11060o00oOOo0.capacity();
        this.f11063o00oOo0O = 0;
        this.f11064o00oOo0o = false;
        this.f11066o00oOoO0 = false;
        this.f11065o00oOoO = 0;
        this.f11068o00oOoOo = 0;
        this.f11069o00oOoo0 = 0;
        return this;
    }

    public int o00oooo() {
        return this.f11060o00oOOo0.capacity() - this.f11061o00oOOoO;
    }

    public void o00oooo0() {
        if (this.f11064o00oOo0o) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public void o00ooooO(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer byteBuffer = this.f11060o00oOOo0;
            int i3 = this.f11061o00oOOoO - 1;
            this.f11061o00oOOoO = i3;
            byteBuffer.put(i3, (byte) 0);
        }
    }

    public void o00ooooo(int i, int i2) {
        if (i > this.f11062o00oOo00) {
            this.f11062o00oOo00 = i;
        }
        int i3 = ((~((this.f11060o00oOOo0.capacity() - this.f11061o00oOOoO) + i2)) + 1) & (i - 1);
        while (this.f11061o00oOOoO < i3 + i + i2) {
            int capacity = this.f11060o00oOOo0.capacity();
            ByteBuffer byteBuffer = this.f11060o00oOOo0;
            ByteBuffer o00oooO2 = o00oooO(byteBuffer, this.f11073o00oo00O);
            this.f11060o00oOOo0 = o00oooO2;
            if (byteBuffer != o00oooO2) {
                this.f11073o00oo00O.o00oOOoO(byteBuffer);
            }
            this.f11061o00oOOoO = (this.f11060o00oOOo0.capacity() - capacity) + this.f11061o00oOOoO;
        }
        o00ooooO(i3);
    }

    public void o0O00(int i, int i2, int i3) {
        o00oooo0();
        this.f11069o00oOoo0 = i2;
        int i4 = i * i2;
        o00ooooo(4, i4);
        o00ooooo(i3, i4);
        this.f11064o00oOo0o = true;
    }

    public void o0O000(int i) {
        ByteBuffer byteBuffer = this.f11060o00oOOo0;
        int i2 = this.f11061o00oOOoO - 4;
        this.f11061o00oOOoO = i2;
        byteBuffer.putInt(i2, i);
    }

    public void o0O00000(byte b) {
        ByteBuffer byteBuffer = this.f11060o00oOOo0;
        int i = this.f11061o00oOOoO - 1;
        this.f11061o00oOOoO = i;
        byteBuffer.put(i, b);
    }

    public void o0O0000O(double d) {
        ByteBuffer byteBuffer = this.f11060o00oOOo0;
        int i = this.f11061o00oOOoO - 8;
        this.f11061o00oOOoO = i;
        byteBuffer.putDouble(i, d);
    }

    public void o0O0000o(float f) {
        ByteBuffer byteBuffer = this.f11060o00oOOo0;
        int i = this.f11061o00oOOoO - 4;
        this.f11061o00oOOoO = i;
        byteBuffer.putFloat(i, f);
    }

    public void o0O000O(long j) {
        ByteBuffer byteBuffer = this.f11060o00oOOo0;
        int i = this.f11061o00oOOoO - 8;
        this.f11061o00oOOoO = i;
        byteBuffer.putLong(i, j);
    }

    public void o0O000Oo(int i, int i2) {
        int capacity = this.f11060o00oOOo0.capacity() - i;
        if (!(this.f11060o00oOOo0.getShort((capacity - this.f11060o00oOOo0.getInt(capacity)) + i2) != 0)) {
            throw new AssertionError(o00oOoO.o00oOOo0("FlatBuffers: field ", i2, " must be set"));
        }
    }

    public InputStream o0O000o() {
        o00ooo0O();
        ByteBuffer duplicate = this.f11060o00oOOo0.duplicate();
        duplicate.position(this.f11061o00oOOoO);
        duplicate.limit(this.f11060o00oOOo0.capacity());
        return new o00oOOo0(duplicate);
    }

    public byte[] o0O000o0(int i, int i2) {
        o00ooo0O();
        byte[] bArr = new byte[i2];
        this.f11060o00oOOo0.position(i);
        this.f11060o00oOOo0.get(bArr);
        return bArr;
    }

    public void o0O000oo(int i) {
        o00oooo0();
        int[] iArr = this.f11070o00oOooO;
        if (iArr == null || iArr.length < i) {
            this.f11070o00oOooO = new int[i];
        }
        this.f11063o00oOo0O = i;
        Arrays.fill(this.f11070o00oOooO, 0, i, 0);
        this.f11064o00oOo0o = true;
        this.f11065o00oOoO = o00oooo();
    }

    public int o0O0o(byte[] bArr, int i, int i2) {
        o0O00(1, i2, 1);
        ByteBuffer byteBuffer = this.f11060o00oOOo0;
        int i3 = this.f11061o00oOOoO - i2;
        this.f11061o00oOOoO = i3;
        byteBuffer.position(i3);
        this.f11060o00oOOo0.put(bArr, i, i2);
        return o00ooOOo();
    }

    public byte[] o0OoOoOO() {
        return o0O000o0(this.f11061o00oOOoO, this.f11060o00oOOo0.capacity() - this.f11061o00oOOoO);
    }

    public void o0OoOoOo(short s) {
        ByteBuffer byteBuffer = this.f11060o00oOOo0;
        int i = this.f11061o00oOOoO - 2;
        this.f11061o00oOOoO = i;
        byteBuffer.putShort(i, s);
    }

    public void o0ooOoOO(int i) {
        this.f11070o00oOooO[i] = o00oooo();
    }
}
