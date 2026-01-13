package o0OOOo0O;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import o0OOOOO0.o0ooO;
import o0OOOo0.o00oOOoO;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public final class o0O00O0 extends o00oOOoO {
    @Override // o0OOOo0.o00oOOoO
    @NotNull
    public Random getImpl() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        o0ooO.o00oo0OO(current, "current()");
        return current;
    }

    @Override // o0OOOo0.o00oo0
    public double nextDouble(double d) {
        return ThreadLocalRandom.current().nextDouble(d);
    }

    @Override // o0OOOo0.o00oo0
    public int nextInt(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // o0OOOo0.o00oo0
    public long nextLong(long j) {
        return ThreadLocalRandom.current().nextLong(j);
    }

    @Override // o0OOOo0.o00oo0
    public long nextLong(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }
}
