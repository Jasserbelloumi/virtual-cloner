package o0Oo;

import java.io.IOException;
/* loaded from: classes3.dex */
public abstract class o0OoOoOo implements o0O0O0Oo {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0O0O0Oo f15509o00oo0O0;

    public o0OoOoOo(o0O0O0Oo o0o0o0oo) {
        if (o0o0o0oo == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f15509o00oo0O0 = o0o0o0oo;
    }

    @Override // o0Oo.o0O0O0Oo, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f15509o00oo0O0.close();
    }

    public final o0O0O0Oo o00oOOo0() {
        return this.f15509o00oo0O0;
    }

    @Override // o0Oo.o0O0O0Oo
    public o0O0O0o0 o00oOooO() {
        return this.f15509o00oo0O0.o00oOooO();
    }

    @Override // o0Oo.o0O0O0Oo
    public long o0O0o000(o00ooO o00ooo, long j) throws IOException {
        return this.f15509o00oo0O0.o0O0o000(o00ooo, j);
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f15509o00oo0O0.toString() + ")";
    }
}
