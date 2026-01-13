package o0O00Oo;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import o0O00Oo.o0;
/* loaded from: classes.dex */
public class o0O00000 {

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f11076o00oOoO = 0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f11077o00oOoOO = 1;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f11078o00oOoOo = 2;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f11079o00oOoo0 = 3;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final int f11080o00oOooo = 4;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final int f11081o00oo0 = 0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final int f11082o00oo00O = 7;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final int f11083o00oo0O = 3;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final int f11084o00oo0O0 = 2;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final int f11085o00oo0OO = 1;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final /* synthetic */ boolean f11086o00oo0Oo = false;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O00 f11087o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final ArrayList<o00oOOoO> f11088o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final HashMap<String, Integer> f11089o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final int f11090o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public boolean f11091o00oOo0o;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public Comparator<o00oOOoO> f11092o00oOoO0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final HashMap<String, Integer> f11093o00oOooO;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Comparator<o00oOOoO> {
        public o00oOOo0() {
        }

        @Override // java.util.Comparator
        /* renamed from: o00oOOo0 */
        public int compare(o00oOOoO o00ooooo2, o00oOOoO o00ooooo3) {
            byte b;
            byte b2;
            int i = o00ooooo2.f11099o00oOo0O;
            int i2 = o00ooooo3.f11099o00oOo0O;
            do {
                b = o0O00000.this.f11087o00oOOo0.get(i);
                b2 = o0O00000.this.f11087o00oOOo0.get(i2);
                if (b == 0) {
                    return b - b2;
                }
                i++;
                i2++;
            } while (b == b2);
            return b - b2;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO {

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final /* synthetic */ boolean f11095o00oOo0o = false;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final int f11096o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final int f11097o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final double f11098o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f11099o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public long f11100o00oOooO;

        public o00oOOoO(int i, int i2, int i3, double d) {
            this.f11099o00oOo0O = i;
            this.f11096o00oOOo0 = i2;
            this.f11097o00oOOoO = i3;
            this.f11098o00oOo00 = d;
            this.f11100o00oOooO = Long.MIN_VALUE;
        }

        public o00oOOoO(int i, int i2, int i3, long j) {
            this.f11099o00oOo0O = i;
            this.f11096o00oOOo0 = i2;
            this.f11097o00oOOoO = i3;
            this.f11100o00oOooO = j;
            this.f11098o00oOo00 = Double.MIN_VALUE;
        }

        public static o00oOOoO o00oOo0o(int i, int i2, int i3, int i4) {
            return new o00oOOoO(i, i3, i4, i2);
        }

        public static o00oOOoO o00oOoO0(int i, boolean z) {
            return new o00oOOoO(i, 26, 0, z ? 1L : 0L);
        }

        public static int o00oOoOO(int i, int i2, long j, int i3, int i4) {
            if (o0.o00oOoOo(i)) {
                return i2;
            }
            for (int i5 = 1; i5 <= 32; i5 *= 2) {
                int o00ooOOo2 = o0O00000.o00ooOOo((int) (((i4 * i5) + (o00oo0O(i3, i5) + i3)) - j));
                if ((1 << o00ooOOo2) == i5) {
                    return o00ooOOo2;
                }
            }
            return 3;
        }

        public static o00oOOoO o00oOoOo(int i, float f) {
            return new o00oOOoO(i, 3, 2, f);
        }

        public static o00oOOoO o00oOoo0(int i, double d) {
            return new o00oOOoO(i, 3, 3, d);
        }

        public static o00oOOoO o00oOooo(int i, int i2) {
            return new o00oOOoO(i, 1, 1, i2);
        }

        public static o00oOOoO o00oo(int i, long j) {
            return new o00oOOoO(i, 2, 3, j);
        }

        public static o00oOOoO o00oo0(int i, long j) {
            return new o00oOOoO(i, 1, 3, j);
        }

        public static o00oOOoO o00oo00O(int i, int i2) {
            return new o00oOOoO(i, 1, 2, i2);
        }

        public static int o00oo0O(int i, int i2) {
            return ((~i) + 1) & (i2 - 1);
        }

        public static byte o00oo0O0(int i, int i2) {
            return (byte) (i | (i2 << 2));
        }

        public static o00oOOoO o00oo0OO(int i, int i2) {
            return new o00oOOoO(i, 1, 0, i2);
        }

        public static o00oOOoO o00oo0oO(int i, int i2) {
            return new o00oOOoO(i, 2, 1, i2);
        }

        public static o00oOOoO o00ooO00(int i, int i2) {
            return new o00oOOoO(i, 2, 0, i2);
        }

        public static o00oOOoO o0O0o(int i, int i2) {
            return new o00oOOoO(i, 2, 2, i2);
        }

        public final int o00oOoO(int i, int i2) {
            return o00oOoOO(this.f11096o00oOOo0, this.f11097o00oOOoO, this.f11100o00oOooO, i, i2);
        }

        public final byte o00oo0Oo() {
            return o00oo0o0(0);
        }

        public final int o00oo0o(int i) {
            return o0.o00oOoOo(this.f11096o00oOOo0) ? Math.max(this.f11097o00oOOoO, i) : this.f11097o00oOOoO;
        }

        public final byte o00oo0o0(int i) {
            return (byte) (o00oo0o(i) | (this.f11096o00oOOo0 << 2));
        }
    }

    public o0O00000() {
        this(256);
    }

    public o0O00000(int i) {
        this(new o00oo00O(i), 1);
    }

    public o0O00000(ByteBuffer byteBuffer) {
        this(byteBuffer, 1);
    }

    @Deprecated
    public o0O00000(ByteBuffer byteBuffer, int i) {
        this(new o00oo00O(byteBuffer.array()), i);
    }

    public o0O00000(o0O00 o0o00, int i) {
        this.f11088o00oOOoO = new ArrayList<>();
        this.f11089o00oOo00 = new HashMap<>();
        this.f11093o00oOooO = new HashMap<>();
        this.f11091o00oOo0o = false;
        this.f11092o00oOoO0 = new o00oOOo0();
        this.f11087o00oOOo0 = o0o00;
        this.f11090o00oOo0O = i;
    }

    public static int o00ooOOo(long j) {
        if (j <= 255) {
            return 0;
        }
        if (j <= 65535) {
            return 1;
        }
        return j <= o0.o00oo0O.o00oOOoO(-1) ? 2 : 3;
    }

    public final int o00oOOoO(int i) {
        int i2 = 1 << i;
        int o00oo0O2 = o00oOOoO.o00oo0O(this.f11087o00oOOo0.o00oOoOO(), i2);
        while (true) {
            int i3 = o00oo0O2 - 1;
            if (o00oo0O2 == 0) {
                return i2;
            }
            this.f11087o00oOOo0.o00oOoo0((byte) 0);
            o00oo0O2 = i3;
        }
    }

    public final o00oOOoO o00oOo00(int i, int i2) {
        long j = i2;
        int max = Math.max(0, o00ooOOo(j));
        int i3 = i;
        while (i3 < this.f11088o00oOOoO.size()) {
            i3++;
            max = Math.max(max, o00oOOoO.o00oOoOO(4, 0, this.f11088o00oOOoO.get(i3).f11099o00oOo0O, this.f11087o00oOOo0.o00oOoOO(), i3));
        }
        int o00oOOoO2 = o00oOOoO(max);
        o00ooOoo(j, o00oOOoO2);
        int o00oOoOO2 = this.f11087o00oOOo0.o00oOoOO();
        while (i < this.f11088o00oOOoO.size()) {
            int i4 = this.f11088o00oOOoO.get(i).f11099o00oOo0O;
            o00ooo00(this.f11088o00oOOoO.get(i).f11099o00oOo0O, o00oOOoO2);
            i++;
        }
        return new o00oOOoO(-1, o0.o00oo0O(4, 0), max, o00oOoOO2);
    }

    public int o00oOo0O(String str, int i) {
        int o00oo0oO2 = o00oo0oO(str);
        ArrayList<o00oOOoO> arrayList = this.f11088o00oOOoO;
        Collections.sort(arrayList.subList(i, arrayList.size()), this.f11092o00oOoO0);
        o00oOOoO o00oOooO2 = o00oOooO(o00oo0oO2, i, this.f11088o00oOOoO.size() - i, false, false, o00oOo00(i, this.f11088o00oOOoO.size() - i));
        while (this.f11088o00oOOoO.size() > i) {
            ArrayList<o00oOOoO> arrayList2 = this.f11088o00oOOoO;
            arrayList2.remove(arrayList2.size() - 1);
        }
        this.f11088o00oOOoO.add(o00oOooO2);
        return (int) o00oOooO2.f11100o00oOooO;
    }

    public int o00oOo0o(String str, int i, boolean z, boolean z2) {
        o00oOOoO o00oOooO2 = o00oOooO(o00oo0oO(str), i, this.f11088o00oOOoO.size() - i, z, z2, null);
        while (this.f11088o00oOOoO.size() > i) {
            ArrayList<o00oOOoO> arrayList = this.f11088o00oOOoO;
            arrayList.remove(arrayList.size() - 1);
        }
        this.f11088o00oOOoO.add(o00oOooO2);
        return (int) o00oOooO2.f11100o00oOooO;
    }

    public o0O00 o00oOoO() {
        return this.f11087o00oOOo0;
    }

    public ByteBuffer o00oOoO0() {
        int o00oOOoO2 = o00oOOoO(this.f11088o00oOOoO.get(0).o00oOoO(this.f11087o00oOOo0.o00oOoOO(), 0));
        o00ooOo0(this.f11088o00oOOoO.get(0), o00oOOoO2);
        this.f11087o00oOOo0.o00oOoo0(this.f11088o00oOOoO.get(0).o00oo0Oo());
        this.f11087o00oOOo0.o00oOoo0((byte) o00oOOoO2);
        this.f11091o00oOo0o = true;
        return ByteBuffer.wrap(this.f11087o00oOOo0.o00oOo0O(), 0, this.f11087o00oOOo0.o00oOoOO());
    }

    public int o00oOoOO(String str, byte[] bArr) {
        o00oOOoO o00ooOo2 = o00ooOo(o00oo0oO(str), bArr, 25, false);
        this.f11088o00oOOoO.add(o00ooOo2);
        return (int) o00ooOo2.f11100o00oOooO;
    }

    public int o00oOoOo(byte[] bArr) {
        return o00oOoOO(null, bArr);
    }

    public void o00oOoo0(String str, boolean z) {
        this.f11088o00oOOoO.add(o00oOOoO.o00oOoO0(o00oo0oO(str), z));
    }

    public final o00oOOoO o00oOooO(int i, int i2, int i3, boolean z, boolean z2, o00oOOoO o00ooooo2) {
        int i4;
        int i5;
        int i6 = i3;
        long j = i6;
        int max = Math.max(0, o00ooOOo(j));
        if (o00ooooo2 != null) {
            max = Math.max(max, o00ooooo2.o00oOoO(this.f11087o00oOOo0.o00oOoOO(), 0));
            i4 = 3;
        } else {
            i4 = 1;
        }
        int i7 = 4;
        int i8 = max;
        for (int i9 = i2; i9 < this.f11088o00oOOoO.size(); i9++) {
            i8 = Math.max(i8, this.f11088o00oOOoO.get(i9).o00oOoO(this.f11087o00oOOo0.o00oOoOO(), i9 + i4));
            if (z && i9 == i2) {
                i7 = this.f11088o00oOOoO.get(i9).f11096o00oOOo0;
                if (!o0.o00oOooo(i7)) {
                    throw new o0.o00oOOoO("TypedVector does not support this element type");
                }
            }
        }
        int i10 = i2;
        int o00oOOoO2 = o00oOOoO(i8);
        if (o00ooooo2 != null) {
            o00ooo00(o00ooooo2.f11100o00oOooO, o00oOOoO2);
            o00ooOoo(1 << o00ooooo2.f11097o00oOOoO, o00oOOoO2);
        }
        if (!z2) {
            o00ooOoo(j, o00oOOoO2);
        }
        int o00oOoOO2 = this.f11087o00oOOo0.o00oOoOO();
        for (int i11 = i10; i11 < this.f11088o00oOOoO.size(); i11++) {
            o00ooOo0(this.f11088o00oOOoO.get(i11), o00oOOoO2);
        }
        if (!z) {
            while (i10 < this.f11088o00oOOoO.size()) {
                this.f11087o00oOOo0.o00oOoo0(this.f11088o00oOOoO.get(i10).o00oo0o0(i8));
                i10++;
            }
        }
        if (o00ooooo2 != null) {
            i5 = 9;
        } else if (z) {
            if (!z2) {
                i6 = 0;
            }
            i5 = o0.o00oo0O(i7, i6);
        } else {
            i5 = 10;
        }
        return new o00oOOoO(i, i5, i8, o00oOoOO2);
    }

    public void o00oOooo(boolean z) {
        o00oOoo0(null, z);
    }

    public int o00oo(String str, String str2) {
        int o00oo0oO2 = o00oo0oO(str);
        if ((this.f11090o00oOo0O & 2) == 0) {
            o00oOOoO o00ooo02 = o00ooo0(o00oo0oO2, str2);
            this.f11088o00oOOoO.add(o00ooo02);
            return (int) o00ooo02.f11100o00oOooO;
        }
        Integer num = this.f11093o00oOooO.get(str2);
        if (num != null) {
            this.f11088o00oOOoO.add(o00oOOoO.o00oOo0o(o00oo0oO2, num.intValue(), 5, o00ooOOo(str2.length())));
            return num.intValue();
        }
        o00oOOoO o00ooo03 = o00ooo0(o00oo0oO2, str2);
        this.f11093o00oOooO.put(str2, Integer.valueOf((int) o00ooo03.f11100o00oOooO));
        this.f11088o00oOOoO.add(o00ooo03);
        return (int) o00ooo03.f11100o00oOooO;
    }

    public void o00oo0(float f) {
        o00oo0O0(null, f);
    }

    public void o00oo00O(double d) {
        o00oo0OO(null, d);
    }

    public void o00oo0O(int i) {
        o00oo0o0(null, i);
    }

    public void o00oo0O0(String str, float f) {
        this.f11088o00oOOoO.add(o00oOOoO.o00oOoOo(o00oo0oO(str), f));
    }

    public void o00oo0OO(String str, double d) {
        this.f11088o00oOOoO.add(o00oOOoO.o00oOoo0(o00oo0oO(str), d));
    }

    public void o00oo0Oo(long j) {
        o00oo0o(null, j);
    }

    public void o00oo0o(String str, long j) {
        ArrayList<o00oOOoO> arrayList;
        o00oOOoO o00oo02;
        int o00oo0oO2 = o00oo0oO(str);
        if (-128 <= j && j <= 127) {
            arrayList = this.f11088o00oOOoO;
            o00oo02 = o00oOOoO.o00oo0OO(o00oo0oO2, (int) j);
        } else if (-32768 <= j && j <= 32767) {
            arrayList = this.f11088o00oOOoO;
            o00oo02 = o00oOOoO.o00oOooo(o00oo0oO2, (int) j);
        } else if (-2147483648L > j || j > 2147483647L) {
            arrayList = this.f11088o00oOOoO;
            o00oo02 = o00oOOoO.o00oo0(o00oo0oO2, j);
        } else {
            arrayList = this.f11088o00oOOoO;
            o00oo02 = o00oOOoO.o00oo00O(o00oo0oO2, (int) j);
        }
        arrayList.add(o00oo02);
    }

    public void o00oo0o0(String str, int i) {
        o00oo0o(str, i);
    }

    public final int o00oo0oO(String str) {
        if (str == null) {
            return -1;
        }
        int o00oOoOO2 = this.f11087o00oOOo0.o00oOoOO();
        if ((this.f11090o00oOo0O & 1) != 0) {
            Integer num = this.f11089o00oOo00.get(str);
            if (num != null) {
                return num.intValue();
            }
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            this.f11087o00oOOo0.o00oo0O0(bytes, 0, bytes.length);
        } else {
            byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
            this.f11087o00oOOo0.o00oo0O0(bytes2, 0, bytes2.length);
        }
        this.f11087o00oOOo0.o00oOoo0((byte) 0);
        this.f11089o00oOo00.put(str, Integer.valueOf(o00oOoOO2));
        return o00oOoOO2;
    }

    public void o00ooO(BigInteger bigInteger) {
        o00ooO0o(null, bigInteger.longValue());
    }

    public void o00ooO0(long j) {
        o00ooO0O(null, j);
    }

    public void o00ooO00(int i) {
        o00ooO0O(null, i);
    }

    public final void o00ooO0O(String str, long j) {
        int o00oo0oO2 = o00oo0oO(str);
        int o00ooOOo2 = o00ooOOo(j);
        this.f11088o00oOOoO.add(o00ooOOo2 == 0 ? o00oOOoO.o00ooO00(o00oo0oO2, (int) j) : o00ooOOo2 == 1 ? o00oOOoO.o00oo0oO(o00oo0oO2, (int) j) : o00ooOOo2 == 2 ? o00oOOoO.o0O0o(o00oo0oO2, (int) j) : o00oOOoO.o00oo(o00oo0oO2, j));
    }

    public final void o00ooO0o(String str, long j) {
        this.f11088o00oOOoO.add(o00oOOoO.o00oo(o00oo0oO(str), j));
    }

    public int o00ooOO() {
        return this.f11088o00oOOoO.size();
    }

    public int o00ooOO0() {
        return this.f11088o00oOOoO.size();
    }

    public final o00oOOoO o00ooOo(int i, byte[] bArr, int i2, boolean z) {
        int o00ooOOo2 = o00ooOOo(bArr.length);
        o00ooOoo(bArr.length, o00oOOoO(o00ooOOo2));
        int o00oOoOO2 = this.f11087o00oOOo0.o00oOoOO();
        this.f11087o00oOOo0.o00oo0O0(bArr, 0, bArr.length);
        if (z) {
            this.f11087o00oOOo0.o00oOoo0((byte) 0);
        }
        return o00oOOoO.o00oOo0o(i, o00oOoOO2, i2, o00ooOOo2);
    }

    public final void o00ooOo0(o00oOOoO o00ooooo2, int i) {
        int i2 = o00ooooo2.f11096o00oOOo0;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            if (i2 == 3) {
                o00ooOoO(o00ooooo2.f11098o00oOo00, i);
                return;
            } else if (i2 != 26) {
                o00ooo00(o00ooooo2.f11100o00oOooO, i);
                return;
            }
        }
        o00ooOoo(o00ooooo2.f11100o00oOooO, i);
    }

    public final void o00ooOoO(double d, int i) {
        if (i == 4) {
            this.f11087o00oOOo0.putFloat((float) d);
        } else if (i == 8) {
            this.f11087o00oOOo0.putDouble(d);
        }
    }

    public final void o00ooOoo(long j, int i) {
        if (i == 1) {
            this.f11087o00oOOo0.o00oOoo0((byte) j);
        } else if (i == 2) {
            this.f11087o00oOOo0.putShort((short) j);
        } else if (i == 4) {
            this.f11087o00oOOo0.putInt((int) j);
        } else if (i != 8) {
        } else {
            this.f11087o00oOOo0.putLong(j);
        }
    }

    public final o00oOOoO o00ooo0(int i, String str) {
        return o00ooOo(i, str.getBytes(StandardCharsets.UTF_8), 5, true);
    }

    public final void o00ooo00(long j, int i) {
        o00ooOoo((int) (this.f11087o00oOOo0.o00oOoOO() - j), i);
    }

    public int o0O0o(String str) {
        return o00oo(null, str);
    }
}
