package o0OOOo0;

import java.util.Random;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o00oOo0O extends Random {
    @NotNull
    private static final o00oOOo0 Companion = new o00oOOo0(null);
    private static final long serialVersionUID = 0;
    @NotNull
    private final o00oo0 impl;
    private boolean seedInitialized;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0O00 o0o00) {
        }
    }

    public o00oOo0O(@NotNull o00oo0 o00oo0Var) {
        o0ooO.o00oo0O0(o00oo0Var, "impl");
        this.impl = o00oo0Var;
    }

    @NotNull
    public final o00oo0 getImpl() {
        return this.impl;
    }

    @Override // java.util.Random
    public int next(int i) {
        return this.impl.nextBits(i);
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        return this.impl.nextBoolean();
    }

    @Override // java.util.Random
    public void nextBytes(@NotNull byte[] bArr) {
        o0ooO.o00oo0O0(bArr, "bytes");
        this.impl.nextBytes(bArr);
    }

    @Override // java.util.Random
    public double nextDouble() {
        return this.impl.nextDouble();
    }

    @Override // java.util.Random
    public float nextFloat() {
        return this.impl.nextFloat();
    }

    @Override // java.util.Random
    public int nextInt() {
        return this.impl.nextInt();
    }

    @Override // java.util.Random
    public int nextInt(int i) {
        return this.impl.nextInt(i);
    }

    @Override // java.util.Random
    public long nextLong() {
        return this.impl.nextLong();
    }

    @Override // java.util.Random
    public void setSeed(long j) {
        if (this.seedInitialized) {
            throw new UnsupportedOperationException("Setting seed is not supported.");
        }
        this.seedInitialized = true;
    }
}
