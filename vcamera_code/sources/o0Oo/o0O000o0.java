package o0Oo;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import o0O0OO0.o00oOo0O;
/* loaded from: classes3.dex */
public final class o0O000o0 implements o0O0oo0o {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final Deflater f15458o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0 f15459o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final o0O000 f15460o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final CRC32 f15461o00oo0o = new CRC32();

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public boolean f15462o00oo0o0;

    public o0O000o0(o0O0oo0o o0o0oo0o) {
        if (o0o0oo0o == null) {
            throw new IllegalArgumentException("sink == null");
        }
        Deflater deflater = new Deflater(-1, true);
        this.f15458o00oo0O = deflater;
        o0 o00oOo002 = o0O00O.o00oOo00(o0o0oo0o);
        this.f15459o00oo0O0 = o00oOo002;
        this.f15460o00oo0Oo = new o0O000(o00oOo002, deflater);
        o00oOo0o();
    }

    @Override // o0Oo.o0O0oo0o, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f15462o00oo0o0) {
            return;
        }
        Throwable th = null;
        try {
            this.f15460o00oo0Oo.o00oOOoO();
            o00oOo0O();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f15458o00oo0O.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.f15459o00oo0O0.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f15462o00oo0o0 = true;
        if (th != null) {
            o0O0OO0.o00oOo0o(th);
        }
    }

    @Override // o0Oo.o0O0oo0o, java.io.Flushable
    public void flush() throws IOException {
        this.f15460o00oo0Oo.flush();
    }

    public Deflater o00oOOo0() {
        return this.f15458o00oo0O;
    }

    public final void o00oOOoO(o00ooO o00ooo, long j) {
        o0O00oO0 o0o00oo0 = o00ooo.f15435o00oo0O0;
        while (j > 0) {
            int min = (int) Math.min(j, o0o00oo0.f15494o00oOo00 - o0o00oo0.f15493o00oOOoO);
            this.f15461o00oo0o.update(o0o00oo0.f15492o00oOOo0, o0o00oo0.f15493o00oOOoO, min);
            j -= min;
            o0o00oo0 = o0o00oo0.f15496o00oOo0o;
        }
    }

    public final void o00oOo0O() throws IOException {
        this.f15459o00oo0O0.o0O0O0o((int) this.f15461o00oo0o.getValue());
        this.f15459o00oo0O0.o0O0O0o((int) this.f15458o00oo0O.getBytesRead());
    }

    public final void o00oOo0o() {
        o00ooO o00oOo002 = this.f15459o00oo0O0.o00oOo00();
        o00oOo002.writeShort(8075);
        o00oOo002.writeByte(8);
        o00oOo002.writeByte(0);
        o00oOo002.writeInt(0);
        o00oOo002.writeByte(0);
        o00oOo002.writeByte(0);
    }

    @Override // o0Oo.o0O0oo0o
    public o0O0O0o0 o00oOooO() {
        return this.f15459o00oo0O0.o00oOooO();
    }

    @Override // o0Oo.o0O0oo0o
    public void o00oo(o00ooO o00ooo, long j) throws IOException {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException(o00oOo0O.o00oOOo0("byteCount < 0: ", j));
        }
        if (i == 0) {
            return;
        }
        o00oOOoO(o00ooo, j);
        this.f15460o00oo0Oo.o00oo(o00ooo, j);
    }
}
