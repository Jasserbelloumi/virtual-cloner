package o0O0OO;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import o00oOooO.o0OO0oO;
import o00oOooO.o0o0000;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o0O00OOO implements o0O0OOoO.o0, o0O0OOoO.o00ooO {

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final int f11357o00ooO = 2;
    @o0o0000

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final int f11358o00ooO0 = 10;
    @o0o0000

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final int f11359o00ooO00 = 15;
    @o0o0000

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final TreeMap<Integer, o0O00OOO> f11360o00ooO0O = new TreeMap<>();

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final int f11361o00ooO0o = 1;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final int f11362o00ooOO = 4;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final int f11363o00ooOO0 = 3;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static final int f11364o00ooOOo = 5;
    @o0o0000

    /* renamed from: o00oo  reason: collision with root package name */
    public int f11365o00oo;
    @o0o0000

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final long[] f11366o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public volatile String f11367o00oo0O0;
    @o0o0000

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final double[] f11368o00oo0Oo;
    @o0o0000

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final byte[][] f11369o00oo0o;
    @o0o0000

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final String[] f11370o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public final int[] f11371o00oo0oO;
    @o0o0000

    /* renamed from: o0O0o  reason: collision with root package name */
    public final int f11372o0O0o;

    /* loaded from: classes.dex */
    public static class o00oOOo0 implements o0O0OOoO.o00ooO {
        public o00oOOo0() {
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // o0O0OOoO.o00ooO
        public void o00ooO(int i, double d) {
            o0O00OOO.this.o00ooO(i, d);
        }

        @Override // o0O0OOoO.o00ooO
        public void o0O0O0O(int i, String str) {
            o0O00OOO.this.o0O0O0O(i, str);
        }

        @Override // o0O0OOoO.o00ooO
        public void o0O0OOOo(int i, long j) {
            o0O00OOO.this.o0O0OOOo(i, j);
        }

        @Override // o0O0OOoO.o00ooO
        public void o0O0o00(int i) {
            o0O00OOO.this.o0O0o00(i);
        }

        @Override // o0O0OOoO.o00ooO
        public void o0O0oO() {
            o0O00OOO.this.o0O0oO();
        }

        @Override // o0O0OOoO.o00ooO
        public void o0OooO0(int i, byte[] bArr) {
            o0O00OOO.this.o0OooO0(i, bArr);
        }
    }

    public o0O00OOO(int i) {
        this.f11372o0O0o = i;
        int i2 = i + 1;
        this.f11371o00oo0oO = new int[i2];
        this.f11366o00oo0O = new long[i2];
        this.f11368o00oo0Oo = new double[i2];
        this.f11370o00oo0o0 = new String[i2];
        this.f11369o00oo0o = new byte[i2];
    }

    public static o0O00OOO o00oOo0o(String str, int i) {
        TreeMap<Integer, o0O00OOO> treeMap = f11360o00ooO0O;
        synchronized (treeMap) {
            Map.Entry<Integer, o0O00OOO> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                o0O00OOO value = ceilingEntry.getValue();
                value.o00oOoo0(str, i);
                return value;
            }
            o0O00OOO o0o00ooo = new o0O00OOO(i);
            o0o00ooo.f11367o00oo0O0 = str;
            o0o00ooo.f11365o00oo = i;
            return o0o00ooo;
        }
    }

    public static o0O00OOO o00oOoO(o0O0OOoO.o0 o0Var) {
        o0O00OOO o00oOo0o2 = o00oOo0o(o0Var.o00oOOoO(), o0Var.o00oOOo0());
        o0Var.o00oOo0O(new o00oOOo0());
        return o00oOo0o2;
    }

    public static void o00oOooo() {
        TreeMap<Integer, o0O00OOO> treeMap = f11360o00ooO0O;
        if (treeMap.size() <= 15) {
            return;
        }
        int size = treeMap.size() - 10;
        Iterator<Integer> it = treeMap.descendingKeySet().iterator();
        while (true) {
            int i = size - 1;
            if (size <= 0) {
                return;
            }
            it.next();
            it.remove();
            size = i;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // o0O0OOoO.o0
    public int o00oOOo0() {
        return this.f11365o00oo;
    }

    @Override // o0O0OOoO.o0
    public String o00oOOoO() {
        return this.f11367o00oo0O0;
    }

    @Override // o0O0OOoO.o0
    public void o00oOo0O(o0O0OOoO.o00ooO o00ooo) {
        for (int i = 1; i <= this.f11365o00oo; i++) {
            int i2 = this.f11371o00oo0oO[i];
            if (i2 == 1) {
                o00ooo.o0O0o00(i);
            } else if (i2 == 2) {
                o00ooo.o0O0OOOo(i, this.f11366o00oo0O[i]);
            } else if (i2 == 3) {
                o00ooo.o00ooO(i, this.f11368o00oo0Oo[i]);
            } else if (i2 == 4) {
                o00ooo.o0O0O0O(i, this.f11370o00oo0o0[i]);
            } else if (i2 == 5) {
                o00ooo.o0OooO0(i, this.f11369o00oo0o[i]);
            }
        }
    }

    public void o00oOoO0(o0O00OOO o0o00ooo) {
        int o00oOOo02 = o0o00ooo.o00oOOo0() + 1;
        System.arraycopy(o0o00ooo.f11371o00oo0oO, 0, this.f11371o00oo0oO, 0, o00oOOo02);
        System.arraycopy(o0o00ooo.f11366o00oo0O, 0, this.f11366o00oo0O, 0, o00oOOo02);
        System.arraycopy(o0o00ooo.f11370o00oo0o0, 0, this.f11370o00oo0o0, 0, o00oOOo02);
        System.arraycopy(o0o00ooo.f11369o00oo0o, 0, this.f11369o00oo0o, 0, o00oOOo02);
        System.arraycopy(o0o00ooo.f11368o00oo0Oo, 0, this.f11368o00oo0Oo, 0, o00oOOo02);
    }

    public void o00oOoo0(String str, int i) {
        this.f11367o00oo0O0 = str;
        this.f11365o00oo = i;
    }

    @Override // o0O0OOoO.o00ooO
    public void o00ooO(int i, double d) {
        this.f11371o00oo0oO[i] = 3;
        this.f11368o00oo0Oo[i] = d;
    }

    @Override // o0O0OOoO.o00ooO
    public void o0O0O0O(int i, String str) {
        this.f11371o00oo0oO[i] = 4;
        this.f11370o00oo0o0[i] = str;
    }

    @Override // o0O0OOoO.o00ooO
    public void o0O0OOOo(int i, long j) {
        this.f11371o00oo0oO[i] = 2;
        this.f11366o00oo0O[i] = j;
    }

    @Override // o0O0OOoO.o00ooO
    public void o0O0o00(int i) {
        this.f11371o00oo0oO[i] = 1;
    }

    @Override // o0O0OOoO.o00ooO
    public void o0O0oO() {
        Arrays.fill(this.f11371o00oo0oO, 1);
        Arrays.fill(this.f11370o00oo0o0, (Object) null);
        Arrays.fill(this.f11369o00oo0o, (Object) null);
        this.f11367o00oo0O0 = null;
    }

    @Override // o0O0OOoO.o00ooO
    public void o0OooO0(int i, byte[] bArr) {
        this.f11371o00oo0oO[i] = 5;
        this.f11369o00oo0o[i] = bArr;
    }

    public void release() {
        TreeMap<Integer, o0O00OOO> treeMap = f11360o00ooO0O;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f11372o0O0o), this);
            o00oOooo();
        }
    }
}
