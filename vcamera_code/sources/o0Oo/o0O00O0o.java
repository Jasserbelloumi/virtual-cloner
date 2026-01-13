package o0Oo;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import o0O0OO0.o00oOo0O;
/* loaded from: classes3.dex */
public final class o0O00O0o implements o0O0O0Oo {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final Inflater f15471o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0O00000 f15472o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public int f15473o00oo0Oo;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public boolean f15474o00oo0o0;

    public o0O00O0o(o0O00000 o0o00000, Inflater inflater) {
        if (o0o00000 == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f15472o00oo0O0 = o0o00000;
        this.f15471o00oo0O = inflater;
    }

    public o0O00O0o(o0O0O0Oo o0o0o0oo, Inflater inflater) {
        this(o0O00O.o00oOooO(o0o0o0oo), inflater);
    }

    @Override // o0Oo.o0O0O0Oo, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f15474o00oo0o0) {
            return;
        }
        this.f15471o00oo0O.end();
        this.f15474o00oo0o0 = true;
        this.f15472o00oo0O0.close();
    }

    public boolean o00oOOo0() throws IOException {
        if (this.f15471o00oo0O.needsInput()) {
            o00oOOoO();
            if (this.f15471o00oo0O.getRemaining() == 0) {
                if (this.f15472o00oo0O0.o0O0O0oO()) {
                    return true;
                }
                o0O00oO0 o0o00oo0 = this.f15472o00oo0O0.o00oOo00().f15435o00oo0O0;
                int i = o0o00oo0.f15494o00oOo00;
                int i2 = o0o00oo0.f15493o00oOOoO;
                int i3 = i - i2;
                this.f15473o00oo0Oo = i3;
                this.f15471o00oo0O.setInput(o0o00oo0.f15492o00oOOo0, i2, i3);
                return false;
            }
            throw new IllegalStateException("?");
        }
        return false;
    }

    public final void o00oOOoO() throws IOException {
        int i = this.f15473o00oo0Oo;
        if (i == 0) {
            return;
        }
        int remaining = i - this.f15471o00oo0O.getRemaining();
        this.f15473o00oo0Oo -= remaining;
        this.f15472o00oo0O0.skip(remaining);
    }

    @Override // o0Oo.o0O0O0Oo
    public o0O0O0o0 o00oOooO() {
        return this.f15472o00oo0O0.o00oOooO();
    }

    @Override // o0Oo.o0O0O0Oo
    public long o0O0o000(o00ooO o00ooo, long j) throws IOException {
        o0O00oO0 o0O0oOO02;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (this.f15474o00oo0o0) {
                throw new IllegalStateException("closed");
            }
            if (i == 0) {
                return 0L;
            }
            while (true) {
                boolean o00oOOo02 = o00oOOo0();
                try {
                    o0O0oOO02 = o00ooo.o0O0oOO0(1);
                    Inflater inflater = this.f15471o00oo0O;
                    byte[] bArr = o0O0oOO02.f15492o00oOOo0;
                    int i2 = o0O0oOO02.f15494o00oOo00;
                    int inflate = inflater.inflate(bArr, i2, 8192 - i2);
                    if (inflate <= 0) {
                        if (this.f15471o00oo0O.finished() || this.f15471o00oo0O.needsDictionary()) {
                            break;
                        } else if (o00oOOo02) {
                            throw new EOFException("source exhausted prematurely");
                        }
                    } else {
                        o0O0oOO02.f15494o00oOo00 += inflate;
                        long j2 = inflate;
                        o00ooo.f15434o00oo0O += j2;
                        return j2;
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            o00oOOoO();
            if (o0O0oOO02.f15493o00oOOoO == o0O0oOO02.f15494o00oOo00) {
                o00ooo.f15435o00oo0O0 = o0O0oOO02.o00oOOoO();
                o0O0O0O.o00oOOo0(o0O0oOO02);
                return -1L;
            }
            return -1L;
        }
        throw new IllegalArgumentException(o00oOo0O.o00oOOo0("byteCount < 0: ", j));
    }
}
