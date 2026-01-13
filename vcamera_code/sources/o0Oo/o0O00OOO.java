package o0Oo;

import java.io.IOException;
import o0O0OO0.o00oOo0O;
/* loaded from: classes3.dex */
public final class o0O00OOO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final long f15476o00oOOo0;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public boolean f15478o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public boolean f15481o00oOooO;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o00ooO f15477o00oOOoO = new o00ooO();

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final o0O0oo0o f15479o00oOo0O = new o00oOOo0();

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public final o0O0O0Oo f15480o00oOo0o = new o00oOOoO();

    /* loaded from: classes3.dex */
    public final class o00oOOo0 implements o0O0oo0o {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final o0O0O0o0 f15483o00oo0O0 = new o0O0O0o0();

        public o00oOOo0() {
        }

        @Override // o0Oo.o0O0oo0o, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (o0O00OOO.this.f15477o00oOOoO) {
                o0O00OOO o0o00ooo = o0O00OOO.this;
                if (o0o00ooo.f15478o00oOo00) {
                    return;
                }
                if (o0o00ooo.f15481o00oOooO && o0o00ooo.f15477o00oOOoO.f15434o00oo0O > 0) {
                    throw new IOException("source is closed");
                }
                o0o00ooo.f15478o00oOo00 = true;
                o0o00ooo.f15477o00oOOoO.notifyAll();
            }
        }

        @Override // o0Oo.o0O0oo0o, java.io.Flushable
        public void flush() throws IOException {
            synchronized (o0O00OOO.this.f15477o00oOOoO) {
                o0O00OOO o0o00ooo = o0O00OOO.this;
                if (o0o00ooo.f15478o00oOo00) {
                    throw new IllegalStateException("closed");
                }
                if (o0o00ooo.f15481o00oOooO && o0o00ooo.f15477o00oOOoO.f15434o00oo0O > 0) {
                    throw new IOException("source is closed");
                }
            }
        }

        @Override // o0Oo.o0O0oo0o
        public o0O0O0o0 o00oOooO() {
            return this.f15483o00oo0O0;
        }

        @Override // o0Oo.o0O0oo0o
        public void o00oo(o00ooO o00ooo, long j) throws IOException {
            synchronized (o0O00OOO.this.f15477o00oOOoO) {
                if (o0O00OOO.this.f15478o00oOo00) {
                    throw new IllegalStateException("closed");
                }
                while (j > 0) {
                    o0O00OOO o0o00ooo = o0O00OOO.this;
                    if (o0o00ooo.f15481o00oOooO) {
                        throw new IOException("source is closed");
                    }
                    long j2 = o0o00ooo.f15476o00oOOo0;
                    o00ooO o00ooo2 = o0o00ooo.f15477o00oOOoO;
                    long j3 = j2 - o00ooo2.f15434o00oo0O;
                    if (j3 == 0) {
                        this.f15483o00oo0O0.o00oOoOo(o00ooo2);
                    } else {
                        long min = Math.min(j3, j);
                        o0O00OOO.this.f15477o00oOOoO.o00oo(o00ooo, min);
                        j -= min;
                        o0O00OOO.this.f15477o00oOOoO.notifyAll();
                    }
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class o00oOOoO implements o0O0O0Oo {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final o0O0O0o0 f15485o00oo0O0 = new o0O0O0o0();

        public o00oOOoO() {
        }

        @Override // o0Oo.o0O0O0Oo, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (o0O00OOO.this.f15477o00oOOoO) {
                o0O00OOO o0o00ooo = o0O00OOO.this;
                o0o00ooo.f15481o00oOooO = true;
                o0o00ooo.f15477o00oOOoO.notifyAll();
            }
        }

        @Override // o0Oo.o0O0O0Oo
        public o0O0O0o0 o00oOooO() {
            return this.f15485o00oo0O0;
        }

        @Override // o0Oo.o0O0O0Oo
        public long o0O0o000(o00ooO o00ooo, long j) throws IOException {
            synchronized (o0O00OOO.this.f15477o00oOOoO) {
                if (o0O00OOO.this.f15481o00oOooO) {
                    throw new IllegalStateException("closed");
                }
                while (true) {
                    o0O00OOO o0o00ooo = o0O00OOO.this;
                    o00ooO o00ooo2 = o0o00ooo.f15477o00oOOoO;
                    if (o00ooo2.f15434o00oo0O != 0) {
                        long o0O0o0002 = o00ooo2.o0O0o000(o00ooo, j);
                        o0O00OOO.this.f15477o00oOOoO.notifyAll();
                        return o0O0o0002;
                    } else if (o0o00ooo.f15478o00oOo00) {
                        return -1L;
                    } else {
                        this.f15485o00oo0O0.o00oOoOo(o00ooo2);
                    }
                }
            }
        }
    }

    public o0O00OOO(long j) {
        if (j < 1) {
            throw new IllegalArgumentException(o00oOo0O.o00oOOo0("maxBufferSize < 1: ", j));
        }
        this.f15476o00oOOo0 = j;
    }

    public o0O0oo0o o00oOOo0() {
        return this.f15479o00oOo0O;
    }

    public o0O0O0Oo o00oOOoO() {
        return this.f15480o00oOo0o;
    }
}
