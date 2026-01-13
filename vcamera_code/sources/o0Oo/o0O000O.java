package o0Oo;

import java.io.IOException;
/* loaded from: classes3.dex */
public abstract class o0O000O implements o0O0oo0o {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0O0oo0o f15456o00oo0O0;

    public o0O000O(o0O0oo0o o0o0oo0o) {
        if (o0o0oo0o == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f15456o00oo0O0 = o0o0oo0o;
    }

    @Override // o0Oo.o0O0oo0o, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f15456o00oo0O0.close();
    }

    @Override // o0Oo.o0O0oo0o, java.io.Flushable
    public void flush() throws IOException {
        this.f15456o00oo0O0.flush();
    }

    public final o0O0oo0o o00oOOo0() {
        return this.f15456o00oo0O0;
    }

    @Override // o0Oo.o0O0oo0o
    public o0O0O0o0 o00oOooO() {
        return this.f15456o00oo0O0.o00oOooO();
    }

    @Override // o0Oo.o0O0oo0o
    public void o00oo(o00ooO o00ooo, long j) throws IOException {
        this.f15456o00oo0O0.o00oo(o00ooo, j);
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f15456o00oo0O0.toString() + ")";
    }
}
