package o0OOOo0;

import java.io.Serializable;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0OOO00;
import org.jetbrains.annotations.NotNull;
@o0OOO00({"SMAP\nXorWowRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XorWowRandom.kt\nkotlin/random/XorWowRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
/* loaded from: classes3.dex */
public final class o00oo0O extends o00oo0 implements Serializable {
    @NotNull
    private static final o00oOOo0 Companion = new o00oOOo0(null);
    private static final long serialVersionUID = 0;
    private int addend;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }
    }

    public o00oo0O(int i, int i2) {
        this(i, i2, 0, 0, ~i, (i << 10) ^ (i2 >>> 4));
    }

    public o00oo0O(int i, int i2, int i3, int i4, int i5, int i6) {
        this.x = i;
        this.y = i2;
        this.z = i3;
        this.w = i4;
        this.v = i5;
        this.addend = i6;
        int i7 = i | i2 | i3 | i4 | i5;
        if (!(i7 != 0)) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
        }
        for (int i8 = 0; i8 < 64; i8++) {
            nextInt();
        }
    }

    @Override // o0OOOo0.o00oo0
    public int nextBits(int i) {
        return o00oo0OO.o00oOoOo(nextInt(), i);
    }

    @Override // o0OOOo0.o00oo0
    public int nextInt() {
        int i = this.x;
        int i2 = i ^ (i >>> 2);
        this.x = this.y;
        this.y = this.z;
        this.z = this.w;
        int i3 = this.v;
        this.w = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.v = i4;
        int i5 = this.addend + 362437;
        this.addend = i5;
        return i4 + i5;
    }
}
