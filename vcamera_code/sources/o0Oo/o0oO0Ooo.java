package o0Oo;

import android.support.v4.media.o00oOo0O;
import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
/* loaded from: classes3.dex */
public final class o0oO0Ooo implements o0 {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o0O0oo0o f15510o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o00ooO f15511o00oo0O0 = new o00ooO();

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public boolean f15512o00oo0Oo;

    /* loaded from: classes3.dex */
    public class o00oOOo0 extends OutputStream {
        public o00oOOo0() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            o0oO0Ooo.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            o0oO0Ooo o0oo0ooo = o0oO0Ooo.this;
            if (o0oo0ooo.f15512o00oo0Oo) {
                return;
            }
            o0oo0ooo.flush();
        }

        public String toString() {
            return o0oO0Ooo.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            o0oO0Ooo o0oo0ooo = o0oO0Ooo.this;
            if (o0oo0ooo.f15512o00oo0Oo) {
                throw new IOException("closed");
            }
            o0oo0ooo.f15511o00oo0O0.writeByte((byte) i);
            o0oO0Ooo.this.o00ooOo();
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            o0oO0Ooo o0oo0ooo = o0oO0Ooo.this;
            if (o0oo0ooo.f15512o00oo0Oo) {
                throw new IOException("closed");
            }
            o0oo0ooo.f15511o00oo0O0.write(bArr, i, i2);
            o0oO0Ooo.this.o00ooOo();
        }
    }

    public o0oO0Ooo(o0O0oo0o o0o0oo0o) {
        if (o0o0oo0o == null) {
            throw new NullPointerException("sink == null");
        }
        this.f15510o00oo0O = o0o0oo0o;
    }

    @Override // o0Oo.o0O0oo0o, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f15512o00oo0Oo) {
            return;
        }
        Throwable th = null;
        try {
            o00ooO o00ooo = this.f15511o00oo0O0;
            long j = o00ooo.f15434o00oo0O;
            if (j > 0) {
                this.f15510o00oo0O.o00oo(o00ooo, j);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f15510o00oo0O.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f15512o00oo0Oo = true;
        if (th != null) {
            o0O0OO0.o00oOo0o(th);
        }
    }

    @Override // o0Oo.o0, o0Oo.o0O0oo0o, java.io.Flushable
    public void flush() throws IOException {
        if (this.f15512o00oo0Oo) {
            throw new IllegalStateException("closed");
        }
        o00ooO o00ooo = this.f15511o00oo0O0;
        long j = o00ooo.f15434o00oo0O;
        if (j > 0) {
            this.f15510o00oo0O.o00oo(o00ooo, j);
        }
        this.f15510o00oo0O.flush();
    }

    @Override // o0Oo.o0
    public o00ooO o00oOo00() {
        return this.f15511o00oo0O0;
    }

    @Override // o0Oo.o0O0oo0o
    public o0O0O0o0 o00oOooO() {
        return this.f15510o00oo0O.o00oOooO();
    }

    @Override // o0Oo.o0O0oo0o
    public void o00oo(o00ooO o00ooo, long j) throws IOException {
        if (this.f15512o00oo0Oo) {
            throw new IllegalStateException("closed");
        }
        this.f15511o00oo0O0.o00oo(o00ooo, j);
        o00ooOo();
    }

    @Override // o0Oo.o0
    public o0 o00oo0O() throws IOException {
        if (this.f15512o00oo0Oo) {
            throw new IllegalStateException("closed");
        }
        o00ooO o00ooo = this.f15511o00oo0O0;
        long j = o00ooo.f15434o00oo0O;
        if (j > 0) {
            this.f15510o00oo0O.o00oo(o00ooo, j);
        }
        return this;
    }

    @Override // o0Oo.o0
    public o0 o00oo0o0(int i) throws IOException {
        if (this.f15512o00oo0Oo) {
            throw new IllegalStateException("closed");
        }
        this.f15511o00oo0O0.o00oo0o0(i);
        return o00ooOo();
    }

    @Override // o0Oo.o0
    public o0 o00ooOo() throws IOException {
        if (this.f15512o00oo0Oo) {
            throw new IllegalStateException("closed");
        }
        long o00oOoo02 = this.f15511o00oo0O0.o00oOoo0();
        if (o00oOoo02 > 0) {
            this.f15510o00oo0O.o00oo(this.f15511o00oo0O0, o00oOoo02);
        }
        return this;
    }

    @Override // o0Oo.o0
    public o0 o00oooo0(String str) throws IOException {
        if (this.f15512o00oo0Oo) {
            throw new IllegalStateException("closed");
        }
        this.f15511o00oo0O0.o00oooo0(str);
        return o00ooOo();
    }

    @Override // o0Oo.o0
    public o0 o0O00000(String str, int i, int i2) throws IOException {
        if (this.f15512o00oo0Oo) {
            throw new IllegalStateException("closed");
        }
        this.f15511o00oo0O0.o0O00000(str, i, i2);
        return o00ooOo();
    }

    @Override // o0Oo.o0
    public o0 o0O00O(long j) throws IOException {
        if (this.f15512o00oo0Oo) {
            throw new IllegalStateException("closed");
        }
        this.f15511o00oo0O0.o0O00O(j);
        return o00ooOo();
    }

    @Override // o0Oo.o0
    public o0 o0O0O0o(int i) throws IOException {
        if (this.f15512o00oo0Oo) {
            throw new IllegalStateException("closed");
        }
        this.f15511o00oo0O0.o0O0O0o(i);
        return o00ooOo();
    }

    @Override // o0Oo.o0
    public o0 o0O0OO0O(o0O0000O o0o0000o) throws IOException {
        if (this.f15512o00oo0Oo) {
            throw new IllegalStateException("closed");
        }
        this.f15511o00oo0O0.o0O0OO0O(o0o0000o);
        return o00ooOo();
    }

    @Override // o0Oo.o0
    public o0 o0O0OOoo(int i) throws IOException {
        if (this.f15512o00oo0Oo) {
            throw new IllegalStateException("closed");
        }
        this.f15511o00oo0O0.o0O0OOoo(i);
        return o00ooOo();
    }

    @Override // o0Oo.o0
    public o0 o0O0Ooo0(long j) throws IOException {
        if (this.f15512o00oo0Oo) {
            throw new IllegalStateException("closed");
        }
        this.f15511o00oo0O0.o0O0Ooo0(j);
        return o00ooOo();
    }

    @Override // o0Oo.o0
    public o0 o0O0OooO(String str, Charset charset) throws IOException {
        if (this.f15512o00oo0Oo) {
            throw new IllegalStateException("closed");
        }
        this.f15511o00oo0O0.o0O0OooO(str, charset);
        return o00ooOo();
    }

    @Override // o0Oo.o0
    public o0 o0O0o(long j) throws IOException {
        if (this.f15512o00oo0Oo) {
            throw new IllegalStateException("closed");
        }
        this.f15511o00oo0O0.o0O0o(j);
        return o00ooOo();
    }

    @Override // o0Oo.o0
    public long o0O0o0o(o0O0O0Oo o0o0o0oo) throws IOException {
        if (o0o0o0oo == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long o0O0o0002 = o0o0o0oo.o0O0o000(this.f15511o00oo0O0, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (o0O0o0002 == -1) {
                return j;
            }
            j += o0O0o0002;
            o00ooOo();
        }
    }

    @Override // o0Oo.o0
    public o0 o0O0o0oo(o0O0O0Oo o0o0o0oo, long j) throws IOException {
        while (j > 0) {
            long o0O0o0002 = o0o0o0oo.o0O0o000(this.f15511o00oo0O0, j);
            if (o0O0o0002 == -1) {
                throw new EOFException();
            }
            j -= o0O0o0002;
            o00ooOo();
        }
        return this;
    }

    @Override // o0Oo.o0
    public OutputStream o0O0oo00() {
        return new o00oOOo0();
    }

    @Override // o0Oo.o0
    public o0 o0OoO00O(String str, int i, int i2, Charset charset) throws IOException {
        if (this.f15512o00oo0Oo) {
            throw new IllegalStateException("closed");
        }
        this.f15511o00oo0O0.o0OoO00O(str, i, i2, charset);
        return o00ooOo();
    }

    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("buffer(");
        o00oOOo02.append(this.f15510o00oo0O);
        o00oOOo02.append(")");
        return o00oOOo02.toString();
    }

    @Override // o0Oo.o0
    public o0 write(byte[] bArr) throws IOException {
        if (this.f15512o00oo0Oo) {
            throw new IllegalStateException("closed");
        }
        this.f15511o00oo0O0.write(bArr);
        return o00ooOo();
    }

    @Override // o0Oo.o0
    public o0 write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f15512o00oo0Oo) {
            throw new IllegalStateException("closed");
        }
        this.f15511o00oo0O0.write(bArr, i, i2);
        return o00ooOo();
    }

    @Override // o0Oo.o0
    public o0 writeByte(int i) throws IOException {
        if (this.f15512o00oo0Oo) {
            throw new IllegalStateException("closed");
        }
        this.f15511o00oo0O0.writeByte(i);
        return o00ooOo();
    }

    @Override // o0Oo.o0
    public o0 writeInt(int i) throws IOException {
        if (this.f15512o00oo0Oo) {
            throw new IllegalStateException("closed");
        }
        this.f15511o00oo0O0.writeInt(i);
        return o00ooOo();
    }

    @Override // o0Oo.o0
    public o0 writeLong(long j) throws IOException {
        if (this.f15512o00oo0Oo) {
            throw new IllegalStateException("closed");
        }
        this.f15511o00oo0O0.writeLong(j);
        return o00ooOo();
    }

    @Override // o0Oo.o0
    public o0 writeShort(int i) throws IOException {
        if (this.f15512o00oo0Oo) {
            throw new IllegalStateException("closed");
        }
        this.f15511o00oo0O0.writeShort(i);
        return o00ooOo();
    }
}
