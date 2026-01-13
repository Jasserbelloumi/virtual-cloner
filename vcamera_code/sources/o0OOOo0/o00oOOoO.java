package o0OOOo0;

import java.util.Random;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@o0OOO00({"SMAP\nPlatformRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformRandom.kt\nkotlin/random/AbstractPlatformRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
/* loaded from: classes3.dex */
public abstract class o00oOOoO extends o00oo0 {
    @NotNull
    public abstract Random getImpl();

    @Override // o0OOOo0.o00oo0
    public int nextBits(int i) {
        return o00oo0OO.o00oOoOo(getImpl().nextInt(), i);
    }

    @Override // o0OOOo0.o00oo0
    public boolean nextBoolean() {
        return getImpl().nextBoolean();
    }

    @Override // o0OOOo0.o00oo0
    @NotNull
    public byte[] nextBytes(@NotNull byte[] bArr) {
        o0ooO.o00oo0O0(bArr, "array");
        getImpl().nextBytes(bArr);
        return bArr;
    }

    @Override // o0OOOo0.o00oo0
    public double nextDouble() {
        return getImpl().nextDouble();
    }

    @Override // o0OOOo0.o00oo0
    public float nextFloat() {
        return getImpl().nextFloat();
    }

    @Override // o0OOOo0.o00oo0
    public int nextInt() {
        return getImpl().nextInt();
    }

    @Override // o0OOOo0.o00oo0
    public int nextInt(int i) {
        return getImpl().nextInt(i);
    }

    @Override // o0OOOo0.o00oo0
    public long nextLong() {
        return getImpl().nextLong();
    }
}
