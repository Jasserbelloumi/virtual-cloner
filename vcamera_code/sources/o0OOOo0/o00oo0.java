package o0OOOo0;

import com.google.common.primitives.UnsignedInts;
import java.io.Serializable;
import o0OO0o.o0OO00o0;
import o0OOO0OO.o00ooO0;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import o0OOOo0o.o0O0O0Oo;
import org.jetbrains.annotations.NotNull;
@o0OOO00({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/Random\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
@o0OO00o0(version = "1.3")
/* loaded from: classes3.dex */
public abstract class o00oo0 {
    @NotNull
    public static final o00oOOo0 Default = new o00oOOo0(null);
    @NotNull
    private static final o00oo0 defaultRandom = o00ooO0.f13445o00oOOo0.o00oOOoO();

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o00oo0 implements Serializable {

        /* renamed from: o0OOOo0.o00oo0$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0172o00oOOo0 implements Serializable {
            @NotNull
            public static final C0172o00oOOo0 INSTANCE = new C0172o00oOOo0();
            private static final long serialVersionUID = 0;

            private C0172o00oOOo0() {
            }

            private final Object readResolve() {
                return o00oo0.Default;
            }
        }

        private o00oOOo0() {
        }

        public /* synthetic */ o00oOOo0(o0O00 o0o00) {
            this();
        }

        private final Object writeReplace() {
            return C0172o00oOOo0.INSTANCE;
        }

        @Override // o0OOOo0.o00oo0
        public int nextBits(int i) {
            return o00oo0.defaultRandom.nextBits(i);
        }

        @Override // o0OOOo0.o00oo0
        public boolean nextBoolean() {
            return o00oo0.defaultRandom.nextBoolean();
        }

        @Override // o0OOOo0.o00oo0
        @NotNull
        public byte[] nextBytes(int i) {
            return o00oo0.defaultRandom.nextBytes(i);
        }

        @Override // o0OOOo0.o00oo0
        @NotNull
        public byte[] nextBytes(@NotNull byte[] bArr) {
            o0ooO.o00oo0O0(bArr, "array");
            return o00oo0.defaultRandom.nextBytes(bArr);
        }

        @Override // o0OOOo0.o00oo0
        @NotNull
        public byte[] nextBytes(@NotNull byte[] bArr, int i, int i2) {
            o0ooO.o00oo0O0(bArr, "array");
            return o00oo0.defaultRandom.nextBytes(bArr, i, i2);
        }

        @Override // o0OOOo0.o00oo0
        public double nextDouble() {
            return o00oo0.defaultRandom.nextDouble();
        }

        @Override // o0OOOo0.o00oo0
        public double nextDouble(double d) {
            return o00oo0.defaultRandom.nextDouble(d);
        }

        @Override // o0OOOo0.o00oo0
        public double nextDouble(double d, double d2) {
            return o00oo0.defaultRandom.nextDouble(d, d2);
        }

        @Override // o0OOOo0.o00oo0
        public float nextFloat() {
            return o00oo0.defaultRandom.nextFloat();
        }

        @Override // o0OOOo0.o00oo0
        public int nextInt() {
            return o00oo0.defaultRandom.nextInt();
        }

        @Override // o0OOOo0.o00oo0
        public int nextInt(int i) {
            return o00oo0.defaultRandom.nextInt(i);
        }

        @Override // o0OOOo0.o00oo0
        public int nextInt(int i, int i2) {
            return o00oo0.defaultRandom.nextInt(i, i2);
        }

        @Override // o0OOOo0.o00oo0
        public long nextLong() {
            return o00oo0.defaultRandom.nextLong();
        }

        @Override // o0OOOo0.o00oo0
        public long nextLong(long j) {
            return o00oo0.defaultRandom.nextLong(j);
        }

        @Override // o0OOOo0.o00oo0
        public long nextLong(long j, long j2) {
            return o00oo0.defaultRandom.nextLong(j, j2);
        }
    }

    public static /* synthetic */ byte[] nextBytes$default(o00oo0 o00oo0Var, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return o00oo0Var.nextBytes(bArr, i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
    }

    public abstract int nextBits(int i);

    public boolean nextBoolean() {
        return nextBits(1) != 0;
    }

    @NotNull
    public byte[] nextBytes(int i) {
        return nextBytes(new byte[i]);
    }

    @NotNull
    public byte[] nextBytes(@NotNull byte[] bArr) {
        o0ooO.o00oo0O0(bArr, "array");
        return nextBytes(bArr, 0, bArr.length);
    }

    @NotNull
    public byte[] nextBytes(@NotNull byte[] bArr, int i, int i2) {
        o0ooO.o00oo0O0(bArr, "array");
        if (!(new o0O0O0Oo(0, bArr.length).o00oOoo0(i) && new o0O0O0Oo(0, bArr.length).o00oOoo0(i2))) {
            StringBuilder o00oOOo02 = androidx.recyclerview.widget.o00oo0O0.o00oOOo0("fromIndex (", i, ") or toIndex (", i2, ") are out of range: 0..");
            o00oOOo02.append(bArr.length);
            o00oOOo02.append('.');
            throw new IllegalArgumentException(o00oOOo02.toString().toString());
        }
        if (!(i <= i2)) {
            throw new IllegalArgumentException(("fromIndex (" + i + ") must be not greater than toIndex (" + i2 + ").").toString());
        }
        int i3 = (i2 - i) / 4;
        for (int i4 = 0; i4 < i3; i4++) {
            int nextInt = nextInt();
            bArr[i] = (byte) nextInt;
            bArr[i + 1] = (byte) (nextInt >>> 8);
            bArr[i + 2] = (byte) (nextInt >>> 16);
            bArr[i + 3] = (byte) (nextInt >>> 24);
            i += 4;
        }
        int i5 = i2 - i;
        int nextBits = nextBits(i5 * 8);
        for (int i6 = 0; i6 < i5; i6++) {
            bArr[i + i6] = (byte) (nextBits >>> (i6 * 8));
        }
        return bArr;
    }

    public double nextDouble() {
        return o00oo00O.o00oOooO(nextBits(26), nextBits(27));
    }

    public double nextDouble(double d) {
        return nextDouble(0.0d, d);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public double nextDouble(double r7, double r9) {
        /*
            r6 = this;
            o0OOOo0.o00oo0OO.o00oOooO(r7, r9)
            double r0 = r9 - r7
            boolean r2 = java.lang.Double.isInfinite(r0)
            if (r2 == 0) goto L3d
            boolean r2 = java.lang.Double.isInfinite(r7)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L1b
            boolean r2 = java.lang.Double.isNaN(r7)
            if (r2 != 0) goto L1b
            r2 = r3
            goto L1c
        L1b:
            r2 = r4
        L1c:
            if (r2 == 0) goto L3d
            boolean r2 = java.lang.Double.isInfinite(r9)
            if (r2 != 0) goto L2b
            boolean r2 = java.lang.Double.isNaN(r9)
            if (r2 != 0) goto L2b
            goto L2c
        L2b:
            r3 = r4
        L2c:
            if (r3 == 0) goto L3d
            double r0 = r6.nextDouble()
            r2 = 2
            double r2 = (double) r2
            double r4 = r9 / r2
            double r2 = r7 / r2
            double r4 = r4 - r2
            double r4 = r4 * r0
            double r7 = r7 + r4
            double r7 = r7 + r4
            goto L43
        L3d:
            double r2 = r6.nextDouble()
            double r2 = r2 * r0
            double r7 = r7 + r2
        L43:
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L4d
            r7 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            double r7 = java.lang.Math.nextAfter(r9, r7)
        L4d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOOo0.o00oo0.nextDouble(double, double):double");
    }

    public float nextFloat() {
        return nextBits(24) / 1.6777216E7f;
    }

    public int nextInt() {
        return nextBits(32);
    }

    public int nextInt(int i) {
        return nextInt(0, i);
    }

    public int nextInt(int i, int i2) {
        int nextInt;
        int i3;
        int i4;
        int nextInt2;
        boolean z;
        o00oo0OO.o00oOo0O(i, i2);
        int i5 = i2 - i;
        if (i5 > 0 || i5 == Integer.MIN_VALUE) {
            if (((-i5) & i5) == i5) {
                i4 = nextBits(o00oo0OO.o00oOoO0(i5));
            } else {
                do {
                    nextInt = nextInt() >>> 1;
                    i3 = nextInt % i5;
                } while ((i5 - 1) + (nextInt - i3) < 0);
                i4 = i3;
            }
            return i + i4;
        }
        do {
            nextInt2 = nextInt();
            z = false;
            if (i <= nextInt2 && nextInt2 < i2) {
                z = true;
                continue;
            }
        } while (!z);
        return nextInt2;
    }

    public long nextLong() {
        return (nextInt() << 32) + nextInt();
    }

    public long nextLong(long j) {
        return nextLong(0L, j);
    }

    public long nextLong(long j, long j2) {
        long nextLong;
        boolean z;
        long nextLong2;
        long j3;
        long j4;
        int nextInt;
        o00oo0OO.o00oOo0o(j, j2);
        long j5 = j2 - j;
        if (j5 <= 0) {
            do {
                nextLong = nextLong();
                z = false;
                if (j <= nextLong && nextLong < j2) {
                    z = true;
                    continue;
                }
            } while (!z);
            return nextLong;
        }
        if (((-j5) & j5) == j5) {
            int i = (int) j5;
            int i2 = (int) (j5 >>> 32);
            if (i != 0) {
                nextInt = nextBits(o00oo0OO.o00oOoO0(i));
            } else if (i2 == 1) {
                nextInt = nextInt();
            } else {
                j4 = (nextBits(o00oo0OO.o00oOoO0(i2)) << 32) + (nextInt() & UnsignedInts.INT_MASK);
            }
            j4 = nextInt & UnsignedInts.INT_MASK;
        } else {
            do {
                nextLong2 = nextLong() >>> 1;
                j3 = nextLong2 % j5;
            } while ((j5 - 1) + (nextLong2 - j3) < 0);
            j4 = j3;
        }
        return j + j4;
    }
}
